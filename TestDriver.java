public class TestDriver {
    public static void main(String[] args) {
	Cascade foo = new Cascade();
	Cell bar = new Cell();
	Foundation goo = new Foundation(1);

	foo.addCard(new Card(0));
	bar.addCard(new Card(13));
	goo.addCard(new Card(35));
	foo.addCard(new Card(3));
	foo.addCard(new Card(4));

	System.out.println(new Card(46));
	System.out.println(foo);
	System.out.println(bar);
	System.out.println(goo);
    }
}
