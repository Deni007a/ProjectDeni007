package OOP.Them2.Laba4;

/**
 * Created by Den on 02.02.2017.
 */
public class Person {

    String firstName;
    String lastName;
    int age;
    String gender;
    int phoneNumber;

   public void metod (String firstName, int age)
   {
       System.out.println("вариант1 " +firstName+age);
   }
    public void metod (String lastName, String gender)
    {
        System.out.println("вариант2 " +lastName+gender);
    }
    public void metod (int age, int phoneNumber)
    {
        System.out.println("вариант3 " +age+phoneNumber);
    }
    public void metod (int age, String gender)
    {
        System.out.println("вариант4 " +age+gender);
    }
    public void metod (String lastName, String gender, int age)
    {
        System.out.println("вариант5 " +lastName+gender+age);
    }

    public static void main(String[] args)
    {

        Person per =  new Person();
        per.metod("Вася","Васечкин");
    }

}
