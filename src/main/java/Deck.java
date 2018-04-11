import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public Card getCard( int cardIndex) {
        return cards.get(cardIndex)
        cards.remove(cardIndex);
    }


    public void populatDeck(){
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                cards.add(new Card(suit,rank));
            }
        }
    }

    public ArrayList<Card> getDeck(){
        return this.cards;
    }

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
    }

}
