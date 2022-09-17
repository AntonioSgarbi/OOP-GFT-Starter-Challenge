package tech.antoniosgarbi.exercicio2.main;

import java.util.Comparator;
import java.util.List;

public class Excercicio2 {
    public static void play() {
        List<Integer> list = List.of(1,2,3);

        list.stream().max(Comparator.comparing(i -> i))
                .ifPresent(maxInt -> System.out.println("Maximum number in the set is " + maxInt));
    }
}
