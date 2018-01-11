import java.util.ArrayList;
import java.util.Collections;

public class WinChecker {

    public WinChecker() {
    }

    public Player winner(ArrayList<Player> players) {
        Player winningPlayer = null;

        Integer currentHighestScore = 0;

        for (Player player : players) {
            if (player.sum() > currentHighestScore) {
                currentHighestScore = player.sum();
                winningPlayer = player;
            }


        }

        return winningPlayer;

    }
}




//    public String winner(ArrayList<Player> players) {
//        for(Player player: players) {
//
//        }
//
//
//
//
//
//        if (player1.hand.get(0).getRank().getValue() > player2.hand.get(0).getRank().getValue()) {
//            return "Player 1 wins";
//        } else {
//            return "Player 2 wins";
//        }
//    }

