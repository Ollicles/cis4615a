/******************************************************************************
 *  Compilation:  javac R13_FIO00_J.java
 *  Execution:    java R13_FIO00_J
 *
 *  RULE 13 - INPUT OUTPUT (FIO)
 *     Do not operate on files in shared directories
 *
 * Revision History:
 *   % java R13_FIO00_J 
    String file =  // Provided by user ;
    InputStream in = null;
    try {
      in = new FileInputStream(file);
      // ...
    } finally {
      try {
        if (in !=null) { in.close();}
      } catch (IOException x) {
        // Handle error
      }
    }
 *  %
 *
 ******************************************************************************/
public class R13_FIO00_J {
      
    String filename = /* Provided by user */;
    Path path = new File(filename).toPath();
    try {
      if (!isInSecureDir(path)) {
        System.out.println("File not in secure directory");
        return;
      }
    
      BasicFileAttributes attr = Files.readAttributes(
          path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
    
      // Check
      if (!attr.isRegularFile()) {
        System.out.println("Not a regular file");
        return;
      }
      // Other necessary checks
    
      try (InputStream in = Files.newInputStream(path)) {
        // Read file
      }
    } catch (IOException x) {
      // Handle error
    }


}
