package ua.goit.modul.modul10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnStringOddIndexAndSortUppercase {
    private static String result;

    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Ivan", "John", "Peter", "Bill");
        ReturnStringOddIndex(namesList);
        System.out.println(result);
        int s = 0;
        System.out.println(s % 2);
    }

    public static String ReturnStringOddIndex(List<String> namesList) {

        for (int i = 0; i < namesList.size(); i++) {
            if (i % 2 == 0) {
                namesList.remove(i);
            }
        }
        result = namesList.stream()
                          .collect(Collectors.joining(", "));
        return result;
    }

}
