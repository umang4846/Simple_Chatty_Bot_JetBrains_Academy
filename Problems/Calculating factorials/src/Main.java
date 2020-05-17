import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        if (n == 0) {
            return 1;
        } else if (n == 1L || n == 2L) {
            return n;
        } else {
            long mul = 1L;
            for (long i = n; i > 1; i--) {
                mul *= i;
            }
            return mul;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}