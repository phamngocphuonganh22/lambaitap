import java.util.Scanner;

public class thuchanhthu42 {
    public static void main(String[] args) {
        //tao bien CD,CR
        float width;
        float height;
        //khai bao doi tuong Sc de co the nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);
        //in chiều rộng
        System.out.println("nhap width: ");
        // nhap chiều rộng và gắn giá trị vừa nhập cho biến width
        width = scanner.nextFloat();
        //in chiều dài
        System.out.println("Enter height: ");
        // nhập chiều dài gắn giá trị vừa nhập cho biến height
        height = scanner.nextFloat();
        //tinh S HCN
        float dientich = width * height;

        System.out.println("S HCN : " + dientich);
    }
}
