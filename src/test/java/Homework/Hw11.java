package Homework;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Hw11 {
   /*
    Given
        https://automationexercise.com/api/productsList
    When
        User sends a GET request
    Then
        Assert that the number of "Women" user type is 12

    Note: Print using JsonPath: response.jsonPath().prettyPrint();

*/
   @Test
   public void HomeWork11(){


       Response response = RestAssured.get("https://automationexercise.com/api/productsList");


       assertEquals(response.getStatusCode(), 200);


       response.jsonPath().prettyPrint();


       int womenCount = response.jsonPath().getList("products.findAll { it.category.usertype.usertype == 'Women' }").size();
       assertEquals(womenCount, 12);
   }
}


