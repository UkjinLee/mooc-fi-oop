package week4;

public class MultiplierMain {

//    threeMultiplier.multiply(2): 6
//    fourMultiplier.multiply(2): 8
//    threeMultiplier.multiply(1): 3
//    fourMultiplier.multiply(1): 4

    public static void main(String[] args) {
        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    }
}
