public class TeamMain {
    public static void main(String[] args) {

//        EXERCISE 90.1: CLASS TEAM

//        Team: FC Barcelona

//        Team barcelona = new Team("FC Barcelona");
//        System.out.println("Team: " + barcelona.getName());


//        EXERCISE 90.2: PLAYER

//        Team: FC Barcelona
//        Player: Brian, goals 0
//        Player: Pekka, goals 39

//        Team barcelona = new Team("FC Barcelona");
//        System.out.println("Team: " + barcelona.getName());
//
//        Player brian = new Player("Brian");
//        System.out.println("Player: " + brian);
//
//        Player pekka = new Player("Pekka", 39);
//        System.out.println("Player: " + pekka);


//        EXERCISE 90.3: ADDING PLAYERS TO A TEAM

//        Brian, goals 0
//        Pekka, goals 39
//        Mikael, goals 1

//        Team barcelona = new Team("FC Barcelona");
//
//        Player brian = new Player("Brian");
//        Player pekka = new Player("Pekka", 39);
//
//        barcelona.addPlayer(brian);
//        barcelona.addPlayer(pekka);
//        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
//
//        barcelona.printPlayers();


//        EXERCISE 90.4: THE TEAM MAXIMUM SIZE AND CURRENT SIZE

//        Number of players: 1

//        Team barcelona = new Team("FC Barcelona");
//        barcelona.setMaxSize(1);
//
//        Player brian = new Player("Brian");
//        Player pekka = new Player("Pekka", 39);
//        barcelona.addPlayer(brian);
//        barcelona.addPlayer(pekka);
//        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
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
