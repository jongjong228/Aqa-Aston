package tests;

import functionClasses.Factorial;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestFactorialFunction {

    @BeforeClass
    public void initializeTest() {
        System.out.println("Тестирование метода нахождения факториала");
    }

    @Test
    @Parameters({"positiveFactorialNumber", "positiveResult"})
    public void positiveFactorialTest(String number, int result) {
        Factorial factorialNumber = new Factorial();
        Assert.assertEquals(factorialNumber.getFactorial(number), result);
    }

    @Test
    @Parameters({"positiveZeroTest", "positiveZeroResult"})
    public void positiveZeroTest(String number, int result) {
        Factorial factorialNumber = new Factorial();
        Assert.assertEquals(factorialNumber.getFactorial(number), result);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    @Parameters("stringValue")
    public void negativeStringTest(String number) {
        Factorial factorialNumber = new Factorial();
        factorialNumber.getFactorial(number);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    @Parameters("negativeFactorialNumber")
    public void negativeFactorialTest(String number) {
        Factorial factorialNumber = new Factorial();
        factorialNumber.getFactorial(number);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    @Parameters("negativeLongNumber")
    public void negativeLongTest(String number) {
        Factorial factorialNumber = new Factorial();
        factorialNumber.getFactorial(number);
    }

    @AfterClass
    public void afterAllTests() {
        System.out.println("тестирование закончено");
    }

}
