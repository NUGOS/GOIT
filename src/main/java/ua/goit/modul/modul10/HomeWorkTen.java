package ua.goit.modul.modul10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnStringOddIndexAndSortUppercase {

    public static void main(String[] args) {
        List<Names> namesListObject = Arrays.asList(new Names(1, "Ivan"),
                new Names(2, "John"),
                new Names(3, "Peter"),
                new Names(4, "Bill"));
        List<String> nameListString = Arrays.asList("Ivan", "John", "Peter", "Bill", "Rodrigo", "Yen", "David");

        System.out.println(ReturnStringOddIndex(namesListObject));
        System.out.println(ReturnStringSort(nameListString));
    }

    public static String ReturnStringOddIndex(List<Names> namesList) {

        String result = namesList.stream()
                                 .filter(person -> person.getId() % 2 != 0)
                                 .map(Names::toString)
                                 .collect(Collectors.joining(", "));

        return result;
    }

    public static String ReturnStringSort(List<String> nameListString) {
        String resultsort = nameListString.stream()
                                          .map(String::toUpperCase)
                                          .sorted(Comparator.reverseOrder())
                                          .collect(Collectors.joining(", "));
        return resultsort;
    }

    static class Names {
        private int id;
        private String name;

        public Names(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return id + ". " + name;
        }
    }

}

