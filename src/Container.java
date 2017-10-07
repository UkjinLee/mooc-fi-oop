import java.util.ArrayList;

public class Container {

    private int weight;
    private int weightLimit;
    private ArrayList<Suitcase> suitcases;

    //    a constructor which is given the maximum weight limit
    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        suitcases = new ArrayList<>();
        weight = 0;
    }

    //    adds the suitcase as a parameter to the container
    public void addSuitcase(Suitcase suitcase) {
        if (weightLimit < weight + suitcase.totalWeight())
            return;
        weight += suitcase.totalWeight();
        suitcases.add(suitcase);
    }

    //    returns a string in the form "x suitcases (y kg)"
    public String toString() {
        return suitcases.size() + " suitcases (" + weight + " kg)";
    }


//    EXERCISE 4.7: THE CONTAINER CONTENTS

//    prints out all the things inside the container's suitcases.
    public void printThings() {
        for (Suitcase suitcase : suitcases)
            suitcase.printThings();
    }


//    EXERCISE 4.8: A LOT OF BRICKS

    // adding 100 suitcases with one brick in each
    // The bricks weight will then increase by one each time until the weight becomes 100 kg.
    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 0; i < 100; i++) {
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(new Thing("brick", i + 1));
            container.addSuitcase(suitcase);
        }
    }

    public static void main(String[] args) {

//        EXERCISE 4.6: CONTAINER
//
//        2 suitcases (7 kg)

//        Thing book = new Thing("Happiness in Three Steps", 2);
//        Thing mobile = new Thing("Nokia 3210", 1);
//        Thing brick = new Thing("Brick", 4);
//
//        Suitcase tomsCase = new Suitcase(10);
//        tomsCase.addThing(book);
//        tomsCase.addThing(mobile);
//
//        Suitcase georgesCase = new Suitcase(10);
//        georgesCase.addThing(brick);
//
//        Container container = new Container(1000);
//        container.addSuitcase(tomsCase);
//        container.addSuitcase(georgesCase);
//
//        System.out.println(container);


//        EXERCISE 4.7: THE CONTAINER CONTENTS

//        There are the following things in the container suitcases:
//        Happiness in Three Steps (2 kg)
//        Nokia 3210 (1 kg)
//        Brick (4 kg)

//        Thing book = new Thing("Happiness in Three Steps", 2);
//        Thing mobile = new Thing("Nokia 3210", 1);
//        Thing brick = new Thing("Brick", 4);
//
//        Suitcase tomsCase = new Suitcase(10);
//        tomsCase.addThing(book);
//        tomsCase.addThing(mobile);
//
//        Suitcase georgesCase = new Suitcase(10);
//        georgesCase.addThing(brick);
//
//        Container container = new Container(1000);
//        container.addSuitcase(tomsCase);
//        container.addSuitcase(georgesCase);
//
//        System.out.println("There are the following things in the container suitcases:");
//        container.printThings();


//        EXERCISE 4.8: A LOT OF BRICKS

//        44 suitcases (990 kg)

        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
}
