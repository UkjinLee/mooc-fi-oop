package week7;

public class Calculator {

//    EXERCISE 3.1: READER
//    implement week7.Reader class


//    EXERCISE 3.2: APPLICATION BODY

    private Reader reader;
    private int calculations;

    public Calculator() {
        reader = new Reader();
        calculations = 0;
    }

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
            System.out.println();
        }

        statistics();
    }


//    EXERCISE 3.3: IMPLEMENTATION OF THE APPLICATION LOGIC

    private void sum() {
        int[] values = readValues();
        System.out.println("sum of the values " + (values[0] + values[1]));
        calculations++;
    }

    private void difference() {
        int[] values = readValues();
        System.out.println("difference of the values " + (values[0] - values[1]));
        calculations++;
    }

    private void product() {
        int[] values = readValues();
        System.out.println("product of the values " + (values[0] * values[1]));
        calculations++;
    }


//    EXERCISE 3.4: STATISTICS

    private void statistics() {
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
//        Calculations done 2


//        command: integral
//        command: difference
//        value1: 3
//        value2: 2
//        difference of the values 1
//
//        command: end
//        Calculations done 1

        System.out.println("Calculations done " + calculations);
    }


//      Bonus assignment (not tested):
//      Reading the user input is repeated in the same way in all three operation implementing methods.
//      Remove the repetition from your code with the help of a support method.
//      The method can return the two values asked from the user in an array, for example.

    private int[] readValues() {
        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        return values;
    }


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
