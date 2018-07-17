package days.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Extra_ketvirtospaskaitos {

    public static void main(String[] args) {
        Set<Integer> numb = new TreeSet<>();
        numb.add(5);
        numb.add(3);
        numb.add(12);
        numb.add(7);
        numb.add(8);
        System.out.println(numb.size());
        numb.forEach(System.out::println);

        for (Integer number : numb) {
            if (number >= 5 && number <= 10) {
                System.out.println(number);
            }
        }
    }
}