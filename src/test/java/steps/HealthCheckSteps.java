package steps;

import assertions.HealthCheckAssertions;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.PropertiesReader;

public class HealthCheckSteps {
    Response response;

    @Given("se tiene la api {string}")
    public void se_tiene_la_api(String api) {
        System.out.println("Se tiene la api: " + api);
        String baseUrl = PropertiesReader.get("baseUrl");
        String path = PropertiesReader.get("healthCheck");
        String urlFinal = baseUrl + path;
        response = RestAssured.given().get(urlFinal);
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
