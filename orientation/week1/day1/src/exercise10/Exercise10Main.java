package exercise10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise10Main {
    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Lola", "Green", 1));
        foxes.add(new Fox("Fullchrome", "Red", 2));
        foxes.add(new Fox("Joker", "Blue", 1));
        foxes.add(new Fox("Killer", "Green", 3));

        foxes.stream()
                .filter(fox -> fox.color=="Green")
                .forEach(System.out::println);

        System.out.println("");

        foxes.stream()
                .filter(fox -> fox.getColor()=="Green" && fox.getAge()<5)
                .forEach(System.out::println);

        System.out.println("");

        long count = foxes.stream()

                .count();
        System.out.println(count);
    }
}
