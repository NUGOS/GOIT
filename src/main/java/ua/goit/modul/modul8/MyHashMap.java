package ua.goit.modul.modul8;

import java.util.Objects;

public class MyHashMap<K, V> {

    private int capacity = 16;

    private MyNode<K, V>[] table;

    private int size;

    public MyHashMap() {
        table = new MyNode[capacity];
    }

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        table = new MyNode[capacity];
    }

    class MyNode<K, V> {

        private K key;
        private V value;
        private MyNode<K, V> next;

        public MyNode(K key, V value, MyNode<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public MyNode getNext() {
            return next;
        }

        public void setNext(MyNode<K, V> next) {
            this.next = next;
        }

        @Override
        public final boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyNode<?, ?> that = (MyNode<?, ?>) o;
            return Objects.equals( key, that.key );
        }

        @Override
        public final int hashCode() {
            return Objects.hashCode( key );
        }
    }

    public void put(String key, String value) {
        int index = index((K) key);
        MyNode newMyNode = new MyNode( key, value, null );
        if (table[index] == null) {
            table[index] = newMyNode;
        } else {
            MyNode<K, V> previousNode = null;
            MyNode<K, V> currentNode = table[index];
            while (currentNode != null) {
                if (currentNode.getKey().equals( key )) {
                    currentNode.setValue((V) value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (previousNode != null)
                previousNode.setNext( newMyNode );
        }
        size++;
    }

    public V get(K key) {
        V value = null;
        int index = index( key );
        MyNode<K, V> entry = table[index];
        while (entry != null) {
            if (entry.getKey().equals( key )) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    public void remove(K key) {
        int index = index( key );
        MyNode previous = null;
        MyNode entry = table[index];
        while (entry != null) {
            if (entry.getKey().equals( key )) {
                if (previous == null) {
                    entry = entry.getNext();
                    table[index] = entry;
                    size--;
                    return;
                } else {
                    previous.setNext( entry.getNext() );
                    return;
                }
            }
            previous = entry;
            entry = entry.getNext();
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        MyNode<K, V>[] tab;
        if ((tab = table) != null && size > 0) {
            size = 0;
            for (int i = 0; i < tab.length; ++i)
                tab[i] = null;
        }
    }

    private int index(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs( key.hashCode() % capacity );
    }
    public void printMyHashMap() {
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                MyNode<K, V> e = table[i];
                while (e != null) {
                    System.out.println(String.format(e.getKey() +
                            "=" + e.getValue()));
                    e = e.next;
                }
            }
        }
        if (size == 0) {
            System.out.println("null");
        }
    }

}