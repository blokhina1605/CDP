package strategy;


public class User {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int a, int b){
        strategy.win(a, b);
    }
}
