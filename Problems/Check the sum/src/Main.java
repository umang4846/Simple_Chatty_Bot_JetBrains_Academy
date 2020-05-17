import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int g3 = scanner.nextInt();
        System.out.println(g1 + g2 == 20 || g2 + g3 == 20 || g1 + g3 == 20);
    }
}
