var el = document.getElementById("gamefieldButton");
if(el) {
	el.addEventListener("click", test, false);
}

function myFunction() {
    document.getElementById("demo").innerHTML = "myFunction ist aufgerufen";
}

function test() {
	alert("test");
}

function createGamefield() {
	var xStart = "nichts";
	var yStart = "nichts";
	for (var x = 0; x < 9; x++) {
		var Zeile = document.createElement("tr");
		Zeile.id = "Zeile" + x;
		document.getElementById("Gamefield").appendChild(Zeile);
		for (var y = 0; y < 9; y++) {
			var Zelle = document.createElement("button");
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
					xStart = "nichts";
					yStart = "nichts";
				}
			}, false);
			var inhalt = document.createTextNode("...");
			Zelle.appendChild(inhalt);
			document.getElementById("Zeile"+x).appendChild(Zelle);
		}
	}
}

function getXY() {
	alert(xStart);
	alert(yStart);
}
