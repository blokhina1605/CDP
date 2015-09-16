package abstractFactory.warriors.swordsman;


public class RomanSwordsman implements Swordsman {
    public RomanSwordsman() {
        System.out.println("Yes, my lord");
    }

    public void hit() {
        System.out.println("Don`t wont!");
    }
}
