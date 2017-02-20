/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.larryjoelane.codeshark;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.larryjoelane.codeshark.use.Window;
import java.io.IOException;


/**
 *
 * @author Larry J Lane
 */
public class Main {
    
  public static void main(String[] args) throws IOException {
         
    System.out.println("code-shark started"); 
    
    Window window = new Window();
    
    window.setVisible(true);        
              
  }
 
}
