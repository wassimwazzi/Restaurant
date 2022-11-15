package eu.kartoffelquadrat.restaurant.model;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 * ChefManager Model Class. Marked as Component for injection into Spring REST controllers. There is
 * only one ChefManager instance at a time so this class is safe to use as Spring singleton Bean.
 *
 * @author Maximilian Schiedermeier
 */
@Component
public class ChefManager implements ChefManagerInterface {

  private final List<Chef> chefs;

  /**
   * Default constructor of ChefManager Bean. Will be invoked by Spring on application start.
   */
  ChefManager() {
    chefs = new LinkedList<>();
    chefs.add(new Chef("Ada", "December 10th 1815"));
    chefs.add(new Chef("Donald", "June 8th 1955"));
    chefs.add(new Chef("Tim", "February 23rd 1999"));
    chefs.add(new Chef("Alan", "June 23rd 1912"));
  }

  /**
   * Getter to retrieve all chef objects.
   *
   * @return Immutable list with all chefs.
   */
  @Override
  public List<String> getAllChefNames() {

    // Extract name of all chefs and create new list.
    return chefs.stream().map(Chef::getName).collect(Collectors.toList());
  }
}
