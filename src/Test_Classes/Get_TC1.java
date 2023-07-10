package Test_Classes;

import java.io.IOException;

import org.testng.annotations.Test;

import Comman_API_Methods.Get_API_Methods;
import RequestRepository.Get_Req_Repository;

public class Get_TC1 {
	@Test
	
	public static void extractor() throws IOException {
		
		int statusCode=Get_API_Methods.ResponseStatusCode(Get_Req_Repository.BaseURI(), Get_Req_Repository.Get_Resource());
		System.out.println(statusCode);
		
		String ResponseBody=Get_API_Methods.ResponseBody(Get_Req_Repository.BaseURI(), Get_Req_Repository.Get_Resource());
		System.out.println(ResponseBody);
		
		
	}
	
}
