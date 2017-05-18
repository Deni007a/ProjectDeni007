package OOP2.Them7_lamda_strem.Laba4;

import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.iterate;

/**
 * Created by Den on 19.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Laba4");

        Comparator<Integer> compar =(Integer x, Integer y) -> {
            if (x>y) return -1;
            else  if (x<y) return 1;
            else return 0;

        };

        int[] zzz;
        zzz = IntStream.iterate(10, n -> n + 5)
                .limit(10)
                .skip(2)
                //.forEach(System.out::println);
                .filter(n->(n%2==0))
                .sorted() // КАК!!!!!
                .toArray();

        System.out.println(Arrays.toString(zzz));


        List<Person> personList =new ArrayList<>();
        personList.add(new Person("Vika", Person.Sex.FEMALE,20));
        personList.add(new Person("Zina", Person.Sex.FEMALE,25));
        personList.add(new Person("Nina", Person.Sex.FEMALE,28));
        personList.add(new Person("Vova", Person.Sex.MALE,30));
        personList.add(new Person("Gera", Person.Sex.MALE,26));
        personList.add(new Person("Vasa", Person.Sex.MALE,45));


       personList.stream()
               // выборка MAlE и возраст  больше 27 но меньше 35
                .filter(e -> e.getGender() == Person.Sex.MALE && (e.getAge()>20 & e.getAge()<35  ))
                .forEach(e -> System.out.println(e));

        double asDouble = personList.stream()
                .filter(e -> e.getGender() == Person.Sex.FEMALE)
                //.map(e->(e.getAge()*e.getAge())
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();


        System.out.println("средний возраст женщин "+ (double)Math.round(asDouble*100)/100);







    }


}
