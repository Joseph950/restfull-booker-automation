package methods;

import utils.PropertiesReader;

public class UrlManager {

    public String getUrl(String api){
        String baseUrl = PropertiesReader.get("baseUrl");
        String path = PropertiesReader.get(api);
        String urlFinal = baseUrl + path;
        System.out.println("Se tiene la api: " + urlFinal);

        return urlFinal;
    }
}
