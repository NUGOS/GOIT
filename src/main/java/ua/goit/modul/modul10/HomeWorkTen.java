package ua.goit.modul.modul10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWorkTen {


    public static void main(String[] args) {

        List<String> nameListString = Arrays.asList("Ivan", "John", "Peter", "Bill", "Rodrigo", "Arnold", "Yen", "David");
        String[] array = {"1, 2, 0", "4, 5"};
        System.out.print("\u001B[32m ***Task #1*** \u001B[0m");
        System.out.println("\u001B[31m Print ReturnStringOddIndex \u001B[0m");
        System.out.println(ReturnStringOddIndex(nameListString));
        System.out.print("\u001B[32m ***Task #2*** \u001B[0m");
        System.out.println("\u001B[31m Print ReturnStringReversSort \u001B[0m");
        System.out.println(ReturnStringReversSort(nameListString));
        System.out.print("\u001B[32m ***Task #3*** \u001B[0m");
        System.out.println("\u001B[31m Print ReturnStringSortArray \u001B[0m");
        System.out.println(ReturnStringSortArray(array));
    }

    /* Task 1 */

    public static String ReturnStringOddIndex(List<String> nameListString) {

        Iterator<String> myIterator = nameListString.stream()
                                                    .iterator();
        StringBuilder result = new StringBuilder("1. " + myIterator.next());

        int i = 2;
        while (myIterator.hasNext()) {
            if (i++ % 2 == 0) {
                myIterator.next();
            } else {
                result
                        .append(", ")
                        .append(i - 1)
                        .append(". ")
                        .append(myIterator.next());
            }
        }
        return result.toString();
    }

    /* Task 2 */

    public static String ReturnStringReversSort(List<String> nameListString) {
        String resultsort = nameListString.stream()
                                          .map(String::toUpperCase)
                                          .sorted(Comparator.reverseOrder())
                                          .collect(Collectors.joining(", "));
        return resultsort;
    }

    /* Task 3 */

    public static String ReturnStringSortArray(String[] array) {
        String numbers = Arrays.stream(array)
                               .collect(Collectors.joining(", "));

        return numbers;
    }

}

