import java.util.Scanner;

//    Type a number: 3
//    The result is 15
//
//    Type a number: 7
//    The result is 255

public class SumOfThePowers {

    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(2, i);
        }

        System.out.println("The result is " + sum);
    }
}
