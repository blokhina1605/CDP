package decorator;


public class Doctor implements InterfaceDoctor{
    @Override
    public String treat() {
        return "You are sick. ";
    }
}
