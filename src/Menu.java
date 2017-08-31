import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

//    EXERCISE 76.1: ADDING A MEAL TO MENU
    //
    // adds a new meal to the list meals
    // If the meal is already in the list, it should not be added.
    public void addMeal(String meal) {
        if (meals.contains(meal))
            return;
        meals.add(meal);
    }

//    EXERCISE 76.2: PRINTING THE MENU
    //
    // prints the meals in a menu
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

//    EXERCISE 76.3: CLEARING A MENU
    //
    public void clearMenu() {
        meals.clear();
    }
}
