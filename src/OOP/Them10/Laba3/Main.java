package OOP.Them10.Laba3;


import java.util.Arrays;

/**
 * Created by Den on 16.02.2017.
 */
public class Main  {
    public static void main(String[] args) {

        //Share shape = Share.parseShare("Circle Blyu 1.0");
        Share shape = Share.parseShare("Triangle GREEN 9 7 12" );
         if (shape instanceof  Circle){
            Circle shapeCircle = (Circle)  shape;
            System.out.println(shapeCircle);
        }
        if (shape instanceof  Rectangle){
            Rectangle shapeRectagle = (Rectangle)  shape;
            System.out.println(shapeRectagle);
        }
        if (shape instanceof  Triangle){
            Triangle shapeTriangle = (Triangle)  shape;
            System.out.println(shapeTriangle);
        }




        //System.out.println(Circle.toString());
/*
        Share[] arrShare = new Share[6];
       arrShare[0]= new Rectangle("gren",5,6);
       arrShare[1]= new Rectangle("gren",10,9);
       arrShare[2]= new Rectangle("gren",5,9);
       arrShare[3]= new Rectangle("gren",12,9);
       arrShare[4]= new Rectangle("gren",5,20);
       arrShare[5]= new Rectangle("gren",5,9);

        Arrays.sort(arrShare);
        for (Share s:arrShare) {

            s.draw();

        }
        */




    }
}
