package p000;

import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

/* renamed from: d */
public final class AudioModule {

    /* renamed from: b */
    private static int f335b = 0;

    /* renamed from: a */
    public int f336a = -1;

    /* renamed from: a */
    private Player f337a;

    /* renamed from: a */
    private PlayerListener f338a;

    /* renamed from: a */
    private boolean f339a = true;

    /* renamed from: a */
    public String[] f340a;

    /* renamed from: b */
    private String[] f341b;

    public AudioModule(PlayerListener playerListener) {
        this.f338a = playerListener;
    }

    /* renamed from: a */
    private Player m384a(String str, String str2) {
        String stringBuffer;
        Player player = null;
        if (str == this.f340a[20]) {
            stringBuffer = new StringBuffer().append(str).append(".amr").toString();
            str2 = "audio/amr";
        } else {
            stringBuffer = new StringBuffer().append(str).append(".mid").toString();
        }
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(stringBuffer);
            player = Manager.createPlayer(resourceAsStream, str2);
            player.addPlayerListener(this.f338a);
            player.realize();
            player.prefetch();
            resourceAsStream.close();
            return player;
        } catch (Exception e) {
            return player;
        }
    }

    /* renamed from: a */
    private void m385a(Player player) {
        try {
            player.stop();
            player.deallocate();
            player.close();
            if (player == this.f337a) {
                this.f336a = -1;
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public static boolean mo101a() {
        return f335b != 0;
    }

    /* renamed from: a */
    private boolean mo102a(int i) {
        switch (i) {
            case 0:
                return true;
            case 1:
                return this.f340a != null;
            case 2:
                return this.f341b != null;
            case 3:
                return (this.f341b == null || this.f340a == null) ? false : true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final void m388a() {
        m385a(this.f337a);
    }

    /* renamed from: a */
    public final void m389a(int i) {
        f335b = i;
        if (!mo102a(f335b)) {
            f335b = 0;
        }
        if (f335b == 0) {
            m385a(this.f337a);
        }
    }

    /* renamed from: a */
    public final void playSample(int i, int i2, boolean z) {
        try {
            if (i != this.f336a || z || (this.f337a != null && this.f337a.getState() != 400)) {
                if (this.f337a != null) {
                    m385a(this.f337a);
                }
                if ((f335b & 1) == 1) {
                    this.f337a = m384a(this.f340a[i], "audio/midi");
                    VolumeControl control = this.f337a.getControl("VolumeControl");
                    if (control != null) {
                        control.setLevel(50);
                    }
                    this.f337a.setLoopCount(i2);
                    if (this.f339a) {
                        this.f337a.start();
                    }
                    this.f336a = i;
                }
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    public final void mo104b() {
        m385a(this.f337a);
    }
}
