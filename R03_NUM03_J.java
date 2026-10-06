/******************************************************************************
 *  Compilation:  javac R03_NUM03_J.java
 *  Execution:    java R03_NUM03_J
 *
 *  RULE 03 - NUMERIC TYPES AND OPERATIONS (NUM)
 *     Use integer types that can fully represent the possible range of unsigned data
 *
 * Revision History:
 *   % java R03_NUM03_J
 *  
    import java.io.*
    public class R03_NUM03_J {
          
      public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();  
      }
      
    }
 *  %
 *
 ******************************************************************************/
import java.io.*
public class R03_NUM03_J {
      
    public static long getInteger(DataInputStream is) throws IOException {
      return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }

  
}
