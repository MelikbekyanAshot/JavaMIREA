import java.util.Scanner;
/**
 * Класс для тестирования работоспособности BoundedWaitList и UnfairWaitList
 */
public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Проверка работоспособности класса BoundedWaitList
        System.out.println("Проверка работоспособности ограниченного списка ожидания");
        System.out.println("Введите вместимость очереди");
        int capacity = keyboard.nextInt();
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(capacity);

        // Добавление элементов в очередь
        System.out.println("Добавление элементов в очередь");
        System.out.println("Введите элементы очереди");
        for (int i = 0; i < capacity; i++) {
            boundedWaitList.add(keyboard.next());
        }
        System.out.println(boundedWaitList);

        // Удаление первого элемента очереди
        System.out.println("Удаление первого элемента очереди");
        boundedWaitList.remove();
        System.out.println(boundedWaitList);

        // Проверка наличия элемента в очереди
        System.out.println("Проверка наличия элемента в очереди");
        System.out.println("Введите искомое слово: ");
        String key = keyboard.next();
        if (boundedWaitList.contains(key)) {
            System.out.println("Элемент найден");
        } else {
            System.out.println("Элемент не найден");
        }

        // Проверка наличия очереди внутри другой очереди
        System.out.println("Проверка наличия очереди элементов внутри другой очереди элементов");
        System.out.println("Введите количество элементов внутри искомой очереди");
        capacity = keyboard.nextInt();
        BoundedWaitList<String> searchList = new BoundedWaitList<>(capacity);
        System.out.println("Введите элементы искомой очереди");
        for (int i = 0; i < capacity; i++) {
            searchList.add(keyboard.next());
        }
        if (boundedWaitList.containsAll(searchList.content)) {
            System.out.println("Очередь найдена");
        } else {
            System.out.println("Очередь не найдена");
        }

        // Проверка очереди на пустоту
        System.out.println("Проверка очереди на пустоту");
        if (boundedWaitList.isEmpty()) {
            System.out.println("Очередь пустая");
        } else {
            System.out.println("Очередь не пустая");
        }


        // Проверка работоспособности класса UnfairWaitList
        System.out.println("\n\nПроверка работоспособности неограниченной очереди");
        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();

        // Добавление элементов в очередь
        System.out.println("Добавление элементов в очередь");
        System.out.println("Сколько элементов необходимо добавить?");
        capacity = keyboard.nextInt();
        System.out.println("Введите элементы очереди");
        for (int i = 0; i < capacity; i++) {
            unfairWaitList.add(keyboard.next());
        }
        System.out.println(unfairWaitList);

        // Удаление заданного элемента из очереди
        System.out.println("Удаление элемента из очереди");
        System.out.println("Введите название элемента, который необходимо удалить");
        key = keyboard.next();
        unfairWaitList.remove(key);
        System.out.println(unfairWaitList);

        // Перенос элемента в конец очереди
        System.out.println("Перенос элемента в конец очереди");
        System.out.println("Какой элемент необходимо перенести в конец очереди?");
        key = keyboard.next();
        unfairWaitList.moveToBack(key);
        System.out.println(unfairWaitList);
    }
}
