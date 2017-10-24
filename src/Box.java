import java.util.ArrayList;

//    store Things that implement the interface ToBeStored
public class Box implements ToBeStored {

//    EXERCISE 11.2: BOX

//    constructor with the maximum weight, expressed in kilograms.
    private double maxWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<>();
    }

    private void add(ToBeStored thing) {
        if (maxWeight < thing.weight() + weight())
            return;
        things.add(thing);
    }

    //        Box: 6 things, total weight 4.0 kg

    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }

    //    can't be added more things than its maximum capacity allows for


//    EXERCISE 11.3: BOX WEIGHT

    @Override
    public double weight() {
        double weight = 0;
        for (ToBeStored aThing : things) {
            weight += aThing.weight();
        }
        return weight;
    }

    // remove weight variable and implement weight interface
    // boxes can be stored in other boxes, so we need this weight interface

    public static void main(String[] args) {

//        EXERCISE 11.2: BOX

//        Box: 6 things, total weight 4.0 kg

        Box box = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( box );
    }

}
