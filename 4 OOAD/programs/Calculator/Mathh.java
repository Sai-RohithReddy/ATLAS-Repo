package Calculator;

public class Mathh {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public int divide(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            return 1;
        }
    }
}