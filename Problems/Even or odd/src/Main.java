import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = Integer.parseInt(scanner.nextLine().trim());
            if (num == 0) {
                break;
            } else if (num % 2 == 0) {
                System.out.println("even");
            } else if (num % 2 != 0) {
                System.out.println("odd");
            }

        }
    }
}