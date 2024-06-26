import com.fasterxml.jackson.core.JsonProcessingException;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
void test() throws JsonProcessingException {
    spec.pathParams("first","us","second","90210");
    // Set up the expected JSON string
    String strJson = """
                {
                    "post code": "90210",
                    "country": "United States",
                    "country abbreviation": "US",
                    "places": [
                        {
                            "place name": "Beverly Hills",
                            "longitude": "-118.4065",
                            "state": "California",
                            "state abbreviation": "CA",
                            "latitude": "34.0901"
                        }
                    ]
                }
                """;

    Activity3 expectedData = ObjectMapperUtils.convertJsonToJava(strJson, Activity3.class);
    System.out.println("expectedData = " + expectedData);

    Response response = given(spec)
            .get("{first}/{second}");
    response.prettyPrint();

    Activity3 actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), Activity3.class);
    System.out.println("actualData = " + actualData);

    assertEquals(response.statusCode(),200);
    assertEquals(expectedData.getCountry(),actualData.getCountry());
    assertEquals(expectedData.getCountryAbbreviation(),actualData.getCountryAbbreviation());
    assertEquals(expectedData.getPlaces().getFirst().getState(),actualData.getPlaces().getFirst().getState());
    assertEquals(expectedData.getPlaces().getFirst().getStateAbbreviation(),actualData.getPlaces().getFirst().getStateAbbreviation());
}
