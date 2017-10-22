public interface NationalService {

//    returns the number of days left on service
    int getDaysLeft();

//    reduces the working days by one. The working days number can not become negative.
    void work();
}
