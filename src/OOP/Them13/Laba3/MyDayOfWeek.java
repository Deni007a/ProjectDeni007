package OOP.Them13.Laba3;

/**
 * Created by Den on 09.03.2017.
 */
public class MyDayOfWeek {
   /*  enum EnymMy {
        SUNDAY ,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY

    }
    */
    EnymMy nextDay(EnymMy emmy){
        EnymMy[] enymMies = EnymMy.values();
        int zzz=emmy.ordinal();
        if (emmy.ordinal()==enymMies.length-1) return enymMies[0];
        else  return enymMies[zzz+1];


    }


}
