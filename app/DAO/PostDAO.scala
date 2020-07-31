package DAO

import models.Post

import scala.util.Try

class PostDAO {
  def getAll: Try[List[Post]] = Try {
    Post.findAll()
  }

}
