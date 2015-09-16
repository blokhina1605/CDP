package abstractFactory.warriors.archer;


public class RomanArcher implements Archer {
    public RomanArcher() {
        System.out.println("I do not see the target, my lord");
    }

    public void shoot() {
        System.out.println("I didn`t shoot");
    }
}
