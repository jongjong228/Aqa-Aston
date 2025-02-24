package tests;

import org.testng.annotations.BeforeClass;
import requests.EchoRequests;

public class BaseTest {
    protected EchoRequests requests;

    @BeforeClass
    public void initialTests() {
        requests = new EchoRequests();
    }
}
