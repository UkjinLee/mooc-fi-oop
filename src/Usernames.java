import java.util.Scanner;

//Type your username: alex
//Type your password: mightyducks
//You are now logged into the system!
//
//Type your username: emily
//Type your password: cat
//You are now logged into the system!
//
//Type your username: emily
//Type your password: dog
//Your username or password was invalid!

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String username = reader.nextLine();

        System.out.print("Type your password: ");
        String password = reader.nextLine();

        if ((username.equals("alex") && password.equals("mightyducks"))
                || (username.equals("emily") && password.equals("cat")))
            System.out.println("You are now logged into the system!");
        else
            System.out.println("Your username or password was invalid!");
    }
}
