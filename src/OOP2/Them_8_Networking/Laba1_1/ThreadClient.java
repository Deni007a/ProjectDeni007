package OOP2.Them_8_Networking.Laba1_1;

import OOP2.Them_8_Networking.Laba1.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Den on 02.05.2017.
 */
//ThreadClient
public class ThreadClient extends Thread {
    private Socket socetClient;
    private HashSet<Student> arrStud;
    Student thisStudent;

    private boolean flag;

    ObjectInputStream inputS;
    ObjectOutputStream outputS;


    public ThreadClient(Socket socetClient, HashSet<Student> arrStud) {
        this.socetClient = socetClient;
        this.arrStud = arrStud;
        this.start();
    }

    public void run() {
        System.out.println(" новый поток");
        try {

                //Создаем потоки ввода-вывода для работы с сокетом

                inputS = new ObjectInputStream(socetClient.getInputStream());
                outputS = new ObjectOutputStream(socetClient.getOutputStream());
                thisStudent = (Student) inputS.readObject();


                if (flag = arrStud.contains(thisStudent)) {
                    System.out.println("добро пожаловать");
                    thisStudent.setText("добро пожаловать");
                    outputS.writeObject(thisStudent);

                } else {
                    System.out.println("вход запрещен");
                    thisStudent.setText("вход запрещен");
                    outputS.writeObject(thisStudent);
                    return;
                }
                System.out.println("**" + thisStudent.getName());


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getCause();
        }


    }


}
