import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = scanner.nextInt();
        int number = 1;
        while (number * number <= maxNum) {
            System.out.println(number * number);
            number++;
        }

    }
}