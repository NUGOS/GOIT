package ua.goit.modul.modul8;

import java.util.Arrays;


public class MyLinkedList<E> {

    static class MyNode<E> {
        E current;
        MyNode<E> next;
        MyNode<E> prev;

        MyNode(MyNode<E> prev, E element, MyNode<E> next) {
            this.current = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private int size = 0;
    private MyNode<E> first;
    private MyNode<E> last;

    public void add(E element) {
        MyNode<E> lastTemp = last;
        MyNode<E> newNode = new MyNode<>( lastTemp, element, null );
        last = newNode;
        if (lastTemp == null) {
            first = newNode;
        } else {
            lastTemp.next = newNode;
        }
        size++;
    }

    public E remove(int index) {
        checkIndexElement( index );
        return unlink( findIndex( index ) );
    }

    E unlink(MyNode<E> deleteElement) {
        final E element = deleteElement.current;
        final MyNode<E> next = deleteElement.next;
        final MyNode<E> prev = deleteElement.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            deleteElement.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            deleteElement.next = null;
        }

        deleteElement.current = null;
        size--;
        return element;
    }


    private boolean isCorrectIndex(int index) {
        return index >= 0 && index < size;
    }

    public void clear() {
        last = null;
        first = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        checkIndexElement( index );
        return findIndex( index ).current;
    }

    private void checkIndexElement(int index) {
        if (!isCorrectIndex( index )) {
            throw new IndexOutOfBoundsException();
        }
    }

    MyNode<E> findIndex(int index) {
        MyNode<E> findingIndex = first;
        for (int i = 0; i < index; i++) {
            findingIndex = findingIndex.next;
        }
        return findingIndex;
    }

    public E[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (MyLinkedList.MyNode<E> x = first; x != null; x = x.next)
            result[i++] = x.current;
        return (E[]) result;
    }

    @Override
    public String toString() {
        return Arrays.toString( toArray() );
    }
}
