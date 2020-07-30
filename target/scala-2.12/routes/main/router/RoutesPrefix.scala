// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ha_bq/Desktop/tranning-ha_bq-bbs/conf/routes
// @DATE:Thu Jul 30 11:32:41 ICT 2020


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
