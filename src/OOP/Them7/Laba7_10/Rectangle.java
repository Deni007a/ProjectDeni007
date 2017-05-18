package OOP.Them7.Laba7_10;

/**
 * Created by Den on 16.02.2017.
 */
public class Rectangle extends  Share{

   private double width, height;

    public  double calcArea() {
        double area = width * height;
        return area;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle() {

    }


    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Rectangle: " +
                "width=" + width +
                ", height=" + height+ " shapeColor=" + getShapeColor();
    }
}
