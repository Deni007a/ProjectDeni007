package OOP.Them11.Laba3;

/**
 * Created by Den on 01.03.2017.
 */
public class Main {

    public static void main(String[] args) {

      //  Person  person1 = new Person("Ivan","Ivanow", 30);
        System.out.println("****");
        try {
           /* Person  person1 = new Person();
            person1.ageErr(-1);
            */
            Person  person1 = new Person("Ivan","Ivanow", -10);
          // person1.ageErr(person1);

        }
        catch (InvalidAgeException in) {
            //
            //

            System.out.println("Error code:" + in.getErrorCode());
            System.out.println("Error message:" + in.getMessage());
        }


    }
}
