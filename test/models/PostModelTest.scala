package models

import DAO.PostDAO
import org.specs2.mutable.Specification

class PostModelTest extends Specification with db.DbTest {
  val post = new PostDAO
  initTestDB()

  // test pass: list 3 posts
  "PostDao" should {
    "getAll() return a Success(List(Post))" in {
      val postList = post.getAll.get
      postList.size === 3
    }

    "Have a user_email field" in {
      val postList = post.getAll.get
      postList.head.toString must contain("haqh@gmail.com")
    }
  }

}
