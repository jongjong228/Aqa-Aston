package tests;

import keys.ConfKeys;
import org.testng.annotations.Test;
import utils.ConfigUtils;

public class PostmanEchoTests extends BaseTest {

    @Test
    public void getMethodTest() {
        requests.getMethod(ConfigUtils.getConfProperty(ConfKeys.PARAM_1), ConfigUtils.getConfProperty(ConfKeys.PARAM_2));
    }

    @Test
    public void postRawMethodTest() {
        requests.postRawMethod(ConfigUtils.getConfProperty(ConfKeys.TEXT));
    }

    @Test
    public void postFormDateMethodTest() {
        requests.postFormDateMethod(ConfigUtils.getConfProperty(ConfKeys.PARAM_1), ConfigUtils.getConfProperty(ConfKeys.PARAM_2));
    }

    @Test
    public void patchMethodTest() {
        requests.patchMethod(ConfigUtils.getConfProperty(ConfKeys.TEXT));
    }

    @Test
    public void putMethodTest() {
        requests.putMethod(ConfigUtils.getConfProperty(ConfKeys.TEXT));
    }

    @Test
    public void deleteMethodTest() {
        requests.deleteMethod(ConfigUtils.getConfProperty(ConfKeys.TEXT));
    }
}
