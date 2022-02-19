package PutRequest;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Project_PutRequest {
@Test
	public void Put_Request() {
		
		JSONObject Json=new JSONObject();
		Json.put("name","Raj");
		Json.put("job","QA");
		
		
		
		  Response resp=RestAssured
		.given()
		.contentType(ContentType.JSON)
		.body(Json.toString())
		
		.put("https://reqres.in/api/users ");
		 
		  System.out.println(resp.statusCode());
		System.out.println(resp.asString());

	}

}
