import java.util.ArrayList;

//        There are this many items in the list:
//        3

public class NumberOfItems {

    // implement here the method countItems
    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    // test
    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);  // removes the first item (indexed 0)
    }

    // implement and test
    public static void addItem(ArrayList<String> list) {
        list.add("Olla");
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        System.out.println(countItems(list));

        System.out.println(list);
        removeFirst(list);
        System.out.println(list);
        addItem(list);
        System.out.println(list);
    }
}