package ua.goit.modul.modul8;


import java.util.Arrays;

public class MyStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private E[] elements = (E[]) new Object[DEFAULT_CAPACITY];

    public void push(E e) {
        if (size == elements.length) {
            resize();
        }
        this.elements[size] = e;
        this.size++;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, size * 3 / 2);
    }

    public E remove(int index) {
        E value = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        --size;
        return value;
    }

    public void clear() {
        elements = Arrays.copyOf(elements, 0);
        size = 0;
    }

    public int size() {
        return size;
    }

    public E peek() {
        return elements[size - 1];
    }

    public E pop() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}
