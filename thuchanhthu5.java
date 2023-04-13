import java.util.Scanner;

public class thuchanhthu5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("a ; ");
        a = scanner.nextDouble();
        System.out.println("b ; ");
        b = scanner.nextDouble();
        System.out.println("c ; ");
        c = scanner.nextDouble();
        if(a != 0){
            double giaiphuongtrinh = (c-b)/ a ;
            System.out.println("phuong trinh x =" + giaiphuongtrinh);
        } else {
            if (b == c) {
                System.out.println("giairax");
            }else {
                System.out.println("vonghiem");
            }
        }
    }
}
