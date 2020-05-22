import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "triangle":
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                double c = Double.parseDouble(scanner.nextLine());
                double p = (a + b + c) / 2.0;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                System.out.println(area);
                break;

            case "rectangle":
                double a1 = Double.parseDouble(scanner.nextLine());
                double b1 = Double.parseDouble(scanner.nextLine());
                double area1 = a1 * b1;
                System.out.println(area1);
                break;

            case "circle":
                double r = Double.parseDouble(scanner.nextLine());
                double area2 = 3.14 * r * r;
                System.out.println(area2);
                break;
        }
    }
}
