package ua.goit.modul.modul10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 200, 5", "3", "3"};
        List<Integer> list = Arrays.stream(array)
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());
        System.out.println(list);
    }
}
