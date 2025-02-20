package framework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {

    protected static FileInputStream fileInputStreamConfig, fileInputStreamTest;
    protected static Properties ConfProperties, TestProperties;

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
        try {
            fileInputStreamTest = new FileInputStream("src/main/resources/test.properties");
            TestProperties = new Properties();
            TestProperties.load(fileInputStreamTest);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStreamTest != null)
                try {
                    fileInputStreamTest.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static String getConfProperty(String key) {
        return ConfProperties.getProperty(key);
    }

    public static String getTestProperty(String key) {
        return TestProperties.getProperty(key);
    }
}
