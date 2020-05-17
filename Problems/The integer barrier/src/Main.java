import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int num = Integer.parseInt(scanner.nextLine().trim());
            if (num == 0) {
                System.out.println(sum);
                break;
            }
            sum += num;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }


        }
    }
}