public class Cascade extends CardStack {
    public Boolean canMove(Card c){
	//returns true if c is of descending rank and alternating color
	return (this.isEmpty()) || (this.getCard().getRank()).equals(c.getRank()+1)&&(((this.getCard().getSuit() %  2) == 0 && (c.getSuit() % 2) == 1) || ((this.getCard().getSuit() %  2) == 1 && (c.getSuit() % 2) == 0)) ;
    }
}
