package OOP.Them15.Laba2;

import java.util.LinkedList;

/**
 * Created by Den on 11.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new  LinkedList<>();

        for (int i = 0; i <10 ; i++) {
           int zz=0+(int)+(Math.random()*linkedList.size());
            System.out.println("zz = " +zz);
            //linkedList.add();
           linkedList.add(zz, "name"+i);

        }
/*
        for (String inter: linkedList) {
            System.out.println(inter);
        }
        */
        System.out.println(linkedList);

    }
}
