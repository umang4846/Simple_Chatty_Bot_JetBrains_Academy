import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next().trim());
        int b = Integer.parseInt(scanner.next().trim());
        int c = Integer.parseInt(scanner.next().trim());
        int d = Integer.parseInt(scanner.next().trim());

        System.out.println(a * b + c * 2 + d * (a - 1));
    }
}