package task2;

public abstract class AbstractQueue<E> {
    abstract void add(E element);

    abstract E element();

    abstract boolean offer(E element);

    abstract E peek();

    abstract E poll();

    abstract E remove();
}
