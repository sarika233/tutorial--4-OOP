
public class cylinder extends circle {

    private double height;

    // Default constructor
    public cylinder() {
        super();
        height = 1.0;
    }

    // Constructor with height
    public cylinder(double height) {
        super();
        this.height = height;
    }

    // Constructor with radius and height
    public cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Get height
    public double getHeight() {
        return height;
    }

    // Calculate volume
    public double getVolume() {
        return super.getArea() * height;
    }


    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height
                + 2 * super.getArea();
    }


    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }

}

