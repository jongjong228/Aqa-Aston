package framework.elements;

import org.openqa.selenium.By;

public class TextField extends BaseElement {

    public TextField(By locator, String name) {
        super(locator, name);
    }

    public void sendKey(String str) {
        findElement().sendKeys(str);
    }
}
