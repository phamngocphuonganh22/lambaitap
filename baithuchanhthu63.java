import java.util.Scanner;

public class baithuchanhthu63 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        n = scanner.nextInt();
        if(n%2 == 0){
            System.out.println("so chan");
        }else {
            System.out.println("so le ");
        }
    }
}
