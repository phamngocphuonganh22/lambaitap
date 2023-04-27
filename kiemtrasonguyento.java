import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so:");
        int so = scanner.nextInt();
        if(so <2){
            System.out.println("khong phai so nguyen to"+ so);
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(so)) {
                if (so % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(" so nguyen to "+ so);
            else
                System.out.println( " khong phai so nguyen to " + so);
        }
    }
}
