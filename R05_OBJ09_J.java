/******************************************************************************
 *  Compilation:  javac R05_OBJ09_J.java
 *  Execution:    java R05_OBJ09_J
 *
 *  RULE 05 - OBJECT ORIENTATION (OBJ)
 *     Compare classes and not class names
 *
 * Revision History:
 *   % java R05_OBJ09_J
    public class R05_OBJ09_J {
     // Determine whether object auth has required/expected class object
     if (auth.getClass().getName().equals(
          "com.application.auth.DefaultAuthenticationHandler")) {
       // ...
    }
      
    }
 *  %
 *
 ******************************************************************************/
public class R05_OBJ09_J {
 // Determine whether object auth has required/expected class object
 if (auth.getClass().getName().equals(
      "com.application.auth.DefaultAuthenticationHandler")) {
   // ...
}

  
}
