package DS.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Intro {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<String>();
        strs.add("JAVA");
        strs.add("JS");
        strs.add("Python");

        ArrayList<String> strs2 = new ArrayList<String>();
        strs2.add("Android");
        strs2.add("Web");
        strs2.add("AI");
        strs2.add(1,"Mobile");
        strs2.addAll(0,strs);

        List<String> strs4 = strs2.subList(1,3);
        System.out.println(strs4);

        ArrayList<ArrayList<String>> strs3 = new ArrayList<>();
        strs3.add(strs);
        strs3.add(strs2);
        System.out.println(strs3.get(0).get(1) + "2");
        System.out.println(strs3);
        System.out.println(strs3.get(0));
        System.out.println(strs3.get(1).get(2));


        /*strs.set(1,"Kotlin");
        strs.remove(2);
        strs.clear();*/

        for (String str : strs) {
            System.out.println(str);
        }



    }
}
