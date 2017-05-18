package OOP2.Them_8_Networking.Laba3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;

/**
 * Created by Den on 02.05.2017.
 */
 class MyServer {

    public static void main(String[] args) {
        System.out.println("Laba2");



        HashSet<Student> arrStud = new HashSet<Student>();
        arrStud.add(new Student("Lion", "1", 1000));
        arrStud.add(new Student("Zoja", "5", 2000));
        arrStud.add(new Student("Pola", "3", 4000));


        try {
            //Создаем слушатель
            ServerSocket socketListener = new ServerSocket(4100);
            System.out.println("server start");
            while (true) {
                Socket socetClient = null;
                while (socetClient == null) {
                    System.out.println("server слушает");
                    socetClient = socketListener.accept();

                }


//                ObjectInputStream objectInputStream = new ObjectInputStream(socetClient.getInputStream());
//                Student zzz = null;
//                try {
//                    zzz = (Student) objectInputStream.readObject();
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//                System.out.print(zzz.getName());
//                System.out.println(zzz.getText());


             new ThreadClient(socetClient, arrStud); //Создаем новый поток, которому передаем сокет
            }
        } catch (SocketException e) {
            System.err.println("Socket exception");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("I/O exception");
            e.printStackTrace();
        }
    }

}