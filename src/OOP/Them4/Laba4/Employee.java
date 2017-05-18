package OOP.Them4.Laba4;

/**
 * Created by Den on 07.02.2017.
 */
public class Employee {
    private String firstName;
    private String        lastName;
    private String occupation;
    private int telephone;
    static  int numberOfEmployees=0;

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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;

    }

    public Employee(String firstName, String lastName, String occupation, int telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public Employee(String firstName, String lastName, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        numberOfEmployees++;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numberOfEmployees++;
    }

    public Employee(String firstName) {
        this.firstName = firstName;
        numberOfEmployees++;
    }

    public  Employee(){
        numberOfEmployees++;
    }

    public static void main(String[] args) {
        Employee em1= new Employee("Vasa");
        Employee em2 = new Employee();
        Employee em3 = new Employee("ggg","gggg","hhhh");

        System.out.println( "работников "+Employee.numberOfEmployees);
    }

}
