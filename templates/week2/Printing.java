public class Printing {

//    *****
//    ***
//    *********

    public static void printStars(int amount) {
        // 39.1
    }

//    ****
//    ****
//    ****
//    ****

    public static void printSquare(int sideSize) {
        // 39.2
    }

//    *****************
//    *****************
//    *****************

    public static void printRectangle(int width, int height) {
        // 39.3
    }

//    *
//    **
//    ***
//    ****

    public static void printTriangle(int size) {
        // 39.4
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures

        printSquare(4);
        System.out.println("\n---");

        printRectangle(17, 3);
        System.out.println("\n---");

        printTriangle(4);
        System.out.println("\n---");
    }
}
