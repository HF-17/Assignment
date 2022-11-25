package DS.Map.LinkedHashMap;


import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Studentt> students = new LinkedHashMap<>();

        students.put(102, new Studentt(102,"Halil",100));
        students.put(103, new Studentt(102,"Fidan",100));
        students.put(104, new Studentt(102,"Ase",100));

        for (Studentt x: students.values()) {
            System.out.println(x.name);
        }

    }
}
