package OOP2.Them_8_Networking.Laba3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 * Created by Den on 27.04.2017.
 */
class MyClient {
    private Student stud;

   private String adress = "127.0.0.1";
   private Socket socket;

    private ObjectOutputStream oos;
    private ObjectInputStream ois;


    MyClient(Student student) {
        this.stud = student;

        try {
            socket = new Socket(adress, 4100);
        } catch (IOException e) {
            System.out.println("Сервер не найдеy");
            System.exit(0);
            e.printStackTrace();
        }
        //Ping();
        ObjectOutputStream();
        ObjectInputStream();

    }

// метод который читал и отпровлял потоки

    public void ObjectInputStream() {
        try {


            ois = new ObjectInputStream(socket.getInputStream());
            stud = (Student) ois.readObject();
            System.out.print(stud.getName() + " ");
            System.out.println(stud.getText());
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }

    }

    public void ObjectOutputStream() {

        try {

            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(stud);
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ObjectOutputStream(Student stud) {

        try {

            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(stud);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "MyClient" + stud.getName() + "  *" + stud.getText();

    }


    void Ping() {
        boolean pingalive = false;

       ObjectOutputStream oos;

        for (int i = 0; i <10 ; i++) {

            stud.setText("Ping "+i);
            System.out.println(stud.getText());
            try {
                pingalive = InetAddress.getByName(adress).isReachable(100);
                oos = new ObjectOutputStream(socket.getOutputStream());
                oos.writeObject(stud);
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
