import java.util.Scanner;

//      Type your name: Paul
//      In reverse order: luaP
//
//      Type your name: Catherine
//      In reverse order: enirehtaC

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        System.out.print("In reverse order: ");
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
