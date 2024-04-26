//package requests;
//
//import base_urls.JsonPlaceHolderBaseUrl;
//import org.testng.annotations.Test;
//
//import java.util.Map;
//
//import static io.restassured.RestAssured.given;
//import static org.testng.AssertJUnit.assertEquals;
//
//public class C21_DeleteRequest  extends JsonPlaceHolderBaseUrl {
//
////     /**
////    Given
////    https:*/jsonplaceholder.typicode.com/tod
////    os/198
////    When
////    I send DELETE Request to the Url
////            Then
////    Status code is 200
////    And Response body is { }
//// */
//@Test
//    public void deleteRequestTest() {
//    spec.pathParams("first","todos","second","198");
//
//    Response response= given(spec).delete("{first/{second}");
//    response.prettyprint();
//
//    Map<Object,Object>actualData=response.as(Map.class);
//    system.out.println("actualData="+_actualData);
//    assertEquals(response.statusCode();
//}
//}
