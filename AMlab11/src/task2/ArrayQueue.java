package task2;

import java.util.NoSuchElementException;

public class ArrayQueue<E> extends AbstractQueue<E> {
    private E[] array;
    private int size;
    private int capacity;
    private E first;
    private E last;

    public ArrayQueue(int capacity) {
        first = null;
        last = null;
        this.capacity = capacity;
        size = 0;
        array = (E[]) new Object[capacity];
    }

    @Override
    void add(E element) {
        if (size < capacity) {
            array[size] = element;
            size++;
        }
    }

    @Override
    E element() {
        if (size != 0){
            return array[0];
        } else {
            throw new NoSuchElementException("Queue is empty");
        }
    }

    @Override
    boolean offer(E element) {
        if (size < capacity) {
            array[size] = element;
            size++;
            return true;
        } else {
            return false;
        }
    }

    void clear() {
        array = (E[]) new Object[0];
        size = 0;
    }

    @Override
    E peek() {
        if (size != 0) {
            return array[0];
        }
        return null;
    }

    @Override
    E poll() {
        if (size != 0) {
            E temp = array[0];
            if (size - 1 >= 0) System.arraycopy(array, 1, array, 0, size - 1);
            size--;
            return temp;
        }
        return null;
    }

    @Override
    E remove() {
            E temp = array[0];
            if (size - 1 >= 0) System.arraycopy(array, 1, array, 0, size - 1);
            size--;
            return temp;
    }

    public String toString() {
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }
        return "ArrayQueue is empty";
    }

}
