package task2;

import java.util.NoSuchElementException;

public class LinkedQueue<E> extends AbstractQueue<E> {
    private int size;
    private int capacity;
    private Node first;
    private Node last;

    private class Node {
        private E data;
        private Node next;
    }

    public LinkedQueue() {
        first = null;
        last = null;
        size = 0;
    }

    public LinkedQueue(int capacity) {
        first = null;
        last = null;
        size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getSize() {
        return size;
    }

    @Override
    void add(E element) {
        Node oldLast = last;
        last = new Node();
        last.data = element;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        size++;
    }

    @Override
    E element() {
        if (!isEmpty()){
            return first.data;
        } else {
            throw new NoSuchElementException("Queue is empty");
        }
    }

    @Override
    boolean offer(E element) {
        if (element == null) {
            throw  new NullPointerException("Null object can not br added to this queue");
        }
        if (size < capacity) {
            Node oldLast = last;
            last = new Node();
            last.data = element;
            last.next = null;
            if (isEmpty()) {
                first = last;
            } else {
                oldLast.next = last;
            }
            size++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    E peek() {
        if (!isEmpty()){
            return first.data;
        }
        return null;
    }

    @Override
    E poll() {
        if (!isEmpty()) {
            Node temp = first;
            first = first.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    @Override
    E remove() {
        if (!isEmpty()) {
            Node temp = first;
            first = first.next;
            size--;
            return temp.data;
        } else {
            throw new NoSuchElementException("Queue is empty");
        }
    }

    @Override
    public String toString() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        return "LinkedQueue{" +
                "size=" + size +
                ", capacity=" + capacity + '}';
    }
}
