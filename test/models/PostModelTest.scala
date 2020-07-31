package models

import DAO.PostDAO
import org.specs2.mutable.Specification

class PostSpec extends Specification with db.DbTest {
  val post = new PostDAO
  initTestDB()

  // test fail: list 6 posts
  "PostDao" should {
    "getAll() return a Success(List(Post))" in {
      val postList = post.getAll.get
      postList.size < 4
    }
  }

  // test pass: list 6 posts
  "PostDao" should {
    "getAll() return a Success(List(Post))" in {
      val postList = post.getAll.get
      postList.size === 6
    }
  }

}
