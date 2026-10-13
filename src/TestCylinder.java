
public class TestCylinder {

    public static void main(String[] args) {

        cylinder c1 = new cylinder();

        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " surface area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        cylinder c2 = new cylinder(5.0);

        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " surface area=" + c2.getArea()
                + " volume=" + c2.getVolume());

        cylinder c3 = new cylinder(5.0, 10.0);

        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " surface area=" + c3.getArea()
                + " volume=" + c3.getVolume());

        circle circle = new circle(5.0);
        cylinder cylinder = new cylinder(5.0, 10.0);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Cylinder surface area: " + cylinder.getArea());


        System.out.println(cylinder.toString());

    }

}

