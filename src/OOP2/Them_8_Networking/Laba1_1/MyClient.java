package OOP2.Them_8_Networking.Laba1_1;

import java.io.*;
import java.net.Socket;

/**
 * Created by Den on 27.04.2017.
 */
class MyClient {
    private Student stud;

    String adress = "127.0.0.1";
    Socket socket;

    private ObjectOutputStream oos;
    private ObjectInputStream ois;


    MyClient(Student student)  {
        this.stud = student;

        try {
            socket = new Socket(adress, 4000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            System.out.println("сервер не найден");
            System.exit(0);
        }
        ObjectOutputStream();
        ObjectInputStream();

    }

// метод который читал и отпровлял потоки

    public void ObjectInputStream () {
        try {


            ois= new ObjectInputStream(socket.getInputStream());
            stud= (Student) ois.readObject();
            System.out.print(stud.getName()+" ");
            System.out.println(stud.getText());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void ObjectOutputStream () {
        try {

            oos = new ObjectOutputStream(socket.getOutputStream());
           oos.writeObject(stud);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "MyClient" + stud.getName()+" " +stud.getText();

    }

/* public Socket getSocket() {
        return this.socket;
    }

    public ObjectOutputStream getThisObjectOutputStream() throws IOException {
        return this.oos;
    }

    public ObjectInputStream getThisObjectInputStream() {
        return this.ois;
    }

    public void setThisObjectOutputStream(ObjectOutputStream oos) {
        this.oos = oos;
    }

    public void setThisObjectInputStream(ObjectInputStream ois) {
        this.ois = ois;
    }
    */
}
