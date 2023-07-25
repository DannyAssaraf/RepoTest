package testAssigment;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Testing {

	@Test
	
	public void Test1() {
	//Positive test - Validate that user is able to create user successfully.	
		baseURI = "https://reqres.in";
		
		JSONObject jo = new JSONObject();
		jo.put("name", "John");
		jo.put("job", "Dev");
		
		System.out.println(jo.toJSONString());
		System.out.println("positiveTest1");
				
		given()
		     .accept("spplication/json")
		     .contentType(ContentType.JSON)
		     .body(jo.toJSONString())
		.when()
		     .post("/API/users")
	    .then()
	    
	         .statusCode(201)
	         .log().all();
		
		
	}
	
	@Test
	
	public void Test2() {
	//Negative test - Validate that user is not able to create user successfully when not populating one of the mandatory fields, 
	//expected failure - actual passed - defect in system	
       baseURI = "https://reqres.in";
		
		JSONObject jo = new JSONObject();
		jo.put("name", "");
		jo.put("job", "Dev");
		
		System.out.println(jo.toJSONString());
		System.out.println("negativeTest2");
				
		given()
		     .accept("spplication/json")
		     .contentType(ContentType.JSON)
		     .body(jo.toJSONString())
		.when()
		     .post("/API/users")
	    .then()
	    
	         .statusCode(201)
	         .log().all();
		
	}
	
    @Test
	
	public void Test3() {
	//Insert name with 2 letters - this is too short, name should be minimal of 3 digits, //expected failure - actual passed - defect in system	
       baseURI = "https://reqres.in";
		
		JSONObject jo = new JSONObject();
		jo.put("name", "Da");
		jo.put("job", "Dev");
		
		System.out.println(jo.toJSONString());
		System.out.println("negativeTest3");
				
		given()
		     .accept("spplication/json")
		     .contentType(ContentType.JSON)
		     .body(jo.toJSONString())
		.when()
		     .post("/API/users")
	    .then()
	    
	         .statusCode(201)
	         .log().all();
		
	}

       @Test

       public void Test4() {
       //Insert name with 3 letters - this is the exact allowed size -  name should be minimal of 3 digits 
       baseURI = "https://reqres.in";
	
	   JSONObject jo = new JSONObject();
	   jo.put("name", "Dan");
	   jo.put("job", "Dev");
	
	   System.out.println(jo.toJSONString());
	   System.out.println("Test4");
			
	given()
	     .accept("spplication/json")
	     .contentType(ContentType.JSON)
	     .body(jo.toJSONString())
	.when()
	     .post("/API/users")
    .then()
    
         .statusCode(201)
         .log().all();
	
    }
       
       @Test

       public void Test5() {
       //Insert name with 30 letters - this is above the max number -  Error should come
       baseURI = "https://reqres.in";
	
	   JSONObject jo = new JSONObject();
	   jo.put("name", "BingbongbgDingdongdgPingpongpg");
	   jo.put("job", "Dev");
	
	   System.out.println(jo.toJSONString());
	   System.out.println("Test5");
			
	given()
	     .accept("spplication/json")
	     .contentType(ContentType.JSON)
	     .body(jo.toJSONString())
	.when()
	     .post("/API/users")
    .then()
    
         .statusCode(201)
         .log().all();
	
    }


}
