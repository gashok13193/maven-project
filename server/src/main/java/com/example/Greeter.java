public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  
/**
*@param someone th name of the person
*@return greeting String
*/
  //TODO: Add javadoc comment
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
