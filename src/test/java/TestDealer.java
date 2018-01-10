import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestDealer {


    Deck deck;
    Player player1;
    Player player2;
    Card card1;
    Card card2;
    Dealer dealer;
    WinChecker winchecker;

    @Before
    public void before(){
        card1 = new Card(Suit.CLUBS, Rank.EIGHT);
        card2 = new Card(Suit.CLUBS, Rank.NINE);
        deck = new Deck();
        deck.add(card1);
        deck.add(card2);
        player1 = new Player("Vishal");
        player2 = new Player( "Kris");
        dealer = new Dealer(deck);
        winchecker = new WinChecker();


    }

    @Test
    public void deal(){
        Card anything = dealer.dealCard(0);
        assertNotNull(anything);
        assertEquals(1, deck.count());
    }

    @Test
    public void playerHasCard(){
        dealer.shuffleCard();
        Card anything = dealer.dealCard(0);
        dealer.giveCard(player1, 0);
        assertEquals(1, player1.count());

    }

    @Test
    public void identifyWinner(){
        dealer.giveCard(player1, 0);
        dealer.giveCard(player2, 0);
        assertEquals(0, deck.count());
        assertEquals("Player 2 wins", winchecker.winner(player1, player2));

    }

}
