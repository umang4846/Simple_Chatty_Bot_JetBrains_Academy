//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.next();
        scanner.nextInt();
        scanner.next();
        scanner.nextInt();
        String cuisinePreference  = scanner.next();

        System.out.println("The form for " + name + " is completed. " +
        "We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");

    }
}
