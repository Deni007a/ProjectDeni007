package OOP.Them7.Laba7_10;

/**
 * Created by Den on 16.02.2017.
 */
public class Circle extends  Share {
    private  double radius;

    public  double calcArea(){
        double area= Math.PI*(radius*radius);
        return area;
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;

    }
    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius=" + radius+" shapeColor=" + getShapeColor();

    }
}
