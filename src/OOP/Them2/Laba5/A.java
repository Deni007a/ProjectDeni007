package OOP.Them2.Laba5;

/**
 * Created by Den on 02.02.2017.
 */
class A {

    int calcSquare ( int leGth)
    {
        int area= leGth*leGth;
        System.out.println("площадь кравдрата  равна " +area);
        return  area;
    }
    int calcSquare ( int leGth, int wiDth)
    {
        int area= leGth * wiDth;
        System.out.println("площадь прямоугольника  равна " + area);
        return  area;
    }
    double calcSquare ( double radius)
    {
        double area=3.14 *(radius*radius);
        System.out.println("площадь rкруга  равна " + area);
        return area;
    }




    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        b.squareArea(a.calcSquare(4));




    }

}
