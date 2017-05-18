package OOP.Them4.Laba3;

/**
 * Created by Den on 04.02.2017.
 */
public class MyMath {
    final static  double PI =3.14;


    static double  areaOfCircle (double radiys)
    {
         double areaCircle= PI* (radiys*2);

        return areaCircle;
    }



    public static void main(String[] args) {
        double radiys= 15.5;

        System.out.println(" площадь  круга равна "+ areaOfCircle(radiys));
    }

}
