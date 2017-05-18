package OOP2.Them2.Laba5;



import java.io.*;

/**
 * Created by Den on 30.03.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Лаба5");
        User user = new User("Mila","Roza",25);

        FileOutputStream file = new FileOutputStream("OOP2_5.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
        objectOutputStream.writeObject(user);

        objectOutputStream.flush();
        objectOutputStream.close();

        System.out.println("оригинл "+user.toString());
        //______________________LAba 19.2


        User user2;

        FileInputStream file2 = new FileInputStream("OOP2_5.ser");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(file2);

        try {
            user2=(User) objectInputStream2.readObject();


            System.out.println(user2.toString());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
