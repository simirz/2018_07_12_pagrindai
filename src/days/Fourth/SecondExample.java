package days.Fourth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondExample {
    //is konsoles irasyti 5 vardus i lista ir atspausdinti surikiuotus

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Irasykite " + i + " varda");
            String name = scanner.nextLine();
            names.add(name);
        }
        Collections.sort(names);
        names.forEach(System.out :: println);


    }
}

