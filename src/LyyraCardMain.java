import java.util.Scanner;

public class LyyraCardMain {

    public static void main(String[] args) {

//        EXERCISE 77.1: CLASS SKELETON
        //    The card has 50.0 euros
//        LyyraCard card = new LyyraCard(50);
//        System.out.println(card);


//        EXERCISE 77.2: PAYING WITH CARD

//        The card has 50.0 euros
//        The card has 47.5 euros
//        The card has 41.0 euros

//        LyyraCard card = new LyyraCard(50);
//        System.out.println(card);
//
//        card.payEconomical();
//        System.out.println(card);
//
//        card.payGourmet();
//        card.payEconomical();
//        System.out.println(card);


//        EXERCISE 77.3: BALANCE NONNEGATIVE

//        The card has 5.0 euros
//        The card has 1.0 euros
//        The card has 1.0 euros

//        LyyraCard card = new LyyraCard(5);
//        System.out.println(card);
//
//        card.payGourmet();
//        System.out.println(card);
//
//        card.payGourmet();
//        System.out.println(card);


//        EXERCISE 77.4: LOADING MONEY TO CARD
//
//        The card has 10.0 euros
//        The card has 25.0 euros
//        The card has 35.0 euros
//        The card has 150.0 euros
//
//        LyyraCard card = new LyyraCard(10);
//        System.out.println(card);
//
//        card.loadMoney(15);
//        System.out.println(card);
//
//        card.loadMoney(10);
//        System.out.println(card);
//
//        card.loadMoney(200);
//        System.out.println(card);


//        EXERCISE 77.5: LOADING A NEGATIVE AMOUNT

//        Pekka: The card has 10.0 euros
//        Pekka: The card has 10.0 euros

//        LyyraCard card = new LyyraCard(10);
//        System.out.println("Pekka: " + card);
//        card.loadMoney(-15);
//        System.out.println("Pekka: " + card);


//        EXERCISE 77.6: MULTIPLE CARDS

//        Pekka: The card has 16.0 euros
//        Brian: The card has 27.5 euros
//        Pekka: The card has 36.0 euros
//        Brian: The card has 23.5 euros
//        Pekka: The card has 31.0 euros
//        Brian: The card has 73.5 euros

//        Creates a LyyraCard for Pekka with initial balance of 20 euros
        LyyraCard cardPekka = new LyyraCard(20);

//        Creates a LyyraCard for Brian with initial balance of 30 euros
        LyyraCard cardBrian = new LyyraCard(30);

//        Pekka buys gourmet lunch
        cardPekka.payGourmet();

//        Brian buys economical lunch
        cardBrian.payEconomical();

//        cards are printed (both on their own row, starting with the name of the card owner)
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

//        Pekka loads 20 euros
        cardPekka.loadMoney(20);

//        Brian buys gourmet lunch
        cardBrian.payGourmet();

//        cards are printed (both on their own row, starting with the name of the card owner)
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

//        Pekka buys economical lunch
        cardPekka.payEconomical();
//        Pekka buys economical lunch
        cardPekka.payEconomical();
//        Brian loads 50 euros
        cardBrian.loadMoney(50);
//        cards are printed (both on their own row, starting with the name of the card owner)
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}
