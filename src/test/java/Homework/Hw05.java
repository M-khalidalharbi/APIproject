package Homework;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Hw05 {
    /*
           Given
               https://reqres.in/api/users/23
           When
               User send a GET Request to the url
           Then
               HTTP Status code should be 404
           And
               Status Line should be HTTP/1.1 404 Not Found
           And
               Server is "cloudflare"
           And
               Response body should be empty
        */
    @Test
    public void HWThree() {
        Response response = RestAssured.get("https://reqres.in/api/users/23");


        int statusCode = response.getStatusCode();
        assertEquals(statusCode, 404, "Status code doesn't match");


        String statusLine = response.getStatusLine();
        assertEquals(statusLine, "HTTP/1.1 404 Not Found", "Status line doesn't match");


        String server = response.getHeader("Server");
        assertEquals(server, "cloudflare", "Server doesn't match");

        String body = response.getBody().asString();
        assertEquals(body, "{}", "Response body is not empty");
    }
}




