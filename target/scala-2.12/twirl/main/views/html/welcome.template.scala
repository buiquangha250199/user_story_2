
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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/(""" 

"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

"""),format.raw/*5.1*/("""<section id="top">
  <div class="wrapper">
    <h1><a href="https://playframework.com/documentation/"""),_display_(/*7.59*/version),format.raw/*7.66*/("""/Home">"""),_display_(/*7.74*/message),format.raw/*7.81*/("""</a></h1>
  </div>
</section>

<div id="content" class="wrapper doc">
<article>

  <h1>Welcome to Play</h1>

  <p>
    Congratulations, you’ve just created a new Play application. This page will help you with the next few steps.
  </p>

  <blockquote>
    <p>
      You’re using Play """),_display_(/*22.26*/version),format.raw/*22.33*/("""
    """),format.raw/*23.5*/("""</p>
  </blockquote>

  <h2>Why do you see this page?</h2>

    <p>
      The <code>conf/routes</code> file defines a route that tells Play to invoke the <code>HomeController.index</code> action
      whenever a browser requests the <code>/</code> URI using the GET method:
    </p>

    <pre><code># Home page
GET     /               controllers.HomeController.index</code></pre>

    <p>
      Play has invoked the <code>controllers.HomeController.index</code> method to obtain the <code>Action</code> to execute:
    </p>

    <pre><code>def index = Action """),format.raw/*40.35*/("""{"""),format.raw/*40.36*/(""" """),format.raw/*40.37*/("""implicit request: Request[AnyContent] =>
  Ok(views.html.index("Your new application is ready!"))
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""</code></pre>

    <p>
      An action is a function that handles the incoming HTTP request, and returns the HTTP result to send back to the web client.
      Here we send a <code>200 OK</code> response, using a template to fill its content.
    </p>

    <p>
      The template is defined in the <code>app/views/index.scala.html</code> file and compiled as a Scala function.
    </p>

    <pre><code>@(message: String)

@main("Welcome to Play") """),format.raw/*55.27*/("""{"""),format.raw/*55.28*/("""

    """),format.raw/*57.5*/("""@welcome(message)

"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""</code></pre>

    <p>
      The first line of the template defines the function signature. Here it just takes a single <code>String</code> parameter.
      This template then calls another function defined in <code>app/views/main.scala.html</code>, which displays the HTML
      layout, and another function that displays this welcome message. You can freely add any HTML fragment mixed with Scala
      code in this file.
    </p>

    <p>You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*68.86*/version),format.raw/*68.93*/("""/ScalaTemplates">Twirl</a>, the template language used by Play, and how Play handles <a href="https://www.playframework.com/documentation/"""),_display_(/*68.232*/version),format.raw/*68.239*/("""/ScalaActions">actions</a>.</p>

    <h2>Async Controller</h2>

    Now that you've seen how Play renders a page, take a look at <code>AsyncController.scala</code>, which shows how to do asynchronous programming when handling a request.  The code is almost exactly the same as <code>HomeController.scala</code>, but instead of returning <code>Result</code>, the action returns <code>Future[Result]</code> to Play.  When the execution completes, Play can use a thread to render the result without blocking the thread in the mean time.



    <p>
        You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*77.87*/version),format.raw/*77.94*/("""/ScalaAsync">asynchronous actions</a> in the documentation.
    </p>

    <h2>Count Controller</h2>

    <p>
        Both the HomeController and AsyncController are very simple, and typically controllers present the results of the interaction of several services.  As an example, see the <code>CountController</code>, which shows how to inject a component into a controller and use the component when handling requests.  The count controller increments every time you click on it, so keep clicking to see the numbers go up.
    </p>



    <p>
        You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*89.87*/version),format.raw/*89.94*/("""/ScalaDependencyInjection">dependency injection</a> in the documentation.
    </p>

    <h2>Need more info on the console?</h2>

  <p>
    For more information on the various commands you can run on Play, i.e. running tests and packaging applications for production, see <a href="https://playframework.com/documentation/"""),_display_(/*95.187*/version),format.raw/*95.194*/("""/PlayConsole">Using the Play console</a>.
  </p>  

  <h2>Need to set up an IDE?</h2>

  <p>
      You can start hacking your application right now using any text editor. Any changes will be automatically reloaded at each page refresh, 
      including modifications made to Scala source files.
  </p>

  <p>
      If you want to set-up your application in <strong>IntelliJ IDEA</strong> or any other Java IDE, check the 
      <a href="https://www.playframework.com/documentation/"""),_display_(/*107.61*/version),format.raw/*107.68*/("""/IDE">Setting up your preferred IDE</a> page.
  </p>

  <h2>Need more documentation?</h2>

  <p>
    Play documentation is available at <a href="https://www.playframework.com/documentation/"""),_display_(/*113.94*/version),format.raw/*113.101*/("""">https://www.playframework.com/documentation</a>.
  </p>

  <p>
    Play comes with lots of example templates showcasing various bits of Play functionality at <a href="https://www.playframework.com/download#examples">https://www.playframework.com/download#examples</a>.
  </p>

  <h2>Need more help?</h2>

  <p>
    Play questions are asked and answered on Stackoverflow using the "playframework" tag: <a href="https://stackoverflow.com/questions/tagged/playframework">https://stackoverflow.com/questions/tagged/playframework</a>
  </p>

  <p>
    The <a href="https://groups.google.com/group/play-framework">Play Google Group</a> is where Play users come to seek help,
    announce projects, and discuss issues and new features. If you don’t have a Google account, you can still join the mailing
    list by sending an e-mail to
    <strong>play-framework+subscribe@googlegroups.com</strong>.
  </p>

  <p>
    Gitter is a real time chat channel, like IRC. The <a href="https://gitter.im/playframework/playframework">playframework/playframework</a>  channel is used by Play users to discuss the ins and outs of writing great Play applications.
  </p>
 
</article>

<aside>
  <h3>Browse</h3>
  <ul>
    <li><a href="https://playframework.com/documentation/"""),_display_(/*142.59*/version),format.raw/*142.66*/("""">Documentation</a></li>
    <li><a href="https://playframework.com/documentation/"""),_display_(/*143.59*/version),format.raw/*143.66*/("""/api/"""),_display_(/*143.72*/style),format.raw/*143.77*/("""/index.html">Browse the """),_display_(/*143.102*/{style.capitalize}),format.raw/*143.120*/(""" """),format.raw/*143.121*/("""API</a></li>
  </ul>
  <h3>Start here</h3>
  <ul>
    <li><a href="https://playframework.com/documentation/"""),_display_(/*147.59*/version),format.raw/*147.66*/("""/PlayConsole">Using the Play console</a></li>
    <li><a href="https://playframework.com/documentation/"""),_display_(/*148.59*/version),format.raw/*148.66*/("""/IDE">Setting up your preferred IDE</a></li>
    <li><a href="https://playframework.com/download#examples">Example Projects</a>
  </ul>
  <h3>Help here</h3>
  <ul>
    <li><a href="https://stackoverflow.com/questions/tagged/playframework">Stack Overflow</a></li>
    <li><a href="https://groups.google.com/group/play-framework">Mailing List</a></li>
    <li><a href="https://gitter.im/playframework/playframework">Gitter Channel</a></li>
  </ul>
  
</aside>

</div>
""")))}),format.raw/*161.2*/("""
"""))
      }
    }
  }

  def render(message:String,style:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => apply(message,style)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-30T11:38:45.563
                  SOURCE: /Users/ha_bq/Desktop/tranning-ha_bq-bbs/app/views/welcome.scala.html
                  HASH: 2ee3d47930c86215466e9367530a74aa72ce466d
                  MATRIX: 738->1|875->43|904->47|951->86|1001->99|1029->101|1156->202|1183->209|1217->217|1244->224|1556->509|1584->516|1616->521|2204->1081|2233->1082|2262->1083|2387->1181|2415->1182|2889->1630|2918->1631|2951->1637|2997->1657|3025->1658|3571->2177|3599->2184|3766->2323|3795->2330|4453->2961|4481->2968|5138->3598|5166->3605|5515->3926|5544->3933|6054->4415|6083->4422|6301->4612|6331->4619|7617->5878|7646->5885|7757->5968|7786->5975|7820->5981|7847->5986|7901->6011|7942->6029|7973->6030|8109->6138|8138->6145|8270->6249|8299->6256|8797->6723
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|32->7|32->7|32->7|32->7|47->22|47->22|48->23|65->40|65->40|65->40|67->42|67->42|80->55|80->55|82->57|84->59|84->59|93->68|93->68|93->68|93->68|102->77|102->77|114->89|114->89|120->95|120->95|132->107|132->107|138->113|138->113|167->142|167->142|168->143|168->143|168->143|168->143|168->143|168->143|168->143|172->147|172->147|173->148|173->148|186->161
                  -- GENERATED --
              */
          