public class Order {
    Dish dish;
    Drink drink;

    public Order(Dish dish, Drink drink) {
        this.dish = dish;
        this.drink = drink;
    }

    public Dish getDish() {
        return dish;
    }

    public Drink getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "Order{" +
                "dish=" + dish +
                ", drink=" + drink +
                '}';
    }
}
