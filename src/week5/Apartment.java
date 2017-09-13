package week5;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }


    // EXERCISE 87.1: LARGER
    // returns true if this is larger than otherApartment
    public boolean larger(Apartment otherApartment) {
        return otherApartment.squareMeters < squareMeters;
    }


    // EXERCISE 87.2: PRICE DIFFERENCE
    // returns the absolute value of the price difference of this and otherApartment
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(price() - otherApartment.price());
    }


    // EXERCISE 87.3: MORE EXPENSIVE THAN
    // returns true if this has a higher price than otherApartment
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return otherApartment.price() < price();
    }

    private int price() {
        return squareMeters * pricePerSquareMeter;
    }
}
