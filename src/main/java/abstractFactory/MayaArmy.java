package abstractFactory;


import abstractFactory.warriors.archer.Archer;
import abstractFactory.warriors.archer.MayaArcher;
import abstractFactory.warriors.swordsman.MayaSwordsman;
import abstractFactory.warriors.swordsman.Swordsman;

public class MayaArmy extends AbstractArmy {
    @Override
    public Archer createArcher() {
        return new MayaArcher();
    }

    @Override
    public Swordsman createSwordsman() {
        return new MayaSwordsman();
    }
}
