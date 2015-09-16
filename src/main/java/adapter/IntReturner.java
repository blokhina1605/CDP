package adapter;


import abstractFactory.AbstractArmy;

import java.util.Random;

public class IntReturner {
    public int getInt() {
        Random random = new Random();
        System.out.println("IntReturnet - I return int value");
        return random.nextInt();
    }
}
