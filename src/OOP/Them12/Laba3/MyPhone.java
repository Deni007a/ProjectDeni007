package OOP.Them12.Laba3;

/**
 * Created by Den on 05.03.2017.
 */

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone  {

   static int arrintre=0;

    public MyPhone() {

    }

    MyPhoneBook swichOn(){
        MyPhone myPhone = new MyPhone();
        MyPhone.MyPhoneBook myPhoneBook = myPhone. new MyPhoneBook();

        System.out.println("Loading PhoneBook records…"+" OK!");

        return myPhoneBook;
    }
     void call(int x) {
         System.out.println(swichOn().arrNumber[x]);

    // не совсем ясно

     }

     public class MyPhoneBook {


          PhoneNumber[] arrNumber = {
                  new PhoneNumber ("Lola","99999"),
                  new PhoneNumber ("Mila","22222"),
                  new PhoneNumber ("Roze","33333"),
                  new PhoneNumber  ("Lilia","44444"),
                  new PhoneNumber ("Dolly","55555"),
     };




        void addPhoneNumber(String  name, String phone){

            arrNumber[arrintre] = new PhoneNumber(name,phone);
            arrintre ++;

        }
        void addPhoneNumber(){

        }

        void printPhoneBook() {
            for ( PhoneNumber n : arrNumber) {

                System.out.println(n);
            }
        }

        void sortByName()  {

            Arrays.sort(arrNumber, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {

                    return o1.getName().compareTo(o2.getName());
                }
            });
            printPhoneBook();
        }


        void sortByPhoneNumber(){

            Arrays.sort(arrNumber, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.getPhone().compareTo(o2.getPhone());
                }
            });
            printPhoneBook();
        }


        public  class PhoneNumber
        {
            private String name;
            private String phone;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            PhoneNumber (String name, String phone ){
                this.name = name;
                this.phone = phone;
            }
            PhoneNumber ( ){
            }

            @Override
            public String toString() {
                return getClass().getSimpleName() +" "+ name +" "+phone;
            }
        }
    }






}
