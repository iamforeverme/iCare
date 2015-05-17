package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Device;
import models.Protege;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;

import play.*;
import play.db.ebean.Model;
import play.mvc.*;
import play.mvc.Http.RequestBody;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
    	Map<String,String> itWorks = new HashMap<String,String>();
    	Device device =  Ebean.find(Device.class ,1);
    	/*
    	Device device = new Device();
    	device.setMac("cushion");
    	Ebean.save(device); 
    	*/
    	
    	
        itWorks.put("message",device.getMac());
        return ok(play.libs.Json.toJson(itWorks));
    }
    public static Result query(String type,Integer id) {
    	Map<String,String> returnMap = new HashMap<String,String>();
    	Logger.debug("query: "+type+" id: " + id.toString() );
    	if(type.equals("device"))
    	{
	    	try{
	    		List<Device> itemList;
	    		if(id==0)
	    			itemList =  Ebean.find(Device.class).
	    				findList();
	    		else
	    			itemList =  Ebean.find(Device.class)
					.where().eq("id", id).
					findList();
		    	for(int i = 0; i < itemList.size(); i++)  
		        {  
		    		returnMap.put(itemList.get(i).getId().toString(), itemList.get(i).toJSONString());
		        }
			}
			catch(NullPointerException e){
				}
    	}
    	else if(type.equals("protege"))
    	{
    		try{
	    		List<Protege> itemList;
	    		if(id==0)
	    			itemList =  Ebean.find(Protege.class).
	    				findList();
	    		else
	    			itemList =  Ebean.find(Protege.class)
					.where().eq("id", id).
					findList();
		    	for(int i = 0; i < itemList.size(); i++)  
		        {  
		    		returnMap.put(itemList.get(i).getId().toString(), itemList.get(i).toJSONString());
		        }
			}
			catch(NullPointerException e){
				}
    	}
        return ok(play.libs.Json.toJson(returnMap));
    }
    
    public static Result update(String type,Integer id) {
    	RequestBody body = request().body();
        return ok("Got json: " + body.asJson());
    }

}