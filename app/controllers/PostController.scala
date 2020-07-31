package controllers

import DAO._
import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class PostController @Inject() (cc: ControllerComponents, postDAO: PostDAO) extends AbstractController(cc) {

  def listAllPost() = Action { implicit request: Request[AnyContent] =>
    postDAO.getAll.map(posts => Ok(views.html.viewAllPost(posts))).get
  }

}
