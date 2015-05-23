// @SOURCE:C:/08_workspace/iCare/conf/routes
// @HASH:db33a411a6e6cac79700f79cd8edba0b8e2759d9
// @DATE:Fri May 22 15:13:37 CST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
class ReverseAssets {


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
def at(path:String, file:String): Call = {
   (path: @unchecked, file: @unchecked) match {
// @LINE:9
case (path, file) if path == "/public" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
// @LINE:12
case (path, file) if path == "/public/images" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/images")))
  Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
// @LINE:13
case (path, file) if path == "/public/stylesheets" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/stylesheets")))
  Call("GET", _prefix + { _defaultPrefix } + "stylesheets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
// @LINE:14
case (path, file) if path == "/public/common" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/common")))
  Call("GET", _prefix + { _defaultPrefix } + "common/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
// @LINE:15
case (path, file) if path == "/public/bower_components" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/bower_components")))
  Call("GET", _prefix + { _defaultPrefix } + "bower_components/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
// @LINE:16
case (path, file) if path == "/public/app" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/app")))
  Call("GET", _prefix + { _defaultPrefix } + "app/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
// @LINE:17
case (path, file) if path == "/public/libs" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/libs")))
  Call("GET", _prefix + { _defaultPrefix } + "libs/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
class ReverseAssets {


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(path, file) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/images") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/stylesheets") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stylesheets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/common") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "common/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/bower_components") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bower_components/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/app") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "app/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/libs") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "libs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


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
        


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
class ReverseAssets {


// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    