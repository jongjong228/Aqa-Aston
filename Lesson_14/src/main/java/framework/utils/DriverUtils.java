package framework.utils;

import framework.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class DriverUtils {

    public DriverUtils() {
    }

    public static void initDriver() {
        Singleton.getInstance();
        WaitUtils.initWait();
    }

    public static void quitDriver() {
        Singleton.getDriver().quit();
        Singleton.zeroingInstance();
    }

    public static void scrollToElement(WebElement element) {
        Point location = element.getLocation();
        ((JavascriptExecutor) Singleton.getDriver()).executeScript("window.scrollBy(0," + location.y + ");");
    }

    public static void getToPreviousPage() {
        Singleton.getDriver().navigate().back();
    }

    public static void switchToFrameByXpath(By locator) {
        WaitUtils.setWaitUntilFrameIsPresent(locator);
    }

    public static void openURL(String url) {
        Singleton.getDriver().get(url);
    }
}
