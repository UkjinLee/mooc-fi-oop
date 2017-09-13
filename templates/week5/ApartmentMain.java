public class ApartmentMain {

    public static void main(String[] args) {

//        EXERCISE 87.1: LARGER

        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );       // false
        System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );   // true


//        EXERCISE 87.2: PRICE DIFFERENCE
//
//        week5.Apartment studioManhattan = new week5.Apartment(1, 16, 5500);
//        week5.Apartment twoRoomsBrooklyn = new week5.Apartment(2, 38, 4200);
//        week5.Apartment fourAndKitchenBronx = new week5.Apartment(3, 78, 2500);
//
//        System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );        // 71600
//        System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );    // 35400


//        EXERCISE 87.3: MORE EXPENSIVE THAN
//
//        week5.Apartment studioManhattan = new week5.Apartment(1, 16, 5500);
//        week5.Apartment twoRoomsBrooklyn = new week5.Apartment(2, 38, 4200);
//        week5.Apartment fourAndKitchenBronx = new week5.Apartment(3, 78, 2500);
//
//        System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );       // false
//        System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );   // true
    }
}
