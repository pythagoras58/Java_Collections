import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> _schools = new ArrayList<>();

        _schools.add("Legon");
        _schools.add("KNUST");
        _schools.add("UCC");
        _schools.add("Winneba");


        _schools.get(0);

        System.out.println("[SCHOOL LIST]->" + _schools.get(3));
        System.out.println("[SCHOOL LIST]->" + _schools.size());

        for(int i=0; i<_schools.size(); i++){
            System.out.println("[Element]-> " + i  + ":" +_schools.get(i));
        }

        System.out.println("======Array List=======");

        for(String item : _schools){
            System.out.println("[Each Element]-> " + item);
        }
    }
}
