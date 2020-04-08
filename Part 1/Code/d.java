import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

public final class d {
  private static int b = false;
  
  public String[] a;
  
  private String[] b;
  
  public int a;
  
  private boolean a;
  
  private Player a;
  
  private PlayerListener a = -1;
  
  public d(PlayerListener paramPlayerListener) {
    this.a = true;
    this.a = paramPlayerListener;
  }
  
  private boolean a(int paramInt) {
    switch (paramInt) {
      case 2:
        return (this.b != null);
      case 1:
        return (this.a != null);
      case 3:
        return (this.b != null && this.a != null);
      case 0:
        return true;
    } 
    return false;
  }
  
  public static boolean a() {
    return (b != null);
  }
  
  public final void a(int paramInt) {
    b = paramInt;
    if (!a(b))
      b = false; 
    if (b == null)
      a((Player)this.a); 
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield a : I
    //   5: if_icmpne -> 34
    //   8: iload_3
    //   9: ifne -> 34
    //   12: aload_0
    //   13: getfield a : Ljavax/microedition/media/Player;
    //   16: ifnull -> 135
    //   19: aload_0
    //   20: getfield a : Ljavax/microedition/media/Player;
    //   23: invokeinterface getState : ()I
    //   28: sipush #400
    //   31: if_icmpeq -> 135
    //   34: aload_0
    //   35: getfield a : Ljavax/microedition/media/Player;
    //   38: ifnull -> 49
    //   41: aload_0
    //   42: aload_0
    //   43: getfield a : Ljavax/microedition/media/Player;
    //   46: invokespecial a : (Ljavax/microedition/media/Player;)V
    //   49: getstatic d.b : I
    //   52: iconst_1
    //   53: iand
    //   54: iconst_1
    //   55: if_icmpne -> 135
    //   58: aload_0
    //   59: aload_0
    //   60: aload_0
    //   61: getfield a : [Ljava/lang/String;
    //   64: iload_1
    //   65: aaload
    //   66: ldc 'audio/midi'
    //   68: invokespecial a : (Ljava/lang/String;Ljava/lang/String;)Ljavax/microedition/media/Player;
    //   71: putfield a : Ljavax/microedition/media/Player;
    //   74: aload_0
    //   75: getfield a : Ljavax/microedition/media/Player;
    //   78: ldc 'VolumeControl'
    //   80: invokeinterface getControl : (Ljava/lang/String;)Ljavax/microedition/media/Control;
    //   85: checkcast javax/microedition/media/control/VolumeControl
    //   88: dup
    //   89: astore #4
    //   91: ifnull -> 104
    //   94: aload #4
    //   96: bipush #50
    //   98: invokeinterface setLevel : (I)I
    //   103: pop
    //   104: aload_0
    //   105: getfield a : Ljavax/microedition/media/Player;
    //   108: iload_2
    //   109: invokeinterface setLoopCount : (I)V
    //   114: aload_0
    //   115: getfield a : Z
    //   118: ifeq -> 130
    //   121: aload_0
    //   122: getfield a : Ljavax/microedition/media/Player;
    //   125: invokeinterface start : ()V
    //   130: aload_0
    //   131: iload_1
    //   132: putfield a : I
    //   135: return
    //   136: pop
    //   137: return
    // Exception table:
    //   from	to	target	type
    //   0	135	136	java/lang/Exception
  }
  
  public final void a() {
    a((Player)this.a);
  }
  
  public final void b() {
    a((Player)this.a);
  }
  
  private void a(Player paramPlayer) {
    try {
      paramPlayer.stop();
      paramPlayer.deallocate();
      paramPlayer.close();
      if (paramPlayer == this.a)
        this.a = -1; 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private Player a(String paramString1, String paramString2) {
    Player player = null;
    if (paramString1 == this.a[20]) {
      paramString1 = paramString1 + ".amr";
      paramString2 = "audio/amr";
    } else {
      paramString1 = paramString1 + ".mid";
    } 
    try {
      InputStream inputStream;
      (player = Manager.createPlayer(inputStream = getClass().getResourceAsStream(paramString1), paramString2)).addPlayerListener(this.a);
      player.realize();
      player.prefetch();
      inputStream.close();
    } catch (Exception exception) {}
    return player;
  }
}
