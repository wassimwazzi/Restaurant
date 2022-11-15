package eu.kartoffelquadrat.restaurant.model;

import java.util.Objects;

/**
 * POJO for Chef.
 *
 * @author Maximilian Schiedermeier
 */
public class Chef {

  private String name;
  private String birthdate;

  /**
   * Default constructor, needed for serialization.
   */
  public Chef() {
  }


  public Chef(String name, String birthdate) {
    this.name = name;
    this.birthdate = birthdate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  /**
   * Equals method to compare chef to another chef. Name and birthdate must match for two chefs to
   * be identical.
   *
   * @param other as the object to compare to.
   * @return true if the other chef has the same name and birthdate.
   */
  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    Chef chef = (Chef) other;
    return Objects.equals(name, chef.name)
        && Objects.equals(birthdate, chef.birthdate);
  }

  /**
   * Helper method to create hash value based on name and birthdate field.
   *
   * @return int hash value of a chef instance.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, birthdate);
  }
}
