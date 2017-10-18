package controllers;

import play.mvc.*;

import views.html.*;
import de.htwg.se.tablut.Tablut;
import de.htwg.se.tablut.aview.TextUI;
import de.htwg.se.tablut.bcontroller.IController;

public class TablutController extends Controller {
	static Tablut tablut = Tablut.getInstance();
	
	public Result game() {
    	tablut.getInstance().getTui().funktion("9");
        return ok(game.render(tablut.getInstance().getTui().buildString(), tablut.getController()));
    }
	
	public Result command(String line) {
    	tablut.getInstance().getTui().funktion(line);
    	return ok(game.render(tablut.getInstance().getTui().buildString(), tablut.getController()));
    }
	
	public Result help() {
        return ok(help.render("Help menu"));
    }
	
	public Result controls() {
        return ok(controls.render("Controls menu"));
    }
}