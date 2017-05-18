package OOP.Them11.Laba3;

/**
 * Created by Den on 01.03.2017.
 */
public class Person {
    private String firstName ;
    private String lastName ;
    private int age ;


    public Person(String firstName, String lastName, int age) {
        ageErr(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person() {

    }




    public  String  ageErr (int age) throws InvalidAgeException {


        if (age <= 0 || age> 120) {
            throw new InvalidAgeException(23, " неправильный возраст");

        }
        return "неправильное" + getAge() ;
    }
    public  String  ageErr (Person ppp) throws InvalidAgeException {


        if (ppp.getAge() <= 0 || age> 120 ) {
            throw new InvalidAgeException(36, " неправильный возраст");

        }
        return ("неправильное" + getAge() );
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
