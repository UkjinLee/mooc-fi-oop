public class CivilService implements NationalService {

    private int daysLeft;

    public CivilService() {
        daysLeft = 362;
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

    //    Create the class CivilService which implements your NationalService interface.
    // The class constructor is without parameter.
    // The class has the object variable daysLeft
    // which is initialised in the constructor receiving the value 362.
}
