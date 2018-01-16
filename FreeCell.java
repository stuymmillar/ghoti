import java.util.Random;

public class FreeCell {
	static CardStack[] stacks = new CardStack[16];
	static int[] deck = new int[52];
    static final String[] IDS = {"F1", "F2", "F3", "F4", "DD", "CC", "HH", "SS", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8"};
    public static void startGame(){
		for (int i = 0; i < 4; i++) {
			stacks[i] = new Cell();
			stacks[i+4] = new Foundation(i); //diamonds, clubs, hearts, spades
		}
		for (int i = 8; i < 16; i++) {
			stacks[i] = new Cascade();
		}
		
		//shuffle deck
		for (int i = 0; i < 52; i++) { //sets each value in the deck to a "null" value, or the Ace of Hearts (Card(0))
			deck[i] = 0;
		}
		for (int i = 1; i < 52; i++) { //for each unique card value, find an Ace of Hearts and replace it with the new card.
			Random r = new Random();
			int j = r.nextInt(52);
			while (deck[j]!=0) {
				j = r.nextInt(52);
			}
			deck[j] = i; //the untouched index will be the single Ace of Hearts
		}
		
		//distribute deck amongst cascades
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				stacks[8+j].addCard(new Card(deck[i*8+j]));
			}
		}
		for (int j = 0; j < 4; j++) {
			stacks[8+j].addCard(new Card(deck[48+j]));
		}
    }
    
	static int maxCasc = 0;
	public static String getBoard(){
		String str = "[=-=-=-free-cell-=-=-=]\nF1|F2|F3|F4|DD|CC|HH|SS\n";
		for (int i = 0; i < 8; i++) {
			if (stacks[i].isEmpty()) {
				str += "  ";
			}
			else {
				str += stacks[i].getCard();
			}
			if (i!=7) str += "|";
		}
		str += "\n@~-~-~-~-~-~-~-~-~-~-~@\nC1|C2|C3|C4|C5|C6|C7|C8\n=-=-=-=-=-=-=-=-=-=-=-=\n";
		
		for (int i = 8; i < 15; i++) {//determines how long to make the board
			if (stacks[i].getLength()>maxCasc) maxCasc = stacks[i].getLength();
		}
		for (int i = 0; i < maxCasc; i++) {
			for (int j = 0; j < 8; j++) {
				if (i<stacks[8+j].getLength()) {
					str += stacks[8+j].getCard(i);
				}
				else {
					str += "  ";
				}
				if (j!=7) str += "|";
			}
			if (i+1!=maxCasc) str += "\n";
		}
		
		return str;
	}

    public static Boolean moveCard (CardStack src, CardStack dest) {
	Boolean val = dest.canMove(src.getCard());
	if (val) {
	    dest.addCard(src.removeCard());
	}
	return val;
    }

    public static int getStackInd (String s) {
	for (int i = 0; i < 16; i++) {
	    if (IDS[i].equals(s)) return i;
	}
	return -1;
    }
	
    public static void main (String[] args){
		startGame();
		System.out.println(getBoard());

		int option1;
		String option2;
		String option3;
		Keyboard k = new Keyboard();
		while(stacks[4].getLength == 13 && stacks[5].getLength == 13 && stacks[6].getLength == 13 && stacks[7].getLength == 13){
		System.out.println(getBoard());
		System.out.println("Which would you like do do?(1 - 3)\n1.Move a Card\n2.Reset Board\n3.New Board");
		option1 = k.readInt();
		if(option1 == 1){
		    System.out.println("Which column would you like to move a card from?(Ex. F1, C1, DD)");
		    option2 = k.readString();
		    System.out.println("Which column would you like to move a card to?(Ex. F1, C1, DD)");
		    option3 = k.readString();
		    
		}
		else if(option1 == 2){

		}
		else if(option1 == 3){
		    
		}
		else{

		}
		}
    }
		/*//test funcs
		moveCard(stacks[8], stacks[5]);
		System.out.println(getBoard());
		System.out.println(getStackInd("F1"));*/
    }

