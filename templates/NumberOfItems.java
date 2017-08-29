import java.util.ArrayList;

//        There are this many items in the list:
//        3

public class NumberOfItems {

    // implement here the method countItems
    public static int countItems(ArrayList<String> list) {
        return -1;
    }

    // test
//    public static void removeFirst(ArrayList<String> list) {
//        list.remove(0);  // removes the first item (indexed 0)
//    }

    // implement and test
//    public static void addItem(ArrayList<String> list) {
//
//    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        System.out.println(countItems(list));
    }

}