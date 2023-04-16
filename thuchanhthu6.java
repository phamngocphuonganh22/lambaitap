import java.util.Scanner;

public class thuchanhthu6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chieucao,cannang,bmi;
        System.out.print("chieu cao cua ban :");
        chieucao = scanner.nextDouble();

        System.out.print("can nang cua ban :");
        cannang = scanner.nextDouble();
        bmi = cannang / Math.pow(chieucao, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "thieu can");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "binh thuong ");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "thua can");
        else
            System.out.printf("%-20.2f%s", bmi, "beo phi");
    }
}
