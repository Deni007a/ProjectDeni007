package OOP.Them11.Laba2;

/**
 * Created by Den on 01.03.2017.
 */
public class MyTest {
    public static void f() throws MyException {
        System.out.println("f()");
        throw new MyException("Ouch from f()");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(MyException e) {
            System.err.println("Caught мой эксепшин");
            e.printStackTrace();
            e.showS();
        }
    }
}