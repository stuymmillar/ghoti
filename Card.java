public class Card {
    final String[] SUITS = {"D","C","H","S"};
    final String[] RANKS = {"A","2","3","4","5","6","7","8","9","1","J","Q","K"};
    Integer id;
    public Card(Integer i){
	id = i;
    }
    public String getSuit(){
	int i = id/13;
        return SUITS[i];
    }
    public String getRank(){
	int i = id%13;
	return RANKS[i];
    }
}
