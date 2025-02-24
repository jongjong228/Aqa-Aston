package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {

    protected static FileInputStream fileInputStreamConfig;
    protected static Properties ConfProperties;

    static {
        try {
            fileInputStreamConfig = new FileInputStream("src/main/resources/conf.properties");
            ConfProperties = new Properties();
            ConfProperties.load(fileInputStreamConfig);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStreamConfig != null)
                try {
                    fileInputStreamConfig.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static String getConfProperty(String key) {
        return ConfProperties.getProperty(key);
    }
}
