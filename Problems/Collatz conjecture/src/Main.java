import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.print(number + " ");
        while (number > 0 && number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
            System.out.print(number + " ");
        }

    }
}