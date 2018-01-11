public class Card {
    final String[] SUITS = {"D","C","H","S"};
    final String[] RANKS = {"A","2","3","4","5","6","7","8","9","1","J","Q","K"};
    Integer id;
    public Card(Integer i){
	id = i;
    }
    public Integer getSuit(){
        return id/13;
    }
    public Integer getRank(){
        return id%13;
    }
    public String toString(){
	return RANKS[getRank()] + SUITS[getSuit()];
    }
}
