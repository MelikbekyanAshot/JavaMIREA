/**
 * Шаблонный класс BoundedWaitList, реализующий список ожидания с ограниченной вместимостью.
 */

public class BoundedWaitList<E> extends WaitList<E> {

    /**
     * Поле, обозначающее вместимость очереди
     */
    private final int capacity;

    /**
     * Конструктор, определяющий вместимость очереди
     * @param capacity вместимость очереди
     */
    BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return вместимость очереди
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Добавляет элемент в очередь
     * @param element объект, который необходимо добавить в очередь
     */
    @Override
    public void add(E element) {
        if (content.size() < getCapacity()) {
            super.add(element);
        }
    }

    /**
     * @return вывод типа очереди и ее содержимого
     */
    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "content=" + content +
                '}';
    }
}
