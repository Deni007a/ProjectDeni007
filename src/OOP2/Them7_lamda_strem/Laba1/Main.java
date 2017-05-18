package OOP2.Them7_lamda_strem.Laba1;

import java.util.*;

/**
 * Created by Den on 18.04.2017.
 */
public class Main {



    public static void main(String[] args) {
        System.out.println("laba7_1");

        Integer [] arrInt= new Integer[50];
        Random random = new Random();
        for (int i = 0; i <arrInt.length ; i++) {
            arrInt[i]=random.nextInt(8)+1;

        }



//        Arrays.sort(arrInt,
//                (Integer x, Integer y) -> Integer.compare(x,y)
//
//        );

        Arrays.sort(arrInt,
                (Integer x, Integer y) -> {
            if (x>y) return -1;
            else  if (x<y) return 1;
            else return 0;
                }

        );

        List<String> list= Arrays.asList("Lola", "Liza", "Ana","Zorymba");

            // 1 вариант
        //list.sort(String::compareTo);

                    // 2  в обратном порядке без лямб
       // Collections.sort(list,Collections.reverseOrder());
                    // вариант 3
        Collections.sort(list, (s1,s2) -> s2.compareTo(s1)


        );






                    //2 варинат по длине
      //  Collections.sort(list, (s1,s2) ->s1.length()-s2.length() );




                // System.out.println(arrInt.toString());
        for (Integer i: arrInt) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(list.toString());

    }
}
