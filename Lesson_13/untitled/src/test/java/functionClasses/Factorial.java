package functionClasses;

public class Factorial {

    public int getFactorial(String number) {
        int value = Integer.parseInt(number);
        if (value < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }
        int result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
