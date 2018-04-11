import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        deck.populatDeck();
    }

    @Test
    public void isDeckFull(){
        System.out.println(deck.getDeck());
        deck.shuffleDeck();
        System.out.println(deck.getDeck());
        assertEquals(52, deck.getDeck().size());
    }

    @Test
    public void canDeckDealCard() {
        deck.getCard(1);
        assertEquals(52, deck.getDeck().size());
    }

//    @Test
//    public void deckHasShuffled(){
//        assertEquals(, deck.getTopCard());
//    }
}
