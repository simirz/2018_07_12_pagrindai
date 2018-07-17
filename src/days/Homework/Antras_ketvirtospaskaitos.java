package days.Homework;

import java.util.*;

public class Antras_ketvirtospaskaitos {
    public static void main(Integer[] args) {
        List<Integer> numb = new ArrayList<>();
        numb.add(3);
        numb.add(8);
        numb.add(12);
        numb.add(9);
        numb.add(7);
        System.out.println(numb.get(0));

        Antras_ketvirtospaskaitos f = new Antras_ketvirtospaskaitos();
        System.out.println(f.getFirst(numb));
        System.out.println(f.getLast(numb));

    }

    private Integer getFirst(List<Integer> numbers) {
        return numbers.get(0);
    }

    private Integer getLast(List<Integer> numbers) {
        return numbers.get(numbers.size() - 1);
    }


}





