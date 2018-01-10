import java.util.ArrayList;

public abstract class CardStack {
    ArrayList<Card> cards = new ArrayList();
    public abstract Boolean canMove(Card c);
}
