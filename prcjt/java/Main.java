import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> atLeast5 = x -> x > 5;
        Stream.of("a", "b", "hello")
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

    }
}
