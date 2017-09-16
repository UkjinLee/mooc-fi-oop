import java.util.Random;

public class NightSky {

//    EXERCISE 100.1: CLASS NIGHTSKY AND A STAR LINE

    private double density;
    private int width;
    private int height;
    private Random random;
    private int stars;

//    creates a NightSky object with the given star density. Width gets the value 20 and height the value 10.
    public NightSky(double density) {
        this(density, 20, 10);
    }

//    creates a NightSky object with the given width and height. Density gets the value 0.1.
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

//    creates a NightSky-object with the given density, width and height
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        random = new Random();
    }

//  prints one line of stars
//  The line length is determined by the value of the instance variable width
//  the instance variable density determines the star probability
    public void printLine() {
        for (int i = 0; i < width; i++) {
            if (random.nextDouble() <= density) {
                System.out.print("*");
                stars++;
            }
            else {
                System.out.print(" ");
            }
        }
    }


//    EXERCISE 100.2: PRINTING THE NIGHT SKY

    public void print() {
        stars = 0;
        for (int i = 0; i < height; i++) {
            printLine();
            System.out.println();
        }
    }


//    EXERCISE 100.3: COUNTING THE NUMBER OF STARS
    public int starsInLastPrint() {
        return stars;
    }
}
