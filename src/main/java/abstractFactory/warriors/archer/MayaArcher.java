package abstractFactory.warriors.archer;


public class MayaArcher implements Archer {
    public MayaArcher() {
        System.out.println("I have sling instead of bow");
    }

    public void shoot() {
        System.out.println("I missed");
    }
}
