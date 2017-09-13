package week5;

public class LyyraCard {

    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }


//    EXERCISE 86.1: THE "STUPID" LYYRA CARD

    public boolean pay(double amount) {
       // method checks if the balance of the card is at least amount given as parameter
        // if not, methods returns false meaning that the card could not be used for the payment
        if (balance < amount)
            return false;

       // if the balance is enough, the given amount is taken from the balance and true is returned
        balance -= amount;
        return true;
    }
}