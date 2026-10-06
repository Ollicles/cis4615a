/******************************************************************************
 *  Compilation:  javac R04_STR03_J.java
 *  Execution:    java R04_STR03_J
 *
 *  RULE 04 - CHARACTERS & STRINGS (STR)
 *     Do not encode noncharacter data as a string
 *
 * Revision History:
 *   % java R04_STR03_J
 *  
    public class R04_STR03_J {
          
      public static void main(String[] args) {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
      }
    
    }
 *  %
 *
 ******************************************************************************/
public class R04_STR03_J {
      
  public static void main(String[] args) {
    BigInteger x = new BigInteger("530500452766");
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);
  }

}
