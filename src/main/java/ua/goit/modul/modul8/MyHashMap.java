package ua.goit.modul.modul8;

import java.util.Arrays;

public class MyHashMap<K, V> {
    private int size;
    private MyNode<K, V>[] table;
    private int capacity = 16;
    private float loadFactor = 0.75f;

    MyHashMap() {
        table = new MyNode[capacity];
    }

    private int keyHash(K key) {
        return (key == null) ? 0 : key.hashCode() % capacity + 1;
    }

    //добавляет пару ключ + значение
    public void put(K key, V value) {
        int keyHash = keyHash(key);
        if (size > table.length * loadFactor) {
            MyNode<K, V>[] newTable = Arrays.copyOf(table, table.length * 2);
            table = newTable;
        }

        MyNode<K, V> newNode = new MyNode<>(key, value, null);
        if (table[keyHash] == null) {
            table[keyHash] = newNode;
            size++;
        } else {
            MyNode prev = null;
            MyNode item = table[keyHash];

            while (item != null) {
                if (item.key.equals(key)) {
                    item.value = value;
                }
            }
            prev = item;
            item = item.next;
            size++;
        }
    }

    //удаляет пару по ключу
    public void remove(K key) {
        table[keyHash(key)] = null;
    }

    //очищает коллекцию
    public void clear() {
        table = new MyNode[capacity];
        size = 0;
    }

    //возвращает размер коллекции
    public int size() {
        return size;
    }

    //возвращает значение(Object value) по ключу
    public MyNode<K, V> get(K key) {
        int keyHash = keyHash(key);
        MyNode node = table[keyHash];
        while (node != null) {
            if (node.key.equals(key)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    void printMyHashMap() {
        System.out.println(Arrays.toString(table));
    }
}

class MyNode<K, V> {
    K key;
    V value;
    MyNode<K, V> next;

    MyNode(K key, V value, MyNode<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}