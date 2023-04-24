import java.util.Scanner;

public class kiemtrachanle {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n ;
        System.out.println("nhap so: ");
        n = scanner.nextInt();
        for(int i =1; i<= n; i++){
            if(i %2 ==0){
                System.out.println("so le: " + i);
            }else {
                System.out.println("so chan: " + i);
            }
        }
    }
}