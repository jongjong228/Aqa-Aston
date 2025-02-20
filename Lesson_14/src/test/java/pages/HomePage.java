package pages;

import framework.elements.ButtonElement;
import framework.elements.LinkElement;
import framework.elements.TextField;
import framework.pages.BaseForm;
import framework.singleton.Singleton;
import org.openqa.selenium.By;

public class HomePage extends BaseForm {

    private final By logosPath = By.xpath("//div[@class=\"pay__partners\"]//child::img");
    private final LinkElement aboutServiceLink = new LinkElement(By.xpath("//div[@class='pay__partners']//following-sibling::a"), "About Service Link");
    private final ButtonElement agreeCookieButton = new ButtonElement(By.xpath("//button[@id=\"cookie-agree\"]"), "Cookie agreeButton");
    private final TextField phoneNumberField = new TextField(By.xpath("//input[@id=\"connection-phone\"]"), "Phone Number Text Field");
    private final TextField emailField = new TextField(By.xpath("//input[@id=\"connection-email\"]"), "email Text Field");
    private final TextField moneyField = new TextField(By.xpath("//input[@id=\"connection-sum\"]"), "money Text Field");
    private final ButtonElement submitButton = new ButtonElement(By.xpath("//form[@id=\"pay-connection\"]/child::button"), "Submit Button");

    public HomePage() {
        super(By.xpath("//div[@class='homepage']"));
    }

    public int getNumOfLogos() {
        return Singleton.getDriver().findElements(logosPath).size();
    }

    public void clickAboutServiceLink() {
        aboutServiceLink.clickElement();
    }

    public void setPhoneField(String text) {
        phoneNumberField.sendKey(text);
    }

    public void setEmailField(String text) {
        emailField.sendKey(text);
    }

    public void setMoneyField(String text) {
        moneyField.sendKey(text);
    }

    public void clickSubmitButton() {
        submitButton.clickElement();
    }

    public void checkAndAgreeCookie() {
        agreeCookieButton.clickIfExists();
    }
}
