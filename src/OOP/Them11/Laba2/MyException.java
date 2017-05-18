package OOP.Them11.Laba2;

/**
 * Created by Den on 01.03.2017.
 */
public class MyException extends Exception {
    String ss;
    MyException(String ss)
    {
        super(ss);
        System.out.println("MyException()");
        this.ss = ss;
    }
    protected void showS() {
        System.out.println("Message from : MyException" + ss);
    }

}
