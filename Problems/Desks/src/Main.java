import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int g3 = scanner.nextInt();

        System.out.println((g1 / 2) +  (g1 % 2) + (g2 / 2) + (g2 % 2) + (g3 / 2) + (g3 % 2));
    }
}
