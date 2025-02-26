package framework.factory;

import framework.utils.ConfigUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getWebDriver() {
        String browserName = ConfigUtils.getConfProperty("Browser");
        return switch (browserName) {
            case "Chrome" -> {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                yield driver;
            }
            case "Firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
                yield driver;
            }
            default -> throw new RuntimeException("Incorrect BrowserName");
        };
    }
}
