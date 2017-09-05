package week4;

import java.util.Random;

public class PasswordRandomizer {

    String seed = "abcdefghijklmnopqrstuvwxyz";
    int length;
    Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
    }

//    returns a new password, which consists of symbols a-z
//    and is of the length given as a parameter to the constructor
    public String createPassword() {
        String password = "";
        int seedLength = seed.length();
        for (int i = 0; i < length; i++) {
            password += seed.charAt(random.nextInt(seedLength));
        }
        return password;
    }
}
