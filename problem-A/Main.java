import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second integer: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            Calculator calculator1 = new Calculator(num1, num2);
            int sum = calculator1.add();
            System.out.println("Sum: " + sum);

            Calculator calculator2 = new Calculator(num1, num2);
            int difference = calculator2.subtract();
            System.out.println("Difference: " + difference);

            Calculator calculator3 = new Calculator(num1, num2);
            int product = calculator3.multiply();
            System.out.println("Product: " + product);

            Calculator calculator4 = new Calculator(num1, num2);
            double quotient = calculator4.divide();
            System.out.println("Quotient: " + quotient);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}