public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Numbers must be positive.");
        }
        return num1 + num2;
    }

    public int subtract() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Numbers must be positive.");
        }
        return num1 - num2;
    }

    public int multiply() throws ArithmeticException {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Numbers cannot be zero.");
        }
        return num1 * num2;
    }

    public double divide() throws ArithmeticException {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Numbers cannot be zero.");
        }
        return (double)num1 / num2;
    }
}