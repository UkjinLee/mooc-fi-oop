import java.util.Scanner;

//    3
//    Sum now: 3
//    2
//    Sum now: 5
//    1
//    Sum now: 6
//    1
//    Sum now: 7
//    0
//    Sum in the end: 7

public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            // do something here

            System.out.println("Sum now: " + sum);
        }
        
        System.out.println("Sum in the end: " + sum);
    }
}
