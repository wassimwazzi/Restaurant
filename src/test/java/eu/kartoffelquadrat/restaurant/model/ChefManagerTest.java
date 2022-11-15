package eu.kartoffelquadrat.restaurant.model;

import java.util.List;
import org.junit.Test;

public class ChefManagerTest {


  /**
   * Test if default chefs have expected size and contains a default chef.
   */
  @Test
  public void testGetChefNames() {
    ChefManager myChefManager = new ChefManager();
    List<String> chefNames = myChefManager.getAllChefNames();
    assert chefNames.size() == 4;
    assert chefNames.contains("Ada");
  }

}
