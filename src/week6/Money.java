package week6;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        return new Money(euros + added.euros, cents + added.cents);
    }

    public boolean less(Money compared) {
        if (euros < compared.euros)
            return true;
        if (euros == compared.euros && cents < compared.cents)
            return true;
        return false;
    }

    public Money minus(Money decremented) {
        if (less(decremented))
            return new Money(0, 0);
        int euros = this.euros;
        int cents = this.cents;
        if (cents < decremented.cents) {
            cents += 100;
            euros--;
        }
        return new Money(euros - decremented.euros, cents - decremented.cents);
    }
}
