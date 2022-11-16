package eu.kartoffelquadrat.restaurant.model;

import eu.kartoffelquadrat.restaurant.model.chef.Chef;
import org.junit.Test;

public class ChefTest {

  /**
   * Verify comparison of chefs by fields is correct.
   */
  @Test
  public void testChefComparison() {
    Chef ada1 = new Chef("Ada", "December 10th 1815", "Ada");
    Chef ada2 = new Chef("Ada", "December 10th 1815", "Ada");
    assert ada1.equals(ada2);
    assert ada1.equals(ada1);
    assert !ada1.equals(null);
  }

  /**
   * Try to create chef little by little.
   */
  @Test
  public void testCreateLittleChef() {
    String name = "Maximilian Tiberius Schiedermeier";
    String birthdate = "January 1st, 1990"; // Nah, not my actual birthdate.

    Chef maximilian = new Chef(name, birthdate, "Max");
    assert maximilian.getName().equals(name);
    assert maximilian.getBirthdate().equals(birthdate);
  }
}
