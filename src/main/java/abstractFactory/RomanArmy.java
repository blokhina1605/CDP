package abstractFactory;

import abstractFactory.warriors.archer.Archer;
import abstractFactory.warriors.archer.RomanArcher;
import abstractFactory.warriors.swordsman.RomanSwordsman;
import abstractFactory.warriors.swordsman.Swordsman;


public class RomanArmy extends AbstractArmy {
    @Override
    public Archer createArcher() {
        return new RomanArcher();
    }

    @Override
    public Swordsman createSwordsman() {
        return new RomanSwordsman();
    }
}
