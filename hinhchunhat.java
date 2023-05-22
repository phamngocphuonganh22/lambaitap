import java.awt.*;
import java.util.Scanner;

public class hinhchunhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        double chieudai = scanner.nextDouble();
        System.out.println("nhap chieu rong: ");
        double chieurong = scanner.nextDouble();
        rectangle rectangle = new rectangle(chieudai, chieurong);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}

