package OOP2.Them_8_Networking.Laba3;

/**
 * Created by Den on 02.05.2017.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        String adress ="127.0.0.1";

        Student student = new Student("Vasa", "2" ,1254);
        Student student1 = new Student("Lion","1",1000);
        Student student2 = new Student("Zoja", "5", 2000);





//MyClient myClient1 = new MyClient(student);
//student1.setText("tenis");

        MyClient myClient2 = new MyClient(student1);
myClient2.Ping();
MyClient myClient3 = new MyClient(student2);
myClient3.Ping();


    }
}
