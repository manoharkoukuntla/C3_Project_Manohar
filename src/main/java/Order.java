import java.util.List;

public class Order {
    private Restaurant restaurant;
    private List<Item> items;
    private double cost = 0;

    public Order(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setItems(List<Item> items) {
        for (Item item : items){
            cost += item.getPrice();
        }
    }

    public double getCost() {
        return cost;
    }
}
