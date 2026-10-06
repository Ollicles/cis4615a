/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *  RULE 00 - INPUT VALIDATION AND DATA SANITIZATION (IDS)
 *     code example logs untrusted data from an unauthenticated user without data sanitization.
 *
 * Revision History:
 *   % java R00_IDS03_J
 *  
 *
 *  %
 *
 ******************************************************************************/
public class R00_IDS03_J.java {
  
  public static void main(String[] args) {
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);
    } else {
      logger.severe("User login failed for: " + username);
    }
  }
}
