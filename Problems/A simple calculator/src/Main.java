import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        String operator = scanner.next();
        long b = scanner.nextLong();
        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;

            case "-":
                System.out.println(a - b);
                break;

            case "*":
                System.out.println(a * b);
                break;

            case "/":
                System.out.println(b == 0 ? "Division by 0!" : a / b);
                break;

            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}