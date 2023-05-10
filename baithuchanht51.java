import java.util.Scanner;

public class baithuchanht51 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap mot kich thuoc :");
            size = scanner.nextInt();
            if (size > 22)
                System.out.println("kich thuoc khong vuot qua 22");
        } while (size > 22);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhap phan tu: " + (i + 1));
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
