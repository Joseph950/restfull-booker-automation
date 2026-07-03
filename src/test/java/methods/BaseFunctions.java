package methods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.request.createBooking.Booking;
import org.json.JSONObject;
import org.junit.Assert;
import utils.JsonReader;
import utils.PropertiesReader;

import static io.restassured.RestAssured.given;

public class BaseFunctions {

    public Response executeRequestGet(String url){
        System.out.println("Se ejecuta la petición...");
        Response response = RestAssured.given().get(url);
        response.print();
        return response;
    }

    public Response executeRequestPost(String url, Object bodyRequest){
        System.out.println("Se ejecuta la api " + url);
        Response response = given().contentType(ContentType.JSON).body(bodyRequest).when().post(url);
        response.print();
        return response;
    }

}
