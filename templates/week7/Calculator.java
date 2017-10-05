public class Calculator {

//    EXERCISE 3.1: READER
//    implement Reader class


//    EXERCISE 3.2: APPLICATION BODY

    private Reader reader;

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }


//    EXERCISE 3.3: IMPLEMENTATION OF THE APPLICATION LOGIC

    private void sum() {
        System.out.print("value1: ");
//        int value1 = // read the value using the Reader-object
        System.out.print("value2: ");
//        int value2 = // read the value using the Reader-object
        // print the value according to the example above
    }

    private void difference() {
    }

    private void product() {
    }


//    EXERCISE 3.4: STATISTICS

    private void statistics() {
//        command: sum
//        value1: 4
//        value2: 6
//        sum of the values 10
//
//        command: product
//        luku1: 3
//        luku2: 2
//        product of the values 6
//
//        command: end
//        Calculations done 2


//        command: integral
//        command: difference
//        value1: 3
//        value2: 2
//        difference of the values 1
//
//        command: end
//        Calculations done 1
    }


//      Bonus assignment (not tested):
//      Reading the user input is repeated in the same way in all three operation implementing methods.
//      Remove the repetition from your code with the help of a support method.
//      The method can return the two values asked from the user in an array, for example.


    public static void main(String[] args) {

//        EXERCISE 3.2: APPLICATION BODY

//        command: sum
//        value1: 4
//        value2: 6
//        sum of the values 10
//
//        command: product
//        value1: 3
//        value2: 2
//        product of the values 6
//
//        command: end

        Calculator calculator = new Calculator();
        calculator.start();
    }
}
