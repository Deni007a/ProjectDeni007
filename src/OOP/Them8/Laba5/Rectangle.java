package OOP.Them8.Laba5;


/**
 * Created by Den on 16.02.2017.
 */
public class Rectangle extends Share implements  Drawable {

   private double width, height;

    public  double calcArea() {
        double area = width * height;
        return area;
    }



    @Override
    public void draw() {
        System.out.println(toString());
        System.out.println("    Площадь фигуры= "+calcArea());

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

        return this.getClass().getSimpleName() +
                " width=" + width +
                ", height=" + height+" "+super.toString()+" " ;
    }
/*
   @Override
    public int compareTo(Object o) {
        Rectangle res =(Rectangle)o;

        return this.getShapeColor().compareTo(((Rectangle) o).getShapeColor());

    }
    */

}
