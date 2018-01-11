public class Cell extends CardStack {
    public Boolean canMove(Card c){
	return this.cards.size()==0;
    }
}
