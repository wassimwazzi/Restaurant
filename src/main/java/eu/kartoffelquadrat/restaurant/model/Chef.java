package eu.kartoffelquadrat.restaurant.model;

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
}
