package models

import scalikejdbc._
import skinny.orm._

case class User(id: Int, email: String, password: String)

object User extends SkinnyCRUDMapper[User] {
  override def extract(rs: WrappedResultSet, n: ResultName[User]): User = new User(
    id = rs.get(n.id),
    email = rs.get(n.email),
    password = rs.get(n.password)
  )

  override lazy val defaultAlias: Alias[User] = createAlias("u")
}
