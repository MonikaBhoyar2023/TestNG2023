package Test_Classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Comman_API_Methods.Put_API_Method;
import RequestRepository.Put_Req_Repository;
import io.restassured.path.json.JsonPath;

public class Put_TC1 {
	@Test
	
	public static void extractor() throws IOException {
		
		int statusCode=Put_API_Method.ResponseStatusCode(Put_Req_Repository.BaseURI(), Put_Req_Repository.Put_Resource(),
				Put_Req_Repository.Put_Req_TC1());
		System.out.println(statusCode);
		
		String ResponseBody=Put_API_Method.ResponseBody(Put_Req_Repository.BaseURI(), Put_Req_Repository.Put_Resource(),
				Put_Req_Repository.Put_Req_TC1());
		System.out.println(ResponseBody);
		
		JsonPath Jspresponse = new JsonPath(ResponseBody);
		String res_name = Jspresponse.getString("name");
	    String res_job = Jspresponse.getString("job");
	    
	    Assert.assertEquals(res_name,"morpheus");
	    Assert.assertEquals(res_job,"Zion resident");
	}
	
}
