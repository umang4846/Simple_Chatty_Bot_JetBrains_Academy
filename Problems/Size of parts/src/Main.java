// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNo = Integer.parseInt(scanner.nextLine().trim());
        int sumOf0 = 0;
        int sumOf1 = 0;
        int sumOfMinus1 = 0;
        for (int i = 1; i <= totalNo; i++) {
            int a = Integer.parseInt(scanner.nextLine().trim());
            if (a == -1) {
                sumOfMinus1++;
            } else if (a == 0) {
                sumOf0++;
            } else if (a == 1) {
                sumOf1++;
            }
        }
        System.out.println(sumOf0 + " " + sumOf1 + " " + sumOfMinus1);
    }
}