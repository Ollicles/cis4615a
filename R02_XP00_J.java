/******************************************************************************
 *  Compilation:  javac R02_XP00_J.java
 *  Execution:    java R02_XP00_J
 *
 *  RULE 02 - EXPRESSIONS (EXP)
 *     Do not ignore values returned by methods
 *
 * Revision History:
 *   % java R02_XP00_J
 *  
      public class R02_XP00_J {
            public void deleteFile(){
              File someFile = new File("someFileName.txt");
              // Do something with someFile
              someFile.delete();
            }
      }
 *  %
 *
 ******************************************************************************/
public class R02_XP00_J {
      
      public void deleteFile(){
      
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
          // Handle failure to delete the file
        }
      }
}
