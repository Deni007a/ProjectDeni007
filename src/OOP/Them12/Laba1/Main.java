package OOP.Them12.Laba1;

/**
 * Created by Den on 02.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        MyPhoneBook myPhoneBook = new MyPhoneBook();
       myPhoneBook.addPhoneNumber("Lola","11111");
       myPhoneBook.addPhoneNumber("Mila","22222");
       myPhoneBook.addPhoneNumber("Roze","33333");

       myPhoneBook.printPhoneBook();



    }
}
