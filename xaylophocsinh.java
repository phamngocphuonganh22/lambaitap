public class xaylophocsinh {
    String mahocsinh = "HS0000" ;
    String tenhocsinh = "CHUA CO TEN ";
    int tuoi = 0;
    boolean gioitinh = true;

    public xaylophocsinh() {

    }

    public xaylophocsinh(String mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    public xaylophocsinh(String mahocsinh, String tenhocsinh) {
        this.mahocsinh = mahocsinh;
        this.tenhocsinh = tenhocsinh;
    }
    public xaylophocsinh( String mahocsinh ,String tenhocsinh, int tuoi, boolean gioitinh) {
        this.mahocsinh = mahocsinh;
        this.tenhocsinh = tenhocsinh;
        this.tuoi = tuoi ;
        this.gioitinh = gioitinh;
    }

    public String getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(String mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    public String getTenhocsinh() {
        return tenhocsinh;
    }

    public void setTenhocsinh(String tenhocsinh) {
        this.tenhocsinh = tenhocsinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String isGioitinh() { //gioi tinh mac dinh la true
        if (gioitinh) { //phuong thuc
            return "boy";
        }
        return "girl";
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
}