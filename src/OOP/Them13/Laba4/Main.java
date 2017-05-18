package OOP.Them13.Laba4;

/**
 * Created by Den on 10.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Rank[]ranks = Rank.values();
        Suit[]suits = Suit.values();
        Card card = new Card();
        int inter=0;
        for (int i = 0; i <suits.length ; i++) {

            for (int j = 0; j <ranks.length ; j++) {
                System.out.println(new Card(suits[i], ranks[j]));

                inter++;

            }


        };
        System.out.println(inter);

    }


}
