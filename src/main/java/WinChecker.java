import java.util.ArrayList;

public class WinChecker {

    public WinChecker(){
    }

    public String winner(Player player1, Player player2) {
        if (player1.hand.get(0).getRank().getValue() > player2.hand.get(0).getRank().getValue()) {
            return "Player 1 wins";
        } else {
            return "Player 2 wins";
        }
    }

}
