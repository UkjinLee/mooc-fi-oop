package week1;

import java.util.Scanner;

//Type the radius: 20
//
//Circumference of the circle: 125.66370614359172

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.print("Type the radius: ");
        double radius = reader.nextDouble();

        System.out.println("Circumference of the circle: " + (2 * Math.PI * radius));
    }
}
