package pages;

import framework.elements.*;
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
    private final BaseElement selectButton = new ButtonElement(By.xpath("//button[@class='select__header']"), "select button element");
    private final TextField moneyFieldInternet = new TextField(By.xpath("//input[@id='internet-sum']"), "money internet");
    private final TextField moneyFieldInstalment = new TextField(By.xpath("//input[@id='instalment-sum']"), "money instalment");
    private final TextField moneyFieldArrears = new TextField(By.xpath("//input[@id='arrears-sum']"), "money arrears");
    private final TextField phoneFieldInternet = new TextField(By.xpath("//input[@id='internet-phone']"), "phone internet");
    private final TextField phoneFieldInstalment = new TextField(By.xpath("//input[@id='score-instalment']"), "phone instalment");
    private final TextField phoneFieldArrears = new TextField(By.xpath("//input[@id='score-arrears']    "), "phone arrears");
    private final TextField emailFieldInternet = new TextField(By.xpath("//input[@id='internet-email']"), "email internet");
    private final TextField emailFieldInstalment = new TextField(By.xpath("//input[@id='instalment-email']"), "email instalment");
    private final TextField emailFieldArrears = new TextField(By.xpath("//input[@id='arrears-email']"), "email arrears");
    private final SelectElement paySelect = new SelectElement(By.xpath("//button[@class='select__header']"), "select pay method", By.xpath("//li[contains(@class,'select__item')]"));

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

    public void clearPhoneField() {
        phoneNumberField.clearField();
    }

    public void clearEmailField() {
        emailField.clearField();
    }

    public void clearMoneyField() {
        moneyField.clearField();
    }

    public String getPhoneInternetFieldText() {
        return phoneFieldInternet.getAttributeValue("placeholder");
    }

    public String getMoneyInternetFieldText() {
        return moneyFieldInternet.getAttributeValue("placeholder");
    }

    public String getEmailInternetFieldText() {
        return emailFieldInternet.getAttributeValue("placeholder");
    }

    public String getPhoneInstalmentFieldText() {
        return phoneFieldInstalment.getAttributeValue("placeholder");
    }

    public String getMoneyInstalmentFieldText() {
        return moneyFieldInstalment.getAttributeValue("placeholder");
    }

    public String getEmailInstalmentFieldText() {
        return emailFieldInstalment.getAttributeValue("placeholder");
    }

    public String getPhoneArrearsFieldText() {
        return phoneFieldArrears.getAttributeValue("placeholder");
    }

    public String getMoneyArrearsFieldText() {
        return moneyFieldArrears.getAttributeValue("placeholder");
    }

    public String getEmailArrearsFieldText() {
        return emailFieldArrears.getAttributeValue("placeholder");
    }

    public String getPhoneFieldText() {
        return phoneNumberField.getAttributeValue("placeholder");
    }

    public String getMoneyFieldText() {
        return moneyField.getAttributeValue("placeholder");
    }

    public String getEmailFieldText() {
        return emailField.getAttributeValue("placeholder");
    }

    public void setSelectPayOption(int index) {
        paySelect.pickSelectValue(index);
    }
}
