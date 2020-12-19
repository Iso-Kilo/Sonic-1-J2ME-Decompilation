package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

/* renamed from: c */
public class RunnableC0002c extends Canvas implements Runnable, PlayerListener {

    /* renamed from: A */
    public static boolean updateHUDTime = true;

    /* renamed from: A */
    public static final int[] f13A = {0, 175, 349, 523, 698, 872, 1045, 1219, 1392, 1564, 1736, 1908, 2079, 2249, 2419, 2588, 2756, 2924, 3090, 3256, 3420, 3584, 3746, 3907, 4067, 4226, 4384, 4540, 4695, 4848, 5000, 5150, 5299, 5446, 5592, 5736, 5878, 6018, 6156, 6293, 6428, 6560, 6691, 6820, 6946, 7071, 7193, 7313, 7431, 7547, 7660, 7771, 7880, 7986, 8090, 8191, 8290, 8387, 8480, 8572, 8660, 8746, 8829, 8910, 8988, 9063, 9135, 9205, 9272, 9336, 9397, 9455, 9510, 9563, 9613, 9659, 9703, 9744, 9781, 9816, 9848, 9877, 9903, 9925, 9945, 9962, 9976, 9986, 9994, 9998, 10000};

    /* renamed from: B */
    public static boolean updateHUDLives = true;

    /* renamed from: C */
    private static int[] f15C = {10000, 8000, 6000, 4000, 2000};

    /* renamed from: D */
    private static int[] f16D = {0, 1, 2, 1, 0};

    /* renamed from: Q */
    private static boolean f17Q;

    /* renamed from: R */
    private static boolean f18R;

    /* renamed from: S */
    private static boolean f19S;

    /* renamed from: W */
    private static boolean f20W;

    /* renamed from: X */
    private static boolean f21X;

    /* renamed from: a */
    public static final int f22a = f25a.getHeight();

    /* renamed from: a */
    public static InputStream inputStream;

    /* renamed from: a */
    private static final Random randomiser = new Random();

    /* renamed from: a */
    public static final Font f25a = Font.getFont(0, 0, 16);

    /* renamed from: a */
    public static Graphics screenBuffer;

    /* renamed from: a */
    public static Image zoneTiles;

    /* renamed from: a */
    public static final byte[] f28a = {1, 2, 3, 2};

    /* renamed from: a */
    private static final char[] f29a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1', '@', '?', '!', ',', '.', ' '};

    /* renamed from: a */
    public static final int[] rotationQuadrants = {0, 5, 3, 6, 2, 7, 1, 4};

    /* renamed from: a */
    public static Image[] uiObjGfx = new Image[20];

    /* renamed from: a */
    public static final int[][] f32a = {new int[]{0, 0, 112, 16}, new int[]{112, 0, 56, 16}, new int[]{0, 16, 80, 16}, new int[]{80, 16, 48, 16}, new int[]{128, 16, 8, 16}, new int[]{136, 16, 16, 16}, new int[]{152, 16, 16, 16}, new int[]{0, 32, 128, 16}, new int[]{128, 32, 24, 8}, new int[]{0, 48, 128, 16}, new int[]{128, 40, 40, 40}, new int[]{0, 64, 120, 16}, new int[]{0, 80, 104, 16}, new int[]{104, 80, 40, 40}, new int[]{0, 96, 104, 16}, new int[]{0, 112, 72, 16}, new int[]{0, 128, 152, 16}, new int[]{0, 144, 176, 16}};

    /* renamed from: a */
    public static int[][][] framedata;

    /* renamed from: aE */
    public static int f34aE;

    /* renamed from: aF */
    public static int f35aF;

    /* renamed from: aH */
    private static int f36aH;

    /* renamed from: aI */
    private static int f37aI;

    /* renamed from: b */
    public static int screenHeight = 0;

    /* renamed from: b */
    public static Font f39b;

    /* renamed from: b */
    public static int[] f40b = new int[2];

    /* renamed from: b */
    public static Image[] gameObjGfx = new Image[160];

    /* renamed from: b */
    private static final byte[][] f42b = {new byte[]{28, 31}, new byte[]{32, 29}, new byte[]{33, 29}, new byte[]{28, 34}, new byte[]{34, 30}, new byte[]{31, 30}, new byte[]{33, 33}, new byte[]{31, 31}};

    /* renamed from: b */
    public static final int[][] f43b = {new int[]{80, 944, 80, 252, 80, 944, 128, 168}, new int[]{96, 108, 80, 236, 80, 748, 2944, 0}, new int[]{48, 614, 48, 614, 48, 358, 128, 168}, new int[]{64, 716, 64, 332, 64, 332, 128, 168}, new int[]{48, 957, 48, 445, 48, 236, 128, 168}, new int[]{48, 1164, 48, 1868, 8512, 1452, 128, 168, 304, 168}, new int[]{1568, 363, 3808, 364, 128, 168, 128, 168}};

    /* renamed from: b */
    private static final short[][] f44b = {new short[]{0, 120, 0}, new short[]{48, 120, 0}, new short[]{96, 120, 0}, new short[]{96, 120, 1}, new short[]{48, 120, 1}};

    /* renamed from: c */
    public static int screenWidth = 0;

    /* renamed from: c */
    public static boolean f46c;

    /* renamed from: c */
    public static int[] f47c = new int[16];

    /* renamed from: c */
    private static Image[] menuObjGfx = new Image[5];

    /* renamed from: c */
    private static final short[][] f49c = {new short[]{48, 0}, new short[]{0, 32}, new short[]{48, 32}, new short[]{0, 32}};

    /* renamed from: c */
    private static final int[][][] f50c = {new int[][]{new int[]{4, 0, 9407, 0, 768, 96}, new int[]{4, 0, 7871, 0, 768, 96}, new int[]{4, 0, 10592, 0, 768, 96}, new int[]{4, 0, 10943, 0, 768, 96}}, new int[0][], new int[][]{new int[]{4, 0, 6079, 0, 464, 96}, new int[]{4, 0, 6079, 0, 1312, 96}, new int[]{4, 0, 6144, 0, 1824, 96}, new int[]{4, 0, 5823, 0, 1824, 96}}, new int[0][], new int[][]{new int[]{4, 0, 8896, 0, 1056, 96}, new int[]{4, 0, 10432, 0, 1312, 96}, new int[]{4, 0, 11264, 0, 1568, 96}, new int[]{4, 0, 11968, 0, 1568, 96}}, new int[0][]};

    /* renamed from: d */
    public static int f51d = screenWidth;

    /* renamed from: d */
    public static boolean f52d;

    /* renamed from: d */
    public static final int[] f53d = {912, 224, 656, 672, 1360, -16};

    /* renamed from: d */
    private static String[] f54d = {"SON", "SON", "SON", "SON", "SON"};

    /* renamed from: d */
    public static final int[][] f55d = {new int[]{44, 44, 44, 44, 44, 44, 44, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 44, 44, 44, 44, 44, 44, 44}, new int[]{52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52}, new int[]{37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53}};

    /* renamed from: d */
    private static final short[][] f56d = {new short[]{0, 0}, new short[]{16, 0}, new short[]{0, 16}, new short[]{16, 16}};

    /* renamed from: e */
    public static int f57e = screenHeight;

    /* renamed from: e */
    public static boolean f58e;

    /* renamed from: e */
    public static final int[] f59e = {32, 32, 32, 32, 32, 32, 32, 32, 33, 33, 34, 34, 35, 35, 36, 36, 37, 37, 38, 38, 39, 39, 40, 40, 41, 41, 42, 42, 43, 43, 44, 44, 45, 45, 46, 46, 47, 47, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48};

    /* renamed from: e */
    private static final String[] sampleNames = {"/greenhill_loop", "/labyrinth_loop", "/marble_loop", "/starlight_loop", "/springyard_loop", "/scrapbrain", "/invincible", "/1up", "/specialstage", "/maintitle", "/ending", "/bossstage", "/bossstagefinal_loop", "/stageclear", "/gameover", "/continue", "/credits", "/hurry", "/chaosemerald", "/score", "/sega", "/greenhill_intro", "/marble_intro", "/springyard_intro"};

    /* renamed from: e */
    private static final short[][] f61e = {new short[]{-250, -360}, new short[]{-80, -100}, new short[]{-160, -250}, new short[]{-200, -300}, new short[]{-120, -225}, new short[]{-150, -250}, new short[]{-100, -165}};

    /* renamed from: f */
    public static int f62f;

    /* renamed from: f */
    public static boolean f63f;

    /* renamed from: f */
    public static final int[][] f64f = {new int[]{0, 0, 0}, new int[]{2, 2, 2}, new int[]{4, 4, 4}, new int[]{1, 1, 1}, new int[]{3, 3, 3}, new int[]{5, 5, 1}, new int[]{5, 0}};

    /* renamed from: f */
    private static final short[][] f65f = {new short[]{9312, 7776}, new short[]{6736, 4176, 8208}, new short[]{6224, 6224}, new short[]{8288, 8032}, new short[]{8800, 10336}, new short[]{8544, 7648}};

    /* renamed from: g */
    public static int f66g = screenWidth;

    /* renamed from: g */
    public static boolean f67g;

    /* renamed from: g */
    public static final int[] f68g = {1296, 3632, 752, 4880};

    /* renamed from: g */
    public static final int[][] f69g = {new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 3}, new int[]{3, 3}};

    /* renamed from: h */
    public static int f70h = screenHeight;

    /* renamed from: h */
    public static boolean f71h;

    /* renamed from: h */
    public static final int[] f72h = {1168, 1104, 1680, 1360};

    /* renamed from: i */
    public static int f73i;

    /* renamed from: i */
    public static boolean f74i;

    /* renamed from: i */
    public static final int[] f75i = {1263, 3598, 785, 4845};

    /* renamed from: j */
    public static boolean f76j;

    /* renamed from: j */
    public static final int[] f77j = {1216, 1136, 1728, 1392};

    /* renamed from: k */
    public static boolean f78k;

    /* renamed from: k */
    public static final int[] f79k = {-1, -1, 1, -1};

    /* renamed from: l */
    public static boolean f80l;

    /* renamed from: l */
    public static final int[] f81l = {4, 7, 5, 6, 0, 3, 2, 1};

    /* renamed from: l */
    private static final int[][] f82l = {new int[]{0, 0, 190, 109}, new int[]{0, 159, 49, 57}, new int[]{0, 109, 56, 50}, new int[]{107, 188, 53, 36}, new int[]{62, 109, 60, 55}, new int[]{50, 164, 55, 57}, new int[]{127, 110, 35, 57}, new int[]{163, 109, 27, 58}, new int[]{127, 110, 35, 57}, new int[]{135, 167, 26, 21}, new int[]{163, 167, 27, 57}, new int[]{163, 109, 27, 58}, new int[]{0, 224, 190, 56}};

    /* renamed from: m */
    public static boolean f83m;

    /* renamed from: m */
    public static final int[] f84m = {0, 5, 8, 17, 20, 28, 32, 34};

    /* renamed from: n */
    public static boolean f85n;

    /* renamed from: n */
    public static final int[] f86n = {0, 10000, 1000, 100};

    /* renamed from: o */
    public static boolean f87o;

    /* renamed from: o */
    public static final int[] f88o = {-8, -16, -12, 12, 16, 8};

    /* renamed from: p */
    public static int sonicAngle;

    /* renamed from: p */
    public static final int[] f90p = {22, 25, 13, 22, 25, 13};

    /* renamed from: q */
    public static final int[] f91q = {2, 3, 2, 3, 2, 3, 2, 3, 2, 2, 3, 0, 1, 0, 1};

    /* renamed from: r */
    public static final int[] f92r = {8, 0, 4, 3, 2, 1, 0};

    /* renamed from: s */
    public static final int[] f93s = {rotationQuadrants[0], rotationQuadrants[1], rotationQuadrants[7], rotationQuadrants[4]};

    /* renamed from: t */
    public static final int[] f94t = {8, 0, 40, 24, 10, 40, 30, 24, 41, 6};

    /* renamed from: u */
    public static final int[] f95u = {8, 16, 8, 30, 23, 24, 18, 16, 18, 8};

    /* renamed from: v */
    public static final int[] f96v = {0, 32, 64, 96, 128, 168, 208};

    /* renamed from: x */
    public static final int[] f97x = {0, 2, 7, 12, 11, 9, 1};

    /* renamed from: y */
    public static int[] f98y = new int[2];

    /* renamed from: z */
    public static boolean updateHUDRingsScore = true;

    /* renamed from: z */
    public static int[] f100z = new int[2];

    /* renamed from: A */
    public int lives;

    /* renamed from: B */
    public int f102B;

    /* renamed from: B */
    public int[] f103B;

    /* renamed from: C */
    public int f104C;

    /* renamed from: C */
    public boolean f105C;

    /* renamed from: D */
    public int f106D;

    /* renamed from: D */
    public boolean f107D;

    /* renamed from: E */
    public int f108E;

    /* renamed from: E */
    public boolean f109E;

    /* renamed from: E */
    private final int[] f110E;

    /* renamed from: F */
    public int f111F;

    /* renamed from: F */
    public boolean f112F;

    /* renamed from: F */
    private int[] f113F;

    /* renamed from: G */
    public int f114G;

    /* renamed from: G */
    public boolean f115G;

    /* renamed from: G */
    private int[] f116G;

    /* renamed from: H */
    public int f117H;

    /* renamed from: H */
    public boolean f118H;

    /* renamed from: H */
    private int[] f119H;

    /* renamed from: I */
    public int f120I;

    /* renamed from: I */
    public boolean f121I;

    /* renamed from: I */
    private int[] f122I;

    /* renamed from: J */
    public int f123J;

    /* renamed from: J */
    public boolean f124J;

    /* renamed from: J */
    private int[] f125J;

    /* renamed from: K */
    public int f126K;

    /* renamed from: K */
    public boolean f127K;

    /* renamed from: K */
    private int[] f128K;

    /* renamed from: L */
    public int f129L;

    /* renamed from: L */
    private boolean f130L;

    /* renamed from: L */
    private int[] f131L;

    /* renamed from: M */
    public int f132M;

    /* renamed from: M */
    private boolean f133M;

    /* renamed from: M */
    private int[] f134M;

    /* renamed from: N */
    public int f135N;

    /* renamed from: N */
    private boolean f136N;

    /* renamed from: O */
    public int f137O;

    /* renamed from: O */
    private boolean f138O;

    /* renamed from: P */
    public int f139P;

    /* renamed from: P */
    private boolean f140P;

    /* renamed from: Q */
    public int f141Q;

    /* renamed from: R */
    public int f142R;

    /* renamed from: S */
    public int f143S;

    /* renamed from: T */
    public int f144T;

    /* renamed from: T */
    private boolean f145T;

    /* renamed from: U */
    public int f146U;

    /* renamed from: U */
    private boolean f147U;

    /* renamed from: V */
    public int f148V;

    /* renamed from: V */
    private boolean f149V;

    /* renamed from: W */
    public int xPos;

    /* renamed from: X */
    public int yPos;

    /* renamed from: Y */
    public int f152Y;

    /* renamed from: Y */
    private boolean f153Y;

    /* renamed from: Z */
    public int f154Z;

    /* renamed from: Z */
    private boolean f155Z;

    /* renamed from: a */
    public byte f156a;

    /* renamed from: a */
    public AudioModule samplePlayer;

    /* renamed from: a */
    private String f158a;

    /* renamed from: a */
    private Vector f159a;

    /* renamed from: a */
    public MIDlet f160a;

    /* renamed from: a */
    public boolean f161a = false;

    /* renamed from: a */
    public String[] f162a = new String[2];

    /* renamed from: a */
    public boolean[] f163a = new boolean[10];

    /* renamed from: a */
    private byte[][] f164a = {new byte[]{31, 32, 33}, new byte[]{35, 34}, new byte[]{39, 40, 41, 42, 43}};

    /* renamed from: a */
    public short[][] f165a;

    /* renamed from: aA */
    public int f166aA;

    /* renamed from: aB */
    public int f167aB;

    /* renamed from: aC */
    public int minValue;

    /* renamed from: aD */
    public int f169aD;

    /* renamed from: aG */
    public int f170aG;

    /* renamed from: aJ */
    private int f171aJ;

    /* renamed from: aK */
    private int f172aK;

    /* renamed from: aL */
    private int f173aL;

    /* renamed from: aM */
    private int f174aM;

    /* renamed from: aN */
    private int f175aN;

    /* renamed from: aO */
    private int f176aO;

    /* renamed from: aP */
    private int f177aP;

    /* renamed from: aQ */
    private int f178aQ;

    /* renamed from: aR */
    private int f179aR;

    /* renamed from: aS */
    private int f180aS;

    /* renamed from: aT */
    private int f181aT;

    /* renamed from: aU */
    private int f182aU;

    /* renamed from: aV */
    private int f183aV;

    /* renamed from: aW */
    private int f184aW;

    /* renamed from: aX */
    private int f185aX;

    /* renamed from: aY */
    private int f186aY;

    /* renamed from: aZ */
    private int f187aZ;

    /* renamed from: aa */
    public int f188aa;

    /* renamed from: aa */
    private boolean f189aa;

    /* renamed from: ab */
    public int f190ab;

    /* renamed from: ab */
    private boolean f191ab;

    /* renamed from: ac */
    public int f192ac;

    /* renamed from: ad */
    public int f193ad;

    /* renamed from: ae */
    public int f194ae;

    /* renamed from: af */
    public int f195af;

    /* renamed from: ag */
    public int f196ag;

    /* renamed from: ah */
    public int f197ah;

    /* renamed from: ai */
    public int gameMode;

    /* renamed from: aj */
    public int zoneID;

    /* renamed from: ak */
    public int actID;

    /* renamed from: al */
    public int f201al;

    /* renamed from: am */
    public int f202am;

    /* renamed from: an */
    public int f203an;

    /* renamed from: ao */
    public int f204ao;

    /* renamed from: ap */
    public int f205ap;

    /* renamed from: aq */
    public int f206aq;

    /* renamed from: ar */
    public int f207ar;

    /* renamed from: as */
    public int f208as;

    /* renamed from: at */
    public int f209at;

    /* renamed from: au */
    public int f210au;

    /* renamed from: av */
    public int f211av;

    /* renamed from: aw */
    public int f212aw;

    /* renamed from: ax */
    public int f213ax;

    /* renamed from: ay */
    public int f214ay;

    /* renamed from: az */
    public int f215az;

    /* renamed from: b */
    public byte f216b;

    /* renamed from: b */
    public long f217b;

    /* renamed from: b */
    private String f218b;

    /* renamed from: b */
    public boolean f219b;

    /* renamed from: b */
    public byte[] lvlColMaps;

    /* renamed from: b */
    public String[] f221b;

    /* renamed from: b */
    public boolean[] f222b;

    /* renamed from: b */
    private int[][][] f223b;

    /* renamed from: bA */
    private int f224bA;

    /* renamed from: bB */
    private int lives_prev;

    /* renamed from: bC */
    private int f226bC;

    /* renamed from: bD */
    private int f227bD;

    /* renamed from: bE */
    private int f228bE;

    /* renamed from: bF */
    private int f229bF;

    /* renamed from: bG */
    private int f230bG;

    /* renamed from: bH */
    private int f231bH;

    /* renamed from: bI */
    private int f232bI;

    /* renamed from: bJ */
    private int f233bJ;

    /* renamed from: bK */
    private int f234bK;

    /* renamed from: bL */
    private int f235bL;

    /* renamed from: bM */
    private int f236bM;

    /* renamed from: bN */
    private int f237bN;

    /* renamed from: bO */
    private int f238bO;

    /* renamed from: bP */
    private int f239bP;

    /* renamed from: bQ */
    private int f240bQ;

    /* renamed from: bR */
    private int f241bR;

    /* renamed from: bS */
    private int f242bS;

    /* renamed from: ba */
    private int f243ba;

    /* renamed from: bb */
    private int f244bb;

    /* renamed from: bc */
    private int f245bc;

    /* renamed from: bd */
    private int f246bd;

    /* renamed from: be */
    private int f247be;

    /* renamed from: bf */
    private int f248bf;

    /* renamed from: bg */
    private int f249bg;

    /* renamed from: bh */
    private int f250bh;

    /* renamed from: bi */
    private int sonicMaxDec;

    /* renamed from: bj */
    private int sonicGravity;

    /* renamed from: bk */
    private int jmpSpeed;

    /* renamed from: bl */
    private int underwaterJmpSpeed;

    /* renamed from: bm */
    private int f255bm;

    /* renamed from: bn */
    private int f256bn;

    /* renamed from: bo */
    private int f257bo;

    /* renamed from: bp */
    private int f258bp;

    /* renamed from: bq */
    private int f259bq;

    /* renamed from: br */
    private int f260br;

    /* renamed from: bs */
    private int f261bs;

    /* renamed from: bt */
    private int f262bt;

    /* renamed from: bu */
    private int tilesetMapsWidth;

    /* renamed from: bv */
    private int tilesetMapsHeight;

    /* renamed from: bw */
    private int f265bw;

    /* renamed from: bx */
    private int f266bx;

    /* renamed from: by */
    private int rings_prev;

    /* renamed from: bz */
    private int score_prev;

    /* renamed from: c */
    public byte f269c;

    /* renamed from: c */
    public long f270c;

    /* renamed from: c */
    private byte[] collisionArr;

    /* renamed from: c */
    public String[] f272c;

    /* renamed from: c */
    public boolean[] f273c;

    /* renamed from: c */
    private byte[][] objPosArr;

    /* renamed from: c */
    public int[][] f275c;

    /* renamed from: d */
    private byte f276d;

    /* renamed from: d */
    public long f277d;

    /* renamed from: d */
    private byte[] f278d;

    /* renamed from: d */
    public boolean[] f279d;

    /* renamed from: d */
    private byte[][] tilesetMaps;

    /* renamed from: e */
    private byte f281e;

    /* renamed from: e */
    public long f282e;

    /* renamed from: e */
    private byte[] f283e;

    /* renamed from: e */
    public boolean[] f284e;

    /* renamed from: e */
    public int[][] f285e;

    /* renamed from: f */
    private byte f286f;

    /* renamed from: f */
    private byte[] f287f;

    /* renamed from: f */
    public int[] f288f;

    /* renamed from: f */
    private String[] f289f;

    /* renamed from: f */
    public boolean[] f290f;

    /* renamed from: g */
    private byte f291g;

    /* renamed from: g */
    private byte[] f292g;

    /* renamed from: g */
    private boolean[] f293g = new boolean[10];

    /* renamed from: h */
    private byte f294h;

    /* renamed from: h */
    private byte[] lvlChunks;

    /* renamed from: h */
    private boolean[] f296h;

    /* renamed from: h */
    private int[][] f297h;

    /* renamed from: i */
    private byte f298i;

    /* renamed from: i */
    private byte[] f299i;

    /* renamed from: i */
    private int[][] f300i;

    /* renamed from: j */
    private byte f301j;

    /* renamed from: j */
    public int f302j = 1;

    /* renamed from: j */
    private byte[] tileCollisionTable;

    /* renamed from: j */
    private int[][] objSizeTable;

    /* renamed from: k */
    public int f305k = 1;

    /* renamed from: k */
    private byte[] angleTable;

    /* renamed from: k */
    private int[][] f307k;

    /* renamed from: l */
    public int f308l;

    /* renamed from: l */
    private byte[] f309l;

    /* renamed from: m */
    public int f310m;

    /* renamed from: m */
    private byte[] f311m;

    /* renamed from: n */
    public int sonicMaxSpd;

    /* renamed from: o */
    public int sonicMaxAcc;

    /* renamed from: p */
    public boolean f314p;

    /* renamed from: q */
    public int invincibilityTimer;

    /* renamed from: q */
    public boolean f316q;

    /* renamed from: r */
    public int f317r;

    /* renamed from: r */
    public boolean f318r;

    /* renamed from: s */
    public int spdshoesTimer;

    /* renamed from: s */
    public boolean f320s;

    /* renamed from: t */
    public int f321t;

    /* renamed from: t */
    public boolean f322t;

    /* renamed from: u */
    public int f323u;

    /* renamed from: u */
    public boolean f324u;

    /* renamed from: v */
    public int rings;

    /* renamed from: v */
    public boolean f326v;

    /* renamed from: w */
    public int score;

    /* renamed from: w */
    public boolean f328w;

    /* renamed from: w */
    public int[] objData;

    /* renamed from: x */
    public int f330x;

    /* renamed from: x */
    public boolean f331x;

    /* renamed from: y */
    public int f332y;

    /* renamed from: y */
    public boolean f333y;

    /* renamed from: z */
    public int f334z;

    static {
        int[] iArr = {16, 16, 8, 8, 8};
        int[] iArr2 = {32, 32, 24, 24, 16};
        int[] iArr3 = {32, 32, 16, 24, 16};
        int[][] iArr4 = {new int[]{-1, 1}, new int[]{1, -1}};
        int[] iArr5 = {40, 40, 16, 16, 0};
        int[][] iArr6 = {new int[]{0, 4}, new int[]{4, 0}, new int[]{2, 6}, new int[]{0, 0}};
        int[][] iArr7 = {new int[]{2, 6}, new int[]{2, 6}, new int[]{4, 0}, new int[]{2, 6}};
        short[][] sArr = {new short[]{88, 56, 16, 16}, new short[]{64, 56, 24, 24}, new short[]{88, 72, 16, 16}, new short[]{88, 88, 16, 16}, new short[]{64, 80, 24, 24}};
        int[] iArr8 = {0, 0, 0, 2};
        int[] iArr9 = {0, 16, 32, 16};
    }

    public RunnableC0002c(MIDlet mIDlet, int i) {
        short[][] sArr = {new short[]{0, 0, 64, 96}, new short[]{64, 0, 64, 96}, new short[]{128, 0, 64, 96}};
        this.f308l = 0;
        this.f110E = new int[]{5898300, (((getWidth() - 90) - 16) << 16) | 60, 4587610, (((getWidth() - 70) - 16) << 16) | 90, 5898366, (((getWidth() - 90) - 16) << 16) | 126};
        this.f175aN = 0;
        this.f176aO = 0;
        this.f178aQ = 0;
        this.f181aT = 0;
        this.f187aZ = f51d >> 1;
        this.f243ba = (f70h * 3) >> 2;
        this.f221b = new String[93];
        this.f289f = new String[357];
        this.f133M = false;
        this.f245bc = 10;
        this.f297h = (int[][]) Array.newInstance(Integer.TYPE, this.f245bc, 15);
        this.f247be = 0;
        this.f248bf = 2100;
        this.f249bg = 0;
        this.f250bh = 0;
        this.sonicMaxSpd = 1536;
        this.sonicMaxAcc = 12;
        this.sonicMaxDec = 128;
        this.sonicGravity = 56;
        this.jmpSpeed = 1664;
        this.underwaterJmpSpeed = 896;
        this.f113F = new int[2];
        this.f296h = new boolean[4];
        this.f111F = 0;
        this.f114G = 0;
        this.f275c = (int[][]) Array.newInstance(Integer.TYPE, 30, 25);
        this.f165a = (short[][]) Array.newInstance(Short.TYPE, 10, 4);
        this.f123J = 0;
        this.f288f = new int[]{64, 32, 64};
        this.f222b = new boolean[256];
        this.f314p = false;
        this.collisionArr = new byte[8192];
        this.f285e = (int[][]) Array.newInstance(Integer.TYPE, 256, 25);
        this.objData = new int[25];
        this.f307k = (int[][]) Array.newInstance(Integer.TYPE, 30, 10);
        this.f316q = false;
        this.f318r = false;
        this.f284e = new boolean[256];
        this.f197ah = 0;
        this.f259bq = 0;
        this.f260br = 0;
        this.f261bs = 0;
        this.f262bt = 0;
        this.zoneID = -1;
        this.actID = 0;
        this.f201al = 0;
        this.f202am = 0;
        this.f116G = new int[2];
        this.f119H = new int[2];
        this.f122I = new int[2];
        this.tileCollisionTable = new byte[8192];
        this.objPosArr = new byte[4][];
        this.angleTable = new byte[512];
        this.f265bw = 0;
        this.f322t = false;
        this.f324u = false;
        this.f294h = 9;
        this.f203an = 0;
        this.f309l = new byte[4];
        this.f333y = false;
        this.rings_prev = 0;
        this.score_prev = 0;
        this.f224bA = 0;
        this.lives_prev = 0;
        this.f145T = false;
        this.f147U = false;
        this.f105C = false;
        this.f229bF = 0;
        this.f230bG = 0;
        this.f232bI = 10;
        this.f128K = new int[4];
        this.f233bJ = 0;
        this.f109E = false;
        this.f208as = 0;
        this.f209at = 0;
        this.f210au = 0;
        this.f234bK = 0;
        this.f235bL = 0;
        this.f155Z = false;
        this.f189aa = false;
        this.f211av = 0;
        this.f311m = new byte[4];
        this.f212aw = 0;
        this.f290f = new boolean[]{false, false, false, false, false};
        this.f115G = false;
        this.f213ax = 0;
        this.f214ay = 0;
        this.f118H = false;
        this.f215az = 0;
        this.f166aA = 0;
        this.f167aB = 0;
        this.minValue = Integer.MIN_VALUE;
        this.f103B = new int[6];
        this.f169aD = 0;
        this.f272c = new String[]{"", ""};
        this.f170aG = 3;
        this.f124J = false;
        this.f191ab = false;
        this.f241bR = 0;
        this.f131L = new int[3];
        this.f134M = new int[8];
        this.f242bS = 0;
        this.f218b = "";
        this.f127K = false;
        this.f160a = mIDlet;
        this.f215az = i;
        setFullScreenMode(true);
        sizeChanged(getWidth(), getHeight());
    }

    /* renamed from: A */
    private static void m120A(int[] iArr) {
        if (iArr[15] >= 0 && iArr[15] <= 3) {
            m204b(0, 16, iArr[15] * 16, 16, 16, 0, iArr[2] / 100, iArr[3] / 100);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: B */
    private static void m121B(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 15;
        int i6 = (iArr[2] / 100) - f100z[0];
        int i7 = (iArr[3] / 100) - f100z[1];
        int i8 = iArr[8];
        if (i8 >= 0) {
            if (i8 > 6) {
                i8 = 6;
            }
            switch (i8) {
                case 1:
                    i5 = 10;
                    i4 = 3;
                    i = 0;
                    i2 = i5;
                    i3 = i4;
                    break;
                case 2:
                    i = 16;
                    i2 = 10;
                    i3 = 3;
                    break;
                case 3:
                    i4 = 3;
                    i = 0;
                    i2 = i5;
                    i3 = i4;
                    break;
                case 4:
                    i = 8;
                    i2 = 15;
                    i3 = 3;
                    break;
                case 5:
                    i = 16;
                    i2 = 15;
                    i3 = 3;
                    break;
                case 6:
                    i5 = 20;
                    i4 = 3;
                    i = 0;
                    i2 = i5;
                    i3 = i4;
                    break;
                default:
                    i5 = 5;
                    i4 = 8;
                    i = 0;
                    i2 = i5;
                    i3 = i4;
                    break;
            }
            drawSprite(screenBuffer, uiObjGfx[3], i3, i, i2, 8, 0, i6, i7, 3, true);
        }
    }

    /* renamed from: C */
    private static void m122C(int[] iArr) {
        m203b(iArr[2] / 100, iArr[3] / 100, 96, iArr[15], rotationQuadrants[0]);
    }

    /* renamed from: D */
    private static void m123D(int[] iArr) {
        int[] iArr2;
        int i = 2;
        char c = 0;
        int i2 = iArr[2] / 100;
        int i3 = iArr[3] / 100;
        if (iArr[8] == 0) {
            i = 0;
        }
        if (iArr[19] == 0) {
            iArr2 = rotationQuadrants;
        } else {
            iArr2 = rotationQuadrants;
            c = 4;
        }
        m203b(i2, i3, 49, i, iArr2[c]);
    }

    /* renamed from: E */
    public static void m124E() {
        if (uiObjGfx[8] != null) {
            screenBuffer.drawImage(uiObjGfx[8], f51d - 2, (f62f + f57e) - 5, 40);
        }
    }

    /* renamed from: E */
    private void m125E(int[] iArr) {
        int i = 5;
        if (iArr[6] < 5) {
            i = 3;
        } else if (iArr[6] < 10) {
            i = 4;
        } else if (iArr[6] >= 15) {
            return;
        }
        if ((this.f302j & 1) == 0) {
            m203b(iArr[2] / 100, iArr[3] / 100, 41, i, rotationQuadrants[0]);
        }
    }

    /* renamed from: F */
    private void m126F(int[] iArr) {
        int i = iArr[15] % 5;
        if (i == 0) {
            i += this.f302j & 3;
        }
        m204b(101, 0, i * 32, 24, 32, m242i(iArr[18]), iArr[2] / 100, iArr[3] / 100);
    }

    /* renamed from: G */
    private static void m127G(int[] iArr) {
        int i = iArr[15] & 3;
        m204b(iArr[1] == 23 ? 102 : iArr[1] == 24 ? 18 : 27, f56d[i][0], f56d[i][1], 16, 16, 0, iArr[2] / 100, iArr[3] / 100);
    }

    /* renamed from: H */
    private static void m128H(int[] iArr) {
        int i;
        switch (iArr[8]) {
            case 1:
                i = 16;
                break;
            case 2:
                i = 32;
                break;
            default:
                i = 0;
                break;
        }
        m204b(18, i, 0, 16, 16, 0, iArr[2] / 100, iArr[3] / 100);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: short[][] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: short[][] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v14, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v15, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r2v21, resolved type: short[][] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v22, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v23, resolved type: short */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b5  */
    /* renamed from: I */
    private void m129I(int[] iArr) {
        char c = 3;
        int i = (iArr[1] - 28) % 7;
        if (iArr[14] > 2) {
            iArr[2] = iArr[2] + iArr[10];
            iArr[3] = iArr[3] + iArr[11];
            iArr[11] = iArr[11] + 10;
            if (iArr[11] > 800) {
                iArr[11] = 800;
            }
        }
        switch (iArr[14]) {
            case 1:
                iArr[10] = 0;
                iArr[15] = 0;
                iArr[5] = iArr[8];
                iArr[14] = iArr[14] + 1;
                if (iArr[5] <= 0) {
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = 0;
                    if (m340b(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                        iArr[10] = f61e[i][0];
                        iArr[11] = f61e[i][1];
                        if (iArr[19] == 1) {
                            iArr[10] = -iArr[10];
                        }
                        iArr[6] = 0;
                        iArr[14] = iArr[14] + 1;
                        iArr[15] = 1;
                        if (m340b(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                            for (int i2 = 0; i2 < 3; i2++) {
                                iArr[3] = iArr[3] - 200;
                                if (!m340b(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                                    iArr[11] = f61e[i][1];
                                    break;
                                }
                            }
                            iArr[11] = f61e[i][1];
                        }
                    }
                }
                break;
            case 2:
                if (iArr[5] <= 0) {
                }
                break;
            case 3:
                iArr[15] = 0;
                if (m340b(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                }
                break;
            case 4:
                iArr[15] = 1;
                if (m340b(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                }
                break;
            default:
                iArr[14] = 1;
                iArr[10] = 0;
                iArr[15] = 0;
                iArr[5] = iArr[8];
                iArr[14] = iArr[14] + 1;
                if (iArr[5] <= 0) {
                }
                break;
        }
        if (iArr[3] >= 0) {
            if (iArr[3] > 999900) {
                c = 0;
            } else {
                return;
            }
        }
        iArr[c] = 0;
    }

    /* renamed from: J */
    private static void m130J(int[] iArr) {
        int[] iArr2;
        char c;
        int i;
        int i2 = iArr[15] % 3;
        if (i2 >= 0) {
            switch (iArr[19]) {
                case 1:
                    iArr2 = rotationQuadrants;
                    c = 4;
                    i = iArr2[c];
                    break;
                case 2:
                    iArr2 = rotationQuadrants;
                    c = 6;
                    i = iArr2[c];
                    break;
                case 3:
                    iArr2 = rotationQuadrants;
                    c = 2;
                    i = iArr2[c];
                    break;
                default:
                    i = 0;
                    break;
            }
            m203b(iArr[2] / 100, iArr[3] / 100, 100, i2, i);
        }
    }

    /* renamed from: a */
    public static int mo33a() {
        return f47c[0] >> 8;
    }

    /* renamed from: a */
    public static int mo34a(int i) {
        int i2 = i % 360;
        if (i2 >= 0 && i2 <= 90) {
            return f13A[i2] / 100;
        }
        if (i2 > 90 && i2 <= 180) {
            return f13A[90 - (i2 - 90)] / 100;
        }
        if (i2 > 180 && i2 <= 270) {
            return (f13A[i2 - 180] / 100) * -1;
        }
        if (i2 <= 270 || i2 > 359) {
            return 0;
        }
        return (f13A[90 - (i2 - 270)] / 100) * -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        if (p000.RunnableC0002c.sonicAngle == 44) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* renamed from: a */
    private int mo45a(int i, int i2) {
        int i3;
        int i4 = 0;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i5 = (this.tilesetMaps[((i2 >> 4) >> 4) % this.tilesetMapsHeight][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
        if (this.f287f[i5 >> 1] == 1) {
            return -1;
        }
        int f = (m229f((this.lvlChunks[i5] & 255) + (this.f278d[i5 >> 1] << 8)) * 360) / 255;
        if (this.f283e[i5 >> 1] != 1) {
            if (this.f283e[i5 >> 1] == 2) {
                i3 = 540;
                f = i3 - f;
                if (f % 90 == 0) {
                    if (sonicAngle == 62) {
                        return 90;
                    }
                    f = Math.abs(((sonicAngle - 22) + 45) / 90) * 90;
                }
                i4 = f;
                return i4 % 360;
            }
            if (this.f283e[i5 >> 1] == 3) {
                f = (540 - f) % 360;
            }
            if (f % 90 == 0) {
            }
            i4 = f;
            return i4 % 360;
        }
        i3 = 360;
        f = i3 - f;
        if (f % 90 == 0) {
        }
        i4 = f;
        return i4 % 360;
    }

    /* renamed from: a */
    public static int m134a(int i, int i2, int i3, int i4, int i5, int i6) {
        return m135a(mo33a(), mo48b() - 12, f40b[0], f40b[1] - 12, 12, 12, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: a */
    public static int m135a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (f76j || f80l) {
            return -1;
        }
        if (i4 + i6 <= i10 - i12 && i2 + i6 >= i8 - i12 && i + i5 >= i7 - i11 && i - i5 <= i7 + i11) {
            return (i + i5 <= i7 - i11 || i - i5 >= i7 + i11) ? -1 : 0;
        }
        if (i3 + i5 <= i9 - i11 && i + i5 >= i7 - i11 && i2 + i6 >= i8 - i12 && i2 - i6 <= i8 + i12) {
            return 1;
        }
        if (i3 - i5 >= i9 + i11 && i - i5 <= i7 + i11 && i2 + i6 >= i8 - i12 && i2 - i6 <= i8 + i12) {
            return 2;
        }
        if (i4 - i6 < i10 + i12 || i2 - i6 > i8 + i12 || i + i5 < i7 - i11 || i - i5 > i7 + i11) {
            return (i + i5 < i7 - i11 || i - i5 > i7 + i11 || i2 + i6 < i8 - i12 || i2 - i6 > i8 + i12) ? -1 : 4;
        }
        return 3;
    }

    /* renamed from: a */
    private static int m136a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == ' ' || charAt == '~') {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private int mo42a(boolean z) {
        if (this.f248bf < 600) {
            return 17;
        }
        if (this.invincibilityTimer > 0) {
            return 6;
        }
        if (this.f322t) {
            return this.zoneID != 5 ? 11 : 12;
        }
        if (z) {
            switch (this.zoneID) {
                case 0:
                    return 21;
                case 1:
                    return this.actID == 3 ? 5 : 1;
                case 2:
                    return 22;
                case 3:
                    return 3;
                case 4:
                    return 23;
                case 5:
                    return this.actID != 3 ? 5 : 12;
                case 6:
                    return 8;
                default:
                    return 21;
            }
        } else {
            switch (this.zoneID) {
                case 0:
                    return 0;
                case 1:
                    return this.actID == 3 ? 5 : 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return this.actID != 3 ? 5 : 12;
                case 6:
                    return 8;
                default:
                    return 0;
            }
        }
    }

    /* renamed from: a */
    public static DataInputStream loadFileIntoDataInputStream(String str) {
        return new DataInputStream(loadFileIntoInputStream(str));
    }

    /* renamed from: a */
    public static InputStream loadFileIntoInputStream(String str) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception e) {
            }
            inputStream = null;
        }
        InputStream resourceAsStream = new Object().getClass().getResourceAsStream(str);
        inputStream = resourceAsStream;
        return resourceAsStream;
    }

    /* renamed from: a */
    private String m140a() {
        long j = ((long) this.f308l) | 0 | (((long) this.f298i) << 30) | ((long) (this.f266bx << 3));
        char[] cArr = new char[8];
        for (int length = cArr.length - 1; length >= 0; length--) {
            int i = (int) (j % 36);
            cArr[length] = (char) (i < 10 ? i + 48 : (i + 65) - 10);
            j /= 36;
        }
        return new String(cArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r2 = 0;
     */
    /* renamed from: a */
    public static Vector m141a(String str) {
        int i;
        Vector vector = new Vector();
        int i2 = 0;
        while (i2 < str.length()) {
            String substring = str.substring(i2);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (m201b(substring, i4) >= f66g - 32) {
                    i = i4;
                    break;
                }
                i = m136a(substring, i4 + 1);
                if (i != -1) {
                    if (substring.charAt(i) == '~') {
                        break;
                    }
                    i3 = i4;
                    i4 = i;
                } else {
                    i = substring.length();
                    if (i4 == 0) {
                        i3 = i4;
                        break;
                    } else if (m201b(substring, i) < f66g - 32) {
                        break;
                    } else {
                        i3 = i4;
                        i4 = i;
                    }
                }
            }
            if (i3 == 0) {
                vector.addElement(substring.substring(0, i));
                i2 += i + 1;
            } else {
                vector.addElement(substring.substring(0, i3));
                i2 += i3 + 1;
            }
        }
        return vector;
    }

    /* renamed from: a */
    private static Image loadImage(String str) {
        try {
            return Image.createImage(str);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void LoadZoneTiles(int i, int i2) {
        zoneTiles = null;
        zoneTiles = loadImage((i == 1 && i2 == 3) ? "/z_zone_marble.png" : new StringBuffer().append("/zone").append(i + 1).append(".png").toString());
    }

    /* renamed from: a */
    public static void mo46a(int i, int i2, int i3, int i4, int i5) {
        if (gameObjGfx[i] != null) {
            drawSprite(screenBuffer, gameObjGfx[i], 0, 0, gameObjGfx[i].getWidth(), gameObjGfx[i].getHeight(), i2, mo63d(i3 - f100z[0]), mo63d(i4 - f100z[1]), i5, true);
        }
    }

    /* renamed from: a */
    public static void m145a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i4 >= 0 && framedata[i3].length != 0) {
            int length = i4 % framedata[i3].length;
            drawSprite(screenBuffer, gameObjGfx[i3], framedata[i3][length][0], framedata[i3][length][1], framedata[i3][length][2], framedata[i3][length][3], i5, mo63d(i - f100z[0]), mo63d(i2 - f100z[1]) + (framedata[i3][length].length > 4 ? framedata[i3][length][4] : 0), i6, true);
        }
    }

    /* renamed from: a */
    public static void m146a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        drawSprite(screenBuffer, gameObjGfx[i], i2, i3, i4, i5, i6, i7, i8, 3, true);
    }

    /* renamed from: a */
    public static void m147a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        drawSprite(screenBuffer, gameObjGfx[i], i2, i3, i4, i5, i6, mo63d(i7 - f100z[0]), mo63d(i8 - f100z[1]), i9, true);
    }

    /* renamed from: a */
    public static void m148a(String str, int i, int i2, int i3, int i4, int i5) {
        screenBuffer.setColor(i4);
        screenBuffer.drawString(str, i - 1, i2, i5);
        screenBuffer.drawString(str, i + 1, i2, i5);
        screenBuffer.drawString(str, i, i2 + 1, i5);
        screenBuffer.drawString(str, i, i2 - 1, i5);
        screenBuffer.setColor(i3);
        screenBuffer.drawString(str, i, i2, i5);
    }

    /* renamed from: a */
    private void m149a(String str, int i, int i2, int i3, boolean z) {
        int height = screenBuffer.getFont().getHeight();
        if (str.length() != 0) {
            int stringWidth = screenBuffer.getFont().stringWidth(str) + 5;
            m202b((i3 & 1) == 1 ? i - (stringWidth / 2) : i, i2, stringWidth, height);
            if (z) {
                m148a(str, i + 1, i2, 16777215, 255, i3);
            }
        }
    }

    /* renamed from: a */
    public static void drawSprite(Graphics graphics, Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9;
        if (image != null) {
            if (z) {
                try {
                    i9 = f73i;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                i9 = f62f;
            }
            graphics.drawRegion(image, i, i2, i3, i4, i5, i6, i7 + i9, i8);
        }
    }

    /* renamed from: a */
    private void m151a(boolean z, boolean z2) {
        PlaneDisplayer.m3a(screenBuffer, this.f302j * 5, 120, z);
        if (z2) {
            screenBuffer.setColor(0);
            for (int i = 0; i < f70h; i += 2) {
                screenBuffer.drawLine(0, f73i + i, f51d, f73i + i);
            }
        }
        this.f302j++;
    }

    /* renamed from: a */
    private static void m152a(byte[] bArr, String str) {
        try {
            RecordStore openRecordStore = RecordStore.openRecordStore(new StringBuffer().append(str).append("6390").toString(), true);
            try {
                openRecordStore.setRecord(1, bArr, 0, bArr.length);
            } catch (Throwable th) {
                openRecordStore.addRecord(bArr, 0, bArr.length);
            }
            openRecordStore.closeRecordStore();
        } catch (Throwable th2) {
        }
    }

    /* renamed from: a */
    private static void m153a(Image[] imageArr) {
        synchronized (imageArr) {
            for (int i = 0; i < imageArr.length; i++) {
                imageArr[i] = null;
            }
        }
        System.gc();
    }

    /* renamed from: a */
    private static boolean m154a(int i) {
        return i == 0 || i == 2 || i == 4;
    }

    /* renamed from: a */
    public static boolean mo31a(int i, int i2, int i3) {
        int a = i - mo33a();
        int b = i2 - (mo48b() - (f74i ? 16 : 20));
        return (b * b) + (a * a) < i3 * i3;
    }

    /* renamed from: a */
    private boolean m156a(String str) {
        int i;
        long j = 0;
        long j2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (charAt >= '0' && charAt <= '9') {
                i = charAt - '0';
            } else if (charAt < 'A' || charAt > 'Z') {
                return false;
            } else {
                i = (charAt - 'A') + 10;
            }
            j += ((long) i) * j2;
            j2 *= 36;
        }
        byte b = (byte) ((int) ((j >> 30) & 127));
        int i2 = (int) ((j >> 3) & 134217727);
        int i3 = (int) (7 & j);
        if (b < 1 || b > 99 || i2 < 0 || i2 > 99999999 || i3 < 0 || i3 > 6) {
            return false;
        }
        if (this.f291g == 0) {
            this.f294h = 10;
        }
        this.f298i = b;
        this.f266bx = i2;
        this.f308l = i3;
        m174ac();
        return true;
    }

    /* renamed from: a */
    public static boolean m157a(int[] iArr, int i, int i2) {
        int a = mo33a();
        int b = mo48b() - (f74i ? 16 : 20);
        if (iArr[3] - i2 > b || b > iArr[3] + i2) {
            return false;
        }
        switch (iArr[19]) {
            case 0:
                if (iArr[2] - i < a && a < iArr[2]) {
                    return true;
                }
            case 1:
                if (iArr[2] < a && a < iArr[2] + i) {
                    return true;
                }
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] loadFile(String str) {
        try {
            byte[] bArr = new byte[512];
            InputStream a = loadFileIntoInputStream(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = a.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.close();
                    a.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static int[] loadDataIntoArray(DataInputStream dataInputStream) {
        int[] iArr = new int[0];
        try {
            int readInt = dataInputStream.readInt();
            iArr = new int[readInt];
            for (int i = 0; i < readInt; i++) {
                iArr[i] = dataInputStream.readInt();
            }
        } catch (Exception e) {
        }
        return iArr;
    }

    /* renamed from: a */
    public static int[][] loadDataInto2DArray(DataInputStream dataInputStream) {
        int[][] iArr = new int[0][];
        try {
            int readInt = dataInputStream.readInt();
            iArr = new int[readInt][];
            for (int i = 0; i < readInt; i++) {
                iArr[i] = loadDataIntoArray(dataInputStream);
            }
        } catch (Exception e) {
        }
        return iArr;
    }

    /* renamed from: a */
    public static int[][][] loadDataInto3DArray(DataInputStream dataInputStream) {
        int[][][] iArr = new int[0][][];
        try {
            int readInt = dataInputStream.readInt();
            iArr = new int[readInt][][];
            for (int i = 0; i < readInt; i++) {
                iArr[i] = loadDataInto2DArray(dataInputStream);
            }
        } catch (Exception e) {
        }
        return iArr;
    }

    /* renamed from: aA */
    private void m162aA() {
        int i;
        try {
            InputStream a = loadFileIntoInputStream(new StringBuffer().append("/lang_").append((int) this.f311m[2]).append(".txt").toString());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(300);
            byte[] bArr = new byte[1];
            i = 0;
            while (a.read(bArr) > 0) {
                try {
                    if (bArr[0] == 13) {
                        a.read(bArr);
                        this.f221b[i] = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                        byteArrayOutputStream.reset();
                        i++;
                    } else {
                        byteArrayOutputStream.write(bArr);
                    }
                } catch (Exception e) {
                    System.err.println(new StringBuffer().append((int) this.f311m[2]).append(": error on line: ").append(i + 1).toString());
                }
            }
            tryCloseInputStream();
            byteArrayOutputStream.close();
            InputStream a2 = loadFileIntoInputStream(new StringBuffer().append("/manual_").append((int) this.f311m[2]).append(".txt").toString());
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(300);
            int i2 = 0;
            while (a2.read(bArr) > 0) {
                if (bArr[0] == 13) {
                    a2.read(bArr);
                    this.f289f[i2] = new String(byteArrayOutputStream2.toByteArray(), "UTF-8");
                    byteArrayOutputStream2.reset();
                    i2++;
                } else {
                    byteArrayOutputStream2.write(bArr);
                }
            }
            tryCloseInputStream();
            byteArrayOutputStream2.close();
        } catch (Exception e2) {
            i = 0;
            System.err.println(new StringBuffer().append((int) this.f311m[2]).append(": error on line: ").append(i + 1).toString());
        }
    }

    /* renamed from: aB */
    private static void loadUIGfx() {
        uiObjGfx[10] = loadImage("/Systxt.png");
        uiObjGfx[13] = loadImage("/Systxt2.png");
        uiObjGfx[11] = loadImage("/windou_time.png");
        uiObjGfx[12] = loadImage("/windou_suuji.png");
        uiObjGfx[14] = loadImage("/gameover.png");
        uiObjGfx[15] = loadImage("/timeover.png");
        uiObjGfx[1] = loadImage("/windou_ring.png");
        uiObjGfx[2] = loadImage("/windou_zanki.png");
        uiObjGfx[3] = loadImage("/score.png");
        uiObjGfx[4] = loadImage("/t_cur1.png");
        uiObjGfx[5] = loadImage("/t_cur2.png");
    }

    /* renamed from: aC */
    private void m164aC() {
        while (true) {
            for (int i = 0; i < this.f163a.length; i++) {
                if (this.f163a[i]) {
                    return;
                }
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: aD */
    private void loadGameObjGfx() {
        String str;
        Image[] imageArr;
        char c = 16;
        gameObjGfx[151] = loadImage("/sonic.png");
        gameObjGfx[152] = loadImage("/sonic_s.png");
        gameObjGfx[2] = loadImage("/sjump.png");
        gameObjGfx[96] = loadImage("/tama.png");
        gameObjGfx[47] = loadImage("/ring_large.png");
        gameObjGfx[0] = loadImage("/ring.png");
        gameObjGfx[36] = loadImage("/save.png");
        gameObjGfx[42] = loadImage("/item.png");
        gameObjGfx[109] = loadImage("/effect.png");
        gameObjGfx[9] = loadImage("/toge.png");
        gameObjGfx[153] = loadImage("/sjump2.png");
        gameObjGfx[15] = loadImage("/switch.png");
        gameObjGfx[97] = loadImage("/bakuhatu.png");
        gameObjGfx[44] = loadImage("/gole.png");
        gameObjGfx[45] = loadImage("/bten.png");
        gameObjGfx[100] = loadImage("/animal.png");
        switch (this.zoneID) {
            case 0:
                gameObjGfx[41] = loadImage("/musi.png");
                gameObjGfx[40] = loadImage("/hachi.png");
                gameObjGfx[86] = loadImage("/fish.png");
                gameObjGfx[39] = loadImage("/kamere.png");
                gameObjGfx[57] = loadImage("/kani.png");
                gameObjGfx[3] = loadImage("/buranko.png");
                gameObjGfx[4] = loadImage("/thashi.png");
                gameObjGfx[18] = loadImage("/brkabe_g.png");
                gameObjGfx[5] = loadImage("/hashi.png");
                gameObjGfx[58] = loadImage("/jyama.png");
                gameObjGfx[6] = loadImage("/break.png");
                gameObjGfx[37] = loadImage("/kageb.png");
                str = "/shima.png";
                imageArr = gameObjGfx;
                imageArr[c] = loadImage(str);
                break;
            case 2:
                gameObjGfx[40] = loadImage("/hachi.png");
                gameObjGfx[49] = loadImage("/imo.png");
                gameObjGfx[78] = loadImage("/bat.png");
                gameObjGfx[101] = loadImage("/fire.png");
                gameObjGfx[79] = loadImage("/ochi.png");
                gameObjGfx[54] = loadImage("/dai.png");
                gameObjGfx[8] = loadImage("/turi.png");
                gameObjGfx[94] = loadImage("/turi2.png");
                gameObjGfx[95] = loadImage("/turi3.png");
                gameObjGfx[13] = loadImage("/yogan2.png");
                gameObjGfx[99] = loadImage("/yogan22.png");
                gameObjGfx[11] = loadImage("/fblock.png");
                gameObjGfx[77] = loadImage("/yoganc.png");
                gameObjGfx[14] = loadImage("/myogan.png");
                gameObjGfx[98] = loadImage("/myogan2.png");
                gameObjGfx[7] = loadImage("/yuka.png");
                gameObjGfx[27] = loadImage("/bryuka.png");
                imageArr = gameObjGfx;
                str = "/buranko_m.png";
                c = 3;
                imageArr[c] = loadImage(str);
                break;
            case 4:
                gameObjGfx[101] = loadImage("/fire.png");
                gameObjGfx[40] = loadImage("/hachi.png");
                gameObjGfx[57] = loadImage("/kani.png");
                gameObjGfx[71] = loadImage("/yado.png");
                gameObjGfx[70] = loadImage("/aruma.png");
                gameObjGfx[60] = loadImage("/tekyu.png");
                gameObjGfx[102] = loadImage("/block.png");
                gameObjGfx[107] = loadImage("/dai2_3.png");
                gameObjGfx[83] = loadImage("/dai4_.png");
                gameObjGfx[17] = loadImage("/dai2.png");
                gameObjGfx[61] = loadImage("/signal.png");
                gameObjGfx[56] = loadImage("/bobin.png");
                str = "/shima5.png";
                imageArr = gameObjGfx;
                imageArr[c] = loadImage(str);
                break;
        }
        this.f124J = false;
    }

    /* renamed from: aE */
    private void m166aE() {
        Image[] imageArr;
        char c = 3;
        gameObjGfx[2] = null;
        gameObjGfx[96] = null;
        gameObjGfx[36] = null;
        gameObjGfx[42] = null;
        gameObjGfx[9] = null;
        gameObjGfx[153] = null;
        gameObjGfx[15] = null;
        gameObjGfx[44] = null;
        gameObjGfx[45] = null;
        switch (this.zoneID) {
            case 0:
                gameObjGfx[41] = null;
                gameObjGfx[40] = null;
                gameObjGfx[86] = null;
                gameObjGfx[39] = null;
                gameObjGfx[57] = null;
                gameObjGfx[3] = null;
                gameObjGfx[4] = null;
                gameObjGfx[18] = null;
                gameObjGfx[5] = null;
                gameObjGfx[58] = null;
                gameObjGfx[6] = null;
                imageArr = gameObjGfx;
                c = '%';
                imageArr[c] = null;
                break;
            case 2:
                gameObjGfx[40] = null;
                gameObjGfx[49] = null;
                gameObjGfx[78] = null;
                gameObjGfx[79] = null;
                gameObjGfx[54] = null;
                gameObjGfx[8] = null;
                gameObjGfx[94] = null;
                gameObjGfx[95] = null;
                gameObjGfx[13] = null;
                gameObjGfx[99] = null;
                gameObjGfx[11] = null;
                gameObjGfx[77] = null;
                gameObjGfx[14] = null;
                gameObjGfx[98] = null;
                gameObjGfx[7] = null;
                gameObjGfx[27] = null;
                imageArr = gameObjGfx;
                imageArr[c] = null;
                break;
            case 4:
                gameObjGfx[101] = null;
                gameObjGfx[40] = null;
                gameObjGfx[57] = null;
                gameObjGfx[71] = null;
                gameObjGfx[70] = null;
                gameObjGfx[60] = null;
                gameObjGfx[107] = null;
                gameObjGfx[83] = null;
                gameObjGfx[17] = null;
                gameObjGfx[61] = null;
                gameObjGfx[56] = null;
                imageArr = gameObjGfx;
                c = 16;
                imageArr[c] = null;
                break;
        }
        System.gc();
        this.f124J = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: aF */
    private void m167aF() {
        RunnableC0002c cVar;
        RunnableC0002c cVar2;
        int i = 4;
        this.f126K = this.zoneID;
        this.f129L = 0;
        this.f132M = 0;
        this.f135N = 0;
        this.f137O = 0;
        this.f139P = 0;
        this.f141Q = 0;
        this.f142R = 0;
        this.f144T = 0;
        this.f143S = 0;
        this.f148V = 0;
        this.f146U = 0;
        this.f152Y = 0;
        this.f154Z = 0;
        this.f188aa = 0;
        this.f190ab = 0;
        this.f192ac = 0;
        this.f193ad = 0;
        if (this.zoneID == 3 || this.zoneID == 4) {
            switch (this.f311m[0]) {
                case 1:
                    i = 5;
                    cVar = this;
                    break;
                case 2:
                    i = 6;
                    cVar = this;
                    break;
                default:
                    cVar2 = this;
                    break;
            }
            cVar.f194ae = i;
            if (this.zoneID < 5) {
                this.samplePlayer.playSample(11, -1, false);
                return;
            }
            return;
        }
        switch (this.f311m[0]) {
            case 1:
                i = 6;
                cVar = this;
                break;
            case 2:
                i = 8;
                cVar = this;
                break;
            default:
                cVar2 = this;
                break;
        }
        cVar.f194ae = i;
        if (this.zoneID < 5) {
        }
        cVar = cVar2;
        cVar.f194ae = i;
        if (this.zoneID < 5) {
        }
    }

    /* renamed from: aG */
    private void loadBoss() {
        RunnableC0002c cVar;
        int i = 0;
        try {
            int[] iArr = new int[25];
            m167aF();
            m166aE();
            switch (this.zoneID) {
                case 0:
                    gameObjGfx[120] = loadImage("/boss.png");
                    gameObjGfx[121] = loadImage("/bossball.png");
                    iArr[1] = 120;
                    this.xPos = 10752;
                    this.yPos = 808;
                    break;
                case 2:
                    gameObjGfx[120] = loadImage("/boss.png");
                    gameObjGfx[131] = loadImage("/fire.png");
                    iArr[1] = 130;
                    this.xPos = 6304;
                    this.yPos = 608;
                    this.f143S = (6640 - this.xPos) * 100;
                    i = (544 - this.yPos) * 100;
                    cVar = this;
                    cVar.f144T = i;
                    break;
                case 4:
                    m312a();
                    gameObjGfx[120] = loadImage("/boss.png");
                    iArr[1] = 140;
                    this.f143S = 0;
                    cVar = this;
                    cVar.f144T = i;
                    break;
            }
            gameObjGfx[55] = loadImage("/masin.png");
            iArr[0] = 1;
            int i2 = f100z[0] + 256 + 46;
            iArr[16] = i2;
            iArr[2] = i2;
            int i3 = f100z[1] + 46;
            iArr[17] = i3;
            iArr[3] = i3;
            iArr[4] = 0;
            iArr[14] = 0;
            iArr[20] = this.f273c.length - 1;
            this.f273c[iArr[20]] = true;
            this.f279d[iArr[20]] = false;
            mo66d(iArr);
        } catch (Exception e) {
        }
    }

    /* renamed from: aH */
    private void m169aH() {
        this.f322t = true;
        loadBoss();
    }

    /* renamed from: aI */
    private void m170aI() {
        this.f181aT = 0;
        this.gameMode = 6;
        this.f316q = true;
    }

    /* renamed from: aJ */
    private static void m171aJ() {
        gameObjGfx[158] = null;
        gameObjGfx[157] = null;
        gameObjGfx[154] = null;
        gameObjGfx[155] = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: aK */
    private void m172aK() {
        int i = 0;
        while (true) {
            if (i >= f15C.length) {
                break;
            } else if (f15C[i] < this.score) {
                for (int length = f15C.length - 1; length > i; length--) {
                    f15C[length] = f15C[length - 1];
                    f16D[length] = f16D[length - 1];
                }
            } else {
                i++;
            }
        }
        if (i < f15C.length) {
            f15C[i] = this.score;
            f16D[i] = this.f311m[0];
            f54d[i] = new String(new char[]{f29a[this.f131L[0]], f29a[this.f131L[1]], f29a[this.f131L[2]]});
            m176ae();
        }
        this.gameMode = 1;
        m351d(5);
        m264o(1);
        this.score = 0;
    }

    /* renamed from: ab */
    private void m173ab() {
        this.f311m = m208b("config");
        if (this.f311m == null) {
            this.f133M = true;
            this.f311m = new byte[4];
            this.f311m[0] = 1;
            this.f311m[1] = 1;
            this.f311m[2] = 0;
            m365h();
        }
    }

    /* renamed from: ac */
    private void m174ac() {
        byte[] bArr = new byte[10];
        bArr[0] = this.f291g;
        bArr[1] = this.f294h;
        bArr[2] = this.f298i;
        for (int i = 0; i < 4; i++) {
            bArr[i + 3] = (byte) (this.f266bx >> ((i << 3) & 255));
        }
        bArr[7] = (byte) this.f308l;
        m152a(bArr, "savedGame");
    }

    /* renamed from: ad */
    private void m175ad() {
        try {
            byte[] b = m208b("savedGame");
            this.f291g = b[0];
            this.f294h = b[1];
            this.f298i = b[2];
            int i = 0;
            int i2 = 0;
            while (i < 4) {
                i++;
                i2 = ((b[i + 3] & 255) << (i << 3)) | i2;
            }
            this.f266bx = i2;
            this.f308l = b[7];
            this.f214ay = this.f308l;
        } catch (Exception e) {
            m174ac();
        }
    }

    /* renamed from: ae */
    private void m176ae() {
        byte[] bArr = new byte[55];
        for (int i = 0; i < 5; i++) {
            bArr[(i * 11) + 0] = (byte) f16D[i];
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 2; i3++) {
                    bArr[(i2 * 2) + 1 + i3 + (i * 11)] = (byte) (f54d[i].charAt(i2) >> ((i3 * 8) % 256));
                }
            }
            for (int i4 = 0; i4 < 4; i4++) {
                bArr[i4 + 7 + (i * 11)] = (byte) (f15C[i] >> ((i4 * 8) % 256));
            }
        }
        m152a(bArr, "highscore");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: af */
    private void m177af() {
        try {
            byte[] b = m208b("highscore");
            for (int i = 0; i < 5; i++) {
                f16D[i] = b[(i * 11) + 0];
                char[] cArr = new char[3];
                for (int i2 = 0; i2 < 3; i2++) {
                    char c = 0;
                    for (int i3 = 0; i3 < 2; i3++) {
                        c = (char) (c | (b[(((i2 * 2) + 1) + i3) + (i * 11)] << (i3 * 8)));
                    }
                    cArr[i2] = c;
                }
                f54d[i] = new String(cArr);
                int i4 = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    i4 |= (b[(i5 + 7) + (i * 11)] & 255) << (i5 * 8);
                }
                f15C[i] = i4;
            }
        } catch (Exception e) {
            m176ae();
        }
    }

    /* renamed from: ag */
    private void m178ag() {
        String[] strArr;
        String str;
        String[] strArr2;
        String str2;
        char c;
        String[] strArr3;
        char c2;
        String[] strArr4;
        String[] strArr5;
        char c3;
        if (this.gameMode != 1) {
            if (this.gameMode == 6 || this.gameMode == 4 || this.gameMode == 2 || this.gameMode == 3 || this.gameMode == 9 || this.gameMode == 7) {
                strArr = this.f162a;
                str = "";
            } else {
                if (this.f311m[1] != 0) {
                    strArr = this.f162a;
                    strArr3 = this.f221b;
                    c2 = 'E';
                } else {
                    strArr = this.f162a;
                    strArr3 = this.f221b;
                    c2 = 'D';
                }
                str = strArr3[c2];
            }
            strArr[0] = str;
            if (this.gameMode == 2) {
                if ((this.lives > 0 || !f76j) && !this.f314p) {
                    strArr2 = this.f162a;
                    str2 = this.f221b[60];
                    c = 1;
                } else {
                    strArr2 = this.f162a;
                    str2 = "";
                    c = 1;
                }
            } else if (this.gameMode == 10) {
                strArr2 = this.f162a;
                str2 = this.f221b[61];
                c = 1;
            } else if (this.gameMode == 6) {
                strArr2 = this.f162a;
                str2 = this.f221b[66];
                c = 1;
            } else if (this.gameMode == 3) {
                strArr2 = this.f162a;
                str2 = this.f221b[59];
                c = 1;
            } else if (this.gameMode == 4) {
                strArr2 = this.f162a;
                str2 = "";
                c = 1;
            } else if (this.gameMode == 9) {
                strArr2 = this.f162a;
                str2 = "OK";
                c = 1;
            } else {
                return;
            }
        } else if (this.f156a == 3 || this.f156a == 4) {
            if (this.f311m[1] != 0) {
                strArr4 = this.f162a;
                strArr5 = this.f221b;
                c3 = 'E';
            } else {
                strArr4 = this.f162a;
                strArr5 = this.f221b;
                c3 = 'D';
            }
            strArr4[0] = strArr5[c3];
            if (this.f156a == 4) {
                strArr2 = this.f162a;
                str2 = this.f221b[59];
                c = 1;
            } else {
                strArr2 = this.f162a;
                str2 = this.f221b[57];
                c = 1;
            }
        } else if (this.f156a == 14) {
            this.f162a[1] = this.f221b[59];
            strArr2 = this.f162a;
            str2 = "";
            c = 0;
        } else {
            return;
        }
        strArr2[c] = str2;
    }

    /* renamed from: ah */
    private void m179ah() {
        byte[] bArr;
        byte b;
        int i;
        this.f278d = new byte[(this.lvlChunks.length >> 1)];
        this.f283e = new byte[(this.lvlChunks.length >> 1)];
        this.f287f = new byte[(this.lvlChunks.length >> 1)];
        this.f292g = new byte[(this.lvlChunks.length >> 1)];
        for (int i2 = 0; i2 < (this.lvlChunks.length >> 1); i2++) {
            int i3 = this.lvlChunks[i2 << 1] & 255;
            this.f287f[i2] = 0;
            this.f292g[i2] = 0;
            Math.abs(((byte) (i3 << 6)) >> 6);
            if ((i3 >> 5) <= 1) {
                this.f292g[i2] = 1;
            }
            if ((i3 >> 5) % 2 == 0) {
                this.f287f[i2] = 1;
            }
            this.f283e[i2] = (byte) ((i3 >> 3) & 3);
            this.f278d[i2] = 0;
            if ((i3 & 1) == 1) {
                bArr = this.f278d;
                b = 1;
                i = i2;
            } else if ((i3 & 3) == 2) {
                bArr = this.f278d;
                b = 2;
                i = i2;
            }
            bArr[i] = b;
        }
    }

    /* renamed from: ai */
    private void m180ai() {
        m183al();
        m193av();
    }

    /* renamed from: aj */
    private void m181aj() {
        this.rings = 0;
        this.f330x = 0;
        this.f332y = 0;
        this.f334z = 0;
        this.f321t = 0;
        this.spdshoesTimer = 0;
        this.invincibilityTimer = 0;
        this.f317r = 0;
        this.f250bh = 0;
        this.f249bg = 0;
        for (int i = 0; i < this.f307k.length; i++) {
            this.f307k[i][0] = 0;
        }
        f46c = false;
        f52d = false;
        f19S = false;
        f17Q = false;
        f58e = false;
        f63f = false;
        f67g = false;
        f74i = false;
        f76j = false;
        f20W = false;
        f21X = false;
        f78k = false;
        f18R = false;
        f80l = false;
        f83m = false;
        f87o = false;
        f85n = false;
        this.f212aw = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f284e[i2] = false;
            this.f222b[i2] = false;
        }
        this.f195af = 0;
        this.f111F = 0;
        for (int i3 = 0; i3 < this.f285e.length; i3++) {
            this.f285e[i3][24] = 0;
        }
    }

    /* renamed from: ak */
    private void m182ak() {
        m357e();
        m181aj();
        if (this.zoneID == 4 && this.actID == 2) {
            m212c(150, 11424, 1394, 0, 0);
        }
        for (int i = 0; i < f47c.length; i++) {
            f47c[i] = 0;
        }
        sonicAngle = 0;
        this.f113F[0] = 0;
        this.f113F[1] = 0;
        f98y[0] = 0;
        f98y[1] = 0;
        if (!(this.zoneID == 5 && this.actID == 3)) {
            f47c[0] = f43b[this.zoneID][(this.actID * 2) + 0] << 8;
            f47c[1] = (f43b[this.zoneID][(this.actID * 2) + 1] << 8) + 5120;
        }
        if (!(this.f102B == 0 && this.f104C == 0)) {
            f47c[0] = this.f102B << 8;
            f47c[1] = this.f104C << 8;
            this.f330x = this.f106D;
            this.f332y = this.f108E;
        }
        m377t();
        mo11G();
        f47c[8] = -1;
        this.gameMode = 2;
        this.f316q = true;
        mo100z();
        this.f326v = true;
        this.f204ao = 10;
    }

    /* renamed from: al */
    private void m183al() {
        zoneTiles = null;
        PlaneDisplayer.m1a();
        m153a(gameObjGfx);
        this.f322t = false;
        this.f155Z = true;
        this.f189aa = true;
        if (this.zoneID != 1) {
            this.f197ah = 16777215;
        }
        f98y[0] = 0;
        f98y[1] = 0;
        loadLevelData();
        m179ah();
        mo15K();
        PlaneDisplayer.m2a(this.zoneID, this.actID);
        loadGameObjGfx();
        m363g();
    }

    /* renamed from: am */
    private void loadLevelData() {
        String str;
        int[][][] a;
        try {
            this.lvlColMaps = null;
            this.f299i = null;
            this.lvlChunks = null;
            this.objPosArr = null;
            this.angleTable = null;
            this.collisionArr = null;
            this.tileCollisionTable = null;
            System.gc();
            int[][][] iArr = null;
            switch (this.zoneID) {
                case 0:
                    str = "/mc_gh_map_data.bin";
                    a = loadDataInto3DArray(loadFileIntoDataInputStream(str));
                    break;
                case 1:
                case 3:
                default:
                    a = iArr;
                    break;
                case 2:
                    str = "/mc_ma_map_data.bin";
                    a = loadDataInto3DArray(loadFileIntoDataInputStream(str));
                    break;
                case 4:
                    str = "/mc_sy_map_data.bin";
                    a = loadDataInto3DArray(loadFileIntoDataInputStream(str));
                    break;
            }
            tryCloseInputStream();
            this.tilesetMapsWidth = a[this.actID][0].length;
            this.tilesetMapsHeight = a[this.actID].length;
            this.tilesetMaps = (byte[][]) Array.newInstance(Byte.TYPE, this.tilesetMapsHeight, this.tilesetMapsWidth);
            for (int i = 0; i < this.tilesetMapsHeight; i++) {
                for (int i2 = 0; i2 < this.tilesetMapsWidth; i2++) {
                    this.tilesetMaps[i][i2] = (byte) a[this.actID][i][i2];
                }
            }
            System.gc();
            this.lvlColMaps = loadFile(new StringBuffer().append("/zone").append(this.zoneID + 1).append(".blt").toString());
            this.f299i = loadFile(new StringBuffer().append("/MapLzone").append(this.zoneID + 1).append(".blt").toString());
            this.lvlChunks = loadFile(new StringBuffer().append("/zone").append(this.zoneID + 1).append(".bmd").toString());
            DataInputStream a2 = loadFileIntoDataInputStream(new StringBuffer().append("/ZONE").append(this.zoneID + 1).append("ACT.act").toString());
            this.objPosArr = new byte[4][];
            this.objPosArr[0] = new byte[a2.readShort()];
            this.objPosArr[1] = new byte[a2.readShort()];
            this.objPosArr[2] = new byte[a2.readShort()];
            this.objPosArr[3] = new byte[a2.readShort()];
            a2.read(this.objPosArr[0]);
            a2.read(this.objPosArr[1]);
            a2.read(this.objPosArr[2]);
            a2.read(this.objPosArr[3]);
            a2.close();
            tryCloseInputStream();
            if (this.objSizeTable == null) {
                this.objSizeTable = loadDataInto2DArray(loadFileIntoDataInputStream("/mc_obj_size_table.bin"));
                tryCloseInputStream();
            }
            if (framedata == null) {
                framedata = loadDataInto3DArray(loadFileIntoDataInputStream("/framedata.bin"));
                tryCloseInputStream();
            }
            this.angleTable = new byte[512];
            loadFileIntoInputStream("/scddirtbl.blt").read(this.angleTable);
            tryCloseInputStream();
            this.collisionArr = new byte[8192];
            loadFileIntoDataInputStream("/scdtblwk.scd").read(this.collisionArr);
            tryCloseInputStream();
            this.tileCollisionTable = new byte[8192];
            loadFileIntoDataInputStream("/blkcol.bct").read(this.tileCollisionTable);
            tryCloseInputStream();
            System.gc();
        } catch (Exception e) {
        }
    }

    /* renamed from: an */
    private void m185an() {
        if (this.zoneID != 1 || this.f197ah >= mo48b() - 12) {
            this.f248bf = 2100;
        }
    }

    /* renamed from: ao */
    private void m186ao() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        if (this.f211av > 0) {
            this.f211av--;
        } else {
            if (this.f163a[3]) {
                f47c[12] = 1;
                if (f47c[3] == 0) {
                    iArr = f47c;
                    i3 = iArr[3] - (this.sonicMaxDec << 1);
                } else {
                    int[] iArr4 = f47c;
                    iArr4[3] = iArr4[3] - this.sonicMaxAcc;
                    if (f47c[3] > 0) {
                        iArr = f47c;
                        i3 = iArr[3] - this.sonicMaxAcc;
                    }
                }
            } else if (this.f163a[4]) {
                f47c[12] = 0;
                if (f47c[3] == 0) {
                    iArr = f47c;
                    i = iArr[3];
                    i2 = this.sonicMaxDec << 1;
                } else {
                    int[] iArr5 = f47c;
                    iArr5[3] = iArr5[3] + this.sonicMaxAcc;
                    if (f47c[3] < 0) {
                        iArr = f47c;
                        i = iArr[3];
                        i2 = this.sonicMaxAcc;
                    }
                }
                i3 = i2 + i;
            }
            iArr[3] = i3;
        }
        if (Math.abs(f47c[3]) > this.sonicMaxSpd) {
            if (f47c[3] < 0) {
                iArr3 = f47c;
                i5 = -this.sonicMaxSpd;
            } else {
                iArr3 = f47c;
                i5 = this.sonicMaxSpd;
            }
            iArr3[3] = i5;
        }
        int[] iArr6 = this.f113F;
        iArr6[0] = iArr6[0] + f47c[3];
        int[] iArr7 = this.f113F;
        iArr7[1] = iArr7[1] + f47c[5];
        if (f47c[5] > 0 && this.f233bJ <= 0) {
            if (sonicAngle == 270) {
                iArr2 = f47c;
                i4 = iArr2[0] - 3072;
            } else {
                if (sonicAngle == 90) {
                    iArr2 = f47c;
                    i4 = iArr2[0] + 3072;
                }
                sonicAngle = 0;
            }
            iArr2[0] = i4;
            sonicAngle = 0;
        }
        m251k(1);
        if (this.zoneID == 0 || this.zoneID == 3) {
            m194aw();
        }
        if (f67g && this.f256bn <= 0) {
            if (m233f()) {
                f47c[10] = 0;
                f47c[13] = 0;
                f47c[14] = 0;
                f47c[3] = 0;
            }
            if (mo74g()) {
                f47c[10] = 0;
                f47c[13] = 0;
                f47c[14] = 0;
                f47c[3] = 0;
            }
        }
        m188aq();
    }

    /* renamed from: ap */
    private void m187ap() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        if (this.f211av > 0) {
            this.f211av--;
        } else if (!this.f105C) {
            if (this.f163a[3]) {
                f47c[12] = 1;
                if (f47c[3] == 0) {
                    iArr = f47c;
                    i3 = iArr[3] - (this.sonicMaxDec << 1);
                } else {
                    int[] iArr4 = f47c;
                    iArr4[3] = iArr4[3] - this.sonicMaxAcc;
                    if (f47c[3] > 0) {
                        iArr = f47c;
                        i3 = iArr[3] - this.sonicMaxAcc;
                    }
                }
            } else if (this.f163a[4]) {
                f47c[12] = 0;
                if (f47c[3] == 0) {
                    iArr = f47c;
                    i = iArr[3];
                    i2 = this.sonicMaxDec << 1;
                } else {
                    int[] iArr5 = f47c;
                    iArr5[3] = iArr5[3] + this.sonicMaxAcc;
                    if (f47c[3] < 0) {
                        iArr = f47c;
                        i = iArr[3];
                        i2 = this.sonicMaxAcc;
                    }
                }
                i3 = i2 + i;
            }
            iArr[3] = i3;
        }
        if (Math.abs(f47c[3]) > 4096) {
            if (f47c[3] < 0) {
                iArr3 = f47c;
                i5 = -4096;
            } else {
                iArr3 = f47c;
                i5 = 4096;
            }
            iArr3[3] = i5;
        }
        int[] iArr6 = this.f113F;
        iArr6[0] = iArr6[0] + f47c[3];
        int[] iArr7 = this.f113F;
        iArr7[1] = iArr7[1] + f47c[5];
        if (f47c[5] > 0 && this.f233bJ <= 0) {
            if (sonicAngle == 270) {
                iArr2 = f47c;
                i4 = iArr2[0] - 3072;
            } else {
                if (sonicAngle == 90) {
                    iArr2 = f47c;
                    i4 = iArr2[0] + 3072;
                }
                sonicAngle = 0;
            }
            iArr2[0] = i4;
            sonicAngle = 0;
        }
        m251k(1);
        if (this.zoneID == 0 || this.zoneID == 3) {
            m194aw();
        }
        this.f256bn--;
        if (f67g && this.f256bn <= 0) {
            if (m233f()) {
                f47c[10] = 0;
                f47c[13] = 0;
                f47c[14] = 0;
                f47c[3] = 0;
            }
            if (mo74g()) {
                f47c[10] = 0;
                f47c[13] = 0;
                f47c[14] = 0;
                f47c[3] = 0;
            }
        }
        m188aq();
    }

    /* renamed from: aq */
    private void m188aq() {
        int i = 0;
        if (this.f233bJ > 0) {
            this.f233bJ--;
            return;
        }
        if ((-this.underwaterJmpSpeed) <= f47c[5]) {
            this.f163a[2] = false;
        } else if (!this.f163a[2] && !f46c && !f71h) {
            f47c[5] = -this.underwaterJmpSpeed;
        }
        if (f47c[5] > 0) {
            f46c = false;
            if (!mo88p()) {
                return;
            }
            if (sonicAngle < 270 && sonicAngle > 90) {
                sonicAngle = 0;
                return;
            }
        } else if (mo84l()) {
            i = 1;
        } else {
            return;
        }
        mo67e(i);
    }

    /* renamed from: ar */
    private void m189ar() {
        RunnableC0002c cVar;
        int i;
        if (this.f105C) {
            f47c[12] = 0;
            if (f47c[13] == 0) {
                f47c[13] = 2;
                f47c[14] = 2;
            }
            cVar = this;
        } else {
            if (!f17Q) {
                if (this.zoneID == 5 && this.actID != 2 && (37 == f47c[8] || 38 == f47c[8] || 39 == f47c[8] || 41 == f47c[8] || 42 == f47c[8] || 47 == f47c[8] || 48 == f47c[8] || 49 == f47c[8] || 52 == f47c[8] || 59 == f47c[8] || 62 == f47c[8] || 69 == f47c[8] || 71 == f47c[8] || 72 == f47c[8] || 78 == f47c[8] || 79 == f47c[8] || 87 == f47c[8] || 88 == f47c[8] || 89 == f47c[8])) {
                    int[] iArr = f47c;
                    iArr[10] = iArr[10] + 256;
                    if (1024 < f47c[10]) {
                        f47c[10] = 1024;
                    }
                    f47c[12] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                } else if (this.f211av > 0) {
                    this.f211av--;
                } else if (this.f163a[3]) {
                    f47c[12] = 1;
                    if (f47c[13] == 0) {
                        f47c[13] = 1;
                    }
                    if (f47c[14] == 0) {
                        f47c[14] = 1;
                    }
                    i = 0;
                    cVar = this;
                    cVar.m230f(i);
                } else if (this.f163a[4]) {
                    f47c[12] = 0;
                    if (f47c[13] == 0) {
                        f47c[13] = 2;
                    }
                    if (f47c[14] == 0) {
                        f47c[14] = 2;
                    }
                    cVar = this;
                }
            }
            int[] iArr2 = this.f113F;
            iArr2[0] = iArr2[0] + ((mo34a(sonicAngle + 90) * f47c[10]) / 100);
            int[] iArr3 = this.f113F;
            iArr3[1] = iArr3[1] + ((mo49b(sonicAngle + 90) * f47c[10]) / 100);
        }
        i = 1;
        cVar.m230f(i);
        int[] iArr22 = this.f113F;
        iArr22[0] = iArr22[0] + ((mo34a(sonicAngle + 90) * f47c[10]) / 100);
        int[] iArr32 = this.f113F;
        iArr32[1] = iArr32[1] + ((mo49b(sonicAngle + 90) * f47c[10]) / 100);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0199, code lost:
        if (p000.RunnableC0002c.f47c[10] >= 0) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ba, code lost:
        if (p000.RunnableC0002c.f47c[10] <= 0) goto L_0x019b;
     */
    /* renamed from: as */
    private void m190as() {
        int i;
        RunnableC0002c cVar;
        if (this.f105C) {
            f47c[12] = 0;
            if (f47c[13] == 0) {
                f47c[13] = 2;
                f47c[14] = 2;
            }
            m230f(1);
        } else if (this.zoneID == 5 && this.actID != 2 && (37 == f47c[8] || 38 == f47c[8] || 39 == f47c[8] || 41 == f47c[8] || 42 == f47c[8] || 47 == f47c[8] || 48 == f47c[8] || 49 == f47c[8] || 52 == f47c[8] || 59 == f47c[8] || 62 == f47c[8] || 69 == f47c[8] || 71 == f47c[8] || 72 == f47c[8] || 78 == f47c[8] || 79 == f47c[8] || 87 == f47c[8] || 88 == f47c[8] || 89 == f47c[8])) {
            int[] iArr = f47c;
            iArr[10] = iArr[10] + 256;
            if (2560 < f47c[10]) {
                f47c[10] = 2560;
            }
        } else if (this.f211av > 0) {
            this.f211av--;
        } else {
            if (this.f163a[3]) {
                if (f47c[13] == 0) {
                    f47c[13] = 1;
                }
                if (f47c[14] == 0) {
                    f47c[14] = 1;
                }
                f47c[12] = 1;
                i = 0;
                cVar = this;
            } else if (this.f163a[4]) {
                if (f47c[13] == 0) {
                    f47c[13] = 2;
                }
                if (f47c[14] == 0) {
                    f47c[14] = 2;
                }
                f47c[12] = 0;
                i = 1;
                cVar = this;
            }
            cVar.m235g(i);
        }
        int[] iArr2 = this.f113F;
        iArr2[0] = iArr2[0] + ((mo34a(sonicAngle + 90) * f47c[10]) / 100);
        int[] iArr3 = this.f113F;
        iArr3[1] = iArr3[1] + ((mo49b(sonicAngle + 90) * f47c[10]) / 100);
        if (!(f47c[10] == 0 || f47c[10] == 0)) {
            if (f47c[10] < 0) {
                int[] iArr4 = f47c;
                iArr4[10] = iArr4[10] + this.sonicMaxAcc;
            } else {
                int[] iArr5 = f47c;
                iArr5[10] = iArr5[10] - this.sonicMaxAcc;
            }
            f47c[10] = 0;
            f47c[13] = 0;
            f47c[14] = 0;
            f74i = false;
        }
        if (f47c[10] == 0) {
            f74i = false;
            this.f212aw = 0;
        }
    }

    /* renamed from: at */
    private void m191at() {
        int i = f66g >> 1;
        int a = mo33a();
        if (f98y[0] >= this.f128K[1] - f66g && !this.f322t && this.f265bw == 0 && this.actID == 2) {
            m169aH();
        }
        if (a - f98y[0] < i) {
            if (!this.f314p) {
                this.f189aa = true;
                int[] iArr = f98y;
                iArr[0] = iArr[0] - (i - (a - f98y[0]));
                if (f98y[0] < this.f128K[0]) {
                    f98y[0] = this.f128K[0];
                }
                if (((f98y[0] + 16) << 8) > f47c[0]) {
                    f47c[0] = (f98y[0] + 16) << 8;
                    if (f47c[10] < 0) {
                        f47c[10] = 0;
                        f47c[13] = 0;
                        f47c[14] = 0;
                    }
                    if (!f67g && f74i) {
                        f74i = false;
                    }
                    if (f67g && f47c[3] < 0) {
                        f47c[3] = 0;
                        return;
                    }
                    return;
                }
                return;
            } else if (((f98y[0] + 16) << 8) > f47c[0]) {
                f47c[0] = (f98y[0] + 16) << 8;
                if (f47c[10] < 0) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                }
                if (f67g || !f74i) {
                    return;
                }
            } else {
                return;
            }
        } else if (a - f98y[0] > i) {
            this.f155Z = true;
            int[] iArr2 = f98y;
            iArr2[0] = iArr2[0] - (i - (a - f98y[0]));
            if (f98y[0] + (i << 1) > this.f128K[1]) {
                f98y[0] = this.f128K[1] - (i << 1);
            }
            if (this.f105C) {
                if ((((f98y[0] + 96) + 240) << 8) < f47c[0]) {
                    f47c[0] = ((f98y[0] + 96) + 240) << 8;
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                    if (f67g || !f74i) {
                        return;
                    }
                } else {
                    return;
                }
            } else if ((((f98y[0] - 16) + 240) << 8) < f47c[0]) {
                f47c[0] = ((f98y[0] - 16) + 240) << 8;
                f47c[10] = 0;
                f47c[13] = 0;
                f47c[14] = 0;
                if (f67g || !f74i) {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        f74i = false;
    }

    /* renamed from: au */
    private void m192au() {
        if (f76j) {
            f47c[3] = 0;
            this.f334z--;
            if ((((f98y[1] - 16) + 240) << 8) < f47c[1] && this.f149V) {
                this.f149V = false;
                if (!this.f115G || !this.f290f[0]) {
                    this.lives--;
                }
                if (this.lives <= 0) {
                    this.samplePlayer.playSample(14, 1, false);
                    this.f334z = 240;
                    this.f326v = true;
                    this.f204ao = 10;
                } else if (this.f330x == 59 && this.f332y == 9) {
                    this.f334z = 240;
                    f21X = true;
                    this.f326v = true;
                    this.f204ao = 10;
                    this.f106D = 0;
                    this.f108E = 0;
                    this.f153Y = true;
                }
            }
            if (this.f334z >= 0) {
                return;
            }
            if (this.lives <= 0) {
                if (!AudioModule.mo101a()) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    m170aI();
                }
                this.f326v = true;
                this.f204ao = 10;
                return;
            }
            m374p();
        }
    }

    /* renamed from: av */
    private void m193av() {
        if (this.actID > 3) {
            this.actID = 3;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.objPosArr[this.actID].length / 7; i2++) {
            byte b = this.objPosArr[this.actID][(i2 * 7) + 5];
            i = (b == 0 || 1 == b || 63 == b || 64 == b || 65 == b || 66 == b || 67 == b || 68 == b || 69 == b) ? i + 1 + this.objPosArr[this.actID][(i2 * 7) + 6] : i + 1;
        }
        this.f125J = new int[i];
        this.f273c = new boolean[(i + 20)];
        this.f279d = new boolean[(i + 20)];
        int i3 = 0;
        for (int i4 = 0; i4 < this.objPosArr[this.actID].length / 7; i4++) {
            this.f125J[i4] = i3;
            byte b2 = this.objPosArr[this.actID][(i4 * 7) + 5];
            if (b2 == 0 || 1 == b2 || 63 == b2 || 64 == b2 || 65 == b2 || 66 == b2 || 67 == b2 || 68 == b2 || 69 == b2) {
                int i5 = i3;
                for (int i6 = 0; i6 < this.objPosArr[this.actID][(i4 * 7) + 6] + 1; i6++) {
                    i5++;
                }
                i3 = i5;
            } else {
                i3++;
            }
        }
    }

    /* renamed from: aw */
    private void m194aw() {
        byte[] bArr;
        int i;
        boolean z = false;
        int i2 = this.f258bp;
        this.f258bp = i2 - 1;
        if (i2 <= 0 && mo48b() >= 0) {
            int a = mo33a() >> 8;
            int b = mo48b() >> 8;
            byte b2 = this.tilesetMaps[b % this.tilesetMapsHeight][a];
            if ((f40b[0] >> 8) < a && this.zoneID == 0 && (b2 == 53 || b2 == 54)) {
                this.tilesetMaps[b % this.tilesetMapsHeight][a] = 53;
            }
            if ((f40b[0] >> 8) > a && this.zoneID == 0 && (b2 == 53 || b2 == 54)) {
                this.tilesetMaps[b % this.tilesetMapsHeight][a] = 54;
            }
            int i3 = this.tilesetMaps[b % this.tilesetMapsHeight][a] & 1;
            if (this.zoneID == 0 && (b2 == 53 || b2 == 54)) {
                z = true;
            }
            if (z && m221d(mo33a(), mo48b())) {
                if (i3 % 2 == 1 && (mo33a() >> 4) % 16 < 9 && (mo48b() >> 4) % 16 < 3) {
                    bArr = this.tilesetMaps[b % this.tilesetMapsHeight];
                    i = bArr[a] + 1;
                } else if (i3 % 2 == 0 && (mo33a() >> 4) % 16 >= 7 && (mo48b() >> 4) % 16 < 3) {
                    bArr = this.tilesetMaps[b % this.tilesetMapsHeight];
                    i = bArr[a] - 1;
                } else {
                    return;
                }
                bArr[a] = (byte) i;
                this.f258bp = 60;
            }
        }
    }

    /* renamed from: ax */
    private void m195ax() {
        int i;
        int[][] iArr;
        char c;
        int i2;
        int i3;
        Image image;
        Graphics graphics;
        Graphics graphics2;
        Image image2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        drawSprite(screenBuffer, menuObjGfx[0], f82l[0][0], f82l[0][1], f82l[0][2], f82l[0][3], rotationQuadrants[0], f51d >> 1, (f57e >> 1) + 0, 3, false);
        int i10 = (10 - this.f239bP) * 3;
        switch (this.f276d >> 1) {
            case 0:
                graphics2 = screenBuffer;
                image2 = menuObjGfx[0];
                i4 = f82l[1][0];
                i = f82l[1][1];
                i2 = f82l[1][2];
                i5 = f82l[1][3];
                i6 = rotationQuadrants[0];
                i7 = (f51d >> 1) + 5;
                i8 = i10 + (f57e >> 1) + 0;
                i9 = 33;
                break;
            case 1:
                drawSprite(screenBuffer, menuObjGfx[0], f82l[2][0], f82l[2][1], f82l[2][2], f82l[2][3], rotationQuadrants[0], (f51d >> 1) + 5, (f57e >> 1) + 0, 33, false);
                graphics2 = screenBuffer;
                image2 = menuObjGfx[0];
                i4 = f82l[3][0];
                i = f82l[3][1];
                i2 = f82l[3][2];
                i5 = f82l[3][3];
                i6 = rotationQuadrants[0];
                i7 = (f51d >> 1) + 5;
                i8 = (f57e >> 1) + 0;
                i9 = 33;
                break;
            case 2:
                graphics2 = screenBuffer;
                image2 = menuObjGfx[0];
                i4 = f82l[4][0];
                i = f82l[4][1];
                i2 = f82l[4][2];
                i5 = f82l[4][3];
                i6 = rotationQuadrants[0];
                i7 = (f51d >> 1) + 5;
                i8 = (f57e >> 1) + 0;
                i9 = 33;
                break;
            case 3:
                graphics2 = screenBuffer;
                image2 = menuObjGfx[0];
                i4 = f82l[5][0];
                i = f82l[5][1];
                i2 = f82l[5][2];
                i5 = f82l[5][3];
                i6 = rotationQuadrants[0];
                i7 = (f51d >> 1) + 5;
                i8 = (f57e >> 1) + 0;
                i9 = 33;
                break;
            case 4:
                drawSprite(screenBuffer, menuObjGfx[0], f82l[6][0], f82l[6][1], f82l[6][2], f82l[6][3], rotationQuadrants[0], (f51d >> 1) + 5, (f57e >> 1) + 0, 40, false);
                Graphics graphics3 = screenBuffer;
                Image image3 = menuObjGfx[0];
                int i11 = f82l[7][0];
                i = f82l[7][1];
                int i12 = f82l[7][2];
                iArr = f82l;
                c = 7;
                i2 = i12;
                i3 = i11;
                image = image3;
                graphics = graphics3;
                i5 = iArr[c][3];
                i6 = rotationQuadrants[0];
                i7 = (f51d >> 1) + 5;
                i8 = (f57e >> 1) + 0;
                i9 = 36;
                i4 = i3;
                image2 = image;
                graphics2 = graphics;
                break;
            default:
                drawSprite(screenBuffer, menuObjGfx[0], f82l[8][0], f82l[8][1], f82l[8][2], f82l[8][3], rotationQuadrants[0], (f51d >> 1) + 5, (f57e >> 1) + 0, 40, false);
                drawSprite(screenBuffer, menuObjGfx[0], f82l[9][0], f82l[9][1], f82l[9][2], f82l[9][3], rotationQuadrants[0], ((f51d >> 1) + 5) - 30, ((f57e >> 1) + 0) - 22, 36, false);
                if (((this.f239bP >> 1) & 1) == 0) {
                    Graphics graphics4 = screenBuffer;
                    Image image4 = menuObjGfx[0];
                    int i13 = f82l[10][0];
                    i = f82l[10][1];
                    int i14 = f82l[10][2];
                    iArr = f82l;
                    c = '\n';
                    i2 = i14;
                    i3 = i13;
                    image = image4;
                    graphics = graphics4;
                } else {
                    Graphics graphics5 = screenBuffer;
                    Image image5 = menuObjGfx[0];
                    int i15 = f82l[11][0];
                    i = f82l[11][1];
                    int i16 = f82l[11][2];
                    iArr = f82l;
                    c = 11;
                    i2 = i16;
                    i3 = i15;
                    image = image5;
                    graphics = graphics5;
                }
                i5 = iArr[c][3];
                i6 = rotationQuadrants[0];
                i7 = (f51d >> 1) + 5;
                i8 = (f57e >> 1) + 0;
                i9 = 36;
                i4 = i3;
                image2 = image;
                graphics2 = graphics;
                break;
        }
        drawSprite(graphics2, image2, i4, i, i2, i5, i6, i7, i8, i9, false);
        drawSprite(screenBuffer, menuObjGfx[0], f82l[12][0], f82l[12][1], f82l[12][2], f82l[12][3], rotationQuadrants[0], f51d >> 1, ((f57e >> 1) - 1) + 0, 17, false);
    }

    /* renamed from: ay */
    private void m196ay() {
        this.f244bb = (this.f244bb + 1) % (f25a.stringWidth(this.f158a) + 218);
    }

    /* renamed from: az */
    private void m197az() {
        m148a(this.f158a, f51d - this.f244bb, f73i + f70h + 2, 16777215, 0, 20);
    }

    /* renamed from: b */
    public static int mo48b() {
        return f47c[1] >> 8;
    }

    /* renamed from: b */
    public static int mo49b(int i) {
        int i2 = i % 360;
        if (i2 >= 0 && i2 < 90) {
            return (f13A[89 - i2] * -1) / 100;
        }
        if (i2 >= 90 && i2 < 180) {
            return f13A[i2 - 90] / 100;
        }
        if (i2 >= 180 && i2 < 270) {
            return f13A[89 - (i2 - 180)] / 100;
        }
        if (i2 < 270 || i2 > 359) {
            return 0;
        }
        return (f13A[i2 - 270] / 100) * -1;
    }

    /* renamed from: b */
    public static int mo52b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (f76j || f80l) {
            return -1;
        }
        int i7 = (540 - sonicAngle) % 360;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = 12;
        if (!f74i && !f78k) {
            i8 = 18;
        }
        int a = (mo34a(i7) * i8) / 100;
        int i9 = ((-mo49b(i7)) * i8) / 100;
        int a2 = mo33a() + a;
        int b = mo48b() + i9;
        int i10 = a + f40b[0];
        int i11 = i9 + f40b[1];
        if (i11 + i8 <= i4 - i6 && b + i8 >= i2 - i6 && a2 + 12 >= i - i5 && a2 - 12 <= i + i5) {
            return 0;
        }
        if (i10 + 12 <= i3 - i5 && a2 + 12 >= i - i5 && b + i8 >= i2 - i6 && b - i8 <= i2 + i6) {
            return 1;
        }
        if (i10 - 12 >= i3 + i5 && a2 - 12 <= i + i5 && b + i8 >= i2 - i6 && b - i8 <= i2 + i6) {
            return 2;
        }
        if (i11 - i8 < i4 + i6 || b - i8 > i2 + i6 || a2 + 12 < i - i5 || a2 - 12 > i + i5) {
            return (a2 + 12 < i - i5 || a2 + -12 > i + i5 || b + i8 < i2 - i6 || b - i8 > i2 + i6) ? -1 : 4;
        }
        return 3;
    }

    /* renamed from: b */
    private static int m201b(String str, int i) {
        return f39b.substringWidth(str, 0, i);
    }

    /* renamed from: b */
    public static void m202b(int i, int i2, int i3, int i4) {
        if ((screenHeight & 1) == 1 && i2 != 0) {
            i4++;
        }
        screenBuffer.setClip(i, i2, i3, i4);
        int color = screenBuffer.getColor();
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i5 + i2;
            screenBuffer.setColor(i6 == 0 ? 8506866 : i6 % 3 == 0 ? 1858252 : 2257915);
            screenBuffer.drawLine(i, i6, i + i3, i6);
        }
        if (i == 0) {
            screenBuffer.setColor(2257915);
            screenBuffer.drawRect(i, i2, 1, i4);
        }
        screenBuffer.setColor(color);
        screenBuffer.setClip(0, 0, screenWidth, screenHeight);
    }

    /* renamed from: b */
    public static void m203b(int i, int i2, int i3, int i4, int i5) {
        m145a(i, i2, i3, i4, i5, 3);
    }

    /* renamed from: b */
    public static void m204b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        drawSprite(screenBuffer, gameObjGfx[i], i2, i3, i4, i5, i6, mo63d(i7 - f100z[0]), mo63d(i8 - f100z[1]), 3, true);
    }

    /* renamed from: b */
    public static void m205b(int[] iArr) {
        iArr[19] = iArr[19] == 0 ? 1 : 0;
    }

    /* renamed from: b */
    private boolean m206b(int i) {
        if (!m221d(mo33a(), mo48b())) {
            return false;
        }
        int i2 = sonicAngle;
        if (i == -1) {
            return false;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= 16) {
                break;
            }
            if (!f67g) {
                int[] iArr = f47c;
                iArr[0] = iArr[0] - ((mo34a(i2 + 180) << 8) / 100);
            }
            int[] iArr2 = f47c;
            iArr2[1] = iArr2[1] - ((mo49b(i2 + 180) * 256) / 100);
            if (!m221d(mo33a(), mo48b())) {
                if (!f67g) {
                    int[] iArr3 = f47c;
                    iArr3[0] = iArr3[0] + ((mo34a(i2 + 180) << 8) / 100);
                }
                int[] iArr4 = f47c;
                iArr4[1] = ((mo49b(i2 + 180) << 8) / 100) + iArr4[1];
                sonicAngle = mo45a(mo33a(), mo48b());
            } else {
                i3++;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m207b(int[] iArr) {
        if (iArr[14] == 0) {
            iArr[5] = 0;
            iArr[6] = 0;
            iArr[7] = 0;
            iArr[10] = 0;
            iArr[11] = 0;
            iArr[12] = iArr[2] * 100;
            iArr[13] = iArr[3] * 100;
            iArr[15] = -1;
            iArr[16] = iArr[2];
            iArr[17] = iArr[3];
            iArr[14] = iArr[14] + 1;
        }
        if (iArr[5] > 0) {
            iArr[5] = iArr[5] - 1;
        }
        iArr[6] = iArr[6] + 1;
        if (iArr[7] > 0) {
            iArr[7] = iArr[7] - 1;
        }
        return false;
    }

    /* renamed from: b */
    private static byte[] m208b(String str) {
        RecordStore recordStore;
        try {
            RecordStore openRecordStore = RecordStore.openRecordStore(new StringBuffer().append(str).append("6390").toString(), false);
            try {
                byte[] bArr = new byte[openRecordStore.getRecordSize(1)];
                openRecordStore.getRecord(1, bArr, 0);
                openRecordStore.closeRecordStore();
                return bArr;
            } catch (Throwable th) {
                recordStore = openRecordStore;
            }
        } catch (Throwable th2) {
            recordStore = null;
            try {
                recordStore.closeRecordStore();
            } catch (Throwable th3) {
            }
            return null;
        }
    }

    /* renamed from: c */
    private int mo55c() {
        int i = (this.tilesetMapsHeight * 256) - 232;
        switch (this.zoneID) {
            case 0:
                return mo62d();
            case 1:
            case 3:
            default:
                return i;
            case 2:
                return mo68e();
            case 4:
                return mo72f();
        }
    }

    /* renamed from: c */
    public static int getRandomInt(int i) {
        return Math.abs(randomiser.nextInt()) % i;
    }

    /* renamed from: c */
    public static int m211c(int i, int i2, int i3, int i4, int i5, int i6) {
        if (f76j || f80l) {
            return -1;
        }
        int i7 = 12;
        if (!f74i) {
            i7 = 16;
        }
        int i8 = -i7;
        int a = mo33a() + 0;
        int b = mo48b() + i8;
        int i9 = f40b[0] + 0;
        int i10 = i8 + f40b[1];
        if (i10 + i7 <= i4 - i6 && b + i7 >= i2 - i6 && a + 12 >= i - i5 && a - 12 <= i + i5) {
            return 0;
        }
        if (i9 + 12 <= i3 - i5 && a + 12 >= i - i5 && b + i7 >= i2 - i6 && b - i7 <= i2 + i6) {
            return 1;
        }
        if (i9 - 12 >= i3 + i5 && a - 12 <= i + i5 && b + i7 >= i2 - i6 && b - i7 <= i2 + i6) {
            return 2;
        }
        if (i10 - i7 < i4 + i6 || b - i7 > i2 + i6 || a + 12 < i - i5 || a - 12 > i + i5) {
            return (a + 12 < i - i5 || a + -12 > i + i5 || b + i7 < i2 - i6 || b - i7 > i2 + i6) ? -1 : 4;
        }
        return 3;
    }

    /* renamed from: c */
    private void m212c(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = new int[25];
        if (i >= 1) {
            iArr[0] = 1;
            iArr[1] = i;
            iArr[2] = i2;
            iArr[3] = i3;
            iArr[4] = i4;
            iArr[19] = i5;
            iArr[21] = 1;
            mo66d(iArr);
        }
    }

    /* renamed from: c */
    public static void m213c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        drawSprite(screenBuffer, gameObjGfx[i], i2, i3, i4, i5, i6, mo63d(i7 - f100z[0]), mo63d(i8 - f100z[1]), 20, true);
    }

    /* renamed from: c */
    private boolean m214c(int i) {
        int a;
        char c;
        int[] iArr;
        if (i != 0) {
            return false;
        }
        if (f67g) {
            return true;
        }
        if (this.f105C) {
            return false;
        }
        if (this.zoneID == 0 && (this.tilesetMaps[(mo48b() >> 8) % this.tilesetMapsHeight][mo33a() >> 8] == 31 || this.tilesetMaps[(mo48b() >> 8) % this.tilesetMapsHeight][mo33a() >> 8] == 32)) {
            this.f163a[2] = false;
            return false;
        } else if (!this.f163a[2]) {
            return false;
        } else {
            if (this.zoneID == 5 && this.actID != 2 && mo85m()) {
                return false;
            }
            if (this.f320s) {
                f67g = true;
                f52d = false;
                f71h = false;
                this.f320s = false;
                f74i = true;
                f47c[3] = ((mo34a(0) * this.jmpSpeed) / 100) + f47c[10];
                f47c[5] = (mo49b(0) * this.jmpSpeed) / 100;
                return true;
            }
            f67g = true;
            f52d = false;
            f71h = false;
            this.f320s = false;
            f74i = true;
            int i2 = sonicAngle;
            int a2 = (this.tilesetMaps[((mo48b() / 16) / 16) % this.tilesetMapsHeight][(mo33a() / 16) / 16] * 512) + ((((mo33a() / 16) % 16) + (((mo48b() / 16) % 16) * 16)) * 2) + 1;
            byte abs = (byte) Math.abs(((byte) ((this.lvlChunks[a2 - 1] & 255) << 6)) >> 6);
            byte f = (byte) m229f((abs % 4 != 0 ? (abs % 4) * 256 : 0) + (this.lvlChunks[a2] & 255));
            if (sonicAngle == 270) {
                this.f256bn = 5;
                f47c[3] = -this.jmpSpeed;
                int[] iArr2 = f47c;
                a = -Math.abs(this.jmpSpeed);
                c = 5;
                iArr = iArr2;
            } else if (sonicAngle == 90) {
                this.f256bn = 5;
                f47c[3] = this.jmpSpeed;
                int[] iArr3 = f47c;
                a = -Math.abs(this.jmpSpeed);
                c = 5;
                iArr = iArr3;
            } else if (f == 0 || sonicAngle > 290 || sonicAngle < 70) {
                f47c[3] = ((mo34a(i2) * this.jmpSpeed) / 100) + f47c[10];
                f47c[5] = (mo49b(i2) * this.jmpSpeed) / 100;
                if (f47c[5] > 0) {
                    this.f233bJ = 1;
                }
                if (Math.abs(f47c[10]) > 2560 && this.zoneID == 4 && this.actID == 1 && f47c[0] > 9216) {
                    int[] iArr4 = f47c;
                    iArr4[5] = iArr4[5] - 768;
                    int[] iArr5 = f47c;
                    a = ((mo34a(i2) * this.jmpSpeed) / 100) + 2560;
                    c = 3;
                    iArr = iArr5;
                }
                return true;
            } else {
                f47c[3] = (mo34a(i2) * this.jmpSpeed) / 100;
                int[] iArr6 = f47c;
                a = (mo49b(i2) * this.jmpSpeed) / 100;
                c = 5;
                iArr = iArr6;
            }
            iArr[c] = a;
            return true;
        }
    }

    /* renamed from: c */
    public static boolean mo57c(int i, int i2) {
        return Math.abs(i - mo33a()) > 240 || Math.abs(i2 - mo48b()) > 240;
    }

    /* renamed from: d */
    private int mo62d() {
        int i = 768;
        switch (this.actID) {
            case 0:
                if (6016 <= f98y[0]) {
                    return 1024;
                }
                break;
            case 1:
                if (3792 <= f98y[0]) {
                    if (5632 <= f98y[0]) {
                        if (7632 > f98y[0]) {
                            i = 1024;
                            break;
                        }
                    } else {
                        i = 512;
                        break;
                    }
                }
                break;
            case 2:
                if (896 <= f98y[0]) {
                    if (2400 <= f98y[0]) {
                        if (640 <= f98y[1]) {
                            if (4992 > f98y[0]) {
                                i = 1216;
                                break;
                            } else if (5888 > f98y[0]) {
                                return 1024;
                            } else {
                                if (f98y[1] > 880) {
                                    if (6144 > f98y[0]) {
                                        return 1024;
                                    }
                                    this.f128K[1] = f66g + 6144;
                                    this.f265bw = 1;
                                    return 1024;
                                }
                            }
                        }
                    } else {
                        i = 784;
                        break;
                    }
                }
                break;
            default:
                return 1024;
        }
        return i;
    }

    /* renamed from: d */
    public static int mo63d(int i) {
        return i;
    }

    /* renamed from: d */
    public static void m218d(int i, int i2) {
        int a = mo33a();
        int i3 = i2 >= mo48b() + -16 ? i <= a ? 45 : 315 : i <= a ? 135 : 225;
        f47c[3] = mo34a(i3) * 8;
        f47c[5] = mo49b(i3) * 8;
    }

    /* renamed from: d */
    private static void drawHUDString(int i, int i2, int i3, int i4) {
        int i5 = ((i4 * 8) + i) - 7;
        drawSprite(screenBuffer, uiObjGfx[12], (i3 % 10) * 7, 0, 7, 13, rotationQuadrants[0], i5, i2, 20, true);
        for (int i6 = 1; i6 < i4; i6++) {
            int i7 = 1;
            for (int i8 = 0; i8 < i6; i8++) {
                i7 *= 10;
            }
            drawSprite(screenBuffer, uiObjGfx[12], ((i3 / i7) % 10) * 7, 0, 7, 13, rotationQuadrants[0], i5 - (i6 * 8), i2, 20, true);
        }
    }

    /* renamed from: d */
    private void mo66d(int[] iArr) {
        int i = 0;
        if (iArr[1] == 9 || iArr[1] == 15 || iArr[1] == 48 || iArr[1] == 11 || iArr[1] == 2 || iArr[1] == 79 || iArr[1] == 0 || 1 == iArr[1] || 63 == iArr[1] || 64 == iArr[1] || 65 == iArr[1] || 66 == iArr[1] || 67 == iArr[1] || 68 == iArr[1] || 69 == iArr[1]) {
            for (int length = this.f285e.length - 1; length > 0; length--) {
                if (this.f285e[length][24] == 0) {
                    this.f285e[length] = iArr;
                    this.f285e[length][24] = 1;
                    if (this.f111F != length) {
                        this.f195af++;
                        return;
                    }
                    this.f195af++;
                    while (i < this.f285e.length) {
                        if (this.f285e[length][24] == 0) {
                            this.f111F = length;
                            return;
                        }
                        i++;
                    }
                    return;
                }
            }
        } else if (this.f285e[this.f111F][24] == 0) {
            this.f285e[this.f111F] = iArr;
            this.f285e[this.f111F][24] = 1;
            this.f195af++;
            while (i < this.f285e.length) {
                if (this.f285e[i][24] == 0) {
                    this.f111F = i;
                    return;
                }
                i++;
            }
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f285e.length) {
                    break;
                } else if (this.f285e[i2][24] == 0) {
                    this.f111F = i2;
                    break;
                } else {
                    i2++;
                }
            }
            this.f285e[this.f111F] = iArr;
            this.f285e[this.f111F][24] = 1;
            this.f195af++;
            while (i < this.f285e.length) {
                if (this.f285e[i][24] == 0) {
                    this.f111F = i;
                    return;
                }
                i++;
            }
        }
    }

    /* renamed from: d */
    private boolean m221d(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            this.f231bH++;
            int i3 = (this.tilesetMaps[((i2 >> 4) >> 4) % this.tilesetMapsHeight][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f287f[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (this.lvlColMaps[(this.lvlChunks[i3] & 255) + (this.f278d[i3 >> 1] << 8)] & 255) << 5;
            if (this.f283e[i3 >> 1] == 1) {
                if (((this.tileCollisionTable[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1) == 0) {
                    return false;
                }
            } else if (this.f283e[i3 >> 1] == 2) {
                if (((this.tileCollisionTable[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1) == 0) {
                    return false;
                }
            } else if (this.f283e[i3 >> 1] == 3) {
                if (((this.tileCollisionTable[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1) == 0) {
                    return false;
                }
            } else if (((this.tileCollisionTable[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1) == 0) {
                return false;
            }
            f47c[8] = (this.lvlChunks[i3] & 255) + (this.f278d[i3 >> 1] << 8);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    /* renamed from: e */
    private int mo68e() {
        switch (this.actID) {
            case 0:
                if ((this.f102B != 0 || this.f104C != 0) && f98y[0] == 0 && f98y[1] == 0) {
                    return 1280;
                }
                if (mo33a() > 3584 && mo33a() < 4096 && mo48b() > 1024 && mo48b() < 1248) {
                    return 1280;
                }
                if (3696 <= f98y[0]) {
                    return 5168 <= f98y[0] ? 528 : 1280;
                }
                if (1792 > f98y[0]) {
                    return 464;
                }
                if (2400 <= f98y[0] && 2752 > f98y[0]) {
                    return 728 > f98y[1] ? 544 : 1280;
                }
                if (728 > f98y[1]) {
                    return 3328 > f98y[0] ? 544 : 1280;
                }
                if (1176 <= f98y[1] || 3792 > f98y[0]) {
                }
                return 1280;
            case 1:
                return 1312;
            default:
                return (5472 >= f98y[0] || mo48b() >= 1280) ? 1824 : 528;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* renamed from: e */
    private void mo67e(int i) {
        int[] iArr;
        char c;
        int i2;
        char c2;
        int[] iArr2;
        int[] iArr3;
        int i3;
        if (i == 0) {
            f74i = false;
            this.f212aw = 0;
            f67g = false;
            f46c = false;
            f52d = false;
        }
        if (i == 0) {
            f47c[10] = f47c[3];
            int a = mo45a(mo33a(), mo48b());
            if (a < 0) {
                int i4 = 1;
                while (i4 < this.f232bI + 1 && (a = mo45a(mo33a() - i4, mo48b())) < 0 && (a = mo45a(mo33a() + i4, mo48b())) < 0) {
                    i4++;
                }
            }
            sonicAngle = a;
            if ((a > 67 || a < 44) && (a < 293 || a > 316)) {
                if (a < 338 && a > 22) {
                    int[] iArr4 = f47c;
                    i3 = iArr4[10] + ((mo49b(a + 90) * f47c[5]) / 100);
                    iArr3 = iArr4;
                }
                f47c[5] = 0;
                f47c[3] = 0;
                if (this.zoneID == 2 && (f47c[8] == 365 || f47c[8] == 364 || f47c[8] == 363 || f47c[8] == 362)) {
                    this.f107D = true;
                }
                if (f47c[10] < 0) {
                    f47c[13] = 1;
                }
                if (f47c[10] > 0) {
                    f47c[13] = 2;
                }
                iArr = f47c;
                c = 14;
            } else {
                if (f47c[5] > 3072) {
                    f47c[5] = 4096;
                }
                if (mo49b(a + 90) > 0) {
                    iArr3 = f47c;
                    i3 = f47c[5];
                } else {
                    iArr3 = f47c;
                    i3 = -f47c[5];
                }
            }
            iArr3[10] = i3;
            f47c[5] = 0;
            f47c[3] = 0;
            this.f107D = true;
            if (f47c[10] < 0) {
            }
            if (f47c[10] > 0) {
            }
            iArr = f47c;
            c = 14;
        } else {
            if (f46c) {
                int a2 = mo45a(mo33a(), mo48b() - 32);
                if (a2 < 0) {
                    a2 = sonicAngle;
                }
                if (a2 % 90 != 0) {
                    int[] iArr5 = f47c;
                    i2 = ((-(mo49b(a2 + 90) * f47c[5])) / 100) + iArr5[3];
                    c2 = 3;
                    iArr2 = iArr5;
                    iArr2[c2] = i2;
                }
            }
            iArr = f47c;
            c = 5;
        }
        i2 = 0;
        c2 = c;
        iArr2 = iArr;
        iArr2[c2] = i2;
    }

    /* renamed from: e */
    private void m224e(int i, int i2, int i3, int i4) {
        if (i3 > 16) {
            i3 = 16;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = ((i5 >> 1) * 2250) + 1125;
            if ((i5 & 1) == 1) {
                i6 = (-i6) + 36000;
            }
            m336b(4, i, i2, i6 / 100, i4, 0);
        }
    }

    /* renamed from: e */
    private void mo71e(int[] iArr) {
        switch (iArr[1]) {
            case 1:
                m232f(iArr);
                return;
            case 2:
                m232f(iArr);
                return;
            case 3:
            case 11:
            case 27:
            default:
                return;
            case 4:
                m236g(iArr);
                return;
            case 5:
                m240h(iArr);
                return;
            case 6:
                m245i(iArr);
                return;
            case 7:
                m249j(iArr);
                return;
            case 8:
                m253k(iArr);
                return;
            case 9:
                m256l(iArr);
                return;
            case 10:
                m259m(iArr);
                return;
            case 12:
                m265o(iArr);
                return;
            case 13:
                m262n(iArr);
                return;
            case 14:
                m267p(iArr);
                return;
            case 15:
                m270q(iArr);
                return;
            case 16:
                m272r(iArr);
                return;
            case 17:
                m274s(iArr);
                return;
            case 18:
                m276t(iArr);
                return;
            case 19:
                m278u(iArr);
                return;
            case 20:
                m280v(iArr);
                return;
            case 21:
                m281w(iArr);
                return;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                m282x(iArr);
                return;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                m129I(iArr);
                return;
        }
    }

    /* renamed from: e */
    private static boolean m226e() {
        return false;
    }

    /* renamed from: e */
    private boolean m227e(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return this.f287f[(((this.tilesetMaps[((i2 >> 4) >> 4) % this.tilesetMapsHeight][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1)) + 1) >> 1] != 1;
    }

    /* renamed from: f */
    private int mo72f() {
        switch (this.actID) {
            case 1:
                return (9632 > f98y[0] || 1248 <= mo48b()) ? 1312 : 1056;
            default:
                return 11264 > f98y[0] ? 1824 : 1228;
        }
    }

    /* renamed from: f */
    private int m229f(int i) {
        return this.angleTable[this.lvlColMaps[i] & 255] & 255;
    }

    /* renamed from: f */
    private void m230f(int i) {
        if (i == 1) {
            if (f47c[10] < 0 && f47c[13] == 1) {
                int[] iArr = f47c;
                iArr[10] = iArr[10] + this.sonicMaxDec;
                if (f47c[10] > 0) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                }
            }
            if (f47c[10] == 0) {
                int[] iArr2 = f47c;
                iArr2[10] = iArr2[10] + this.sonicMaxAcc;
            }
            int[] iArr3 = f47c;
            iArr3[10] = iArr3[10] + this.sonicMaxAcc;
            if (f47c[10] <= 0 || f47c[13] != 1) {
                return;
            }
        } else {
            if (f47c[10] > 0 && f47c[13] == 2) {
                int[] iArr4 = f47c;
                iArr4[10] = iArr4[10] - this.sonicMaxDec;
                if (f47c[10] < 0) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                }
            }
            if (f47c[10] == 0) {
                int[] iArr5 = f47c;
                iArr5[10] = iArr5[10] - this.sonicMaxAcc;
            }
            int[] iArr6 = f47c;
            iArr6[10] = iArr6[10] - this.sonicMaxAcc;
            if (f47c[10] >= 0 || f47c[13] != 2) {
                return;
            }
        }
        f47c[13] = 0;
        f47c[14] = 0;
    }

    /* renamed from: f */
    private void m231f(boolean z) {
        if (z) {
            this.lives = 3;
            this.score = 0;
            this.f334z = 0;
            m374p();
            this.f102B = 0;
            this.f104C = 0;
            this.f106D = 0;
            this.f108E = 0;
            this.f153Y = false;
            return;
        }
        for (int i = 0; i < f15C.length; i++) {
            if (f15C[i] < this.score) {
                this.gameMode = 9;
                this.f326v = true;
                return;
            }
        }
        m351d(3);
    }

    /* renamed from: f */
    private static void m232f(int[] iArr) {
        if (iArr[6] > 24) {
            iArr[0] = 0;
        }
    }

    /* renamed from: f */
    private boolean m233f() {
        if (!m326a(mo33a() + 12, mo48b() - 12)) {
            return false;
        }
        for (int i = 0; i < 14; i++) {
            int[] iArr = f47c;
            iArr[0] = iArr[0] - 256;
            if (!m326a(mo33a() + 12, mo48b() - 12)) {
                break;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static int m234g(int i) {
        char c;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        char c2 = 2;
        if (f47c[12] == 1) {
            int[] iArr4 = new int[8];
            iArr4[0] = rotationQuadrants[5];
            iArr4[1] = rotationQuadrants[5];
            iArr4[2] = rotationQuadrants[4];
            iArr4[3] = rotationQuadrants[4];
            iArr4[4] = rotationQuadrants[7];
            iArr4[5] = rotationQuadrants[7];
            iArr4[6] = rotationQuadrants[6];
            c = 7;
            iArr = rotationQuadrants;
            c2 = 6;
            iArr2 = iArr4;
            iArr3 = iArr4;
        } else {
            int[] iArr5 = new int[8];
            iArr5[0] = rotationQuadrants[2];
            iArr5[1] = rotationQuadrants[1];
            iArr5[2] = rotationQuadrants[1];
            iArr5[3] = rotationQuadrants[0];
            iArr5[4] = rotationQuadrants[0];
            iArr5[5] = rotationQuadrants[3];
            iArr5[6] = rotationQuadrants[3];
            c = 7;
            iArr = rotationQuadrants;
            iArr2 = iArr5;
            iArr3 = iArr5;
        }
        iArr2[c] = iArr[c2];
        return iArr3[i];
    }

    /* renamed from: g */
    private void m235g(int i) {
        int[] iArr;
        int[] iArr2;
        int i2 = 4096;
        if (i == 1) {
            int[] iArr3 = f47c;
            iArr3[10] = iArr3[10] + (this.sonicMaxAcc >> 1);
            if (Math.abs(f47c[10]) <= 4096) {
                return;
            }
            if (f47c[10] < 0) {
                iArr2 = f47c;
                i2 = -4096;
            } else {
                iArr = f47c;
                iArr2 = iArr;
            }
        } else {
            int[] iArr4 = f47c;
            iArr4[10] = iArr4[10] - (this.sonicMaxAcc >> 1);
            if (Math.abs(f47c[10]) <= 4096) {
                return;
            }
            if (f47c[10] < 0) {
                iArr2 = f47c;
                i2 = -4096;
            } else {
                iArr = f47c;
                iArr2 = iArr;
            }
        }
        iArr2[10] = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        if (r1 > 500) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0088, code lost:
        r1 = 500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
        if (r1 <= 500) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        r0 = r2;
     */
    /* renamed from: g */
    private void m236g(int[] iArr) {
        int i;
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[15] = this.f302j >> 1;
        int i2 = iArr[11];
        int i3 = iArr[2] / 100;
        int i4 = iArr[3] / 100;
        if (mo32a(i3, i4, 12, 12, false) != 0) {
            mo36a(5, i3, i4, 0, 0, 0, 0);
            this.rings++;
            iArr[0] = 0;
            return;
        }
        if (i2 > 0) {
            if (m340b(i3, i4 + 4)) {
                i4 = (i4 & -16) + (16 - Math.abs((int) this.collisionArr[((this.lvlColMaps[this.f206aq] & 255) << 4) + (i3 & 15)]));
                i = -(i2 >> 1);
            } else {
                i = i2 + 6;
            }
        } else if (m340b(i3, i4 - 4)) {
            int i5 = i4;
            for (int i6 = 0; i6 < 3; i6++) {
                i5++;
                if (!m340b(i3, i5 - 4)) {
                    break;
                }
            }
            i = -(i2 >> 1);
            i4 = i5;
        } else {
            i = i2 + 6;
        }
        int i7 = i4;
        if (i7 < 0) {
            i7 = 0;
        } else if (i7 > 99999) {
            iArr[0] = 0;
        }
        iArr[3] = i7 * 100;
        iArr[11] = i;
        if (iArr[6] > 300) {
            iArr[0] = 0;
        }
    }

    /* renamed from: g */
    private boolean mo74g() {
        if (!m326a(mo33a() - 12, mo48b() - 12)) {
            return false;
        }
        for (int i = 0; i < 14; i++) {
            int[] iArr = f47c;
            iArr[0] = iArr[0] + 256;
            if (!m326a(mo33a() - 12, mo48b() - 12)) {
                break;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static int m238h(int i) {
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        if (p000.RunnableC0002c.f47c[10] > 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013b, code lost:
        if (p000.RunnableC0002c.f47c[10] > 0) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: h */
    private void m239h(int i) {
        int i2 = 0;
        if (!this.f320s) {
            if (i == 0) {
                int i3 = sonicAngle;
                if (i3 >= 0) {
                    i2 = i3;
                } else if (sonicAngle != 0 && !this.f320s && (sonicAngle <= 22 || sonicAngle >= 338)) {
                    i2 = f47c[10] > 0 ? 90 : f47c[10] < 0 ? 270 : sonicAngle;
                }
                if (sonicAngle > 22 && sonicAngle < 338) {
                    int[] iArr = f47c;
                    iArr[10] = ((mo49b(i2 + 90) * 32) / 100) + iArr[10];
                    return;
                }
                return;
            }
            int i4 = f47c[10];
            int i5 = sonicAngle;
            if (i5 < 0) {
                if (sonicAngle != 0) {
                    if (this.f320s) {
                        i5 = 0;
                    } else if (sonicAngle <= 22 || sonicAngle >= 338) {
                        i5 = f47c[10] > 0 ? 90 : f47c[10] < 0 ? 270 : sonicAngle;
                    }
                }
                i5 = 0;
            }
            if (i5 < 338 && i5 > 22) {
                if ((mo49b(i5 + 90) * 80) / 100 < 0 && f47c[10] < 0) {
                    int[] iArr2 = f47c;
                    iArr2[10] = iArr2[10] + ((mo49b(i5 + 90) * 80) / 100);
                }
                if ((mo49b(i5 + 90) * 80) / 100 > 0) {
                }
                f47c[10] = 0;
                f47c[13] = 0;
                f47c[14] = 0;
                f74i = false;
                if (f47c[10] > 0) {
                    return;
                }
                return;
            } else if (sonicAngle == 338 || sonicAngle == 22) {
                if ((mo49b(i5 + 90) << 5) / 100 < 0 && f47c[10] < 0) {
                    int[] iArr3 = f47c;
                    iArr3[10] = iArr3[10] + ((mo49b(i5 + 90) * 80) / 100);
                }
                if ((mo49b(i5 + 90) << 5) / 100 > 0) {
                }
                if (f47c[10] >= 0 && i4 <= 0) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                    f74i = false;
                }
                if (f47c[10] > 0 && i4 >= 0) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                    f74i = false;
                    return;
                }
                return;
            }
            int[] iArr4 = f47c;
            iArr4[10] = ((mo49b(i5 + 90) * 80) / 100) + iArr4[10];
            f47c[10] = 0;
            f47c[13] = 0;
            f47c[14] = 0;
            f74i = false;
            if (f47c[10] > 0) {
            }
        }
    }

    /* renamed from: h */
    private static void m240h(int[] iArr) {
        iArr[15] = iArr[6] / 8;
        if (iArr[15] > 3) {
            iArr[0] = 0;
        }
    }

    /* renamed from: h */
    private boolean mo76h() {
        if (!m326a(mo33a() + 12, mo48b() - 24)) {
            return false;
        }
        for (int i = 0; i < 14; i++) {
            int[] iArr = f47c;
            iArr[0] = iArr[0] - 256;
            if (!m326a(mo33a() + 12, mo48b() - 24)) {
                break;
            }
        }
        return true;
    }

    /* renamed from: i */
    private static int m242i(int i) {
        switch (i) {
            case 1:
                return rotationQuadrants[1];
            case 2:
                return rotationQuadrants[2];
            case 3:
                return rotationQuadrants[3];
            default:
                return 0;
        }
    }

    /* renamed from: i */
    private void m243i(int i) {
        m191at();
        m247j(i);
        for (int i2 = 0; i2 < 2; i2++) {
            if (f98y[i2] < 0) {
                f98y[i2] = 0;
            }
        }
    }

    /* renamed from: i */
    private static void m244i(int i, int i2, int i3) {
        int i4 = i3 % 10;
        int i5 = 1;
        while (true) {
            int i6 = 1;
            for (int i7 = 0; i7 < i5; i7++) {
                i6 *= 10;
            }
            if (i3 / i6 == 0) {
                break;
            }
            i5++;
        }
        drawSprite(screenBuffer, uiObjGfx[13], i4 * 8, 48, 8, 16, rotationQuadrants[0], i - 8, i2, 20, true);
        for (int i8 = 1; i8 < i5; i8++) {
            int i9 = 1;
            for (int i10 = 0; i10 < i8; i10++) {
                i9 *= 10;
            }
            drawSprite(screenBuffer, uiObjGfx[13], ((i3 / i9) % 10) * 8, 48, 8, 16, rotationQuadrants[0], i - ((i8 + 1) * 8), i2, 20, true);
        }
    }

    /* renamed from: i */
    private static void m245i(int[] iArr) {
        iArr[3] = iArr[3] - 100;
        if (iArr[6] > 50) {
            iArr[0] = 0;
        }
    }

    /* renamed from: i */
    private boolean mo79i() {
        if (!m326a(mo33a() - 12, mo48b() - 24)) {
            return false;
        }
        for (int i = 0; i < 14; i++) {
            int[] iArr = f47c;
            iArr[0] = iArr[0] + 256;
            if (!m326a(mo33a() - 12, mo48b() - 24)) {
                break;
            }
        }
        return true;
    }

    /* renamed from: j */
    private void m247j(int i) {
        int b = mo48b();
        if (this.f322t && (!(this.zoneID == 1 && this.actID == 2) && f98y[1] + i > this.f128K[3])) {
            f98y[1] = this.f128K[3] - i;
        }
        if (b - f98y[1] < i) {
            this.f155Z = true;
            int[] iArr = f98y;
            iArr[1] = iArr[1] - (i - (b - f98y[1]));
            if ((!((this.zoneID == 1 && this.actID == 2 && f98y[0] < 7936) || (this.zoneID == 5 && this.actID == 1)) || this.f250bh > 0 || this.f249bg > 0) && f98y[1] < this.f128K[2]) {
                f98y[1] = this.f128K[2];
            }
        } else if (b - f98y[1] > i) {
            this.f155Z = true;
            int[] iArr2 = f98y;
            iArr2[1] = iArr2[1] - (i - (b - f98y[1]));
            if (f98y[1] + i > this.f128K[3]) {
                f98y[1] = this.f128K[3] - i;
            }
            if (this.zoneID != 1 || this.actID != 2) {
                if (this.zoneID != 5 || this.actID != 1) {
                    if (((this.zoneID == 3 && ((f98y[1] + 168) << 8) < f47c[1]) || (((f98y[1] - 16) + 240) << 8) < f47c[1]) && !f76j) {
                        f47c[1] = ((f98y[1] - 16) + 240) << 8;
                        mo96v();
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private void m248j(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.f307k.length; i4++) {
            if (this.f307k[i4][0] == 0) {
                this.f307k[i4][0] = 1;
                this.f307k[i4][1] = i3;
                this.f307k[i4][2] = i;
                this.f307k[i4][3] = i2;
                this.f307k[i4][5] = 0;
                return;
            }
        }
    }

    /* renamed from: j */
    private void m249j(int[] iArr) {
        if (mo32a(iArr[2] / 100, iArr[3] / 100, 8, 8, false) != 0) {
            m378u();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[15] = (this.f302j & 1) + 2;
    }

    /* renamed from: j */
    private boolean mo80j() {
        int i;
        int i2;
        if (sonicAngle <= 22 || sonicAngle >= 338) {
            i = mo33a() + 12;
            i2 = mo48b() - 12;
        } else if (this.zoneID != 1 || sonicAngle != 316) {
            return false;
        } else {
            i = mo33a() + 12;
            i2 = mo48b() - 36;
        }
        if ((this.zoneID == 4 || this.zoneID == 3) && sonicAngle != 0) {
            return false;
        }
        if (!m326a(i, i2)) {
            return false;
        }
        int i3 = i;
        for (int i4 = 0; i4 < 14; i4++) {
            int[] iArr = f47c;
            iArr[0] = iArr[0] - 256;
            i3--;
            if (!m221d(i3, i2)) {
                break;
            }
        }
        return true;
    }

    /* renamed from: k */
    private void m251k(int i) {
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        int abs;
        m185an();
        if (this.zoneID != 1 || this.f197ah >= mo48b() - 12) {
            if (this.f113F[0] > 4096) {
                this.f113F[0] = 4096;
            }
            if (this.f113F[0] < -4096) {
                this.f113F[0] = -4096;
            }
            if (this.f113F[1] > 4096) {
                this.f113F[1] = 4096;
            }
            if (this.f113F[1] < -4096) {
                this.f113F[1] = -4096;
            }
            int[] iArr3 = f47c;
            iArr3[0] = iArr3[0] + this.f113F[0];
            iArr = f47c;
            i2 = iArr[1];
            i3 = this.f113F[1];
        } else {
            int[] iArr4 = f47c;
            iArr4[0] = iArr4[0] + (this.f113F[0] >> 1);
            iArr = f47c;
            i2 = iArr[1];
            i3 = this.f113F[1] >> 1;
        }
        iArr[1] = i3 + i2;
        if (i == 1) {
            if (this.f255bm > 0) {
                this.f255bm--;
            } else if (this.zoneID != 1 || this.f197ah >= mo48b() - 12) {
                int[] iArr5 = f47c;
                iArr5[5] = iArr5[5] + this.sonicGravity;
            } else {
                int[] iArr6 = f47c;
                iArr6[5] = iArr6[5] + (this.sonicGravity / 2);
            }
        }
        if (i == 1 && f74i) {
            iArr2 = f47c;
            i4 = iArr2[11];
            abs = this.sonicMaxSpd;
        } else if (Math.abs(this.f113F[0]) + Math.abs(this.f113F[1]) > this.sonicMaxSpd) {
            iArr2 = f47c;
            i4 = iArr2[11];
            abs = this.sonicMaxSpd;
        } else {
            iArr2 = f47c;
            i4 = iArr2[11];
            abs = Math.abs(this.f113F[0]) + Math.abs(this.f113F[1]);
        }
        iArr2[11] = abs + i4;
    }

    /* renamed from: k */
    private void m252k(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i3 > 32) {
                i3 = 32;
            }
            m224e(i, i2, i3, 256);
            if (i3 > 16) {
                m224e(i, i2, i3 - 16, 128);
            }
        }
    }

    /* renamed from: k */
    private void m253k(int[] iArr) {
        if (iArr[6] > 10) {
            if (mo32a(iArr[2] / 100, iArr[3] / 100, 10, 10, false) != 0) {
                m378u();
            }
            iArr[2] = iArr[2] + iArr[10];
            iArr[3] = iArr[3] + iArr[11];
        }
        iArr[15] = (this.f302j & 1) + 2;
    }

    /* renamed from: k */
    private boolean mo81k() {
        if (sonicAngle > 22 && sonicAngle < 338) {
            return false;
        }
        if ((this.zoneID == 4 || this.zoneID == 3) && sonicAngle != 0) {
            return false;
        }
        if (this.zoneID == 2 && sonicAngle == 22) {
            return false;
        }
        int a = mo33a() - 12;
        int b = mo48b() - 12;
        if (!m326a(a, b)) {
            return false;
        }
        for (int i = 0; i < 14; i++) {
            int[] iArr = f47c;
            iArr[0] = iArr[0] + 256;
            a++;
            if (!m221d(a, b)) {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: l */
    private void m255l(int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        char c2;
        int[] iArr2;
        int i5;
        int i6;
        int i7 = 1;
        int i8 = i * 7;
        int i9 = this.objPosArr[this.actID][(i * 7) + 5] & 255;
        if (i9 == 0 || 1 == i9 || 63 == i9 || 64 == i9 || 65 == i9 || 66 == i9 || 67 == i9 || 68 == i9 || 69 == i9) {
            int i10 = this.objPosArr[this.actID][i8 + 6] + 1;
            int i11 = ((this.objPosArr[this.actID][i8 + 0] & 255) << 8) | (this.objPosArr[this.actID][i8 + 1] & 255);
            if (i10 != 1) {
                switch (this.objPosArr[this.actID][i8 + 5]) {
                    case 0:
                        i5 = i10 - 1;
                        i6 = 24;
                        i11 += i6 * i5;
                        break;
                    case 63:
                        i11 -= (i10 - 1) * 16;
                        break;
                    case 64:
                        i5 = i10 - 1;
                        i6 = 16;
                        i11 += i6 * i5;
                        break;
                    case 65:
                    case 67:
                        i5 = i10 - 1;
                        i6 = 32;
                        i11 += i6 * i5;
                        break;
                    case 66:
                        i5 = i10 - 1;
                        i6 = 16;
                        i11 += i6 * i5;
                        break;
                }
                if (i11 - f98y[0] < this.f236bM || i11 - f98y[0] > this.f237bN) {
                    return;
                }
            }
            i7 = i10;
        } else if (i9 == 41 || i9 == 86 || i9 == 57 || i9 == 78 || i9 == 40 || i9 == 70 || i9 == 39 || i9 == 49 || i9 == 71 || i9 == 10 || i9 == 35) {
            int i12 = ((this.objPosArr[this.actID][i8 + 0] & 255) << 8) | (this.objPosArr[this.actID][i8 + 1] & 255);
            if (i12 - f98y[0] > -48 && i12 - f98y[0] < 288) {
                return;
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            int[] iArr3 = new int[25];
            if (!this.f279d[this.f125J[i] + i13] && !this.f273c[this.f125J[i] + i13]) {
                iArr3[0] = 1;
                iArr3[1] = this.objPosArr[this.actID][i8 + 5] & 255;
                iArr3[2] = ((this.objPosArr[this.actID][i8 + 0] & 255) << 8) | (this.objPosArr[this.actID][i8 + 1] & 255);
                iArr3[3] = ((this.objPosArr[this.actID][i8 + 2] & 255) << 8) | (this.objPosArr[this.actID][i8 + 3] & 255);
                iArr3[8] = ((this.objPosArr[this.actID][i8 + 0] & 255) << 8) | (this.objPosArr[this.actID][i8 + 1] & 255);
                iArr3[9] = ((this.objPosArr[this.actID][i8 + 2] & 255) << 8) | (this.objPosArr[this.actID][i8 + 3] & 255);
                if (i7 != 1) {
                    switch (this.objPosArr[this.actID][i8 + 5]) {
                        case 0:
                            iArr3[2] = iArr3[2] + (i13 * 24);
                            c = '\b';
                            i2 = 24;
                            i3 = i13;
                            i4 = iArr3[8];
                            iArr = iArr3;
                            iArr[c] = (i3 * i2) + i4;
                            break;
                        case 1:
                            iArr3[3] = iArr3[3] + (i13 * 24);
                            c = '\t';
                            i2 = 24;
                            i3 = i13;
                            i4 = iArr3[9];
                            iArr = iArr3;
                            iArr[c] = (i3 * i2) + i4;
                            break;
                        case 63:
                            iArr3[2] = iArr3[2] - (i13 * 16);
                            iArr3[8] = iArr3[8] - (i13 * 16);
                            iArr3[3] = iArr3[3] + (i13 * 16);
                            c = '\t';
                            i2 = 16;
                            i3 = i13;
                            i4 = iArr3[9];
                            iArr = iArr3;
                            iArr[c] = (i3 * i2) + i4;
                            break;
                        case 64:
                            iArr3[2] = iArr3[2] + (i13 * 16);
                            iArr3[8] = iArr3[8] + (i13 * 16);
                            iArr3[3] = iArr3[3] + (i13 * 16);
                            c = '\t';
                            i2 = 16;
                            i3 = i13;
                            i4 = iArr3[9];
                            iArr = iArr3;
                            iArr[c] = (i3 * i2) + i4;
                            break;
                        case 65:
                            iArr3[2] = iArr3[2] + (i13 * 32);
                            iArr3[8] = iArr3[8] + (i13 * 32);
                            iArr3[3] = iArr3[3] + (i13 * 32);
                            c2 = '\t';
                            iArr2 = iArr3;
                            i4 = iArr2[c2];
                            i2 = 32;
                            i3 = i13;
                            c = c2;
                            iArr = iArr2;
                            iArr[c] = (i3 * i2) + i4;
                            break;
                        case 66:
                            iArr3[2] = iArr3[2] + (i13 * 16);
                            c = '\b';
                            i2 = 16;
                            i3 = i13;
                            i4 = iArr3[8];
                            iArr = iArr3;
                            iArr[c] = (i3 * i2) + i4;
                            break;
                        case 67:
                            iArr3[2] = iArr3[2] + (i13 * 32);
                            c2 = '\b';
                            iArr2 = iArr3;
                            i4 = iArr2[c2];
                            i2 = 32;
                            i3 = i13;
                            c = c2;
                            iArr = iArr2;
                            iArr[c] = (i3 * i2) + i4;
                            break;
                        case 68:
                            iArr3[3] = iArr3[3] + (i13 * 16);
                            c = '\t';
                            i2 = 16;
                            i3 = i13;
                            i4 = iArr3[9];
                            iArr = iArr3;
                            iArr[c] = (i3 * i2) + i4;
                            break;
                        case 69:
                            iArr3[3] = iArr3[3] + (i13 * 32);
                            c2 = '\t';
                            iArr2 = iArr3;
                            i4 = iArr2[c2];
                            i2 = 32;
                            i3 = i13;
                            c = c2;
                            iArr = iArr2;
                            iArr[c] = (i3 * i2) + i4;
                            break;
                    }
                }
                iArr3[4] = this.objPosArr[this.actID][i8 + 6] & 255;
                iArr3[19] = this.objPosArr[this.actID][i8 + 4] & 255;
                iArr3[20] = this.f125J[i] + i13;
                iArr3[22] = this.f125J[i];
                if (this.f311m[0] == 0) {
                    if (iArr3[1] == 41 || iArr3[1] == 86 || iArr3[1] == 57 || iArr3[1] == 78 || iArr3[1] == 40 || iArr3[1] == 70 || iArr3[1] == 39 || iArr3[1] == 49 || iArr3[1] == 71) {
                        return;
                    }
                } else if (this.f311m[0] == 1 && (iArr3[1] == 40 || iArr3[1] == 70 || iArr3[1] == 39 || iArr3[1] == 49 || iArr3[1] == 71)) {
                    return;
                }
                this.f273c[this.f125J[i] + i13] = true;
                mo66d(iArr3);
            }
        }
    }

    /* renamed from: l */
    private void m256l(int[] iArr) {
        if (iArr[6] > 5) {
            if (mo32a(iArr[2] / 100, iArr[3] / 100, 10, 10, false) != 0) {
                m378u();
            }
            iArr[2] = iArr[2] + iArr[10];
            iArr[3] = iArr[3] + iArr[11];
            iArr[11] = iArr[11] + 10;
            if (iArr[11] > 600) {
                iArr[11] = 600;
            }
        }
        iArr[15] = (this.f302j & 1) + 4;
    }

    /* renamed from: l */
    private boolean mo84l() {
        int i = 0;
        if (m326a(mo33a(), mo48b() - 32)) {
            while (i < 14) {
                int[] iArr = f47c;
                iArr[1] = iArr[1] + 256;
                if (!m326a(mo33a(), mo48b() - 32)) {
                    int[] iArr2 = f47c;
                    iArr2[1] = iArr2[1] - 256;
                    return true;
                }
                i++;
            }
            return true;
        } else if (!m326a(mo33a(), mo48b() - 16)) {
            return false;
        } else {
            while (i < 14) {
                int[] iArr3 = f47c;
                iArr3[1] = iArr3[1] + 256;
                if (!m326a(mo33a(), mo48b() - 16)) {
                    int[] iArr4 = f47c;
                    iArr4[1] = iArr4[1] - 256;
                    return true;
                }
                i++;
            }
            return true;
        }
    }

    /* renamed from: m */
    private void m258m(int i) {
        Graphics graphics;
        int i2;
        int i3 = f73i + f70h;
        int i4 = i3 + 1;
        int i5 = f51d - 30;
        int i6 = i5 / i;
        screenBuffer.setColor(2257915);
        screenBuffer.fillRect(15, i3, i5, 7);
        screenBuffer.setColor(410260);
        screenBuffer.drawRect(14, i3, i5 + 1, 7);
        screenBuffer.setColor(8506866);
        if (this.f281e > 22) {
            i2 = this.f281e - 2;
            graphics = screenBuffer;
        } else {
            graphics = screenBuffer;
            i2 = this.f281e;
        }
        graphics.fillRect(((i2 * i5) / i) + 15, i4, i6, 5);
        screenBuffer.drawImage(menuObjGfx[1], i5 + 15 + 5, i3, 20);
        screenBuffer.drawImage(menuObjGfx[2], 7, i3, 20);
    }

    /* renamed from: m */
    private void m259m(int[] iArr) {
        int a;
        if (mo32a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            m378u();
        }
        int i = iArr[2];
        int i2 = iArr[3];
        int i3 = iArr[10];
        int i4 = iArr[11] + 10;
        if (i4 > 300) {
            i4 = 300;
        }
        int i5 = i + i3;
        int i6 = i2 + i4;
        if (i4 > 0 && m340b(i5 / 100, (i6 / 100) + 5)) {
            do {
                a = mo45a(i5 / 100, (i6 / 100) + 5);
                i6 -= 100;
            } while (m340b(i5 / 100, (i6 / 100) + 5));
            if (a > 270) {
                i3 = -Math.abs(i3);
            } else if (a > 15) {
                i3 = Math.abs(i3);
            }
            i4 = -i4;
        }
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > 999900) {
            iArr[0] = 0;
        }
        iArr[15] = (this.f302j & 1) + 8;
        iArr[2] = i5;
        iArr[3] = i6;
        iArr[10] = i3;
        iArr[11] = i4;
        if (iArr[6] > 300) {
            mo36a(1, iArr[2] / 100, iArr[3] / 100, 0, 0, 0, 0);
            iArr[0] = 0;
        }
    }

    /* renamed from: m */
    private static boolean mo85m() {
        return 37 == f47c[8] || 38 == f47c[8] || 39 == f47c[8] || 41 == f47c[8] || 42 == f47c[8] || 47 == f47c[8] || 48 == f47c[8] || 49 == f47c[8] || 52 == f47c[8] || 59 == f47c[8] || 62 == f47c[8] || 69 == f47c[8] || 71 == f47c[8] || 72 == f47c[8] || 78 == f47c[8] || 79 == f47c[8] || 87 == f47c[8] || 88 == f47c[8] || 89 == f47c[8];
    }

    /* renamed from: n */
    private void m261n(int i) {
        this.f158a = this.f221b[i];
        this.f244bb = 0;
    }

    /* renamed from: n */
    private void m262n(int[] iArr) {
        if (mo32a(iArr[2] / 100, iArr[3] / 100, 8, 8, false) != 0) {
            m378u();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[11] = iArr[11] + 10;
        if (iArr[11] > 800) {
            iArr[11] = 800;
        }
        iArr[15] = (this.f302j & 1) + 12;
    }

    /* renamed from: n */
    private boolean mo86n() {
        if (this.f249bg > -1) {
            this.f249bg--;
        }
        if (this.f250bh > -1) {
            this.f250bh--;
        }
        if (f74i) {
            return true;
        }
        if (!f67g && !this.f105C) {
            if (this.f163a[1]) {
                if (Math.abs(f47c[10]) > this.sonicMaxDec) {
                    f74i = true;
                    return true;
                } else if (!this.f163a[3] && !this.f163a[4]) {
                    f78k = true;
                    this.f249bg += 2;
                    if (this.f249bg > 32) {
                        this.f249bg = 32;
                    }
                    return false;
                }
            } else if (this.f163a[0] && Math.abs(f47c[10]) <= this.sonicMaxDec && !this.f163a[3] && !this.f163a[4]) {
                f18R = true;
                this.f250bh += 2;
                if (this.f250bh > 24) {
                    this.f250bh = 24;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: o */
    private void m264o(int i) {
        String[] strArr;
        String str;
        String[] strArr2;
        String str2;
        String[] strArr3;
        String[] strArr4;
        RunnableC0002c cVar;
        String[] strArr5;
        char c;
        String[] strArr6;
        String[] strArr7;
        char c2 = 29;
        switch (i) {
            case 0:
                if (this.f311m[1] == 0) {
                    strArr6 = this.f162a;
                    strArr7 = this.f221b;
                } else {
                    strArr6 = this.f162a;
                    strArr7 = this.f221b;
                    c2 = '.';
                }
                strArr6[0] = strArr7[c2];
                strArr2 = this.f162a;
                strArr5 = this.f221b;
                c = '-';
                str2 = strArr5[c];
                break;
            case 1:
                strArr = this.f162a;
                str = "";
                strArr[0] = str;
                cVar = this;
                strArr2 = cVar.f162a;
                strArr5 = this.f221b;
                c = ',';
                str2 = strArr5[c];
                break;
            case 2:
                if (this.f311m[1] == 0) {
                    strArr3 = this.f162a;
                    strArr4 = this.f221b;
                } else {
                    strArr3 = this.f162a;
                    strArr4 = this.f221b;
                    c2 = '.';
                }
                strArr3[0] = strArr4[c2];
                cVar = this;
                strArr2 = cVar.f162a;
                strArr5 = this.f221b;
                c = ',';
                str2 = strArr5[c];
                break;
            case 3:
                this.f162a[0] = "";
                strArr2 = this.f162a;
                str2 = "";
                break;
            case 4:
                strArr = this.f162a;
                str = this.f221b[90];
                strArr[0] = str;
                cVar = this;
                strArr2 = cVar.f162a;
                strArr5 = this.f221b;
                c = ',';
                str2 = strArr5[c];
                break;
            default:
                return;
        }
        strArr2[1] = str2;
    }

    /* renamed from: o */
    private void m265o(int[] iArr) {
        if (mo32a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            m378u();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[15] = 7;
    }

    /* renamed from: o */
    private boolean mo87o() {
        int[] iArr;
        int i;
        int[] iArr2;
        int i2;
        this.f138O = false;
        this.f140P = false;
        int i3 = sonicAngle;
        int i4 = 256;
        int i5 = (sonicAngle == 22 || sonicAngle == 338) ? 32 : 256;
        if (sonicAngle >= 270 && sonicAngle < 300) {
            i4 = 32;
        }
        if (sonicAngle >= 60 && sonicAngle < 90) {
            i4 = 32;
        }
        byte b = this.tilesetMaps[mo48b() >> 8][mo33a() >> 8];
        if (this.zoneID == 0 && (b == 31 || b == 32)) {
            i4 = 256;
        }
        int i6 = sonicAngle;
        if (mo88p()) {
            this.f320s = false;
            if (!(this.zoneID == 4 && ((i6 == 79 && sonicAngle == 90) || (i6 == 281 && sonicAngle == 270)))) {
                return true;
            }
            if (sonicAngle == 90) {
                iArr2 = f47c;
                i2 = 640;
            } else {
                iArr2 = f47c;
                i2 = -640;
            }
            iArr2[10] = i2;
            sonicAngle = i6;
            this.f211av = 0;
            this.f233bJ = 3;
            return false;
        }
        for (int i7 = 0; i7 < 14; i7++) {
            int[] iArr3 = f47c;
            iArr3[0] = iArr3[0] + ((mo34a(i3 + 180) * i5) / 100);
            int[] iArr4 = f47c;
            iArr4[1] = iArr4[1] + ((mo49b(i3 + 180) * i4) / 100);
            if (mo88p()) {
                this.f320s = false;
                if (!(this.zoneID == 4 && ((i6 == 79 && sonicAngle == 90) || (i6 == 281 && sonicAngle == 270)))) {
                    return true;
                }
                if (sonicAngle == 90) {
                    iArr = f47c;
                    i = 640;
                } else {
                    iArr = f47c;
                    i = -640;
                }
                iArr[10] = i;
                sonicAngle = i6;
                this.f211av = 0;
                this.f233bJ = 3;
                return false;
            }
        }
        return false;
    }

    /* renamed from: p */
    private void m267p(int[] iArr) {
        if (mo32a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            m378u();
        }
        iArr[15] = 11;
        int i = iArr[2];
        int i2 = iArr[3];
        int i3 = iArr[10];
        int i4 = iArr[11] + 10;
        if (i4 > 400) {
            i4 = 400;
        }
        int i5 = i + i3;
        int i6 = i2 + i4;
        if (i4 > 0 && m340b(i5 / 100, (i6 / 100) + 4)) {
            do {
                i6 -= 100;
            } while (m340b(i5 / 100, (i6 / 100) + 4));
            i4 = -i4;
        }
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > 999900) {
            iArr[0] = 0;
        }
        iArr[2] = i5;
        iArr[3] = i6;
        iArr[10] = i3;
        iArr[11] = i4;
        if (iArr[6] > 180) {
            iArr[0] = 0;
        }
    }

    /* renamed from: p */
    private boolean mo88p() {
        if (mo48b() < 0) {
            return false;
        }
        byte b = this.tilesetMaps[(mo48b() >> 8) % this.tilesetMapsHeight][mo33a() >> 8];
        if (this.zoneID == 5 && this.actID != 2) {
            return false;
        }
        if (this.zoneID == 0) {
            if (b == 31 || b == 32) {
                return m206b(0);
            }
            if (this.f113F[0] >= 0) {
                this.f138O = m271q();
                if (!this.f138O) {
                    this.f140P = mo90r();
                }
            }
            if (this.f113F[0] < 0) {
                this.f140P = mo90r();
                if (!this.f140P) {
                    this.f138O = m271q();
                }
            }
            return this.f138O || this.f140P;
        } else if (this.zoneID == 3) {
            return false;
        } else {
            if (this.f113F[0] >= 0) {
                this.f138O = m271q();
                if (!this.f138O) {
                    this.f140P = mo90r();
                }
            }
            if (this.f113F[0] < 0) {
                this.f140P = mo90r();
                if (!this.f140P) {
                    this.f138O = m271q();
                }
            }
            return this.f138O || this.f140P;
        }
    }

    /* renamed from: q */
    public static void tryCloseInputStream() {
        try {
            inputStream.close();
        } catch (Exception e) {
        }
    }

    /* renamed from: q */
    private static void m270q(int[] iArr) {
        if (iArr[6] > 30) {
            iArr[0] = 0;
        }
    }

    /* renamed from: q */
    private boolean m271q() {
        try {
            int i = sonicAngle;
            int i2 = i < 0 ? 0 : i;
            int i3 = this.f232bI;
            int a = mo33a() + ((mo34a(i2 + 90) * i3) / 100);
            int b = mo48b() + ((mo49b(i2 + 90) * i3) / 100);
            if (m221d(a, b)) {
                mo45a(a, b);
                int i4 = b;
                for (int i5 = 0; i5 < 16; i5++) {
                    int a2 = mo45a(a, i4);
                    if (!f67g) {
                        int[] iArr = f47c;
                        iArr[0] = iArr[0] - ((mo34a(i2 + 180) << 8) / 100);
                    }
                    int[] iArr2 = f47c;
                    iArr2[1] = iArr2[1] - ((mo49b(i2 + 180) << 8) / 100);
                    a = ((mo34a(i2 + 90) * i3) / 100) + mo33a();
                    i4 = mo48b() + ((mo49b(i2 + 90) * i3) / 100);
                    if (!m221d(a, i4)) {
                        if (!f67g) {
                            int[] iArr3 = f47c;
                            iArr3[0] = iArr3[0] + ((mo34a(i2 + 180) << 8) / 100);
                        }
                        int[] iArr4 = f47c;
                        iArr4[1] = iArr4[1] + ((mo49b(i2 + 180) << 8) / 100);
                        if (this.zoneID == 3 && a2 == 350) {
                            a2 = 0;
                        }
                        sonicAngle = a2;
                        return true;
                    }
                }
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: r */
    private void m272r(int[] iArr) {
        char c;
        switch (iArr[14]) {
            case 2:
                iArr[15] = 4;
                iArr[5] = 8;
                iArr[14] = iArr[14] + 1;
                break;
            case 3:
                break;
            default:
                if (iArr[6] > 4) {
                    if (mo32a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
                        m378u();
                    }
                    iArr[2] = iArr[2] + iArr[10];
                    iArr[3] = iArr[3] + iArr[11];
                    if (iArr[8] == 1) {
                        iArr[11] = iArr[11] + 6;
                        if (iArr[11] > 1000) {
                            iArr[11] = 1000;
                        }
                    }
                }
                if (iArr[10] > 0) {
                    iArr[18] = 3;
                    if (!m340b((iArr[2] / 100) + 15, iArr[3] / 100)) {
                        return;
                    }
                } else if (iArr[10] < 0) {
                    iArr[18] = 1;
                    if (!m340b((iArr[2] / 100) - 15, iArr[3] / 100)) {
                        return;
                    }
                } else if (iArr[11] < 0) {
                    c = 18;
                    iArr[c] = 2;
                    return;
                } else if (iArr[11] > 0) {
                    iArr[18] = 0;
                    if (!m340b(iArr[2] / 100, (iArr[3] / 100) + 16)) {
                        return;
                    }
                } else {
                    return;
                }
                c = 14;
                iArr[c] = 2;
                return;
        }
        if (iArr[5] <= 0) {
            iArr[0] = 0;
        }
    }

    /* renamed from: r */
    private boolean mo90r() {
        try {
            int i = sonicAngle;
            int i2 = i < 0 ? 0 : i;
            int i3 = this.f232bI;
            int a = mo33a() + ((mo34a(i2 + 270) * i3) / 100);
            int b = ((mo49b(i2 + 270) * i3) / 100) + mo48b();
            if (m221d(a, b)) {
                mo45a(a, b);
                for (int i4 = 0; i4 < 16; i4++) {
                    int a2 = mo45a(a, b);
                    if (!f67g) {
                        int[] iArr = f47c;
                        iArr[0] = iArr[0] - ((mo34a(i2 + 180) << 8) / 100);
                    }
                    int[] iArr2 = f47c;
                    iArr2[1] = iArr2[1] - ((mo49b(i2 + 180) << 8) / 100);
                    a = ((mo34a(i2 + 270) * i3) / 100) + mo33a();
                    b = mo48b() + ((mo49b(i2 + 270) * i3) / 100);
                    if (!m221d(a, b)) {
                        if (!f67g) {
                            int[] iArr3 = f47c;
                            iArr3[0] = iArr3[0] + ((mo34a(i2 + 180) << 8) / 100);
                        }
                        int[] iArr4 = f47c;
                        iArr4[1] = iArr4[1] + ((mo49b(i2 + 180) << 8) / 100);
                        sonicAngle = a2;
                        return true;
                    }
                }
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0050  */
    /* renamed from: s */
    private void m274s(int[] iArr) {
        if (mo32a(iArr[2] / 100, (iArr[3] / 100) + 6, 10, 10, false) != 0) {
            m378u();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        switch (iArr[14]) {
            case 1:
                iArr[11] = iArr[11] + 4;
                if (iArr[11] > 300) {
                    iArr[11] = 300;
                }
                if (!m340b(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                    mo36a(18, iArr[2] / 100, iArr[3] / 100, 0, 0, 0, 0);
                    mo36a(18, iArr[2] / 100, iArr[3] / 100, 0, 0, 1, 0);
                    iArr[11] = 0;
                    iArr[5] = 13;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = 4;
                    if (iArr[5] > 0) {
                        iArr[0] = 0;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                iArr[15] = 4;
                if (iArr[5] > 0) {
                }
                break;
            default:
                iArr[10] = 0;
                iArr[11] = 20;
                iArr[18] = 0;
                iArr[19] = 0;
                iArr[14] = 1;
                iArr[11] = iArr[11] + 4;
                if (iArr[11] > 300) {
                }
                if (!m340b(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                }
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f1, code lost:
        if (r10.f163a[3] != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0228, code lost:
        if (r10.f163a[3] != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010b, code lost:
        if (r10.f163a[3] != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0188, code lost:
        if (p000.RunnableC0002c.f47c[10] > 0) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a5, code lost:
        if (p000.RunnableC0002c.f47c[10] < 0) goto L_0x018a;
     */
    /* renamed from: s */
    private boolean mo91s() {
        int[] iArr;
        int i;
        byte b;
        boolean z;
        boolean z2;
        int[] iArr2;
        int i2;
        boolean z3 = true;
        this.f113F[0] = 0;
        this.f113F[1] = 0;
        if (m214c(0)) {
            return true;
        }
        int abs = Math.abs(f47c[10]);
        m239h(0);
        m189ar();
        if (abs <= this.sonicMaxSpd && Math.abs(f47c[10]) > this.sonicMaxSpd && abs <= this.sonicMaxSpd) {
            if (f47c[10] < 0) {
                iArr = f47c;
                i = -this.sonicMaxSpd;
            } else {
                iArr = f47c;
                i = this.sonicMaxSpd;
            }
            iArr[10] = i;
        }
        if ((sonicAngle <= 22 || sonicAngle >= 338) && ((abs > this.sonicMaxSpd || (!this.f163a[3] && !this.f163a[4] && f47c[10] != 0)) && f47c[10] != 0)) {
            if (f47c[10] < 0) {
                int[] iArr3 = f47c;
                iArr3[10] = iArr3[10] + this.sonicMaxAcc;
            } else {
                int[] iArr4 = f47c;
                iArr4[10] = iArr4[10] - this.sonicMaxAcc;
            }
            f47c[10] = 0;
            f47c[13] = 0;
            f47c[14] = 0;
        }
        if (Math.abs(f47c[10]) > 4096) {
            if (f47c[10] < 0) {
                iArr2 = f47c;
                i2 = -4096;
            } else {
                iArr2 = f47c;
                i2 = 4096;
            }
            iArr2[10] = i2;
        }
        if (mo86n()) {
            return false;
        }
        m251k(0);
        if (this.zoneID == 0 || this.zoneID == 3) {
            m194aw();
        }
        if (f80l) {
            return false;
        }
        try {
            b = this.tilesetMaps[(mo48b() >> 8) % this.tilesetMapsHeight][mo33a() >> 8];
        } catch (Exception e) {
            b = 0;
        }
        if (this.zoneID == 0 && (b == 31 || b == 32)) {
            f74i = true;
            int[] iArr5 = f47c;
            iArr5[10] = iArr5[10] + 256;
            if (f47c[10] > 4096) {
                f47c[10] = 4096;
            }
            z = true;
        } else {
            z = false;
        }
        if (this.zoneID == 0 && (b == 53 || b == 54)) {
            z = true;
        }
        if (!z) {
            if (!this.f320s) {
                if (mo80j()) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                    if (this.f163a[4]) {
                        m376s();
                    }
                }
                if (mo81k()) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                }
            } else if (!m326a(mo33a() - 12, mo48b() - 24) || !m326a(mo33a() + 12, mo48b() - 24)) {
                if (mo76h() || m233f()) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                    if (this.f163a[4]) {
                        m376s();
                    }
                }
                if (mo79i() || mo74g()) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                }
            } else {
                if (m233f()) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                    if (this.f163a[4]) {
                        m376s();
                    }
                }
                if (mo74g()) {
                    f47c[10] = 0;
                    f47c[13] = 0;
                    f47c[14] = 0;
                }
            }
            m376s();
        }
        int i3 = f47c[0];
        int i4 = f47c[1];
        if (mo87o()) {
            this.f296h[0] = true;
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f211av > 0) {
            if (!z2) {
                return false;
            }
            f47c[0] = i3;
            f47c[1] = i4;
            return false;
        } else if (this.f320s || !z2) {
            if (!(this.zoneID == 0 && (b == 31 || b == 32))) {
                z3 = false;
            }
            if (this.zoneID == 2 && (f47c[8] == 365 || f47c[8] == 364 || f47c[8] == 363 || f47c[8] == 362)) {
                m378u();
            }
            if (z3) {
                return false;
            }
            mo95u();
            return false;
        } else {
            f47c[0] = i3;
            f47c[1] = i4;
            if (!(sonicAngle == 22 && this.zoneID == 1 && this.actID == 1)) {
                f47c[3] = (mo34a(sonicAngle + 90) * f47c[10]) / 100;
                f47c[5] = (mo49b(sonicAngle + 90) * f47c[10]) / 100;
            }
            if ((sonicAngle - 90) % 180 == 0) {
                if (sonicAngle == 90) {
                    int[] iArr6 = f47c;
                    iArr6[0] = iArr6[0] + 256;
                    if (this.zoneID == 4 && this.actID != 0) {
                        f47c[5] = 0;
                    }
                } else {
                    int[] iArr7 = f47c;
                    iArr7[0] = iArr7[0] - 256;
                    if (f47c[10] > 2816) {
                        this.f211av = 15;
                    }
                }
            }
            f47c[10] = 0;
            f47c[13] = 0;
            f47c[14] = 0;
            f71h = true;
            f67g = true;
            f52d = false;
            this.f320s = false;
            if (!mo84l()) {
                return false;
            }
            f47c[5] = 0;
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    private void m276t(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        RunnableC0002c cVar;
        char c;
        int i5;
        int[] iArr2;
        if (mo32a(iArr[2] / 100, (iArr[3] / 100) + 6, 12, 12, false) != 0) {
            m378u();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        switch (iArr[14]) {
            case 1:
                if (m340b(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                    iArr[3] = iArr[3] - 200;
                }
                if (iArr[6] % 24 == 0 && iArr[9] > 0) {
                    iArr[9] = iArr[9] - 1;
                    if (iArr[8] != 0) {
                        i = 19;
                        i2 = iArr[2] / 100;
                        i3 = iArr[3] / 100;
                        i4 = 0;
                        cVar = this;
                    } else if (iArr[8] == 1) {
                        i = 19;
                        i2 = iArr[2] / 100;
                        i3 = iArr[3] / 100;
                        i4 = 999;
                        cVar = this;
                    }
                    cVar.mo36a(i, i2, i3, 0, 0, 0, i4);
                }
                if (iArr[5] > 0) {
                    iArr[5] = 12;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = 4;
                    if (iArr[5] > 0) {
                        iArr[0] = 0;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                iArr[15] = 4;
                if (iArr[5] > 0) {
                }
                break;
            default:
                iArr[10] = iArr[19] == 1 ? 64 : -64;
                iArr[11] = 100;
                iArr[5] = 100;
                switch (iArr[8]) {
                    case 1:
                        iArr[5] = 140;
                        c = '\t';
                        i5 = 8;
                        iArr2 = iArr;
                        break;
                    default:
                        iArr[5] = 100;
                        c = '\t';
                        i5 = 5;
                        iArr2 = iArr;
                        break;
                }
                iArr2[c] = i5;
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[14] = 1;
                if (m340b(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                }
                iArr[9] = iArr[9] - 1;
                if (iArr[8] != 0) {
                }
                cVar.mo36a(i, i2, i3, 0, 0, 0, i4);
                if (iArr[5] > 0) {
                }
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        if (r10.f163a[3] != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0179, code lost:
        if (r10.f163a[3] != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b0, code lost:
        if (r10.f163a[3] != false) goto L_0x00e6;
     */
    /* renamed from: t */
    private boolean mo94t() {
        boolean z;
        boolean z2;
        int[] iArr;
        int i;
        int[] iArr2;
        int i2;
        boolean z3 = true;
        this.f113F[0] = 0;
        this.f113F[1] = 0;
        if (m214c(0)) {
            return true;
        }
        m239h(1);
        m190as();
        m251k(0);
        if (Math.abs(f47c[10]) > 4096) {
            if (f47c[10] < 0) {
                iArr2 = f47c;
                i2 = -4096;
            } else {
                iArr2 = f47c;
                i2 = 4096;
            }
            iArr2[10] = i2;
        }
        Math.abs(f47c[10]);
        if (this.zoneID == 0 || this.zoneID == 3) {
            m194aw();
        }
        if (!f80l) {
            byte b = this.tilesetMaps[(mo48b() >> 8) % this.tilesetMapsHeight][mo33a() >> 8];
            if (this.zoneID == 0) {
                if (b == 31 || b == 32) {
                    int[] iArr3 = f47c;
                    iArr3[10] = iArr3[10] + 12;
                    if (f47c[10] > 4096) {
                        f47c[10] = 4096;
                        z = true;
                    } else {
                        z = true;
                    }
                }
            } else {
                z = this.zoneID == 0 ? false : false;
                z = true;
            }
            if (!z) {
                if (!this.f320s) {
                    if (mo80j()) {
                        f47c[10] = 0;
                        f47c[13] = 0;
                        f47c[14] = 0;
                        if (this.f163a[4]) {
                            m376s();
                        }
                    }
                    if (mo81k()) {
                        f47c[10] = 0;
                        f47c[13] = 0;
                        f47c[14] = 0;
                    }
                } else if (!m326a(mo33a() - 12, mo48b() - 24) || !m326a(mo33a() + 12, mo48b() - 24)) {
                    if (mo76h() || m233f()) {
                        f47c[10] = 0;
                        f47c[13] = 0;
                        f47c[14] = 0;
                        if (this.f163a[4]) {
                            m376s();
                        }
                    }
                    if (mo79i() || mo74g()) {
                        f47c[10] = 0;
                        f47c[13] = 0;
                        f47c[14] = 0;
                    }
                } else {
                    if (m233f()) {
                        f47c[10] = 0;
                        f47c[13] = 0;
                        f47c[14] = 0;
                        if (this.f163a[4]) {
                            m376s();
                        }
                    }
                    if (mo74g()) {
                        f47c[10] = 0;
                        f47c[13] = 0;
                        f47c[14] = 0;
                    }
                }
                m376s();
            }
            int i3 = f47c[0];
            int i4 = f47c[1];
            if (mo87o()) {
                this.f296h[0] = true;
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f211av > 0) {
                if (z2) {
                    f47c[0] = i3;
                    f47c[1] = i4;
                }
            } else if (this.f320s || !z2 || z) {
                if (!(this.zoneID == 0 && (this.tilesetMaps[(mo48b() >> 8) % this.tilesetMapsHeight][mo33a() >> 8] == 31 || this.tilesetMaps[(mo48b() >> 8) % this.tilesetMapsHeight][mo33a() >> 8] == 32))) {
                    z3 = false;
                }
                if (this.zoneID == 2 && (f47c[8] == 365 || f47c[8] == 364 || f47c[8] == 363 || f47c[8] == 362)) {
                    m378u();
                }
                if (!z3) {
                    mo95u();
                }
            } else {
                f47c[0] = i3;
                f47c[1] = i4;
                if (this.zoneID == 0 && Math.abs(f47c[10]) > 2560) {
                    if (f47c[10] < 0) {
                        iArr = f47c;
                        i = -4224;
                    } else {
                        iArr = f47c;
                        i = 4224;
                    }
                    iArr[10] = i;
                }
                f47c[3] = (mo34a(sonicAngle + 90) * f47c[10]) / 100;
                f47c[5] = (mo49b(sonicAngle + 90) * f47c[10]) / 100;
                if ((sonicAngle - 90) % 180 == 0) {
                    if (sonicAngle == 90) {
                        int[] iArr4 = f47c;
                        iArr4[0] = iArr4[0] + 256;
                        if (this.zoneID == 4 && this.actID != 0) {
                            f47c[5] = 0;
                        }
                    } else {
                        int[] iArr5 = f47c;
                        iArr5[0] = iArr5[0] - 256;
                        if (f47c[10] > 3072 && this.zoneID == 4) {
                            this.f211av = 15;
                        }
                    }
                }
                f47c[10] = 0;
                f47c[13] = 0;
                f47c[14] = 0;
                f71h = true;
                f67g = true;
                f52d = false;
                this.f320s = false;
                if (mo84l()) {
                    f47c[5] = 0;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: u */
    private void m278u(int[] iArr) {
        if (mo32a(iArr[2] / 100, (iArr[3] / 100) + 6, 12, 12, false) != 0) {
            m378u();
        }
        switch (iArr[14]) {
            case 1:
                if (iArr[8] == 0) {
                    iArr[8] = 100;
                }
                iArr[5] = 0;
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[14] = 1;
                if (iArr[8] > 998 && iArr[6] >= iArr[8]) {
                    iArr[15] = 4;
                    iArr[5] = 8;
                    iArr[14] = iArr[14] + 1;
                    if (iArr[5] <= 0) {
                        iArr[0] = 0;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (iArr[8] > 998) {
                    iArr[15] = 4;
                    iArr[5] = 8;
                    iArr[14] = iArr[14] + 1;
                    if (iArr[5] <= 0) {
                    }
                    break;
                } else {
                    return;
                }
            case 3:
                if (iArr[5] <= 0) {
                }
                break;
            default:
                iArr[14] = 1;
                if (iArr[8] == 0) {
                }
                iArr[5] = 0;
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[14] = 1;
                if (iArr[8] > 998) {
                }
                break;
        }
    }

    /* renamed from: u */
    private boolean mo95u() {
        int[] iArr;
        int i;
        int[] iArr2;
        int i2;
        if (sonicAngle <= 290 && sonicAngle >= 70) {
            if (sonicAngle < 90 || sonicAngle > 270) {
                if (Math.abs(f47c[10]) < 640) {
                    if (f47c[10] < 0) {
                        iArr = f47c;
                        i = 1;
                    } else {
                        iArr = f47c;
                        i = 0;
                    }
                    iArr[12] = i;
                    f47c[13] = 0;
                    f47c[14] = 0;
                    int abs = Math.abs(f47c[10]);
                    f47c[5] = 280;
                    f47c[3] = (-(abs * mo34a(sonicAngle + 90))) / 100;
                    f67g = true;
                    f52d = false;
                    this.f320s = false;
                    this.f211av = 30;
                    mo84l();
                }
            } else if (Math.abs(f47c[10]) < 640) {
                if (f47c[10] < 0) {
                    iArr2 = f47c;
                    i2 = 1;
                } else {
                    iArr2 = f47c;
                    i2 = 0;
                }
                iArr2[12] = i2;
                f47c[13] = 0;
                f47c[14] = 0;
                int i3 = f47c[10];
                f47c[5] = (mo49b(sonicAngle + 90) * i3) / 100;
                if (sonicAngle > 90 && sonicAngle < 270) {
                    f47c[5] = 0;
                }
                f47c[3] = (i3 * mo34a(sonicAngle + 90)) / 100;
                f67g = true;
                f52d = false;
                this.f320s = false;
                this.f233bJ = 15;
                if (sonicAngle == 90 || sonicAngle == 270) {
                    this.f233bJ = 0;
                }
                mo84l();
            }
        }
        return false;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* renamed from: v */
    private void m280v(int[] iArr) {
        int i;
        int[] iArr2;
        if (mo32a(iArr[2] / 100, (iArr[3] / 100) + (iArr[18] == 0 ? 6 : -6), 10, 12, false) != 0) {
            m378u();
        }
        switch (iArr[14]) {
            case 1:
                if (iArr[8] == 0) {
                    iArr[8] = 64;
                }
                iArr[5] = 0;
                iArr[9] = 0;
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[17] = iArr[3];
                iArr[14] = iArr[14] + 1;
                break;
            case 2:
                break;
            default:
                iArr[14] = 1;
                if (iArr[8] == 0) {
                }
                iArr[5] = 0;
                iArr[9] = 0;
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[17] = iArr[3];
                iArr[14] = iArr[14] + 1;
                break;
        }
        iArr[9] = iArr[9] + 140;
        iArr[15] = this.f302j & 1;
        int i2 = (iArr[9] / 100) % 180;
        iArr[3] = iArr[17] - (Math.abs(mo34a(i2)) * iArr[8]);
        if (i2 < 90) {
            i = 2;
            iArr2 = iArr;
        } else {
            i = 0;
            iArr2 = iArr;
        }
        iArr2[18] = i;
        if (iArr[9] >= 18000) {
            iArr[0] = 0;
        }
    }

    /* renamed from: w */
    private void m281w(int[] iArr) {
        if (mo32a(iArr[2] / 100, (iArr[3] / 100) + 2, 10, 10, false) != 0) {
            m378u();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        if (m340b(iArr[2] / 100, iArr[3] / 100)) {
            iArr[0] = 0;
        }
    }

    /* renamed from: x */
    private static void m282x(int[] iArr) {
        iArr[15] = iArr[8];
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[11] = iArr[11] + 20;
        if (iArr[11] > 800) {
            iArr[11] = 800;
        }
    }

    /* renamed from: y */
    private static void m283y(int[] iArr) {
        int i = (iArr[6] / 4) % 5;
        if (iArr[1] != 2) {
            i += 5;
        }
        m203b(iArr[2] / 100, iArr[3] / 100, 97, i, rotationQuadrants[0]);
    }

    /* renamed from: z */
    private void m284z(int[] iArr) {
        m204b(0, 0, new int[]{0, 16, 32, 16}[this.f302j & 3], 16, 16, new int[]{rotationQuadrants[0], rotationQuadrants[0], rotationQuadrants[0], rotationQuadrants[4]}[this.f302j & 3], iArr[2] / 100, iArr[3] / 100);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        if (m326a(mo33a() + 8, mo48b() - 24) != false) goto L_0x0019;
     */
    /* renamed from: A */
    public final void mo6A() {
        RunnableC0002c cVar;
        if (!this.f115G || !this.f290f[0]) {
            if ((!this.f296h[0] || !this.f296h[3]) && ((f67g && !this.f320s) || !this.f296h[3])) {
                if (this.zoneID == 2 || this.zoneID == 4) {
                    if (this.f320s) {
                        if (m326a(mo33a() - 8, mo48b() - 24)) {
                        }
                    }
                    this.f296h[0] = false;
                    this.f296h[3] = false;
                }
                if (this.f320s && (m326a(mo33a() - 8, mo48b() - 24) || m326a(mo33a() + 8, mo48b() - 24))) {
                    cVar = this;
                    cVar.mo96v();
                }
                this.f296h[0] = false;
                this.f296h[3] = false;
            }
            cVar = this;
            cVar.mo96v();
            this.f296h[0] = false;
            this.f296h[3] = false;
        }
    }

    /* renamed from: B */
    public final void mo7B() {
        this.f296h[3] = true;
        if (f47c[5] < 0) {
            f47c[5] = 0;
        }
    }

    /* renamed from: C */
    public final void mo8C() {
        int[] iArr;
        int i;
        int length;
        int i2;
        RunnableC0002c cVar;
        int i3;
        RunnableC0002c cVar2;
        AudioModule dVar;
        int i4;
        RunnableC0002c cVar3;
        int i5;
        RunnableC0002c cVar4;
        byte b;
        RunnableC0002c cVar5;
        boolean[] zArr;
        boolean z;
        this.f326v = true;
        for (int i6 = 0; i6 < 10; i6++) {
            if (!this.f293g[i6]) {
                zArr = this.f293g;
                z = this.f163a[i6];
            } else if (this.f163a[i6]) {
                zArr = this.f163a;
                z = false;
            } else {
                zArr = this.f293g;
                z = false;
            }
            zArr[i6] = z;
        }
        if (this.f130L) {
            this.f130L = false;
        }
        this.f216b = (byte) ((this.f216b + 1) % 24);
        switch (this.f156a) {
            case 0:
                this.f239bP++;
                if (this.f239bP > 150) {
                    this.f239bP = 0;
                    this.f156a = 11;
                    this.f316q = true;
                    break;
                }
                break;
            case 1:
                this.f239bP++;
                if (this.f239bP > 150) {
                    this.f239bP = 0;
                    mo65d(false);
                    break;
                }
                break;
            case 2:
                if (!this.f163a[4]) {
                    if (!this.f163a[3]) {
                        if (this.f163a[0]) {
                            m365h();
                            mo65d(false);
                            m264o(0);
                            break;
                        }
                    } else {
                        byte[] bArr = this.f311m;
                        bArr[2] = (byte) (bArr[2] - 1);
                        if (this.f311m[2] < 0) {
                            this.f311m[2] = 4;
                        }
                        m162aA();
                        break;
                    }
                } else {
                    byte[] bArr2 = this.f311m;
                    bArr2[2] = (byte) (bArr2[2] + 1);
                    if (this.f311m[2] >= 5) {
                        this.f311m[2] = 0;
                    }
                    m162aA();
                    break;
                }
                break;
            case 3:
                if (this.f121I) {
                    if (this.f276d < 12) {
                        this.f239bP++;
                        if (this.f239bP > 10) {
                            this.f276d = (byte) (this.f276d + 1);
                        }
                    } else {
                        this.f239bP = (byte) ((this.f239bP + 1) % 10);
                    }
                }
                if (this.f276d >= 12) {
                    for (int i7 = 0; i7 < this.f163a.length; i7++) {
                        if (this.f163a[i7]) {
                            this.f156a = 4;
                            m363g();
                            this.f281e = 0;
                            m261n(this.f281e + 11);
                            m264o(2);
                        }
                    }
                }
                if (this.f163a[6]) {
                    this.f156a = 14;
                    this.f281e = 1;
                    break;
                }
                break;
            case 4:
                if (this.f121I) {
                    this.f239bP = (byte) ((this.f239bP + 1) % 5);
                }
                if (this.f163a[4]) {
                    this.f281e = (byte) (this.f281e + 1);
                    if ((this.f115G && this.f281e == 9) || (!this.f115G && this.f281e == 8)) {
                        this.f281e = 0;
                    }
                    m261n(this.f281e + 11);
                }
                if (this.f163a[3]) {
                    this.f281e = (byte) (this.f281e - 1);
                    if (this.f281e < 0) {
                        if (this.f115G) {
                            b = 8;
                            cVar5 = this;
                        } else {
                            b = 7;
                            cVar5 = this;
                        }
                        cVar5.f281e = b;
                    }
                    m261n(this.f281e + 11);
                }
                if (this.f163a[0]) {
                    if (this.f281e == 0) {
                        m175ad();
                        if (this.f291g == 0 && this.f294h == 9) {
                            m357e();
                            this.f316q = true;
                            this.lives = 3;
                            if (this.f115G) {
                                i5 = this.f214ay;
                                cVar4 = this;
                            } else {
                                i5 = 0;
                                cVar4 = this;
                            }
                            cVar4.f308l = i5;
                            this.score = 0;
                            if (this.f215az <= 0) {
                                this.f291g = 0;
                                this.f202am = 0;
                            }
                            this.f201al = 0;
                            this.zoneID = f64f[this.f201al][this.f202am];
                            this.actID = f69g[this.f201al][this.f202am];
                            this.f318r = true;
                            m374p();
                            return;
                        }
                        m264o(1);
                        this.f281e = 1;
                        m261n(this.f281e + 50);
                        this.f156a = 9;
                        return;
                    } else if (this.f281e == 1) {
                        this.f281e = 1;
                        m357e();
                        this.f201al = 0;
                        this.f202am = 0;
                        this.zoneID = f64f[this.f201al][this.f202am];
                        this.actID = f69g[this.f201al][this.f202am];
                        this.f316q = true;
                        this.gameMode = 3;
                        this.f326v = true;
                        this.f204ao = 10;
                        m153a(menuObjGfx);
                        return;
                    } else {
                        if (this.f281e == 2) {
                            this.f281e = 0;
                            this.f286f = 0;
                            this.f156a = 10;
                            gameObjGfx[36] = loadImage("/save.png");
                            gameObjGfx[42] = loadImage("/item.png");
                            this.f159a = new Vector();
                            this.f130L = true;
                            this.f136N = false;
                            f39b = Font.getFont(64, 0, 0);
                        } else if (this.f281e == 3) {
                            this.f156a = 5;
                            m264o(1);
                            this.f286f = 0;
                        } else if (this.f281e == 4) {
                            this.f281e = 0;
                            this.f156a = 8;
                            m261n(this.f281e + 52);
                            m264o(1);
                            this.f130L = true;
                        } else {
                            if (this.f281e == 5) {
                                this.f281e = 0;
                                this.f286f = 0;
                                this.f136N = false;
                                this.f156a = 12;
                            } else if (this.f281e == 6) {
                                this.f281e = 0;
                                this.f156a = 16;
                                m261n(this.f281e + 52);
                                m264o(1);
                                this.f130L = true;
                            } else if (this.f281e == 7) {
                                this.f281e = 0;
                                this.f156a = 17;
                                this.f218b = "";
                                m261n(this.f281e + 52);
                                m264o(4);
                                this.f130L = true;
                            } else if (this.f281e == 8) {
                                this.f281e = 0;
                                this.f156a = 13;
                                this.f214ay = this.f308l;
                            }
                            this.f130L = true;
                        }
                        m264o(1);
                    }
                }
                if (!this.f163a[6]) {
                    m196ay();
                    break;
                } else {
                    m264o(0);
                    this.f156a = 3;
                    this.samplePlayer.playSample(9, 1, false);
                    return;
                }
                break;
            case 5:
                if (this.f163a[6]) {
                    this.f281e = 3;
                    this.f156a = 4;
                    m264o(2);
                    m261n(this.f281e + 11);
                } else if (this.f163a[9]) {
                    this.f281e = 1;
                    this.f156a = 6;
                }
                if (this.f163a[2] && this.f286f > 0) {
                    this.f286f = (byte) (this.f286f - 1);
                    this.f130L = true;
                }
                if (this.f163a[1] && this.f136N) {
                    this.f286f = (byte) (this.f286f + 1);
                    this.f130L = true;
                    break;
                }
            case 6:
                if (!this.f163a[6]) {
                    if (!this.f163a[2] && !this.f163a[1]) {
                        if (this.f163a[0]) {
                            this.f156a = 5;
                            if (this.f281e == 0) {
                                f15C = new int[5];
                                f16D = new int[5];
                                f54d = new String[]{"   ", "   ", "   ", "   ", "   "};
                                m176ae();
                                this.f156a = 7;
                                break;
                            }
                        }
                    } else {
                        this.f281e = (byte) ((this.f281e + 1) % 2);
                        break;
                    }
                } else {
                    this.f156a = 5;
                    break;
                }
                break;
            case 7:
                if (this.f163a[6] || this.f163a[0]) {
                    this.f156a = 5;
                    break;
                }
            case 8:
                if (this.f163a[6] || this.f163a[0]) {
                    this.f156a = 4;
                    m264o(2);
                    this.f281e = 4;
                    m261n(this.f281e + 11);
                    m365h();
                } else {
                    if (this.f163a[2]) {
                        this.f281e = (byte) (this.f281e - 1);
                        if (this.f281e < 0) {
                            this.f281e = 2;
                        }
                        m261n(this.f281e + 52);
                    } else if (this.f163a[1]) {
                        this.f281e = (byte) ((this.f281e + 1) % 3);
                        m261n(this.f281e + 52);
                    } else if (this.f163a[4]) {
                        if (this.f281e == 0) {
                            this.f311m[0] = (byte) ((this.f311m[0] + 1) % 3);
                        } else if (this.f281e == 1) {
                            this.f311m[1] = (byte) ((this.f311m[1] + 1) % 2);
                            this.samplePlayer.m389a((int) this.f311m[1]);
                        }
                        if (this.f281e == 2) {
                            this.f311m[2] = (byte) ((this.f311m[2] + 1) % 5);
                            m162aA();
                            m261n(this.f281e + 52);
                            this.f162a[1] = this.f221b[59];
                        }
                        cVar3 = this;
                        cVar3.f130L = true;
                    } else if (this.f163a[3]) {
                        byte[] bArr3 = this.f311m;
                        byte b2 = this.f281e;
                        bArr3[b2] = (byte) (bArr3[b2] - 1);
                        if (this.f311m[this.f281e] < 0) {
                            if (this.f281e == 0) {
                                this.f311m[0] = 2;
                            } else if (this.f281e == 1) {
                                this.f311m[1] = 1;
                                dVar = this.samplePlayer;
                                i4 = 1;
                                dVar.m389a(i4);
                            } else {
                                this.f311m[2] = 4;
                            }
                        } else if (this.f281e == 1) {
                            dVar = this.samplePlayer;
                            i4 = 0;
                            dVar.m389a(i4);
                        }
                        if (this.f281e == 2) {
                            m162aA();
                            m261n(this.f281e + 52);
                            this.f162a[1] = this.f221b[59];
                        }
                    }
                    cVar3 = this;
                    cVar3.f130L = true;
                }
                m196ay();
                break;
            case 9:
                if (this.f163a[6]) {
                    this.f156a = 4;
                    this.f281e = 0;
                    m261n(this.f281e + 11);
                    m264o(2);
                } else if (this.f163a[2] || this.f163a[1]) {
                    this.f281e = (byte) ((this.f281e + 1) % 2);
                    m261n(this.f281e + 50);
                } else if (this.f163a[0]) {
                    if (this.f281e == 0) {
                        m357e();
                        this.f316q = true;
                        m153a(menuObjGfx);
                        this.lives = 3;
                        if (this.f115G) {
                            i3 = this.f214ay;
                            cVar2 = this;
                        } else {
                            i3 = 0;
                            cVar2 = this;
                        }
                        cVar2.f308l = i3;
                        this.score = 0;
                        this.f291g = 0;
                        this.f201al = 0;
                        i2 = 0;
                        cVar = this;
                    } else if (this.f281e == 1) {
                        m357e();
                        this.f316q = true;
                        m153a(menuObjGfx);
                        this.lives = this.f298i;
                        this.score = this.f266bx;
                        this.f201al = this.f291g / 3;
                        i2 = this.f291g % 3;
                        cVar = this;
                    }
                    cVar.f202am = i2;
                    this.zoneID = f64f[this.f201al][this.f202am];
                    this.actID = f69g[this.f201al][this.f202am];
                    this.f318r = true;
                    m374p();
                }
                m196ay();
                break;
            case 10:
                if (this.f163a[4] && this.f281e < 25) {
                    this.f281e = (byte) (this.f281e + 1);
                    if (this.f281e == 23 || this.f281e == 24) {
                        this.f281e = 25;
                    }
                    this.f286f = 0;
                    this.f130L = true;
                }
                if (this.f163a[3] && this.f281e > 0) {
                    this.f281e = (byte) (this.f281e - 1);
                    if (this.f281e == 23 || this.f281e == 24) {
                        this.f281e = 22;
                    }
                    this.f286f = 0;
                    this.f130L = true;
                }
                if (this.f163a[2] && this.f286f > 0) {
                    this.f286f = (byte) (this.f286f - 1);
                    this.f130L = true;
                }
                if (this.f163a[1] && this.f136N) {
                    this.f286f = (byte) (this.f286f + 1);
                    this.f130L = true;
                }
                if (this.f163a[6]) {
                    this.f281e = 2;
                    this.f156a = 4;
                    gameObjGfx[36] = null;
                    gameObjGfx[42] = null;
                    m264o(2);
                }
                this.f159a = m141a(this.f289f[(this.f281e * 2) + 1]);
                break;
            case 11:
                this.f239bP++;
                if (this.f239bP > 150) {
                    this.f239bP = 0;
                    this.f156a = 1;
                    this.f316q = true;
                    break;
                }
                break;
            case 12:
                if (this.f163a[4] && this.f281e < 5) {
                    this.f286f = 0;
                    this.f281e = (byte) (this.f281e + 1);
                    this.f130L = true;
                }
                if (this.f163a[3] && this.f281e > 0) {
                    this.f286f = 0;
                    this.f281e = (byte) (this.f281e - 1);
                    this.f130L = true;
                }
                if (this.f163a[2] && this.f286f > 0) {
                    this.f286f = (byte) (this.f286f - 1);
                    this.f130L = true;
                }
                if (this.f163a[1] && this.f136N) {
                    this.f286f = (byte) (this.f286f + 1);
                    this.f130L = true;
                }
                if (this.f163a[6]) {
                    this.f281e = 5;
                    this.f156a = 4;
                    m264o(2);
                    break;
                }
                break;
            case 13:
                if (!this.f163a[6] && !this.f163a[0]) {
                    if (!this.f163a[2]) {
                        if (!this.f163a[1]) {
                            if (!this.f163a[4]) {
                                if (this.f163a[3]) {
                                    if (this.f281e == 0) {
                                        this.f290f[0] = !this.f290f[0];
                                    } else if (this.f281e == 1) {
                                        this.f290f[2] = !this.f290f[2];
                                    } else if (this.f281e == 2) {
                                        this.f214ay--;
                                        if (this.f214ay < 0) {
                                            this.f214ay = 6;
                                        }
                                        this.f308l = this.f214ay;
                                    } else if (this.f281e == 3) {
                                        this.f290f[1] = !this.f290f[1];
                                    } else if (this.f281e == 4) {
                                        this.f290f[3] = !this.f290f[3];
                                    } else if (this.f281e == 5) {
                                        this.f290f[4] = !this.f290f[4];
                                    } else if (this.f281e == 6) {
                                        this.gameMode = 8;
                                        this.f173aL = 0;
                                        m363g();
                                    }
                                    this.f130L = true;
                                    break;
                                }
                            } else {
                                if (this.f281e == 0) {
                                    this.f290f[0] = !this.f290f[0];
                                } else if (this.f281e == 1) {
                                    this.f290f[2] = !this.f290f[2];
                                } else if (this.f281e == 2) {
                                    this.f214ay++;
                                    if (this.f214ay > 6) {
                                        this.f214ay = 0;
                                    }
                                    this.f308l = this.f214ay;
                                } else if (this.f281e == 3) {
                                    this.f290f[1] = !this.f290f[1];
                                } else if (this.f281e == 4) {
                                    this.f290f[3] = !this.f290f[3];
                                } else if (this.f281e == 5) {
                                    this.f290f[4] = !this.f290f[4];
                                } else if (this.f281e == 6) {
                                    this.gameMode = 8;
                                    this.f173aL = 0;
                                    m363g();
                                }
                                this.f130L = true;
                                break;
                            }
                        } else {
                            this.f281e = (byte) ((this.f281e + 1) % 7);
                            this.f130L = true;
                            break;
                        }
                    } else {
                        this.f281e = (byte) (this.f281e - 1);
                        if (this.f281e < 0) {
                            this.f281e = 6;
                        }
                        this.f130L = true;
                        break;
                    }
                } else {
                    this.f156a = 4;
                    m264o(2);
                    this.f281e = 8;
                    m261n(this.f281e + 11);
                    break;
                }
                break;
            case 14:
                this.f326v = true;
                this.f281e = (byte) (this.f281e % 2);
                if (!this.f163a[2] && !this.f163a[1]) {
                    if (this.f163a[0]) {
                        if (this.f281e == 0) {
                            this.f160a.notifyDestroyed();
                            break;
                        } else {
                            this.f156a = 3;
                            this.samplePlayer.playSample(9, 1, false);
                            break;
                        }
                    } else if (this.f163a[6]) {
                        this.f156a = 3;
                        this.samplePlayer.playSample(9, 1, false);
                        break;
                    }
                } else {
                    this.f281e = (byte) ((this.f281e + 1) % 2);
                    break;
                }
                break;
            case 16:
                if (this.f163a[6] || this.f163a[0]) {
                    this.f156a = 4;
                    m264o(2);
                    this.f281e = 6;
                    m261n(this.f281e + 11);
                    break;
                }
            case 17:
                if (!this.f163a[6] && !this.f163a[0]) {
                    if (!this.f163a[5]) {
                        if (!this.f163a[3]) {
                            if (this.f163a[4]) {
                                this.f242bS++;
                                if (this.f242bS > 7) {
                                    this.f242bS = 0;
                                    break;
                                }
                            } else {
                                if (this.f163a[2]) {
                                    int[] iArr2 = this.f134M;
                                    int i8 = this.f242bS;
                                    iArr2[i8] = iArr2[i8] + 1;
                                    if (this.f134M[this.f242bS] > f29a.length - 7) {
                                        iArr = this.f134M;
                                        i = this.f242bS;
                                        length = 0;
                                    }
                                } else if (this.f163a[1]) {
                                    int[] iArr3 = this.f134M;
                                    int i9 = this.f242bS;
                                    iArr3[i9] = iArr3[i9] - 1;
                                    if (this.f134M[this.f242bS] < 0) {
                                        iArr = this.f134M;
                                        i = this.f242bS;
                                        length = f29a.length - 7;
                                    }
                                }
                                iArr[i] = length;
                                break;
                            }
                        } else {
                            this.f242bS--;
                            if (this.f242bS < 0) {
                                this.f242bS = 7;
                                break;
                            }
                        }
                    } else {
                        StringBuffer stringBuffer = new StringBuffer(8);
                        for (int i10 = 0; i10 < 8; i10++) {
                            stringBuffer.append(f29a[this.f134M[i10]]);
                        }
                        if (m156a(stringBuffer.toString())) {
                            this.f218b = this.f221b[89];
                            break;
                        } else {
                            this.f218b = this.f221b[88];
                            break;
                        }
                    }
                } else {
                    this.f156a = 4;
                    m264o(2);
                    this.f281e = 7;
                    m261n(this.f281e + 11);
                    break;
                }
                break;
            case 18:
                if (this.f121I) {
                    mo65d(false);
                    this.f156a = (byte) this.f170aG;
                    break;
                }
                break;
        }
        this.f163a[5] = false;
        this.f163a[6] = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x060d  */
    /* renamed from: D */
    public final void mo9D() {
        Graphics graphics;
        Image image;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String[] strArr;
        char c;
        String str;
        int i11;
        int i12;
        switch (this.f156a) {
            case 0:
                screenBuffer.setColor(16777215);
                screenBuffer.fillRect(0, 0, f51d, screenHeight);
                screenBuffer.drawImage(menuObjGfx[0], f51d >> 1, f62f + (f57e >> 1), 3);
                if (this.f239bP < 30) {
                    int i13 = (f51d * this.f239bP) / 30;
                    screenBuffer.fillRect((i13 - f51d) - 10, f73i, f51d, f70h);
                    screenBuffer.fillRect(i13 + 10, f73i, f51d, f70h);
                    int i14 = i13 - 11;
                    screenBuffer.drawLine(i14 + 2, 0, i14 + 2, screenHeight);
                    screenBuffer.drawLine(i14 + 3, 0, i14 + 3, screenHeight);
                    screenBuffer.drawLine(i14 + 5, 0, i14 + 5, screenHeight);
                    screenBuffer.drawLine(i14 + 8, 0, i14 + 8, screenHeight);
                    int i15 = i13 + 10;
                    screenBuffer.drawLine(i15 - 2, 0, i15 - 2, screenHeight);
                    screenBuffer.drawLine(i15 - 3, 0, i15 - 3, screenHeight);
                    screenBuffer.drawLine(i15 - 5, 0, i15 - 5, screenHeight);
                    screenBuffer.drawLine(i15 - 8, 0, i15 - 8, screenHeight);
                    return;
                }
                return;
            case 1:
                screenBuffer.setColor(0);
                screenBuffer.fillRect(0, 0, f51d, screenHeight);
                screenBuffer.drawImage(menuObjGfx[1], f51d >> 1, f62f + (f57e >> 1), 3);
                return;
            case 2:
                screenBuffer.setColor(0);
                screenBuffer.fillRect(0, f62f, f51d, f57e);
                mo10F();
                screenBuffer.setColor(16777215);
                String str2 = this.f221b[this.f164a[2][this.f311m[2]]];
                int stringWidth = f25a.stringWidth(str2);
                int i16 = f62f + (f57e >> 1);
                screenBuffer.drawString(str2, f51d >> 1, i16, 65);
                screenBuffer.drawImage(menuObjGfx[1], (f51d >> 1) + (stringWidth >> 1) + 5, i16, 36);
                screenBuffer.drawImage(menuObjGfx[2], ((f51d >> 1) - (stringWidth >> 1)) - 5, i16, 40);
                return;
            case 3:
                m151a(true, false);
                m195ax();
                mo10F();
                int i17 = f73i + f70h;
                if (this.f276d >= 12) {
                    mo38a(this.f221b[0], f51d >> 1, i17, 16777215, 0);
                    return;
                }
                return;
            case 4:
                m151a(true, false);
                m195ax();
                mo10F();
                int i18 = f73i + f70h;
                if (this.f215az > 0) {
                    this.f221b[2] = this.f221b[70];
                }
                mo38a(this.f221b[this.f281e + 2], f51d >> 1, i18, 16777215, 16386570);
                screenBuffer.drawImage(menuObjGfx[1], f51d - 5, (f22a >> 1) + i18, 6);
                screenBuffer.drawImage(menuObjGfx[2], 2, i18 + (f22a >> 1), 6);
                mo40a(this.f158a, true);
                return;
            case 5:
                int height = screenBuffer.getFont().getHeight();
                m151a(true, true);
                mo10F();
                screenBuffer.setColor(16777215);
                this.f136N = false;
                for (int i19 = this.f286f; i19 < 5; i19++) {
                    if (f62f + 42 + ((i19 - this.f286f) * height) + f22a < f73i + f70h) {
                        screenBuffer.drawString(new StringBuffer().append("").append(i19 + 1).append(" ").append(f54d[i19]).append(" ").append(f15C[i19]).toString(), 6, f62f + 42 + ((i19 - this.f286f) * height), 20);
                        screenBuffer.drawString(this.f221b[f16D[i19] + 31], f51d - 6, f62f + 42 + ((i19 - this.f286f) * height), 24);
                    } else {
                        this.f136N = true;
                    }
                }
                if (this.f286f > 0) {
                    drawSprite(screenBuffer, menuObjGfx[1], 0, 0, menuObjGfx[1].getWidth(), menuObjGfx[1].getHeight(), rotationQuadrants[3], f51d >> 1, 0, 17, true);
                }
                if (this.f136N) {
                    drawSprite(screenBuffer, menuObjGfx[1], 0, 0, menuObjGfx[1].getWidth(), menuObjGfx[1].getHeight(), rotationQuadrants[1], f51d >> 1, f70h - menuObjGfx[1].getHeight(), 17, true);
                }
                int i20 = f73i + f70h;
                mo40a(this.f221b[5], false);
                mo38a(this.f221b[20], f51d >> 1, i20, 16777215, 0);
                return;
            case 6:
                m151a(true, true);
                mo10F();
                screenBuffer.setColor(16777215);
                mo40a(this.f221b[21], false);
                mo39a(this.f221b[24], 2, 0, this.f281e == 0);
                mo39a(this.f221b[25], 2, 1, this.f281e == 1);
                return;
            case 7:
                m151a(true, true);
                mo10F();
                screenBuffer.setColor(16777215);
                screenBuffer.drawString(this.f221b[26], f51d >> 1, (f62f + (f57e >> 1)) - 25, 17);
                screenBuffer.drawString(this.f221b[27], f51d >> 1, f62f + (f57e >> 1) + 2, 17);
                return;
            case 8:
                m151a(true, true);
                screenBuffer.setColor(16777215);
                int[] iArr = new int[3];
                int width = menuObjGfx[1].getWidth();
                menuObjGfx[2].getWidth();
                int i21 = screenWidth - width;
                if (this.f311m[1] > 1) {
                    this.f311m[1] = 1;
                }
                for (int i22 = 0; i22 < this.f164a.length; i22++) {
                    iArr[i22] = screenBuffer.getFont().stringWidth(this.f221b[this.f164a[i22][this.f311m[i22]]]);
                    screenBuffer.drawString(this.f221b[i22 + 28], 11, f73i + 4 + (i22 * 22), 20);
                    screenBuffer.drawString(this.f221b[this.f164a[i22][this.f311m[i22]]], i21, f73i + 4 + (i22 * 22), 24);
                }
                screenBuffer.drawImage(menuObjGfx[1], width + i21, f73i + (this.f281e * 22) + (f22a >> 1), 10);
                screenBuffer.getFont().stringWidth(this.f221b[this.f164a[this.f281e][this.f311m[this.f281e]]]);
                screenBuffer.drawImage(menuObjGfx[2], i21 - iArr[this.f281e], f73i + (this.f281e * 22) + (f22a >> 1), 10);
                mo10F();
                m197az();
                mo40a(this.f221b[6], false);
                return;
            case 9:
                m151a(true, true);
                mo10F();
                screenBuffer.setColor(16777215);
                mo39a(this.f221b[47], 2, 0, this.f281e == 0);
                mo39a(this.f221b[48], 2, 1, this.f281e == 1);
                f25a.stringWidth(this.f221b[this.f281e + 47]);
                m197az();
                return;
            case 10:
                screenBuffer.setFont(f39b);
                int height2 = screenBuffer.getFont().getHeight();
                m151a(true, true);
                mo10F();
                int[] iArr2 = {5, 0, 3, 2, 1, 4};
                if (this.f281e == 25) {
                    graphics = screenBuffer;
                    image = gameObjGfx[36];
                    i = 0;
                    i2 = 16;
                    i3 = 16;
                    i4 = 64;
                    i5 = rotationQuadrants[0];
                    i6 = f51d;
                    i7 = 1;
                } else {
                    if (this.f281e > 10 && this.f281e < 17) {
                        graphics = screenBuffer;
                        image = gameObjGfx[42];
                        i = 0;
                        i2 = iArr2[this.f281e - 11] * 16 * 2;
                        i3 = 32;
                        i4 = 32;
                        i5 = rotationQuadrants[0];
                        i6 = f51d;
                        i7 = 4;
                    }
                    i8 = (f70h + f73i) - height2;
                    i9 = this.f286f;
                    screenBuffer.setColor(16777215);
                    for (i10 = f62f + 42; i10 < i8 && i9 < this.f159a.size(); i10 += height2) {
                        screenBuffer.drawString((String) this.f159a.elementAt(i9), f51d >> 1, i10, 17);
                        i9++;
                    }
                    if (i9 >= this.f159a.size()) {
                        this.f136N = true;
                        drawSprite(screenBuffer, menuObjGfx[1], 0, 0, menuObjGfx[1].getWidth(), menuObjGfx[1].getHeight(), rotationQuadrants[1], f51d >> 1, f70h, 33, true);
                    } else {
                        this.f136N = false;
                    }
                    if (this.f286f > 0) {
                        drawSprite(screenBuffer, menuObjGfx[1], 0, 0, menuObjGfx[1].getWidth(), menuObjGfx[1].getHeight(), rotationQuadrants[3], f51d >> 1, 0, 17, true);
                    }
                    mo40a(this.f289f[this.f281e * 2], false);
                    m258m(24);
                    return;
                }
                drawSprite(graphics, image, i, i2, i3, i4, i5, i6 - i7, f70h - 2, 40, true);
                i8 = (f70h + f73i) - height2;
                i9 = this.f286f;
                screenBuffer.setColor(16777215);
                while (i10 < i8) {
                    screenBuffer.drawString((String) this.f159a.elementAt(i9), f51d >> 1, i10, 17);
                    i9++;
                    break;
                }
                if (i9 >= this.f159a.size()) {
                }
                if (this.f286f > 0) {
                }
                mo40a(this.f289f[this.f281e * 2], false);
                m258m(24);
                return;
            case 11:
                screenBuffer.setColor(16777215);
                screenBuffer.fillRect(0, 0, screenWidth, screenHeight);
                screenBuffer.drawImage(menuObjGfx[2], 0, 0, 20);
                if (this.f239bP >= 120) {
                    screenBuffer.setColor(0);
                    int i23 = ((this.f239bP - 120) * (f51d >> 1)) / 30;
                    for (int i24 = 0; i24 < (i23 << 1); i24 += 2) {
                        screenBuffer.drawLine(i24, 0, i24, screenHeight);
                        screenBuffer.drawLine((f51d - 1) - i24, 0, (f51d - 1) - i24, screenHeight);
                    }
                    return;
                }
                return;
            case 12:
                int i25 = f22a + 2;
                m151a(true, true);
                mo10F();
                switch (this.f311m[2]) {
                    case 0:
                    case 1:
                    case 2:
                        strArr = this.f289f;
                        c = '7';
                        str = "Version 1.0.46";
                        break;
                    case 3:
                        strArr = this.f289f;
                        c = '7';
                        str = "Versión 1.0.46";
                        break;
                    case 4:
                        strArr = this.f289f;
                        c = '7';
                        str = "Versione 1.0.46";
                        break;
                    default:
                        int i26 = f73i + 5;
                        int i27 = (f70h + f73i) - i25;
                        i11 = this.f286f;
                        i12 = (this.f281e * 7) + 52;
                        if (i12 + 6 >= this.f289f.length) {
                            this.f281e = 1;
                        }
                        if (this.f281e >= 0) {
                            screenBuffer.setColor(16777215);
                            while (i26 < i27 && i11 < 5) {
                                if (this.f289f[i12 + 1 + i11] != null) {
                                    screenBuffer.drawString(this.f289f[i12 + 1 + i11], f51d >> 1, i26, 17);
                                }
                                i26 += i25;
                                i11++;
                            }
                        }
                        if (i11 >= 5) {
                            this.f136N = true;
                            drawSprite(screenBuffer, menuObjGfx[1], 0, 0, menuObjGfx[1].getWidth(), menuObjGfx[1].getHeight(), rotationQuadrants[1], f51d >> 1, f70h, 33, true);
                        } else {
                            this.f136N = false;
                        }
                        if (this.f286f > 0) {
                            drawSprite(screenBuffer, menuObjGfx[1], 0, 0, menuObjGfx[1].getWidth(), menuObjGfx[1].getHeight(), rotationQuadrants[3], f51d >> 1, 0, 17, true);
                        }
                        mo40a(this.f289f[i12], false);
                        m258m(6);
                        return;
                }
                strArr[c] = str;
                int i262 = f73i + 5;
                int i272 = (f70h + f73i) - i25;
                i11 = this.f286f;
                i12 = (this.f281e * 7) + 52;
                if (i12 + 6 >= this.f289f.length) {
                }
                if (this.f281e >= 0) {
                }
                if (i11 >= 5) {
                }
                if (this.f286f > 0) {
                }
                mo40a(this.f289f[i12], false);
                m258m(6);
                return;
            case 13:
                m151a(true, true);
                screenBuffer.setColor(16777215);
                int i28 = (f70h - 4) / 22;
                int i29 = 0;
                if (i28 < 7 && this.f281e + 2 > i28) {
                    i29 = (this.f281e - i28) + 1;
                }
                int i30 = ((0 - i29) * 22) + f73i + 4;
                screenBuffer.drawString(this.f221b[81], 11, i30, 20);
                screenBuffer.drawString(this.f221b[this.f290f[0] ? '\"' : '#'], f51d - 10, i30, 24);
                int i31 = i30 + 22;
                screenBuffer.drawString(this.f221b[83], 11, i31, 20);
                screenBuffer.drawString(this.f221b[this.f290f[2] ? '\"' : '#'], f51d - 10, i31, 24);
                int i32 = i31 + 22;
                screenBuffer.drawString(this.f221b[84], 11, i32, 20);
                screenBuffer.drawString(String.valueOf(this.f214ay), f51d - 10, i32, 24);
                int i33 = i32 + 22;
                screenBuffer.drawString(this.f221b[82], 11, i33, 20);
                screenBuffer.drawString(this.f221b[this.f290f[1] ? '\"' : '#'], f51d - 10, i33, 24);
                int i34 = i33 + 22;
                screenBuffer.drawString("COORDS", 11, i34, 20);
                screenBuffer.drawString(this.f221b[this.f290f[3] ? '\"' : '#'], f51d - 10, i34, 24);
                int i35 = i34 + 22;
                screenBuffer.drawString("CAMERA", 11, i35, 20);
                screenBuffer.drawString(this.f221b[this.f290f[4] ? '\"' : '#'], f51d - 10, i35, 24);
                screenBuffer.drawString("PLAY ENDING", 11, i35 + 22, 20);
                screenBuffer.drawImage(menuObjGfx[1], f51d - 8, f73i + ((this.f281e - i29) * 22) + 8, 20);
                screenBuffer.drawImage(menuObjGfx[2], (f51d - f25a.stringWidth(this.f221b[35])) - 12, ((this.f281e - i29) * 22) + f73i + 8, 24);
                mo10F();
                mo40a("CHEATS", false);
                return;
            case 14:
                m151a(true, true);
                mo10F();
                mo40a(this.f221b[85], false);
                mo39a(this.f221b[24], 2, 0, this.f281e == 0);
                mo39a(this.f221b[25], 2, 1, this.f281e == 1);
                return;
            case 15:
            case 18:
            default:
                return;
            case 16:
                mo30Z();
                return;
            case 17:
                mo47aa();
                return;
        }
    }

    /* renamed from: F */
    public final void mo10F() {
        m202b(0, 0, f51d, f73i);
        m202b(0, f73i + f70h, f51d, f73i);
    }

    /* renamed from: G */
    public final void mo11G() {
        this.f259bq = 0;
        this.f260br = -1;
        this.f261bs = 0;
        this.f262bt = 0;
        for (int i = 0; i < 2; i++) {
            int[] iArr = this.f116G;
            int[] iArr2 = f100z;
            int i2 = f98y[i];
            iArr2[i] = i2;
            iArr[i] = i2;
            int[] iArr3 = this.f122I;
            this.f119H[i] = 0;
            iArr3[i] = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d9  */
    /* renamed from: H */
    public final void mo12H() {
        int i;
        RunnableC0002c cVar;
        int[] iArr;
        int i2;
        int[] iArr2;
        int i3;
        int[] iArr3;
        int i4;
        int[] iArr4;
        int i5;
        int i6;
        int[] iArr5;
        int i7;
        int i8 = 16;
        int i9 = 4;
        int a = mo33a();
        int b = mo48b();
        if (this.f261bs > 0) {
            this.f261bs--;
            if (this.f261bs == 0) {
                this.f260br = -1;
                this.f262bt = 0;
            }
        }
        if (this.f260br >= 0) {
            i = this.f260br;
            cVar = this;
        } else {
            this.f262bt = 0;
            if (!this.f322t && !this.f324u) {
                switch (this.zoneID) {
                    case 0:
                        i = 1;
                        cVar = this;
                        break;
                    case 2:
                        this.f259bq = 1;
                    case 4:
                        this.f259bq = 1;
                        if (this.actID == 1 && Math.abs(a - 8464) < 240 && Math.abs(b - 640) < 80) {
                            i = 2;
                            cVar = this;
                            break;
                        }
                }
                switch (this.f259bq) {
                    case 1:
                        this.f122I[0] = 0;
                        iArr2 = this.f122I;
                        i3 = 0;
                        break;
                    case 2:
                        this.f122I[0] = 0;
                        iArr2 = this.f122I;
                        i3 = 32;
                        break;
                    case 3:
                        iArr = this.f122I;
                        i2 = 0;
                        iArr[0] = i2;
                        iArr2 = this.f122I;
                        i3 = 40;
                        break;
                    case 4:
                        if (f47c[5] <= 0) {
                            this.f122I[0] = 0;
                            iArr2 = this.f122I;
                            i3 = 0;
                            break;
                        } else {
                            this.f122I[0] = 0;
                            iArr2 = this.f122I;
                            i3 = 48;
                            break;
                        }
                    case 5:
                        this.f122I[0] = 0;
                        iArr2 = this.f122I;
                        i3 = -16;
                        break;
                    case 6:
                        this.f122I[0] = 0;
                        iArr2 = this.f122I;
                        i3 = 0;
                        break;
                    case 7:
                        this.f122I[0] = 0;
                        iArr2 = this.f122I;
                        i3 = 16;
                        break;
                    case 8:
                        this.f122I[0] = 0;
                        iArr2 = this.f122I;
                        i3 = -32;
                        break;
                    case 9:
                        this.f122I[0] = 36;
                        iArr2 = this.f122I;
                        i3 = 16;
                        break;
                    case 10:
                        iArr = this.f122I;
                        i2 = 32;
                        iArr[0] = i2;
                        iArr2 = this.f122I;
                        i3 = 40;
                        break;
                    default:
                        f100z[0] = f98y[0];
                        iArr2 = f100z;
                        i3 = f98y[1];
                        break;
                }
                iArr2[1] = i3;
                int abs = Math.abs(f98y[0] - this.f116G[0]);
                int abs2 = Math.abs(f98y[1] - this.f116G[1]);
                if (this.f259bq != 6) {
                    if (abs < 4 || abs > 256) {
                        iArr5 = this.f116G;
                        i7 = f98y[0];
                    } else {
                        iArr5 = this.f116G;
                        i7 = (f98y[0] > this.f116G[0] ? 4 : -4) + iArr5[0];
                    }
                    iArr5[0] = i7;
                    if (abs2 < 4 || abs2 > 256) {
                        iArr4 = this.f116G;
                        i5 = f98y[1];
                    } else {
                        iArr4 = this.f116G;
                        int i10 = iArr4[1];
                        if (f98y[1] <= this.f116G[1]) {
                            i9 = -4;
                        }
                        i5 = i10 + i9;
                    }
                } else {
                    if (abs < 32 || abs > 256) {
                        iArr3 = this.f116G;
                        i4 = f98y[0];
                    } else {
                        iArr3 = this.f116G;
                        i4 = (f98y[0] > this.f116G[0] ? 32 : -32) + iArr3[0];
                    }
                    iArr3[0] = i4;
                    if (abs2 < 16 || abs2 > 256) {
                        iArr4 = this.f116G;
                        i5 = f98y[1];
                    } else if (abs2 > 32) {
                        this.f116G[1] = f98y[1] > this.f116G[1] ? this.f116G[1] + 32 : this.f116G[1] - 32;
                        if (this.f119H[0] != this.f122I[0]) {
                            int[] iArr6 = this.f119H;
                            iArr6[0] = (this.f119H[0] < this.f122I[0] ? 1 : -1) + iArr6[0];
                        }
                        f100z[0] = this.f116G[0] + this.f119H[0];
                        if (this.f119H[1] != this.f122I[1]) {
                            int[] iArr7 = this.f119H;
                            iArr7[1] = (this.f119H[1] < this.f122I[1] ? 1 : -1) + iArr7[1];
                        }
                        f100z[1] = this.f116G[1] + this.f119H[1];
                        int i11 = this.f250bh > 0 ? (this.f250bh << 1) + 0 : 0;
                        if (this.f249bg > 0) {
                            i11 -= this.f249bg << 1;
                        }
                        i6 = this.f128K[3] - i11;
                        if (f100z[1] > i6) {
                            f100z[1] = i6;
                        }
                        if (f100z[0] < 0) {
                            f100z[0] = 0;
                            return;
                        }
                        return;
                    } else {
                        iArr4 = this.f116G;
                        int i12 = iArr4[1];
                        if (f98y[1] <= this.f116G[1]) {
                            i8 = -16;
                        }
                        i5 = i12 + i8;
                    }
                }
                iArr4[1] = i5;
                if (this.f119H[0] != this.f122I[0]) {
                }
                f100z[0] = this.f116G[0] + this.f119H[0];
                if (this.f119H[1] != this.f122I[1]) {
                }
                f100z[1] = this.f116G[1] + this.f119H[1];
                if (this.f250bh > 0) {
                }
                if (this.f249bg > 0) {
                }
                i6 = this.f128K[3] - i11;
                if (f100z[1] > i6) {
                }
                if (f100z[0] < 0) {
                }
            } else if (this.zoneID != 5 || f98y[0] >= 1024) {
                i = 6;
                cVar = this;
            } else {
                i = 1;
                cVar = this;
            }
        }
        cVar.f259bq = i;
        switch (this.f259bq) {
        }
        iArr2[1] = i3;
        int abs3 = Math.abs(f98y[0] - this.f116G[0]);
        int abs22 = Math.abs(f98y[1] - this.f116G[1]);
        if (this.f259bq != 6) {
        }
        iArr4[1] = i5;
        if (this.f119H[0] != this.f122I[0]) {
        }
        f100z[0] = this.f116G[0] + this.f119H[0];
        if (this.f119H[1] != this.f122I[1]) {
        }
        f100z[1] = this.f116G[1] + this.f119H[1];
        if (this.f250bh > 0) {
        }
        if (this.f249bg > 0) {
        }
        i6 = this.f128K[3] - i11;
        if (f100z[1] > i6) {
        }
        if (f100z[0] < 0) {
        }
    }

    /* renamed from: I */
    public final void mo13I() {
        int i;
        RunnableC0002c cVar;
        int i2;
        RunnableC0002c cVar2;
        if (!this.f145T || this.f226bC <= 0) {
            if (this.f147U) {
                if (this.f227bD < 0) {
                    this.f105C = false;
                    this.f147U = false;
                    this.f145T = false;
                    this.f102B = 0;
                    this.f104C = 0;
                    this.f106D = 0;
                    this.f108E = 0;
                    this.f153Y = false;
                    this.f202am++;
                    this.f202am %= 3;
                    if (this.f202am == 0) {
                        m322a(true);
                    }
                    this.f291g = (byte) (this.f202am + (this.f201al * 3));
                    this.f298i = (byte) this.lives;
                    this.f266bx = this.score;
                    if (this.f301j < this.f291g) {
                        this.f301j = this.f291g;
                    }
                    m174ac();
                    this.zoneID = f64f[this.f201al][this.f202am];
                    this.actID = f69g[this.f201al][this.f202am];
                    m164aC();
                    if (this.zoneID == 0 && this.actID == 0) {
                        this.gameMode = 8;
                        this.f173aL = 0;
                        m363g();
                    } else {
                        this.f318r = true;
                        m181aj();
                        if (this.f127K) {
                            this.gameMode = 7;
                            this.f171aJ = 0;
                        } else {
                            m374p();
                        }
                    }
                } else {
                    this.f227bD--;
                    if (this.f227bD == 10) {
                        this.samplePlayer.playSample(19, 1, false);
                    }
                    if (this.f228bE - this.f227bD > 0) {
                        for (int i3 = 0; i3 < 20; i3++) {
                            if (this.f230bG > 0) {
                                this.f230bG -= 10;
                                mo37a(10, false);
                            }
                            if (this.f229bF > 0) {
                                this.f229bF -= 10;
                                mo37a(10, false);
                            }
                        }
                    }
                }
            }
            if (this.f145T) {
                this.f105C = true;
                f47c[12] = 0;
                int[] iArr = f47c;
                iArr[10] = iArr[10] + 128;
            } else {
                this.f161a = true;
            }
            for (int i4 = 0; i4 < this.f297h.length; i4++) {
                if (this.f297h[i4][0] == 1 && this.f246bd >= this.f297h[i4][9]) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 6) {
                            break;
                        }
                        if (this.f310m + this.f297h[i4][8] > this.f297h[i4][2]) {
                            int[] iArr2 = this.f297h[i4];
                            iArr2[2] = iArr2[2] + 1;
                        } else if (this.f310m + this.f297h[i4][8] < this.f297h[i4][2]) {
                            int[] iArr3 = this.f297h[i4];
                            iArr3[2] = iArr3[2] - 1;
                        } else {
                            this.f246bd++;
                            this.f297h[i4][0] = 2;
                            if (this.f246bd >= 5) {
                                if (this.f145T) {
                                    m368j();
                                    this.f147U = true;
                                    this.invincibilityTimer = -1;
                                    this.f229bF = this.rings * 100;
                                    this.f230bG = 0;
                                    if (this.f330x < 30 && this.f332y == 0 && !this.f153Y) {
                                        i = 50000;
                                        cVar = this;
                                    } else if (this.f330x < 45 && this.f332y == 0) {
                                        i = 10000;
                                        cVar = this;
                                    } else if (this.f332y < 1) {
                                        i = 5000;
                                        cVar = this;
                                    } else if (this.f330x < 30 && this.f332y == 1) {
                                        i = 4000;
                                        cVar = this;
                                    } else if (this.f332y < 2) {
                                        i = 3000;
                                        cVar = this;
                                    } else if (this.f330x >= 30 || this.f332y != 2) {
                                        i = 1000;
                                        cVar = this;
                                    } else {
                                        i = 2000;
                                        cVar = this;
                                    }
                                    cVar.f230bG = i;
                                    if (this.f230bG > this.f229bF) {
                                        i2 = this.f230bG;
                                        cVar2 = this;
                                    } else {
                                        i2 = this.f229bF;
                                        cVar2 = this;
                                    }
                                    cVar2.f228bE = i2 / 120;
                                    this.f227bD = 330;
                                } else {
                                    m368j();
                                    if (this.f318r) {
                                        m180ai();
                                        this.f318r = false;
                                        this.f102B = 0;
                                        this.f104C = 0;
                                        this.f106D = 0;
                                        this.f108E = 0;
                                        this.f153Y = false;
                                        m182ak();
                                    } else {
                                        m193av();
                                        m182ak();
                                    }
                                }
                            }
                        }
                        i5++;
                    }
                }
                if (this.gameMode == 2 && !this.f145T) {
                    this.f246bd++;
                    this.f161a = false;
                    if (this.f246bd < 20) {
                        m363g();
                    } else if (this.f246bd < 30) {
                        int[] iArr4 = this.f297h[0];
                        iArr4[2] = iArr4[2] + (f51d / 20);
                        int[] iArr5 = this.f297h[1];
                        iArr5[2] = iArr5[2] + (f51d / 20);
                        int[] iArr6 = this.f297h[2];
                        iArr6[2] = iArr6[2] + (f51d / 20);
                        int[] iArr7 = this.f297h[3];
                        iArr7[2] = iArr7[2] - (f51d / 20);
                        int[] iArr8 = this.f297h[4];
                        iArr8[2] = iArr8[2] - (f51d / 20);
                        m363g();
                    } else if (this.f246bd == 30) {
                        this.f297h[0][0] = 0;
                        this.f297h[1][0] = 0;
                        this.f297h[2][0] = 0;
                        this.f297h[3][0] = 0;
                        this.f297h[4][0] = 0;
                    }
                }
            }
            return;
        }
        this.f226bC--;
    }

    /* renamed from: J */
    public final void mo14J() {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = i2;
            if (i3 >= this.f297h.length) {
                break;
            }
            if (this.f297h[i3][0] >= 1) {
                if (uiObjGfx[10] != null) {
                    drawSprite(screenBuffer, uiObjGfx[10], this.f297h[i3][4], this.f297h[i3][5], this.f297h[i3][6], this.f297h[i3][7], rotationQuadrants[0], this.f297h[i3][2], this.f297h[i3][3], 20, true);
                }
                if (i < this.f297h[i3][3]) {
                    i = this.f297h[i3][3];
                }
            }
            i2 = i;
            i3++;
        }
        if (this.f147U) {
            int[] iArr = {this.score, this.f230bG, this.f229bF};
            int i4 = ((screenWidth * 30) / 100) - 24;
            int i5 = ((screenWidth * 90) / 100) - 24;
            int i6 = i + 10;
            for (int i7 = 0; i7 < 3; i7++) {
                drawSprite(screenBuffer, uiObjGfx[13], 0, i7 * 16, 84, 16, rotationQuadrants[0], i4, (i7 * 16) + i6, 20, true);
                m244i(i5, (((i7 * 16) + i6) - 36) + 40, iArr[i7]);
            }
            if (this.f230bG == 0 && this.f229bF == 0) {
                mo38a(this.f221b[0], f51d >> 1, ((f73i + f70h) - f22a) - 2, 16777215, 0);
            }
        }
    }

    /* renamed from: K */
    public final void mo15K() {
        this.f300i = (int[][]) Array.newInstance(Integer.TYPE, 50, 20);
    }

    /* renamed from: L */
    public final void mo16L() {
        int i;
        char c;
        for (int i2 = 0; i2 < 50; i2++) {
            int[] iArr = this.f300i[i2];
            if (iArr[0] > 0) {
                if (iArr[6] > 600) {
                    i = 0;
                    c = 0;
                } else {
                    mo71e(iArr);
                    if (iArr[5] > 0) {
                        iArr[5] = iArr[5] - 1;
                    }
                    i = iArr[6] + 1;
                    c = 6;
                }
                iArr[c] = i;
            }
        }
    }

    /* renamed from: M */
    public final void mo17M() {
        for (int i = 0; i < 50; i++) {
            int[] iArr = this.f300i[i];
            if (iArr[0] > 0) {
                switch (iArr[1]) {
                    case 1:
                    case 2:
                    case 3:
                        m283y(iArr);
                        continue;
                    case 4:
                        m284z(iArr);
                        continue;
                    case 5:
                        m120A(iArr);
                        continue;
                    case 6:
                        m121B(iArr);
                        continue;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        m122C(iArr);
                        continue;
                    case 14:
                        m123D(iArr);
                        continue;
                    case 15:
                        m125E(iArr);
                        continue;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        m126F(iArr);
                        continue;
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        m127G(iArr);
                        continue;
                    case 26:
                        m128H(iArr);
                        continue;
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                        m130J(iArr);
                        continue;
                }
            }
        }
    }

    /* renamed from: N */
    public final void mo18N() {
        Image[] imageArr;
        char c;
        gameObjGfx[120] = null;
        switch (this.zoneID) {
            case 0:
                imageArr = gameObjGfx;
                c = 'y';
                break;
            case 1:
            default:
                return;
            case 2:
                imageArr = gameObjGfx;
                c = 131;
                break;
        }
        imageArr[c] = null;
    }

    /* renamed from: O */
    public final void mo19O() {
        this.f324u = true;
        this.f322t = false;
        this.f265bw = 1;
        if (this.zoneID != 5) {
            mo70e(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: P */
    public final void mo20P() {
        int i;
        int[] iArr = this.objData;
        this.f146U = 0;
        this.f148V = mo34a(this.f139P / 100) * 8;
        m360e(iArr);
        if (m348c()) {
            m218d(iArr[2], iArr[3]);
            if (this.f188aa == 0 && this.f129L < 100) {
                int i2 = this.f194ae - 1;
                this.f194ae = i2;
                if (i2 <= 0) {
                    this.f129L = 100;
                    return;
                }
                this.f192ac = 3;
                this.f193ad = 60;
                this.f188aa = 60;
            }
        }
        if (this.f129L < 100) {
            int i3 = this.f137O / 100;
            while (i3 < 0) {
                i3 += 360;
            }
            int a = ((mo34a(i3) * 90) / 100) + 180;
            if (mo31a(((this.f143S + this.f146U) / 100) + ((mo34a(a) * this.f141Q) / 100) + framedata[120][15][4] + this.xPos, ((mo49b(a) * this.f141Q) / 100) + ((this.f144T + this.f148V) / 100) + framedata[120][15][5] + this.yPos, 36)) {
                m378u();
                this.f192ac = 1;
                this.f193ad = 60;
            }
        }
        switch (this.f129L) {
            case 1:
                this.f143S = 10000;
                this.f144T = -12000;
                this.f141Q = -32;
                this.f142R = -100;
                this.f137O = 0;
                this.f139P = 0;
                this.f152Y = 80;
                this.f129L++;
                this.f132M = 0;
                this.f144T += 80;
                if (this.f144T >= 0) {
                    this.f144T = 0;
                    this.f152Y = 100;
                    this.f129L++;
                    this.f132M = 2;
                    this.f143S -= 100;
                    if (this.f152Y > 0) {
                        this.f129L++;
                        this.f132M = 1;
                        i = this.f141Q + 1;
                        this.f141Q = i;
                        if (i < 96) {
                            this.f152Y = 32;
                            this.f129L++;
                            this.f132M = 2;
                            this.f143S -= 50;
                            this.f137O += this.f142R;
                            this.f139P += 100;
                            if (this.f143S > -3200) {
                                this.f143S = -3200;
                                this.f129L = 6;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.f132M = 0;
                this.f144T += 80;
                if (this.f144T >= 0) {
                }
                break;
            case 3:
                this.f132M = 2;
                this.f143S -= 100;
                if (this.f152Y > 0) {
                }
                break;
            case 4:
                this.f132M = 1;
                i = this.f141Q + 1;
                this.f141Q = i;
                if (i < 96) {
                }
                break;
            case 5:
                this.f132M = 2;
                this.f143S -= 50;
                this.f137O += this.f142R;
                this.f139P += 100;
                if (this.f143S > -3200) {
                }
                break;
            case 6:
                this.f132M = 2;
                this.f143S -= 100;
                this.f137O += this.f142R;
                this.f139P += 100;
                if (this.f143S <= -3200) {
                    this.f143S = -3200;
                    this.f129L++;
                    this.f132M = 0;
                    this.f135N = 1;
                    this.f139P += 100;
                    if (this.f142R >= 0) {
                        this.f137O += this.f142R;
                        if (this.f137O < -9000) {
                            this.f142R = -this.f142R;
                            this.f137O = -9000;
                            return;
                        }
                        return;
                    }
                    this.f137O += this.f142R;
                    if (this.f137O >= 9000) {
                        this.f137O = 9000;
                        this.f142R = -this.f142R;
                        this.f152Y = 64;
                        this.f129L++;
                        this.f132M = 2;
                        this.f143S += 100;
                        this.f137O += this.f142R;
                        this.f139P += 100;
                        if (this.f143S >= 3200 && this.f152Y <= 0) {
                            this.f143S = 3200;
                            this.f129L++;
                            this.f132M = 0;
                            this.f135N = 0;
                            this.f139P += 100;
                            if (this.f142R <= 0) {
                                this.f137O += this.f142R;
                                if (this.f137O > 9000) {
                                    this.f142R = -this.f142R;
                                    this.f137O = 9000;
                                    return;
                                }
                                return;
                            }
                            this.f137O += this.f142R;
                            if (this.f137O <= -9000) {
                                this.f137O = -9000;
                                this.f142R = -this.f142R;
                                this.f152Y = 64;
                                this.f129L = 6;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                this.f132M = 0;
                this.f135N = 1;
                this.f139P += 100;
                if (this.f142R >= 0) {
                }
                break;
            case 8:
                this.f132M = 2;
                this.f143S += 100;
                this.f137O += this.f142R;
                this.f139P += 100;
                if (this.f143S >= 3200) {
                    return;
                }
                return;
            case 9:
                this.f132M = 0;
                this.f135N = 0;
                this.f139P += 100;
                if (this.f142R <= 0) {
                }
                break;
            case 100:
                this.f132M = 3;
                this.f152Y = 40;
                this.f129L++;
                if (this.f152Y > 0) {
                    this.f152Y = 180;
                    this.f129L++;
                    if (this.f141Q > 0) {
                        this.f141Q--;
                    }
                    if (this.f152Y > 0) {
                        this.f132M = 4;
                        this.f152Y = 80;
                        this.f129L++;
                        this.f132M = 4;
                        this.f144T += 200;
                        mo61c(iArr);
                        if (iArr[3] < f53d[this.zoneID]) {
                            this.f152Y = 40;
                            this.f129L++;
                            if (this.f152Y > 0) {
                                mo19O();
                                this.f152Y = 16;
                                this.f129L++;
                                this.f132M = 5;
                                this.f135N = 1;
                                this.f143S += 200;
                                this.f144T -= 50;
                                if (this.f152Y > 0) {
                                    this.f152Y = 120;
                                    this.f129L++;
                                    this.f132M = 6;
                                    this.f135N = 1;
                                    this.f143S += 600;
                                    this.f144T -= 50;
                                    if (this.f152Y > 0) {
                                        this.f129L++;
                                        this.f132M = -1;
                                        this.objData[0] = 0;
                                        mo18N();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 101:
                if (this.f152Y > 0) {
                }
                break;
            case 102:
                if (this.f141Q > 0) {
                }
                if (this.f152Y > 0) {
                }
                break;
            case 103:
                this.f132M = 4;
                this.f144T += 200;
                mo61c(iArr);
                if (iArr[3] < f53d[this.zoneID]) {
                }
                break;
            case 104:
                if (this.f152Y > 0) {
                }
                break;
            case 105:
                this.f132M = 5;
                this.f135N = 1;
                this.f143S += 200;
                this.f144T -= 50;
                if (this.f152Y > 0) {
                }
                break;
            case 106:
                this.f132M = 6;
                this.f135N = 1;
                this.f143S += 600;
                this.f144T -= 50;
                if (this.f152Y > 0) {
                }
                break;
            case 107:
                this.f132M = -1;
                this.objData[0] = 0;
                mo18N();
                return;
            default:
                this.f129L = 1;
                this.f143S = 10000;
                this.f144T = -12000;
                this.f141Q = -32;
                this.f142R = -100;
                this.f137O = 0;
                this.f139P = 0;
                this.f152Y = 80;
                this.f129L++;
                this.f132M = 0;
                this.f144T += 80;
                if (this.f144T >= 0) {
                }
                break;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: Q */
    public final void mo21Q() {
        int i;
        int[] iArr = this.objData;
        if (!m360e(this.objData)) {
            this.f139P += 100;
            this.f146U = 0;
            this.f148V = mo34a(this.f139P / 100) * 10;
            if (this.f129L <= 99) {
                if (m348c() && this.f129L > 3) {
                    m218d(iArr[2], iArr[3]);
                    if (this.f188aa == 0 && this.f129L < 100) {
                        int i2 = this.f194ae - 1;
                        this.f194ae = i2;
                        if (i2 <= 0) {
                            this.f120I = 0;
                            this.f129L = 100;
                            return;
                        }
                        this.f192ac = 3;
                        this.f193ad = 60;
                        this.f188aa = 60;
                        this.f190ab = 20;
                    }
                }
                if (this.f120I > 0) {
                    int i3 = this.f120I - 1;
                    this.f120I = i3;
                    if (i3 == 0) {
                        this.f120I = getRandomInt(150) + 150;
                        mo36a(16, (this.xPos + getRandomInt(40)) - 20, this.yPos + 130, 0, -300, 0, 1);
                    }
                }
                switch (this.f129L) {
                    case 1:
                        this.f192ac = 0;
                        this.f132M = 2;
                        this.f143S = 31200;
                        this.f144T = 4800;
                        this.f137O = 0;
                        this.f139P = 0;
                        this.f120I = 0;
                        this.f152Y = 30;
                        this.f129L++;
                        if (this.f152Y <= 0) {
                            this.f129L++;
                            this.f132M = 2;
                            this.f143S -= 150;
                            this.f144T -= 20;
                            if (this.f143S <= 10400 && this.f152Y <= 0) {
                                this.f143S = 10400;
                                this.f132M = 0;
                                this.f192ac = 1;
                                this.f193ad = 60;
                                this.f152Y = 60;
                                this.f120I = 120;
                                i = this.f129L + 1;
                                this.f129L = i;
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        if (this.f152Y <= 0) {
                        }
                        break;
                    case 3:
                        this.f132M = 2;
                        this.f143S -= 150;
                        this.f144T -= 20;
                        if (this.f143S <= 10400) {
                            return;
                        }
                        return;
                    case 4:
                        this.f132M = 2;
                        this.f135N = 0;
                        this.f129L++;
                        this.f132M = 2;
                        this.f135N = 0;
                        this.f143S -= 150;
                        this.f144T -= 12;
                        if (this.f143S > -10400) {
                            this.f143S = -10400;
                            this.f129L++;
                            this.f144T += 50;
                            if (this.f144T <= 1200) {
                                this.f144T = 1200;
                                this.f129L++;
                                this.f192ac = 1;
                                this.f193ad = 60;
                                this.f152Y = 48;
                                this.f129L++;
                                if (this.f152Y == 8) {
                                    mo36a(17, iArr[2], iArr[3] + 16, 0, 0, 0, 0);
                                }
                                if (this.f152Y <= 0) {
                                    mo61c(iArr);
                                    i = this.f129L + 1;
                                    this.f129L = i;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f132M = 2;
                        this.f135N = 0;
                        this.f143S -= 150;
                        this.f144T -= 12;
                        if (this.f143S > -10400) {
                        }
                        break;
                    case 6:
                        this.f144T += 50;
                        if (this.f144T <= 1200) {
                        }
                        break;
                    case 7:
                        this.f192ac = 1;
                        this.f193ad = 60;
                        this.f152Y = 48;
                        this.f129L++;
                        if (this.f152Y == 8) {
                        }
                        if (this.f152Y <= 0) {
                        }
                        break;
                    case 8:
                        if (this.f152Y == 8) {
                        }
                        if (this.f152Y <= 0) {
                        }
                        break;
                    case 9:
                        this.f132M = 2;
                        this.f135N = 1;
                        this.f129L++;
                        this.f132M = 2;
                        this.f135N = 1;
                        this.f143S += 150;
                        this.f144T -= 12;
                        if (this.f143S < 10400) {
                            this.f143S = 10400;
                            this.f129L++;
                            this.f144T += 50;
                            if (this.f144T <= 1200) {
                                this.f144T = 1200;
                                this.f129L++;
                                this.f192ac = 1;
                                this.f193ad = 60;
                                this.f152Y = 48;
                                this.f129L++;
                                if (this.f152Y == 8) {
                                    mo36a(17, iArr[2], iArr[3] + 16, 0, 0, 0, 0);
                                }
                                if (this.f152Y <= 0) {
                                    mo61c(iArr);
                                    this.f129L++;
                                    this.f144T -= 100;
                                    if (this.f144T > 0) {
                                        this.f144T = 0;
                                        i = 4;
                                        this.f129L = i;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 10:
                        this.f132M = 2;
                        this.f135N = 1;
                        this.f143S += 150;
                        this.f144T -= 12;
                        if (this.f143S < 10400) {
                        }
                        break;
                    case 11:
                        this.f144T += 50;
                        if (this.f144T <= 1200) {
                        }
                        break;
                    case 12:
                        this.f192ac = 1;
                        this.f193ad = 60;
                        this.f152Y = 48;
                        this.f129L++;
                        if (this.f152Y == 8) {
                        }
                        if (this.f152Y <= 0) {
                        }
                        break;
                    case 13:
                        if (this.f152Y == 8) {
                        }
                        if (this.f152Y <= 0) {
                        }
                        break;
                    case 14:
                        this.f144T -= 100;
                        if (this.f144T > 0) {
                        }
                        break;
                    default:
                        this.f129L = 1;
                        this.f192ac = 0;
                        this.f132M = 2;
                        this.f143S = 31200;
                        this.f144T = 4800;
                        this.f137O = 0;
                        this.f139P = 0;
                        this.f120I = 0;
                        this.f152Y = 30;
                        this.f129L++;
                        if (this.f152Y <= 0) {
                        }
                        break;
                }
            } else if (m339b()) {
                iArr[0] = 0;
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: R */
    public final void mo22R() {
        RunnableC0002c cVar;
        int i;
        RunnableC0002c cVar2;
        boolean z = true;
        if (this.f191ab) {
            if (this.f186aY > 0 && this.f181aT < 4) {
                this.f186aY--;
            }
            switch (this.f181aT) {
                case 1:
                    this.f182aU = this.f187aZ;
                    this.f183aV = 0;
                    this.f186aY = 604;
                    this.f184aW = -1;
                    this.f185aX = -1;
                    gameObjGfx[121] = loadImage("/continue.png");
                    this.samplePlayer.playSample(15, -1, false);
                    i = 2;
                    cVar2 = this;
                    cVar2.f181aT = i;
                    break;
                case 2:
                    this.f184aW = 0;
                    this.f183aV += 4;
                    if (this.f183aV >= this.f243ba) {
                        this.f183aV = this.f243ba;
                        this.f184aW = 1;
                        i = 3;
                        cVar2 = this;
                        cVar2.f181aT = i;
                        break;
                    }
                    break;
                case 3:
                    if (this.f186aY == 0) {
                        z = false;
                        cVar = this;
                        cVar.m231f(z);
                        i = 999;
                        cVar2 = this;
                        cVar2.f181aT = i;
                        break;
                    } else if (this.f163a[0]) {
                        this.f184aW = 2;
                        this.f185aX = 0;
                        m357e();
                        i = 4;
                        cVar2 = this;
                        cVar2.f181aT = i;
                    }
                    break;
                case 4:
                    this.f185aX++;
                    if (this.f185aX > 8) {
                        this.f182aU++;
                    }
                    if (this.f185aX > 12) {
                        this.f182aU += 20;
                    }
                    if (this.f185aX >= 45) {
                        i = 5;
                        cVar2 = this;
                        cVar2.f181aT = i;
                        break;
                    }
                    break;
                case 5:
                    this.samplePlayer.mo104b();
                    cVar = this;
                    cVar.m231f(z);
                    i = 999;
                    cVar2 = this;
                    cVar2.f181aT = i;
                    break;
                case 999:
                    break;
                default:
                    this.f181aT = 1;
                    this.f182aU = this.f187aZ;
                    this.f183aV = 0;
                    this.f186aY = 604;
                    this.f184aW = -1;
                    this.f185aX = -1;
                    gameObjGfx[121] = loadImage("/continue.png");
                    this.samplePlayer.playSample(15, -1, false);
                    i = 2;
                    cVar2 = this;
                    cVar2.f181aT = i;
                    break;
            }
            this.f191ab = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0081  */
    /* renamed from: S */
    public final void mo23S() {
        int i;
        int i2;
        short s;
        short s2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        short s3;
        short s4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        short s5;
        short s6;
        this.f191ab = true;
        int i13 = f70h >> 1;
        int i14 = i13 + 8;
        int i15 = f70h >> 2;
        int i16 = f51d >> 1;
        screenBuffer.setColor(0);
        screenBuffer.setClip(0, f73i, f51d, f70h);
        screenBuffer.fillRect(0, f73i, f51d, f70h);
        if (gameObjGfx[121] != null && this.f181aT != 1) {
            if (this.f184aW == 0) {
                m146a(121, 0, 0, 48, 32, 0, i16, this.f243ba);
                int i17 = this.f302j % 5;
                s6 = f44b[i17][0];
                s5 = f44b[i17][1];
                i3 = 151;
                i12 = 48;
                i11 = 24;
                i10 = 0;
                i8 = this.f183aV;
                i9 = i16;
            } else {
                if (this.f184aW == 1) {
                    int i18 = (this.f302j >> 2) & 3;
                    short s7 = f49c[i18][0];
                    short s8 = f49c[i18][1];
                    i3 = 121;
                    i4 = 0;
                    i5 = i16;
                    i6 = 32;
                    i7 = 48;
                    s3 = s8;
                    s4 = s7;
                } else {
                    if (this.f184aW == 2) {
                        if (this.f185aX < 1) {
                            i = 24;
                            i2 = 48;
                            s = 120;
                            s2 = 48;
                        } else {
                            i = 40;
                            i2 = 40;
                            s = 40;
                            s2 = (this.f185aX < 12 ? (this.f185aX >> 1) % 6 : ((this.f185aX - 12) % 4) + 6) * 40;
                        }
                        m146a(121, 0, 0, 48, 32, 0, i16, this.f243ba);
                        i3 = 151;
                        i4 = 0;
                        i5 = this.f182aU;
                        i6 = i;
                        i7 = i2;
                        s3 = s;
                        s4 = s2;
                    }
                    if (this.f184aW < 2) {
                        m146a(121, 96, 0, 16, 16, 0, i16 - 16, i14);
                        m146a(121, 96, 0, 16, 16, 0, i16 + 16, i14);
                        drawHUDString(i16 - 10, i13, this.f186aY / 55, 2);
                    }
                    m146a(121, 0, 64, 120, 16, 0, i16, i15);
                }
                i8 = this.f243ba;
                i9 = i5;
                i10 = i4;
                i11 = i6;
                i12 = i7;
                s5 = s3;
                s6 = s4;
            }
            m146a(i3, s6, s5, i12, i11, i10, i9, i8);
            if (this.f184aW < 2) {
            }
            m146a(121, 0, 64, 120, 16, 0, i16, i15);
        }
    }

    /* renamed from: T */
    public final void mo24T() {
        switch (this.f171aJ) {
            case 0:
                gameObjGfx[154] = loadImage("/emeralds.png");
                this.f172aK = 0;
                this.f171aJ = 2;
                return;
            case 1:
            default:
                return;
            case 2:
                this.f172aK++;
                if (this.f172aK > 720) {
                    m374p();
                    return;
                }
                return;
        }
    }

    /* renamed from: U */
    public final void mo25U() {
        int width = gameObjGfx[154].getWidth() / 6;
        int width2 = uiObjGfx[10].getWidth();
        mo10F();
        screenBuffer.setColor(16777215);
        screenBuffer.fillRect(0, f73i, f51d, f70h);
        drawSprite(screenBuffer, uiObjGfx[10], 0, 144, width2, width, rotationQuadrants[0], f36aH, 10, 17, true);
        for (int i = 0; i < this.f308l - 1; i++) {
            drawSprite(screenBuffer, gameObjGfx[154], i * width, 0, width, width, rotationQuadrants[0], this.f110E[i] >> 16, 65535 & this.f110E[i], 0, true);
        }
        switch (this.f171aJ) {
            case 2:
                if (((this.f302j >> 1) & 1) == 0) {
                    drawSprite(screenBuffer, gameObjGfx[154], (this.f308l - 1) * width, 0, width, width, rotationQuadrants[0], this.f110E[this.f308l - 1] >> 16, this.f110E[this.f308l - 1] & 65535, 0, true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x005a  */
    /* renamed from: V */
    public final void mo26V() throws Exception {
        int i;
        RunnableC0002c cVar;
        switch (this.f173aL) {
            case 0:
                zoneTiles = null;
                m153a(gameObjGfx);
                PlaneDisplayer.m2a(0, 0);
                gameObjGfx[158] = loadImage("/landscape.png");
                if (this.f308l != 6) {
                    gameObjGfx[157] = loadImage("/endegg_b.png");
                    this.f173aL = 1;
                    this.f174aM = 0;
                    this.f177aP = 0;
                } else {
                    gameObjGfx[157] = loadImage("/endegg_a.png");
                    this.f177aP = 0;
                    this.f173aL = 2;
                }
                gameObjGfx[155] = loadImage("/ED3.png");
                gameObjGfx[154] = loadImage("/emeralds.png");
                this.f175aN = 0;
                this.f176aO = 0;
                this.f178aQ = 0;
                return;
            case 1:
                this.f175aN++;
                if (this.f175aN > 480) {
                    this.f173aL = 2;
                    return;
                } else if (this.f175aN > 360) {
                    this.f174aM = 2;
                    return;
                } else if (this.f175aN > 240) {
                    this.f174aM = 1;
                    return;
                } else {
                    return;
                }
            case 2:
                this.f176aO++;
                if (this.f176aO > 240) {
                    if (this.f308l == 6) {
                        this.f173aL = 3;
                        return;
                    }
                    this.f173aL = 4;
                    this.f180aS = 3;
                    this.f179aR = 0;
                    return;
                } else if (this.f176aO > 32) {
                    this.f177aP = 2;
                    return;
                } else if (this.f176aO > 16) {
                    this.f177aP = 1;
                    return;
                } else {
                    return;
                }
            case 3:
                this.f178aQ++;
                if (this.f178aQ > 240) {
                    m171aJ();
                    if (m354d()) {
                        this.gameMode = 9;
                        this.f326v = true;
                        return;
                    }
                    m351d(3);
                    return;
                }
                return;
            case 4:
                this.f178aQ++;
                switch (this.f180aS) {
                    case 0:
                        if (this.f240bQ + ((6 - this.f308l) * 16) > 0) {
                            i = this.f240bQ - 2;
                            cVar = this;
                            cVar.f240bQ = i;
                            break;
                        } else {
                            this.f240bQ = 0;
                            this.f178aQ = 0;
                            this.f179aR++;
                            this.f180aS = 3;
                            break;
                        }
                    case 1:
                        if (this.f178aQ > 24) {
                            this.f180aS = 0;
                            i = 145;
                            cVar = this;
                            cVar.f240bQ = i;
                            break;
                        }
                        break;
                    case 2:
                        if (this.f240bQ - ((6 - this.f308l) * 16) < 180) {
                            i = this.f240bQ + 2;
                            cVar = this;
                            cVar.f240bQ = i;
                            break;
                        } else {
                            this.f240bQ = 180;
                            this.f178aQ = 0;
                            this.f179aR++;
                            this.f180aS = 1;
                            break;
                        }
                    case 3:
                        if (this.f178aQ > 24) {
                            this.f180aS = 2;
                            i = 35;
                            cVar = this;
                            cVar.f240bQ = i;
                            break;
                        }
                        break;
                }
                if (this.f179aR > 4) {
                    if (m354d()) {
                        this.gameMode = 9;
                        this.f326v = true;
                        return;
                    }
                    m351d(3);
                    return;
                }
                return;
            default:
                this.f173aL = 0;
                zoneTiles = null;
                m153a(gameObjGfx);
                PlaneDisplayer.m2a(0, 0);
                gameObjGfx[158] = loadImage("/landscape.png");
                if (this.f308l != 6) {
                }
                gameObjGfx[155] = loadImage("/ED3.png");
                gameObjGfx[154] = loadImage("/emeralds.png");
                this.f175aN = 0;
                this.f176aO = 0;
                this.f178aQ = 0;
                return;
        }
    }

    /* renamed from: W */
    public final void mo27W() {
        int i;
        Graphics graphics;
        Image image;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Graphics graphics2;
        int i10;
        int i11;
        int i12;
        int i13;
        Image image2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Image image3;
        Graphics graphics3;
        m264o(3);
        screenBuffer.setClip(0, 0, screenWidth, screenHeight);
        screenBuffer.setColor(0);
        screenBuffer.fillRect(0, 0, screenWidth, screenHeight);
        if (this.f173aL == 2 || this.f173aL == 1) {
            m151a(false, false);
        }
        mo10F();
        if (f66g < screenWidth) {
            screenBuffer.translate((screenWidth - f66g) >> 1, 0);
        }
        switch (this.f173aL) {
            case 1:
                screenBuffer.setClip(0, f73i, screenWidth, f70h);
                screenBuffer.drawImage(gameObjGfx[158], 0, f73i, 20);
                switch (this.f174aM) {
                    case 0:
                        drawSprite(screenBuffer, gameObjGfx[157], ((this.f175aN >> 1) & 1) * 32, 96, 32, 40, rotationQuadrants[0], f36aH, (f73i + f70h) - 10, 33, false);
                        break;
                    case 1:
                        drawSprite(screenBuffer, gameObjGfx[157], 64, 96, 32, 40, rotationQuadrants[0], f36aH, (f73i + f70h) - 10, 33, false);
                        if (((this.f175aN >> 1) & 1) == 0) {
                            for (int i19 = 0; i19 < 6; i19++) {
                                int min = Math.min(60, this.f175aN - 240);
                                drawSprite(screenBuffer, gameObjGfx[154], i19 * 16, 0, 16, 16, rotationQuadrants[0], ((mo49b(i19 * 36) * min) / 100) + f36aH, (((f73i + f70h) - 22) - (min >> 1)) - ((mo34a(i19 * 36) * min) / 100), 3, false);
                            }
                            break;
                        }
                        break;
                    case 2:
                        drawSprite(screenBuffer, gameObjGfx[157], (((this.f175aN >> 5) & 1) + 3) * 32, 96, 32, 40, rotationQuadrants[0], f36aH, (f73i + f70h) - 10, 33, false);
                        for (int i20 = 0; i20 < 6; i20++) {
                            drawSprite(screenBuffer, gameObjGfx[154], i20 * 16, 0, 16, 16, rotationQuadrants[0], ((mo49b(i20 * 36) * 60) / 100) + f36aH, (((f73i + f70h) - 22) - 30) - ((mo34a(i20 * 36) * 60) / 100), 3, false);
                        }
                        break;
                }
            case 2:
                screenBuffer.setClip(0, f73i, screenWidth, f70h);
                screenBuffer.drawImage(gameObjGfx[158], 0, f73i, 20);
                switch (this.f177aP) {
                    case 0:
                        graphics3 = screenBuffer;
                        image3 = gameObjGfx[155];
                        i18 = 0;
                        i12 = 0;
                        i11 = 32;
                        i10 = 40;
                        i14 = rotationQuadrants[0];
                        i15 = f36aH;
                        i17 = 10;
                        i16 = f70h + f73i;
                        drawSprite(graphics3, image3, i18, i12, i11, i10, i14, i15, i16 - i17, 33, false);
                        break;
                    case 1:
                        graphics2 = screenBuffer;
                        i10 = 71;
                        i11 = 46;
                        i12 = 40;
                        i13 = 0;
                        image2 = gameObjGfx[155];
                        i14 = rotationQuadrants[0];
                        i15 = f36aH;
                        i16 = f73i + f70h;
                        i17 = 20;
                        i18 = i13;
                        image3 = image2;
                        graphics3 = graphics2;
                        drawSprite(graphics3, image3, i18, i12, i11, i10, i14, i15, i16 - i17, 33, false);
                        break;
                    case 2:
                        graphics2 = screenBuffer;
                        i10 = 136;
                        i11 = 176;
                        i12 = 0;
                        i13 = 48;
                        image2 = gameObjGfx[155];
                        i14 = rotationQuadrants[0];
                        i15 = f36aH;
                        i16 = f73i + f70h;
                        i17 = 20;
                        i18 = i13;
                        image3 = image2;
                        graphics3 = graphics2;
                        drawSprite(graphics3, image3, i18, i12, i11, i10, i14, i15, i16 - i17, 33, false);
                        break;
                }
            case 3:
                screenBuffer.setColor(0);
                screenBuffer.fillRect(0, f73i, screenWidth, f70h);
                int i21 = (this.f178aQ / 15) % 3;
                graphics = screenBuffer;
                image = gameObjGfx[157];
                i2 = i21 * 60;
                i3 = 0;
                i4 = 60;
                i5 = 96;
                i6 = rotationQuadrants[0];
                i7 = f36aH;
                i8 = f37aI;
                i9 = 3;
                drawSprite(graphics, image, i2, i3, i4, i5, i6, i7, i8, i9, false);
                break;
            case 4:
                screenBuffer.setColor(0);
                screenBuffer.fillRect(0, f73i, screenWidth, f70h);
                switch (this.f180aS) {
                    case 0:
                        drawSprite(screenBuffer, gameObjGfx[157], 128, 0, 128, 112, rotationQuadrants[0], f36aH, f37aI, 3, false);
                        for (int i22 = 0; i22 < 6 - this.f308l; i22++) {
                            int max = Math.max(Math.min(145, this.f240bQ + (i22 * 16)), 0);
                            drawSprite(screenBuffer, gameObjGfx[154], (5 - i22) * 16, 0, 16, 16, rotationQuadrants[0], f36aH + ((mo49b(max) * 55) / 100), (f37aI - 10) - ((mo34a(max) * 55) / 100), 3, false);
                        }
                        break;
                    case 1:
                        i = f36aH + 55;
                        int i23 = f37aI - 20;
                        drawSprite(screenBuffer, gameObjGfx[157], 0, 0, 128, 112, rotationQuadrants[0], f36aH, f37aI, 3, false);
                        drawSprite(screenBuffer, gameObjGfx[154], 0, 0, 16, 16, rotationQuadrants[0], i, i23, 3, false);
                        break;
                    case 2:
                        drawSprite(screenBuffer, gameObjGfx[157], 128, 0, 128, 112, rotationQuadrants[4], f36aH, f37aI, 3, false);
                        for (int i24 = 0; i24 < 6 - this.f308l; i24++) {
                            int min2 = Math.min(Math.max(35, this.f240bQ - (i24 * 16)), 180);
                            drawSprite(screenBuffer, gameObjGfx[154], (5 - i24) * 16, 0, 16, 16, rotationQuadrants[0], f36aH + ((mo49b(min2) * 55) / 100), (f37aI - 10) - ((mo34a(min2) * 55) / 100), 3, false);
                        }
                        break;
                    case 3:
                        i = f36aH - 55;
                        int i232 = f37aI - 20;
                        drawSprite(screenBuffer, gameObjGfx[157], 0, 0, 128, 112, rotationQuadrants[0], f36aH, f37aI, 3, false);
                        drawSprite(screenBuffer, gameObjGfx[154], 0, 0, 16, 16, rotationQuadrants[0], i, i232, 3, false);
                        break;
                }
                graphics = screenBuffer;
                image = gameObjGfx[157];
                i2 = 0;
                i3 = 116;
                i4 = 240;
                i5 = 36;
                i6 = rotationQuadrants[0];
                i7 = f36aH;
                i8 = f73i + f70h;
                i9 = 33;
                drawSprite(graphics, image, i2, i3, i4, i5, i6, i7, i8, i9, false);
                break;
        }
        if (f66g < screenWidth) {
            screenBuffer.translate(-((screenWidth - f66g) >> 1), 0);
        }
    }

    /* renamed from: X */
    public final void mo28X() {
        if (this.f163a[4]) {
            this.f241bR++;
            if (this.f241bR > 2) {
                this.f241bR = 0;
            }
        } else if (this.f163a[3]) {
            this.f241bR--;
            if (this.f241bR < 0) {
                this.f241bR = 2;
            }
        } else if (this.f163a[2]) {
            int[] iArr = this.f131L;
            int i = this.f241bR;
            iArr[i] = iArr[i] - 1;
            if (this.f131L[this.f241bR] < 0) {
                this.f131L[this.f241bR] = f29a.length - 1;
            }
        } else if (this.f163a[1]) {
            int[] iArr2 = this.f131L;
            int i2 = this.f241bR;
            iArr2[i2] = iArr2[i2] + 1;
            if (this.f131L[this.f241bR] >= f29a.length) {
                this.f131L[this.f241bR] = 0;
            }
        } else if (this.f163a[0]) {
            m172aK();
        }
    }

    /* renamed from: Y */
    public final void mo29Y() {
        String str;
        RunnableC0002c cVar;
        mo10F();
        screenBuffer.setColor(0);
        screenBuffer.fillRect(0, f73i, f51d, f70h);
        switch (this.f311m[2]) {
            case 0:
                str = "ENTER NAME";
                cVar = this;
                cVar.mo40a(str, false);
                break;
            case 1:
                str = "NAMEN EINGEBEN";
                cVar = this;
                cVar.mo40a(str, false);
                break;
            case 2:
                str = "ENTREZ VOTRE NOM";
                cVar = this;
                cVar.mo40a(str, false);
                break;
            case 3:
                str = "INTRODUCE TU NOMBRE";
                cVar = this;
                cVar.mo40a(str, false);
                break;
            case 4:
                str = "INSERISCI NOME";
                cVar = this;
                cVar.mo40a(str, false);
                break;
        }
        screenBuffer.setColor(16777215);
        int length = screenWidth / (this.f131L.length + 1);
        for (int i = 0; i < this.f131L.length; i++) {
            screenBuffer.drawString(String.valueOf(f29a[this.f131L[i]]), (i + 1) * length, f37aI + (screenBuffer.getFont().getHeight() >> 1), 65);
        }
        screenBuffer.setColor(16386570);
        int height = (screenBuffer.getFont().getHeight() * 3) >> 1;
        screenBuffer.drawRect((length * (this.f241bR + 1)) - (height >> 1), f37aI - (height >> 1), height, height);
    }

    /* renamed from: Z */
    public final void mo30Z() {
        mo10F();
        screenBuffer.setColor(0);
        screenBuffer.fillRect(0, f73i, f51d, f70h);
        mo40a(this.f221b[87], false);
        screenBuffer.setColor(16777215);
        screenBuffer.drawString(m140a(), screenWidth >> 1, f73i + (f70h >> 1), 65);
    }

    /* renamed from: a */
    public final int m310a(int i, int i2, int i3) {
        int i4 = i2 + i3;
        if (m340b(i, i4)) {
            for (int i5 = 0; i5 < 8; i5++) {
                i4--;
                if (!m340b(i, i4)) {
                    break;
                }
            }
        } else {
            for (int i6 = 0; i6 < 8 && !m340b(i, i4 + 1); i6++) {
                i4++;
            }
        }
        int i7 = i4 - i3;
        if (i7 < 0) {
            return 0;
        }
        return i7;
    }

    /* renamed from: a */
    public final int mo32a(int i, int i2, int i3, int i4, boolean z) {
        if (f67g && f52d) {
            return 0;
        }
        int i5 = (f74i || f78k) ? 12 : 16;
        int a = mo33a();
        int b = mo48b() - i5;
        int i6 = (i3 >> 1) + 12;
        int i7 = i5 + (i4 >> 1);
        if (f74i) {
            if (a - i6 < i && i < a + i6 && b - i7 < i2 && i2 < i7 + b) {
                if (this.invincibilityTimer > 0 || (this.f115G && this.f290f[0])) {
                    return 1;
                }
                return z ? 1 : 2;
            }
        } else if (a - i6 < i && i < a + i6 && b - i7 < i2 && i2 < i7 + b) {
            return (this.invincibilityTimer > 0 || (this.f115G && this.f290f[0])) ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: a */
    public final void m312a() {
        this.xPos = 11424;
        this.yPos = 1232;
        for (int i = 0; i < 10; i++) {
            this.f165a[i][0] = (short) (((i * 32) - 160) + 16);
            this.f165a[i][1] = 176;
            this.f165a[i][2] = 0;
            this.f165a[i][3] = 0;
        }
    }

    /* renamed from: a */
    public final void m313a(int i) {
        this.f296h[0] = true;
        if (!this.f109E && f47c[5] >= 0) {
            if (f67g && f74i && !f71h) {
                f74i = false;
            }
            int i2 = this.f208as - 8;
            if (i2 >= 0 && Math.abs(mo33a() - this.f209at) > i2) {
                this.f112F = true;
                this.f207ar = 0;
                if (mo33a() - this.f209at > 0) {
                    this.f207ar = 1;
                }
            }
            this.f107D = false;
            f47c[8] = 0;
            f47c[5] = 0;
            if (f67g) {
                f47c[10] = f47c[3];
                if (f47c[10] < 0) {
                    f47c[13] = 1;
                }
                if (f47c[10] > 0) {
                    f47c[13] = 2;
                }
                f47c[14] = 0;
            }
            f47c[3] = 0;
            this.f320s = true;
            this.f196ag = i;
            sonicAngle = 0;
            f67g = false;
            f46c = false;
            f17Q = false;
            this.f212aw = 0;
        }
    }

    /* renamed from: a */
    public final void m314a(int i, int i2, int i3) {
        if ((i3 == 1 || i3 == 21) && this.f262bt <= 1 && this.f261bs <= 1 && Math.abs(mo33a() - i) < 300 && Math.abs((mo48b() + 40) - i2) < 120) {
            this.f261bs = 20;
            this.f260br = 10;
            this.f262bt = 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089 A[Catch:{ Exception -> 0x0102 }] */
    /* renamed from: a */
    public final void mo35a(int i, int i2, int i3, int i4) {
        int i5;
        char c;
        char c2;
        int i6;
        int i7;
        for (int i8 = i; i8 < i + i3; i8++) {
            if ((this.tilesetMapsWidth << 4) > (f100z[0] >> 4) + i8) {
                for (int i9 = i2; i9 < i2 + i4; i9++) {
                    try {
                        int i10 = (this.tilesetMaps[(((f100z[1] >> 4) + i9) >> 4) % this.tilesetMapsHeight][((f100z[0] >> 4) + i8) >> 4] << 9) + (((((f100z[0] >> 4) + i8) & 15) + ((((f100z[1] >> 4) + i9) & 15) << 4)) << 1) + 1;
                        int i11 = (this.lvlChunks[i10] & 255) + (this.f278d[i10 >> 1] << 8);
                        if (i11 != 0) {
                            if (this.zoneID == 2) {
                                if (i11 == 367 || i11 == 366) {
                                    i6 = (i11 + (this.f302j / 5)) & 1;
                                    i7 = 366;
                                } else if (i11 == 365 || i11 == 364) {
                                    i6 = (i11 + (this.f302j / 5)) & 1;
                                    i7 = 364;
                                } else if (i11 == 363 || i11 == 362) {
                                    i6 = (i11 + (this.f302j / 5)) & 1;
                                    i7 = 362;
                                }
                                i5 = i7 + i6;
                                if (this.f283e[i10 >> 1] != 0) {
                                    if (this.f283e[i10 >> 1] == 1) {
                                        c2 = 4;
                                    } else if (this.f283e[i10 >> 1] == 2) {
                                        c2 = 6;
                                    } else if (this.f283e[i10 >> 1] == 3) {
                                        c2 = 2;
                                    }
                                    c = c2;
                                    drawSprite(screenBuffer, zoneTiles, (i5 % 16) * 16, (i5 / 16) * 16, 16, 16, rotationQuadrants[c], (i8 * 16) - (f100z[0] & 15), (i9 * 16) - (f100z[1] & 15), 20, true);
                                }
                                c = 0;
                                drawSprite(screenBuffer, zoneTiles, (i5 % 16) * 16, (i5 / 16) * 16, 16, 16, rotationQuadrants[c], (i8 * 16) - (f100z[0] & 15), (i9 * 16) - (f100z[1] & 15), 20, true);
                            }
                            i5 = i11;
                            if (this.f283e[i10 >> 1] != 0) {
                            }
                            c = 0;
                            drawSprite(screenBuffer, zoneTiles, (i5 % 16) * 16, (i5 / 16) * 16, 16, 16, rotationQuadrants[c], (i8 * 16) - (f100z[0] & 15), (i9 * 16) - (f100z[1] & 15), 20, true);
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo36a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i >= 1) {
            for (int i8 = 0; i8 < 50; i8++) {
                int[] iArr = this.f300i[i8];
                if (iArr[0] <= 0) {
                    for (int i9 = 4; i9 < 20; i9++) {
                        iArr[i9] = 0;
                    }
                    iArr[0] = 1;
                    iArr[1] = i;
                    iArr[2] = i2 * 100;
                    iArr[3] = i3 * 100;
                    iArr[8] = i7;
                    iArr[10] = i4;
                    iArr[11] = i5;
                    iArr[19] = i6;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo37a(int i, boolean z) {
        if (99950000 > this.score && this.score % 50000 > (this.score + i) % 50000) {
            this.lives++;
            if (z) {
                this.samplePlayer.playSample(7, 1, false);
            }
        }
        this.score += i;
        if (this.score > 99999999) {
            this.score = 99999999;
        }
    }

    /* renamed from: a */
    public final void mo38a(String str, int i, int i2, int i3, int i4) {
        m148a(str, i, i2, i3, i4, 17);
    }

    /* renamed from: a */
    public final void mo39a(String str, int i, int i2, boolean z) {
        Font font = screenBuffer.getFont();
        int stringWidth = font.stringWidth(str);
        int height = font.getHeight();
        int i3 = height + 2;
        int i4 = i3 * i2;
        int i5 = i4 + ((screenHeight - (i * i3)) >> 1);
        mo38a(str, screenWidth >> 1, i5, 16777215, 0);
        Image image = null;
        if (menuObjGfx != null) {
            image = menuObjGfx[4];
        }
        if (image == null) {
            image = gameObjGfx[0];
        }
        if (z) {
            int width = image.getWidth() >> 1;
            int height2 = image.getHeight() >> 2;
            int i6 = (this.f216b >> 3) * height2;
            drawSprite(screenBuffer, image, 0, i6, width, height2, rotationQuadrants[0], ((screenWidth >> 1) - (stringWidth >> 1)) - 15, (i5 - f62f) + (height >> 1), 3, false);
            drawSprite(screenBuffer, image, 0, i6, width, height2, rotationQuadrants[0], (screenWidth >> 1) + (stringWidth >> 1) + 15, (i5 - f62f) + (height >> 1), 3, false);
        }
    }

    /* renamed from: a */
    public final void mo40a(String str, boolean z) {
        int i;
        int i2;
        String str2;
        int i3 = 2;
        int i4 = (f73i >> 1) - (f22a >> 1);
        if (i4 >= 2) {
            i3 = i4;
        }
        if (!z) {
            i = f51d >> 1;
            i2 = 17;
            str2 = str;
        } else {
            i = f51d - this.f244bb;
            i2 = 20;
            str2 = str;
        }
        m148a(str2, i, i3, 16777215, 0, i2);
    }

    /* renamed from: a */
    public final void mo41a(Graphics graphics, boolean z) {
        int h = m238h(f100z[0] & 15);
        int h2 = m238h(f100z[1] & 15);
        for (int i = 0; i < f34aE; i++) {
            if ((this.tilesetMapsWidth << 4) > (f100z[0] >> 4) + i) {
                for (int i2 = 0; i2 < f35aF; i2++) {
                    int i3 = this.f223b[i][i2][1];
                    int i4 = this.f223b[i][i2][0];
                    if (this.f223b[i][i2][2] == 1 && i4 != 0 && !z) {
                        try {
                            graphics.drawRegion(zoneTiles, (i4 & 15) * 16, (i4 >> 4) * 16, 16, 16, rotationQuadrants[i3], (i * 16) - h, f73i + ((i2 * 16) - h2), 20);
                        } catch (Throwable th) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049 A[LOOP:0: B:1:0x0003->B:20:0x0049, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035 A[SYNTHETIC] */
    /* renamed from: a */
    public final void m322a(boolean z) {
        int i;
        RunnableC0002c cVar;
        for (int i2 = 0; i2 < 6; i2++) {
            if (!z || this.f201al >= f64f.length) {
                if (this.f201al >= 0) {
                    this.f201al--;
                    if (this.f201al < 0) {
                        this.f201al = 6;
                        i = 2;
                        cVar = this;
                    }
                }
                if (m154a(f64f[this.f201al][0])) {
                    return;
                }
            } else {
                this.f201al++;
                if ((this.f201al == 6 && this.f202am == 3) || this.f201al > 6) {
                    this.f201al = 0;
                    i = 0;
                    cVar = this;
                }
                if (m154a(f64f[this.f201al][0])) {
                }
            }
            cVar.f202am = i;
            if (m154a(f64f[this.f201al][0])) {
            }
        }
    }

    /* renamed from: a */
    public final void mo43a(int[] iArr) {
        mo44a(iArr, (this.objSizeTable[iArr[1]][1] >> 1) - 2);
    }

    /* renamed from: a */
    public final void mo44a(int[] iArr, int i) {
        int i2 = iArr[3];
        int i3 = i2 + i;
        if (i2 < 99999) {
            i2++;
        }
        if (m340b(iArr[2], i3)) {
            i2 -= 2;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        iArr[3] = i2;
    }

    /* renamed from: a */
    public final boolean m325a() {
        char c;
        try {
            if (!this.f219b || !this.f162a[1].equals(this.f221b[60])) {
                this.f219b = false;
                if (this.f163a[5]) {
                    if (this.f156a == 17) {
                        return false;
                    }
                    this.f163a[5] = false;
                    c = 0;
                } else if (!this.f163a[6]) {
                    c = 65535;
                } else if (this.gameMode == 1) {
                    return false;
                } else {
                    this.f163a[6] = false;
                    c = 1;
                }
                if (c != 65535) {
                    if (this.f162a[c].equals(this.f221b[59])) {
                        if (this.gameMode == 3) {
                            m351d(4);
                            this.f281e = 1;
                            m261n(this.f281e + 11);
                            m264o(2);
                            return true;
                        }
                        m351d(3);
                        return true;
                    } else if (this.f162a[c].equals(this.f221b[60])) {
                        this.gameMode = 10;
                        this.f326v = true;
                        this.f204ao = 10;
                        this.f203an = 0;
                        this.samplePlayer.m388a();
                        return true;
                    } else if (this.f162a[c].equals(this.f221b[61])) {
                        m365h();
                        this.gameMode = 2;
                        this.f316q = true;
                        this.f326v = true;
                        this.f204ao = 10;
                        this.f333y = true;
                        updateHUDLives = true;
                        mo70e(false);
                        m363g();
                        return true;
                    } else if (this.f162a[c].equals(this.f221b[66])) {
                        m351d(3);
                        return true;
                    } else if (this.f162a[c].equals(this.f221b[68])) {
                        this.f311m[1] = this.f309l[1];
                        if (this.f311m[1] == 0) {
                            this.f311m[1] = 1;
                        }
                        m365h();
                        this.samplePlayer.m389a(1);
                        this.f326v = true;
                        this.f204ao = 10;
                        return true;
                    } else if (this.f162a[c].equals(this.f221b[69])) {
                        this.f309l[1] = this.f311m[1];
                        this.f311m[1] = 0;
                        m365h();
                        this.samplePlayer.m389a(0);
                        this.f326v = true;
                        this.f204ao = 10;
                        return true;
                    } else if (this.f162a[c].equals(this.f221b[57])) {
                        this.f156a = 14;
                        this.f281e = 1;
                        m264o(3);
                        return true;
                    } else if (this.f162a[c].equals("OK")) {
                        m172aK();
                    }
                }
                return false;
            }
            m367i();
            return true;
        } catch (Exception e) {
            this.f219b = false;
        }
    }

    /* renamed from: a */
    public final boolean m326a(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            int i3 = (this.tilesetMaps[((i2 >> 4) >> 4) % this.tilesetMapsHeight][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f292g[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (this.lvlColMaps[(this.lvlChunks[i3] & 255) + (this.f278d[i3 >> 1] << 8)] & 255) << 5;
            if (this.f283e[i3 >> 1] == 1) {
                if (((this.tileCollisionTable[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1) == 0) {
                    return false;
                }
            } else if (this.f283e[i3 >> 1] == 2) {
                if (((this.tileCollisionTable[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1) == 0) {
                    return false;
                }
            } else if (this.f283e[i3 >> 1] == 3) {
                if (((this.tileCollisionTable[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1) == 0) {
                    return false;
                }
            } else if (((this.tileCollisionTable[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1) == 0) {
                return false;
            }
            f47c[8] = (this.lvlChunks[i3] & 255) + (this.f278d[i3 >> 1] << 8);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    /* renamed from: a */
    public final boolean m327a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return (i - i3) + -1 < 0 || m340b((i - i3) + -1, i2 + -12) || !m340b((i - i3) + -1, (i2 + i4) + 10);
        }
        if (m340b(i + i3 + 1, i2 - 12) || !m340b(i + i3 + 1, i2 + i4 + 10)) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m328a(int[] iArr) {
        return iArr[2] - f98y[0] < this.f236bM || iArr[2] - f98y[0] > this.f237bN || Math.abs(iArr[3] - f98y[1]) > this.f238bO;
    }

    /* renamed from: a */
    public final boolean m329a(int[] iArr, int i) {
        boolean z;
        int i2 = iArr[13];
        int i3 = (i2 / 100) + i;
        if (i2 < 9999900) {
            i2 += 100;
        }
        if (m340b(iArr[12] / 100, i3)) {
            i2 -= 200;
            iArr[11] = 50;
            z = true;
        } else {
            z = false;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        iArr[13] = i2;
        return z;
    }

    /* renamed from: a */
    public final int[][] m330a(int i, int i2) {
        this.f117H = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f285e.length && i3 < this.f195af; i4++) {
            if (this.f285e[i4][24] == 1) {
                i3++;
                if (this.f285e[i4][1] == i && (i2 < 0 || i2 == this.f285e[i4][4])) {
                    this.f275c[this.f117H] = this.f285e[i4];
                    this.f275c[this.f117H][23] = i4;
                    this.f117H++;
                }
            }
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, this.f117H, 25);
        System.arraycopy(this.f275c, 0, iArr, 0, iArr.length);
        return iArr;
    }

    /* renamed from: aa */
    public final void mo47aa() {
        mo10F();
        screenBuffer.setColor(0);
        screenBuffer.fillRect(0, f73i, f51d, f70h);
        mo40a(this.f221b[86], false);
        screenBuffer.setColor(16777215);
        int charWidth = f25a.charWidth('X') + 2;
        for (int i = 0; i < 8; i++) {
            screenBuffer.drawChar(f29a[this.f134M[i]], (screenWidth >> 1) + ((i - 4) * charWidth) + 2, f73i + (f70h >> 1), 36);
        }
        screenBuffer.setColor(16386570);
        screenBuffer.drawRect((screenWidth >> 1) + ((this.f242bS - 4) * charWidth), (f73i + (f70h >> 1)) - f22a, charWidth, f22a);
        screenBuffer.setColor(16777215);
        screenBuffer.drawString(this.f218b, screenWidth >> 1, f73i, 17);
    }

    /* renamed from: b */
    public final void m332b() {
        for (int i = 0; i < 10; i++) {
            if (this.f165a[i][3] != 0) {
                m336b(23, (int) this.f165a[i][0], (int) this.f165a[i][1], 330, 300, 0);
                m336b(23, (int) this.f165a[i][0], (int) this.f165a[i][1], 30, 300, 1);
                m336b(23, (int) this.f165a[i][0], (int) this.f165a[i][1], 300, 300, 2);
                m336b(23, (int) this.f165a[i][0], (int) this.f165a[i][1], 60, 300, 3);
                this.f165a[i][2] = 1;
            }
        }
    }

    /* renamed from: b */
    public final void m333b(int i) {
        this.f111F = i;
        this.f285e[i][24] = 0;
        this.f114G--;
    }

    /* renamed from: b */
    public final void mo50b(int i, int i2) {
        this.f208as = i2;
        this.f209at = i;
    }

    /* renamed from: b */
    public final void mo51b(int i, int i2, int i3) {
        if ((i3 != 2 && i3 != 10) || this.f262bt > 3) {
            return;
        }
        if ((this.f262bt != 3 || this.f261bs <= 1) && this.f261bs < 2 && Math.abs(mo33a() - i) < 128 && Math.abs(mo48b() - i2) < 96) {
            this.f261bs = 20;
            this.f260br = 7;
            this.f262bt = 3;
        }
    }

    /* renamed from: b */
    public final void m336b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i >= 1) {
            for (int i7 = 0; i7 < 50; i7++) {
                int[] iArr = this.f300i[i7];
                if (iArr[0] <= 0) {
                    for (int i8 = 4; i8 < 20; i8++) {
                        iArr[i8] = 0;
                    }
                    iArr[0] = 1;
                    iArr[1] = i;
                    iArr[2] = i2 * 100;
                    iArr[3] = i3 * 100;
                    iArr[8] = i6;
                    iArr[10] = (mo34a(i4) * i5) / 100;
                    iArr[11] = (mo49b(i4) * i5) / 100;
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b3 A[SYNTHETIC] */
    /* renamed from: b */
    public final void mo53b(Graphics graphics, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = f100z[0] >> 4;
        int i7 = f100z[1] >> 4;
        int h = m238h(f100z[0] & 15);
        int h2 = m238h(f100z[1] & 15);
        int i8 = -16 - h;
        for (int i9 = 0; i9 < f34aE; i9++) {
            i8 += 16;
            int i10 = (-16 - h2) + f73i;
            int i11 = 0;
            int i12 = i7;
            while (i11 < f35aF) {
                i10 += 16;
                try {
                    i = (this.tilesetMaps[i12 >> 4][i6 >> 4] << 9) + (((i6 & 15) + ((i12 & 15) << 4)) << 1) + 1;
                    try {
                        i2 = (this.lvlChunks[i] & 255) + (this.f278d[i >> 1] << 8);
                    } catch (Exception e) {
                        i2 = 0;
                        int i13 = i12 + 1;
                        switch (this.f283e[i >> 1]) {
                        }
                        this.f223b[i9][i11][0] = i2;
                        if (i2 != 0) {
                        }
                        i11++;
                        i12 = i13;
                        i5 = i;
                    }
                } catch (Exception e2) {
                    i = i5;
                    i2 = 0;
                    int i132 = i12 + 1;
                    switch (this.f283e[i >> 1]) {
                    }
                    this.f223b[i9][i11][0] = i2;
                    if (i2 != 0) {
                    }
                    i11++;
                    i12 = i132;
                    i5 = i;
                }
                int i1322 = i12 + 1;
                switch (this.f283e[i >> 1]) {
                    case 1:
                        i3 = 4;
                        i4 = i3;
                        break;
                    case 2:
                        i3 = 6;
                        i4 = i3;
                        break;
                    case 3:
                        i3 = 2;
                        i4 = i3;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
                this.f223b[i9][i11][0] = i2;
                if (i2 != 0) {
                    this.f223b[i9][i11][1] = i4;
                    this.f223b[i9][i11][2] = 0;
                    if (this.f299i[i2] != 0) {
                        this.f223b[i9][i11][2] = 1;
                    } else if (!z) {
                        if (this.zoneID == 2) {
                            if (i2 >= 362 && i2 <= 365) {
                                i2 = (((i2 - 362) + (this.f302j >> 3)) % 4) + 362;
                            } else if (i2 >= 366) {
                                i2 = (((i2 - 366) + (this.f302j >> 3)) % 2) + 366;
                            }
                        }
                        try {
                            graphics.drawRegion(zoneTiles, (i2 & 15) << 4, (i2 >> 4) << 4, 16, 16, rotationQuadrants[i4], i8, i10, 20);
                        } catch (Throwable th) {
                        }
                    }
                }
                i11++;
                i12 = i1322;
                i5 = i;
            }
            i6++;
        }
    }

    /* renamed from: b */
    public final void mo54b(boolean z) {
        int height = screenBuffer.getFont().getHeight();
        if (!(this.f162a[0] == null || (this.f162a[0] == this.f272c[0] && this.gameMode == 2 && !z))) {
            m149a(this.f162a[0], f51d >> 2, screenHeight - height, 17, true);
            this.f272c[0] = this.f162a[0];
        }
        if (this.f162a[1] == null) {
            return;
        }
        if (this.f162a[1] != this.f272c[1] || this.gameMode != 2 || z) {
            m149a(this.f162a[1], (f51d * 3) >> 2, screenHeight - height, 17, true);
            this.f272c[1] = this.f162a[1];
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* renamed from: b */
    public final boolean m339b() {
        int i = this.yPos + ((this.f144T + this.f148V) / 100);
        switch (this.f129L) {
            case 100:
                this.f132M = 3;
                this.f152Y = 120;
                this.f129L++;
                if (this.f141Q > 0) {
                    this.f141Q--;
                }
                if (this.f152Y <= 0) {
                    this.f132M = 4;
                    this.f152Y = 80;
                    this.f129L++;
                    this.f132M = 4;
                    this.f144T += 200;
                    if (i >= f53d[this.zoneID]) {
                        this.f152Y = 40;
                        this.f129L++;
                        if (this.f152Y <= 0) {
                            mo19O();
                            this.f152Y = 24;
                            this.f129L++;
                            this.f144T -= 80;
                            if (this.f152Y <= 0) {
                                this.f152Y = 40;
                                this.f129L++;
                                if (this.f152Y <= 0) {
                                    this.f129L++;
                                    this.f132M = 5;
                                    this.f135N = 1;
                                    this.f143S += 100;
                                    this.f144T -= 50;
                                    if (this.f152Y <= 0) {
                                        this.f152Y = 120;
                                        this.f129L++;
                                        this.f132M = 6;
                                        this.f135N = 1;
                                        this.f143S += 500;
                                        this.f144T -= 50;
                                        if (this.f152Y <= 0) {
                                            this.f129L++;
                                            this.f132M = -1;
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            case 101:
                if (this.f141Q > 0) {
                }
                if (this.f152Y <= 0) {
                }
                return false;
            case 102:
                this.f132M = 4;
                this.f144T += 200;
                if (i >= f53d[this.zoneID]) {
                }
                return false;
            case 103:
                if (this.f152Y <= 0) {
                }
                return false;
            case 104:
                this.f144T -= 80;
                if (this.f152Y <= 0) {
                }
                return false;
            case 105:
                if (this.f152Y <= 0) {
                }
                return false;
            case 106:
                this.f132M = 5;
                this.f135N = 1;
                this.f143S += 100;
                this.f144T -= 50;
                if (this.f152Y <= 0) {
                }
                return false;
            case 107:
                this.f132M = 6;
                this.f135N = 1;
                this.f143S += 500;
                this.f144T -= 50;
                if (this.f152Y <= 0) {
                }
                return false;
            case 108:
                this.f132M = -1;
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final boolean m340b(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            int i3 = (this.tilesetMaps[((i2 >> 4) >> 4) % this.tilesetMapsHeight][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f287f[i3 >> 1] == 1 && this.f292g[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (this.lvlColMaps[(this.lvlChunks[i3] & 255) + (this.f278d[i3 >> 1] << 8)] & 255) << 5;
            if (this.f283e[i3 >> 1] == 1) {
                if (((this.tileCollisionTable[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1) == 0) {
                    return false;
                }
            } else if (this.f283e[i3 >> 1] == 2) {
                if (((this.tileCollisionTable[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1) == 0) {
                    return false;
                }
            } else if (this.f283e[i3 >> 1] == 3) {
                if (((this.tileCollisionTable[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1) == 0) {
                    return false;
                }
            } else if (((this.tileCollisionTable[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1) == 0) {
                return false;
            }
            this.f206aq = (this.lvlChunks[i3] & 255) + (this.f278d[i3 >> 1] << 8);
            return true;
        } catch (Exception e) {
            return true;
        }
    }

    /* renamed from: c */
    public final void m341c() {
        int i;
        int i2;
        short s;
        if (this.objData[14] == 0) {
            m312a();
            int[] iArr = this.objData;
            iArr[14] = iArr[14] + 1;
        }
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.f165a[i3][2] == 0) {
                if (this.f165a[i3][3] == 0) {
                    i = this.xPos + this.f165a[i3][0];
                    i2 = this.yPos;
                    s = this.f165a[i3][1];
                } else {
                    i = this.xPos + ((this.f143S + this.f146U) / 100);
                    i2 = ((this.f144T + this.f148V) / 100) + this.yPos;
                    s = 24;
                }
                mo59c(i, s + i2, 16, 16);
            }
        }
    }

    /* renamed from: c */
    public final void activateMonitorItem(int i) {
        switch (i) {
            case 2:
                this.lives++;
                this.samplePlayer.playSample(7, 1, false);
                return;
            case 3:
                this.spdshoesTimer = 1200;
                this.sonicMaxSpd = 3072;
                this.sonicMaxAcc = 24;
                return;
            case 4:
                this.f321t = 1;
                return;
            case 5:
                this.invincibilityTimer = 1200;
                this.samplePlayer.playSample(6, -1, false);
                return;
            case 6:
                this.rings += 10;
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public final void m343c(int i, int i2) {
        if (this.f262bt <= 2) {
            if (this.f262bt != 2 || this.f261bs <= 1) {
                if (Math.abs(mo33a() - i) < (this.objData[4] == 35 ? 48 : 136) && mo48b() + 40 > i2 && mo48b() - 320 < i2) {
                    this.f261bs = 20;
                    this.f260br = 8;
                    this.f262bt = 2;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo58c(int i, int i2, int i3) {
        if (i3 != 2 || this.f262bt > 4) {
            return;
        }
        if ((this.f262bt != 4 || this.f261bs <= 1) && Math.abs(mo33a() - i) < 96 && Math.abs(mo48b() - i2) < 96) {
            this.f261bs = 20;
            this.f260br = 5;
            this.f262bt = 4;
        }
    }

    /* renamed from: c */
    public final void mo59c(int i, int i2, int i3, int i4) {
        int[] iArr;
        int i5;
        char c;
        int a = m134a(i, i2, i, i2, i3, i4);
        if (a >= 0) {
            if (a == 0) {
                f47c[1] = (i2 - i4) << 8;
                m313a(-1);
            } else {
                if (a == 1) {
                    f47c[0] = ((i - i3) - 12) << 8;
                    iArr = f47c;
                    i5 = 0;
                    c = '\n';
                } else if (a == 2) {
                    f47c[0] = (((i + i3) + 12) + 1) << 8;
                    iArr = f47c;
                    i5 = 0;
                    c = '\n';
                } else if (a == 3) {
                    iArr = f47c;
                    i5 = ((((i2 + i4) + 12) + 12) + 1) << 8;
                    c = 1;
                }
                iArr[c] = i5;
            }
        }
        if (this.f320s && a != 0) {
            this.f320s = false;
        }
    }

    /* renamed from: c */
    public final void updateHUD(boolean z) {
        int i;
        int i2;
        int i3 = 1;
        if (!z) {
            if (!(this.rings_prev == this.rings && this.score_prev == this.score && (this.rings != 0 || (this.f302j & 1) != 0))) {
                updateHUDRingsScore = true;
            }
            if (this.f330x == 0 || this.f224bA != (this.f332y * 100) + this.f330x) {
                updateHUDTime = true;
            }
            if (this.lives_prev != this.lives) {
                updateHUDLives = true;
            }
        } else {
            updateHUDRingsScore = true;
            updateHUDLives = true;
            updateHUDTime = true;
        }
        if (this.lives > 99) {
            this.lives = 99;
        }
        this.lives_prev = this.lives;
        this.rings_prev = this.rings;
        this.score_prev = this.score;
        if (updateHUDRingsScore) {
            m202b(0, 0, 100, f73i);
            drawSprite(screenBuffer, uiObjGfx[1], 0, 0, uiObjGfx[1].getWidth(), uiObjGfx[1].getHeight(), rotationQuadrants[0], 4, -10, 36, true);
            if (this.rings != 0 || ((this.f302j >> 1) & 1) == 0) {
                drawHUDString(31, -35, this.rings, 3);
            }
            drawHUDString(31, -18, this.score, 8);
            updateHUDRingsScore = false;
        }
        this.f224bA = (this.f332y * 100) + this.f330x;
        if (updateHUDTime) {
            m202b(f51d - 48, 0, 48, f73i);
            drawSprite(screenBuffer, uiObjGfx[11], 0, 0, uiObjGfx[11].getWidth(), uiObjGfx[11].getHeight(), rotationQuadrants[0], f51d - 4, -8, 40, true);
            drawHUDString(f51d - 40, -22, this.f332y, 1);
            drawHUDString(f51d - 24, -22, this.f330x, 2);
            updateHUDTime = false;
        }
        if (updateHUDLives) {
            m202b(0, f73i + f70h, 50, f73i);
            drawSprite(screenBuffer, uiObjGfx[2], 0, 0, 22, 20, rotationQuadrants[0], 5, f70h + 7, 20, true);
            if (this.lives > 9) {
                i = f70h + 14;
                i2 = this.lives;
                i3 = 2;
            } else {
                i = f70h + 14;
                i2 = this.lives;
            }
            drawHUDString(31, i, i2, i3);
            updateHUDLives = false;
        }
    }

    /* renamed from: c */
    public final void mo61c(int[] iArr) {
        iArr[2] = this.xPos + ((this.f143S + this.f146U) / 100);
        iArr[3] = this.yPos + ((this.f144T + this.f148V) / 100);
    }

    /* renamed from: c */
    public final boolean m348c() {
        if (this.f129L >= 50) {
            return false;
        }
        if ((f67g && f52d) || this.f212aw > 0) {
            return false;
        }
        int a = (((this.f143S + this.f146U) / 100) + this.xPos) - mo33a();
        int b = ((((this.f144T + this.f148V) / 100) + this.yPos) - 16) - (mo48b() - 16);
        if ((a * a) + (b * b) >= 1024) {
            return false;
        }
        if (f74i) {
            this.f212aw = 1;
            return true;
        }
        if (this.invincibilityTimer == 0) {
            m378u();
        }
        this.f212aw = 1;
        return false;
    }

    /* renamed from: c */
    public final boolean m349c(int[] iArr) {
        return m327a(iArr[2], iArr[3], this.objSizeTable[iArr[1]][0] >> 1, this.objSizeTable[iArr[1]][1] >> 1, iArr[19] & 1);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0292  */
    /* renamed from: d */
    public final void m350d() {
        int i;
        RunnableC0002c cVar;
        int i2;
        int[] iArr = this.objData;
        m360e(iArr);
        if (this.f129L <= 99) {
            this.f139P += 200;
            this.f146U = 0;
            this.f148V = mo34a(this.f139P / 100) * 12;
            int a = (mo33a() - (this.xPos - 160)) / 32;
            int i3 = (this.f143S + 16000) / 3200;
            boolean z = a == i3 && Math.abs(((this.f143S / 100) + 160) - ((i3 * 32) + 16)) < 3 && this.f123J == 0;
            if (this.f123J > 0) {
                this.f123J--;
            }
            if (this.f141Q > 16) {
                if (mo32a(iArr[2], this.f141Q + ((iArr[3] + 8) - 32), 14, 32, false) != 0) {
                    m378u();
                }
            }
            if (m348c() && this.f129L > 3 && this.f188aa == 0) {
                m218d(iArr[2], iArr[3]);
                if (this.f188aa == 0 && this.f129L < 100) {
                    int i4 = this.f194ae - 1;
                    this.f194ae = i4;
                    if (i4 <= 0) {
                        m332b();
                        this.f129L = 100;
                        return;
                    }
                    this.f192ac = 3;
                    this.f193ad = 60;
                    this.f188aa = 60;
                }
            }
            switch (this.f129L) {
                case 1:
                    this.f192ac = 0;
                    this.f132M = 2;
                    this.f143S = 19200;
                    this.f144T = 10000;
                    this.f137O = 0;
                    this.f139P = 0;
                    this.f152Y = 50;
                    this.f123J = 90;
                    z = false;
                    this.f129L++;
                    if (this.f152Y <= 0) {
                        this.f129L++;
                        this.f132M = 2;
                        this.f144T -= 20;
                        this.f143S -= 100;
                        if (this.f143S <= 6400) {
                            this.f143S = 6400;
                            this.f132M = 0;
                            this.f192ac = 1;
                            this.f193ad = 60;
                            this.f152Y = 60;
                            this.f129L++;
                            if (!z) {
                                i = 10;
                                cVar = this;
                                cVar.f129L = i;
                                break;
                            } else {
                                this.f132M = 2;
                                this.f135N = 0;
                                this.f143S -= 70;
                                if (this.f143S <= -12000) {
                                    this.f143S = -12000;
                                    this.f129L++;
                                    if (!z) {
                                        i = 10;
                                        cVar = this;
                                        cVar.f129L = i;
                                    } else {
                                        this.f132M = 2;
                                        this.f135N = 1;
                                        this.f143S += 70;
                                        if (this.f143S >= 12000) {
                                            this.f143S = 12000;
                                            this.f129L++;
                                            i = 4;
                                            cVar = this;
                                            cVar.f129L = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    if (this.f152Y <= 0) {
                    }
                    break;
                case 3:
                    this.f132M = 2;
                    this.f144T -= 20;
                    this.f143S -= 100;
                    if (this.f143S <= 6400) {
                    }
                    break;
                case 4:
                    if (!z) {
                    }
                    break;
                case 5:
                    if (!z) {
                    }
                    break;
                case 6:
                    i = 4;
                    cVar = this;
                    cVar.f129L = i;
                    break;
                case 7:
                case 8:
                case 9:
                default:
                    this.f129L = 1;
                    this.f192ac = 0;
                    this.f132M = 2;
                    this.f143S = 19200;
                    this.f144T = 10000;
                    this.f137O = 0;
                    this.f139P = 0;
                    this.f152Y = 50;
                    this.f123J = 90;
                    z = false;
                    this.f129L++;
                    if (this.f152Y <= 0) {
                    }
                    break;
                case 10:
                    this.f132M = 0;
                    this.f192ac = 1;
                    this.f129L++;
                    this.f144T += 120;
                    if (this.f141Q < 32) {
                        this.f141Q++;
                    }
                    if (this.f144T >= 15400) {
                        this.f144T = 15400;
                        this.f152Y = 48;
                        this.f165a[i3][3] = 1;
                        this.f129L++;
                        this.f146U = 0;
                        this.f148V = getRandomInt(400) - 200;
                        if (this.f152Y <= 0) {
                            this.f146U = 0;
                            this.f148V = 0;
                            this.f129L++;
                            this.f144T -= 300;
                            if (this.f144T <= 2400) {
                                this.f144T = 2400;
                                this.f152Y = 50;
                                this.f129L++;
                                this.f146U = 0;
                                this.f148V = getRandomInt(400) - 200;
                                if (this.f141Q > 0) {
                                    this.f141Q--;
                                }
                                if (this.f152Y <= 0) {
                                    if (this.f165a[i3][2] == 0) {
                                        this.f146U = 0;
                                        this.f148V = 0;
                                        m336b(23, iArr[2], iArr[3] + 24, 330, 300, 0);
                                        m336b(23, iArr[2], iArr[3] + 24, 30, 300, 1);
                                        m336b(23, iArr[2], iArr[3] + 24, 300, 300, 2);
                                        m336b(23, iArr[2], iArr[3] + 24, 60, 300, 3);
                                        this.f165a[i3][2] = 1;
                                    }
                                    this.f152Y = 30;
                                    this.f129L++;
                                    if (this.f152Y <= 0) {
                                        this.f123J = 120;
                                        if (this.f135N == 0) {
                                            i = 4;
                                            cVar = this;
                                        } else {
                                            i = 5;
                                            cVar = this;
                                        }
                                        cVar.f129L = i;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 11:
                    this.f144T += 120;
                    if (this.f141Q < 32) {
                    }
                    if (this.f144T >= 15400) {
                    }
                    break;
                case 12:
                    this.f146U = 0;
                    this.f148V = getRandomInt(400) - 200;
                    if (this.f152Y <= 0) {
                    }
                    break;
                case 13:
                    this.f144T -= 300;
                    if (this.f144T <= 2400) {
                    }
                    break;
                case 14:
                    this.f146U = 0;
                    this.f148V = getRandomInt(400) - 200;
                    if (this.f141Q > 0) {
                    }
                    if (this.f152Y <= 0) {
                    }
                    break;
                case 15:
                    if (this.f152Y <= 0) {
                    }
                    break;
            }
            mo61c(iArr);
            if (this.f129L == 4 || this.f129L == 5) {
                if (Math.abs(iArr[2] - mo33a()) < 64) {
                    if (this.f144T > 1000) {
                        i2 = this.f144T - 160;
                    } else {
                        return;
                    }
                } else if (this.f144T < 8000) {
                    i2 = this.f144T + 140;
                } else {
                    return;
                }
                this.f144T = i2;
            }
        } else if (m339b()) {
            iArr[0] = 0;
        }
    }

    /* renamed from: d */
    public final void m351d(int i) {
        this.f326v = true;
        this.f204ao = 10;
        mo65d(false);
        this.f156a = (byte) i;
        this.gameMode = 1;
    }

    /* renamed from: d */
    public final void mo64d(int i, int i2, int i3) {
        if ((i3 != 1 && i3 != 2) || this.f262bt > 4) {
            return;
        }
        if ((this.f262bt != 4 || this.f261bs <= 1) && Math.abs(mo33a() - i) < 96 && Math.abs(mo48b() - i2) < 96) {
            this.f261bs = 20;
            this.f260br = 5;
            this.f262bt = 4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x003c A[LOOP:0: B:5:0x0038->B:7:0x003c, LOOP_END] */
    /* renamed from: d */
    public final void mo65d(boolean z) {
        AudioModule dVar;
        int i;
        int i2;
        m153a(gameObjGfx);
        m264o(3);
        if (z) {
            menuObjGfx[0] = loadImage("/t_license1.png");
            menuObjGfx[1] = loadImage("/t_license2.png");
            menuObjGfx[2] = loadImage("/ifone.png");
            this.f156a = 0;
            dVar = this.samplePlayer;
            i = 20;
        } else {
            m153a(menuObjGfx);
            PlaneDisplayer.m2a(0, 0);
            menuObjGfx[0] = loadImage("/t_title.png");
            menuObjGfx[1] = loadImage("/t_cur1.png");
            menuObjGfx[2] = loadImage("/t_cur2.png");
            menuObjGfx[4] = loadImage("/ring.png");
            if (this.f133M) {
                this.f133M = false;
                this.f156a = 2;
                return;
            }
            loadUIGfx();
            this.f156a = 3;
            m264o(0);
            if (this.gameMode != 3) {
                dVar = this.samplePlayer;
                i = 9;
            }
            this.f239bP = 0;
            for (i2 = 0; i2 < 10; i2++) {
                this.f293g[i2] = false;
            }
            this.f216b = 0;
            m363g();
        }
        dVar.playSample(i, 1, false);
        this.f239bP = 0;
        while (i2 < 10) {
        }
        this.f216b = 0;
        m363g();
    }

    /* renamed from: d */
    public final boolean m354d() {
        for (int i = 0; i < f15C.length; i++) {
            if (f15C[i] < this.score) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m355d(int[] iArr) {
        int i;
        RunnableC0002c cVar;
        int a = mo32a(iArr[2], iArr[3], this.objSizeTable[iArr[1]][0], this.objSizeTable[iArr[1]][1], true);
        if (iArr[1] == 71 && a == 1 && iArr[3] - 4 > mo48b() - 16) {
            a = 2;
        }
        if (a == 1) {
            if (f47c[5] > 0) {
                f47c[5] = f47c[5] > 2560 ? -2560 : -f47c[5];
            }
            if (this.f212aw == 0) {
                i = 100;
                cVar = this;
            } else if (this.f212aw == 100) {
                i = 200;
                cVar = this;
            } else if (this.f212aw == 200) {
                i = 500;
                cVar = this;
            } else {
                if (this.f212aw == 500) {
                    i = 1000;
                    cVar = this;
                }
                mo37a(this.f212aw, true);
                mo77h(iArr[2], iArr[3], this.f212aw);
                mo36a(2, iArr[2], iArr[3], 0, 0, 0, 0);
                mo36a(f42b[this.zoneID][getRandomInt(2)], iArr[2], iArr[3], 0, -300, 0, 0);
                iArr[0] = 0;
                return true;
            }
            cVar.f212aw = i;
            mo37a(this.f212aw, true);
            mo77h(iArr[2], iArr[3], this.f212aw);
            mo36a(2, iArr[2], iArr[3], 0, 0, 0, 0);
            mo36a(f42b[this.zoneID][getRandomInt(2)], iArr[2], iArr[3], 0, -300, 0, 0);
            iArr[0] = 0;
            return true;
        } else if (a != 2) {
            return false;
        } else {
            m378u();
            return false;
        }
    }

    /* renamed from: e */
    public final int m356e(int i) {
        switch (i) {
            case -7:
                return 13;
            case -6:
                return 12;
            case 35:
                return 10;
            case 42:
                return 11;
            case 48:
                return 0;
            case 49:
                return 1;
            case 50:
                return 2;
            case 51:
                return 3;
            case 52:
                return 4;
            case 53:
                return 5;
            case 54:
                return 6;
            case 55:
                return 7;
            case 56:
                return 8;
            case 57:
                return 9;
            default:
                try {
                    switch (getGameAction(i)) {
                        case 1:
                            return 14;
                        case 2:
                            return 16;
                        case 5:
                            return 17;
                        case 6:
                            return 15;
                        case 8:
                            return 18;
                    }
                } catch (Exception e) {
                }
                return 19;
        }
    }

    /* renamed from: e */
    public final void m357e() {
        for (int i = 0; i < this.f163a.length; i++) {
            this.f163a[i] = false;
        }
    }

    /* renamed from: e */
    public final void mo69e(int i, int i2, int i3) {
        if (i3 != 2 || this.f262bt > 5) {
            return;
        }
        if ((this.f262bt != 5 || this.f261bs <= 1) && Math.abs(mo33a() - i) < 96 && Math.abs(mo48b() - i2) < 96) {
            this.f261bs = 20;
            this.f260br = 2;
            this.f262bt = 5;
        }
    }

    /* renamed from: e */
    public final void mo70e(boolean z) {
        AudioModule dVar;
        int a;
        int i = -1;
        if (z) {
            i = 1;
        }
        if (!this.f322t || this.zoneID >= 5) {
            dVar = this.samplePlayer;
            a = mo42a(z);
        } else {
            dVar = this.samplePlayer;
            a = 11;
        }
        dVar.playSample(a, i, true);
    }

    /* renamed from: e */
    public final boolean m360e(int[] iArr) {
        iArr[2] = ((this.f143S + this.f146U) / 100) + this.xPos;
        iArr[3] = ((this.f144T + this.f148V) / 100) + this.yPos;
        if (this.f188aa > 0) {
            this.f188aa--;
        }
        if (this.f193ad > 0) {
            int i = this.f193ad - 1;
            this.f193ad = i;
            if (i == 0) {
                this.f192ac = 0;
            }
        }
        if (this.f190ab > 0) {
            this.f190ab--;
            return true;
        }
        if (this.f152Y > 0) {
            this.f152Y--;
        }
        this.f154Z++;
        return false;
    }

    /* renamed from: f */
    public final void m361f() throws Exception {
        m173ab();
        m162aA();
        m175ad();
        m177af();
        this.samplePlayer = new AudioModule(this);
        this.samplePlayer.f340a = sampleNames;
        this.samplePlayer.m389a((int) this.f311m[1]);
        this.f316q = true;
        mo65d(true);
        this.gameMode = 1;
        this.f326v = true;
        this.f204ao = 10;
        this.f195af = 0;
    }

    /* renamed from: f */
    public final void mo73f(int i, int i2, int i3) {
        if ((i3 != 1 && i3 != 2) || this.f262bt > 5) {
            return;
        }
        if ((this.f262bt != 5 || this.f261bs <= 1) && Math.abs(mo33a() - i) < 96 && Math.abs(mo48b() - i2) < 96) {
            this.f261bs = 20;
            this.f260br = 2;
            this.f262bt = 5;
        }
    }

    /* renamed from: g */
    public final void m363g() {
        this.minValue = Integer.MIN_VALUE;
        this.f166aA = (int) ((System.currentTimeMillis() - this.f217b) / 18);
    }

    /* renamed from: g */
    public final void mo75g(int i, int i2, int i3) {
        int[] iArr = new int[24];
        if (i3 < 0 || i3 > 5) {
            i3 = 0;
        }
        int i4 = 60;
        for (int i5 = 0; i5 < 24; i5++) {
            i4 = getRandomInt(18) + 2 + i4;
            iArr[i5] = i4;
        }
        for (int i6 = 0; i6 < 24; i6++) {
            mo36a(f42b[i3][getRandomInt(2)], i + (((i6 % 8) * 8) - 32), i2, 0, getRandomInt(60) - 350, getRandomInt(2), i4 - iArr[i6]);
        }
    }

    /* renamed from: h */
    public final void m365h() {
        m152a(this.f311m, "config");
    }

    /* renamed from: h */
    public final void mo77h(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        RunnableC0002c cVar;
        if (i3 < 10) {
            i4 = 0;
            i5 = i2;
            i6 = i;
            cVar = this;
        } else if (i3 < 50) {
            i4 = 1;
            i5 = i2;
            i6 = i;
            cVar = this;
        } else if (i3 < 100) {
            i4 = 2;
            i5 = i2;
            i6 = i;
            cVar = this;
        } else if (i3 < 200) {
            i4 = 3;
            i5 = i2;
            i6 = i;
            cVar = this;
        } else if (i3 < 500) {
            i4 = 4;
            i5 = i2;
            i6 = i;
            cVar = this;
        } else if (i3 < 1000) {
            i4 = 5;
            i5 = i2;
            i6 = i;
            cVar = this;
        } else {
            i4 = 6;
            i5 = i2;
            i6 = i;
            cVar = this;
        }
        cVar.mo36a(6, i6, i5, 0, 0, 0, i4);
    }

    public void hideNotify() {
        m367i();
    }

    /* renamed from: i */
    public final void m367i() {
        if (this.gameMode == 2) {
            this.gameMode = 10;
            this.f326v = true;
            this.f204ao = 10;
            this.f203an = 0;
            this.f219b = false;
            this.samplePlayer.m388a();
            return;
        }
        this.f316q = true;
    }

    /* renamed from: j */
    public final void m368j() {
        if (this.f326v) {
            m178ag();
            if (this.f204ao > 0) {
                this.f204ao--;
                return;
            }
            this.f204ao = 0;
            this.f326v = false;
        }
    }

    /* renamed from: k */
    public final void m369k() {
        mo54b(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Unknown variable types count: 6 */
    public void keyPressed(int i) {
        boolean[] zArr;
        ?? r0;
        boolean[] zArr2;
        int i2;
        RunnableC0002c cVar;
        boolean z = false;
        ?? r1 = 0;
        if (!this.f115G && this.gameMode == 1) {
            if (i == "230691".charAt(this.f213ax)) {
                i2 = this.f213ax + 1;
                cVar = this;
            } else {
                i2 = 0;
                cVar = this;
            }
            cVar.f213ax = i2;
            if (this.f213ax == 6) {
                this.f115G = true;
            }
        }
        if (!f83m || this.gameMode != 2) {
            switch (m356e(i)) {
                case 1:
                    this.f163a[3] = true;
                    zArr2 = this.f163a;
                    r1 = 2;
                    break;
                case 2:
                case 14:
                    zArr2 = this.f163a;
                    r1 = 2;
                    break;
                case 3:
                    this.f163a[4] = true;
                    zArr2 = this.f163a;
                    r1 = 2;
                    break;
                case 4:
                case 16:
                    zArr2 = this.f163a;
                    r1 = 3;
                    break;
                case 5:
                case 18:
                    zArr2 = this.f163a;
                    break;
                case 6:
                case 17:
                    zArr2 = this.f163a;
                    r1 = 4;
                    break;
                case 7:
                    zArr = this.f163a;
                    r0 = 3;
                    ?? r02 = r0 == true ? 1 : 0;
                    ?? r03 = r0 == true ? 1 : 0;
                    ?? r04 = r0 == true ? 1 : 0;
                    zArr[r02] = true;
                    zArr2 = this.f163a;
                    r1 = 1;
                    break;
                case 8:
                case 15:
                    zArr2 = this.f163a;
                    r1 = 1;
                    break;
                case 9:
                    zArr = this.f163a;
                    r0 = 4;
                    ?? r022 = r0 == true ? 1 : 0;
                    ?? r032 = r0 == true ? 1 : 0;
                    ?? r042 = r0 == true ? 1 : 0;
                    zArr[r022] = true;
                    zArr2 = this.f163a;
                    r1 = 1;
                    break;
                case 10:
                    this.f163a[9] = true;
                    if (this.f115G && this.f290f[4]) {
                        if (!this.f118H) {
                            z = true;
                        }
                        this.f118H = z;
                        return;
                    }
                    return;
                case 11:
                default:
                    return;
                case 12:
                    zArr2 = this.f163a;
                    r1 = 5;
                    break;
                case 13:
                    zArr2 = this.f163a;
                    r1 = 6;
                    break;
            }
            zArr2[r1 == true ? 1 : 0] = true;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public void keyReleased(int i) {
        boolean[] zArr;
        boolean[] zArr2;
        char c = 4;
        char c2 = 3;
        switch (m356e(i)) {
            case 1:
                this.f163a[3] = false;
                c2 = 2;
                zArr2 = this.f163a;
                break;
            case 2:
            case 14:
                c2 = 2;
                zArr2 = this.f163a;
                break;
            case 3:
                this.f163a[4] = false;
                c2 = 2;
                zArr2 = this.f163a;
                break;
            case 4:
            case 16:
                zArr2 = this.f163a;
                break;
            case 5:
            case 18:
                c2 = 0;
                zArr2 = this.f163a;
                break;
            case 6:
            case 17:
                c2 = 4;
                zArr2 = this.f163a;
                break;
            case 7:
                zArr = this.f163a;
                c = 3;
                zArr[c] = false;
                c2 = 1;
                zArr2 = this.f163a;
                break;
            case 8:
            case 15:
                c2 = 1;
                zArr2 = this.f163a;
                break;
            case 9:
                zArr = this.f163a;
                zArr[c] = false;
                c2 = 1;
                zArr2 = this.f163a;
                break;
            case 10:
                c2 = '\t';
                zArr2 = this.f163a;
                break;
            case 11:
            default:
                return;
            case 12:
                c2 = 5;
                zArr2 = this.f163a;
                break;
            case 13:
                c2 = 6;
                zArr2 = this.f163a;
                break;
        }
        zArr2[c2] = false;
    }

    /* renamed from: l */
    public final void m370l() {
        Graphics graphics;
        Image[] imageArr;
        char c;
        if ((this.lives <= 0 && f76j) || (f21X && this.f330x == 59 && this.f332y == 9)) {
            int i = 112 - (((f51d >> 1) - 64) - 9);
            int i2 = (f51d >> 1) + 9 + 112;
            int i3 = (660 - this.f334z) * 6;
            int i4 = 120 - i3 < 8 ? 112 : i3;
            if (this.f330x == 59 && this.f332y == 9) {
                drawSprite(screenBuffer, uiObjGfx[15], 0, 0, 64, 16, rotationQuadrants[0], i4 - i, f70h >> 1, 20, true);
                graphics = screenBuffer;
                imageArr = uiObjGfx;
                c = 15;
            } else {
                drawSprite(screenBuffer, uiObjGfx[14], 0, 0, 64, 16, rotationQuadrants[0], i4 - i, f70h >> 1, 20, true);
                graphics = screenBuffer;
                imageArr = uiObjGfx;
                c = 14;
            }
            drawSprite(graphics, imageArr[c], 0, 16, 64, 16, rotationQuadrants[0], i2 - i4, f70h >> 1, 20, true);
        }
    }

    /* renamed from: m */
    public final void m371m() {
        int i;
        int[][] iArr = {new int[]{0, 0, 64, 64}, new int[]{0, 65, 64, 64}, new int[]{0, 129, 64, 64}, new int[]{0, 192, 36, 48}};
        if (this.rings >= 50 && this.objData[5] == 0) {
            int i2 = rotationQuadrants[0];
            int i3 = (this.f302j >> 1) & 3;
            if (i3 == 3) {
                i2 = rotationQuadrants[4];
                i = 1;
            } else {
                i = i3;
            }
            m204b(47, iArr[i][0], iArr[i][1], iArr[i][2], iArr[i][3], i2, this.objData[2], this.objData[3]);
        }
    }

    /* renamed from: n */
    public final void m372n() {
        if (this.rings >= 50) {
            this.objData[6] = this.objData[2];
            this.objData[7] = this.objData[3];
            if (this.objData[5] != 0) {
                this.objData[10] = this.f302j - this.objData[11];
                if (this.objData[10] > 5) {
                    this.objData[10] = 5;
                }
            } else if (m135a(mo33a(), mo48b() - 12, f40b[0], f40b[1] - 12, 12, 12, this.objData[2], this.objData[3], this.objData[6], this.objData[7], 32, 32) >= 0) {
                this.objData[5] = 1;
                this.objData[0] = -1;
                this.objData[11] = this.f302j;
                this.f308l++;
                this.f127K = true;
            }
        }
    }

    /* renamed from: o */
    public final void m373o() {
        this.f297h = (int[][]) Array.newInstance(Integer.TYPE, this.f245bc, 15);
        this.samplePlayer.playSample(13, 1, false);
        this.f162a[0] = "";
        this.f162a[1] = "";
        this.f246bd = 0;
        this.f226bC = 30;
        this.f145T = true;
        this.f297h[0][0] = 1;
        this.f297h[0][1] = 10;
        this.f297h[0][2] = 240;
        this.f297h[0][3] = 28;
        this.f297h[0][8] = 1 - f32a[this.f297h[0][1]][2];
        this.f297h[0][9] = 0;
        this.f297h[1][0] = 1;
        this.f297h[1][1] = this.f202am + 4;
        this.f297h[1][2] = 240;
        this.f297h[1][3] = 60;
        this.f297h[1][8] = 25 - f32a[this.f297h[0][1]][2];
        this.f297h[1][9] = 3;
        this.f297h[2][0] = 1;
        this.f297h[2][1] = 8;
        this.f297h[2][2] = 240;
        this.f297h[2][3] = 70;
        this.f297h[2][8] = -1 - f32a[this.f297h[0][1]][2];
        this.f297h[2][9] = 2;
        this.f297h[3][0] = 1;
        this.f297h[3][1] = 14;
        this.f297h[3][2] = 0 - f32a[this.f297h[3][1]][2];
        this.f297h[3][3] = 30;
        this.f297h[3][8] = -f32a[this.f297h[3][1]][2];
        this.f297h[3][9] = 0;
        this.f310m = (f51d + f32a[this.f297h[3][1]][2]) >> 1;
        this.f297h[4][0] = 1;
        this.f297h[4][1] = 15;
        this.f297h[4][2] = 0 - f32a[this.f297h[4][1]][2];
        this.f297h[4][3] = 50;
        this.f297h[4][8] = ((-f32a[this.f297h[3][1]][2]) / 2) - (f32a[this.f297h[4][1]][2] / 2);
        this.f297h[4][9] = 1;
        for (int i = 0; i < this.f297h.length; i++) {
            if (this.f297h[i][0] == 1) {
                this.f297h[i][4] = f32a[this.f297h[i][1]][0];
                this.f297h[i][5] = f32a[this.f297h[i][1]][1];
                this.f297h[i][6] = f32a[this.f297h[i][1]][2];
                this.f297h[i][7] = f32a[this.f297h[i][1]][3];
            }
        }
    }

    /* renamed from: p */
    public final void m374p() {
        int[] iArr;
        char c;
        int i;
        try {
            this.gameMode = 4;
            this.f322t = false;
            this.f324u = false;
            this.f314p = false;
            this.f155Z = true;
            this.f189aa = true;
            this.f265bw = 0;
            this.f248bf = 2100;
            this.f127K = false;
            this.f297h = (int[][]) Array.newInstance(Integer.TYPE, this.f245bc, 15);
            this.f305k = 0;
            this.f302j = 0;
            this.invincibilityTimer = 0;
            this.f317r = 0;
            this.f235bL = 0;
            this.f234bK = 0;
            this.f326v = true;
            this.f204ao = 10;
            this.f269c = 0;
            this.f105C = false;
            if (this.f124J) {
                loadGameObjGfx();
            }
            this.f246bd = 0;
            this.f297h[0][0] = 1;
            this.f297h[0][1] = 10;
            this.f297h[0][2] = 240;
            this.f297h[0][3] = 42;
            this.f297h[0][8] = 1 - f32a[this.f297h[0][1]][2];
            this.f297h[0][9] = 0;
            this.f297h[1][0] = 1;
            this.f297h[1][1] = this.f202am + 4;
            this.f297h[1][2] = 240;
            this.f297h[1][3] = 68;
            this.f297h[1][8] = 25 - f32a[this.f297h[0][1]][2];
            this.f297h[1][9] = 3;
            this.f297h[2][0] = 1;
            this.f297h[2][1] = 8;
            this.f297h[2][2] = 240;
            this.f297h[2][3] = 76;
            this.f297h[2][8] = -1 - f32a[this.f297h[0][1]][2];
            this.f297h[2][9] = 2;
            this.f297h[3][0] = 1;
            this.f297h[3][1] = f97x[this.f201al];
            this.f297h[3][2] = 0 - f32a[this.f297h[3][1]][2];
            this.f297h[3][3] = 44;
            this.f297h[3][8] = -f32a[this.f297h[3][1]][2];
            this.f297h[3][9] = 0;
            this.f310m = (f51d >> 1) + (f32a[this.f297h[3][1]][2] / 2);
            if (this.f201al == 6) {
                this.f297h[4][0] = 1;
                this.f297h[4][1] = 3;
                this.f297h[4][2] = 0 - f32a[this.f297h[4][1]][2];
                this.f297h[4][3] = 60;
                iArr = this.f297h[4];
                c = '\b';
                i = -48;
            } else {
                this.f297h[4][0] = 1;
                this.f297h[4][1] = 3;
                this.f297h[4][2] = 0 - f32a[this.f297h[4][1]][2];
                this.f297h[4][3] = 60;
                iArr = this.f297h[4];
                c = '\b';
                i = -65;
            }
            iArr[c] = i;
            this.f297h[4][9] = 1;
            for (int i2 = 0; i2 < this.f297h.length; i2++) {
                if (this.f297h[i2][0] == 1) {
                    this.f297h[i2][4] = f32a[this.f297h[i2][1]][0];
                    this.f297h[i2][5] = f32a[this.f297h[i2][1]][1];
                    this.f297h[i2][6] = f32a[this.f297h[i2][1]][2];
                    this.f297h[i2][7] = f32a[this.f297h[i2][1]][3];
                }
            }
            mo70e(true);
        } catch (Exception e) {
        }
        m363g();
    }

    public void paint(Graphics graphics) {
    }

    public void playerUpdate(Player player, String str, Object obj) {
        if (str == "endOfMedia") {
            switch (this.samplePlayer.f336a) {
                case 7:
                case 21:
                case 22:
                case 23:
                    mo70e(false);
                    return;
                case 14:
                    m170aI();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: r */
    public final void m375r() {
        if (this.gameMode == 2 && !this.f145T && this.f246bd < 30) {
            return;
        }
        if (!this.f115G || !this.f290f[4] || !this.f118H) {
            if (f80l || f83m) {
                int[] iArr = f47c;
                iArr[11] = iArr[11] + this.sonicMaxSpd;
            } else if (f76j) {
                int[] iArr2 = f47c;
                iArr2[1] = iArr2[1] + f47c[5];
                int[] iArr3 = f47c;
                iArr3[5] = iArr3[5] + this.sonicGravity;
            } else if (this.f127K) {
            } else {
                if (mo86n()) {
                    if (mo94t()) {
                        m187ap();
                    }
                } else if (mo91s()) {
                    m186ao();
                }
            }
        } else if (this.f163a[2]) {
            int[] iArr4 = f47c;
            iArr4[1] = iArr4[1] - 2048;
        } else if (this.f163a[1]) {
            int[] iArr5 = f47c;
            iArr5[1] = iArr5[1] + 2048;
        } else if (this.f163a[3]) {
            int[] iArr6 = f47c;
            iArr6[0] = iArr6[0] - 2048;
        } else if (this.f163a[4]) {
            int[] iArr7 = f47c;
            iArr7[0] = iArr7[0] + 2048;
        }
    }

    public void run() {
    }

    /* renamed from: s */
    public final void m376s() {
        if (!f67g && f74i) {
            f74i = false;
        }
        this.f247be = 2;
    }

    public void showNotify() {
        m363g();
        this.f239bP = 0;
    }

    public void sizeChanged(int i, int i2) {
        screenWidth = i;
        screenHeight = i2;
        f51d = screenWidth;
        f66g = screenWidth;
        f70h = (f66g * 3) >> 2;
        f66g = Math.min(f66g, 480);
        f70h = Math.min(f70h, 336);
        f34aE = (f66g / 16) + 2;
        f35aF = (f70h / 16) + 2;
        this.f236bM = (((-f66g) * 2) * 4) / 4;
        this.f237bN = ((f66g * 2) * 4) / 4;
        this.f238bO = ((f70h * 4) * 4) / 4;
        f73i = (screenHeight - f70h) >> 1;
        f57e = f70h + 72;
        f62f = (screenHeight - f57e) >> 1;
        f37aI = f73i + (f70h >> 1);
        f36aH = f66g >> 1;
        this.f243ba = (f70h * 3) >> 2;
        this.f187aZ = f51d >> 1;
        this.f223b = (int[][][]) Array.newInstance(Integer.TYPE, f34aE, f35aF, 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ee  */
    /* renamed from: t */
    public final void m377t() {
        int i;
        char c;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3 = 112;
        if (this.f250bh > 0) {
            i3 = (this.f250bh << 1) + 112;
        }
        if (this.f249bg > 0) {
            i3 -= this.f249bg << 1;
        }
        if (this.zoneID == 0 && this.actID == 3) {
            this.f128K[0] = 0;
            this.f128K[2] = 0;
            this.f128K[1] = 3840;
            this.f128K[3] = 128;
            if (this.f324u) {
                int[] iArr3 = this.f128K;
                i = iArr3[1] + 768;
                c = 1;
                iArr = iArr3;
            }
            if (f76j) {
            }
        } else {
            if (!(this.zoneID == 5 && this.actID == 3)) {
                this.f128K[0] = 0;
                this.f128K[2] = 0;
                this.f128K[1] = f50c[this.zoneID][this.actID][2] + 320;
                this.f128K[3] = mo55c() + (240 - (184 - i3));
                if (this.f269c == 2) {
                    this.f105C = true;
                }
                if (!(this.actID == 2 && this.zoneID == 1)) {
                    if (this.actID < 2) {
                        if (mo33a() >= f65f[this.zoneID][this.actID] || this.f269c == 1) {
                            this.f128K[0] = f65f[this.zoneID][this.actID] - 144;
                            this.f269c = 1;
                        }
                    } else if (this.f269c == 2 && this.zoneID != 1) {
                        this.f128K[0] = (short) (f50c[this.zoneID][this.actID][2] + 320);
                    }
                }
                if (this.actID == 2 && this.zoneID != 1 && this.f324u) {
                    int[] iArr4 = this.f128K;
                    iArr4[1] = iArr4[1] + 256;
                }
                if (this.f322t) {
                    if (this.zoneID == 0) {
                        this.f128K[0] = (10752 - (f66g >> 1)) - 16;
                        this.f128K[1] = (10752 - (f66g >> 1)) + f66g + 16;
                        this.f128K[2] = 0;
                        iArr2 = this.f128K;
                        i2 = 800;
                    } else if (this.zoneID == 2) {
                        this.f128K[0] = (6304 - (f66g >> 1)) - 16;
                        this.f128K[1] = (6304 - (f66g >> 1)) + f66g + 16;
                        this.f128K[2] = 560;
                        iArr2 = this.f128K;
                        i2 = 568;
                    } else if (this.zoneID == 4) {
                        this.f128K[0] = (11424 - (f66g >> 1)) - 40;
                        this.f128K[1] = (11424 - (f66g >> 1)) + f66g + 40;
                        this.f128K[2] = 1232;
                        iArr2 = this.f128K;
                        i2 = 1248;
                    } else if (this.zoneID == 3) {
                        this.f128K[0] = 8400 - (f66g >> 1);
                        this.f128K[1] = (8400 - (f66g >> 1)) + f66g;
                        this.f128K[2] = 528;
                        iArr2 = this.f128K;
                        i2 = 576;
                    }
                    iArr2[3] = i2 + i3;
                }
                if (this.f324u) {
                    if (this.zoneID == 0) {
                        this.f128K[0] = 10752 - (f66g >> 1);
                        int[] iArr5 = this.f128K;
                        i = iArr5[1] + 16;
                        c = 1;
                        iArr = iArr5;
                    } else if (this.zoneID == 2) {
                        this.f128K[0] = 6304 - (f66g >> 1);
                        int[] iArr6 = this.f128K;
                        i = iArr6[1] + 16;
                        c = 1;
                        iArr = iArr6;
                    } else if (this.zoneID == 4) {
                        this.f128K[0] = 11424 - (f66g >> 1);
                        int[] iArr7 = this.f128K;
                        i = iArr7[1] - 16;
                        c = 1;
                        iArr = iArr7;
                    } else if (this.zoneID == 3) {
                        int[] iArr8 = this.f128K;
                        i = 8400 - (f66g >> 1);
                        c = 0;
                        iArr = iArr8;
                    }
                }
            }
            if (f76j) {
                m192au();
                return;
            } else {
                m243i(i3);
                return;
            }
        }
        iArr[c] = i;
        if (f76j) {
        }
    }

    /* renamed from: u */
    public final void m378u() {
        int[] iArr;
        int i;
        int[] iArr2;
        int i2;
        if (this.f109E || this.invincibilityTimer > 0) {
            return;
        }
        if (!this.f115G || !this.f290f[0]) {
            if (this.f321t > 0) {
                this.f321t = 0;
                this.f317r = 60;
                f52d = true;
                f67g = true;
                if (f47c[12] == 1) {
                    iArr2 = f47c;
                    i2 = 512;
                } else {
                    iArr2 = f47c;
                    i2 = -512;
                }
                iArr2[3] = i2;
                f47c[5] = -1024;
                f47c[12] = (f47c[12] + 1) % 2;
                f47c[13] = 0;
                f47c[14] = 0;
            } else if (this.f317r > 0) {
                return;
            } else {
                if (this.rings <= 0) {
                    mo96v();
                    return;
                }
                this.f317r = 60;
                f52d = true;
                f67g = true;
                if (!m226e() && f47c[12] == 1) {
                    iArr = f47c;
                    i = 512;
                } else {
                    iArr = f47c;
                    i = -512;
                }
                iArr[3] = i;
                f47c[5] = -1024;
                f47c[12] = (f47c[12] + 1) % 2;
                f47c[13] = 0;
                f47c[14] = 0;
                if (!this.f115G || !this.f290f[0]) {
                    m252k(mo33a(), mo48b() - 12, this.rings);
                    this.rings = 0;
                }
            }
            this.f109E = true;
        }
    }

    /* renamed from: v */
    public final void mo96v() {
        if (f76j) {
            this.f326v = true;
            this.f204ao = 10;
            return;
        }
        f87o = true;
        this.f248bf = 2100;
        f67g = true;
        f52d = false;
        f74i = false;
        f76j = true;
        this.f149V = true;
        this.f320s = false;
        f47c[10] = 0;
        f47c[13] = 0;
        f47c[14] = 0;
        this.f255bm = 5;
        f47c[3] = 0;
        f47c[5] = (mo49b(0) * this.jmpSpeed) / 100;
        this.f334z = 120;
    }

    /* renamed from: w */
    public final void mo97w() {
        int g;
        int i;
        int b;
        int i2;
        int[] iArr;
        int[] iArr2;
        int i3;
        int i4;
        int[] iArr3;
        char c;
        int i5;
        int i6;
        int i7;
        int i8;
        RunnableC0002c cVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c2 = 4;
        int i14 = 11;
        if (!this.f127K) {
            if (this.f317r > 0) {
                this.f317r--;
            }
            if ((this.f317r & 1) != 1) {
                int i15 = rotationQuadrants[0];
                int i16 = (540 - sonicAngle) % 360;
                if (f47c[12] == 1) {
                    i15 = rotationQuadrants[4];
                }
                f47c[11] = f47c[11] % 92160;
                int a = mo33a();
                int b2 = mo48b();
                int i17 = 33;
                if (f46c) {
                    i14 = 28;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i15;
                } else if (f52d && f67g) {
                    if (f47c[12] == 1) {
                        c = 0;
                        iArr3 = rotationQuadrants;
                    } else {
                        iArr3 = rotationQuadrants;
                        c = 4;
                    }
                    g = iArr3[c];
                    b2 -= 5;
                    i14 = 26;
                    i = 1;
                    b = 0;
                    i2 = 0;
                } else if (this.f257bo > 0) {
                    this.f257bo--;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i15;
                } else if (f63f) {
                    g = rotationQuadrants[4];
                    f63f = false;
                    i14 = ((this.f302j >> 1) % 2) + 35;
                    i = 1;
                    b = 0;
                    i2 = 0;
                } else if (f58e) {
                    if ((this.f302j >> 1) % 5 < 3) {
                        i3 = rotationQuadrants[0];
                        i4 = ((this.f302j >> 1) % 4) + 32;
                    } else {
                        i3 = rotationQuadrants[4];
                        i4 = 36 - ((this.f302j >> 1) % 4);
                    }
                    f58e = false;
                    i14 = i4;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i3;
                } else if (f74i && f67g) {
                    int i18 = (!f67g || sonicAngle != 270) ? 0 : -16;
                    a += i18;
                    i14 = (((f47c[11] / this.sonicMaxSpd) / 4) % 5) + 6;
                    i = 1;
                    b = 0;
                    i2 = i18;
                    g = i15;
                } else if (f17Q) {
                    b2 -= 5;
                    i14 = ((this.f302j / 2) % 2) + 25;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i15;
                } else if (f76j) {
                    if (f20W) {
                        i14 = 29;
                        i = 1;
                        b = 0;
                        i2 = 0;
                        g = i15;
                    } else {
                        i14 = 27;
                        i = 1;
                        b = 0;
                        i2 = 0;
                        g = i15;
                    }
                } else if (f74i && !f67g) {
                    int a2 = ((mo34a(i16) * 16) / 100) - 16;
                    b = -15 - ((mo49b(i16) * 15) / 100);
                    a += a2;
                    b2 += b;
                    i17 = 20;
                    i14 = (((f47c[11] / this.sonicMaxSpd) / 4) % 4) + 6;
                    i = 1;
                    i2 = a2;
                    g = i15;
                } else if (f78k) {
                    i14 = 22;
                    f78k = false;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i15;
                } else if (f18R) {
                    i14 = 5;
                    f18R = false;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i15;
                } else if (this.f247be > 0) {
                    i14 = ((this.f302j / 4) % 4) + 37;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i15;
                } else if (f47c[10] != 0 || f67g) {
                    if (f67g || !((f47c[14] == 2 && f47c[10] > 0 && f47c[12] == 1) || (f47c[14] == 1 && f47c[10] < 0 && f47c[12] == 0))) {
                        int i19 = 0;
                        while (i19 < 7 && ((i19 * 45) + 23 >= i16 || ((i19 + 1) * 45) + 23 < i16)) {
                            i19++;
                        }
                        g = m234g(i19);
                        i = i19 % 2;
                        i17 = 20;
                        int i20 = (Math.abs(f47c[10]) >= this.sonicMaxSpd || f19S) ? i == 1 ? (((f47c[11] / this.sonicMaxSpd) / 4) % 4) + 18 : (((f47c[11] / this.sonicMaxSpd) / 4) % 4) + 6 : i == 1 ? (((f47c[11] / this.sonicMaxSpd) / 4) % 6) + 12 : ((f47c[11] / this.sonicMaxSpd) / 4) % 6;
                        int i21 = framedata[i == 1 ? (char) 151 : 152][i20][2] >> 1;
                        int i22 = framedata[i == 1 ? (char) 151 : 152][i20][3] >> 1;
                        int a3 = (-i21) + ((i21 * mo34a(i16)) / 100);
                        b = (-i22) - ((i22 * mo49b(i16)) / 100);
                        a += a3;
                        b2 += b;
                        i14 = i20;
                        i2 = a3;
                    } else {
                        int i23 = rotationQuadrants[0];
                        if (f47c[12] == 0) {
                            i23 = rotationQuadrants[4];
                        }
                        i14 = (((f47c[11] / this.sonicMaxSpd) / 4) % 2) + 30;
                        i = 1;
                        b = 0;
                        i2 = 0;
                        g = i23;
                    }
                } else if (this.f112F) {
                    if (this.f207ar == 1) {
                        iArr2 = rotationQuadrants;
                        c2 = 0;
                    } else {
                        iArr2 = rotationQuadrants;
                    }
                    g = iArr2[c2];
                    i14 = ((this.f210au / 8) % 2) + 23;
                    i = 1;
                    b = 0;
                    i2 = 0;
                } else if (!this.f320s && ((sonicAngle <= 22 || sonicAngle >= 338) && ((!m227e(mo33a() + 12, mo48b()) && !m227e(mo33a() + 12, mo48b() + 16)) || (!m227e(mo33a() - 12, mo48b()) && !m227e(mo33a() - 12, mo48b() + 16))))) {
                    if (m227e(mo33a() + 12, mo48b()) || m227e(mo33a() + 12, mo48b() + 16)) {
                        iArr = rotationQuadrants;
                    } else {
                        iArr = rotationQuadrants;
                        c2 = 0;
                    }
                    g = iArr[c2];
                    i14 = ((this.f210au / 8) % 2) + 23;
                    i = 1;
                    b = 0;
                    i2 = 0;
                } else if (this.f210au < 75) {
                    i14 = 0;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i15;
                } else if (this.f210au < 90) {
                    i14 = 1;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i15;
                } else if (this.f210au < 105) {
                    i14 = 2;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i15;
                } else {
                    i14 = ((this.f210au / 8) % 2) + 3;
                    i = 1;
                    b = 0;
                    i2 = 0;
                    g = i15;
                }
                if (i == 1) {
                    i5 = 151;
                    i6 = b2;
                    i7 = a;
                } else {
                    i5 = 152;
                    i6 = b2;
                    i7 = a;
                }
                m145a(i7, i6, i5, i14, g, i17);
                f19S = false;
                if (this.f247be > 0) {
                    this.f247be--;
                }
                if (f47c[10] != 0 || f67g) {
                    i8 = 0;
                    cVar = this;
                } else {
                    i8 = this.f210au + 1;
                    cVar = this;
                }
                cVar.f210au = i8;
                int a4 = ((mo34a(i16) * 16) / 100) - 16;
                int b3 = -16 - ((mo49b(i16) * 16) / 100);
                if (this.invincibilityTimer > 0) {
                    if (this.f302j % 2 != 0) {
                        return;
                    }
                    if (i2 == 0 && b == 0) {
                        m248j(mo33a(), mo48b() - 18, 0);
                    } else {
                        m248j(a4 + mo33a() + 16, b3 + mo48b() + 16, 0);
                    }
                } else if (this.f321t > 0) {
                    if (a4 == 0 && b3 == 0) {
                        i9 = mo33a() + i2;
                        i10 = mo48b() - 18;
                        i11 = b;
                    } else {
                        i9 = a4 + mo33a() + 16;
                        i10 = b3 + mo48b();
                        i11 = 16;
                    }
                    int i24 = i11 + i10;
                    if (!f74i || !f67g || i16 != 254) {
                        i12 = i24;
                        i13 = i9;
                    } else {
                        i12 = i24 - 8;
                        i13 = i9 + 16;
                    }
                    m204b(109, 48, (this.f302j % 2) * 48, 48, 48, rotationQuadrants[0], i13, i12 - 4);
                }
            }
        }
    }

    /* renamed from: x */
    public final void mo98x() {
        for (int i = 0; i < this.f307k.length; i++) {
            if (this.f307k[i][0] == 1 && this.f307k[i][1] == 0) {
                int[] iArr = this.f307k[i];
                iArr[5] = iArr[5] + 1;
                if (this.f307k[i][5] > 60) {
                    this.f307k[i][5] = 0;
                    this.f307k[i][0] = 0;
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo99y() {
        for (int i = 0; i < this.f307k.length; i++) {
            if (this.f307k[i][0] == 1 && this.f307k[i][1] == 0) {
                m204b(109, 0, ((this.f307k[i][5] / 4) % 2) * 48, 48, 48, rotationQuadrants[0], this.f307k[i][2], this.f307k[i][3]);
            }
        }
    }

    /* renamed from: z */
    public final void mo100z() {
        int length = this.objPosArr[this.actID].length / 7;
        try {
            if (this.f155Z) {
                if (this.f234bK < this.f235bL) {
                    this.f235bL = this.f234bK;
                } else {
                    this.f234bK = this.f235bL;
                }
                int i = this.f235bL * 7;
                int i2 = this.f234bK * 7;
                while (true) {
                    if ((((this.objPosArr[this.actID][i + 0] & 255) << 8) | (this.objPosArr[this.actID][i + 1] & 255)) - f98y[0] > this.f237bN) {
                        break;
                    }
                    if (Math.abs((((this.objPosArr[this.actID][i + 2] & 255) << 8) | (this.objPosArr[this.actID][i + 3] & 255)) - f98y[1]) < this.f238bO && !this.f273c[this.f125J[this.f235bL]]) {
                        m255l(this.f235bL);
                    }
                    this.f235bL++;
                    i += 7;
                    if (this.f235bL >= length) {
                        this.f235bL = length - 1;
                        break;
                    }
                }
                this.f155Z = false;
                while (true) {
                    if ((((this.objPosArr[this.actID][i2 + 0] & 255) << 8) | (this.objPosArr[this.actID][i2 + 1] & 255)) - f98y[0] >= this.f236bM) {
                        break;
                    }
                    this.f234bK++;
                    i2 += 7;
                    if (this.f234bK >= length) {
                        this.f234bK = length - 1;
                        break;
                    }
                }
            }
            if (this.f189aa) {
                if (this.f234bK > this.f235bL) {
                    this.f235bL = this.f234bK;
                } else {
                    this.f234bK = this.f235bL;
                }
                int i3 = this.f235bL * 7;
                int i4 = this.f234bK * 7;
                while (true) {
                    if ((((this.objPosArr[this.actID][i3 + 0] & 255) << 8) | (this.objPosArr[this.actID][i3 + 1] & 255)) - f98y[0] < this.f236bM) {
                        break;
                    }
                    if (Math.abs((((this.objPosArr[this.actID][i3 + 2] & 255) << 8) | (this.objPosArr[this.actID][i3 + 3] & 255)) - f98y[1]) < this.f238bO && !this.f273c[this.f125J[this.f235bL]]) {
                        m255l(this.f235bL);
                    }
                    this.f235bL--;
                    i3 -= 7;
                    if (this.f235bL < 0) {
                        this.f235bL = 0;
                        break;
                    }
                }
                this.f189aa = false;
                while ((((this.objPosArr[this.actID][i4 + 0] & 255) << 8) | (this.objPosArr[this.actID][i4 + 1] & 255)) - f98y[0] > this.f237bN) {
                    this.f234bK--;
                    i4 -= 7;
                    if (this.f234bK < 0) {
                        this.f234bK = 0;
                        return;
                    }
                }
            }
        } catch (Exception e) {
            this.f155Z = false;
        }
    }
}
