package OOP2.Them2.Laba1_3;

import java.io.*;

/**
 * Created by Den on 30.03.2017.
 * Создание класса Employee с закрытых полей: имястроки, строка адреса, int SSN, int число.
 * Добавьте методы getter и Setter класс Employee .
 * Переопределите метод toString() .
 * Создайте программу SerializeDemo , которая создает экземпляры объекта
 * Employee и сериализует его в файл.
 */
public class SerializeDemo {


    public static void main(String[] args) throws IOException {
        System.out.println("Laba19.1");

        Employee employee = new Employee("lola","gonduras",12345,54321);


            FileOutputStream file = new FileOutputStream("OOP2_1.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
            objectOutputStream.writeObject(employee);

            objectOutputStream.flush();
            objectOutputStream.close();

        System.out.println(employee.toString());
        //______________________LAba 19.2
        System.out.println("__________ Laba2_________");

        Employee employee12;

        FileInputStream file2 = new FileInputStream("OOP2_1.ser");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(file2);

        try {
            employee12=(Employee)objectInputStream2.readObject();


            System.out.println(employee12.getName());
            System.out.println(employee12.getNamber());
            System.out.println(employee12.toString());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
