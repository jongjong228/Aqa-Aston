package framework.elements;

import framework.utils.DriverUtils;
import framework.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectElement extends BaseElement {

    private final ButtonElement selectButton;
    private final By optionsLocator;

    public SelectElement(By locator, String name, By optionsLocator) {
        super(locator, name);
        selectButton = new ButtonElement(locator, "");
        this.optionsLocator = optionsLocator;
    }

    public void pickSelectValue(int index) {
        selectButton.clickElement();
        List<WebElement> selectOptions = DriverUtils.findElements(optionsLocator);
        WaitUtils.setWaitUntilElementIsClickable(selectOptions.get(index));
        selectOptions.get(index).click();

    }
}
