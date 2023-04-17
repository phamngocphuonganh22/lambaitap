import java.util.Scanner;

public class baithuchanhthu21 {
    public static void main(String[] args) {
        double  VND = 23000;
        double USD ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap so $ USD :");
        USD = scanner.nextDouble();
        double quydoi = USD * 23000;
        System.out.println("gia $ USD"+ quydoi);
    }
}
