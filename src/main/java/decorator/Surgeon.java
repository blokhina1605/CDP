package decorator;

/**
 * Created by Yevheniia_Blokhina on 9/16/2015.
 */
public class Surgeon extends Specialty {
    public Surgeon(InterfaceDoctor doctor) {
        super(doctor);
    }

    @Override
    public String treat() {
        return super.treat() + "And your hand will soon disappear. ";
    }
}
