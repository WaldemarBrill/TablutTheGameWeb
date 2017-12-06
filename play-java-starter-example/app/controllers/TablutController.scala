package controllers

import javax.inject._

import play.api.mvc._
import de.htwg.se.tablut.Tablut
import de.htwg.se.tablut.bcontroller.IController

import play.api.libs.streams.ActorFlow
import akka.actor.ActorSystem
import akka.stream.Materializer
import akka.actor._


@Singleton
class TablutController @Inject()(cc: ControllerComponents) (implicit system: ActorSystem, mat: Materializer) extends AbstractController(cc){
	val gc = Tablut.getInstance().getController()
	
	
	
	def index = Action {
		Ok(views.html.index("Index"))
	}
	
	def game = Action {
		Ok(views.html.game(gc.buildString(), gc))
	}
	
	def command(command:String) = Action {
		gc.funktion(command)
		Ok(views.html.game(gc.buildString(), gc))
	}
	
	def help = Action {
		Ok(views.html.help("Help menu"))
	}
	
	def controls = Action {
		Ok(views.html.controls("Control menu"))
	}
	
	
	def socket = WebSocket.accept[String, String] { request =>
		ActorFlow.actorRef { out =>
			println("Connect received")
			TablutWebSocketActorFactory.create(out)
		}
	}

	object TablutWebSocketActorFactory {
		def create(out: ActorRef) = {
			Props(new TablutWebSocketActor(out))
		}
	}

	class TablutWebSocketActor(out: ActorRef) extends Actor {
		def receive = {
			case msg: String =>
				println("Sent Message")
		}
		
	}
}