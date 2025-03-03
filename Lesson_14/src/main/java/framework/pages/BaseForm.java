package framework.pages;

import framework.singleton.Singleton;
import framework.utils.WaitUtils;
import org.openqa.selenium.By;

public class BaseForm {

    protected By uniqueElementPath;

    public BaseForm(By locator) {
        this.uniqueElementPath = locator;
    }

    public boolean isPageOpened() {
        waitForPageIsOpened();
        return (!Singleton.getDriver().findElements(uniqueElementPath).isEmpty());
    }

    protected void waitForPageIsOpened() {
        WaitUtils.setWaitUntilVisibility(uniqueElementPath);
    }

}
