import java.util.ArrayList;
import java.util.Scanner;

public class Scores {

    private ArrayList<Integer> scores;
    private int[] grades;

    public Scores() {
        scores = new ArrayList<>();
        grades = new int[6];
    }

    public void inputScores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int score = scanner.nextInt();
            if (score == -1)
                break;
            if (0 <= score && score <= 60) {
                scores.add(score);
                addGrade(score);
            }
        }
    }

    private void addGrade(int score) {
        if (score < 30)
            grades[0]++;
        else if (score < 35)
            grades[1]++;
        else if (score < 40)
            grades[2]++;
        else if (score < 45)
            grades[3]++;
        else if (score < 50)
            grades[4]++;
        else
            grades[5]++;
    }

    public void showGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int k = 0; k < grades[i]; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public double acceptanceRate() {
        return 100 - 100.0 * grades[0] / scores.size();
    }
}
