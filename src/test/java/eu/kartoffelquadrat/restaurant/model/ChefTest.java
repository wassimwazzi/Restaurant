package eu.kartoffelquadrat.restaurant.model;

import org.junit.Test;

public class ChefTest {

  /**
   * Verify comparison of chefs by fields is correct.
   */
  @Test
  public void testChefComparison() {
    Chef ada1 = new Chef("Ada", "December 10th 1815");
    Chef ada2 = new Chef("Ada", "December 10th 1815");
    assert ada1.equals(ada2);
    assert ada1.equals(ada1);
    assert !ada1.equals(null);
  }

  /**
   * Try to create chef little by little.
   */
  @Test
  public void testCreateLittleChef() {

    Chef maximilian = new Chef();
    String name = "Maximilian Tiberius Schiedermeier";
    String birthdate = "January 1st, 1990"; // Nah, not my actual birthdate.
    maximilian.setName(name);
    maximilian.setBirthdate(birthdate);
    assert maximilian.getName().equals(name);
    assert maximilian.getBirthdate().equals(birthdate);
  }
}
