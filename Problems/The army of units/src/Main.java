import java.util.Scanner;

class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        String answer;
        if (units < 1) {
            answer = "no army";
        } else if (units < 20) {
            answer = "pack";
        } else if (units < 250) {
            answer = "throng";
        } else if (units < 1000) {
            answer = "zounds";
        } else {
            answer = "legion";
        }
        System.out.println(answer);
    }
}
