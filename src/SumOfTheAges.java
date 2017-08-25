import java.util.Scanner;

//Type your name: Matti
//Type your age: 14
//
//Type your name: Arto
//Type your age: 12
//
//Matti and Arto are 26 years old in total.

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String firstPersonName = reader.nextLine();
        System.out.print("Type your age: ");
        int firstPersonAge = reader.nextInt();
        reader.nextLine();

        System.out.print("Type your name: ");
        String secondPersonName = reader.nextLine();
        System.out.print("Type your age: ");
        int secondPersonAge = reader.nextInt();

        System.out.println(firstPersonName + " and " + secondPersonName + " are "
                + (firstPersonAge + secondPersonAge) + " years old in total");
    }
}
