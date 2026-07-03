package steps;

import api.CreateBookingApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import methods.BaseFunctions;
import methods.JsonFactory;
import methods.UrlManager;
import methods.Validations;
import models.request.createBooking.Booking;
import models.request.createBooking.Bookingdates;
import org.junit.Assert;
import utils.JsonReader;

public class CreateBookingSteps extends BaseFunctions {
    UrlManager urlManager = new UrlManager();
    Validations validations = new Validations();
    Booking booking = JsonReader.read("bookingRequest.json",Booking.class);
    String url;
    Response createBookingResponse;

    @Given("the api POST is {string}")
    public void postUrl(String api) {
        url = urlManager.getUrl(api);
    }
    @When("execute the POST request")
    public void executePostRequest() {
        createBookingResponse = executeRequestPost(url,booking);
    }
    @Then("should visualize status code {int}")
    public void validateStatusCode(int code) {
        validations.validateCodeStatus(code,createBookingResponse);
    }
    @Then("should visualize correct response")
    public void validateResponse() {
        validations.validateResponseCreateBooking(booking,createBookingResponse);
    }

}
