
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

object viewAllPost extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listPost: List[Post]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("View all post")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<div style="text-align: center">
        <h2 style="color: #cc0000; margin: 20px">All posts: </h2>
        <div style="padding: 10px 10px;">
        """),_display_(/*7.10*/for(post <- listPost) yield /*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
            """),format.raw/*8.13*/("""<a href="" style="font: 18px; font-weight: bold"><h1>"""),_display_(/*8.67*/post/*8.71*/.title),format.raw/*8.77*/("""</h1></a>
            <p>"""),_display_(/*9.17*/post/*9.21*/.description),format.raw/*9.33*/("""</p>
            <hr>
        """)))}),format.raw/*11.10*/("""
        """),format.raw/*12.9*/("""</div>

    </div>
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(listPost:List[Post]): play.twirl.api.HtmlFormat.Appendable = apply(listPost)

  def f:((List[Post]) => play.twirl.api.HtmlFormat.Appendable) = (listPost) => apply(listPost)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-30T17:37:41.186
                  SOURCE: /Users/ha_bq/Desktop/tranning-ha_bq-bbs/app/views/viewAllPost.scala.html
                  HASH: 3d705187ceef09cbf09ec3d3a2179092c43f044e
                  MATRIX: 739->1|855->24|882->26|911->47|950->49|981->54|1157->204|1193->225|1232->227|1272->240|1352->294|1364->298|1390->304|1442->330|1454->334|1486->346|1548->377|1584->386|1634->406
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|31->7|31->7|31->7|32->8|32->8|32->8|32->8|33->9|33->9|33->9|35->11|36->12|39->15
                  -- GENERATED --
              */
          