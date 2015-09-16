package strategy;


import strategy.strategyImpl.*;

public class Civilization {
    public static void main(String[] args) {
        User user = new User();

        user.setStrategy(new ScienceVictory());
        user.executeStrategy(2600, 1500);
        System.out.println("=========");

        user.setStrategy(new DiplomaticVictory());
        user.executeStrategy(2600, 3458);
        System.out.println("=========");

        user.setStrategy(new CultutalVictory());
        user.executeStrategy(2600, 5);
        System.out.println("=========");

        user.setStrategy(new TimeVictory());
        user.executeStrategy(2600, 158);
        System.out.println("=========");

        user.setStrategy(new DominationVictory());
        user.executeStrategy(2600, 0);
        System.out.println("=========");

    }
}
