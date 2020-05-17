// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine().trim());
        int b = Integer.parseInt(scanner.nextLine().trim());
        float divisibleBy3 = 0;
        int sumOfdivisibleBy3 = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                divisibleBy3++;
                sumOfdivisibleBy3 += i;
            }
        }
        System.out.println(sumOfdivisibleBy3 / divisibleBy3);
    }
}