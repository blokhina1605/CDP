package decorator;


public class Dantist extends Specialty {
    public Dantist(InterfaceDoctor doctor) {
        super(doctor);
    }

    @Override
    public String treat() {
        return super.treat() + "And your teeth are black. ";
    }
}
