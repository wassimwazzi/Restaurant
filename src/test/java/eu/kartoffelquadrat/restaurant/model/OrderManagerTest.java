package eu.kartoffelquadrat.restaurant.model;

import eu.kartoffelquadrat.restaurant.model.order.OrderManager;
import eu.kartoffelquadrat.restaurant.model.order.OrderManagerInterface;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderManagerTest {
  private OrderManagerInterface orderManager = new OrderManager();

  @Test
  public void testNewOrder() {
    this.orderManager.createOrder("pizza", "wassim", "mcgill");
    assertEquals(orderManager.getAllOrders().size(), 1);
  }
}
