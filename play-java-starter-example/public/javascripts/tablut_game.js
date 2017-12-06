function test() {
	alert("test");
}

function createGamefield() {
	let xStart = "nichts";
	let yStart = "nichts";
	let index = 0;
	for (let y = 0; y < 9; y++) {
		let Zeile = document.createElement("tr");
		Zeile.id = "Zeile" + y;
		document.getElementById("Gamefield").appendChild(Zeile);
		for (let x = 0; x < 9; x++) {
			let Zelle = document.createElement("button");
			Zelle.id = x+","+y;
			Zelle.setAttribute("x", x);
			Zelle.setAttribute("y", y);
			if ((y%2==0 || !(x%2==0)) && ((x%2==0 || !(y%2==0)))) {
				Zelle.setAttribute("class", "fieldbutton white");
			} else {
				Zelle.setAttribute("class", "fieldbutton black");
			}
			Zelle.addEventListener("click", function(){
				if (xStart == "nichts" && yStart == "nichts") {
					xStart = this.getAttribute("x");
					yStart = this.getAttribute("y");
				} else {
					alert(xStart + "," + yStart + "to" + this.getAttribute("x") + "," + this.getAttribute("y"))
					xStart = "nichts";
					yStart = "nichts";
				}
			}, false);
			let inhalt = document.createTextNode(index);
			index = index + 1;
			Zelle.appendChild(inhalt);
			document.getElementById("Zeile"+y).appendChild(Zelle);
		}
	}
}

function connectWebSocket() {
	var websocket = new WebSocket("ws://localhost:9000/websocket");
    websocket.setTimeout

    websocket.onopen = function(event) {
        console.log("Connected to Websocket");
    }

    websocket.onclose = function () {
        console.log('Connection with Websocket Closed!');
    };

    websocket.onerror = function (error) {
        console.log('Error in Websocket Occured: ' + error);
    };

    websocket.onmessage = function (e) {
        console.log("Connection send a Message: " + e)

    };
}

$( document ).ready(function() {
	createGamefield();
	connectWebSocket();
});


