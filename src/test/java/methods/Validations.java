package methods;

import io.restassured.response.Response;
import models.request.createBooking.Booking;
import org.junit.Assert;

public class Validations {

    public void validateCodeStatus(int code, Response response){
        System.out.println("Se visualiza el código http " + response.getStatusCode());
        Assert.assertEquals("El estatus code esperado era " + code + " pero fue " + response.getStatusCode(),code,response.getStatusCode());
    }

    public void validateResponse(Response response){
        System.out.println("El response es: " + response.getBody().asString());
        Assert.assertEquals("El response no es el esperado","Created",response.getBody().asString());
    }

    public void validateResponseNotEmpty(Response response){
        System.out.println("Se valida el response");
        Assert.assertFalse("Response is null or empty",response.getBody().asString().isEmpty());
    }

    public void validateResponseCreateBooking(Booking expectedResponse, Response obtainedResponse){
        Assert.assertEquals("Se esperaba el dato " + expectedResponse.getFirstname() + " pero se obtuvo " + obtainedResponse.jsonPath().getString("booking.firstname"),expectedResponse.getFirstname(),obtainedResponse.jsonPath().getString("booking.firstname"));
    }
}
