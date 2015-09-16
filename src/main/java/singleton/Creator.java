package singleton;

/**
 * Created by Yevheniia_Blokhina on 9/16/2015.
 */
public class Creator {
    public static void main(String[] args) {
        Life life = Life.getLife();
        Life life1 = Life.getLife();

        System.out.println(life);
        System.out.println(life1);
    }
}
