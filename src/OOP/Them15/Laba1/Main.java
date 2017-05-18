package OOP.Them15.Laba1;

import java.util.ArrayList;

/**
 * Created by Den on 11.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            arrayList.add(i, "name" + i);

        }
        for (String inernator: arrayList) {
            System.out.println(inernator);

        }
    }
}
