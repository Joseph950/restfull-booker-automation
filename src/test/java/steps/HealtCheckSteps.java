package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import methods.BaseFunctions;

public class HealtCheckSteps extends BaseFunctions {
    Response response;
    String url;

    @When("execute the get request")
    public void executeGetRequest() {
        response = executeRequestGet(url);
    }
    @Given("the api is {string}")
    public void getUrl(String api) {
        //url = generateUrl(api);
    }
}
