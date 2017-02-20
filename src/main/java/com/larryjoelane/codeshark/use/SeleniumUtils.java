/*
 * 
 */
package com.larryjoelane.codeshark.use;

import com.larryjoelane.codeshark.interfaces.ISeleniumUtils;
import static com.larryjoelane.codeshark.use.FileUtils.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

/**
 *
 * @author Larry J Lane
 */
public class SeleniumUtils implements ISeleniumUtils {    
        
      @Override
      public void takeScreenShot(WebDriver driver){        
// 
//      WebDriver driver = this.getChromeDriver();      
//          
//      this.navigateByUrl(driver,"http://www.google.com");
        
      // RemoteWebDriver does not implement the TakesScreenshot class
      // if the driver does have the Capabilities to take a screenshot
      // then Augmenter will add the TakesScreenshot methods to the instance
      WebDriver augmentedDriver = new Augmenter().augment(driver);
      
      File screenshot = ((TakesScreenshot)augmentedDriver).
                        getScreenshotAs(OutputType.FILE);
      
        try {
            saveFile(screenshot);
        } catch (IOException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
      
      @Override
      public WebDriver getChromeDriver(){
          
      String chromeDriverPath = "/Users/larrylane/Desktop/Projects/codeshark/src/main/java/com/larryjoelane/codeshark/chromedriver";

      System.setProperty("webdriver.chrome.driver", chromeDriverPath);

      WebDriver driver = new ChromeDriver();   
        
      return driver;
          
      }
      
      @Override
      public void navigateByUrl(WebDriver driver, String url){
          
          driver.get(url);
          
      }
   
  }
