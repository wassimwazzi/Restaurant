package eu.kartoffelquadrat.restaurant.model.order;

import java.util.List;

/**
 * Manages  the orders.
 */
public interface OrderManagerInterface {
  List<String> getAllOrders();

  Order getOrder(int orderId);

  void createOrder(String name, String dish, String address);
}
