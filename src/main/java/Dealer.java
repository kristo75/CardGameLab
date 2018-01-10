import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private Deck deck;
//    private ArrayList<Player> players;

    public Dealer(Deck deck){
        this.deck = deck;
//        this.players = players;
    }

    public void shuffleCard(){
        Collections.shuffle(deck.getDeck());
    }

    public Card dealCard(int i){

        return deck.eject(0);

    }

    public void giveCard(Player player1, int i) {
        Card anything = dealCard(i);
        player1.receiveCard(anything);
    }
}
