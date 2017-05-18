package OOP.Them8.Laba4;


import java.util.Arrays;

/**
 * Created by Den on 16.02.2017.
 */
public class Main  {
    public static void main(String[] args) {

        Share [] arrShare = new Share[6];
       arrShare[0]= new OOP.Them8.Laba4.Rectangle("gren",5,6);
       arrShare[1]= new OOP.Them8.Laba4.Rectangle("gren",10,9);
       arrShare[2]= new OOP.Them8.Laba4.Rectangle("gren",5,9);
       arrShare[3]= new OOP.Them8.Laba4.Rectangle("gren",12,9);
       arrShare[4]= new OOP.Them8.Laba4.Rectangle("gren",5,20);
       arrShare[5]= new OOP.Them8.Laba4.Rectangle("gren",5,9);

        Arrays.sort(arrShare);
        for (Share s:arrShare) {

            s.draw();

        }
       // System.out.println(rect1.compareTo(rect2));

    }
}
