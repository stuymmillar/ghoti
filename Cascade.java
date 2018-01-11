public class Cascade extends CardStack {
    public Boolean canMove(Card c){
	//returns true if c is of descending rank and alternating color
	return (this.getCard().getRank()).equals(c.getRank()+1)&&((this.getCard().getSuit().equals(0)||this.getCard().getSuit().equals(2))&&(c.getSuit().equals(1)||c.getSuit().equals(3)))||((this.getCard().getSuit().equals(1)||this.getCard().getSuit().equals(3))&&(c.getSuit().equals(0)||c.getSuit().equals(2)));
    }
}
