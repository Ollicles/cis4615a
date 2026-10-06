
/******************************************************************************
 *  Compilation:  javac R49_MSC04_J.java
 *  Execution:    java R49_MSC04_J
 *
 *  RULE 49 -  MISCELLANEOUS (MSC)
 *     Do not leak memory
 *
 * Revision History:
 *   % java R49_MSC04_J 
    public class Leak {
      static Vector vector = new Vector();
    
      public void useVector(int count) {    
        for (int n = 0; n < count; n++) {
          vector.add(Integer.toString(n));
        }
        // ...
        for (int n = count - 1; n > 0; n--) { // Free the memory
          vector.removeElementAt(n);
        }   
      }
    
      public static void main(String[] args) throws IOException {
        Leak le = new Leak();
        int i = 1;
        while (true) {
          System.out.println("Iteration: " + i);
          le.useVector(1);
          i++;
        }
      }
    }

 *  %
 *
 ******************************************************************************/
public class R49_MSC04_J {
  
    public class Leak {
    static Vector vector = new Vector();
  
    public void useVector(int count) {    
      for (int n = 0; n < count; n++) {
        vector.add(Integer.toString(n));
      }
      // ...
      for (int n = count - 1; n > 0; n--) { // Free the memory
        vector.removeElementAt(n);
      }   
    }
  
    public static void main(String[] args) throws IOException {
      Leak le = new Leak();
      int i = 1;
      while (true) {
        System.out.println("Iteration: " + i);
        le.useVector(1);
        i++;
      }
    }
  }

}
