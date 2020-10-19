import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Базоый класс, от которго наследуются BoundedWaitList и UnfairWaitList
 * @param <E>
 */
public abstract class WaitList<E> implements IWaitList<E> {

    protected ConcurrentLinkedDeque<E> content;

    /**
     * Конструктор
     */
    public WaitList(){
        content = new ConcurrentLinkedDeque<>();
    }

    /**
     * Параметризированный констуктор
     * @param c очередь
     */
    public WaitList(Collection<E> c) {
        content = (ConcurrentLinkedDeque<E>) c;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    /**
     * @param element элемент, котоый необходимо добавить
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     * Удаляет перый элемент очереди
     */
    @Override
    public void remove() {
        content.removeFirst();
    }

    /**
     * Проверяет, находится ли элемент в очереди
     * @param element искомый элемент
     * @return true, если очередь содержит искомый элемент; false, если очередь не содержит искомый элемент
     */
    @Override
    public boolean contains(E element) {
        for (E e : this.content) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Проверяет, находится ли искомая очередь в другой очереди
     * @param c искомая очередь
     * @return true, если очередь содержит в себе искомую очередь; false, если не содержит
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    /**
     * @return true, если очередь пустая; false, если очередь не пустая
     */
    @Override
    public boolean isEmpty() {
        return content.size() == 0;
    }
}
