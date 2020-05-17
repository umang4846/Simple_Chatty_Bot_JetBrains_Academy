import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        boolean isAscending = false;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println(isAscending);
                break;

            }
            if (min < num && num >= max) {
                min = max;
                max = num;
                isAscending = true;
            } else if (min > num && num <= max) {
                System.out.println(false);
                break;
            }

        }

    }
}