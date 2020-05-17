import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int num = Integer.parseInt(scanner.nextLine().trim());
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}