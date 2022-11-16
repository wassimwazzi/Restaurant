package eu.kartoffelquadrat.restaurant.model.order;

import java.util.Random;

/**
 * Implementation of Order interface.
 */
public class Order implements OrderInterface {
  private final String name;
  private final String dish;
  private final String address;
  private OrderState state;
  private final int id;

  /**
   * Constructor for order.
   *
   * @param name order name
   * @param dish dish name
   * @param address address
   */
  public Order(String name, String dish, String address, int id) {
    this.name = name;
    this.dish = dish;
    this.address = address;
    this.state = OrderState.IN_THE_WORKS;
    this.id = id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getAddress() {
    return this.address;
  }

  @Override
  public String getDish() {
    return this.dish;
  }

  @Override
  public int getId() {
    return this.id;
  }

  @Override
  public OrderState getState() {
    return this.state;
  }
}
