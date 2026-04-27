// WAP to find maximum value in  a list of integers using stream.

import java.util.*;
public class MaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 9, 3);
        Optional<Integer> maxValue = list.stream().max(Integer::compareTo);
        System.out.println("Maximum value in the list: " + maxValue.orElse(null));
    }
}
