package OOP.Them8.Laba5;



import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Den on 16.02.2017.
 */
public class Main  {
    public static void main(String[] args) {
        String[] color = {"Red", "Grin", "Blac", "Pink", "Blye"}; // масив цветов
        int[] intShare = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // масив сторон
       // Share [] obShare = { new Circle(),new Rectangle(),new Triangle()};

Comparator<Share> comparator = new Comparator<Share>() {
    @Override
    public int compare(Share o1, Share o2) {

        if (o1.calcArea()>o2.calcArea()) return  1;
        if (o1.calcArea()<o2.calcArea()) return -1;
        return o1.getShapeColor().compareTo(o2.getShapeColor());

    }
};

        Share[] arrShare = new Share[5];
        for (int i = 0; i <arrShare.length ; i++) {

            int randomShare = 0+(int)(Math.random()*3);
            int ran = 0+(int)(Math.random()*5);  // рандом цветов
            int intran1= 0+(int)(Math.random()*9); // рандом старон1
            int intran2= 0+(int)(Math.random()*9); // рандом сторон2

            Share [] obShare = {
                    new Circle(color[ran],intShare[intran1]),
                    new Rectangle(color[ran],intShare[intran1],intShare[intran2]),
                    new Triangle(color[ran],intShare[intran1],intShare[intran2],intShare[intran2])};

            arrShare[i] =   obShare[randomShare];
        }
        Arrays.sort(arrShare ,comparator);
        for (Share s:arrShare) {

            s.draw();

        }


    }
}
