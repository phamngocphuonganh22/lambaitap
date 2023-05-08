import java.util.Scanner;

public class baithuchanht5 {
    public static void main(String[] args) {
        String [] hocsinh = {"ha","van","huy","hung","dung","van anh","son"}; //khai bao mang
        Scanner scanner = new Scanner(System.in); //khai in ra man hinh
        System.out.print("nhap ten cua 1 hsinh: ");
        String input_name = scanner.nextLine(); //gan gia tri cho bien
        boolean isExist = false; //goi bien
        for (int i = 0; i < hocsinh.length; i++) { //fung vong lap for
            if (hocsinh[i].equals(input_name)) {
                System.out.println("vi tri cua hoc sinh trong danh sach: " + input_name + " la: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("khong co " + input_name + " trong danh sach.");
        }
    }
}