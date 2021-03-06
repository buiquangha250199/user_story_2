package db

import play.api.db.Databases
import play.api.db.evolutions._
import scalikejdbc.ConnectionPool

trait DbTest {
  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost:3306/MyBlogTest"
  val username = "root"
  val password = "root"
  val database = Databases(
    driver = driver,
    url = url,
    name = "default",
    config = Map(
      "username" -> username,
      "password" -> password))

  def initTestDB(): Unit = {
    ConnectionPool.singleton(url, username, password)
    Evolutions.applyEvolutions(database)
  }

}

