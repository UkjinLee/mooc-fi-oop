package week7;

import java.util.HashMap;
import java.util.Map;

public class Nickname {

    public static void main(String[] args) {

//        matti's nickname is mage
//        mikael's nickname is mixu
//        arto's nickname is arppa

        Map<String, String> nicknames = new HashMap<>();
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");
        for (String name : nicknames.keySet()) {
            System.out.println(name + "'s nickname is " + nicknames.get(name));
        }
    }
}
