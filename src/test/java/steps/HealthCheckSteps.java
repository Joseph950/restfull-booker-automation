package steps;

import assertions.HealthCheckAssertions;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import org.junit.Assert;

public class HealthCheckSteps {
    Response response;

    @Given("I have the api healthCheck")
    public void getHealthCheck() {
        response = RestAssured.given().get("https://restful-booker.herokuapp.com/ping");
    }
    @When("I send a request to healtCheck API")
    public void i_send_a_request_to_healt_check_api() {

    }
    @Then("I must visualize the status code {int}")
    public void i_must_visualize_the_status_code(Integer statusCode) {
    }
    @Then("i must visualize the correct response")
    public void i_must_visualize_the_correct_response() {
        response.then().assertThat().statusCode(201);
        System.out.println("El status code es: " + response.getStatusCode());
        response.print();
    }


    @Given("se tiene la api {string}")
    public void se_tiene_la_api(String api) {
        System.out.println("Se tiene la api: " + api);
        response = RestAssured.given().get(api);
    }
    @When("ejecuto la petición")
    public void ejecuto_la_petición() {
        System.out.println("Se ejecuta la petición...");
        response.then().assertThat().statusCode(201);

    }
    @Then("debería visualizar el status code {int}")
    public void debería_visualizar_el_status_code(int int1) {
        System.out.println("Se visualiza el código http " + response.getStatusCode());
        Assert.assertEquals("El estatus code esperado era " + int1 + " pero fue " + response.getStatusCode(),int1,response.getStatusCode());
    }
    @Then("debería visualizar el response exitoso")
    public void debería_visualizar_el_response_exitoso() {
        System.out.println("El response es: " + response.getBody().asString());
        //Assert.assertEquals("El response no es el esperado","Create",response.getBody().toString());
    }
}
