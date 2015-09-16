package decorator;

/**
 * Created by Yevheniia_Blokhina on 9/16/2015.
 */
public class Vet extends Specialty {
    public Vet(InterfaceDoctor doctor) {
        super(doctor);
    }

    @Override
    public String treat() {
        return super.treat() + "And your dog's coat is shabby. ";
    }
}
