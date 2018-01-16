
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Repository/TablutTheGameWeb/conf/routes
// @DATE:Tue Jan 16 02:44:30 CET 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseTablutController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def help: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablutController.help",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "help"})
        }
      """
    )
  
    // @LINE:7
    def game: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablutController.game",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tablut"})
        }
      """
    )
  
    // @LINE:11
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablutController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "websocket"})
        }
      """
    )
  
    // @LINE:8
    def command: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablutController.command",
      """
        function(command0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tablut/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("command", command0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablutController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def controls: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablutController.controls",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "controls"})
        }
      """
    )
  
  }


}
