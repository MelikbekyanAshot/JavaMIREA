package task2;

public class Test {
    public static void main(String[] args) {
        System.out.println("LinkedQueue Test");
        LinkedQueue<Integer> queue = new LinkedQueue<>(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        queue.remove();
        System.out.println("remove(): " + queue);
        System.out.println("element(): " + queue.element());
        System.out.println("poll(): " + queue.poll());
        System.out.println("peek(): " + queue);
        System.out.println("getSize(): " + queue.getSize());
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }

        System.out.println("\n\nArrayQueue Test");
        ArrayQueue<Integer> array = new ArrayQueue<>(5);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println(array);
        array.offer(6);
        System.out.println("element(): " + array.element());
        System.out.println("offer(): " + array);
        System.out.println("poll(): " + array.poll());
        System.out.println(array);
        System.out.println(array.peek());
        System.out.println(array);
        array.clear();
        System.out.println("clear(): " + array);
    }
}
