public class Dish {
    private final int price;
    private final String name;
    private final String description;
    private final int ZERO = 0;

    public Dish(String name, String description){
        this.name = name;
        this.description = description;
        this.price = ZERO;
    }

    public Dish(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
