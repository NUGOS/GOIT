package ua.goit.modul.modul10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnStringSort {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Ivan", "John", "Peter", "Bill");
        System.out.println(ReturnStringSort(namesList));
    }

    public static String ReturnStringSort(List<String> namesList) {
        String resultsort = namesList.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
        return resultsort;
    }
}
