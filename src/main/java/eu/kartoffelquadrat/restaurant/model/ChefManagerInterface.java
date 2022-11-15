package eu.kartoffelquadrat.restaurant.model;

import java.util.List;

/**
 * Interface for all possible ChefManager implementations. Used to prevent dependency of
 * RestaurantController against a precise implementation class.
 *
 * @author Maximilian Schiedermeier
 */
public interface ChefManagerInterface {

  /**
   * Getter for all chef names.
   *
   * @return List containing the names of all chefs in the system.
   */
  List<String> getAllChefNames();
}
