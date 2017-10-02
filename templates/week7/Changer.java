public class Changer {

    public Changer() {

    }

    public void addChange(Change change) {

    }

    public String change(String characterString) {
        return "";
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
