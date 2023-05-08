import java.util.Scanner;

public class khaibaovakhoitao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        //khoi tao mang
        int[] arr = new int[n];
        System.out.println("nhap cac phan tu cua mang: ");
        for ( int i = 0; i<n; i++){
            System.out.println("a[%d]= " + i);
            arr [i] = scanner.nextInt();
        }
        System.out.println("cac phan cua mang: ");
    }
}
