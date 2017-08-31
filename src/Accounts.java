public class Accounts {

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

//        1)
//        1. creates an account with the balance of 100.0
//        2. deposits 20.0
//        3. prints the account

        Account account = new Account("Ukjin", 100);
        account.deposit(20);
        System.out.println(account);

//        2)
//        1. Creates an account named "Matt's account" with the balance of 1000
//        2. Creates an account named "My account" with the balance of 0
//        3. Withdraws 100.0 from Matt's account
//        4. Deposits 100.0 to My account
//        5. Prints both accounts

        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        mattAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattAccount);
        System.out.println(myAccount);

//        3)
//        public static void transfer(Account from, Account to, double howMuch)
//        1. Creates an account "A" with the balance of 100.0
//        2. Creates an account "B" with the balance of 0.0
//        3. Creates an account "C" with the balance of 0.0
//        4. Transfers 50.0 from account A to account B
//        5. Transfers 25.0 from account B to account C

        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);
        transfer(a, b, 50);
        transfer(b, c, 25);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
