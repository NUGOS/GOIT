package ua.goit.modul.modul8;

public class PrintCollection {
    public void PrintCollectionMyArrayList() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        // add values in Array
        System.out.println("\u001B[32m ***add values in Array*** \u001B[0m");
        myArrayList.add("My");
        myArrayList.add("Array");
        myArrayList.add("List");
        System.out.println(myArrayList);

        // get size Array
        System.out.println("\u001B[32m ***get size Array*** \u001B[0m");
        System.out.println(myArrayList.size());

        // get index in Array
        System.out.println("\u001B[32m ***get index in Array*** \u001B[0m");
        System.out.println(myArrayList.get(2));

        // remove index in Array
        System.out.println("\u001B[32m ***remove index in Array*** \u001B[0m");
        myArrayList.remove(0);
        System.out.println(myArrayList);

        // clear Array
        System.out.println("\u001B[32m ***clear Array*** \u001B[0m");
        myArrayList.clear();
        System.out.println(myArrayList);

        // new size in Array
        System.out.println("\u001B[32m ***new size in Array*** \u001B[0m");
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");
        myArrayList.add("D");
        myArrayList.add("E");
        System.out.println(myArrayList);
    }

    public void PrintCollectionMyQueue() {
        MyQueue<String> myQueue = new MyQueue<>();

        System.out.println("\u001B[32m ***add values in Queue*** \u001B[0m");
        myQueue.add("My");
        myQueue.add("Queue");
        myQueue.add(1);
        myQueue.add(2);
        System.out.println(myQueue);

        System.out.println("\u001B[32m ***remove index in Queue*** \u001B[0m");
        myQueue.remove(0);
        System.out.println(myQueue);

        System.out.println("\u001B[32m ***get size in the Queue*** \u001B[0m");
        System.out.println("[" + myQueue.size() + "]");

        System.out.println("\u001B[32m ***returns the first item in the queue*** \u001B[0m");
        System.out.println("[" + myQueue.peek() + "]");

        System.out.println("\u001B[32m ***returns the first element and then removes it in the queue*** \u001B[0m");
        System.out.println("[" + myQueue.poll() + "]");
        System.out.println("[" + myQueue + "] - queue output test");

        System.out.println("\u001B[32m ***clear queue*** \u001B[0m");
        myQueue.clear();
        System.out.println(myQueue);
    }
    public void PrintCollectionMyHashMap() {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("First", 1);
        myHashMap.put("Two", 2);
        myHashMap.put("Three", 3);
        myHashMap.put("Four", 4);
        myHashMap.put("Five", 5);
        myHashMap.display();
        System.out.println("******");
        System.out.println("Get value is: " + myHashMap.get("Five"));
        System.out.println("******");
        System.out.println("Size is: " + myHashMap.size());
        System.out.println("******");
        System.out.println("Capacity is: " + myHashMap.table.length);
        System.out.println("******");
        myHashMap.remove("Five");
        myHashMap.display();
        System.out.println("******");
        myHashMap.clear();
        myHashMap.display();
    }
}
