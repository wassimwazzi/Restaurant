package eu.kartoffelquadrat.restaurant.control;

import eu.kartoffelquadrat.restaurant.model.chef.ChefManagerInterface;
import eu.kartoffelquadrat.restaurant.model.order.Order;
import eu.kartoffelquadrat.restaurant.model.order.OrderManagerInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Stub Restaurant REST controller. Has access to model manager classes via Dependency Injection.
 * Only depends on interfaces, not actual model implementations.
 *
 * @author Maximilian Schiedermeier
 */
@RestController
public class RestaurantController {

  // Local ChefManager reference. Is injected via constructor Autowiring.
  private final ChefManagerInterface chefManager;
  private final OrderManagerInterface orderManager;

  /**
   * Constructor for Restaurant Controller Bean. Auto-detected by Springs component-scan.
   *
   * @param chefManager as the precise ChefManagerInterface implementation to use at runtime.
   */

  @Autowired
  public RestaurantController(ChefManagerInterface chefManager,
                              OrderManagerInterface orderManager) {
    this.chefManager = chefManager;
    this.orderManager = orderManager;
  }

  /**
   * Sample REST endpoint to retrieve list of all Chef names.
   *
   * @return list of all chefs.
   */
  @GetMapping("/restaurant/chefs")
  public List<String> getAllChefs() {
    return chefManager.getAllChefNames();
  }

  /**
   * Sample REST endpoint to retrieve list of all order names.
   *
   * @return list of all orders.
   */
  @GetMapping("/restaurant/orders")
  public List<Order> getAllOrders() {
    return orderManager.getAllOrders();
  }

  @PostMapping("/restaurant/orders")
  public int createOrder(@RequestParam("name") String name, @RequestParam("dish") String dish,
                          @RequestParam("address") String address) {
    return orderManager.createOrder(name, dish, address);
  }

  @GetMapping("/restaurant/orders/{id}")
  public Order getOrder(@PathVariable String id) {
    return orderManager.getOrder(Integer.parseInt(id));
  }
}
