public class Thing {

    private String name;
    private int weight;

    //    A construsctor, which is given the thing's name and weight as parameter
    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    //    returns the thing's name
    public String getName() {
        return name;
    }

    //    returns the thing's weight
    public int getWeight() {
        return weight;
    }

    //    returns a string in the form "name (weight kg)"
    public String toString() {
        return name + " (" + weight + " kg)";
    }

    public static void main(String[] args) {

//        EXERCISE 4.1: CLASS THING

//        Book name: Happiness in Three Steps
//        Book weight: 2
//        Book: Happiness in Three Steps (2 kg)
//        Mobile: Nokia 3210 (1 kg)

        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);

        System.out.println("Book name: " + book.getName());
        System.out.println("Book weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Mobile: " + mobile);
    }
}
