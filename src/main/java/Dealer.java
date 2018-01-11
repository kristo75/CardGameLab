import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private Deck deck;
    private ArrayList<Player> players;

    public Dealer(Deck deck){
        this.deck = deck;
        this.players = new ArrayList<>();
    }

    public void shuffleCard(){
        Collections.shuffle(deck.getDeck());
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }

    public Card dealCard(int i){

        return deck.eject(0);

    }

    public void giveCard(Player player1, int i) {
        Card myCard = dealCard(i);
        player1.receiveCard(myCard);
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int count() {
        return this.players.size();
    }
}
