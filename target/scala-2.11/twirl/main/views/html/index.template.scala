
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
<title>"""),_display_(/*5.9*/title),format.raw/*5.14*/("""</title>

<!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="shortcut icon" type="image/png"
	href="/assets/images/favicon.png">


<!-- Styles -->
<!-- mobile -->
<link rel="stylesheet"
	href="/bower_components/bootstrap/dist/css/bootstrap.min.css" />

<!-- Enables internationalization -->
</head>

<!-- MainCtrl goes on "body" -->
<body class="app">
	<div class="navbar navbar-inverse navbar-fixed-top">
	<!-- TabsCtrl goes here -->
		<div class="container">
			<ul class="nav nav-pills">
				<!-- ng-repeat, tabs -->
			</ul>
		</div>
	</div>

	<div id="icareApp" style="height: 100%; padding: 10px">
		<!-- This is the container where the tabs will render -->		
	</div>


</body>

<script src="/bower_components/angular/angular.js"></script>
<script src="/bower_components/angular-route/angular-route.min.js"></script>
<!--  
  <script src="/bower_components/angular-ui-router/release/angular-ui-router.min.js"></script>
  <script src="/bower_components/mobile-angular-ui/dist/js/mobile-angular-ui.min.js"></script>
  
  -->

<!-- config.js is the Require JS entry point; PLAY framework will switch to use optimized javascript inside /assets/scripts-min when application is running in Production mode -->
<!-- http://www.playframework.com/documentation/2.2.1/RequireJS-support -->
"""),_display_(/*51.2*/helper/*51.8*/.requireJs(core = "/bower_components/requirejs/require.js",
module = "/common/config.js", folder = "common")),format.raw/*52.49*/("""
"""),format.raw/*53.1*/("""</html>
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 12 21:45:28 CST 2015
                  SOURCE: C:/08_workspace/iCare/app/views/index.scala.html
                  HASH: 62bb909c541d54fbdce6ae7ea5d5bcb0d7c92e4d
                  MATRIX: 723->1|827->17|855->19|921->60|946->65|2446->1539|2460->1545|2590->1654|2619->1656
                  LINES: 26->1|29->1|30->2|33->5|33->5|79->51|79->51|80->52|81->53
                  -- GENERATED --
              */
          