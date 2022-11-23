package helpers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class APIHelper {

	private static String baseURL = "https://helloacm.com/";
	//private static String baseURL = System.getProperty("baseurl");

	public static Response get(String path, String s){
    	String apiPath = baseURL + path;
        return given().
        		contentType(ContentType.JSON).
        		accept(ContentType.JSON).
				queryParam("cached","").queryParam("s", s).
        		when().
        		get(apiPath).
        		then().
        		extract().
        		response();
    }
}
