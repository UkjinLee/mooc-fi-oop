import java.util.Scanner;

public class Accounts {

//    1. creates an account with the balance of 100.0
//    2. deposits 20.0 
//    3. prints the account

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        Account account = new Account("Ukjin", 100);
        account.deposit(20);
        System.out.println(account);
    }

}
