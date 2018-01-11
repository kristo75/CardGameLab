import java.util.ArrayList;

public class Player {

    private String name;
    public ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public int count() {
        return this.hand.size();
    }

    public void receiveCard(Card anything) {
        this.hand.add(anything);
    }

    public int sum(){
        int total = 0;
        for(Card cards: this.hand){
            total = total + cards.getRank().getValue();
        }
        return total;
    }

    public String getName(){
        return this.name;
    }

    public void addCard(Card card1) {
        this.hand.add(card1);
    }
//
//    public int rank() {
//        this.hand.get(0).value;
//    }
}
