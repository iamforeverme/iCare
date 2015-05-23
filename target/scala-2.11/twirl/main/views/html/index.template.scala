
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
	href="/libs/datatables-plugin-bootstrap/dataTables.bootstrap.css" />

<!-- 
<link rel="stylesheet"
	href="/stylesheets/bootstrap-icare.css" />
	 -->
<link rel="stylesheet"
	href="/stylesheets/main.css" />

<!--
<link rel="stylesheet"
	href="/bower_components/datatables/media/css/jquery.dataTables.css" />
<link rel="stylesheet"
	href="/bower_components/datatables-bootstrap3-plugin/media/css/datatables-bootstrap3.css" />
  

-->



<!-- mobile -->



<!-- Enables internationalization -->
</head>

<!-- MainCtrl goes on "body" -->
<body class="app icare-body" data-ng-controller="MainCtrl">
    <!-- Navigation Bar -->

	<nav class="navbar navbar-default navbar-fixed-top" ng-controller="TabCtrl">
		<!-- We use the fluid option here to avoid overriding the fixed width of a normal container within the narrow content columns. -->
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-1 col-lg-1"></div>
				<div class="navbar-header" width="200px" >
					<a class="navbar-brand" ng-click="navigateHome()"> 
						<img alt="Brand" src="/assets/icons/logo.png">
					</a>
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" ng-click="navigateHome()">
						<span class="sr-only">Toggle navigation</span> 
						<span class="icon-bar"></span>
						<span class="icon-bar"></span> 
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">My First App</a>
				</div>
	
				<ul class="nav navbar-nav" >
					<li role="presentation" ng-class="tabClass(tab)"
						ng-repeat="tab in tabs"><a
						data-ng-click="iCareCtxt.switchRunningApplication(tab.pid)">"""),format.raw/*72.67*/("""{"""),format.raw/*72.68*/("""{"""),format.raw/*72.69*/("""tab.label"""),format.raw/*72.78*/("""}"""),format.raw/*72.79*/("""}"""),format.raw/*72.80*/("""</a>
					</li>
				</ul>
				<div class="col-md-1 col-lg-1"></div>
			</div>

		</div>
	</nav>
	<!--  Alarm -->
	<!--
	<div class="container" >
		<div class="row">
			<div class="col-sm-6 col-md-3">
				<div class="thumbnail">
					<div alarm></div>
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
				<div class="thumbnail">
					<div alarm></div>
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
				<div class="thumbnail">
					<div alarm></div>
				</div>
			</div>
		</div>
	</div>
	  -->
	
	<div id="icareApp" class="container" style="height: 100%; padding: 10px" >
		<div class="row">
			<div  class="col-lg-10  col-mid-10" ng-view></div>
		<!-- This is the container where the tabs will render -->		
		</div>
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
<!--  """),_display_(/*124.8*/helper/*124.14*/.requireJs(core = "/bower_components/requirejs/require.js",
module = "/common/config.js", folder = "common")),format.raw/*125.49*/("""-->
</html>
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat May 23 10:18:30 CST 2015
                  SOURCE: C:/08_workspace/iCare/app/views/index.scala.html
                  HASH: dcb4ecb846132636af3549762a4d791e8fe949a1
                  MATRIX: 723->1|827->17|855->19|921->60|946->65|3085->2176|3114->2177|3143->2178|3180->2187|3209->2188|3238->2189|4766->3690|4782->3696|4913->3805
                  LINES: 26->1|29->1|30->2|33->5|33->5|100->72|100->72|100->72|100->72|100->72|100->72|152->124|152->124|153->125
                  -- GENERATED --
              */
          