package OOP2.Them_8_Networking.Laba1_1;

import java.io.Serializable;

/**

 */
public class Student implements Serializable {
    private String name, course;
    private int id;
    private String text;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Student(String name, String course, int id) { // конструктор клиента
        this.name = name;
        this.course = course;
        this.id = id;
    }

    public Student(String name, String course, int id, String text) {
        this.name = name;
        this.course = course;
        this.id = id;
        this.text = text;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getId() != student.getId()) return false;
        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        return getCourse() != null ? getCourse().equals(student.getCourse()) : student.getCourse() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getCourse() != null ? getCourse().hashCode() : 0);
        result = 31 * result + getId();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", id=" + id +
                '}';
    }
}
