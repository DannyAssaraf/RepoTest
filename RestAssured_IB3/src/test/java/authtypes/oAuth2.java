package authtypes;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class oAuth2 {
	
	@Test
	public void oAuth2() {
		
		baseURI = "https://api.github.com";
		String token = "ghp_sdfsdfsdfjhkshdfsdfhjksdfhjkshdfjskdfsdfsdfsdf";
		
		given()
		.auth().oauth2(token)
		.when()
		.get("//user/repos")
		.then()
		 .statusCode(200)
		 .log().all();
				
	}	

}