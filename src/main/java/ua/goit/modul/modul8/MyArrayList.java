package ua.goit.modul.modul8;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayList<T> {
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[10];
        size = 0;
    }

    void add(Object value) //добавляет элемент в конец
    {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy( array, 0, newArray, 0, array.length );
            array = newArray;
        }
        array[size++] = (T) value;
    }

    void remove(int index) //удаляет элемент под индексом
    {
        if (index > size) {
            throw new NoSuchElementException();
        }
        int newSize = size - 1;
        if (newSize > index) {
            System.arraycopy( array, index + 1, array, index, newSize - index );
        }
        array[size = newSize] = null;
    }

    void clear() //очищает коллекцию
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
    }

    int size() //возвращает размер коллекции
    {
        return size;
    }

    public T get(int index) //возвращает элемент под индексом
    {
        return (T) array[index];
    }

    @Override
    public String toString() {
        return Arrays.toString( array );
    }
}
