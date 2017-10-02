import java.lang.reflect.Array;
import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changes;

    public Changer() {
        changes = new ArrayList<>();
    }

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {
        String newString = characterString;
        for (Change change : changes) {
            newString = change.change(newString);
        }
        return newString;
    }

    public static void main(String[] args) {

//        EXERCISE 2.2: CHANGER-CLASS

//        aalio ala lyo, oolia laikkyy

        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
    }
}
