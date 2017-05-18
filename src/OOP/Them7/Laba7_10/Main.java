package OOP.Them7.Laba7_10;

/**
 * Created by Den on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        Share [] arrShare = new Share[9];
        arrShare[0]= new Rectangle("red",1,5);
        arrShare[1]= new Rectangle("red",1,5);
        arrShare[2]= new Rectangle("red",1,5);
        arrShare[3]= new Rectangle("red",1,5);
        arrShare[4]= new Rectangle("red",1,5);
        arrShare[5]= new Circle("gray",1);
        arrShare[6]= new Circle("gray",1);
        arrShare[7]= new Triangle("pink",1,2,2);
        arrShare[8]= new Triangle("pink",1,2,2);

        double   sumRestangle=0;
        double   sumCircle=0;
        double sumTriangle=0;
        double allShare =0;
        for (int i = 0; i <arrShare.length; i++) {

            System.out.println(arrShare[i]);
            System.out.println("Площадь фигуры= "+arrShare[i].calcArea());
           if (arrShare[i] instanceof Rectangle)
           { sumRestangle += arrShare[i].calcArea();  }
           if (arrShare[i] instanceof Circle)
            { sumCircle += arrShare[i].calcArea();  }
            if (arrShare[i] instanceof Triangle)
            { sumTriangle += arrShare[i].calcArea();  }

            allShare +=arrShare[i].calcArea();


        }
        System.out.println("Area all Rectangle "+ sumRestangle);
        System.out.println("Area all Circle "+sumCircle);
        System.out.println("Area all Triangle "+sumTriangle);
        System.out.println("Area all Share "+allShare);





    }
}
