package week4;

public class BoundedCounterMain {
//    public static void main(String[] args) {

//    EXERCISE 78.1: BOUNDEDCOUNTER
//
//    Value at start: 0
//    Value: 1
//    Value: 2
//    Value: 3
//    Value: 4
//    Value: 0
//    Value: 1
//    Value: 2
//    Value: 3
//    Value: 4
//    Value: 0
//
//        week4.BoundedCounter counter = new week4.BoundedCounter(4);
//        System.out.println("Value at start: " + counter );
//
//        int i = 0;
//        while ( i < 10) {
//            counter.next();
//            System.out.println("Value: " + counter );
//            i++;
//        }


//        EXERCISE 78.2: PRINTING THE INITIAL ZERO
//
//        value at start: 00
//        value: 01
//        value: 02
//        value: 03
//        value: 04
//        value: 05
//        value: 06
//        value: 07
//        value: 08
//        value: 09
//        value: 10
//        value: 11
//        value: 12
//        value: 13
//        value: 14
//        value: 00
//        value: 01
//
//        week4.BoundedCounter counter = new week4.BoundedCounter(14);
//        System.out.println("Value at start: " + counter );
//
//        int i = 0;
//        while ( i < 16){
//            counter.next();
//            System.out.println("value: " + counter );
//            i++;
//        }


//        EXERCISE 78.3: THE FIRST VERSION OF THE CLOCK
//
//        00:00
//        00:01
//        ...
//        00:59
//        01:00
//        01:01
//        01:02
//        ...
//        01:59
//        02:00
//
//        week4.BoundedCounter minutes = new week4.BoundedCounter(59);
//        week4.BoundedCounter hours = new week4.BoundedCounter(23);
//
//        int i = 0;
//        while ( i < 121 ) {
//            System.out.println( hours + ":" + minutes);   // the current time printed
//            // advance minutes
//            minutes.next();
//            // if minutes become zero, advance hours
//            if (minutes.getValue() == 0)
//                hours.next();
//            i++;
//        }


//        EXERCISE 78.4: THE SECOND VERSION OF THE CLOCK
//
//        seconds: 50
//        minutes: 59
//        hours: 23
//        23:59:50
//        23:59:51
//        23:59:52
//        ...
//
//        Scanner reader = new Scanner(System.in);
//        week4.BoundedCounter seconds = new week4.BoundedCounter(59);
//        week4.BoundedCounter minutes = new week4.BoundedCounter(59);
//        week4.BoundedCounter hours = new week4.BoundedCounter(23);
//
//        System.out.print("seconds: ");
//        int s = reader.nextInt();
//        System.out.print("minutes: ");
//        int m = reader.nextInt();
//        System.out.print("hours: ");
//        int h = reader.nextInt();
//
//        seconds.setValue(s);
//        minutes.setValue(m);
//        hours.setValue(h);
//
//        int i = 0;
//        while ( i < 121 ) {
//            // like in previous but seconds taken into account
//            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
//            seconds.next();
//            // advance minutes
//            if (seconds.getValue() == 0) {
//                minutes.next();
//                if (minutes.getValue() == 0)
//                    hours.next();
//            }
//            i++;
//        }
//    }

//    Bonus: eternal clock
//
    public static void main(String[] args) throws Exception {
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);
            // put here the logic to advance your clock by one second
            seconds.next();
            // advance minutes
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0)
                    hours.next();
            }
        }
    }
}
