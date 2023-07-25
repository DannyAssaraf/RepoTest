package requestTypes;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import static io.restassured.RestAssured.*;

public class GetTest {

	@Test

	public void getTest() {

		Response res = RestAssured.get("https://reqres.in/api/users?page=2");

		System.out.println(res.statusCode());
		System.out.println(res.getTime());
		System.out.println(res.contentType());
		System.out.println(res.asString());
		Assert.assertEquals(res.statusCode(), 200);

	}

	@Test
	public void getTestBDD() {

		baseURI = "https://reqres.in";

	   	given()
		    .queryParam("page", "2")
		.when()
		    .get("api/users")
		.then()
	      	.statusCode(200)
	        .body("data[3].id", equalTo(10)) 
	        .body("data.last_name", hasItems("Fields", "Howell")) 
	        .log().all();

	}

}