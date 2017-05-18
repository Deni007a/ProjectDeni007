package OOP2.Them_8_Networking.Laba1;

/**
 * Created by Den on 27.04.2017.
 * 1) Create a Student class with private fields: String name, String course, int id.
 * Add getters and setters to Student class. Override the toString() method.
 *
 * 2) Create a MyClient class, which receives a Student's instance and sends it to the
 * server via a socket connection, and then receives and outputs the server's response.
 * You can implement this class as a separate thread.
 *
 * 3) Create a MyServer class,
 * which establishes a socket connection with the client, and then outputs the
 * received information, and sends the response to the client.
 * You can implement this class as a separate thread.
 *
 * 4) Create a Main class with a main() method, which creates an instance of the class Student and runs the threads of server and of client on execution.
 *
 */
public class Student {
    private String name, course;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, String course, int id) {
        this.name = name;
        this.course = course;
        this.id = id;
    }
}
