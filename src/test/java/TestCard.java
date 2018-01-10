import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCard {

    Card card;
    Rank rank;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS,Rank.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void jackValueIs11(){
        card = new Card(Suit.CLUBS, Rank.JACK);
        Rank rank = card.getRank();

        int value = card.getRank().getValue();

        assertEquals(11, value);
    }

}
