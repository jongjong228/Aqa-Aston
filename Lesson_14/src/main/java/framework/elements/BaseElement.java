package framework.elements;

import framework.utils.WaitUtils;
import framework.utils.DriverUtils;
import org.openqa.selenium.*;

public class BaseElement {

    protected String name;
    protected By locator;

    protected BaseElement(By locator, String name) {
        this.name = name;
        this.locator = locator;
    }

    public void clickElement() {
        try {
            findElement().click();
        } catch (ElementClickInterceptedException e) {
            DriverUtils.scrollToElement(findElement());
            findElement().click();
        }
    }

    public void clickIfExists() {
        try {
            findElement().click();
        } catch (NoSuchElementException | TimeoutException ignored) {
        }
    }

    protected WebElement findElement() {
        return waitElementIsDisplayed();
    }

    public String getAttributeValue(String attribute) {
        return findElement().getAttribute(attribute);
    }

    public WebElement waitElementIsDisplayed() {
        return WaitUtils.setWaitUntilVisibility(locator);
    }

    public String getElementText() {
        return findElement().getText();
    }
}
