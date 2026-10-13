
public class circle {

    private double radius;
    private String color;

    public circle() {
        radius = 1.0;
        color = "red";
    }

    public circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: radius=" + radius
                + ", color=" + color;
    }
}

