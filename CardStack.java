import java.util.ArrayList;

public abstract class CardStack {
    ArrayList<Card> cards = new ArrayList();
    public abstract Boolean canMove(Card c);
    public Card addCard(Card c){
	cards.add(c);
	return c;
    }
    public Card removeCard(){
	return cards.remove(cards.size());
    }
}
