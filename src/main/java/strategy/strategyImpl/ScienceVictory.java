package strategy.strategyImpl;


import strategy.Strategy;

public class ScienceVictory implements Strategy {
    public void win(int score, int opponentScore) {
        if (buildSpaceship(score)) {
            System.out.println("You achieved science Victory");
        }
    }

    private boolean buildSpaceship(int score){
        if (score>2500){
            System.out.println("Spaseship was built");
            return true;
        }
        return false;
    }
}
