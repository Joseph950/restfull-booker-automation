package methods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.PropertiesReader;

public class BaseFunctions {

    public String generateUrl(String api){
        String baseUrl = PropertiesReader.get("baseUrl");
        String path = PropertiesReader.get(api);
        String urlFinal = baseUrl + path;
        System.out.println("Se tiene la api: " + urlFinal);
        return urlFinal;
    }

    public Response executeRequestGet(String url){
        System.out.println("Se ejecuta la petición...");
        Response response = RestAssured.given().get(url);
        return response;
    }

    public void validateCodeStatus(int code, Response response){
        System.out.println("Se visualiza el código http " + response.getStatusCode());
        Assert.assertEquals("El estatus code esperado era " + code + " pero fue " + response.getStatusCode(),code,response.getStatusCode());
    }

    public void validateResponse(Response response){
        System.out.println("El response es: " + response.getBody().asString());
        Assert.assertEquals("El response no es el esperado","Created",response.getBody().asString());
    }

}
