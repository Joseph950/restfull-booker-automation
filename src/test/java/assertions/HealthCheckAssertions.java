package assertions;

import io.restassured.response.Response;

public class HealthCheckAssertions {

    public static void validateStatusCode(Response response, int statusCode) {
        System.out.println("Se valida el status code");
        response.then().statusCode(statusCode);
    }
}
