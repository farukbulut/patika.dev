package bulut.com.week5.lambdas;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).map(n -> n * 2).forEach(System.out::println);
    }
}
