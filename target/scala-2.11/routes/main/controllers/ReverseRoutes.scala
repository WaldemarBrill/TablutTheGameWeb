
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Repository/TablutTheGameWeb/conf/routes
// @DATE:Tue Jan 16 02:44:30 CET 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseTablutController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def help(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "help")
    }
  
    // @LINE:7
    def game(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tablut")
    }
  
    // @LINE:11
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "websocket")
    }
  
    // @LINE:8
    def command(command:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tablut/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("command", command)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def controls(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "controls")
    }
  
  }


}
