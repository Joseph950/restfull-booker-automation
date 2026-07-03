package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import methods.BaseFunctions;
import models.request.createBooking.Booking;
import models.request.createBooking.Bookingdates;
import org.json.JSONObject;
import utils.JsonReader;
import utils.PropertiesReader;

import java.io.File;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class CreateBookingApi extends BaseFunctions{
    Response response;

    Booking booking = JsonReader.read("bookingRequest.json",Booking.class);

    public void obtainAtributes(){
        System.out.println(booking.getFirstname());
        System.out.println(booking.getBookingdates().getCheckin());
        System.out.println(booking.getBookingdates().getCheckout());
    }

    public void executeCreateBookingApi(String url, Response response){
        System.out.println("Se ejecuta la api de createBooking");
        response = given().contentType(ContentType.JSON).body(booking).when().post(url);
        response.print();
    }


}
