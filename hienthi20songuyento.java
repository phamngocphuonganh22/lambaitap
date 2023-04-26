public class hienthi20songuyento {
    public static void main(String[] args) {
        int n ;
        int count = 0 ;
        int num = 2;
        System.out.println("20 số nguyên tố đầu tiên là:");
        System.out.println(2);
        for (int i = 2; i <= 20; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    count = 0;
                    break;
                }
            }
            if (count != 0) {
                System.out.println(num);
               i++;
               // count++;
            }
            count = 1;
            num++;
        }
    }
}
