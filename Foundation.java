public class Foundation extends CardStack {
    Integer suit;

    public Foundation(Integer i){
	suit = i;
    }
    
    public Boolean canMove(Card c){
	return c.getSuit().equals(suit)&&(c.getRank().equals(0)&&this.isEmpty()||!this.isEmpty()&&c.getRank().equals(this.getCard().getRank()+1));
    }
}
