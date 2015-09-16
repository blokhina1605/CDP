package memento;


public class Talking {
    public static void main(String[] args) {
        Person person = new Person();
        PersonsFriend personsFriend = new PersonsFriend();

        person.setPhoneNumber("050-3324234");
        System.out.println("Hey, please, remember phone number: " + person.getPhoneNumber());
        personsFriend.setMemento(person.saveNumber());

        person.setPhoneNumber("Bla-bla-bla");
        System.out.println("Something strange in my head: " + person.getPhoneNumber());
        System.out.println("Dictate phone number please");

        person.restoreNumber(personsFriend.getMemento());
        System.out.println("thanks,bro: " + person.getPhoneNumber());

    }
}
