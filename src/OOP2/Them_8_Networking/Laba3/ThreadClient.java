package OOP2.Them_8_Networking.Laba3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashSet;

/**
 * Created by Den on 02.05.2017.
 */
//ThreadClient
public class ThreadClient extends Thread {
    private Socket socetClient;
    private HashSet<Student> arrStud;
    Student thisStudent;

    private boolean flag;

     ObjectInputStream inputS ;
     ObjectOutputStream outputS ;


    public ThreadClient(Socket socetClient, HashSet<Student> arrStud) {
        this.socetClient = socetClient;
        this.arrStud = arrStud;
        this.start();
    }

    public void run() {
      //  for (int i = 0; i <10 ; i++) {


            System.out.println(" новый поток");
            try {

                //Создаем потоки ввода-вывода для работы с сокетом

                inputS = new ObjectInputStream(socetClient.getInputStream());
                outputS = new ObjectOutputStream(socetClient.getOutputStream());
                thisStudent = (Student) inputS.readObject();




                    System.out.println(thisStudent.getText());


                if (flag = arrStud.contains(thisStudent)) {
                    System.out.println("добро пожаловать");
                    thisStudent.setText("добро пожаловать");
                    outputS.writeObject(thisStudent);

                    if (flag = arrStud.contains(thisStudent)) {
                        if (thisStudent.getText() == "tenis")
                            thisStudent.setText("***_**");
                        outputS.writeObject(thisStudent);
                    }

                } else {
                    System.out.println("вход запрещен");
                    thisStudent.setText("вход запрещен");
                    outputS.writeObject(thisStudent);
                    return;
                }

//            String text= thisStudent.getText();
//                if ( text=="tenis") {
//                    thisStudent.setText("****_***");
//                    outputS.writeObject(thisStudent);
//
//                }

                System.out.println("**" + thisStudent.getName());
                interrupt();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                e.getCause();
            }
       // }

    }


}
