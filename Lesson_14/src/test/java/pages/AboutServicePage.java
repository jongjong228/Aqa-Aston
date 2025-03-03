package pages;

import framework.elements.ButtonElement;
import framework.pages.BaseForm;
import org.openqa.selenium.By;

public class AboutServicePage extends BaseForm {

    private final ButtonElement agreeCookieButton = new ButtonElement(By.xpath("//button[@id=\"cookie-agree\"]"), "Cookie agreeButton");

    public AboutServicePage() {
        super(By.xpath("//h3[contains(text(),'Оплата банковской картой')]"));
    }

    public void checkAndAgreeCookie() {
        agreeCookieButton.clickIfExists();
    }
}
