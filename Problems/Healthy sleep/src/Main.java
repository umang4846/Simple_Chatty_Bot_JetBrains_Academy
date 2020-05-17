import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String h = scanner.next();

        if (Integer.valueOf(h) < Integer.valueOf(a) && Integer.valueOf(h) < Integer.valueOf(b)) {
            System.out.println("Deficiency");
        } else if (Integer.valueOf(h) > Integer.valueOf(a) && Integer.valueOf(h) > Integer.valueOf(b)) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }

    }
}
