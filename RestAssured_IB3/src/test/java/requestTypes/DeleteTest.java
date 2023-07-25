package requestTypes;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import static io.restassured.RestAssured.*;


public class DeleteTest {
	
	@Test
	public void deleteTEst() {
		
		baseURI = "https://reqres.in";
		
		
		when()
		.delete("/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
		
	}

}
