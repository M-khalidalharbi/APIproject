package Homework;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Hw3 {
    /*
        Given
            https://reqres.in/api/users/3
        When
            User sends a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK
     */
    public static void main(String[] args) {
//        Given
//        https://reqres.in/api/users/3
        Response response = RestAssured.get("https://reqres.in/api/users/3");
        response.prettyPrint();

        int statusCode = response.statusCode();
        System.out.println("statusCode = " + statusCode);

        String contentType = response.contentType();
        System.out.println("contentType = " + contentType);

    }
}
