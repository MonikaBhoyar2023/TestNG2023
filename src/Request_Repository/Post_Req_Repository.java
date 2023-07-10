package Request_Repository;

public class Post_Req_Repository {
	public static String BaseURI() {
		String baseURI = "https://reqres.in/";
		return baseURI;
	}
	
	public static String Post_Resource() {
		String Patch_Resource = "api/users";
		return Patch_Resource;
		}
		public static String Post_Req_TC1() {
			String RequestBody = "{\r\n"
					+ "    \"name\": \"morpheus\",\r\n"
					+ "    \"job\": \"leader\"\r\n"
					+ "}";
			return RequestBody;
			
			
			
		}
}