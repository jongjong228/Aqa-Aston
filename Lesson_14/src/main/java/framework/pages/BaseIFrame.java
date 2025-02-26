package framework.pages;

import framework.singleton.Singleton;
import framework.utils.WaitUtils;
import org.openqa.selenium.By;

public class BaseIFrame {
    protected By uniqueElementPath;

    public BaseIFrame(By locator) {
        this.uniqueElementPath = locator;
    }

    public boolean isFrameOpened() {
        waitForFrameIsOpened();
        return (!Singleton.getDriver().findElements(uniqueElementPath).isEmpty());
    }

    protected void waitForFrameIsOpened() {
        WaitUtils.setWaitUntilElementIsPresent(uniqueElementPath);
    }

}
