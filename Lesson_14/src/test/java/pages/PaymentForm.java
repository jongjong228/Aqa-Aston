package pages;

import framework.pages.BaseForm;
import org.openqa.selenium.By;

public class PaymentForm extends BaseForm {

    public PaymentForm() {
        super(By.xpath("//div[@class=\"app-wrapper__content\"]"));
    }
}
