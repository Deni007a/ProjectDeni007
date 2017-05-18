package OOP2.Them2.Laba4;

import java.io.*;

/**
 * Created by Den on 30.03.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Лаба 4");

        User user = new User("Mila","Roza",25);
        System.out.println("*"+user.toString());
/*
      RandomAccessFile raf = new RandomAccessFile("OOP2l4.sr", "rw");
      FileOutputStream fos = new FileOutputStream(raf.getFD());
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
      */
       RandomAccessFile raf = new RandomAccessFile("OOP_2_l4.srs", "r");
        System.out.println("*"+user.toString());
        ObjectOutputStream objectOutputStream =
        new ObjectOutputStream(new FileOutputStream(raf.getFD()));

        objectOutputStream.writeObject(user);

       objectOutputStream.flush();
       objectOutputStream.close();

//____________________________________________


        User user2;

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(raf.getFD()));

        try {
            user2=(User)objectInputStream.readObject();


            System.out.println(user2.toString());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}
