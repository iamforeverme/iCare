
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
<link rel="stylesheet"
	href="/bower_components/bootstrap/dist/css/bootstrap.css" />
<link rel="stylesheet"
	href="/stylesheets/main.css" />
<!-- mobile -->



<!-- Enables internationalization -->
</head>

<!-- MainCtrl goes on "body" -->
<body class="app icare-body" data-ng-controller="MainCtrl">
	<!-- Header -->
	<div class="bs-docs-header" id="content" tabindex="-1">
	    <div class="container">
	      <h1>iCare</h1>
	       <p>我是一条响亮的口号</p>
	    </div>
    </div>
    
    <!-- Navigation Bar -->
	<div class="container" >
		<ul class="nav nav-pills" data-ng-controller="TabCtrl">
			<li role="presentation" ng-repeat="tab in tabs" style="float:left">
				<a data-ng-click="">"""),format.raw/*41.25*/("""{"""),format.raw/*41.26*/("""{"""),format.raw/*41.27*/("""tab.label"""),format.raw/*41.36*/("""}"""),format.raw/*41.37*/("""}"""),format.raw/*41.38*/("""</a>
			</li>
		</ul>
	</div> 
	<div id="icareApp" style="height: 100%; padding: 10px" ng-view>
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
<script src="/bower_components/requirejs/require.js" data-main="/common/config"></script>
<!--  """),_display_(/*63.8*/helper/*63.14*/.requireJs(core = "/bower_components/requirejs/require.js",
module = "/common/config.js", folder = "common")),format.raw/*64.49*/("""-->
</html>
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 17 16:57:06 CST 2015
                  SOURCE: C:/08_workspace/iCare/app/views/index.scala.html
                  HASH: da1f0ab8bd72d13ebee22777699fb9e8e4a8c542
                  MATRIX: 723->1|827->17|855->19|921->60|946->65|1984->1075|2013->1076|2042->1077|2079->1086|2108->1087|2137->1088|3059->1984|3074->1990|3204->2099
                  LINES: 26->1|29->1|30->2|33->5|33->5|69->41|69->41|69->41|69->41|69->41|69->41|91->63|91->63|92->64
                  -- GENERATED --
              */
          