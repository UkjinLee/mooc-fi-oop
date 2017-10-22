package week7;

import java.util.HashMap;
import java.util.Map;

public class PromissoryNote {

    Map<String, Double> promissoryNotes;

    public PromissoryNote() {
        promissoryNotes = new HashMap<>();
    }

    public void setLoan(String toWhom, double value) {
        promissoryNotes.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (!promissoryNotes.containsKey(whose))
            return 0;
        return promissoryNotes.get(whose);
    }

    public static void main(String[] args) {

//        51.5
//        0.0
//        10.5

        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));

        mattisNote.setLoan("Arto", 10.5);
        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
    }
}
