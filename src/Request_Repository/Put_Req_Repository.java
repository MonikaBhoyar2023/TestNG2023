package Request_Repository;

public class Put_Req_Repository {
	public static String BaseURI() {
		String baseURI = "https://reqres.in/";
		return baseURI;
	}
	
	public static String Put_Resource() {
		String Put_Resoucre="/api/users/2";
		return Put_Resoucre;
		}
		public static String Put_Req_TC1() {
			String RequestBody = "{\r\n"
					+ "    \"name\": \"morpheus\",\r\n"
					+ "    \"job\": \"Zion resident\"\r\n"
					+ "}";
			return RequestBody;
			
			
			
		}
}