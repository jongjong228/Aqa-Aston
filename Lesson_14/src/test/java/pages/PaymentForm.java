package pages;

import framework.elements.ButtonElement;
import framework.pages.BaseIFrame;
import org.openqa.selenium.By;

public class PaymentForm extends BaseIFrame {

    private final ButtonElement exitButton = new ButtonElement(By.xpath("//div[contains(@class,'close-button')]//child::svg-icon"),"Exit Button");

    public PaymentForm() {
        super(By.xpath("//div[@class=\"app-wrapper__content\"]"));
    }

    public void clickExitButton(){
        exitButton.clickElement();
    }
}
