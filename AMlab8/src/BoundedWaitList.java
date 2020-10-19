import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E> {

    private final int capacity;

    BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "content=" + content +
                '}';
    }
}
