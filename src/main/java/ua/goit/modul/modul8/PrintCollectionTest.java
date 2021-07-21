package ua.goit.modul.modul8;

public class PrintCollectionTest {
    public void PrintCollectionMyArrayList() {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        // add values in Array
        System.out.println("\u001B[32m ***add values in Array*** \u001B[0m");
        myArrayList.add("alpha");
        myArrayList.add("beta");
        myArrayList.add("gamma");
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
        myArrayList.add("alpha");
        myArrayList.add("beta");
        myArrayList.add("gamma");
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        System.out.println(myArrayList);
    }

    public void PrintCollectionMyQueue() {
        MyQueue<String> myQueue = new MyQueue<>();

        System.out.println("\u001B[32m ***add values in Queue*** \u001B[0m");
        myQueue.add("alpha");
        myQueue.add("beta");
        myQueue.add("gamma");
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
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        System.out.println("\u001B[32m ***add key and value*** \u001B[0m");
        myHashMap.put("1", "alpha");
        myHashMap.put("2", "beta");
        myHashMap.put("3", "gamma");
        myHashMap.printMyHashMap();
        System.out.println("\u001B[32m ***size myHashMap*** \u001B[0m");
        System.out.println(myHashMap.size());
        System.out.println("\u001B[32m ***returns the Object value by key 3*** \u001B[0m");
        System.out.println(myHashMap.get("3"));
        System.out.println("\u001B[32m ***removes a key pair 2*** \u001B[0m");
        System.out.println("before");
        myHashMap.printMyHashMap();
        myHashMap.remove("2");
        System.out.println("after");
        myHashMap.printMyHashMap();
        System.out.println("\u001B[32m ***print MyHashMap*** \u001B[0m");
        myHashMap.printMyHashMap();
        System.out.println("\u001B[32m ***clear MyHashMap*** \u001B[0m");
        myHashMap.clear();
        myHashMap.printMyHashMap();
        System.out.println("\u001B[32m ***size myHashMap*** \u001B[0m");
        System.out.println(myHashMap.size());
    }

    public void PrintCollectionMyLinkedList() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        System.out.println("\u001B[32m ***add value in myLinkedList*** \u001B[0m");
        myLinkedList.add("alpha");
        myLinkedList.add("beta");
        myLinkedList.add("gamma");
        System.out.println(myLinkedList);
        System.out.println("\u001B[32m ***returns the element at the index 2*** \u001B[0m");
        System.out.println(myLinkedList.get(2));
        System.out.println("\u001B[32m ***size myLinkedList*** \u001B[0m");
        System.out.println(myLinkedList.size());
        System.out.println("\u001B[32m ***remove index 1 myLinkedList*** \u001B[0m");
        myLinkedList.remove(1);
        System.out.println("\u001B[32m ***print myLinkedList*** \u001B[0m");
        System.out.println(myLinkedList);
        System.out.println("\u001B[32m ***size myLinkedList*** \u001B[0m");
        System.out.println(myLinkedList.size());
        System.out.println("\u001B[32m ***clear myLinkedList*** \u001B[0m");
        myLinkedList.clear();
        System.out.println("\u001B[32m ***size myLinkedList*** \u001B[0m");
        System.out.println(myLinkedList.size());
    }

    public void PrintCollectionMyStack() {
        MyStack<Object> myStack = new MyStack<>();
        System.out.println("\u001B[32m ***add value in myStack*** \u001B[0m");
        myStack.push("alpha");
        myStack.push("beta");
        myStack.push("gamma");
        System.out.println(myStack);
        System.out.println("\u001B[32m ***size myStack*** \u001B[0m");
        System.out.println(myStack.size());
        System.out.println("\u001B[32m ***remove index in myStack*** \u001B[0m");
        myStack.remove(1);
        System.out.println(myStack);
        System.out.println("\u001B[32m ***returns the first element in myStack*** \u001B[0m");
        System.out.println(myStack.peek());
        System.out.println("\u001B[32m ***returns the first element and then removes it in the myStack*** \u001B[0m");
        System.out.println(myStack.pop());
        System.out.println(myStack + " - myStack");
        System.out.println("\u001B[32m ***clear myStack*** \u001B[0m");
        myStack.clear();
        System.out.println(myStack.size()+" - size myStack");
    }
}
