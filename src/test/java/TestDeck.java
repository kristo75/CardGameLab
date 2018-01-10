import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeck {

    Deck deck;
    Card card;

    @Before
    public void before(){
        card = new Card(Suit.CLUBS, Rank.ACE );
        deck = new Deck();
    }

    @Test
    public void deckIsEmpty() {
        assertEquals(0, deck.count());
    }

    @Test
    public void addCardsToDeck() {
        deck.add(card);
        deck.add(card);
        assertEquals(2, deck.count());
    }

//    @Test
//    public void deckRemoveCard(){
//        deck.add(card);
//        deck.remove(card);
//        assertEquals(0, deck.count());
//    }
}
