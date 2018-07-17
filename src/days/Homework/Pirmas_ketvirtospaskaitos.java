package days.Homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pirmas_ketvirtospaskaitos {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();


        names.add("Petras");
        names.add("Jonas");
        names.add("Simona");
        names.add("Andrius");
        names.add("Paulius");

        for (String name : names) {
            if (name.length() > 6) {
                System.out.println(name);
            }
        }
    }
}