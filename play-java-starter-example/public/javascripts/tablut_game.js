var websocket;
var status_vue;
var spiel_vue;

function createGamefield() {
	let xStart = "nichts";
	let yStart = "nichts";
	let size = document.getElementById("Gamefield").getAttribute("size");
	for (let y = 0; y < size; y++) {
		let Zeile = document.createElement("tr");
		Zeile.id = "Zeile" + y;
		document.getElementById("Gamefield").appendChild(Zeile);
		for (let x = 0; x < size; x++) {
			let Zelle = document.createElement("button");
			Zelle.id = x+","+y;
			Zelle.setAttribute("x", x);
			Zelle.setAttribute("y", y);
			Zelle.setAttribute("class", "fieldbutton");
			Zelle.addEventListener("click", function(){
				if (xStart == "nichts" && yStart == "nichts") {
					xStart = this.getAttribute("x");
					yStart = this.getAttribute("y");
					status_vue.status_list.push(xStart + "-" + yStart + " nach ");
				} else {
					status_vue.status_list.push(status_vue.status_list.pop() + this.getAttribute("x") + "-" + this.getAttribute("y"));
					let command = xStart + "-" + yStart + "-" + this.getAttribute("x") + "-" + this.getAttribute("y");
					
					
					if(websocket.readyState === websocket.CLOSED) {
						connectWebSocket(command);
					} else {
						websocket.send(command);
						websocket.send("player");
					}
					xStart = "nichts";
					yStart = "nichts";
				}
			}, false);
			document.getElementById("Zeile"+y).appendChild(Zelle);
		}
	}
}

function fillGrid(s){
	let fieldArray = s.split(" ");
	let x = 0;
	let y = 0;
	let size = document.getElementById("Gamefield").getAttribute("size");
	
	for (let i = 0; i < size; i++) {
		for (let j = 0; j < size; j++) {
			let index = j + "," + i;
			let target = document.getElementById(index);
			target.setAttribute("figure", "");
		}
	}
	
	fieldArray.forEach(function(entry){
		
		switch(entry) {
		case "X":
		case "A":
		case "D":
		case "K":
			let inhalt = document.createTextNode(entry);
			let index = x + "," + y;
			//document.getElementById(index).appendChild(inhalt);
			let target = document.getElementById(index);
			target.setAttribute("figure", entry);
		case "_":
			x = x + 1;
			if(x >= size){
				x = 0;
				y = y + 1;
			}
			break;
		Default:
			break;
		}
	});
}

function connectWebSocket(command) {
	websocket = new WebSocket("ws://localhost:9000/websocket")
	
    websocket.onopen = function(event) {
        console.log("Connected to Websocket");
        websocket.send(command);
        websocket.send("player");
    };

    websocket.onclose = function () {
        console.log('Connection with Websocket Closed!');
    };

    websocket.onerror = function (error) {
        console.log('Error in Websocket Occured: ' + error);
    };

    websocket.onmessage = function (e) {
        console.log("Connection send a Message: " + e.data)
        if (typeof e.data === "string") {
        	if (e.data === "player1") {
        		spiel_vue.toggle_player_one();
        	} else if (e.data === "player2") {
        		spiel_vue.toggle_player_two();
        	} else {
        		fillGrid(e.data);
        	}
        }
    };
}



$( document ).ready(function() {
	createGamefield();
	connectWebSocket("update");
	
	status_vue = new Vue ({
		el: "#status_elemente",
		
		data: {
			status_list: [],
		},
	});
	
	spiel_vue = new Vue ({
		el: "#player_turn",
		
		data: {
			player_turn: true
		},
		
		methods: {
			toggle_player_one() {
				this.player_turn = true;
			},
			toggle_player_two() {
				this.player_turn = false;
			}
		},
		
		computed: {
			get_player_turn() {
				if (this.player_turn) {
					return "Spieler 1 ist am Zug";
				} else {
					return "Spieler 2 ist am Zug";
				}
			}
		},
		
	});
});


