
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Repository/TablutTheGameWeb/conf/routes
// @DATE:Tue Jan 16 02:44:30 CET 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  TablutController_1: controllers.TablutController,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    TablutController_1: controllers.TablutController,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, TablutController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, TablutController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.TablutController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tablut""", """controllers.TablutController.game"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tablut/""" + "$" + """command<[^/]+>""", """controllers.TablutController.command(command:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """help""", """controllers.TablutController.help"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """controls""", """controllers.TablutController.controls"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """websocket""", """controllers.TablutController.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_TablutController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_TablutController_index0_invoker = createInvoker(
    TablutController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablutController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_TablutController_game1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tablut")))
  )
  private[this] lazy val controllers_TablutController_game1_invoker = createInvoker(
    TablutController_1.game,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablutController",
      "game",
      Nil,
      "GET",
      this.prefix + """tablut""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_TablutController_command2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tablut/"), DynamicPart("command", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TablutController_command2_invoker = createInvoker(
    TablutController_1.command(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablutController",
      "command",
      Seq(classOf[String]),
      "GET",
      this.prefix + """tablut/""" + "$" + """command<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_TablutController_help3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("help")))
  )
  private[this] lazy val controllers_TablutController_help3_invoker = createInvoker(
    TablutController_1.help,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablutController",
      "help",
      Nil,
      "GET",
      this.prefix + """help""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_TablutController_controls4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("controls")))
  )
  private[this] lazy val controllers_TablutController_controls4_invoker = createInvoker(
    TablutController_1.controls,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablutController",
      "controls",
      Nil,
      "GET",
      this.prefix + """controls""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_TablutController_socket5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("websocket")))
  )
  private[this] lazy val controllers_TablutController_socket5_invoker = createInvoker(
    TablutController_1.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablutController",
      "socket",
      Nil,
      "GET",
      this.prefix + """websocket""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_TablutController_index0_route(params@_) =>
      call { 
        controllers_TablutController_index0_invoker.call(TablutController_1.index)
      }
  
    // @LINE:7
    case controllers_TablutController_game1_route(params@_) =>
      call { 
        controllers_TablutController_game1_invoker.call(TablutController_1.game)
      }
  
    // @LINE:8
    case controllers_TablutController_command2_route(params@_) =>
      call(params.fromPath[String]("command", None)) { (command) =>
        controllers_TablutController_command2_invoker.call(TablutController_1.command(command))
      }
  
    // @LINE:9
    case controllers_TablutController_help3_route(params@_) =>
      call { 
        controllers_TablutController_help3_invoker.call(TablutController_1.help)
      }
  
    // @LINE:10
    case controllers_TablutController_controls4_route(params@_) =>
      call { 
        controllers_TablutController_controls4_invoker.call(TablutController_1.controls)
      }
  
    // @LINE:11
    case controllers_TablutController_socket5_route(params@_) =>
      call { 
        controllers_TablutController_socket5_invoker.call(TablutController_1.socket)
      }
  
    // @LINE:14
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
