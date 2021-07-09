package ua.goit.modul.modul10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        System.out.print("\u001B[32m ***Task #4*** \u001B[0m");
        System.out.println("\u001B[31m Print LongStream (Для теста задан limit) \u001B[0m");
        System.out.println((LongStream(25214903917L, 11L, (long) Math.pow(2, 48), 44L, 10)).collect(Collectors.toList()));


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

    // Task 3 - тут чет по условию непонятно, что нужно вернуть по тексту похоже на String.
    // Скоре всего нужно дорабтывать и работать не со стрингой, а с интами и их сортировать,
    // так как стринг 10 будет после единицы что не есть корректным

    public static String ReturnStringSortArray(String[] array) {
        List<String> numbersList = Arrays.asList(array);
        String number = numbersList.stream()
                .collect(Collectors.joining(", "));

        String[] numberList = number.replaceAll("\\s+", "").split(",");
        String numberSorted = Arrays.stream(numberList)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(","));
        return numberSorted;
    }

    //Task 4

    public static Stream<Long> LongStream(long a, long c, long m, long seed, int limit) {
        return Stream.iterate(seed, n -> (a * n + c) % m).limit(limit);


    }

    //Task 5

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        return null;
    }
}

