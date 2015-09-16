package decorator;


public abstract class Specialty implements InterfaceDoctor {
    protected InterfaceDoctor doctor;

    public Specialty(InterfaceDoctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String treat() {
        return doctor.treat();
    }

}
