package authtypes;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class APIAuthTest {
	
	@Test
	public void oAuth2() {
		
		baseURI = "https://api.openweathermap.org";
		
		
		given()
		.queryParam("lat","44.34")
		.queryParam("lon","44.34")
		.queryParam("appid", "455645646547556764547564")
		.when()
		.get("/data/2.5/weather")
		.then()
		 .statusCode(200)
		 .log().all();
				
	}	

}