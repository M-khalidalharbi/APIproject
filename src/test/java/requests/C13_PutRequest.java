package requests;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import test_data.JsonPlaceHolderTestData;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class C13_PutRequest  extends JsonPlaceHolderBaseUrl {


    @Test
    public void putRequestTest() {

        spec.pathParams("first", "todos", "second", "198");
        Map<String, Object> expectedData = JsonPlaceHolderTestData.expectedDataMap(21, "Read Books", false);
        System.out.println("expectedData = " + expectedData);


        //Send the request and get the response
        Response response = given(spec).body(expectedData).put("{first}/{second}");
        response.prettyPrint();

        //Do assertion
        Map<String, Object> actualData = response.as(Map.class);//De-Serialization --> We convert Json response into Java Object(Map)
        System.out.println("actualData = " + actualData);

        assertEquals(response.statusCode(), 200);
        assertEquals(actualData.get("completed"), expectedData.get("completed"));
        assertEquals(actualData.get("title"), expectedData.get("title"));
        assertEquals(actualData.get("userId"), expectedData.get("userId"));


    }

}


