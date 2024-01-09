package Java8;

import java.util.Arrays;
import java.util.List;

public class Java8exm {
    // public static void main(String[] args) {
    //     // System.out.println(isPrime(7));
    //     List<Double> SqrtNum = Stream.iterate(1, i -> i + 1)
    //             .filter(Java8exm::isPrime).peek(System.out::println)
    //             .map(Math::sqrt)
    //             .limit(10)
    //             .collect(Collectors.toList());

    //     System.out.println(SqrtNum);
    // }

    // static boolean isPrime(int n) {
    //     return n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0);
    // }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Shubham", "Shubham2", "Shubham3", "Shubham4");

        // Consumer<String> con = t -> System.out.println(t);

        list.forEach(t -> System.out.println(t));
    }
}
