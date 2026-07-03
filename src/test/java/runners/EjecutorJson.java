package runners;

import models.request.createBooking.Bookingdates;
import utils.JsonReader;

public class EjecutorJson {
    public static void main(String[] args){
        Bookingdates bookingdates = JsonReader.read("bookingDatesRequest.json",Bookingdates.class);
        System.out.println(bookingdates.getCheckin());
        System.out.println(bookingdates.getCheckout());
    }
}
