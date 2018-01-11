public class Foundation {
    Integer suit;

    public Foundation(Integer i){
	suit = i;
    }
    
    public Boolean canMove(Card c){
	return c.getSuit().equals(suit);
    }
}
