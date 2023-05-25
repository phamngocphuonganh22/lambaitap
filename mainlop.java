public class mainlop {
    public static void main(String[] args) {
        xaylophocsinh hocsinh = new xaylophocsinh();

        hocsinh.setMahocsinh("HSOOOO1"); //GAN GIA TRI CHO CHUOI LA PHAI CO DAU KEP
        hocsinh.setTenhocsinh("PHAM DUC THANG");
        hocsinh.setTuoi(44);

        System.out.println("ma hoc sinh l1: "+ hocsinh.getMahocsinh());
        System.out.println("ten hoc sinh l1: "+ hocsinh.getTenhocsinh());
        System.out.println("tuoi hoc sinh l1: "+ hocsinh.getTuoi());
        System.out.println("gioi tinh hoc sinh l1: "+ hocsinh.isGioitinh());


        xaylophocsinh hocsinh2 = new xaylophocsinh();
        hocsinh2.setTenhocsinh("DOAN THI TUYET");
        hocsinh2.setGioitinh(false);
        System.out.println("ma hoc sinh l2: "+ hocsinh2.getMahocsinh());
        System.out.println("ten hoc sinh l2: "+ hocsinh2.getTenhocsinh());
        System.out.println("tuoi hoc sinh l2: "+ hocsinh2.getTuoi());
        System.out.println("gioi tinh hoc sinh l2: "+hocsinh2.isGioitinh());
    }
}
