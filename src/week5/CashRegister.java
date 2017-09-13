package week5;

public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        cashInRegister = 1000;
        economicalSold = 0;
        gourmetSold = 0;
    }

    private static double EconomicalLunch = 2.5;
    private static double GourmetLunch = 4;

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

        if (cashGiven < EconomicalLunch)
            return cashGiven;
        cashInRegister += EconomicalLunch;
        economicalSold++;
        return cashGiven - EconomicalLunch;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

        if (cashGiven < GourmetLunch)
            return cashGiven;
        cashInRegister += GourmetLunch;
        gourmetSold++;
        return cashGiven - GourmetLunch;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }


//    EXERCISE 86.3: PAYING WITH CARD

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false

        if (card.pay(EconomicalLunch)) {
            economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.pay(GourmetLunch)) {
            gourmetSold++;
            return true;
        }
        return false;
    }


//    EXERCISE 86.4: LOADING MONEY

    //    amount to be loaded needs to be positive!
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum <= 0)
            return;
        card.loadMoney(sum);
        cashInRegister += sum;
    }
}