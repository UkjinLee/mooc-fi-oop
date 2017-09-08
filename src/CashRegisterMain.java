public class CashRegisterMain {

    public static void main(String[] args) {

//        EXERCISE 86.1: THE "STUPID" LYYRA CARD

//        money on the card 10.0
//        money taken: true
//        money on the card 2.0
//        money taken: false
//        money on the card 2.0

        LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance() );
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );


//        EXERCISE 86.2: CASH REGISTER AND PAYING WITH CASH

//        the change was 7.5
//        the change was 2.5
//        the change was 0.0
//        money in register 1009.0 economical lunches sold: 2 gourmet lunches sold: 1

//        CashRegister unicafeExactum = new CashRegister();
//
//        double theChange = unicafeExactum.payEconomical(10);
//        System.out.println("the change was " + theChange );
//
//        theChange = unicafeExactum.payEconomical(5);
//        System.out.println("the change was "  + theChange );
//
//        theChange = unicafeExactum.payGourmet(4);
//        System.out.println("the change was "  + theChange );
//
//        System.out.println( unicafeExactum );


        //    EXERCISE 86.3: PAYING WITH CARD

//        the change was 7.5
//        payment success: true
//        payment success: false
//        payment success: true
//        money in register 1002.5 economical lunches sold: 2 gourmet lunches sold: 1

//        CashRegister unicafeExactum = new CashRegister();
//
//        double theChange = unicafeExactum.payEconomical(10);
//        System.out.println("the change was " + theChange );
//
//        LyyraCard cardOfJim = new LyyraCard(7);
//
//        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//        succeeded = unicafeExactum.payGourmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//        succeeded = unicafeExactum.payEconomical(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//
//        System.out.println( unicafeExactum );


//        EXERCISE 86.4: LOADING MONEY

//        money in register 1000.0 economical lunches sold: 0 gourmet lunches sold: 0
//        money on the card 2.0 euros
//        payment success: false
//        payment success: true
//        the card balance 98.0 euros
//        money in register 1100.0 economical lunches sold: 0 gourmet lunches sold: 1

//        CashRegister unicafeExactum = new CashRegister();
//        System.out.println( unicafeExactum );
//
//        LyyraCard cardOfJim = new LyyraCard(2);
//
//        System.out.println("the card balance " + cardOfJim.balance() + " euros");
//
//        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//
//        unicafeExactum.loadMoneyToCard(cardOfJim, 100);
//
//        succeeded = unicafeExactum.payGourmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//
//        System.out.println("the card balance " + cardOfJim.balance() + " euros");
//
//        System.out.println( unicafeExactum );
    }
}
