package OOP.Them13.Laba2;

import java.util.Arrays;

/**
 * Created by Den on 02.03.2017.
 *    SUNDAY ,
 MONDAY,
 TUESDAY,
 WEDNESDAY,
 THURSDAY,
 FRIDAY,
 SATURDAY
 *
 *
 */
public class Main {



    public static void main(String[] args) {
        System.out.println(Arrays.toString(MyDayOfWeek.values()));


        for (MyDayOfWeek ss: MyDayOfWeek.values()) {
            System.out.println(ss);

            switch (ss){
                case SUNDAY :
                    System.out.println();
                    break;
                case MONDAY:
                    System.out.println();
                    break;
                case TUESDAY:
                    System.out.println();
                    break;
                case WEDNESDAY:
                    System.out.println();
                    break;
                case THURSDAY:System.out.println();
                    break;
                case FRIDAY:  System.out.println();
                    break;
                case SATURDAY:System.out.println();
                    break;

                default:
                        break;
            }


        }
    }
}
