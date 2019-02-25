import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class exercise4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        OptionalDouble avNum = numbers.stream()
                .filter(n -> n > 0)
                .mapToDouble(Integer::intValue)
                .average();
        System.out.println(avNum);
    }
}