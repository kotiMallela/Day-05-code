import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values for first number, operator, and second number
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next();

        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();

        // Perform the operation based on the operator
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("The result is: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("The result is: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("The result is: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
