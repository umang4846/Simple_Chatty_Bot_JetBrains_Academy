// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = Integer.parseInt(scanner.nextLine().trim()) * 3600;
        int m1 = Integer.parseInt(scanner.nextLine().trim()) * 60;
        int s1 = Integer.parseInt(scanner.nextLine().trim());
        int h2 = Integer.parseInt(scanner.nextLine().trim()) * 3600;
        int m2 = Integer.parseInt(scanner.nextLine().trim()) * 60;
        int s2 = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(Math.abs(h1 + m1 + s1 - h2 - m2 - s2));
    }
}