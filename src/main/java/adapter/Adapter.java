package adapter;


public class Adapter {

    IntReturner intReturner;

    public Adapter() {
        this.intReturner = new IntReturner();
    }

    public String adaptToString() {
        System.out.println("Adapter - I convert int to string");
        return "random " + intReturner.getInt();
    }
}
