// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();
        String b = scanner.nextLine().trim();
        String c = scanner.nextLine().trim();
        if (Integer.parseInt(c) <= (Integer.parseInt(a) * Integer.parseInt(b)) &&
                (Integer.parseInt(c) % Integer.parseInt(a) == 0 ||
                        Integer.parseInt(c) % Integer.parseInt(b) == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}