import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        TablesOrderManager table = new TablesOrderManager();
        table.add(new Order(new Dish("potato", "boiled", 120),
                new Drink("Cola", "Zero", 70)));
        table.add(new Order(new Dish("cake", "with banana", 1200),
                new Drink("Juice", "Apple", 50)));
        table.add(new Order(new Dish("Ice Cream", "Strawberry", 110),
                new Drink("Coffee", "Cappuchino", 70)));
        Order order = new Order(new Dish("Ice Cream", "Strawberry", 110),
                new Drink("Coffee", "Cappuchino", 70));

        System.out.println("Before deleting:");
        table.print();
        System.out.println("\nAfter deleting:");
        table.delete(order);
        table.print();
    }
}
