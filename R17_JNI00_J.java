/******************************************************************************
 *  Compilation:  javac R17_JNI00_J.java
 *  Execution:    java R17_JNI00_J
 *
 *  RULE 17 - JAVA NATIVE INTERFACE (JNI)
 *     Define wrappers around native methods
 *
 * Revision History:
 *   % java R17_JNI00_J 
    public final class NativeMethod {
    
      // Public native method
      public native void nativeOperation(byte[] data, int offset, int len);
    
      // Wrapper method that lacks security checks and input validation
      public void doOperation(byte[] data, int offset, int len) {
        nativeOperation(data, offset, len);
      }
      
      static {
        // Load native library in static initializer of class
        System.loadLibrary("NativeMethodLib"); 
      }
    }
 *  %
 *
 ******************************************************************************/
public class R17_JNI00_J {
      
public final class NativeMethod {

  // Public native method
  public native void nativeOperation(byte[] data, int offset, int len);

  // Wrapper method that lacks security checks and input validation
  public void doOperation(byte[] data, int offset, int len) {
    nativeOperation(data, offset, len);
  }
  
  static {
    // Load native library in static initializer of class
    System.loadLibrary("NativeMethodLib"); 
  }
}

}
