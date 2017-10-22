public class Suitcase {

    //        EXERCISE 4.2: CLASS SUITCASE

    //    A constructor, which is given a maximum weight limit
    public Suitcase(int weightLimit) {

    }

    //    adds the thing in the parameter to your suitcase.
    public void addThing(Thing thing) {

    }

    //    returns a string in the form "x things (y kg)"
    public String toString() {
        return "";
    }


    //   EXERCISE 4.4: EVERY THING

    // prints out all the things inside the suitcase
    public void printThings() {

    }

    // returns the total weight of the things in your suitcase
    public int totalWeight() {
        return -1;
    }

//    EXERCISE 4.5: THE HEAVIEST THING

    // returns the thing which weighs the most.
    // If there are more than one thing with the same weight, the method can return either one.
    // The method has to return an object reference. If the suitcase is empty, the method returns null.
    public Thing heaviestThing() {
        return null;
    }

    public static void main(String[] args) {

//        EXERCISE 4.2: CLASS SUITCASE

//        0 things (0 kg)
//        1 things (2 kg)
//        2 things (3 kg)
//        2 things (3 kg)

        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);


//        EXERCISE 4.3: LANGUAGE CHECK

//        empty (0 kg)
//        1 thing (2 kg)
//        2 things (3 kg)
//        2 things (3 kg)


//        EXERCISE 4.4: EVERY THING

//        Your suitcase contains the following things:
//        Happiness in Three Steps (2 kg)
//        Nokia 3210 (1 kg)
//        Brick (4 kg)
//        Total weight: 7 kg

//        week7.Thing book = new week7.Thing("Happiness in Three Steps", 2);
//        week7.Thing mobile = new week7.Thing("Nokia 3210", 1);
//        week7.Thing brick = new week7.Thing("Brick", 4);
//
//        week7.Suitcase suitcase = new week7.Suitcase(10);
//        suitcase.addThing(book);
//        suitcase.addThing(mobile);
//        suitcase.addThing(brick);
//
//        System.out.println("Your suitcase contains the following things:");
//        suitcase.printThings();
//        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");


//        EXERCISE 4.5: THE HEAVIEST THING

//        The heaviest thing: Brick (4 kg)

//        week7.Thing book = new week7.Thing("Happiness in Three Steps", 2);
//        week7.Thing mobile = new week7.Thing("Nokia 3210", 1);
//        week7.Thing brick = new week7.Thing("Brick", 4);
//
//        week7.Suitcase suitcase = new week7.Suitcase(10);
//        suitcase.addThing(book);
//        suitcase.addThing(mobile);
//        suitcase.addThing(brick);
//
//        Thing heaviest = suitcase.heaviestThing();
//        System.out.println("The heaviest thing: " + heaviest);
    }
}
