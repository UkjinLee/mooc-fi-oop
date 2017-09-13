package week5;

public class TeamMain {
    public static void main(String[] args) {

//        EXERCISE 90.1: CLASS TEAM

//        week5.Team: FC Barcelona

//        week5.Team barcelona = new week5.Team("FC Barcelona");
//        System.out.println("week5.Team: " + barcelona.getName());


//        EXERCISE 90.2: PLAYER

//        week5.Team: FC Barcelona
//        week5.Player: Brian, goals 0
//        week5.Player: Pekka, goals 39

//        week5.Team barcelona = new week5.Team("FC Barcelona");
//        System.out.println("week5.Team: " + barcelona.getName());
//
//        week5.Player brian = new week5.Player("Brian");
//        System.out.println("week5.Player: " + brian);
//
//        week5.Player pekka = new week5.Player("Pekka", 39);
//        System.out.println("week5.Player: " + pekka);


//        EXERCISE 90.3: ADDING PLAYERS TO A TEAM

//        Brian, goals 0
//        Pekka, goals 39
//        Mikael, goals 1

//        week5.Team barcelona = new week5.Team("FC Barcelona");
//
//        week5.Player brian = new week5.Player("Brian");
//        week5.Player pekka = new week5.Player("Pekka", 39);
//
//        barcelona.addPlayer(brian);
//        barcelona.addPlayer(pekka);
//        barcelona.addPlayer(new week5.Player("Mikael", 1)); // works similarly as the above
//
//        barcelona.printPlayers();


//        EXERCISE 90.4: THE TEAM MAXIMUM SIZE AND CURRENT SIZE

//        Number of players: 1

//        week5.Team barcelona = new week5.Team("FC Barcelona");
//        barcelona.setMaxSize(1);
//
//        week5.Player brian = new week5.Player("Brian");
//        week5.Player pekka = new week5.Player("Pekka", 39);
//        barcelona.addPlayer(brian);
//        barcelona.addPlayer(pekka);
//        barcelona.addPlayer(new week5.Player("Mikael", 1)); // works similarly as the above
//
//        System.out.println("Number of players: " + barcelona.size());


//        EXERCISE 90.5: GOALS OF A TEAM

//        Total goals: 40

        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());
    }
}
