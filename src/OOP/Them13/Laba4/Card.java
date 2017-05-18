package OOP.Them13.Laba4;

/**
 * Created by Den on 10.03.2017.
 */
public class Card {
    private Suit cardSuit ;
    private Rank cardRank ;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public Card() {
    }

    public Suit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(Suit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public Rank getCardRank() {
        return cardRank;
    }

    public void setCardRank(Rank cardRank) {
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return cardSuit+" " +" "+ cardRank;
    }
}
