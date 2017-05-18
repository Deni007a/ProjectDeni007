package OOP2.Them_8_Networking.Laba1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by Den on 27.04.2017.
 */
public class Main  {

    public static void main(String[] args)  throws IOException {

        Student student = new Student("Vasa", "2" ,1254);



        MyClient MyClient = new MyClient();
        MyClient.Client(student.getName());
        MyClient.Client(student.getCourse());
        MyClient.Client(String.valueOf(student.getId()));

        //       int c;
//        while  ( ( с = in . read ( ) )  ! =  - 1 ) (
//                Syзtem . out . print ( (char) с) ;
//    }
//



    }
}
