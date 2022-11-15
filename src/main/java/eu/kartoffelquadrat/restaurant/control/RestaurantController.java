package eu.kartoffelquadrat.restaurant.control;

import eu.kartoffelquadrat.restaurant.model.ChefManagerInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
  private ChefManagerInterface chefManager;

  /**
   * Constructor for Restaurant Controller Bean. Auto-detected by Springs component-scan.
   *
   * @param chefManager as the precise ChefManagerInterface implementation to use at runtime.
   */
  public RestaurantController(@Autowired ChefManagerInterface chefManager) {
    this.chefManager = chefManager;
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
}
