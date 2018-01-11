import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestDealer {


    Deck deck;
    Player player1;
    Player player2;
    Player player3;
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Card card5;
    Card card6;
    Dealer dealer;
    WinChecker winchecker;

    @Before
    public void before(){
        card1 = new Card(Suit.CLUBS, Rank.EIGHT);
        card2 = new Card(Suit.CLUBS, Rank.NINE);
        card3 = new Card(Suit.CLUBS, Rank.TWO);
        card4 = new Card(Suit.CLUBS, Rank.THREE);
//        card5 = new Card(Suit.CLUBS, Rank.JACK);
//        card6 = new Card(Suit.CLUBS, Rank.JACK);
        deck = new Deck();
        deck.add(card1);
        deck.add(card2);
        deck.add(card3);
        deck.add(card4);
//        deck.add(card5);
//        deck.add(card6);
        player1 = new Player("Vishal");
        player2 = new Player( "Kris");
        player1.addCard(card1);
        player1.addCard(card2);
        player2.addCard(card3);
        player2.addCard(card4);

//        player3 = new Player( "Craig");
        dealer = new Dealer(deck);
        dealer.addPlayer(player1);
        dealer.addPlayer(player2);

//        dealer.addPlayer(player3);
        winchecker = new WinChecker();


    }

    @Test
    public void deal(){
        Card anything = dealer.dealCard(0);
        assertNotNull(anything);
        assertEquals(1, deck.count());
    }

    @Test
    public void testPlayerArray(){
        assertEquals(3,dealer.count());
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
        dealer.giveCard(player3, 0);
        dealer.giveCard(player1, 0);
        dealer.giveCard(player2, 0);
        dealer.giveCard(player3, 0);
        System.out.println(winchecker.winner(dealer.getPlayers()).getName());

    }

    @Test
    public void winningPlayer(){
        assertEquals("Vishal", winchecker.winner(dealer.getPlayers()).getName());

    }


}
