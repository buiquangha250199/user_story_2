package DAO

import forms.PostForm
import models.Post

import scala.util.Try

class PostDAO {
  def getAll: Try[List[Post]] = Try {
    Post.findAll()
  }

  def createPost(postForm: PostForm) = {
    val column = Post.column
    Post.createWithNamedValues(
      column.title -> postForm.title,
      column.description -> postForm.description,
      column.userEmail -> postForm.email
    )
  }
}
