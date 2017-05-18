package OOP.Them16.Laba1;

/**
 * Created by Den on 14.03.2017.
 */
public class Main {
   static void foo (Animal a)
    {
        System.out.println(" foot animal");
    }
   static void foo (Dog b)
    {
        System.out.println(" foot Dog");
    }


    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dog = new Dog();
        Dog dog1 = new Dog();

        foo(animal);
        foo(dog);
        foo(dog1);
        System.out.println(dog.getClass().getSimpleName());
        System.out.println(dog1.getClass().getSimpleName());

    }
}
