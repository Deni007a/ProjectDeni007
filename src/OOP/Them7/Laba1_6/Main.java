package OOP.Them7.Laba1_6;

/**
 * Created by Den on 15.02.2017.
 */
public class Main {
    public static void main(String[] args) {
// сравнимаем по производителю и серийному номеру



        Device [] arrDev = new Device[6];
        arrDev[0] = new Monitor("LG", 300, " NN001",1024,640);
        arrDev[1] = new Monitor("LG", 300, " NN001",1024,640);
        arrDev[2] = new Monitor("LG", 400, " NN002",1024,640);

        arrDev[3] = new EthernetAdapter("Asus", 10, "AN01",500,"MAk1");
        arrDev[4] = new EthernetAdapter("Asus", 50, "AN01",500,"MAk1");
        arrDev[5] = new EthernetAdapter("Asus", 70, "AN01",500,"MAk2");


       // System.out.println(arrDev[0].equals(arrDev[1]));

//  вывод toString и шех кода
        for (Device a: arrDev) {
             System.out.println(a);  //вызыввается не явно то стринг 
            System.out.println(a.hashCode());

        }

    }
}
