package steps;

import assertions.HealthCheckAssertions;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import methods.BaseFunctions;
import org.junit.Assert;
import utils.PropertiesReader;

public class HealthCheckSteps extends BaseFunctions {
    Response response;
    String url;

    @Given("the api is {string}")
    public void getUrl(String api) {
        url = generateUrl(api);
    }
    @When("execute the get request")
    public void executeGetRequest() {
        response = executeRequestGet(url);
    }
    @Then("should visualize status code {int}")
    public void validateStatusCode(int code) {
        validateCodeStatus(code,response);
    }
    @Then("should visualize correct response")
    public void validateCorrectResponse() {
        validateResponse(response);
    }
}
