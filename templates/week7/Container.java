public class Container {

    //    a constructor which is given the maximum weight limit
    public Container(int weightLimit) {

    }

    //    adds the suitcase as a parameter to the container
    public void addSuitcase(Suitcase suitcase) {

    }

    //    returns a string in the form "x suitcases (y kg)"
    public String toString() {
        return "";
    }


//    EXERCISE 4.7: THE CONTAINER CONTENTS

//    prints out all the things inside the container's suitcases.
    public void printThings() {

    }


//    EXERCISE 4.8: A LOT OF BRICKS

    // adding 100 suitcases with one brick in each
    // The bricks weight will then increase by one each time until the weight becomes 100 kg.
    public static void addSuitcasesFullOfBricks(Container container) {

    }

    public static void main(String[] args) {

//        EXERCISE 4.6: CONTAINER
//
//        2 suitcases (7 kg)

        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println(container);


//        EXERCISE 4.7: THE CONTAINER CONTENTS

//        There are the following things in the container suitcases:
//        Happiness in Three Steps (2 kg)
//        Nokia 3210 (1 kg)
//        Brick (4 kg)

//        week7.Thing book = new week7.Thing("Happiness in Three Steps", 2);
//        week7.Thing mobile = new week7.Thing("Nokia 3210", 1);
//        week7.Thing brick = new week7.Thing("Brick", 4);
//
//        week7.Suitcase tomsCase = new week7.Suitcase(10);
//        tomsCase.addThing(book);
//        tomsCase.addThing(mobile);
//
//        week7.Suitcase georgesCase = new week7.Suitcase(10);
//        georgesCase.addThing(brick);
//
//        week7.Container container = new week7.Container(1000);
//        container.addSuitcase(tomsCase);
//        container.addSuitcase(georgesCase);
//
//        System.out.println("There are the following things in the container suitcases:");
//        container.printThings();


//        EXERCISE 4.8: A LOT OF BRICKS

//        44 suitcases (990 kg)

//        week7.Container container = new week7.Container(1000);
//        addSuitcasesFullOfBricks(container);
//        System.out.println(container);
    }
}
