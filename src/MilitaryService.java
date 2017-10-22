public class MilitaryService implements NationalService {

    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if (daysLeft == 0)
            return;
        daysLeft--;
    }

    //    Create the class MilitaryService which implements your NationalService interface.
    // The class constructor has one parameter,
    // defining the days of service (int daysLeft).
}
