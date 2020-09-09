// Program when the game loads

import javax.microedition.lcdui.Display;  // UI API
import javax.microedition.lcdui.Displayable;  // 
import javax.microedition.midlet.MIDlet;

public class Boot extends MIDlet { // Boot = Subclass. MIDlet = Superclass.

  private static Display display;
  private c a;

  public Boot() {
    System.out.println("sonic");  // Print game title
    System.out.println("Version 1.0.46"); // Print version number
    System.out.println("Build 6390"); // Print build number
    display = (c)Display.getDisplay(this);  // Create game window
    this.a = new b(this, -1);
    display.setCurrent((Displayable)this.a);
    (new Thread(this.a)).start();
  }
  
  public void startApp() {  // Run when the app starts
    // Nothing runs here
  }
  
  public void pauseApp() { // Run when the app's paused
    System.err.println("pauseapp"); // Print 'error' message "pauseapp"
    this.a.i();
  }
  
  public void destroyApp(boolean unconditional) { // Run when the app's closed
    // Nothing runs here
  }
}