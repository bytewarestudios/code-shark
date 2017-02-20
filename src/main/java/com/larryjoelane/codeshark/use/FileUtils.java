/*
 * 
 */
package com.larryjoelane.codeshark.use;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Larry J Lane
 */
public final class FileUtils {
    
  private FileUtils(){}
  
  public static void saveFile(File file) throws IOException{
      
      String targetFilePath = "/Users/larrylane/Desktop/Projects/codeshark/src/main/java/com/larryjoelane/codeshark/test.jpg";
      
      org.apache.commons.io.FileUtils.copyFile(file, new File(targetFilePath));
      
  }  
    
}
