package tests;

import framework.tests.BaseTest;
import framework.utils.ConfigUtils;
import framework.utils.DriverUtils;
import framework.utils.StringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutServicePage;
import pages.HomePage;
import pages.PaymentForm;
import utils.KeyUtils;

import java.util.List;

public class OnlineReplenishmentTest extends BaseTest {

    private HomePage homePage;
    private PaymentForm paymentForm;

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
        aboutServicePage.checkAndAgreeCookie();
        Assert.assertTrue(aboutServicePage.isPageOpened());
    }

    @Test(dependsOnMethods = {"aboutServiceLinkTest"})
    public void sendFormTest() {
        DriverUtils.getToPreviousPage();
        homePage.checkAndAgreeCookie();
        homePage.setEmailField(ConfigUtils.getTestProperty(KeyUtils.EMAIL_KEY));
        homePage.setPhoneField(ConfigUtils.getTestProperty(KeyUtils.PHONE_KEY));
        homePage.setMoneyField(ConfigUtils.getTestProperty(KeyUtils.MONEY_KEY));
        homePage.clickSubmitButton();
        paymentForm = new PaymentForm();
        DriverUtils.switchToFrameByXpath(By.xpath("//iframe[@class='bepaid-iframe']"));
        Assert.assertTrue(paymentForm.isFrameOpened());
    }

    @Test(dependsOnMethods = {"checkPaymentFormFieldsTest"})
    public void emptyFieldsTest() {
        paymentForm.clickExitButton();
        DriverUtils.switchToDefaultFrame();
        homePage.clearEmailField();
        homePage.clearMoneyField();
        homePage.clearPhoneField();
        Assert.assertEquals(homePage.getMoneyFieldText(), ConfigUtils.getTestProperty(KeyUtils.MONEY_PLACEHOLDER));
        Assert.assertEquals(homePage.getEmailFieldText(), ConfigUtils.getTestProperty(KeyUtils.EMAIL_PLACEHOLDER));
        Assert.assertEquals(homePage.getPhoneFieldText(), ConfigUtils.getTestProperty(KeyUtils.PHONE_PLACEHOLDER));
        homePage.setSelectPayOption(1);
        Assert.assertEquals(homePage.getMoneyInternetFieldText(), ConfigUtils.getTestProperty(KeyUtils.MONEY_PLACEHOLDER));
        Assert.assertEquals(homePage.getEmailInternetFieldText(), ConfigUtils.getTestProperty(KeyUtils.EMAIL_PLACEHOLDER));
        Assert.assertEquals(homePage.getPhoneInternetFieldText(), ConfigUtils.getTestProperty(KeyUtils.PHONE_INTERNET_PLACEHOLDER));
        homePage.setSelectPayOption(2);
        Assert.assertEquals(homePage.getMoneyInstalmentFieldText(), ConfigUtils.getTestProperty(KeyUtils.MONEY_PLACEHOLDER));
        Assert.assertEquals(homePage.getEmailInstalmentFieldText(), ConfigUtils.getTestProperty(KeyUtils.EMAIL_PLACEHOLDER));
        Assert.assertEquals(homePage.getPhoneInstalmentFieldText(), ConfigUtils.getTestProperty(KeyUtils.PHONE_INSTALMENT_PLACEHOLDER));
        homePage.setSelectPayOption(3);
        Assert.assertEquals(homePage.getMoneyArrearsFieldText(), ConfigUtils.getTestProperty(KeyUtils.MONEY_PLACEHOLDER));
        Assert.assertEquals(homePage.getEmailArrearsFieldText(), ConfigUtils.getTestProperty(KeyUtils.EMAIL_PLACEHOLDER));
        Assert.assertEquals(homePage.getPhoneArrearsFieldText(), ConfigUtils.getTestProperty(KeyUtils.PHONE_ARREARS_PLACEHOLDER));
    }

    @Test(dependsOnMethods = {"sendFormTest"})
    public void checkPaymentFormFieldsTest() {
        String coast = StringUtils.createCoast(ConfigUtils.getTestProperty(KeyUtils.MONEY_KEY));
        Assert.assertEquals(StringUtils.findNumInString(paymentForm.getCoastFieldText()), coast);
        Assert.assertEquals(StringUtils.findNumInString(paymentForm.getPayDescription()), StringUtils.createPhoneNumber(ConfigUtils.getTestProperty(KeyUtils.PHONE_KEY)));
        Assert.assertEquals(StringUtils.findNumInString(paymentForm.getSubmitButtonText()), coast);
        Assert.assertEquals(paymentForm.getNumOfLogos(), Integer.parseInt(ConfigUtils.getTestProperty(KeyUtils.NUM_OF_FORM_LOGOS)));
        List<String> textPlaceholders = paymentForm.getTextOfPlaceholders();
        Assert.assertEquals(textPlaceholders.get(0), ConfigUtils.getTestProperty(KeyUtils.CARD_PLACEHOLDER));
        Assert.assertEquals(textPlaceholders.get(1), ConfigUtils.getTestProperty(KeyUtils.TIME_PLACEHOLDER));
        Assert.assertEquals(textPlaceholders.get(2), ConfigUtils.getTestProperty(KeyUtils.CVC_PLACEHOLDER));
        Assert.assertEquals(textPlaceholders.get(3), ConfigUtils.getTestProperty(KeyUtils.NAME_PLACEHOLDER));
    }
}
