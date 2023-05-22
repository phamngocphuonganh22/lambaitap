public class hinhtron {
    double radius;
    String color;

    public hinhtron(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
