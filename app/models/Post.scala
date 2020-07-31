package models

import scalikejdbc._
import skinny.orm._
import skinny.orm.feature.associations.Association

case class Post(id: Int, title: String, description: String, userId: Int)

object Post extends SkinnyCRUDMapper[Post] {

  override def extract(rs: WrappedResultSet, post: ResultName[Post]): Post = new Post(
    id = rs.get(post.id),
    title = rs.get(post.title),
    description = rs.get(post.description),
    userId = rs.get(post.userId)
  )

  override lazy val defaultAlias: Alias[Post] = createAlias("p")
}
