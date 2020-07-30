package controllers
import javax.inject.Inject
import play.api.db._
import play.api.mvc._

class test @Inject()(db: Database, val controllerComponents: ControllerComponents)
  extends BaseController {

  def index = Action {
    var outString = "Admin is "
    val conn      = db.getConnection()

    try {
      val stmt = conn.createStatement
      val rs   = stmt.executeQuery("SELECT * from users.User ")

      while (rs.next()) {
        outString += rs.getString("fullname")
      }
    } finally {
      conn.close()
    }
    Ok(outString)
  }



}