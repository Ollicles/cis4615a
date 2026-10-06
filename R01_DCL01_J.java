/******************************************************************************
 *  Compilation:  javac R01_DCL01_J.java
 *  Execution:    java R01_DCL01_J
 *
 *  RULE 01 - DECLARATIONS & INITIALIZATION (DCL)
 *     Do not reuse public identifiers from the Java Standard Library
 *
 * Revision History:
 *   % java R01_DCL01_J
   public class R01_DCL01_J {
  class Vector {
    private int val = 1;
  
    public boolean isEmpty() {
      if (val == 1) {   // Compares with 1 instead of 0
        return true;
      } else {
        return false;
      }
    }
    // Other functionality is same as java.util.Vector
  }
  
  // import java.util.Vector; omitted
  public class VectorUser {
    public static void main(String[] args) {
      Vector v = new Vector();
      if (v.isEmpty()) {
        System.out.println("Vector is empty");
      }
    }
  }
}
 *  %
 *
 ******************************************************************************/
public class R01_DCL01_J {
  class MyVector {
    private int val = 1;
  
    public boolean isEmpty() {
      if (val == 1) {   // Compares with 1 instead of 0
        return true;
      } else {
        return false;
      }
    }
    // Other functionality is same as java.util.Vector
  }
  
  // import java.util.Vector; omitted
  public class VectorUser {
    public static void main(String[] args) {
      Vector v = new Vector();
      if (v.isEmpty()) {
        System.out.println("Vector is empty");
      }
    }
  }
}

