package OOP.Them8.Laba2;

import static java.lang.Math.sqrt;

/**
 * Created by Den on 16.02.2017.
 */
public class Triangle extends Share  {

    private  double a,b,c;

    public  double calcArea()
    {
        double s= (a+b+c)/2;
        double aa;
        aa= sqrt( s*((s-a)*(s-b)*(s-c))   );

        return aa;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle() {

    }
    @Override
    public void draw() {
        System.out.println(this.toString());
        System.out.println("площадь фигуры= "+calcArea());

    }
    @Override
    public String toString() {
        return " Triangle: " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c
                +" shapeColor=" + getShapeColor();
    }
}
