public class Book implements ToBeStored {

//    Book receives its writer (String), name (String), and weight (double), all as parameter.
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    //    implement ToBeStored interface
    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return writer + ": " + name;
    }

    public static void main(String[] args) {

//        EXERCISE 11.1: TOBESTORED

//        Fedor Dostojevski: Crime and Punishment
//        Robert Martin: Clean Code
//        Kent Beck: Test Driven Development
//        Pink Floyd: Dark Side of the Moon (1973)
//        Wigwam: Nuclear Nightclub (1975)
//        Rendezvous Park: Closer to Being Here (2012)

        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
}
