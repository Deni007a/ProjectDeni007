package OOP.Them11.Laba4;

/*
/**
 * Created by Den on 16.02.2017.
 */
public class Circle extends Share implements Drawable {

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
    @Override
    public void draw()  {
        System.out.println(toString());
        System.out.println("    Площадь фигуры= "+calcArea());

    }



    public static Circle parseCircle (String[]arrOfArgs){
        return new Circle(arrOfArgs[1],Double.parseDouble(arrOfArgs[2]));
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " radius=" + radius+" shapeColor=" + getShapeColor();

    }

}
