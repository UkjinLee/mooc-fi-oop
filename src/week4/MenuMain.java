package week4;

public class MenuMain {

    public static void main(String[] args) {

        Menu menu = new Menu();

        //        EXERCISE 76.2: PRINTING THE MENU
        //
        //        Hamburger
        //        Fish'n'Chips
        //        Sauerkraut
        //
        System.out.println("-------------");
        menu.addMeal("Hamburger");
        menu.addMeal("Fish'n'Chips");
        menu.addMeal("Sauerkraut");
        menu.addMeal("Hamburger");
        menu.printMeals();
        System.out.println("-------------");
        System.out.println();

        // EXERCISE 76.3: CLEARING A MENU
        //
        System.out.println("-------------");
        menu.clearMenu();
        menu.printMeals();
        System.out.println("-------------");
    }
}
