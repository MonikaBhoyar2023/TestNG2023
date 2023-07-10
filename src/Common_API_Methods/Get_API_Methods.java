package Common_API_Methods;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Get_API_Methods {
	
	public static int ResponseStatusCode(String baseURI, String Resource) {
		
		RestAssured.baseURI=baseURI;
		
		int statusCode=given().header("Content-Type","application/json").
				when().get(Resource).then().extract().statusCode();
		return statusCode;
	}
	public static String ResponseBody(String BaseURI, String Resource) {
		
		RestAssured.baseURI=BaseURI;
		String ResponseBody=given().header("Content-Type","application/json").
				when().get(Resource).then().extract().response().asPrettyString();
		return ResponseBody;
	
	}
	
}


