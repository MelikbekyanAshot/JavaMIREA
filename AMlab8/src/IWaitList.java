import java.util.Collection;

/**
 * Шаблонный интерфейс, от которого имплементируется базовый класс очереди ожидания
 * @param <E>
 */

public interface
IWaitList<E> {

    /**
     * Добавляет элемент в очередь
     * @param element элемент, котоый необходимо добавить
     */
    void add(E element);

    /**
     * Удаляет элемент из очереди
     */
    void remove();

    /**
     * Проверяет, находится ли элемент в очереди
     * @param element искомый элемент
     * @return true, если очередь содержит искомый элемент; false, если очередь не содержит искомый элемент
     */
    boolean contains(E element);

    /**
     * Проверяет, находится ли искомая очередь в другой очереди
     * @param c искомая очередь
     * @return true, если очередь содержит в себе искомую очередь; false, если не содержит
     */
    boolean containsAll(Collection<E> c);

    /**
     * @return true, если очередь пустая; false, если очередь не пустая
     */
    boolean isEmpty();

}
