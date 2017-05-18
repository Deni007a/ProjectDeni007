package OOP2.Them_8_Networking.Laba1_1;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Den on 02.05.2017.
 */
public class MyServer {

    public static void main(String[] args) {
        System.out.println("Laba2");
        HashSet <Student> arrStud  = new HashSet<Student>();
        arrStud.add(new Student("Lion", "1", 1000));
        arrStud.add(new Student("Zoja", "5", 2000));
        arrStud.add(new Student("Pola", "3", 4000));



        try {
            //Создаем слушатель
            ServerSocket socketListener = new ServerSocket(4000);

            while (true) {
                Socket socetClient = null;
                while (socetClient == null) {
                    System.out.println("server слушает");
                    socetClient = socketListener.accept();

                }
                System.out.println("server start");

//                ObjectInputStream objectInputStream = new ObjectInputStream(socetClient.getInputStream());
//                Student zzz = (Student) objectInputStream.readObject();
//                System.out.println(zzz.getName());



                new ThreadClient(socetClient, arrStud); //Создаем новый поток, которому передаем сокет
            }
        } catch (SocketException e) {
            System.err.println("Socket exception");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("I/O exception");
            e.printStackTrace();
        }
//
    }


}
