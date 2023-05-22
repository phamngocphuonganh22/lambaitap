public class rectangle {
    double chieudai, chieurong;

    public rectangle() {
    }

    public rectangle(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getArea() {
        return this.chieudai * this.chieurong;
    }

    public double getPerimeter() {
        return (this.chieudai + this.chieurong) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + chieudai + ", height=" + chieurong + "}";
    }
}
