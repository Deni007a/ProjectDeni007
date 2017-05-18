package OOP.Them6.Laba6.Triangle;
import static java.lang.Math.*;


/**
 * Created by Den on 09.02.2017.
 */
public class Triangle {

    double a, b, c;
    {
        a=1;
        b=1;
        c=1;
    }




    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
   public double getArea()
    {
        double s= (a+b+c)/2;
        double aa;
        aa= sqrt( s*((s-a)*(s-b)*(s-c))   );


        return aa;
    }
}
