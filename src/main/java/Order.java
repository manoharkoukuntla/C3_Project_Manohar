import java.util.List;

public class Order {
    private Restaurant restaurant;
    private List<Item> items;
    private double cost = 0;

    public Order(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setItems(List<Item> items) {
       throw new UnsupportedOperationException();
    }

    public double getCost() {
        throw new UnsupportedOperationException();
    }
}
