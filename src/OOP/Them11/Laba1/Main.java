package OOP.Them11.Laba1;

/**
 * Created by Den on 01.03.2017.
 */
public class Main {

    public static void main(String[] args) {

       try {
           int x = 5;
           int y = 0;
           int z = 0;
           z= x/y;
           System.out.println("это не печатает1");
       }
       catch ( Exception ex) {
           System.out.println( "деление на ноль");
           System.out.println(ex);
       }
           finally {
           System.out.println(" program happily completed");
       }
        System.out.println("это  печатает");
    }
}
