package tests;

import framework.tests.BaseTest;
import framework.utils.ConfigUtils;
import framework.utils.DriverUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutServicePage;
import pages.HomePage;
import pages.PaymentForm;
import utils.KeyUtils;

public class OnlineReplenishmentTest extends BaseTest {

    private HomePage homePage;

    @Test
    public void nameOfBlockTest() {
        DriverUtils.openURL(ConfigUtils.getConfProperty(KeyUtils.BASE_URL));
        homePage = new HomePage();
        homePage.checkAndAgreeCookie();
        Assert.assertTrue(homePage.isPageOpened());
    }

    @Test(dependsOnMethods = {"nameOfBlockTest"})
    public void logosPresenceTest() {
        Assert.assertEquals(homePage.getNumOfLogos(), Integer.parseInt(ConfigUtils.getConfProperty(KeyUtils.NUM_OF_LOGOS)));
    }

    @Test(dependsOnMethods = {"logosPresenceTest"})
    public void aboutServiceLinkTest() {
        homePage.clickAboutServiceLink();
        AboutServicePage aboutServicePage = new AboutServicePage();
        homePage.checkAndAgreeCookie();
        Assert.assertTrue(aboutServicePage.isPageOpened());
    }

    @Test(dependsOnMethods = {"aboutServiceLinkTest"})
    public void sendFormTest() {
        DriverUtils.getToPreviousPage();
        homePage.setEmailField(ConfigUtils.getTestProperty(KeyUtils.EMAIL_KEY));
        homePage.setPhoneField(ConfigUtils.getTestProperty(KeyUtils.PHONE_KEY));
        homePage.setMoneyField(ConfigUtils.getTestProperty(KeyUtils.MONEY_KEY));
        homePage.clickSubmitButton();
        PaymentForm paymentForm = new PaymentForm();
        DriverUtils.switchToFrameByXpath(By.xpath("//iframe[@class='bepaid-iframe']"));
        Assert.assertTrue(paymentForm.isPageOpened());
    }
}
