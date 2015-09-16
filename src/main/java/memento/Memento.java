package memento;


public class Memento {
    private final String number;

    public Memento(String number) {
        this.number = number;
    }

    public String getNumber(){
        return number;
    }
}
