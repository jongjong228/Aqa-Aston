package framework.tests;

import framework.utils.DriverUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    protected void init() {
        DriverUtils.initDriver();
    }

    @AfterClass
    protected void quitBrowser() {
        DriverUtils.quitDriver();
    }
}
