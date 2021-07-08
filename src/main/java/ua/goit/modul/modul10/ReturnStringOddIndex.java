package ua.goit.modul.modul10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnStringOddIndexAndSortUppercase {

    public static void main(String[] args) {
        List<Names> namesList = Arrays.asList(new Names(1, "Ivan"),
                new Names(2, "John"),
                new Names(3, "Peter"),
                new Names(4, "Bill"));

        System.out.println(ReturnStringOddIndex(namesList));
        System.out.println(ReturnStringSort(namesList));
    }

    public static String ReturnStringOddIndex(List<Names> namesList) {

        String result = namesList.stream()
                .filter(person -> person.getId() % 2 != 0)
                .map(Names::toString)
                .collect(Collectors.joining(", "));

        return result;
    }

   public static String ReturnStringSort(List<Names> namesList) {
        String resultsort = namesList.stream()
                .filter()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
        return resultsort;
    }

    public static class Names {
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

