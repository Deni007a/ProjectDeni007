package OOP.Them15.Laba3;

import java.util.*;

/**
 * Created by Den on 11.03.2017.
 */
public class Main {
    static  void printElements(List<?> list)
    {
        Iterator<?> iterator = list.iterator();//получение итератора для списка

        while (iterator.hasNext())      //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            iterator.next();

            System.out.println("Интернатор  "+iterator.next());
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedListlist = new LinkedList<String>();

        ListIterator<String> listIterator = null;
        Iterator<String> inter = arrayList.iterator();
        for (int i = 0; i <10 ; i++) {
            arrayList.add(i, "name" + i);
            inter=arrayList.listIterator();

        }
        System.out.println(arrayList);


        for (int i = 0; i <10 ; i++) {
            linkedListlist.add(inter.next());

        }

        System.out.println(linkedListlist);

        listIterator= linkedListlist.listIterator(linkedListlist.size());
        LinkedList<String>linkedList2= new LinkedList<>();

        for (int i = 0; i <linkedListlist.size() ; i++) {
            linkedList2.add(listIterator.previous());
        }

            System.out.println(linkedList2);

        printElements(arrayList);




    }
}
