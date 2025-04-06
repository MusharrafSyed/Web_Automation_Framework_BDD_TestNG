package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static Properties propertyUtils(String filePath) {
        Properties prop = new Properties();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            prop.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
            // Optionally: throw new RuntimeException("Failed to load properties file", e);
        }

        return prop;
    }
}
