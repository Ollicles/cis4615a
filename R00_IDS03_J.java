/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *  RULE 00 - INPUT VALIDATION AND DATA SANITIZATION (IDS)
 *     Do not log unsanitized user input
 *
 * Revision History:
 *   % java R00_IDS03_J
 *  
  public class R00_IDS03_J {
  
      if (loginSuccessful) {
        logger.severe("User login succeeded for: " + username);
      } else {
        logger.severe("User login failed for: " + username);
      }
      
  }
 *  %
 *
 ******************************************************************************/
public class R00_IDS03_J {
  
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitzeUser(username));
    } else {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }
  
  public String sanitizeUser(String username) {
    return Pattern.matches("[A-Za-z0-9_]+", username)
      ? username : "unauthorized user";
  }
}
