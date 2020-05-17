import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int g3 = scanner.nextInt();
        boolean result = g1 != g2 && g2 != g3 && g1 != g3;
        System.out.println(result);
    }
}
