package requests;

public class C30_PojoGenerator  extends GoRestBaseUr {
      /*
Given
    https://gorest.co.in/public/v1/users?id=6880236
When
    User sends GET request
Then
    HTTP Status Code should be 200
And
    Response body should be like:
        {
            "meta": {
                "pagination": {
                    "total": 1,
                    "pages": 1,
                    "page": 1,
                    "limit": 10,
                    "links": {
                        "previous": null,
                        "current": "https://gorest.co.in/public/v1/users?page=1",
                        "next": null
                    }
                }
            },
            "data": [
                {
                    "id": 6880236,
                    "name": "Pres. Abhaya Sinha",
                    "email": "pres_sinha_abhaya@kovacek.test",
                    "gender": "male",
                    "status": "inactive"
                }

            ]
        }
 */

    @Test//To use ObjectMapper with Pojo is the best practice!!!
    void pojoGeneratorTest(){

        //Set the url
        spec.pathParams("first","users")
                .queryParams("id","6880236");

        //Set the expected data




    }

}
}
