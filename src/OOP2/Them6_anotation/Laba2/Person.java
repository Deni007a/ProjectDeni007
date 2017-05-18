package OOP2.Them6_anotation.Laba2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Den on 22.04.2017.
 */
public class Person {

    enum PerAction {
        U_READ, U_WRITE, U_DELETE;

    }
    //__________________________________________________

    private String name;
    private ArrayList<PerAction> permissions;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<PerAction> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<PerAction> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", permissions=" + permissions +
                '}';
    }

    public Person() {
    }

    public Person(String name, PerAction... xx) {
        this.name = name;
        this.permissions = new ArrayList<PerAction>();

        for (int i = 0; i < xx.length; i++) {
            permissions.add(xx[i]);
        }


    }

//______________________________________________
    public static void main(String[] args) {

//@My_anot
        Person person = new Person("ddd", PerAction.U_DELETE, PerAction.U_WRITE);
        System.out.println(person.permissions.get(0));
        //System.out.println(person.toString());


    }
}
