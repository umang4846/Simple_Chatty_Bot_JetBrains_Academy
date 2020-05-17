// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNo = Integer.parseInt(scanner.nextLine().trim());
        int sumOfA = 0;
        int sumOfB = 0;
        int sumOfC = 0;
        int sumOfD = 0;
        for (int i = 1; i <= totalNo; i++) {
            int a = Integer.parseInt(scanner.nextLine().trim());
            if (a == 2) {
                sumOfD++;
            } else if (a == 3) {
                sumOfC++;
            } else if (a == 4) {
                sumOfB++;
            } else if (a == 5) {
                sumOfA++;
            }
        }
        System.out.println(sumOfD + " " + sumOfC + " " + sumOfB + " " + sumOfA);
    }
}