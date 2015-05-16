// @SOURCE:D:/workSpace/webApp/iCare/conf/routes
// @HASH:51327c64981687f1ec960be1bee6f6037ab753bb
// @DATE:Sat May 16 17:45:49 CST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page """, Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_query1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("query/"),DynamicPart("type", """[^/]+""",true),StaticPart("/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_query1_invoker = createInvoker(
controllers.Application.query(fakeValue[String], fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "query", Seq(classOf[String], classOf[Integer]),"GET", """""", Routes.prefix + """query/$type<[^/]+>/$id<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_Assets_at2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """GET     /update/:type/:id           controllers.Application.update(type: String, id:Integer)
 Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """query/$type<[^/]+>/$id<[^/]+>""","""controllers.Application.query(type:String, id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_query1_route(params) => {
   call(params.fromPath[String]("type", None), params.fromPath[Integer]("id", None)) { (playframework_escape_type, id) =>
        controllers_Application_query1_invoker.call(controllers.Application.query(playframework_escape_type, id))
   }
}
        

// @LINE:10
case controllers_Assets_at2_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     