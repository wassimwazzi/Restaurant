package eu.kartoffelquadrat.restaurant;

import eu.kartoffelquadrat.restaurant.control.RestaurantController;
import eu.kartoffelquadrat.restaurant.model.DummyChefManager;
import org.junit.Test;

public class RestaurantControllerTest {


  @Test
  public void testConstructor() {

    // Inject test model here, instead of actual model (This is why we use interfaces, yay!)
    RestaurantController controller = new RestaurantController(new DummyChefManager());


    assert controller.getAllChefs().size() == 3;

    assert controller.getAllOrders().size() == 0;
  }
}
