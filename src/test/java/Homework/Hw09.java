package Homework;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class Hw09 {
    /*
Write an automation test that will create a 'user' using the "https://petstore.swagger.io/" document
*/
    @Test
    public void testHw09() {
        String requestBody = """
                {
                     "id": 5243,
                     "username": "mohammed221",
                     "firstName": "mohammed",
                     "lastName": "alharbi",
                     "email": "formohammed332@gmail.com",
                     "password": "99788",
                     "phone": "053112323",
                     "userStatus": 0
                }""";


//send POST Request to the Url
        io.restassured.response.Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post("https://petstore.swagger.io/v2/user");
        response.prettyPrint();


        //Do assertion
        response
                .then()
                .statusCode(200)
                .body("code", equalTo(200),
                        "type", equalTo("unknown"),
                        "message", equalTo("1234")
                );
    }
}

