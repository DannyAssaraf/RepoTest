package RestService;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestServiceTest {

	@Test

	public void test1() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		// Get request
		Response response = RestAssured.given().accept(ContentType.JSON).when().get("/posts");

		// Print the response
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);

		// parsing validation
		int statusCode = response.statusCode();
		System.out.println("Response Code: " + statusCode);
		if (statusCode == 200) {
			System.out.println("Validation 1: Response code is 200 - OK");
		} else {
			System.out.println("Validation 1: Response code is not 200 - NOT OK");
		}

		// Validate the response content type
		String contentType = response.getContentType();

		System.out.println("Content Type: " + contentType);
		if (contentType.equals("application/json; charset=utf-8")) {
			System.out.println("Validation 2: Content type is application/json");
		} else {
			System.out.println("Validation 2: Content type is not application/json");
		}

	}
}
