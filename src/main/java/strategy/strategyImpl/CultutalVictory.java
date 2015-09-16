package strategy.strategyImpl;


import strategy.Strategy;

public class CultutalVictory implements Strategy {
    public void win(int score, int opponentScore) {
        if (score > opponentScore*5){
            System.out.println("You achieved cultural victory");
        }
    }


}
