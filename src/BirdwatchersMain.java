import java.util.Scanner;

public class BirdwatchersMain {

    public static void main(String[] args) {

//        ? Add
//        Name: Raven
//        Latin Name: Corvus Corvus
//        ? Add
//        Name: Seagull
//        Latin Name: Dorkus Dorkus
//        ? Observation
//        What was observed:? Seagull
//        ? Observation
//        What was observed:? Turing
//        Is not a bird!
//        ? Observation
//        What was observed:? Seagull
//        ? Statistics
//        Seagull (Dorkus Dorkus): 2 observations
//        Raven (Corvus Corvus): 0 observations
//        ? Show
//        What? Seagull
//        Seagull (Dorkus Dorkus): 2 observations
//        ? Quit

        Scanner reader = new Scanner(System.in);
        Birdwatcher birdwatcher = new Birdwatcher();

        while (true) {
            System.out.print("? ");
            String input = reader.nextLine();
            input = input.toLowerCase();
            if (input.equals("quit")) {
                break;
            } else if (input.equals("add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                birdwatcher.addBird(name, latinName);
            } else if (input.equals("statistics")) {
                birdwatcher.printAll();
            } else if (input.equals("observation")) {
                System.out.print("What was observed:? ");
                String bird = reader.nextLine();
                if (!birdwatcher.observe(bird))
                    System.out.println("Is not a bird!");
            } else if (input.equals("show")) {
                System.out.print("What? ");
                String bird = reader.nextLine();
                birdwatcher.print(bird);
            }
        }
    }
}
