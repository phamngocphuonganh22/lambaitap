public class giatrinhonhat {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};   //khai bao mang
        //khai bao mang min cho phan tu dau tien cua mang
        int min  = array[0];
        //dung vong lap for neu int i = 1
        // i be hon array.length
        //i++
        for (int i = 1; i < array.length; i++){
            //dung if de so sanh gia tri array voi bien min
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(" gia tri nho nhat trong mang: " + min);
    }
}
