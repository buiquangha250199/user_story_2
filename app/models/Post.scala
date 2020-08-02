package models

import scalikejdbc._
import skinny.orm._

case class Post(id: Int, title: String, description: String, userEmail: String)

object Post extends SkinnyCRUDMapper[Post] {

  override def extract(rs: WrappedResultSet, post: ResultName[Post]): Post = new Post(
    id = rs.get(post.id),
    title = rs.get(post.title),
    description = rs.get(post.description),
    userEmail = rs.get(post.userEmail)
  )
  override lazy val defaultAlias: Alias[Post] = createAlias("p")

}
