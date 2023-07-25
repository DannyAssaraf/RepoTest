package requestTypes;

import static org.hamcrest.Matchers.hasItems;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class PatchTest {
	
	@Test
	
	public void postTest() {
		
		baseURI = "https://reqres.in";
		
		JSONObject jo = new JSONObject();
		jo.put("name", "John");
		jo.put("job", "Manager");
		
		System.out.println(jo.toJSONString());
				
		given()
		     .accept("spplication/json")
		     .contentType(ContentType.JSON)
		     .body(jo.toJSONString())
		.when()
		     .patch("/API/users/2")
	    .then()
	    
	         .statusCode(200)
	         .log().all();
	  
			
	}

}
