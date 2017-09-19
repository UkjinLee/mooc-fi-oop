public class ScoresMain {

    public static void main(String[] args) {

//        Type exam scores, -1 completes:
//        34
//        41
//        53
//        36
//        55
//        27
//        43
//        40
//        -1
//        Grade distribution:
//        5: **
//        4:
//        3: ***
//        2: *
//        1: *
//        0: *
//        Acceptance percentage: 87.5

//        0–29	    failed
//        30–34	    1
//        35–39	    2
//        40–44	    3
//        45–49	    4
//        50–60	    5

        Scores scores = new Scores();
        scores.inputScores();
        scores.showGradeDistribution();
        System.out.println("Acceptance percentage: " + scores.acceptanceRate());
    }
}
