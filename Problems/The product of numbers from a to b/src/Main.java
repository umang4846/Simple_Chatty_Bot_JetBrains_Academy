// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next().trim());
        int b = Integer.parseInt(scanner.next().trim());
        long productOfNums = 1;
        for (int i = a; i < b; i++) {
            productOfNums = productOfNums * i;
        }
        System.out.println(productOfNums);

    }
}