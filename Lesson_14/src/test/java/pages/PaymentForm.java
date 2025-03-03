package pages;

import framework.elements.ButtonElement;
import framework.elements.TextField;
import framework.pages.BaseIFrame;
import framework.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class PaymentForm extends BaseIFrame {

    private final ButtonElement exitButton = new ButtonElement(By.xpath("//div[contains(@class,'close-button')]//child::svg-icon"), "Exit Button");
    private final TextField costField = new TextField(By.xpath("//div[@class='pay-description__cost']//child::span[1]"), "cost field");
    private final TextField payDescriptionField = new TextField(By.xpath("//div[@class='pay-description__text']//child::span"), "pay description field");
    private final By placeholdersLocator = By.xpath("//div[contains(@class,'app-input')]//child::label");
    private final By logosPath = By.xpath("//div[contains(@class,'icons-container')]//child::img");
    private final ButtonElement submitButton = new ButtonElement(By.xpath("//button[@type='submit']"), "submit button");

    public PaymentForm() {
        super(By.xpath("//input[@id='cc-number']"));
    }

    public void clickExitButton() {
        exitButton.clickElement();
    }

    public String getSubmitButtonText() {
        return submitButton.getElementText();
    }

    public String getCoastFieldText() {
        return costField.getElementText();
    }

    public String getPayDescription() {
        return payDescriptionField.getElementText();
    }

    public int getNumOfLogos() {
        return DriverUtils.findElements(logosPath).size();
    }

    public List<String> getTextOfPlaceholders() {
        return DriverUtils.findElements(placeholdersLocator).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
