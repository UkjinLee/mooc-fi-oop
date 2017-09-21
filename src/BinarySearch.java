public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int middle = (low + high) / 2;
            if (array[middle] == searchedValue)
                return true;
            if (array[middle] < searchedValue)
                low = middle + 1;
            else
                high = middle - 1;
        }
        return (array[low] == searchedValue);
    }
}
