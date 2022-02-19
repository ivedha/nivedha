package PostRequest;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Project_PostRequest {
	@Test
	public  void Post_Request() {
		
		JSONObject Json=new JSONObject();
		Json.put("name","Bryant");
		Json.put("job","BA");
		
		
		
		  Response resp=RestAssured
		.given()
		.contentType(ContentType.JSON)
		.body(Json.toString())
		
		.post("https://reqres.in/api/users ");
		 
		  System.out.println(resp.statusCode());
		System.out.println(resp.asString());
	
	
	}

}
