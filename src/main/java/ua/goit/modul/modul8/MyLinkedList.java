package ua.goit.modul.modul8;

import java.util.Arrays;


public class MyLinkedList<E> {

    static class MyNode<E> {
        private E current;
        private MyNode<E> next;
        private MyNode<E> prev;

        MyNode(MyNode<E> prev, E element, MyNode<E> next) {
            this.setCurrent(element);
            this.setNext(next);
            this.setPrev(prev);
        }

        public E getCurrent() {
            return current;
        }

        public void setCurrent(E current) {
            this.current = current;
        }

        public MyNode<E> getNext() {
            return next;
        }

        public void setNext(MyNode<E> next) {
            this.next = next;
        }

        public MyNode<E> getPrev() {
            return prev;
        }

        public void setPrev(MyNode<E> prev) {
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
            lastTemp.setNext(newNode);
        }
        size++;
    }

    public E remove(int index) {
        checkIndexElement( index );
        return unlink( findIndex( index ) );
    }

    E unlink(MyNode<E> deleteElement) {
        final E element = deleteElement.getCurrent();
        final MyNode<E> next = deleteElement.getNext();
        final MyNode<E> prev = deleteElement.getPrev();

        if (prev == null) {
            first = next;
        } else {
            prev.setNext(next);
            deleteElement.setPrev(null);
        }

        if (next == null) {
            last = prev;
        } else {
            next.setPrev(prev);
            deleteElement.setNext(null);
        }

        deleteElement.setCurrent(null);
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
        return findIndex(index).getCurrent();
    }

    private void checkIndexElement(int index) {
        if (!isCorrectIndex( index )) {
            throw new IndexOutOfBoundsException();
        }
    }

    MyNode<E> findIndex(int index) {
        MyNode<E> findingIndex = first;
        for (int i = 0; i < index; i++) {
            findingIndex = findingIndex.getNext();
        }
        return findingIndex;
    }

    public E[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (MyLinkedList.MyNode<E> x = first; x != null; x = x.getNext())
            result[i++] = x.getCurrent();
        return (E[]) result;
    }

    @Override
    public String toString() {
        return Arrays.toString( toArray() );
    }
}
