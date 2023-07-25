package authtypes;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import static io.restassured.RestAssured.*;

public class BasicAuth {
	
	@Test
	public void basicAuth() {
		
		baseURI = "https://postman-echo.com";
		
		given()
		.auth().basic("postman", "password")
		.when()
		.get("/basic-auth")
		.then()
		 .statusCode(200)
		 .body("authenticated", equalTo(true))
		 .log().all();
		
		
	}
}

