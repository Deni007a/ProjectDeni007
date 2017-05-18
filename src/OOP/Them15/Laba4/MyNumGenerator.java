package OOP.Them15.Laba4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Den on 11.03.2017.
 */
public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    static List<Integer> generate(int numOfElm, int maxNumb) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numOfElm; i++) {
            list.add(random.nextInt(maxNumb));

        }
return list;
    }


    public static void main(String[] args) {
 System.out.println(generate(5,10));

    }
}
