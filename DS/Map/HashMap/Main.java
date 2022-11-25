package DS.Map.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("TR","Turkey");
        hm.put("EN","England");
        hm.put("GR","German");

        hm.replace("GR","Germany");

        for (String hmKey: hm.keySet()) {
            System.out.println(hm.get(hmKey));
        }

        for (String hmKey: hm.keySet()) {
            System.out.println(hmKey);
        }

        for (String hmKey: hm.values()) {
            System.out.println(hmKey);
        }


    }
}
