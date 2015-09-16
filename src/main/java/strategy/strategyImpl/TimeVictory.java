package strategy.strategyImpl;


import strategy.Strategy;

public class TimeVictory implements Strategy {
    public void win(int score, int opponentScore) {
        if (score > opponentScore)
            System.out.println("You achieved time victory");
    }
}
