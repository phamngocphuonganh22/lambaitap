import java.util.Scanner;

public class baithuchanhthu4 {
    public static void main(String[] args) {
        double diemKiemTraHK1, diemKiemTraHK2, diemThi, diemTrungBinh;
        String ketQuaXepLoai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào điểm kiểm tra 1:");
        diemKiemTraHK1 = scanner.nextDouble();
        System.out.println("Nhập vào điểm kiểm tra 2: ");
        diemKiemTraHK2 = scanner.nextDouble();
        System.out.println("Nhập vào điểm thi cuối kỳ: ");
        diemThi = scanner.nextDouble();
        if ((diemKiemTraHK1 < 0 || diemKiemTraHK1 > 10)
                || (diemKiemTraHK2 < 0 || diemKiemTraHK2 > 10) || (diemThi < 0 || diemThi > 10)) {
            System.out.println("Nhập điểm không hợp lệ.");
        } else {
            diemTrungBinh = (((diemKiemTraHK1 + diemKiemTraHK2 * 2.0) / 3) + (diemThi * 0.6));
            if (diemTrungBinh >= 8.5) {
                ketQuaXepLoai = "Loại A";
            } else if ((diemTrungBinh >= 7) && (diemTrungBinh < 8.5)) {
                ketQuaXepLoai = "Loại B";
            } else if ((diemTrungBinh >= 5.5) && (diemTrungBinh < 7)) {
                ketQuaXepLoai = "Loại C";
            } else if ((diemTrungBinh > 4) && (diemTrungBinh < 5.5)) {
                ketQuaXepLoai = "Loại D";
            } else {
                ketQuaXepLoai = "Loại F";
            }
            System.out.println("Kết quả xếp loại môn học của sinh viên là: " + ketQuaXepLoai);
        }
    }
}
