package OOP.Them8.Laba2;

/**
 * Created by Den on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {

 Triangle a = new Triangle("fff",2,2,2);
        a.draw();
        Share[] arrShare = new Share[9];
        arrShare[0]= new Rectangle("red",1,5);
        arrShare[1]= new Rectangle("red",1,5);
        arrShare[2]= new Rectangle("red",1,5);
        arrShare[3]= new Rectangle("red",1,5);
        arrShare[4]= new Rectangle("red",1,5);
        arrShare[5]= new Circle("gray",1);
        arrShare[6]= new Circle("gray",1);
        arrShare[7]= new Triangle("pink",1,2,2);
        arrShare[8]= new Triangle("pink",1,2,2);
        System.out.printf("");

        for (Share s: arrShare) {
            s.draw();

        }



    }
}
