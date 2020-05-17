import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int maxNum = 0;
        int n = Integer.parseInt(scanner.nextLine().trim());
        while (count < n) {
            int num = Integer.parseInt(scanner.nextLine().trim());
            if (num % 4 == 0 && maxNum < num) {
                maxNum = num;
            }
            count++;
        }
        System.out.println(maxNum);
    }
}