import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class Sonic extends MIDlet {
  private static Display a;
  
  private c a;
  
  public Sonic() {
    System.out.println("sonic");
    System.out.println("Version 1.0.46");
    System.out.println("Build 6390");
    a = (c)Display.getDisplay(this);
    this.a = new b(this, -1);
    a.setCurrent((Displayable)this.a);
    (new Thread(this.a)).start();
  }
  
  public void startApp() {}
  
  public void pauseApp() {
    System.err.println("pauseapp");
    this.a.i();
  }
  
  public void destroyApp(boolean paramBoolean) {}
}