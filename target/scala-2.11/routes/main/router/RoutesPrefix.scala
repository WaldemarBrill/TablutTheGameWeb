
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Repository/TablutTheGameWeb/conf/routes
// @DATE:Tue Jan 16 02:44:30 CET 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
