package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
@Table(name="warning_type")  
public class WarningType extends Model {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	Integer id;
	  
	@Constraints.Required
	String type;
  
 	public Integer getId(){
	    return id;
	}
 	public void setId(Integer id){
	    this.id = id;
	}
 	public String getType(){
	    return type;
	}
 	public void setType(String type){
	    this.type = type;
	}

    public String toJSONString() {
	
    return "{ type:'"+type.toString()

    		+"' }";
    }
}