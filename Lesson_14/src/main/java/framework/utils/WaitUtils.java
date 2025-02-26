package framework.utils;

import framework.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private static WebDriverWait wait;

    public static void initWait() {
        wait = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(Integer.parseInt(ConfigUtils.getConfProperty("AlertTimeStart"))));
    }

    public static WebElement setWaitUntilVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOf(Singleton.getDriver().findElement(locator)));
    }

    public static void setWaitUntilFrameIsPresent(By locator) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    public static void setWaitUntilElementIsPresent(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void setWaitUntilElementIsClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
