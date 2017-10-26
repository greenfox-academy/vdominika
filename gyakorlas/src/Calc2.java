import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Calc2 {
    public static void main(String... args) {

        System.out.println("Please type in the expression you want to calculate in a format like \"* 3 7\":");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        char operator = expression.charAt(0);

        double a = Double.valueOf(expression.substring(2, expression.indexOf(" ", 2)));
        double b = Double.valueOf(expression.substring(expression.indexOf(" ", 2) + 1, expression.length()));

        double result = 0;

        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        } else if (operator == '%') {
            result = a % b;
        }

        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(result));
    }
}
