package week7;

public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        return characterString.replace(fromCharacter, toCharacter);
    }

    public static void main(String[] args) {

//        EXERCISE 2.1: CHANGE-CLASS

//        cbrrot
//        cbxxot

        String word = "carrot";
        Change change1 = new Change('a', 'b');
        word = change1.change(word);
        System.out.println(word);

        Change Change2 = new Change('r', 'x');
        word = Change2.change(word);
        System.out.println(word);
    }
}
