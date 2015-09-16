package singleton;


public class Life {
    private static Life life;

    private Life(){
    }

    public static synchronized Life getLife(){
        if (life == null) {
            life = new Life();
        }
        return life;
    }
}
