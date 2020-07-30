
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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

    """),format.raw/*5.5*/("""<section id="top">
        <div class="wrapper">
            <h1><a href="https://playframework.com/documentation/"""),_display_(/*7.67*/version),format.raw/*7.74*/("""/Home">"""),_display_(/*7.82*/message),format.raw/*7.89*/("""</a></h1>
        </div>
    </section>

    <div>
        <a href="/getAllPost">View all post</a>



    </div>
""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-30T17:25:35.729
                  SOURCE: /Users/ha_bq/Desktop/tranning-ha_bq-bbs/app/views/welcome.scala.html
                  HASH: 2afe76570652b7f283db1914cd3d6cbc01f77ed5
                  MATRIX: 731->1|842->19|869->21|916->60|966->73|998->79|1139->194|1166->201|1200->209|1227->216|1371->330
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|31->7|31->7|31->7|31->7|41->17
                  -- GENERATED --
              */
          