package adapter;


public class StringGetter {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        System.out.println(getString(adapter.adaptToString()));
    }
    public static String getString(String value){
        System.out.println("StringGetter - I get only integers");
        return "I get \"" + value +"\"";
    }
}
