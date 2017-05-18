package OOP.Them12.Laba2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Den on 02.03.2017.
 * Создайте класс MyPhoneBook , который содержит статические вложенный класс PhoneNumber. 1) добавить в класс PhoneNumber два поля:
 * имя (типа String) и телефона (оf тип String), конструктор с двумя параметрами (имя, Телефон) и методы доступа для каждого поля класса.
 * Переопределите метод toString() в PhoneNumber для возврата сведений об имени и телефонного номера.
 * 2) добавить в класс MyPhoneBook частное поле phoneNumbers как массив PhoneNumber (длина массива из 10).
 * 3) добавить в класс MyPhoneBook открытого метода addPhoneNumber() с двумя параметрами типа String (имя, Телефон),
 * который позволяет создать новый объект PhoneNumber и передать его следующему элементу массива доступных.
 * 4) добавить в класс MyPhoneBook публичный метод printPhoneBook(), которая выполняет итерацию phoneNumbers массива
 * в цикле и печатать имя и телефонный номер информацию о каждой записи в консоль.
 * 5) создайте класс Main метода main() . Добавьте в метод main() код, который создает объект MyPhoneBook и
 * заполнить его с пятью записями номер телефона. Добавьте код для вызова метода printPhoneBook() .
 * 6) выполните программу.
 * Пример выходных данных программы: Имя: Саша, Телефон: 050123456 Имя: Вова, Телефон: 067987654
 */
public class MyPhoneBook  {
    static int arrintre=0;


    PhoneNumber [] arrNumber = new PhoneNumber[5];

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

      /* Comparator <PhoneNumber> comparator=new Comparator <PhoneNumber>() {
           @Override

         public int compare(PhoneNumber o1, PhoneNumber o2) {
               return o1.getName().compareTo(o2.getName());
            }
        };
        */
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
