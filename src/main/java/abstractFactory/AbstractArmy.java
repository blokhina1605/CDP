package abstractFactory;


import abstractFactory.warriors.archer.Archer;
import abstractFactory.warriors.swordsman.Swordsman;

public abstract class AbstractArmy {
    public abstract Archer createArcher();

    public abstract Swordsman createSwordsman();
}
