package DeleteRequest;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Project_DeleteRequest {
@Test
	public void Delete_Request() {
		// TODO Auto-generated method stub
		
		
		
		
		  Response resp=RestAssured
		.given()
		.delete("https://reqres.in/api/users ");
		 
		  System.out.println("delete Response body is:"+resp.asString());
			System.out.println("the status response code is :"+resp.getStatusCode());


	}

}
