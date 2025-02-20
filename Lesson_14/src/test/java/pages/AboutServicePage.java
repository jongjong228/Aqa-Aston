package pages;

import framework.pages.BaseForm;
import org.openqa.selenium.By;

public class AboutServicePage extends BaseForm {

    public AboutServicePage() {
        super(By.xpath("//h3[contains(text(),'Оплата банковской картой')]"));
    }
}
