package com.larryjoelane.codeshark.use;

/**
 *
 * @author Larry J Lane
 *
 */
import com.larryjoelane.codeshark.interfaces.IWindow;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class Window extends JFrame implements IWindow{

    // Page location text field.
    private final JTextField locationTextField;

    // Editor pane for displaying pages.
    private final JEditorPane displayEditorPane;
    
    public Window() throws FileNotFoundException, IOException {
        
                
      // Set application title.
      super("Code Shark");

      // Set window size.
      setSize(640, 480);

      // Handle closing events.
      addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
        actionExit();
      }
    });
            
// todo: implement code below on a button click.
//
//      SeleniumUtils seleniumUtils = new SeleniumUtils();
//      
//      WebDriver chromeDriver = seleniumUtils.getChromeDriver();
//      
//      seleniumUtils.navigateByUrl(chromeDriver, "http://google.com");
//      
//      seleniumUtils.takeScreenShot(chromeDriver);

       // Set up file menu.        
       JMenuBar menuBar = createMenu("test");
       
       JMenu fileMenu = new JMenu("File");
        
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem fileExitMenuItem = new JMenuItem("Exit", KeyEvent.VK_X);

        fileExitMenuItem.addActionListener((ActionEvent e) -> {
            actionExit();
      });
        
        fileMenu.add(fileExitMenuItem);
        
        menuBar.add(fileMenu);
        
        setJMenuBar(menuBar);

        // Set up button panel.
        JPanel buttonPanel = new JPanel();
        
        locationTextField = new JTextField(35);
        
        locationTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    actionGo();
                }
            }
        });
        
        buttonPanel.add(locationTextField);
        
        JButton goButton = new JButton("GO");
        
        goButton.addActionListener((ActionEvent e) -> {
            actionGo();
        });
        
        buttonPanel.add(goButton);

        // Set up page display.
        displayEditorPane = new JEditorPane();
        displayEditorPane.setContentType("text/html");
        displayEditorPane.setEditable(false);
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(buttonPanel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(displayEditorPane),
                BorderLayout.CENTER);
    }

    // Exit this program.
     public void actionExit() {
        System.exit(0);
    }   
    
    // Load and show the page specified in the location text field.
    private void actionGo() {

      String url = locationTextField.getText();

      SeleniumUtils seleniumUtils = new SeleniumUtils();
      
      WebDriver chromeDriver = seleniumUtils.getChromeDriver();
      
      seleniumUtils.navigateByUrl(chromeDriver, url);

    }  
        
    public JMenuBar createMenu(String name){
        
      JMenuBar menuBar = new JMenuBar();

      return menuBar;
            
    }

    // Show dialog box with error message.
    public void showError(String errorMessage) {
        
      JOptionPane.showMessageDialog(this, errorMessage,
            "Error", JOptionPane.ERROR_MESSAGE);
      
    }

}
