// Program when the game loads

import javax.microedition.lcdui.Display;  // UI API
import javax.microedition.lcdui.Displayable;  // 
import javax.microedition.midlet.MIDlet;

public class Boot extends MIDlet { // Boot = Subclass. MIDlet = Superclass.

  private static Display a;
  private c a;

  public Boot() {
    System.out.println("Sonic the Hedgehog");  // Print game title (Originally sonic)
    System.out.println("Version 1.0.0"); // Print version number (Originally 1.0.46)
    System.out.println("Build 0001"); // Print build number (Originally 6390)
    a = (c)Display.getDisplay(this);
    this.a = new b(this, -1);
    a.setCurrent((Displayable)this.a);
    (new Thread(this.a)).start();
  }
  
  public void startApp() {  // Run when the app starts
    // Nothing runs here
  }
  
  public void pauseApp() { // Run when the app's paused
    System.err.println("App Paused"); // Print 'error' message "App Paused" (Original pauseapp)
    this.a.i();
  }
  
  public void destroyApp(boolean paramBoolean) { // Run when the app's closed
    // Nothing runs here
  }
}