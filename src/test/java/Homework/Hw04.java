//package Homework;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;
//import org.testng.annotations.Test;
//
//import static org.hamcrest.Matchers.equalTo;
//
//public class Hw04 {
//     /*
//       Given
//           https://reqres.in/api/users/2
//       When
//           User send GET Request to the URL
//       Then
//           HTTP Status Code should be 200
//       And
//           Response format should be "application/json"
//       And
//           "email" is "janet.weaver@reqres.in",
//       And
//           "first_name" is "Janet"
//       And
//           "last_name" is "Weaver"
//       And
//           "text" is "To keep ReqRes free, contributions towards server costs are appreciated!"
//    */
//  @Test
//  public void test() {
//    Response response = RestAssured.get("https://reqres.in/api/users/2");
//        response.prettyPrint();
//
//
//      ValidatableResponse body = response
//              .then()
//              .statusCode(200)
//              .contentType("application/json")
//              .body("data.email", equalTo("janet.weaver@reqres.in"),
//              .body("data.first_name", equalTo("Janet"),
//              .body("data.last_name", equalTo("Weaver"),//To do multiple assertion in multiple body methods works as HARD ASSERTION
//                      "support.text", equalTo("To keep ReqRes free, contributions towards server costs are appreciated!");
//  }
//}
