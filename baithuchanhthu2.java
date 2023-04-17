import java.util.Scanner;

public class baithuchanhthu2 {
    public static void main(String[] args) {
        int num1,num2; //khai bao 2 bien
        Scanner scanner = new Scanner(System.in); // khai in ra man hinh
        System.out.println("nhap so thu 1: ");
        num1 = scanner.nextInt(); //gan gia tri cho bien thu 1
        System.out.println("nhap so thu 2: ");
        num2 = scanner.nextInt(); //gan gia tri cho bien thu 2
        System.out.print("Chọn phép tính (+, -, *, %): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double output;
        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '%':
                output = num1 % num2;
                break;
            default:
                System.out.print("Bạn đã chọn sai phép tính");
                return;
        }
        System.out.println("Kết quả của số thứ nhất và số thứ hai là: ");
        System.out.println(num1 +" "+operator +" "+ num2 +" = "+ output);
    }
}
