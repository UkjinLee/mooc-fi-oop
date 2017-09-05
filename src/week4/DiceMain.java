package week4;

public class DiceMain {

//    1
//    6
//    3
//    5
//    3
//    3
//    2
//    2
//    6
//    1

    public static void main(String[] args) {
        Dice dice = new Dice(6);

        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }
    }
}
