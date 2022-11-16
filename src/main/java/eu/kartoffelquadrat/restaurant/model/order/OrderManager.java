package eu.kartoffelquadrat.restaurant.model.order;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 * Singleton class that manages all orders.
 */
@Component
public class OrderManager implements OrderManagerInterface {
  private final List<Order> orders = new ArrayList<>();

  private OrderManager() {
  }

  @Override
  public List<String> getAllOrders() {
    return orders.stream().map(Order::getDish).collect(Collectors.toList());
  }

  @Override
  public Order getOrder(int orderId) {
    for (Order order : orders) {
      if (order.getId() == orderId) {
        return order;
      }
    }
    throw new NoSuchElementException(String.format("No order with id %d", orderId));
  }

  @Override
  public void createOrder(String name, String dish, String address) {
    orders.add(new Order(name, dish, address));
  }
}
