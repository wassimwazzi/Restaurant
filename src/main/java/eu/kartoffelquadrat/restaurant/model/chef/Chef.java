package eu.kartoffelquadrat.restaurant.model.chef;

import java.util.Objects;

/**
 * POJO for Chef.
 *
 * @author Maximilian Schiedermeier
 */
public class Chef {

  private String name;
  private String birthdate;
  private String nickname;

  /**
   * Default constructor, needed for serialization.
   */
  public Chef() {
  }


  /**
   * Constructor for Chef.
   *
   * @param name      Name of the chef.
   * @param birthdate Birthdate of the chef.
   * @param nickname  Nickname of the chef.
   */
  public Chef(String name, String birthdate, String nickname) {
    this.name = name;
    this.birthdate = birthdate;
    this.nickname = nickname;
  }

  public String getName() {
    return name;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public String getNickname() {
    return nickname;
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
