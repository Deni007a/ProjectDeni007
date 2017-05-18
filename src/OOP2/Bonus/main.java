package OOP2.Bonus;

import java.util.ArrayList;

/**
 * Created by den on 06.04.17.
 */
public class main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();

       linkedList.add( "z");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d3");
        linkedList.add("d3");
        linkedList.add("e");



        System.out.println("размер "+linkedList.size());
        System.out.println("Empty "+linkedList.isEmpty());
        System.out.println("есть ли указаный елемент "+linkedList.contains("d"));



         Object[] sss=  linkedList.toArray();
        System.out.println(sss.length);
        System.out.println("до "+linkedList.size());
        //linkedList.remove("f");
        System.out.println("после "+linkedList.size());





        ArrayList<String> tt = new ArrayList<>();
       // tt.add("s");
        //tt.add("d");
        tt.add("zzz");
        //tt.add("d");
        tt.add("fff");
        //System.out.println("*"+tt.size());
       // System.out.println(tt.remove("ss"));
        //System.out.println(tt.size());
     //System.out.println("**"+linkedList.containsAll(tt));
       // System.out.println("addALL "+linkedList.addAll(2,tt));
        //System.out.println("removeALL "+linkedList.removeAll(tt));
        //System.out.println("remove int  "+linkedList.remove(2));
        //System.out.println("indexOF  "+linkedList.indexOf("d3"));
        //System.out.println("Last_indexOF  "+linkedList.lastIndexOf("d3"));



        //linkedList.add(3,"**");
/*
            //  проверка toArray(T1[] a)
        String[]zz= new String[3];
        zz=linkedList.toArray(zz);
        for (int i = 0; i <zz.length ; i++) {
            System.out.print(" "+zz[i]);
        }
        System.out.println("**********************************");
*/

/*
/////////////////subList
LinkedList<String> xx = (LinkedList<String>) linkedList.subList(1,2);

        for (int i = 0; i <xx.size() ; i++) {
            System.out.print(" ***"+xx.get(i));
        }
*/

        for (int i = 0; i <linkedList.size() ; i++) {
            System.out.print(" "+linkedList.get(i));
        }




    }


}
