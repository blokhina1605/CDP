package strategy.strategyImpl;


import strategy.Strategy;

public class DiplomaticVictory implements Strategy {

    public void win(int score, int opponentScore) {
        int diplomaticScore = score + opponentScore;
        System.out.println("You achieved diplomatic Victory with score " + diplomaticScore);
    }
}
