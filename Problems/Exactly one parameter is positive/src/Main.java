import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int g3 = scanner.nextInt();

        boolean g1IsPositive = g1 > 0 && g2 <= 0 && g3 <= 0;
        boolean g2IsPositive = g2 > 0 && g1 <= 0 && g3 <= 0;
        boolean g3IsPositive = g3 > 0 && g1 <= 0 && g2 <= 0;
        
        System.out.println(g1IsPositive || g2IsPositive || g3IsPositive);
    }
}
