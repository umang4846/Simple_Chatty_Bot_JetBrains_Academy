import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();
        boolean g2 = scanner.nextBoolean();
        boolean result1 = g1 >= 10 && g1 <= 20 && !g2;
        boolean result2 = g1 >= 15 && g1 <= 25 && g2;

        System.out.println(result1 || result2);
    }
}
