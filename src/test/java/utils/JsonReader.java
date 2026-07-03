package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonReader {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T read(String fileName, Class<T> clazz) {

        try {

            return mapper.readValue(
                    new File("src\\test\\resources\\data\\" + fileName),
                    clazz);

        } catch (Exception e) {

            throw new RuntimeException(e);

        }

    }

}
