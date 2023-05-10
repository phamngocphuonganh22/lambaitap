import java.util.Arrays;

public class daonguocmang {
    public static void main(String[] args) {

        int[] src = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(src));

        /*Đảo ngược mảng trong Java bằng vòng lặp*/
        for (int i = 0, j = src.length - 1; i < j; i++, j--){
            /*Tạo biến temp và tiến hành hoán đổi phần tử*/
            int temp = src[i];
            src[i]  = src[j];
            src[j] = temp;
        }

        System.out.println(Arrays.toString(src));
    }
}