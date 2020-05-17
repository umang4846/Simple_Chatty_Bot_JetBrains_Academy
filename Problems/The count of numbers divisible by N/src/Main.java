// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next().trim());
        int b = Integer.parseInt(scanner.next().trim());
        int n = Integer.parseInt(scanner.next().trim());
        int totalDivisible = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                totalDivisible++;
            }
        }
        System.out.println(totalDivisible);
    }
}