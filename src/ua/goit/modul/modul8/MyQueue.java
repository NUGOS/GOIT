package ua.goit.modul.modul8;

import java.util.NoSuchElementException;

public class MyQueue<E> {
    private Object[] array;

    public MyQueue() {
        this.array = new Object[1];
        this.size = size;
    }

    private int size;

    void add(Object value) //добавляет элемент в конец
    {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy( array, 0, newArray, 0, array.length );
            array = newArray;
        }
        array[size++] = (E) value;
    }

    E remove(int index) //удаляет элемент под индексом
    {
        if (index > size) {
            throw new NoSuchElementException();
        }
        int newSize = size - 1;
        if (newSize > index) {
            System.arraycopy( array, index + 1, array, index, newSize - index );
        }
        array[size = newSize] = null;
        return null;
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

    public E peek() {
        return (E) array[0];
    }

    public E poll() {
        return remove( 0 );

    }

}

