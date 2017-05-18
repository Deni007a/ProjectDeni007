package OOP2.Them7_lamda_strem.Laba5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by Den on 20.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Laba 5");

        LocalDate this_localDate =  LocalDate.now();
        System.out.println(this_localDate);

        LocalDate my_localDate = LocalDate.of(1989,04,11);

        int old =this_localDate.getYear()-my_localDate.getYear();
        System.out.println("возраст "+old);
        System.out.println("родился в день недели "+my_localDate.getDayOfWeek());
        LocalDate birthday=my_localDate.plusYears(old);
        System.out.println("birthday "+birthday);
        System.out.println("была днюха? "+this_localDate.isAfter(birthday));
        System.out.println(" день рождения в этом году  в "+birthday.getDayOfWeek());
        ZoneId  paris = ZoneId.of("Europe/Paris");
        ZoneId  kiev = ZoneId.of("Europe/Kiev");

        LocalDateTime localDateTime=LocalDateTime.now();

        ZonedDateTime kiev_d =ZonedDateTime.of(localDateTime,kiev);
        ZonedDateTime paris_d =ZonedDateTime.of(localDateTime,paris);
        System.out.println(kiev_d);
        System.out.println(paris_d);

    }
}
