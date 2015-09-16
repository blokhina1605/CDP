package abstractFactory;


import java.util.Random;

public class Civilization {
    public static void main(String[] args) throws NoSuchArmyException {
        AbstractArmy firstArmy = createArmy("roman");
        AbstractArmy secondArmy = createArmy("maya");
        System.out.println(getWinner(firstArmy, secondArmy).getClass().getName() + " won");
    }

    private static AbstractArmy createArmy(String type) throws NoSuchArmyException {
        switch (type){
            case "roman":
                return new RomanArmy();
            case "maya":
                return new MayaArmy();
            default:
                throw new NoSuchArmyException("Sorry, bro");
        }
    }
    public static AbstractArmy getWinner(AbstractArmy arm1, AbstractArmy arm2) {
        double probability = 0.5;
        Random random = new Random();
        return random.nextDouble() <= probability ? arm1 : arm2;
    }
}
