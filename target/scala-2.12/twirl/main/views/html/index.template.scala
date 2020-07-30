
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(string: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Welcome to Play")/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""

    """),format.raw/*17.8*/("""
    """),_display_(/*18.6*/welcome(string)),format.raw/*18.21*/("""

""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(string:String): play.twirl.api.HtmlFormat.Appendable = apply(string)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (string) => apply(string)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-30T17:13:02.205
                  SOURCE: /Users/ha_bq/Desktop/tranning-ha_bq-bbs/app/views/index.scala.html
                  HASH: dd23fb090fadf7a865e1b1e6b82acd19b7277d8d
                  MATRIX: 818->95|928->112|956->307|984->309|1016->332|1056->334|1089->463|1121->469|1157->484|1190->487
                  LINES: 24->5|29->6|30->11|31->12|31->12|31->12|33->17|34->18|34->18|36->20
                  -- GENERATED --
              */
          