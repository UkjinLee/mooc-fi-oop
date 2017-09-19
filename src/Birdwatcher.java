import java.util.ArrayList;

public class Birdwatcher {

    ArrayList<Bird> birds;

    public Birdwatcher() {
        birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public void printAll() {
        for (Bird bird : birds)
            System.out.println(bird);
    }

    public boolean observe(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.observed();
                return true;
            }
        }
        return false;
    }

    public void print(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name))
                System.out.println(bird);
        }
    }
}
