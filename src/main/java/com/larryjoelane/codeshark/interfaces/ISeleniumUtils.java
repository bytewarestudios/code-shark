/*
 * 
 */
package com.larryjoelane.codeshark.interfaces;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Larry J Lane
 */
public interface ISeleniumUtils {

  void takeScreenShot(WebDriver driver);

  /**
   *
   * @return
   */
  public WebDriver getChromeDriver();

  void navigateByUrl(WebDriver driver, String url);
}
