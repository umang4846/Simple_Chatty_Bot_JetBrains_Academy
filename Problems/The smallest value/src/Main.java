import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = Long.parseLong(scanner.next());
        long factorial = 1;
        int count = 1;
        while (factorial <= number) {
            factorial *= ++count;
        }
        System.out.println(count);
    }
}