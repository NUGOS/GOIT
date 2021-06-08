package ua.goit.modul.modul8;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("\u001B[31m Print MyArrayList \u001B[0m");
        new PrintCollectionTest().PrintCollectionMyArrayList();
        System.out.println("\u001B[31m Print MyQueue \u001B[0m");
        new PrintCollectionTest().PrintCollectionMyQueue();
        System.out.println("\u001B[31m Print MyHashMap \u001B[0m");
        new PrintCollectionTest().PrintCollectionMyHashMap();
        System.out.println("\u001B[31m Print MyLinkedList \u001B[0m");
        new PrintCollectionTest().PrintCollectionMyLinkedList();
        System.out.println("\u001B[31m Print MyStack \u001B[0m");
        new PrintCollectionTest().PrintCollectionMyStack();
    }
}
