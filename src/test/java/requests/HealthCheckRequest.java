package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckRequest {

    public Response getHealthCheck(Response response) {

        response = RestAssured.given().get("https://restful-booker.herokuapp.com/ping");

        return response;
    }
}
