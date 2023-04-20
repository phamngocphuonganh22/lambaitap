import java.util.Scanner;

public class baithuchanhthu5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam;
        System.out.println("nhap nam :");
        nam = scanner.nextInt();
        boolean namnhuan = false;
        boolean chiahetcho4 = nam % 4 == 0;
        if (chiahetcho4) {
            boolean chiahetcho100 = nam % 100 == 0;
            if (chiahetcho100) {
                boolean chiahetcho400 = nam % 400 == 0;
                if (chiahetcho400) {
                    namnhuan = true;
                }
            } else {
                namnhuan = true;
            }
        }
        if(namnhuan){
            System.out.println("la nam nhuan"+nam);
        } else {
            System.out.println("khong phai la nam nhuan"+ nam);
        }
    }
}