package OOP2.Them_8_Networking.Laba1_1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by Den on 02.05.2017.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        String adress ="127.0.0.1";

        Student student = new Student("Vasa", "2" ,1254);
        Student student1 = new Student("Lion","1",1000);



MyClient myClient1 = new MyClient(student);

        MyClient myClient2 = new MyClient(student1);



    }
}
