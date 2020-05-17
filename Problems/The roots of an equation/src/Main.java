// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 1000; i++) {
            if ((a * (i * i * i)) + (b * (i * i)) + (c * i) + d == 0) {
                System.out.println(i);
            }
        }
    }
}