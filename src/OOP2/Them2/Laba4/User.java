package OOP2.Them2.Laba4;


import java.io.*;

/**
 * Created by Den on 30.03.2017.
 */
public  class User implements Serializable {

    private String firstName;
    private String lastName;
    private int age;

    public User() {
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void writeObect(RandomAccessFile out) throws IOException {
        out.seek(100);
        out.writeBytes(firstName);
        out.seek(200);
        out.writeBytes(lastName);
        out.seek(300);
        out.writeByte(age);
        out.seek(0);
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public void readObect(RandomAccessFile in) throws IOException, ClassNotFoundException {
        in.seek(100);
        firstName= String.valueOf(in.read());
        in.seek(200);
        lastName= String.valueOf(in.read());
        in.seek(300);
        age=in.readInt();
        in.seek(0);

    }
}
