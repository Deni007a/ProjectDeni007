package OOP.Them13.Laba5;

import java.time.*;
import java.time.DayOfWeek;

/**
 * Created by Den on 14.03.2017.
 */
public class Main {

        public static void main(String[] args) {
            TrainShedule trainShedule = new TrainShedule(1);
            trainShedule.addTrain();
            System.out.println("printTrains():");
            trainShedule.printTrains();
            System.out.println("searchTrain():");
            trainShedule.searchTrain("Vinnitsa", "Kiev", DayOfWeek.FRIDAY);
        }


}
