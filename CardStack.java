import java.util.ArrayList;

public abstract class CardStack {
    ArrayList<Card> cards = new ArrayList();
    public abstract Boolean canMove(Card c);
    public Card addCard(Card c){
	cards.add(c);
	return c;
    }
    public Card removeCard(){
	return cards.remove(cards.size()-1);
    }
    public Card getCard(int i){
	return cards.get(i);
    }
    public Card getCard(){
	return getCard(cards.size()-1);
    }
	public int getLength(){
		return cards.size();
	}
	public Boolean isEmpty(){
		return cards.size()==0;
	}

    public String toString(){
	String s = "";
	for (Card c:cards) {
	    s += c + ", ";
	}
	s = s.substring(0,s.length()-2);
	return s;
    }
}
