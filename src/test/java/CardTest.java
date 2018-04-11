import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;
    Card card2;

    @Before
    public void before(){
        card = new Card(SuitType.DIAMONDS, RankType.ACE);
        card2 = new Card(SuitType.HEARTS, RankType.TWO);
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card2.getSuit());
    }

}
