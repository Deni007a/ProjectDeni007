package OOP.Them5.Laba1;

/**
 * Created by Den on 07.02.2017.
 */
public class MyInitTest {
    int a;

    static {
        System.out.println("статик  блок 1");
    }
    {
        System.out.println("Блок 1");
    }
    static {
        System.out.println("статик  блок 2");
    }
    {
        System.out.println("Блок 2");
    }
    MyInitTest (){
        this(1);
        System.out.println("Конструктор 1");
    }
    MyInitTest (int a){

        this.a = a;
        System.out.println("Конструктор 2");

    }


}
