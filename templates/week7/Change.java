public class Change {

    public Change(char fromCharacter, char toCharacter) {

    }

    public String change(String characterString) {
        return "";
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
