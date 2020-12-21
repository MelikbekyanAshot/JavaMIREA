public class TablesOrderManager {
    public static int size = 0;
    public static Order[] orders = new Order[25];

    public void add(Order order) {
        orders[size] = order;
        size++;
    }

    public void delete(Order order) {
        for (int i = 0; i < size; i++) {
            if (order.getDish().getName().equals(orders[i].getDish().getName()) &&
                order.getDrink().getName().equals(orders[i].getDrink().getName())) {
                orders[i] = null;
                size--;
                break;
            }
        }
    }

    public void print() {
        for (Order order : orders) {
            if (order != null) {
                System.out.println(order);
            }
        }
    }
}