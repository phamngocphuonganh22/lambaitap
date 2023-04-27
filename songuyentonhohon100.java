import java.util.Scanner;

public class songuyentonhohon100 {
    public static void main(String[] args) {
        System.out.println("tat ca so nguyen to nho hon 100 la: ");
        for (int i = 0; i < 100; i++) {
            if (check(i)) {
                System.out.println("" + i);
            }
        }
    }
    public static boolean check(int num) { //goi ham su dung de kiem tra so nguye nto gom 100 phan tu
        if(num<2) { //neu gia tri phan tu nho hon 2 thi bo qua
            return false;
        }
        for (int i = 2 ; i < Math.sqrt(num);i++){ //dung vong lap de tien hanh in so nguyen to
            if(num% i == 0){
                return false ;
            }
        }
        return true; //neu khong thi ket qua tra ve la so nguyen to 
    }
}