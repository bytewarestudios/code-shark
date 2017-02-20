/*
 * 
 */
package com.larryjoelane.codeshark.interfaces;

import javax.swing.JMenuBar;

/**
 *
 * @author Larry J Lane
 */
public interface IWindow {
    
   void showError(String errorMessage);   
    
   void actionExit();
   
   public JMenuBar createMenu(String Name);
   
  
   
}
