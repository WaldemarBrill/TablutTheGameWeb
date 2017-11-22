function test() {
	alert("test");
}

function createGamefield() {
	let xStart = "nichts";
	let yStart = "nichts";
	let index = 0;
	for (let x = 0; x < 9; x++) {
		let Zeile = document.createElement("tr");
		Zeile.id = "Zeile" + x;
		document.getElementById("Gamefield").appendChild(Zeile);
		for (let y = 0; y < 9; y++) {
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
			document.getElementById("Zeile"+x).appendChild(Zelle);
		}
	}
}

document.addEventListener('DOMContentLoaded', createGamefield);
