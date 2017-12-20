function test() {
	alert("test");
}

function createGamefield() {
	let xStart = "nichts";
	let yStart = "nichts";
	for (let y = 0; y < 9; y++) {
		let Zeile = document.createElement("tr");
		Zeile.id = "Zeile" + y;
		document.getElementById("Gamefield").appendChild(Zeile);
		for (let x = 0; x < 9; x++) {
			let Zelle = document.createElement("button");
			Zelle.id = x+","+y;
			Zelle.setAttribute("x", x);
			Zelle.setAttribute("y", y);
			Zelle.setAttribute("class", "fieldbutton");
			Zelle.addEventListener("click", function(){
				if (xStart == "nichts" && yStart == "nichts") {
					xStart = this.getAttribute("x");
					yStart = this.getAttribute("y");
				} else {
					let command = xStart + "-" + yStart + "-" + this.getAttribute("x") + "-" + this.getAttribute("y");
					window.location.href = "/tablut/" + command;
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
			target.setAttribute("class", target.getAttribute("class") + " " + entry);
		case "_":
			x = x + 1;
			if(x === 9){
				x = 0;
				y = y + 1;
			}
			break;
		Default:
			break;
		}
	});
}

function connectWebSocket() {
	var websocket = new WebSocket("ws://localhost:9000/websocket");
    websocket.setTimeout

    websocket.onopen = function(event) {
        console.log("Connected to Websocket");
        websocket.send(JSON.stringify({
        	update: "do it"
        }));
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
        	fillGrid(e.data);
        }
    };
}

$( document ).ready(function() {
	createGamefield();
	connectWebSocket();
});


