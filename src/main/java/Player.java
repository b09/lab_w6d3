import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> playerCards;

    public Player(String name) {
        this.playerCards = new ArrayList<Card>();
        this.name = name;
    }
}
