package booker_test;


import base_urls.BookerBaseUrl;
import org.testng.annotations.Test;

public class R03_GetBooking extends BookerBaseUrl {
    /*
    Given
        https://restful-booker.herokuapp.com/booking/:id
    When
        Send GET request the url
    Then
        Status code is 200
     And
     Response body should be like:
        {
            "firstname" : "Jim",
            "lastname" : "Brown",
            "totalprice" : 111,
            "depositpaid" : true,
            "bookingdates" : {
                "checkin" : "2018-01-01",
                "checkout" : "2019-01-01"
            },
            "additionalneeds" : "Breakfast"
        }

     */

        @Test
        void getBookingTest(){
            //Set the url
            spec.pathParams("","","","");



        }

    }

