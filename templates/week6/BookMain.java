public class BookMain {

    public static void main(String[] args) {

//        EXERCISE 101.1: BOOK

//        Cheese Problems Solved
//        Woodhead Publishing
//        2007
//        Cheese Problems Solved, Woodhead Publishing, 2007

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);
    }
}
