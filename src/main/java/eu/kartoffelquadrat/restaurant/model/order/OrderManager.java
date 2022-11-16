package eu.kartoffelquadrat.restaurant.model.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import org.springframework.stereotype.Component;

/**
 * Singleton class that manages all orders.
 */
@Component
public class OrderManager implements OrderManagerInterface {
  private final HashMap<Integer, Order> orders = new HashMap<>();

  public OrderManager() {
  }

  @Override
  public List<Order> getAllOrders() {
    return new ArrayList<>(orders.values());
  }

  @Override
  public Order getOrder(int orderId) {
    if (orders.containsKey(orderId)) {
      return orders.get(orderId);
    }
    throw new NoSuchElementException(String.format("No order with id %d", orderId));
  }

  @Override
  public int createOrder(String name, String dish, String address) {
    int id = new Random().nextInt(1, Integer.MAX_VALUE);
    orders.put(id, new Order(name, dish, address, id));
    return id;
  }
}
