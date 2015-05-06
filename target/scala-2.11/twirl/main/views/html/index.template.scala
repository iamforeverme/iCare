
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

    <link rel="shortcut icon" type="image/png" href="/assets/images/favicon.png">
    

    <!-- Styles -->    
   		<!-- mobile -->
    <link rel="stylesheet" href="/bower_components/mobile-angular-ui/dist/css/mobile-angular-ui-base.min.css" />
    
    <!-- Enables internationalization -->
   
  </head>
  
  <body class="app" >
  		<div id="icareApp" style="height:100%; padding:10px" ui-view>
			<!-- This is the container where the tabs will render -->
		</div>
  
  </body>
  
  <script src="/bower_components/angular/angular.js"></script>
  <!--  
  <script src="/bower_components/angular-ui-router/release/angular-ui-router.min.js"></script>
  <script src="/bower_components/mobile-angular-ui/dist/js/mobile-angular-ui.min.js"></script>
  -->

    <!-- config.js is the Require JS entry point; PLAY framework will switch to use optimized javascript inside /assets/scripts-min when application is running in Production mode -->
    <!-- http://www.playframework.com/documentation/2.2.1/RequireJS-support -->
    """),_display_(/*37.6*/helper/*37.12*/.requireJs(core =
    "/bower_components/requirejs/require.js", module = "/common/config.js", folder = "common")),format.raw/*38.95*/("""
"""),format.raw/*39.1*/("""</html>
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed May 06 13:34:45 CST 2015
                  SOURCE: C:/08_workspace/iCare/app/views/index.scala.html
                  HASH: b276d051e2cfc2ad6bea498b577b2316e46ab7ab
                  MATRIX: 723->1|827->17|855->19|928->66|953->71|2240->1332|2255->1338|2389->1451|2418->1453
                  LINES: 26->1|29->1|30->2|33->5|33->5|65->37|65->37|66->38|67->39
                  -- GENERATED --
              */
          