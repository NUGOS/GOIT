package ua.goit.modul.modul10;
import java.util.Arrays;
import java.util.List;
/**
* Created by danil.kuznetsov
*/
public class ListExample {
   public static void main(String... args) {
       List<String> colors = Arrays.asList("red", "yellow",  "blue", "black", "orange", "white","green");

       colors.stream().forEach(color -> printItemList(color));
       // JDK 8 streaming example method reference
       colors.stream().forEach(ListExample::printItemList);
       // JDK 8 for each with lambda
       colors.forEach(color -> printItemList(color));
       // JDK 8 for each
       colors.forEach(ListExample::printItemList);
   }
   private static void printItemList(String color) {
       System.out.println("color: " + color);
   }
}