import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner variable1 = new Scanner(System.in);
        System.out.println("Please enter number");
        int a = variable1.nextInt();

        System.out.println("Please enter operation * / - +");
        String operation = variable1.next();

        System.out.println("Please enter second number");
        int b = variable1.nextInt();
        int result;
        switch (operation) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "-":
                result = a - b;
                break;
            case "+":
                result = a + b;
                break;
            default: result = 0;
        }

        System.out.println("Result of operation " + result);

    }
}
