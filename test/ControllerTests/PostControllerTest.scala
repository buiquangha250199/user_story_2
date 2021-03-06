package controllers

import play.api.test._
import play.api.test.Helpers._
import models.Post
import org.specs2.mock.Mockito
import org.specs2.mutable._
import DAO.PostDAO
import db.DbTest

import scala.util.Try

class PostControllerTest extends Specification with Mockito with DbTest {

  val post = mock[PostDAO]
  val controller = new PostController(stubControllerComponents(), post)

  "PostController listPosts GET" should {

    "render the allPosts page from a new instance of controller" in {

      post.getAll returns Try(List(Post(10, "abc", "def", "ha_bq123@gmail.com")))

      val listPosts = controller.listAllPost().apply(FakeRequest(GET, "/getAllPost"))
      status(listPosts) mustEqual  OK
      contentType(listPosts) mustEqual  Some("text/html")
      contentAsString(listPosts) must contain("ha_bq123@gmail.com")
    }

  }
}
