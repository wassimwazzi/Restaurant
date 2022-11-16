package eu.kartoffelquadrat.restaurant.model.order;

import java.util.List;

/**
 * Manages  the orders.
 */
public interface OrderManagerInterface {
  List<Order> getAllOrders();

  Order getOrder(int orderId);

  /**
   * Returns the id of the new order.
   *
   * @param name order name
   * @param dish dish name
   * @param address address
   * @return id
   */
  int createOrder(String name, String dish, String address);
}
