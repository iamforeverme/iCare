// @SOURCE:D:/workSpace/webApp/iCare/conf/routes
// @HASH:51327c64981687f1ec960be1bee6f6037ab753bb
// @DATE:Sat May 16 17:45:49 CST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:10
class ReverseAssets {


// @LINE:10
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def query(playframework_escape_type:String, id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "query/" + implicitly[PathBindable[String]].unbind("type", dynamicString(playframework_escape_type)) + "/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:10
class ReverseAssets {


// @LINE:10
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def query : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.query",
   """
      function(type,id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("type", encodeURIComponent(type)) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:10
class ReverseAssets {


// @LINE:10
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """GET     /update/:type/:id           controllers.Application.update(type: String, id:Integer)
 Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def query(playframework_escape_type:String, id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.query(playframework_escape_type, id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "query", Seq(classOf[String], classOf[Integer]), "GET", """""", _prefix + """query/$type<[^/]+>/$id<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page """, _prefix + """""")
)
                      

}
                          
}
        
    