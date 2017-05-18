package OOP.Them7.Laba1;

/**
 * Created by Den on 14.02.2017.
 */
public class Car {
    public String name = "CAR am i ?";
    public int madeWhen = 1980;


  static  class  SportCar extends Car {
      public boolean isSport = true;

      {
          super.name = "Porse";
          madeWhen = 2017;
      }

  }



    public static void main(String[] args) {
        Car car = new  Car();
        System.out.println(car.madeWhen);
        System.out.println(car.name);

        System.out.println("********");

        SportCar sportCar = new SportCar();
        System.out.println(sportCar.madeWhen);
        System.out.println(sportCar.name);
        System.out.println("is Sport ****"+ sportCar.isSport);


         

        Car cartest = new SportCar();
        System.out.println(cartest.madeWhen);
        System.out.println(cartest.name);
        //System.out.println("is  ****"+cartest.isSport);

       // SportCar sportCarTt = ()new Car();






    }
}

