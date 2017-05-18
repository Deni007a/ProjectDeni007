package OOP.Them17.Laba4;

import java.util.List;

/**
 * Created by Den on 16.03.2017.
 */
public class MySumCount implements Runnable{
    private int startIndex;
    private int stopIndex ;
    private List<Integer> arrSum;
    private    long resultSum =0;

    public MySumCount(int startIndex, int stopIndex, List<Integer> arrSum) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.arrSum = arrSum;

    }

    public long getResultSum() {
        return resultSum;
    }

    public List<Integer> getArrSum() {
        return arrSum;
    }

    public void setArrSum(List<Integer> arrSum) {
        this.arrSum = arrSum;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }






    public void run() {
        for (int i = startIndex; i <stopIndex ; i++){
           // System.out.println(arrSum.get(i));
            resultSum += arrSum.get(i);
        }
        System.out.println(resultSum);


    }
}

