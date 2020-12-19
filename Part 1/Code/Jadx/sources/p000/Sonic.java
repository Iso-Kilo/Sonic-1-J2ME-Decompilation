package p000;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* renamed from: Sonic */
public class Sonic extends MIDlet {

    /* renamed from: a */
    private static Display f0a;

    /* renamed from: a */
    private RunnableC0002c f1a = new Game(this, -1);

    public Sonic() {
        System.out.println("sonic");
        System.out.println("Version 1.0.46");
        System.out.println("Build 6390");
        f0a = Display.getDisplay(this);
        f0a.setCurrent(this.f1a);
        new Thread(this.f1a).start();
    }

    public void destroyApp(boolean z) {
    }

    public void pauseApp() {
        System.err.println("pauseapp");
        this.f1a.m367i();
    }

    public void startApp() {
    }
}
