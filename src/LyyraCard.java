public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
//        EXERCISE 77.1: CLASS SKELETON
        balance = balanceAtStart;
    }

    // returns a string of the form "The card has X euros".
    public String toString() {
//        EXERCISE 77.1: CLASS SKELETON
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
//        EXERCISE 77.2: PAYING WITH CARD
//        decrease the balance by 2.50 euros
        if (2.5 <= balance)
            balance -= 2.5;
    }

    public void payGourmet() {
//        EXERCISE 77.2: PAYING WITH CARD
//        decrease the balance by 4.00 euros
        if (4 <= balance)
            balance -= 4;
    }

    public void loadMoney(double amount) {
//        EXERCISE 77.4: LOADING MONEY TO CARD
        if (amount < 0)
            return;
        balance += amount;
        if (150 < balance)
            balance = 150;
    }
}