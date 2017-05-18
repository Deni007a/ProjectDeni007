package OOP2.Them2.Laba1_3;

import java.io.Serializable;

/**
 * Created by Den on 30.03.2017.
 */
 class Employee implements Serializable {
  private  String name;
  private String  adrres;
  private transient int SNN;
  private int namber;

    public Employee(String name, String adrres, int SNN, int namber) {
        this.name = name;
        this.adrres = adrres;
        this.SNN = SNN;
        this.namber = namber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrres() {
        return adrres;
    }

    public void setAdrres(String adrres) {
        this.adrres = adrres;
    }

    public int getSNN() {
        return SNN;
    }

    public void setSNN(int SNN) {
        this.SNN = SNN;
    }

    public int getNamber() {
        return namber;
    }

    public void setNamber(int namber) {
        this.namber = namber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", adrres='" + adrres + '\'' +
                ", SNN=" + SNN +
                ", namber=" + namber +
                '}';
    }
}
