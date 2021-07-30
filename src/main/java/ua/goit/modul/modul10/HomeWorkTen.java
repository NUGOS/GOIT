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
        String[] array = {"1, 2, 0", "4, 200, 5", "3", "3"};
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
        System.out.print("\u001B[32m ***Task #5*** \u001B[0m");
        System.out.println("\u001B[31m Print zip Stream \u001B[0m");
        Stream<String> first = Stream.of("A", "B", "C");
        Stream<String> second = Stream.of("1", "2", "3", "4");
        zip(first, second).forEach(System.out::print);

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
        return nameListString.stream()
                             .map(String::toUpperCase)
                             .sorted(Comparator.reverseOrder())
                             .collect(Collectors.joining(", "));
    }

    // Task 3 - тут чет по условию непонятно, что нужно вернуть по тексту похоже на String.

    public static List<Integer> ReturnStringSortArray(String[] array) {
        List<String> numbersList = Arrays.asList(array);
        String number = String.join(", ", numbersList);
        return Arrays.stream(number.split(", "))
                     .map(Integer::parseInt)
                     .sorted(Comparator.naturalOrder())
                     .collect(Collectors.toList());
    }

    //Task 4

    public static Stream<Long> LongStream(long a, long c, long m, long seed, int limit) {
        return Stream.iterate(seed, n -> (a * n + c) % m)
                     .limit(limit);
    }

    //Task 5
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterate = first.iterator();
        Iterator<T> secondIterate = second.iterator();
        Stream<T> result = Stream.empty();
        while (firstIterate.hasNext() & secondIterate.hasNext()) {
            result = Stream.concat(result, Stream.of(firstIterate.next(),
                    secondIterate.next()));
        }
        return result;
    }
}

