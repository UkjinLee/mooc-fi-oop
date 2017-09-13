package week5;

public class ClockMain {
    public static void main(String[] args) {

//        23:59:50
//        23:59:51
//        23:59:52
//        23:59:53
//        23:59:54
//        23:59:55
//        23:59:56
//        23:59:57
//        23:59:58
//        23:59:59
//        00:00:00
//        00:00:01
//        ...

        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while( i < 20) {
            System.out.println( clock );
            clock.tick();
            i++;
        }
    }
}
