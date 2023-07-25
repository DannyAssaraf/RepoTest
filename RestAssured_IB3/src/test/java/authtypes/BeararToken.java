package authtypes;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class BeararToken {
	
	@Test
	public void BeararTokenAuth() {
		
		baseURI = "https://api.github.com";
		String token = "ghp_sdfsdfsdfjhkshdfsdfhjksdfhjkshdfjskdfsdfsdfsdf";
		
		given()
		        .headers("Authorization", "Bearer " + token)
		.when()
		        .get("//user/repos")
		.then()
		 .statusCode(200)
		 .log().all();
				
	}	

}