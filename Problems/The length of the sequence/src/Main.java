import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (0 != Integer.parseInt(scanner.nextLine().trim())) {
            count++;
        }
        System.out.println(count);
    }
}