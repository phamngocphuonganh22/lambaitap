import java.util.Scanner;

public class ungdungtienlaichovay {
    public static void main(String[] args) {
        double tien = 1.0;
        int thanggui = 1;
        double tilelaixuat = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tien gui: ");
        tien = input.nextDouble();
        System.out.println("nhap so thang gui: ");
        thanggui = input.nextInt();
        System.out.println("nhap lai xuat hang thang: ");
        tilelaixuat = input.nextDouble();
        double tongtienlai = 0;
        for(int i = 0; i < thanggui; i++){
            tongtienlai = tien * (tilelaixuat/100)/ 12 * thanggui;
            System.out.println("tong so tien lai la: "+ tongtienlai);
        }
    }
}
