package OOP.Them12.Laba3;


import OOP.Them12.Laba3.MyPhone;

/**
 * Created by Den on 02.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        MyPhone myPhone = new MyPhone();
        MyPhone.MyPhoneBook myPhoneBook = myPhone. new MyPhoneBook();
        /*
        myPhoneBook.addPhoneNumber("Lola","99999");
        myPhoneBook.addPhoneNumber("Mila","22222");
        myPhoneBook.addPhoneNumber("Roze","33333");
        myPhoneBook.addPhoneNumber("Lilia","44444");
        myPhoneBook.addPhoneNumber("Dolly","55555");
        */

        myPhoneBook.printPhoneBook();

        System.out.println("*****");
        //Arrays.sort(myPhoneBook.arrNumber, sortByName);

        myPhoneBook.sortByName();
        System.out.println("*****");
        myPhoneBook.sortByPhoneNumber();

        System.out.println("****Laba3****");
        myPhone.swichOn();
       myPhone.call(1);

/*
       MyPhoneBook myPhoneBook1 = new MyPhoneBook();
       MyPhoneBook.PhoneNumber phoneNumber = myPhoneBook1. new PhoneNumber("ff", "vv");

       phoneNumber.getName();
       */


    }
}
