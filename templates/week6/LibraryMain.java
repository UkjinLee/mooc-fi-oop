import java.util.ArrayList;

public class LibraryMain {

    public static void main(String[] args) {

//        EXERCISE 101.2: LIBRARY

//        Cheese Problems Solved, Woodhead Publishing, 2007
//        NHL Hockey, Stanley Kupp, 1952
//        Battle Axes, Tom A. Hawk, 1851

//        Library Library = new Library();
//
//        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
//        Library.addBook(cheese);
//
//        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
//        Library.addBook(nhl);
//
//        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
//
//        Library.printBooks();


//        EXERCISE 101.3: SEARCH FUNCTIONALITY

//        Cheese Problems Solved, Woodhead Publishing, 2007
//        The Stinky Cheese Man and Other Fairly Stupid Tales, Penguin Group, 1992
//        ---
//        ---
//        Battle Axes, Tom A. Hawk, 1851

//        Library Library = new Library();
//
//        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
//        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
//        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
//        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
//
//        ArrayList<Book> result = Library.searchByTitle("Cheese");
//        for (Book book: result) {
//            System.out.println(book);
//        }
//
//        System.out.println("---");
//        for (Book book: Library.searchByPublisher("Penguin Group  ")) {
//            System.out.println(book);
//        }
//
//        System.out.println("---");
//        for (Book book: Library.searchByYear(1851)) {
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
