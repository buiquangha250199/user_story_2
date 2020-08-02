package controllers

import DAO._
import javax.inject._
import play.api.mvc._
import forms.PostForm

import scala.util.Try
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class PostController @Inject() (cc: ControllerComponents, postDAO: PostDAO) extends AbstractController(cc) {

  def listAllPost() = Action { implicit request: Request[AnyContent] =>
    postDAO.getAll.map(posts => Ok(views.html.viewAllPost(posts))).recover({ case e: Exception => NotFound }).get
  }

  def create() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.create())
  }

  def createPost(): Action[AnyContent] = Action { implicit request =>
    PostForm.createPostForm.bindFromRequest().fold(
      error => {
        BadRequest("Create error!")
      },
      post =>
        Try {
          postDAO.createPost(post)
          Redirect("/")
        }.recover({ case e: Exception => BadRequest(("Create new post failed")) }).get
    )
  }

}
