package forms

import play.api.data.Form
import play.api.data.Forms._

case class PostForm(title: String, description: String, email: String)

object PostForm {

  val createPostForm = Form(
    mapping(
      "title" -> nonEmptyText,
      "description" -> nonEmptyText,
      "email" -> email)(PostForm.apply)(PostForm.unapply))

}
