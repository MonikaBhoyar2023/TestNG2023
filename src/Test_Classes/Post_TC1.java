package Test_Classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Comman_API_Methods.Post_API_Methods;
import RequestRepository.Post_Req_Repository;
import io.restassured.path.json.JsonPath;

public class Post_TC1 {
	@Test
	
	public static void extractor() throws IOException {
		
		int statusCode=Post_API_Methods.ResponseStatusCode(Post_Req_Repository.BaseURI(), Post_Req_Repository.Post_Resource(),
				Post_Req_Repository.Post_Req_TC1());
		System.out.println(statusCode);
		
		String ResponseBody=Post_API_Methods.ResponseBody(Post_Req_Repository.BaseURI(), Post_Req_Repository.Post_Resource(),
				Post_Req_Repository.Post_Req_TC1());
		System.out.println(ResponseBody);
		
		JsonPath Jspresponse = new JsonPath(ResponseBody);
		String res_name = Jspresponse.getString("name");
	    String res_job = Jspresponse.getString("job");
	    
	    Assert.assertEquals(res_name,"morpheus");
	    Assert.assertEquals(res_job,"leader");
	}
	
}
