package memento;


public class Person {

    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Memento saveNumber(){
        return new Memento(phoneNumber);
    }

    public void restoreNumber(Memento memento){
        this.phoneNumber = memento.getNumber();
    }
}
