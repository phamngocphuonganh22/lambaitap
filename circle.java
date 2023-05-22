import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ban kinh: ");
        double radius = scanner.nextDouble();
        System.out.println("nhap mau: ");
        String color = scanner.nextLine();
        hinhtron hinhtron = new hinhtron(radius);
        System.out.println("Area of the circle: " + hinhtron.getArea());
    }
}
