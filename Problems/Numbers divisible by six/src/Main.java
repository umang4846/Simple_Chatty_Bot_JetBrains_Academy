// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNo = Integer.parseInt(scanner.nextLine().trim());
        int sumOfdivisibleBy6 = 0;
        for (int i = 1; i <= totalNo; i++) {
            int a = Integer.parseInt(scanner.nextLine().trim());

            if (a % 6 == 0) {
                sumOfdivisibleBy6 += a;
            }
        }
        System.out.println(sumOfdivisibleBy6);
    }
}