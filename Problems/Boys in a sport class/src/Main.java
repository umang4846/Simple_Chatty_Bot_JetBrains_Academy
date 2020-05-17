import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int g3 = scanner.nextInt();
        boolean result1 = g1 >= g2 && g2 >= g3;
        boolean result2 = g1 <= g2 && g2 <= g3;
        System.out.println(result1 || result2);
    }
}
