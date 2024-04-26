package monetring;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Hw11{


        @Test
        void testEmployeeConditions() {
            def response = RestAssured.get('https://dummy.restapiexample.com/api/v1/employees')

            // Assert the status code is 200
            Assert.assertEquals(200, response.getStatusCode())

            // Parse the response body
            def responseBody = new groovy.json.JsonSlurper().parseText(response.getBody().asString())

            // Assert that the response is not null
            Assert.assertNotNull(responseBody.data)

            // Filter and print employees with age greater than 55 and assert there are 8
            def employeesAgeOver55 = responseBody.data.findAll { it.employee_age > 55 }
            println("Employees with age greater than 55: ${employeesAgeOver55}")
            Assert.assertEquals(8, employeesAgeOver55.size())

            // Filter and print employees with IDs greater than 17 and assert there are 7
            def employeesIdOver17 = responseBody.data.findAll { it.id.toInteger() > 17 }
            println("Employees with id greater than 17: ${employeesIdOver17}")
            Assert.assertEquals(7, employeesIdOver17.size())

            // Filter and print employees with salary less than 100,000 and assert Doris Wilder is one of them
            def employeesSalaryLessThan100k = responseBody.data.findAll { it.employee_salary.toInteger() < 100000 }
            println("Employees with salary less than 100,000: ${employeesSalaryLessThan100k}")

            def containsDoris = employeesSalaryLessThan100k.find { it.employee_name == 'Doris Wilder' } != null
            Assert.assertTrue(containsDoris)
        }
    }


