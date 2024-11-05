package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CounterJava {
    public static Map<Integer, Integer> countElements(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(
                        element -> element,
                        Collectors.collectingAndThen(
                                Collectors.counting(),
                                Long::intValue
                        )
                ));
    }
}
