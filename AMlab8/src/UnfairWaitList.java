import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() {
        content = new ConcurrentLinkedDeque<>();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        content.remove(element);
        content.addLast(element);
    }

}
