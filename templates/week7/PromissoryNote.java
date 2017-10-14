public class PromissoryNote {

    public PromissoryNote() {

    }

    public void setLoan(String toWhom, double value) {

    }

    public double howMuchIsTheDebt(String whose) {
        return -1;
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
