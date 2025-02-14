package tests;

import functionClasses.Factorial;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFactorialFunction {

    @BeforeAll
    public static void initializeTest() {
        System.out.println("Тестирование метода нахождения факториала");
    }

    @ParameterizedTest
    @DisplayName("Позитивная проверка факториала")
    @CsvSource({
            "0,1",
            "4,24",
            "3,6"
    })
    public void positiveFactorialTest(String input, int expected) {
        Factorial factorialNumber = new Factorial();
        Assertions.assertEquals(expected, factorialNumber.getFactorial(input));
    }

    @ParameterizedTest
    @ValueSource(strings = "asd")
    public void negativeStringTest(String number) {
        Factorial factorialNumber = new Factorial();
        NumberFormatException thrown = assertThrows(NumberFormatException.class, () -> factorialNumber.getFactorial(number));
        Assertions.assertEquals("For input string: \"asd\"", thrown.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = "-5")
    public void negativeFactorialTest(String number) {
        Factorial factorialNumber = new Factorial();
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> factorialNumber.getFactorial(number));
        Assertions.assertEquals("Факториал отрицательного числа не определен", thrown.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = "21474836480")
    public void negativeLongTest(String number) {
        Factorial factorialNumber = new Factorial();
        NumberFormatException thrown = assertThrows(NumberFormatException.class, () -> factorialNumber.getFactorial(number));
        Assertions.assertEquals("For input string: \"21474836480\"", thrown.getMessage());
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("тестирование закончено");
    }
}
