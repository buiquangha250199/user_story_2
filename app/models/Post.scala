package models

import scalikejdbc._
import skinny.orm._
import skinny.orm.feature.associations.Association

case class Post(id: Int, title: String, description: String, user_id: Int)

object Post extends SkinnyCRUDMapper[Post] {

  override def extract(rs: WrappedResultSet, n: ResultName[Post]): Post = new Post(
    id = rs.get(n.id),
    title = rs.get(n.title),
    description = rs.get(n.description),
    user_id = rs.get(n.user_id)
  )

  override lazy val defaultAlias: Alias[Post] = createAlias("p")
}
