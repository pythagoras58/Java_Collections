import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("New");
        list.add("Old");

        String s = (String) list.get(0);

        System.out.println("[POP]->" + s);
    }
}
