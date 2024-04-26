package Homework;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Hw10 {
//    Using the https://petstore.swagger.io/ document, write an automation test that finds the number of "pets" with the status "available" and asserts that there are more than 100.
@Test
public void testHW10() {
    Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");

    assertTrue(response.getStatusCode() == 200, "Failed to retrieve pet information");


    int availablePetsCount = response.jsonPath().getList("findAll { it.status == 'available' }").size();


    assertTrue(availablePetsCount > 100, "Number of available pets is not more than 100");
}
}
