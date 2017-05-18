package OOP.Them4.Laba7;

/**
 * Created by Den on 07.02.2017.
 * x(t) = 0.5 × a × t2 + vi × t + xi,
 *
  acceleration = a =9.81
 t – time
 vi – initial velocity
 xi – initial position

 x(t) = 0.5 × a × time 2 + vi × time + xi Где: - Ускорение (м/с2 ) = -9.81 t - время (s) (например t = 10)
 vi - начальная скорость (м/с) = 0 xi - начальная позиция = 0
 */
public class GravityCalculator {


    static double vi=0;
    static double xi=0;

    final static  double a =9.81;

    static double calcDist( int time ){
       double finalpozision =0.5*a*(time*time)+vi*time+xi;
        return  finalpozision;

    }

    public static void main(String[] args) {
        System.out.println(calcDist(1));
    }

}
