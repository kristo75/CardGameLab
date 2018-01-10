import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck (){
        this.deck = new ArrayList<>();
    }

    public int count() {
        return this.deck.size();
    }

    public void add(Card card) {
        this.deck.add(card);
    }


    public Card eject(int i) {
        return this.deck.remove(i);
    }

    public ArrayList<Card> getDeck(){
        return this.deck;
    }
}
