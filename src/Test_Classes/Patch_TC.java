package Test_Classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Comman_API_Methods.Patch_API_Methods;
import RequestRepository.Patch_Req_Repository;
import io.restassured.path.json.JsonPath;

public class Patch_TC {
	@Test
	
	public static void extractor() throws IOException {
		
		int statusCode=Patch_API_Methods.ResponseStatusCode(Patch_Req_Repository.BaseURI(), Patch_Req_Repository.Patch_Resource(),
				Patch_Req_Repository.Patch_Req_TC1());
		System.out.println(statusCode);
		
		String ResponseBody=Patch_API_Methods.ResponseBody(Patch_Req_Repository.BaseURI(), Patch_Req_Repository.Patch_Resource(),
				Patch_Req_Repository.Patch_Req_TC1());
		System.out.println(ResponseBody);
		
		JsonPath JspResponse = new JsonPath(ResponseBody);
	    String res_name = JspResponse.getString("name");
	    String res_job = JspResponse.getString("job");
	    
	    Assert.assertEquals(res_name,"morpheus");
	    Assert.assertEquals(res_job, "zion resident");
	    
	    
	    
	}
	
}
