package eu.kartoffelquadrat.restaurant.model.order;

/**
 * Interface for the order model. The order model is responsible for a single order, which consists
 * of a dish, a name, and an address.
 *
 * @author Maximilian Schiedermeier
 */
public interface OrderInterface {

  /**
   * Returns the name of the customer.
   *
   * @return name of the customer.
   */
  String getName();

  /**
   * Returns the address of the customer.
   *
   * @return address of the customer.
   */
  String getAddress();

  /**
   * Returns the dish that was ordered.
   *
   * @return dish that was ordered.
   */
  String getDish();

  /**
   * Returns the id of the order.
   *
   * @return id of the order.
   */
  int getId();

  /**
   * Returns the state of the order.
   *
   * @return the state of the order
   */
  OrderState getState();
}
