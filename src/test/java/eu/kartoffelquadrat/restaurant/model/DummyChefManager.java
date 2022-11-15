package eu.kartoffelquadrat.restaurant.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Dummy implementation of ChefManagerInterface. Used for Testing, only.
 *
 * @author Maximilian Schiedermeier
 */
public class DummyChefManager implements ChefManagerInterface {

  /**
   * Stub implementation, returns a list with only three static names.
   *
   * @return stub list with 3 names.
   */
  @Override
  public List<String> getAllChefNames() {
    List<String> dummyList = new LinkedList<>();
    dummyList.add("Marianick");
    dummyList.add("Khabiir");
    dummyList.add("Linus");
    return dummyList;
  }
}
