package strategy.strategyImpl;

import strategy.Strategy;

/**
 * Created by Yevheniia_Blokhina on 9/16/2015.
 */
public class DominationVictory implements Strategy {
    public void win(int score, int opponentScore) {
        if (opponentScore == 0) {
            System.out.println("You achieved domination victory");
        }
    }
}
