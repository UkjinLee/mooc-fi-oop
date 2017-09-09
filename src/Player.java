public class Player {

    private String name;
    private int goals;

    public Player(String name) {
        this.name = name;
        goals = 0;
    }

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    @Override
    public String toString() {
        return getName() + ", goals " + getGoals();
    }
}
