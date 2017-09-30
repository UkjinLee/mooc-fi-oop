package week6;

public class LibraryMain {

    public static void main(String[] args) {

//        EXERCISE 101.2: LIBRARY

//        Cheese Problems Solved, Woodhead Publishing, 2007
//        NHL Hockey, Stanley Kupp, 1952
//        Battle Axes, Tom A. Hawk, 1851

//        week6.Library week6.Library = new week6.Library();
//
//        week6.Book cheese = new week6.Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
//        week6.Library.addBook(cheese);
//
//        week6.Book nhl = new week6.Book("NHL Hockey", "Stanley Kupp", 1952);
//        week6.Library.addBook(nhl);
//
//        week6.Library.addBook(new week6.Book("Battle Axes", "Tom A. Hawk", 1851));
//
//        week6.Library.printBooks();


//        EXERCISE 101.3: SEARCH FUNCTIONALITY

//        Cheese Problems Solved, Woodhead Publishing, 2007
//        The Stinky Cheese Man and Other Fairly Stupid Tales, Penguin Group, 1992
//        ---
//        ---
//        Battle Axes, Tom A. Hawk, 1851

//        week6.Library week6.Library = new week6.Library();
//
//        week6.Library.addBook(new week6.Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
//        week6.Library.addBook(new week6.Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
//        week6.Library.addBook(new week6.Book("NHL Hockey", "Stanley Kupp", 1952));
//        week6.Library.addBook(new week6.Book("Battle Axes", "Tom A. Hawk", 1851));
//
//        ArrayList<week6.Book> result = week6.Library.searchByTitle("Cheese");
//        for (week6.Book book: result) {
//            System.out.println(book);
//        }
//
//        System.out.println("---");
//        for (week6.Book book: week6.Library.searchByPublisher("Penguin Group  ")) {
//            System.out.println(book);
//        }
//
//        System.out.println("---");
//        for (week6.Book book: week6.Library.searchByYear(1851)) {
//            System.out.println(book);
//        }


//        EXERCISE 101.4: IMPROVED SEARCH

//        Cheese Problems Solved, Woodhead Publishing, 2007
//        The Stinky Cheese Man and Other Fairly Stupid Tales, Penguin Group, 1992
//        ---
//        The Stinky Cheese Man and Other Fairly Stupid Tales, Penguin Group, 1992

        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        for (Book book: Library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }
    }
}
