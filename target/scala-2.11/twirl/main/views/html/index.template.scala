
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
  <head>
    <title>"""),_display_(/*5.13*/title),format.raw/*5.18*/("""</title>
    
    <!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="shortcut icon" type="image/png" href="assets/images/favicon.png">

    <!-- Styles -->
    
    
    <!-- Enables internationalization -->
   
  </head>
  
  <body class="app" >
  <p>"""),_display_(/*21.7*/title),format.raw/*21.12*/("""</p>
  
  </body>
</html>
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 12 21:57:35 CST 2015
                  SOURCE: D:/workSpace/webApp/iCare/app/views/index.scala.html
                  HASH: fd9c8a8af569ec282bf11bd4a00221864907bbd2
                  MATRIX: 723->1|827->17|855->19|928->66|953->71|1402->494|1428->499
                  LINES: 26->1|29->1|30->2|33->5|33->5|49->21|49->21
                  -- GENERATED --
              */
          