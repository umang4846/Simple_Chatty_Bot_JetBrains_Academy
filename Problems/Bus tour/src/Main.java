import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfBus = scanner.nextInt();
        int noOfBridges = scanner.nextInt();
        while (scanner.hasNext()) {
            int bridgeHeight = scanner.nextInt();
            --noOfBridges;
            if (heightOfBus >= bridgeHeight) {
                System.out.println("Will crash on bridge " + (noOfBridges - 1));
                break;

            } else {
                if (noOfBridges == 0) {
                    System.out.println("Will not crash");
                    break;
                }
            }

        }
    }

}
