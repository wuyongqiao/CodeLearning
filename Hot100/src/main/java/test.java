import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        Integer[] ints = {0, 1, 2, 3};
        List<Integer> list = Arrays.asList(ints);

        Optional<Integer> reduce = list.stream().reduce((a, b) -> a + b);
        System.out.println(reduce.get());
        Integer reduce1 = list.stream().reduce(6, (a, b) -> a + b);
        System.out.println(reduce1);
    }
}
