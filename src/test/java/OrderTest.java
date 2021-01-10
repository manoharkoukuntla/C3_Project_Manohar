import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OrderTest {
    Restaurant restaurant;
    Order order;

    @BeforeEach
    public void setUp() {
        LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        restaurant = new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);
        order = new Order(restaurant);

    }

    @Test
    public void set_items_should_update_the_cost_of_the_order(){
        double expectedCost = 119 + 269;
        order.setItems(restaurant.getMenu());

        double costOfOrder = order.getCost();

        assertEquals(expectedCost, costOfOrder);
    }
}
