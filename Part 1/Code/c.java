import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
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

public class c extends Canvas implements Runnable, PlayerListener
{
    private String[] f;
    private String a, b;
    private static String[] d = new String[] {"SON", "SON", "SON", "SON", "SON"};
    private static final String[] e;
    public String[] a = new String[2],
                    b, c;

    private int[][][] b;
    private int[][] h, i, j, k;
    private int[] F, G, H, I, J, K, L, M;
    private int aJ, aK, aL, aM, aN, aO, aP, aQ, aR, aS, aT, aU, aV, aW, aX, aY, aZ, ba, bb, bc, bd, be, bf, bg, bh, bi, bj, bk, bl, bm, bn, bo, bp, bq, br, bs, bt, bu, bv, bw, bx, by, bz, bA, bB, bC, bD, bE, bF, bG, bH, bI, bJ, bK, bL, bM, bN, bO, bP, bQ, bR, bS;
    private final int[] E;
    private static int[] C = new int[] {10000, 8000, 6000, 4000, 2000}, // Time Bonus - hard-coded values, for some reason.
                         D = new int[] {0, 1, 2, 1, 0};
    private static int aH, aI;
    private static final int[][][] c;
    private static final int[][] l;
    public int[][] c, e;
    public int[] f, w, B;
    public int j = 1,
               k = 1,
               l, m, n, o, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, aa, ab, ac, ad, ae, af, ag, ah, ai, aj, ak, al, am, an, ao, ap, aq, ar, as, at, au, av, aw, ax, ay, az, aA, aB, aC, aD, aG;
    public static int[][][] a;
    public static int[] b, c, y, z;
    public static int b, c, d, e, f, g, h, i, p, aE, aF;
    public static final int[][] a, b, d, f, g;
    public static final int[] a, d, e, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, x, A;
    public static final int a;

    private boolean[] a = new boolean[10],
                      g = new boolean[10],
                      h;
    private boolean L, M, N, O, P, T, U, V, Y, Z, aa, ab;
    private static boolean Q, R, S, W, X;
    public boolean[] b, c, d, e, f;
    public boolean a = false,
                   b, p, q, r, s, t, u, v, w, x, y, C, D, E, F, G, H, I, J, K;
    public static boolean c, d, e, f, g, h, i, j, k, l, m, n, o, z, A, B;

    private static Image[] c = new Image[5];
    public static Image[] a, b;
    public static Image a;

    public static Font b;
    public static final Font a = Font.getFont(0, 0, 16);

    public static Graphics a;

    private static final Random a;

    public d a; // There are a lot of variables this could be an assignment of - will find out sooner or later.

    private byte[][] a = new byte[][] {{31, 32, 33}, {35, 34}, {39, 40, 41, 42, 43}},
                     c, d;
    private byte[] c, d, e, f, g, h, i, j, k, l, m;
    private byte d, e, f, g, h, i, j;
    private static final byte[][] b;
    public byte[] b;
    public byte a, b, c;
    public static final byte[] a;

    private static final short[][] b, c, d, e, f;
    public short[][] a;

    private Vector a;

    public MIDlet a;

    public long b, c, d, e;

    public static InputStream a;

    private static final char[] a;

    // Rotation expression?
    public static int a(int var0) {
        int var1;
        return (var1 = var0 % 360) >= 0 && var1 <= 90?A[var1] / 100:(var1 > 90 && var1 <= 180?A[90 - (var1 - 90)] / 100:(var1 > 180 && var1 <= 270?-1 * (A[var1 - 180] / 100):(var1 > 270 && var1 <= 359?-1 * (A[90 - (var1 - 270)] / 100):0)));
    }

    // Rotation expression?
    public static int b(int var0) {
        int var1;
        return (var1 = var0 % 360) >= 0 && var1 < 90?-1 * A[89 - var1] / 100:(var1 >= 90 && var1 < 180?A[var1 - 90] / 100:(var1 >= 180 && var1 < 270?A[89 - (var1 - 180)] / 100:(var1 >= 270 && var1 <= 359?-1 * (A[var1 - 270] / 100):0)));
    }

    public final void a() {
        this.W = 11424;
        this.X = 1232;

        for(int var1 = 0; var1 < 10; ++var1) {
            this.a[var1][0] = (short)(-160 + 32 * var1 + 16);
            this.a[var1][1] = 176;
            this.a[var1][2] = 0;
            this.a[var1][3] = 0;
        }

    }

    public final void b() {
        for(int var1 = 0; var1 < 10; ++var1) {
            if(this.a[var1][3] != 0) {
                this.b(23, this.a[var1][0], this.a[var1][1], 330, 300, 0);
                this.b(23, this.a[var1][0], this.a[var1][1], 30, 300, 1);
                this.b(23, this.a[var1][0], this.a[var1][1], 300, 300, 2);
                this.b(23, this.a[var1][0], this.a[var1][1], 60, 300, 3);
                this.a[var1][2] = 1;
            }
        }

    }

    public final void c() {
        if(this.w[14] == 0) {
            this.a();
            ++this.w[14];
        }

        for(int var3 = 0; var3 < 10; ++var3) {
            if(this.a[var3][2] == 0) {
                int var10000;
                int var1;
                short var10001;
                if(this.a[var3][3] == 0) {
                    var1 = this.W + this.a[var3][0];
                    var10000 = this.X;
                    var10001 = this.a[var3][1];
                } else {
                    var1 = this.W + (this.S + this.U) / 100;
                    var10000 = this.X + (this.T + this.V) / 100;
                    var10001 = 24;
                }

                int var2 = var10000 + var10001;
                this.c(var1, var2, 16, 16);
            }
        }

    }

    public final void d() {
        int[] var1 = this.w;
        boolean var4 = false;
        this.e(var1);
        if(this.L > 99) {
            if(this.b()) {
                var1[0] = 0;
            }

        } else {
            this.P += 200;
            this.U = 0;
            this.V = a(this.P / 100) * 12;
            int var3 = (a() - (this.W - 160)) / 32;
            int var2 = (this.S + 16000) / 3200;
            int var5 = Math.abs(this.S / 100 + 160 - (var2 * 32 + 16));
            if(var3 == var2 && var5 < 3 && this.J == 0) {
                var4 = true;
            }

            if(this.J > 0) {
                --this.J;
            }

            if(this.Q > 16 && this.a(var1[2], var1[3] + 8 - 32 + this.Q, 14, 32, false) != 0) {
                this.u();
            }

            if(this.c() && this.L > 3 && this.aa == 0) {
                d(var1[2], var1[3]);
                if(this.aa == 0 && this.L < 100) {
                    if(--this.ae <= 0) {
                        this.b();
                        this.L = 100;
                        return;
                    }

                    this.ac = 3;
                    this.aa = this.ad = 60;
                }
            }

            c var10000;
            int var10001;
            label137: {
                switch(this.L) {
                case 7:
                case 8:
                case 9:
                default:
                    this.L = 1;
                case 1:
                    this.ac = 0;
                    this.M = 2;
                    this.S = 19200;
                    this.T = 10000;
                    this.O = 0;
                    this.P = 0;
                    this.Y = 50;
                    this.J = 90;
                    var4 = false;
                    ++this.L;
                case 2:
                    if(this.Y > 0) {
                        break label137;
                    }

                    ++this.L;
                case 3:
                    this.M = 2;
                    this.T -= 20;
                    this.S -= 100;
                    if(this.S > 6400) {
                        break label137;
                    }

                    this.S = 6400;
                    this.M = 0;
                    this.ac = 1;
                    this.ad = 60;
                    this.Y = 60;
                    ++this.L;
                case 4:
                    if(var4) {
                        var10000 = this;
                        var10001 = 10;
                        break;
                    } else {
                        this.M = 2;
                        this.N = 0;
                        this.S -= 70;
                        if(this.S > -12000) {
                            break label137;
                        }

                        this.S = -12000;
                        ++this.L;
                    }
                case 5:
                    if(var4) {
                        var10000 = this;
                        var10001 = 10;
                        break;
                    } else {
                        this.M = 2;
                        this.N = 1;
                        this.S += 70;
                        if(this.S < 12000) {
                            break label137;
                        }

                        this.S = 12000;
                        ++this.L;
                    }
                case 6:
                    var10000 = this;
                    var10001 = 4;
                    break;
                case 10:
                    this.M = 0;
                    this.ac = 1;
                    ++this.L;
                case 11:
                    this.T += 120;
                    if(this.Q < 32) {
                        ++this.Q;
                    }

                    if(this.T < 15400) {
                        break label137;
                    }

                    this.T = 15400;
                    this.Y = 48;
                    this.a[var2][3] = 1;
                    ++this.L;
                case 12:
                    this.U = 0;
                    this.V = c(400) - 200;
                    if(this.Y > 0) {
                        break label137;
                    }

                    this.U = 0;
                    this.V = 0;
                    ++this.L;
                case 13:
                    this.T -= 300;
                    if(this.T > 2400) {
                        break label137;
                    }

                    this.T = 2400;
                    this.Y = 50;
                    ++this.L;
                case 14:
                    this.U = 0;
                    this.V = c(400) - 200;
                    if(this.Q > 0) {
                        --this.Q;
                    }

                    if(this.Y > 0) {
                        break label137;
                    }

                    if(this.a[var2][2] == 0) {
                        this.U = 0;
                        this.V = 0;
                        this.b(23, var1[2], var1[3] + 24, 330, 300, 0);
                        this.b(23, var1[2], var1[3] + 24, 30, 300, 1);
                        this.b(23, var1[2], var1[3] + 24, 300, 300, 2);
                        this.b(23, var1[2], var1[3] + 24, 60, 300, 3);
                        this.a[var2][2] = 1;
                    }

                    this.Y = 30;
                    ++this.L;
                case 15:
                    if(this.Y > 0) {
                        break label137;
                    }

                    this.J = 120;
                    var10000 = this;
                    var10001 = this.N == 0?4:5;
                }

                var10000.L = var10001;
            }

            this.c(var1);
            if(this.L == 4 || this.L == 5) {
                if(Math.abs(var1[2] - a()) < 64) {
                    if(this.T <= 1000) {
                        return;
                    }

                    var10000 = this;
                    var10001 = this.T - 160;
                } else {
                    if(this.T >= 8000) {
                        return;
                    }

                    var10000 = this;
                    var10001 = this.T + 140;
                }

                var10000.T = var10001;
            }

        }
    }

    public void hideNotify() {
        this.i();
    }

    public void showNotify() {
        this.g();
        this.bP = 0;
    }

    // Game initialiser?
    public c(MIDlet var1, int var2) {
        short[][] var10000 = new short[][]{{0, 0, 64, 96}, {64, 0, 64, 96}, {128, 0, 64, 96}};
        this.l = 0;
        this.E = new int[]{5898300, this.getWidth() - 90 - 16 << 16 | 60, 4587610, this.getWidth() - 70 - 16 << 16 | 90, 5898366, this.getWidth() - 90 - 16 << 16 | 126};
        this.aN = 0;
        this.aO = 0;
        this.aQ = 0;
        this.aT = 0;
        this.aZ = d >> 1;
        this.ba = h * 3 >> 2;
        this.b = new String[93];
        this.f = new String[357];
        this.M = false;
        this.bc = 10;
        this.h = new int[this.bc][15];
        this.be = 0;
        this.bf = 2100;
        this.bg = 0;
        this.bh = 0;
        this.n = 1536;
        this.o = 12;
        this.bi = 128;
        this.bj = 56;
        this.bk = 1664;
        this.bl = 896;
        this.F = new int[2];
        this.h = new boolean[4];
        this.F = 0;
        this.G = 0;
        this.c = new int[30][25];
        this.a = new short[10][4];
        this.J = 0;
        this.f = new int[]{64, 32, 64};
        this.b = new boolean[256];
        this.p = false;
        this.c = new byte[8192];
        this.e = new int[256][25];
        this.w = new int[25];
        this.k = new int[30][10];
        this.q = false;
        this.r = false;
        this.e = new boolean[256];
        this.ah = 0;
        this.bq = 0;
        this.br = 0;
        this.bs = 0;
        this.bt = 0;
        this.aj = -1;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.G = new int[2];
        this.H = new int[2];
        this.I = new int[2];
        this.j = new byte[8192];
        this.c = new byte[4][];
        this.k = new byte[512];
        this.bw = 0;
        this.t = false;
        this.u = false;
        this.h = 9;
        this.an = 0;
        this.l = new byte[4];
        this.y = false;
        this.by = 0;
        this.bz = 0;
        this.bA = 0;
        this.bB = 0;
        this.T = false;
        this.U = false;
        this.C = false;
        this.bF = 0;
        this.bG = 0;
        this.bI = 10;
        this.K = new int[4];
        this.bJ = 0;
        this.E = false;
        this.as = 0;
        this.at = 0;
        this.au = 0;
        this.bK = 0;
        this.bL = 0;
        this.Z = false;
        this.aa = false;
        this.av = 0;
        this.m = new byte[4];
        this.aw = 0;
        this.f = new boolean[]{false, false, false, false, false};
        this.G = false;
        this.ax = 0;
        this.ay = 0;
        this.H = false;
        this.az = 0;
        this.aA = 0;
        this.aB = 0;
        this.aC = -2147483648;
        this.B = new int[6];
        this.aD = 0;
        this.c = new String[]{"", ""};
        this.aG = 3;
        this.J = false;
        this.ab = false;
        this.bR = 0;
        this.L = new int[3];
        this.M = new int[8];
        this.bS = 0;
        this.b = "";
        this.K = false;
        this.a = var1;
        this.az = var2;
        this.setFullScreenMode(true);
        this.sizeChanged(this.getWidth(), this.getHeight());
    }

    // Button press event handler
    public void keyPressed(int var1) {
        c var10000;
        if(!this.G && this.ai == 1) {
            int var10001;
            if(var1 == "230691".charAt(this.ax)) {
                var10000 = this;
                var10001 = this.ax + 1;
            } else {
                var10000 = this;
                var10001 = 0;
            }

            var10000.ax = var10001;
            if(this.ax == 6) {
                this.G = true;
            }
        }

        if(!m || this.ai != 2) {
            boolean[] var2;
            byte var3;
            label77: {
                label76: {
                    switch(this.e(var1)) {
                    case 1:
                        this.a[3] = true;
                        var2 = this.a;
                        var3 = 2;
                        break label77;
                    case 2:
                    case 14:
                        var2 = this.a;
                        var3 = 2;
                        break label77;
                    case 3:
                        this.a[4] = true;
                        var2 = this.a;
                        var3 = 2;
                        break label77;
                    case 4:
                    case 16:
                        var2 = this.a;
                        var3 = 3;
                        break label77;
                    case 5:
                    case 18:
                        var2 = this.a;
                        var3 = 0;
                        break label77;
                    case 6:
                    case 17:
                        var2 = this.a;
                        var3 = 4;
                        break label77;
                    case 7:
                        var2 = this.a;
                        var3 = 3;
                        break;
                    case 8:
                    case 15:
                        var10000 = this;
                        break label76;
                    case 9:
                        var2 = this.a;
                        var3 = 4;
                        break;
                    case 10:
                        this.a[9] = true;
                        if(this.G && this.f[4]) {
                            this.H = !this.H;
                            return;
                        }

                        return;
                    case 11:
                    default:
                        return;
                    case 12:
                        var2 = this.a;
                        var3 = 5;
                        break label77;
                    case 13:
                        var2 = this.a;
                        var3 = 6;
                        break label77;
                    }

                    var2[var3] = true;
                    var10000 = this;
                }

                var2 = var10000.a;
                var3 = 1;
            }

            var2[var3] = true;
        }
    }

    // Button release event handler
    public void keyReleased(int var1) {
        boolean[] var10000;
        byte var10001;
        label55: {
            c var2;
            label54: {
                switch(this.e(var1)) {
                case 1:
                    this.a[3] = false;
                    var10000 = this.a;
                    var10001 = 2;
                    break label55;
                case 2:
                case 14:
                    var10000 = this.a;
                    var10001 = 2;
                    break label55;
                case 3:
                    this.a[4] = false;
                    var10000 = this.a;
                    var10001 = 2;
                    break label55;
                case 4:
                case 16:
                    var10000 = this.a;
                    var10001 = 3;
                    break label55;
                case 5:
                case 18:
                    var10000 = this.a;
                    var10001 = 0;
                    break label55;
                case 6:
                case 17:
                    var10000 = this.a;
                    var10001 = 4;
                    break label55;
                case 7:
                    var10000 = this.a;
                    var10001 = 3;
                    break;
                case 8:
                case 15:
                    var2 = this;
                    break label54;
                case 9:
                    var10000 = this.a;
                    var10001 = 4;
                    break;
                case 10:
                    var10000 = this.a;
                    var10001 = 9;
                    break label55;
                case 11:
                default:
                    return;
                case 12:
                    var10000 = this.a;
                    var10001 = 5;
                    break label55;
                case 13:
                    var10000 = this.a;
                    var10001 = 6;
                    break label55;
                }

                var10000[var10001] = false;
                var2 = this;
            }

            var10000 = var2.a;
            var10001 = 1;
        }

        var10000[var10001] = false;
    }

    public void playerUpdate(Player var1, String var2, Object var3) {
        if(var2 == "endOfMedia") {
            switch(this.a.a) {
            case 7:
            case 21:
            case 22:
            case 23:
                this.e(false);
                return;
            case 14:
                this.aI();
            }
        }

    }

    public final void e() {
        for(int var1 = 0; var1 < this.a.length; ++var1) {
            this.a[var1] = false;
        }

    }

    public final void f() throws Exception {
        this.ab();
        this.aA();
        this.ad();
        this.af();
        this.a = new d(this);
        this.a.a = e;
        this.a.a(this.m[1]);
        this.q = true;
        this.d(true);
        this.ai = 1;
        this.v = true;
        this.ao = 10;
        this.af = 0;
    }

    public void paint(Graphics var1) {
    }

    public void run() {
    }

    public final void g() {
        this.aC = -2147483648;
        this.aA = (int)((System.currentTimeMillis() - this.b) / 18L);
    }

    public final void h() {
        a(this.m, "config");
    }

    private void ab() {
        this.m = b("config");
        if(this.m == null) {
            this.M = true;
            this.m = new byte[4];
            this.m[0] = 1;
            this.m[1] = 1;
            this.m[2] = 0;
            this.h();
        }

    }

    private void ac() {
        byte[] var1;
        (var1 = new byte[10])[0] = this.g;
        var1[1] = this.h;
        var1[2] = this.i;

        for(int var2 = 0; var2 < 4; ++var2) {
            var1[3 + var2] = (byte)(this.bx >> (var2 << 3 & 255));
        }

        var1[7] = (byte)this.l;
        a(var1, "savedGame");
    }

    private String a() {
        long var1 = 0L;
        var1 = (var1 = 0L | (long)this.i << 30) | (long)(this.bx << 3) | (long)this.l;

        char[] var3;
        for(int var4 = (var3 = new char[8]).length - 1; var4 >= 0; --var4) {
            int var5;
            char var6 = (char)((var5 = (int)(var1 % 36L)) < 10?var5 + 48:65 + var5 - 10);
            var3[var4] = var6;
            var1 /= 36L;
        }

        return new String(var3);
    }

    private boolean a(String var1) {
        long var2 = 0L;
        long var4 = 1L;

        int var7;
        for(int var6 = var1.length() - 1; var6 >= 0; --var6) {
            char var8;
            if((var8 = var1.charAt(var6)) >= 48 && var8 <= 57) {
                var7 = var8 - 48;
            } else {
                if(var8 < 65 || var8 > 90) {
                    return false;
                }

                var7 = var8 - 65 + 10;
            }

            var2 += (long)var7 * var4;
            var4 *= 36L;
        }

        byte var9 = (byte)((int)(var2 >> 30 & 127L));
        var7 = (int)(var2 >> 3 & 134217727L);
        int var10 = (int)(var2 & 7L);
        if(var9 >= 1 && var9 <= 99 && var7 >= 0 && var7 <= 99999999 && var10 >= 0 && var10 <= 6) {
            if(this.g == 0) {
                this.h = 10;
            }

            this.i = var9;
            this.bx = var7;
            this.l = var10;
            this.ac();
            return true;
        } else {
            return false;
        }
    }

    private void ad() {
        try {
            byte[] var1 = b("savedGame");
            this.g = var1[0];
            this.h = var1[1];
            this.i = var1[2];
            int var2 = 0;

            for(int var3 = 0; var3 < 4; ++var3) {
                var2 |= (var1[3 + var3] & 255) << (var3 << 3);
            }

            this.bx = var2;
            this.l = var1[7];
            this.ay = this.l;
        } catch (Exception var4) {
            this.ac();
        }
    }

    private void ae() {
        byte[] var1 = new byte[55];

        for(int var2 = 0; var2 < 5; ++var2) {
            var1[0 + var2 * 11] = (byte)D[var2];

            int var3;
            for(var3 = 0; var3 < 3; ++var3) {
                for(int var4 = 0; var4 < 2; ++var4) {
                    var1[1 + var3 * 2 + var4 + var2 * 11] = (byte)(d[var2].charAt(var3) >> var4 * 8 % 256);
                }
            }

            for(var3 = 0; var3 < 4; ++var3) {
                var1[7 + var3 + var2 * 11] = (byte)(C[var2] >> var3 * 8 % 256);
            }
        }

        a(var1, "highscore");
    }

    private void af() {
        try {
            byte[] var1 = b("highscore");

            for(int var2 = 0; var2 < 5; ++var2) {
                D[var2] = var1[0 + var2 * 11];
                char[] var3 = new char[3];

                int var4;
                for(var4 = 0; var4 < 3; ++var4) {
                    char var5 = 0;

                    for(int var6 = 0; var6 < 2; ++var6) {
                        var5 = (char)(var5 | var1[1 + var4 * 2 + var6 + var2 * 11] << var6 * 8);
                    }

                    var3[var4] = var5;
                }

                d[var2] = new String(var3);
                var4 = 0;

                for(int var8 = 0; var8 < 4; ++var8) {
                    var4 |= (var1[7 + var8 + var2 * 11] & 255) << var8 * 8;
                }

                C[var2] = var4;
            }

        } catch (Exception var7) {
            this.ae();
        }
    }

    private void ag() {
        String[] var10000;
        byte var10001;
        String var1;
        String[] var10002;
        byte var10003;
        if(this.ai == 1) {
            if(this.a != 3 && this.a != 4) {
                if(this.a != 14) {
                    return;
                }

                this.a[1] = this.b[59];
                var10000 = this.a;
                var10001 = 0;
                var1 = "";
            } else {
                if(this.m[1] != 0) {
                    var10000 = this.a;
                    var10001 = 0;
                    var10002 = this.b;
                    var10003 = 69;
                } else {
                    var10000 = this.a;
                    var10001 = 0;
                    var10002 = this.b;
                    var10003 = 68;
                }

                var10000[var10001] = var10002[var10003];
                if(this.a == 4) {
                    var10000 = this.a;
                    var10001 = 1;
                    var1 = this.b[59];
                } else {
                    var10000 = this.a;
                    var10001 = 1;
                    var1 = this.b[57];
                }
            }
        } else {
            if(this.ai != 6 && this.ai != 4 && this.ai != 2 && this.ai != 3 && this.ai != 9 && this.ai != 7) {
                if(this.m[1] != 0) {
                    var10000 = this.a;
                    var10001 = 0;
                    var10002 = this.b;
                    var10003 = 69;
                } else {
                    var10000 = this.a;
                    var10001 = 0;
                    var10002 = this.b;
                    var10003 = 68;
                }

                var1 = var10002[var10003];
            } else {
                var10000 = this.a;
                var10001 = 0;
                var1 = "";
            }

            var10000[var10001] = var1;
            if(this.ai == 2) {
                if((this.A > 0 || !j) && !this.p) {
                    var10000 = this.a;
                    var10001 = 1;
                    var1 = this.b[60];
                } else {
                    var10000 = this.a;
                    var10001 = 1;
                    var1 = "";
                }
            } else if(this.ai == 10) {
                var10000 = this.a;
                var10001 = 1;
                var1 = this.b[61];
            } else if(this.ai == 6) {
                var10000 = this.a;
                var10001 = 1;
                var1 = this.b[66];
            } else if(this.ai == 3) {
                var10000 = this.a;
                var10001 = 1;
                var1 = this.b[59];
            } else if(this.ai == 4) {
                var10000 = this.a;
                var10001 = 1;
                var1 = "";
            } else {
                if(this.ai != 9) {
                    return;
                }

                var10000 = this.a;
                var10001 = 1;
                var1 = "OK";
            }
        }

        var10000[var10001] = var1;
    }

    public final boolean a() {
        try {
            if(this.b && this.a[1].equals(this.b[60])) {
                this.i();
                return true;
            }

            this.b = false;
            byte var1 = -1;
            if(this.a[5]) {
                if(this.a == 17) {
                    return false;
                }

                this.a[5] = false;
                var1 = 0;
            } else if(this.a[6]) {
                if(this.ai == 1) {
                    return false;
                }

                this.a[6] = false;
                var1 = 1;
            }

            if(var1 != -1) {
                if(this.a[var1].equals(this.b[59])) {
                    if(this.ai == 3) {
                        this.d(4);
                        this.e = 1;
                        this.n(11 + this.e);
                        this.o(2);
                    } else {
                        this.d(3);
                    }

                    return true;
                }

                if(this.a[var1].equals(this.b[60])) {
                    this.ai = 10;
                    this.v = true;
                    this.ao = 10;
                    this.an = 0;
                    this.a.a();
                    return true;
                }

                if(this.a[var1].equals(this.b[61])) {
                    this.h();
                    this.ai = 2;
                    this.q = true;
                    this.v = true;
                    this.ao = 10;
                    this.y = true;
                    B = true;
                    this.e(false);
                    this.g();
                    return true;
                }

                if(this.a[var1].equals(this.b[66])) {
                    this.d(3);
                    return true;
                }

                if(this.a[var1].equals(this.b[68])) {
                    this.m[1] = this.l[1];
                    if(this.m[1] == 0) {
                        this.m[1] = 1;
                    }

                    this.h();
                    this.a.a(1);
                    this.v = true;
                    this.ao = 10;
                    return true;
                }

                if(this.a[var1].equals(this.b[69])) {
                    this.l[1] = this.m[1];
                    this.m[1] = 0;
                    this.h();
                    this.a.a(0);
                    this.v = true;
                    this.ao = 10;
                    return true;
                }

                if(this.a[var1].equals(this.b[57])) {
                    this.a = 14;
                    this.e = 1;
                    this.o(3);
                    return true;
                }

                if(this.a[var1].equals("OK")) {
                    this.aK();
                }
            }
        } catch (Exception var2) {
            this.b = false;
        }

        return false;
    }

    public final void i() {
        if(this.ai == 2) {
            this.ai = 10;
            this.v = true;
            this.ao = 10;
            this.an = 0;
            this.b = false;
            this.a.a();
        } else {
            this.q = true;
        }
    }

    public final void a(boolean var1) {
        for(int var2 = 0; var2 < 6; ++var2) {
            label46: {
                c var10000;
                byte var10001;
                if(var1 && this.al < f.length) {
                    ++this.al;
                    if((this.al != 6 || this.am != 3) && this.al <= 6) {
                        break label46;
                    }

                    this.al = 0;
                    var10000 = this;
                    var10001 = 0;
                } else {
                    if(this.al < 0) {
                        break label46;
                    }

                    --this.al;
                    if(this.al >= 0) {
                        break label46;
                    }

                    this.al = 6;
                    var10000 = this;
                    var10001 = 2;
                }

                var10000.am = var10001;
            }

            if(a(f[this.al][0])) {
                return;
            }
        }

    }

    private static boolean a(int var0) {
        return var0 == 0?true:(var0 == 2?true:var0 == 4);
    }

    public final void j() {
        if(this.v) {
            this.ag();
            if(this.ao > 0) {
                --this.ao;
                return;
            }

            this.ao = 0;
            this.v = false;
        }

    }

    public void sizeChanged(int var1, int var2) {
        c = var1;
        b = var2;
        d = c;
        g = c;
        h = g * 3 >> 2;
        g = Math.min(g, 480);
        h = Math.min(h, 336);
        aE = g / 16 + 2;
        aF = h / 16 + 2;
        this.bM = -g * 2 * 4 / 4;
        this.bN = g * 2 * 4 / 4;
        this.bO = h * 4 * 4 / 4;
        i = b - h >> 1;
        e = h + 72;
        f = b - e >> 1;
        aI = i + (h >> 1);
        aH = g >> 1;
        this.ba = h * 3 >> 2;
        this.aZ = d >> 1;
        this.b = new int[aE][aF][3];
    }

    public final void k() {
        this.b(false);
    }

    public final void b(boolean var1) {
        int var3 = a.getFont().getHeight();
        if(this.a[0] != null && (this.a[0] != this.c[0] || this.ai != 2 || var1)) {
            this.a(this.a[0], d >> 2, b - var3, 17, true);
            this.c[0] = this.a[0];
        }

        if(this.a[1] != null && (this.a[1] != this.c[1] || this.ai != 2 || var1)) {
            this.a(this.a[1], d * 3 >> 2, b - var3, 17, true);
            this.c[1] = this.a[1];
        }

    }

    public final void l() {
        if(this.A <= 0 && j || X && this.x == 59 && this.y == 9) {
            int var1 = 112 - ((d >> 1) - 64 - 9);
            int var2 = (d >> 1) + 9 + 112;
            int var3 = (660 - this.z) * 6;
            if(120 - var3 < 8) {
                var3 = 112;
            }

            Graphics var10000;
            Image[] var10001;
            byte var10002;
            if(this.x == 59 && this.y == 9) {
                a(a, a[15], 0, 0, 64, 16, a[0], var3 - var1, h >> 1, 20, true);
                var10000 = a;
                var10001 = a;
                var10002 = 15;
            } else {
                a(a, a[14], 0, 0, 64, 16, a[0], var3 - var1, h >> 1, 20, true);
                var10000 = a;
                var10001 = a;
                var10002 = 14;
            }

            a(var10000, var10001[var10002], 0, 16, 64, 16, a[0], var2 - var3, h >> 1, 20, true);
        }

    }

    private void ah() {
        this.d = new byte[this.h.length >> 1];
        this.e = new byte[this.h.length >> 1];
        this.f = new byte[this.h.length >> 1];
        this.g = new byte[this.h.length >> 1];

        for(int var1 = 0; var1 < this.h.length >> 1; ++var1) {
            int var2 = this.h[var1 << 1] & 255;
            this.f[var1] = 0;
            this.g[var1] = 0;
            byte var3;
            Math.abs((var3 = (byte)(var2 << 6)) >> 6);
            if(var2 >> 5 <= 1) {
                this.g[var1] = 1;
            }

            if((var2 >> 5) % 2 == 0) {
                this.f[var1] = 1;
            }

            this.e[var1] = (byte)(var2 >> 3 & 3);
            this.d[var1] = 0;
            byte[] var10000;
            int var10001;
            byte var10002;
            if((var2 & 1) == 1) {
                var10000 = this.d;
                var10001 = var1;
                var10002 = 1;
            } else {
                if((var2 & 3) != 2) {
                    continue;
                }

                var10000 = this.d;
                var10001 = var1;
                var10002 = 2;
            }

            var10000[var10001] = var10002;
        }

    }

    public final void m() {
        int[][] var1 = new int[][]{{0, 0, 64, 64}, {0, 65, 64, 64}, {0, 129, 64, 64}, {0, 192, 36, 48}};
        if(this.v >= 50 && this.w[5] == 0) {
            int var2 = a[0];
            int var3;
            if((var3 = this.j >> 1 & 3) == 3) {
                var2 = a[4];
                var3 = 1;
            }

            b(47, var1[var3][0], var1[var3][1], var1[var3][2], var1[var3][3], var2, this.w[2], this.w[3]);
        }

    }

    public final void n() {
        if(this.v >= 50) {
            this.w[6] = this.w[2];
            this.w[7] = this.w[3];
            if(this.w[5] == 0) {
                if(a(a(), b() - 12, b[0], b[1] - 12, 12, 12, this.w[2], this.w[3], this.w[6], this.w[7], 32, 32) >= 0) {
                    this.w[5] = 1;
                    this.w[0] = -1;
                    this.w[11] = this.j;
                    ++this.l;
                    this.K = true;
                    return;
                }
            } else {
                this.w[10] = this.j - this.w[11];
                if(this.w[10] > 5) {
                    this.w[10] = 5;
                }
            }
        }

    }

    public final void a(int var1, int var2, int var3, int var4) {
        boolean var5 = false;
        boolean var6 = false;
        boolean var9 = false;
        boolean var10 = false;

        for(int var13 = var1; var13 < var1 + var3; ++var13) {
            if(this.bu << 4 > (z[0] >> 4) + var13) {
                for(int var14 = var2; var14 < var2 + var4; ++var14) {
                    int var7 = (z[0] >> 4) + var13 >> 4;
                    int var8 = ((z[1] >> 4) + var14 >> 4) % this.bv;

                    try {
                        int var16 = (this.d[var8][var7] << 9) + (((z[0] >> 4) + var13 & 15) + (((z[1] >> 4) + var14 & 15) << 4) << 1) + 1;
                        int var15;
                        if((var15 = (this.h[var16] & 255) + (this.d[var16 >> 1] << 8)) != 0) {
                            if(this.aj == 2) {
                                label86: {
                                    int var10000;
                                    short var10001;
                                    if(var15 != 367 && var15 != 366) {
                                        if(var15 != 365 && var15 != 364) {
                                            if(var15 != 363 && var15 != 362) {
                                                break label86;
                                            }

                                            var10000 = var15 + this.j / 5 & 1;
                                            var10001 = 362;
                                        } else {
                                            var10000 = var15 + this.j / 5 & 1;
                                            var10001 = 364;
                                        }
                                    } else {
                                        var10000 = var15 + this.j / 5 & 1;
                                        var10001 = 366;
                                    }

                                    var15 = var10000 + var10001;
                                }
                            }

                            byte var11 = 0;
                            if(this.e[var16 >> 1] != 0) {
                                label53: {
                                    byte var17;
                                    if(this.e[var16 >> 1] == 1) {
                                        var17 = 4;
                                    } else if(this.e[var16 >> 1] == 2) {
                                        var17 = 6;
                                    } else {
                                        if(this.e[var16 >> 1] != 3) {
                                            break label53;
                                        }

                                        var17 = 2;
                                    }

                                    var11 = var17;
                                }
                            }

                            a(a, a, var15 % 16 * 16, var15 / 16 * 16, 16, 16, a[var11], var13 * 16 - (z[0] & 15), var14 * 16 - (z[1] & 15), 20, true);
                        }
                    } catch (Exception var12) {
                        ;
                    }
                }
            }
        }

    }

    public final void a(Graphics var1, boolean var2) {
        int var3 = h(z[0] & 15);
        int var4 = h(z[1] & 15);

        for(int var5 = 0; var5 < aE; ++var5) {
            if(this.bu << 4 > (z[0] >> 4) + var5) {
                for(int var6 = 0; var6 < aF; ++var6) {
                    int var7 = this.b[var5][var6][1];
                    int var8 = this.b[var5][var6][0];
                    if(this.b[var5][var6][2] == 1 && var8 != 0 && !var2) {
                        try {
                            var1.drawRegion(a, (var8 & 15) * 16, (var8 >> 4) * 16, 16, 16, a[var7], var5 * 16 - var3, var6 * 16 - var4 + i, 20);
                        } catch (Throwable var10) {
                            ;
                        }
                    }
                }
            }
        }

    }

    public final void b(Graphics var1, boolean var2) {
        boolean var5 = false;
        int var6 = 0;
        int var7 = z[0] >> 4;
        int var8 = z[1] >> 4;
        int var9 = var7;
        int var10 = h(z[0] & 15);
        int var11 = h(z[1] & 15);
        int var12 = -16 - var10;

        for(int var13 = 0; var13 < aE; ++var13) {
            var12 += 16;
            int var14 = var8;
            int var15 = -16 - var11 + i;

            for(int var16 = 0; var16 < aF; ++var16) {
                var15 += 16;
                int var3 = var9 >> 4;
                int var4 = var14 >> 4;

                int var21;
                try {
                    var6 = (this.d[var4][var3] << 9) + ((var9 & 15) + ((var14 & 15) << 4) << 1) + 1;
                    var21 = (this.h[var6] & 255) + (this.d[var6 >> 1] << 8);
                } catch (Exception var19) {
                    var21 = 0;
                }

                byte var17;
                label50: {
                    ++var14;
                    var17 = 0;
                    byte var10000;
                    switch(this.e[var6 >> 1]) {
                    case 1:
                        var10000 = 4;
                        break;
                    case 2:
                        var10000 = 6;
                        break;
                    case 3:
                        var10000 = 2;
                        break;
                    default:
                        break label50;
                    }

                    var17 = var10000;
                }

                this.b[var13][var16][0] = var21;
                if(var21 != 0) {
                    this.b[var13][var16][1] = var17;
                    this.b[var13][var16][2] = 0;
                    if(this.i[var21] != 0) {
                        this.b[var13][var16][2] = 1;
                    } else if(!var2) {
                        if(this.aj == 2) {
                            if(var21 >= 362 && var21 <= 365) {
                                var21 = (var21 - 362 + (this.j >> 3)) % 4 + 362;
                            } else if(var21 >= 366) {
                                var21 = (var21 - 366 + (this.j >> 3)) % 2 + 366;
                            }
                        }

                        try {
                            var1.drawRegion(a, (var21 & 15) << 4, var21 >> 4 << 4, 16, 16, a[var17], var12, var15, 20);
                        } catch (Throwable var20) {
                            ;
                        }
                    }
                }
            }

            ++var9;
        }

    }

    public final void a(int var1, boolean var2) {
        if(99950000 > this.w && this.w % '썐' > (this.w + var1) % '썐') {
            ++this.A;
            if(var2) {
                this.a.a(7, 1, false);
            }
        }

        this.w += var1;
        if(this.w > 99999999) {
            this.w = 99999999;
        }

    }

    private void a(String var1, int var2, int var3, int var4, boolean var5) {
        int var6 = a.getFont().getHeight();
        if(var1.length() != 0) {
            int var7 = a.getFont().stringWidth(var1) + 5;
            b((var4 & 1) == 1?var2 - var7 / 2:var2, var3, var7, var6);
            if(var5) {
                a(var1, var2 + 1, var3, 16777215, 255, var4);
            }

        }
    }

    public final void c(boolean var1) {
        if(!var1) {
            label70: {
                boolean var10000;
                if(this.by == this.v && this.bz == this.w) {
                    if(this.v != 0 || (this.j & 1) != 0) {
                        break label70;
                    }

                    var10000 = true;
                } else {
                    var10000 = true;
                }

                z = var10000;
            }

            if(this.x == 0 || this.bA != this.y * 100 + this.x) {
                A = true;
            }

            if(this.bB != this.A) {
                B = true;
            }
        } else {
            z = true;
            B = true;
            A = true;
        }

        if(this.A > 99) {
            this.A = 99;
        }

        this.bB = this.A;
        this.by = this.v;
        this.bz = this.w;
        if(z) {
            b(0, 0, 100, i);
            a(a, a[1], 0, 0, a[1].getWidth(), a[1].getHeight(), a[0], 4, -10, 36, true);
            if(this.v != 0 || (this.j >> 1 & 1) == 0) {
                d(31, -35, this.v, 3);
            }

            d(31, -18, this.w, 8);
            z = false;
        }

        this.bA = this.y * 100 + this.x;
        if(A) {
            b(d - 48, 0, 48, i);
            a(a, a[11], 0, 0, a[11].getWidth(), a[11].getHeight(), a[0], d - 4, -8, 40, true);
            d(d + -40, -22, this.y, 1);
            d(d + -24, -22, this.x, 2);
            A = false;
        }

        if(B) {
            b(0, i + h, 50, i);
            a(a, a[2], 0, 0, 22, 20, a[0], 5, 7 + h, 20, true);
            int var10001;
            int var10002;
            byte var10003;
            byte var13;
            if(this.A > 9) {
                var13 = 31;
                var10001 = h + 14;
                var10002 = this.A;
                var10003 = 2;
            } else {
                var13 = 31;
                var10001 = h + 14;
                var10002 = this.A;
                var10003 = 1;
            }

            d(var13, var10001, var10002, var10003);
            B = false;
        }

    }

    private static void d(int var0, int var1, int var2, int var3) {
        int var4 = var0 + var3 * 8 - 7;
        int var5 = var2 % 10;
        a(a, a[12], 7 * var5, 0, 7, 13, a[0], var4, var1, 20, true);

        for(int var6 = 1; var6 < var3; ++var6) {
            int var7 = 1;

            for(int var8 = 0; var8 < var6; ++var8) {
                var7 *= 10;
            }

            var5 = var2 / var7 % 10;
            a(a, a[12], 7 * var5, 0, 7, 13, a[0], var4 - var6 * 8, var1, 20, true);
        }

    }

    private static boolean e() {
        return false;
    }

    public final void o() {
        this.h = new int[this.bc][15];
        this.a.a(13, 1, false);
        this.a[0] = "";
        this.a[1] = "";
        this.bd = 0;
        this.bC = 30;
        this.T = true;
        this.h[0][0] = 1;
        this.h[0][1] = 10;
        this.h[0][2] = 240;
        this.h[0][3] = 28;
        this.h[0][8] = 1 - a[this.h[0][1]][2];
        this.h[0][9] = 0;
        this.h[1][0] = 1;
        this.h[1][1] = 4 + this.am;
        this.h[1][2] = 240;
        this.h[1][3] = 60;
        this.h[1][8] = 25 - a[this.h[0][1]][2];
        this.h[1][9] = 3;
        this.h[2][0] = 1;
        this.h[2][1] = 8;
        this.h[2][2] = 240;
        this.h[2][3] = 70;
        this.h[2][8] = -1 - a[this.h[0][1]][2];
        this.h[2][9] = 2;
        this.h[3][0] = 1;
        this.h[3][1] = 14;
        this.h[3][2] = 0 - a[this.h[3][1]][2];
        this.h[3][3] = 30;
        this.h[3][8] = -a[this.h[3][1]][2];
        this.h[3][9] = 0;
        this.m = d + a[this.h[3][1]][2] >> 1;
        this.h[4][0] = 1;
        this.h[4][1] = 15;
        this.h[4][2] = 0 - a[this.h[4][1]][2];
        this.h[4][3] = 50;
        this.h[4][8] = -a[this.h[3][1]][2] / 2 - a[this.h[4][1]][2] / 2;
        this.h[4][9] = 1;

        for(int var2 = 0; var2 < this.h.length; ++var2) {
            if(this.h[var2][0] == 1) {
                this.h[var2][4] = a[this.h[var2][1]][0];
                this.h[var2][5] = a[this.h[var2][1]][1];
                this.h[var2][6] = a[this.h[var2][1]][2];
                this.h[var2][7] = a[this.h[var2][1]][3];
            }
        }

    }

    public final void p() {
        try {
            this.ai = 4;
            this.t = false;
            this.u = false;
            this.p = false;
            this.Z = true;
            this.aa = true;
            this.bw = 0;
            this.bf = 2100;
            this.K = false;
            this.h = new int[this.bc][15];
            this.k = 0;
            this.j = 0;
            this.q = 0;
            this.r = 0;
            this.bL = 0;
            this.bK = 0;
            this.v = true;
            this.ao = 10;
            this.c = 0;
            this.C = false;
            if(this.J) {
                this.aD();
            }

            boolean var1 = false;
            this.bd = 0;
            this.h[0][0] = 1;
            this.h[0][1] = 10;
            this.h[0][2] = 240;
            this.h[0][3] = 42;
            this.h[0][8] = 1 - a[this.h[0][1]][2];
            this.h[0][9] = 0;
            this.h[1][0] = 1;
            this.h[1][1] = 4 + this.am;
            this.h[1][2] = 240;
            this.h[1][3] = 68;
            this.h[1][8] = 25 - a[this.h[0][1]][2];
            this.h[1][9] = 3;
            this.h[2][0] = 1;
            this.h[2][1] = 8;
            this.h[2][2] = 240;
            this.h[2][3] = 76;
            this.h[2][8] = -1 - a[this.h[0][1]][2];
            this.h[2][9] = 2;
            this.h[3][0] = 1;
            this.h[3][1] = x[this.al];
            this.h[3][2] = 0 - a[this.h[3][1]][2];
            this.h[3][3] = 44;
            this.h[3][8] = -a[this.h[3][1]][2];
            this.h[3][9] = 0;
            this.m = (d >> 1) + a[this.h[3][1]][2] / 2;
            int[] var10000;
            byte var10001;
            byte var10002;
            if(this.al == 6) {
                this.h[4][0] = 1;
                this.h[4][1] = 3;
                this.h[4][2] = 0 - a[this.h[4][1]][2];
                this.h[4][3] = 60;
                var10000 = this.h[4];
                var10001 = 8;
                var10002 = -48;
            } else {
                this.h[4][0] = 1;
                this.h[4][1] = 3;
                this.h[4][2] = 0 - a[this.h[4][1]][2];
                this.h[4][3] = 60;
                var10000 = this.h[4];
                var10001 = 8;
                var10002 = -65;
            }

            var10000[var10001] = var10002;
            this.h[4][9] = 1;

            for(int var2 = 0; var2 < this.h.length; ++var2) {
                if(this.h[var2][0] == 1) {
                    this.h[var2][4] = a[this.h[var2][1]][0];
                    this.h[var2][5] = a[this.h[var2][1]][1];
                    this.h[var2][6] = a[this.h[var2][1]][2];
                    this.h[var2][7] = a[this.h[var2][1]][3];
                }
            }

            this.e(true);
        } catch (Exception var3) {
            ;
        }

        this.g();
    }

    private static void i(int var0, int var1, int var2) {
        int var3 = var2 % 10;
        int var4 = 1;

        while(true) {
            int var5 = 1;

            int var6;
            for(var6 = 0; var6 < var4; ++var6) {
                var5 *= 10;
            }

            if(var2 / var5 == 0) {
                var5 = var4;
                a(a, a[13], 8 * var3, 48, 8, 16, a[0], var0 - 8, var1, 20, true);

                for(var4 = 1; var4 < var5; ++var4) {
                    var6 = 1;

                    for(int var7 = 0; var7 < var4; ++var7) {
                        var6 *= 10;
                    }

                    var3 = var2 / var6 % 10;
                    a(a, a[13], 8 * var3, 48, 8, 16, a[0], var0 - (var4 + 1) * 8, var1, 20, true);
                }

                return;
            }

            ++var4;
        }
    }

    private void ai() {
        this.al();
        this.av();
    }

    private void aj() {
        this.v = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.t = 0;
        this.s = 0;
        this.q = 0;
        this.r = 0;
        this.bh = 0;
        this.bg = 0;

        for(int var1 = 0; var1 < this.k.length; ++var1) {
            this.k[var1][0] = 0;
        }

        c = false;
        d = false;
        S = false;
        Q = false;
        e = false;
        f = false;
        g = false;
        i = false;
        j = false;
        W = false;
        X = false;
        k = false;
        R = false;
        l = false;
        m = false;
        o = false;
        n = false;
        this.aw = 0;

        int var2;
        for(var2 = 0; var2 < 256; ++var2) {
            this.e[var2] = false;
            this.b[var2] = false;
        }

        this.af = 0;
        this.F = 0;

        for(var2 = 0; var2 < this.e.length; ++var2) {
            this.e[var2][24] = 0;
        }

    }

    private void ak() {
        this.e();
        this.aj();
        if(this.aj == 4 && this.ak == 2) {
            this.c(150, 11424, 1394, 0, 0);
        }

        for(int var1 = 0; var1 < c.length; ++var1) {
            c[var1] = 0;
        }

        p = 0;
        this.F[0] = 0;
        this.F[1] = 0;
        y[0] = 0;
        y[1] = 0;
        if(this.aj != 5 || this.ak != 3) {
            c[0] = b[this.aj][this.ak * 2 + 0] << 8;
            c[1] = (b[this.aj][this.ak * 2 + 1] << 8) + 5120;
        }

        if(this.B != 0 || this.C != 0) {
            c[0] = this.B << 8;
            c[1] = this.C << 8;
            this.x = this.D;
            this.y = this.E;
        }

        this.t();
        this.G();
        c[8] = -1;
        this.ai = 2;
        this.q = true;
        this.z();
        this.v = true;
        this.ao = 10;
    }

    private void al() {
        a = null;
        a.a();
        a(b);
        this.t = false;
        this.Z = true;
        this.aa = true;
        if(this.aj != 1) {
            this.ah = 16777215;
        }

        y[0] = 0;
        y[1] = 0;
        this.am();
        this.ah();
        this.K();
        a.a(this.aj, this.ak);
        this.aD();
        this.g();
    }

    public static DataInputStream a(String var0) {
        return new DataInputStream(a(var0));
    }

    public static InputStream a(String var0) {
        if(a != null) {
            try {
                a.close();
            } catch (Exception var2) {
                ;
            }

            a = null;
        }

        return a = (new Object()).getClass().getResourceAsStream(var0);
    }

    public static byte[] a(String var0) {
        try {
            byte[] var1 = new byte[512];
            boolean var2 = false;
            InputStream var3 = a(var0);
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();

            int var6;
            while((var6 = var3.read(var1)) != -1) {
                var4.write(var1, 0, var6);
            }

            var4.close();
            var3.close();
            return var4.toByteArray();
        } catch (Exception var5) {
            return null;
        }
    }

    public static void q() {
        try {
            a.close();
        } catch (Exception var1) {
            ;
        }
    }

    public static int[][][] a(DataInputStream var0) {
        int[][][] var1 = new int[0][][];

        try {
            int var2;
            var1 = new int[var2 = var0.readInt()][][];

            for(int var3 = 0; var3 < var2; ++var3) {
                var1[var3] = a(var0);
            }
        } catch (Exception var4) {
            ;
        }

        return var1;
    }

    public static int[][] a(DataInputStream var0) {
        int[][] var1 = new int[0][];

        try {
            int var2;
            var1 = new int[var2 = var0.readInt()][];

            for(int var3 = 0; var3 < var2; ++var3) {
                var1[var3] = a(var0);
            }
        } catch (Exception var4) {
            ;
        }

        return var1;
    }

    public static int[] a(DataInputStream var0) {
        int[] var1 = new int[0];

        try {
            int var2;
            var1 = new int[var2 = var0.readInt()];

            for(int var3 = 0; var3 < var2; ++var3) {
                var1[var3] = var0.readInt();
            }
        } catch (Exception var4) {
            ;
        }

        return var1;
    }

    private void am() {
        try {
            int[][][] var3;
            label42: {
                this.b = null;
                this.i = null;
                this.h = null;
                this.c = (byte[][])null;
                this.k = null;
                this.c = null;
                this.j = null;
                System.gc();
                var3 = (int[][][])null;
                String var10000;
                switch(this.aj) {
                case 0:
                    var10000 = "/mc_gh_map_data.bin";
                    break;
                case 1:
                case 3:
                default:
                    break label42;
                case 2:
                    var10000 = "/mc_ma_map_data.bin";
                    break;
                case 4:
                    var10000 = "/mc_sy_map_data.bin";
                }

                var3 = a(a(var10000));
            }

            q();
            this.bu = var3[this.ak][0].length;
            this.bv = var3[this.ak].length;
            this.d = new byte[this.bv][this.bu];

            for(int var4 = 0; var4 < this.bv; ++var4) {
                for(int var5 = 0; var5 < this.bu; ++var5) {
                    this.d[var4][var5] = (byte)var3[this.ak][var4][var5];
                }
            }

            System.gc();
            this.b = a("/zone" + (this.aj + 1) + ".blt");
            this.i = a("/MapLzone" + (this.aj + 1) + ".blt");
            this.h = a("/zone" + (this.aj + 1) + ".bmd");
            DataInputStream var1 = a("/ZONE" + (this.aj + 1) + "ACT.act");
            this.c = new byte[4][];
            this.c[0] = new byte[var1.readShort()];
            this.c[1] = new byte[var1.readShort()];
            this.c[2] = new byte[var1.readShort()];
            this.c[3] = new byte[var1.readShort()];
            var1.read(this.c[0]);
            var1.read(this.c[1]);
            var1.read(this.c[2]);
            var1.read(this.c[3]);
            var1.close();
            q();
            if(this.j == null) {
                this.j = a(a("/mc_obj_size_table.bin"));
                q();
            }

            if(a == null) {
                a = a(a("/framedata.bin"));
                q();
            }

            this.k = new byte[512];
            a("/scddirtbl.blt").read(this.k);
            q();
            this.c = new byte[8192];
            a("/scdtblwk.scd").read(this.c);
            q();
            this.j = new byte[8192];
            a("/blkcol.bct").read(this.j);
            q();
            System.gc();
        } catch (Exception var6) {
            ;
        }
    }

    public static void a(int var0, int var1) {
        a = null;
        a = a(var0 == 1 && var1 == 3?"/z_zone_marble.png":"/zone" + (var0 + 1) + ".png");
    }

    public final void r() {
        if(this.ai != 2 || this.T || this.bd >= 30) {
            if(this.G && this.f[4] && this.H) {
                if(this.a[2]) {
                    c[1] -= 2048;
                    return;
                }

                if(this.a[1]) {
                    c[1] += 2048;
                    return;
                }

                if(this.a[3]) {
                    c[0] -= 2048;
                    return;
                }

                if(this.a[4]) {
                    c[0] += 2048;
                    return;
                }
            } else {
                if(l || m) {
                    c[11] += this.n;
                    return;
                }

                if(j) {
                    c[1] += c[5];
                    c[5] += this.bj;
                    return;
                }

                if(this.K) {
                    return;
                }

                if(this.n()) {
                    if(this.t()) {
                        this.ap();
                        return;
                    }
                } else if(this.s()) {
                    this.ao();
                }
            }

        }
    }

    public static int c(int var0) {
        return Math.abs(a.nextInt()) % var0;
    }

    private boolean d(int var1, int var2) {
        try {
            if(var1 < 0) {
                var1 = 0;
            }

            if(var2 < 0) {
                var2 = 0;
            }

            ++this.bH;
            int var3 = (this.d[(var2 >> 4 >> 4) % this.bv][var1 >> 4 >> 4] << 9) + ((var1 >> 4 & 15) + ((var2 >> 4 & 15) << 4) << 1) + 1;
            if(this.f[var3 >> 1] == 1) {
                return false;
            }

            int var4 = (this.b[(this.h[var3] & 255) + (this.d[var3 >> 1] << 8)] & 255) << 5;
            if(this.e[var3 >> 1] == 1) {
                if(0 == (this.j[var4 + (15 - (var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
                    return false;
                }
            } else if(this.e[var3 >> 1] == 2) {
                if(0 == (this.j[var4 + ((var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
                    return false;
                }
            } else if(this.e[var3 >> 1] == 3) {
                if(0 == (this.j[var4 + (15 - (var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
                    return false;
                }
            } else if(0 == (this.j[var4 + ((var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
                return false;
            }

            var4 = (this.h[var3] & 255) + (this.d[var3 >> 1] << 8);
            c[8] = var4;
        } catch (ArrayIndexOutOfBoundsException var5) {
            ;
        }

        return true;
    }

    public final boolean a(int var1, int var2) {
        try {
            if(var1 < 0) {
                var1 = 0;
            }

            if(var2 < 0) {
                var2 = 0;
            }

            int var3 = (this.d[(var2 >> 4 >> 4) % this.bv][var1 >> 4 >> 4] << 9) + ((var1 >> 4 & 15) + ((var2 >> 4 & 15) << 4) << 1) + 1;
            if(this.g[var3 >> 1] == 1) {
                return false;
            }

            int var4 = (this.b[(this.h[var3] & 255) + (this.d[var3 >> 1] << 8)] & 255) << 5;
            if(this.e[var3 >> 1] == 1) {
                if(0 == (this.j[var4 + (15 - (var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
                    return false;
                }
            } else if(this.e[var3 >> 1] == 2) {
                if(0 == (this.j[var4 + ((var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
                    return false;
                }
            } else if(this.e[var3 >> 1] == 3) {
                if(0 == (this.j[var4 + (15 - (var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
                    return false;
                }
            } else if(0 == (this.j[var4 + ((var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
                return false;
            }

            var4 = (this.h[var3] & 255) + (this.d[var3 >> 1] << 8);
            c[8] = var4;
        } catch (ArrayIndexOutOfBoundsException var5) {
            ;
        }

        return true;
    }

    private boolean e(int var1, int var2) {
        if(var1 < 0) {
            var1 = 0;
        }

        if(var2 < 0) {
            var2 = 0;
        }

        int var3 = (this.d[(var2 >> 4 >> 4) % this.bv][var1 >> 4 >> 4] << 9) + ((var1 >> 4 & 15) + ((var2 >> 4 & 15) << 4) << 1) + 1;
        return this.f[var3 >> 1] != 1;
    }

    public final boolean b(int var1, int var2) {
        try {
            if(var1 < 0) {
                var1 = 0;
            }

            if(var2 < 0) {
                var2 = 0;
            }

            int var3 = (this.d[(var2 >> 4 >> 4) % this.bv][var1 >> 4 >> 4] << 9) + ((var1 >> 4 & 15) + ((var2 >> 4 & 15) << 4) << 1) + 1;
            if(this.f[var3 >> 1] == 1 && this.g[var3 >> 1] == 1) {
                return false;
            } else {
                int var4 = (this.b[(this.h[var3] & 255) + (this.d[var3 >> 1] << 8)] & 255) << 5;
                if(this.e[var3 >> 1] == 1) {
                    if(0 == (this.j[var4 + (15 - (var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
                        return false;
                    }
                } else if(this.e[var3 >> 1] == 2) {
                    if(0 == (this.j[var4 + ((var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
                        return false;
                    }
                } else if(this.e[var3 >> 1] == 3) {
                    if(0 == (this.j[var4 + (15 - (var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
                        return false;
                    }
                } else if(0 == (this.j[var4 + ((var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
                    return false;
                }

                var4 = (this.h[var3] & 255) + (this.d[var3 >> 1] << 8);
                this.aq = var4;
                return true;
            }
        } catch (Exception var5) {
            return true;
        }
    }

    private int f(int var1) {
        return this.k[this.b[var1] & 255] & 255;
    }

    private boolean f() {
        if(!this.a(a() + 12, b() - 12)) {
            return false;
        } else {
            for(int var1 = 0; var1 < 14; ++var1) {
                c[0] -= 256;
                if(!this.a(a() + 12, b() - 12)) {
                    break;
                }
            }

            return true;
        }
    }

    private boolean g() {
        if(!this.a(a() - 12, b() - 12)) {
            return false;
        } else {
            for(int var1 = 0; var1 < 14; ++var1) {
                c[0] += 256;
                if(!this.a(a() - 12, b() - 12)) {
                    break;
                }
            }

            return true;
        }
    }

    private boolean h() {
        if(!this.a(a() + 12, b() - 24)) {
            return false;
        } else {
            for(int var1 = 0; var1 < 14; ++var1) {
                c[0] -= 256;
                if(!this.a(a() + 12, b() - 24)) {
                    break;
                }
            }

            return true;
        }
    }

    private boolean i() {
        if(!this.a(a() - 12, b() - 24)) {
            return false;
        } else {
            for(int var1 = 0; var1 < 14; ++var1) {
                c[0] += 256;
                if(!this.a(a() - 12, b() - 24)) {
                    break;
                }
            }

            return true;
        }
    }

    private boolean j() {
        int var1;
        int var2;
        if(p > 22 && p < 338) {
            if(this.aj != 1 || p != 316) {
                return false;
            }

            var1 = a() + 12;
            var2 = b() - 36;
        } else {
            var1 = a() + 12;
            var2 = b() - 12;
        }

        if((this.aj == 4 || this.aj == 3) && p != 0) {
            return false;
        } else if(!this.a(var1, var2)) {
            return false;
        } else {
            for(int var3 = 0; var3 < 14; ++var3) {
                c[0] -= 256;
                --var1;
                if(!this.d(var1, var2)) {
                    break;
                }
            }

            return true;
        }
    }

    private boolean k() {
        if(p > 22 && p < 338) {
            return false;
        } else if((this.aj == 4 || this.aj == 3) && p != 0) {
            return false;
        } else if(this.aj == 2 && p == 22) {
            return false;
        } else {
            int var1 = a() - 12;
            int var2 = b() - 12;
            if(!this.a(var1, var2)) {
                return false;
            } else {
                for(int var3 = 0; var3 < 14; ++var3) {
                    c[0] += 256;
                    ++var1;
                    if(!this.d(var1, var2)) {
                        break;
                    }
                }

                return true;
            }
        }
    }

    private boolean l() {
        int var2;
        if(this.a(a(), b() - 32)) {
            for(var2 = 0; var2 < 14; ++var2) {
                c[1] += 256;
                if(!this.a(a(), b() - 32)) {
                    c[1] -= 256;
                    break;
                }
            }

            return true;
        } else if(!this.a(a(), b() - 16)) {
            return false;
        } else {
            for(var2 = 0; var2 < 14; ++var2) {
                c[1] += 256;
                if(!this.a(a(), b() - 16)) {
                    c[1] -= 256;
                    break;
                }
            }

            return true;
        }
    }

    private boolean b(int var1) {
        if(this.d(a(), b())) {
            int var4 = p;
            if(var1 != -1) {
                if(var4 < 0) {
                    var4 = 0;
                }

                for(int var2 = 0; var2 < 16; ++var2) {
                    if(!g) {
                        c[0] -= (a(var4 + 180) << 8) / 100;
                    }

                    c[1] -= b(var4 + 180) * 256 / 100;
                    if(!this.d(a(), b())) {
                        if(!g) {
                            c[0] += (a(var4 + 180) << 8) / 100;
                        }

                        c[1] += (b(var4 + 180) << 8) / 100;
                        p = this.a(a(), b());
                        break;
                    }
                }

                return true;
            }
        }

        return false;
    }

    public final void s() {
        if(!g && i) {
            i = false;
        }

        this.be = 2;
    }

    private void an() {
        if(this.aj != 1 || this.ah >= b() - 12) {
            this.bf = 2100;
        }
    }

    private static boolean m() {
        return 37 == c[8] || 38 == c[8] || 39 == c[8] || 41 == c[8] || 42 == c[8] || 47 == c[8] || 48 == c[8] || 49 == c[8] || 52 == c[8] || 59 == c[8] || 62 == c[8] || 69 == c[8] || 71 == c[8] || 72 == c[8] || 78 == c[8] || 79 == c[8] || 87 == c[8] || 88 == c[8] || 89 == c[8];
    }

    private boolean c(int var1) {
        if(0 != var1) {
            return false;
        } else if(g) {
            return true;
        } else if(this.C) {
            return false;
        } else if(this.aj == 0 && (this.d[(b() >> 8) % this.bv][a() >> 8] == 31 || this.d[(b() >> 8) % this.bv][a() >> 8] == 32)) {
            this.a[2] = false;
            return false;
        } else if(this.a[2]) {
            if(this.aj == 5 && this.ak != 2 && m()) {
                return false;
            } else if(this.s) {
                g = true;
                d = false;
                h = false;
                this.s = false;
                i = true;
                c[3] = a(0) * this.bk / 100 + c[10];
                c[5] = b(0) * this.bk / 100;
                return true;
            } else {
                g = true;
                d = false;
                h = false;
                this.s = false;
                i = true;
                int var2 = p;
                int var3 = a() / 16 / 16;
                int var4 = b() / 16 / 16 % this.bv;
                int var5 = this.d[var4][var3] * 512 + (a() / 16 % 16 + b() / 16 % 16 * 16) * 2 + 1;
                int var6 = 0;
                byte var8;
                if((var8 = (byte)Math.abs((byte)((this.h[var5 - 1] & 255) << 6) >> 6)) % 4 != 0) {
                    var6 = 256 * (var8 % 4);
                }

                int var9 = (this.h[var5] & 255) + var6;
                byte var10 = (byte)this.f(var9);
                int[] var10000;
                byte var10001;
                int var10002;
                if(p == 270) {
                    this.bn = 5;
                    c[3] = -this.bk;
                    var10000 = c;
                    var10001 = 5;
                    var10002 = -Math.abs(this.bk);
                } else if(p == 90) {
                    this.bn = 5;
                    c[3] = this.bk;
                    var10000 = c;
                    var10001 = 5;
                    var10002 = -Math.abs(this.bk);
                } else if(var10 != 0 && p <= 290 && p >= 70) {
                    c[3] = a(var2) * this.bk / 100;
                    var10000 = c;
                    var10001 = 5;
                    var10002 = b(var2) * this.bk / 100;
                } else {
                    c[3] = a(var2) * this.bk / 100 + c[10];
                    c[5] = b(var2) * this.bk / 100;
                    if(c[5] > 0) {
                        this.bJ = 1;
                    }

                    if(Math.abs(c[10]) <= 2560 || this.aj != 4 || this.ak != 1 || c[0] <= 9216) {
                        return true;
                    }

                    c[5] -= 768;
                    var10000 = c;
                    var10001 = 3;
                    var10002 = a(var2) * this.bk / 100 + 2560;
                }

                var10000[var10001] = var10002;
                return true;
            }
        } else {
            return false;
        }
    }

    private boolean n() {
        if(this.bg > -1) {
            --this.bg;
        }

        if(this.bh > -1) {
            --this.bh;
        }

        if(i) {
            return true;
        } else {
            if(!g && !this.C) {
                if(this.a[1]) {
                    if(Math.abs(c[10]) > this.bi) {
                        i = true;
                        return true;
                    }

                    if(!this.a[3] && !this.a[4]) {
                        k = true;
                        this.bg += 2;
                        if(this.bg > 32) {
                            this.bg = 32;
                        }

                        return false;
                    }
                } else if(this.a[0] && Math.abs(c[10]) <= this.bi && !this.a[3] && !this.a[4]) {
                    R = true;
                    this.bh += 2;
                    if(this.bh > 24) {
                        this.bh = 24;
                    }

                    return false;
                }
            }

            return false;
        }
    }

    private boolean o() {
        this.O = false;
        this.P = false;
        int var1 = p;
        short var2 = 32;
        short var3 = 256;
        if(p != 22 && p != 338) {
            var2 = 256;
        }

        if(p >= 270 && p < 300) {
            var3 = 32;
        }

        if(p >= 60 && p < 90) {
            var3 = 32;
        }

        byte var4 = this.d[b() >> 8][a() >> 8];
        if(this.aj == 0 && (var4 == 31 || var4 == 32)) {
            var3 = 256;
        }

        int var5 = p;
        int[] var10000;
        byte var10001;
        short var10002;
        if(this.p()) {
            this.s = false;
            if(this.aj == 4 && (var5 == 79 && p == 90 || var5 == 281 && p == 270)) {
                if(p == 90) {
                    var10000 = c;
                    var10001 = 10;
                    var10002 = 640;
                } else {
                    var10000 = c;
                    var10001 = 10;
                    var10002 = -640;
                }

                var10000[var10001] = var10002;
                p = var5;
                this.av = 0;
                this.bJ = 3;
                return false;
            } else {
                return true;
            }
        } else {
            for(int var6 = 0; var6 < 14; ++var6) {
                c[0] += a(var1 + 180) * var2 / 100;
                c[1] += b(var1 + 180) * var3 / 100;
                if(this.p()) {
                    this.s = false;
                    if(this.aj == 4 && (var5 == 79 && p == 90 || var5 == 281 && p == 270)) {
                        if(p == 90) {
                            var10000 = c;
                            var10001 = 10;
                            var10002 = 640;
                        } else {
                            var10000 = c;
                            var10001 = 10;
                            var10002 = -640;
                        }

                        var10000[var10001] = var10002;
                        p = var5;
                        this.av = 0;
                        this.bJ = 3;
                        return false;
                    }

                    return true;
                }
            }

            return false;
        }
    }

    private boolean p() {
        if(b() < 0) {
            return false;
        } else {
            byte var1 = this.d[(b() >> 8) % this.bv][a() >> 8];
            if(this.aj != 5 || this.ak == 2) {
                if(this.aj == 0) {
                    if(var1 != 31 && var1 != 32) {
                        if(this.F[0] >= 0) {
                            this.O = this.q();
                            if(!this.O) {
                                this.P = this.r();
                            }
                        }

                        if(this.F[0] < 0) {
                            this.P = this.r();
                            if(!this.P) {
                                this.O = this.q();
                            }
                        }

                        if(!this.O && !this.P) {
                            return false;
                        }

                        return true;
                    }

                    return this.b(0);
                }

                if(this.aj != 3) {
                    if(this.F[0] >= 0) {
                        this.O = this.q();
                        if(!this.O) {
                            this.P = this.r();
                        }
                    }

                    if(this.F[0] < 0) {
                        this.P = this.r();
                        if(!this.P) {
                            this.O = this.q();
                        }
                    }

                    if(!this.O && !this.P) {
                        return false;
                    }

                    return true;
                }
            }

            return false;
        }
    }

    private boolean q() {
        try {
            int var1 = p;
            if(p < 0) {
                var1 = 0;
            }

            int var2 = this.bI;
            int var3 = a() + a(var1 + 90) * var2 / 100;
            int var4 = b() + b(var1 + 90) * var2 / 100;
            if(this.d(var3, var4)) {
                this.a(var3, var4);

                for(int var7 = 0; var7 < 16; ++var7) {
                    int var5 = this.a(var3, var4);
                    if(!g) {
                        c[0] -= (a(var1 + 180) << 8) / 100;
                    }

                    c[1] -= (b(var1 + 180) << 8) / 100;
                    var3 = a() + a(var1 + 90) * var2 / 100;
                    var4 = b() + b(var1 + 90) * var2 / 100;
                    if(!this.d(var3, var4)) {
                        if(!g) {
                            c[0] += (a(var1 + 180) << 8) / 100;
                        }

                        c[1] += (b(var1 + 180) << 8) / 100;
                        if(this.aj == 3 && var5 == 350) {
                            var5 = 0;
                        }

                        p = var5;
                        break;
                    }
                }

                return true;
            }
        } catch (Exception var8) {
            ;
        }

        return false;
    }

    private boolean r() {
        try {
            int var1 = p;
            if(p < 0) {
                var1 = 0;
            }

            int var2 = this.bI;
            int var3 = a() + a(var1 + 270) * var2 / 100;
            int var4 = b() + b(var1 + 270) * var2 / 100;
            if(this.d(var3, var4)) {
                this.a(var3, var4);

                for(int var5 = 0; var5 < 16; ++var5) {
                    int var6 = this.a(var3, var4);
                    if(!g) {
                        c[0] -= (a(var1 + 180) << 8) / 100;
                    }

                    c[1] -= (b(var1 + 180) << 8) / 100;
                    var3 = a() + a(var1 + 270) * var2 / 100;
                    var4 = b() + b(var1 + 270) * var2 / 100;
                    if(!this.d(var3, var4)) {
                        if(!g) {
                            c[0] += (a(var1 + 180) << 8) / 100;
                        }

                        c[1] += (b(var1 + 180) << 8) / 100;
                        p = var6;
                        break;
                    }
                }

                return true;
            }
        } catch (Exception var8) {
            ;
        }

        return false;
    }

    private boolean s() {
        this.F[0] = 0;
        this.F[1] = 0;
        if(this.c(0)) {
            return true;
        } else {
            int var1 = Math.abs(c[10]);
            this.h(0);
            this.ar();
            int[] var10000;
            byte var10001;
            if(var1 <= this.n && Math.abs(c[10]) > this.n && var1 <= this.n) {
                int var10002;
                if(c[10] < 0) {
                    var10000 = c;
                    var10001 = 10;
                    var10002 = -this.n;
                } else {
                    var10000 = c;
                    var10001 = 10;
                    var10002 = this.n;
                }

                var10000[var10001] = var10002;
            }

            if((p <= 22 || p >= 338) && (var1 > this.n || !this.a[3] && !this.a[4] && c[10] != 0) && c[10] != 0) {
                label222: {
                    if(c[10] < 0) {
                        c[10] += this.o;
                        if(c[10] <= 0) {
                            break label222;
                        }
                    } else {
                        c[10] -= this.o;
                        if(c[10] >= 0) {
                            break label222;
                        }
                    }

                    c[10] = 0;
                    c[13] = 0;
                    c[14] = 0;
                }
            }

            if(Math.abs(c[10]) > 4096) {
                short var8;
                if(c[10] < 0) {
                    var10000 = c;
                    var10001 = 10;
                    var8 = -4096;
                } else {
                    var10000 = c;
                    var10001 = 10;
                    var8 = 4096;
                }

                var10000[var10001] = var8;
            }

            if(this.n()) {
                return false;
            } else {
                this.k(0);
                if(this.aj == 0 || this.aj == 3) {
                    this.aw();
                }

                if(!l) {
                    boolean var2 = false;
                    byte var3 = 0;

                    try {
                        var3 = this.d[(b() >> 8) % this.bv][a() >> 8];
                    } catch (Exception var7) {
                        ;
                    }

                    if(this.aj == 0 && (var3 == 31 || var3 == 32)) {
                        var2 = true;
                        i = true;
                        c[10] += 256;
                        if(c[10] > 4096) {
                            c[10] = 4096;
                        }
                    }

                    if(this.aj == 0 && (var3 == 53 || var3 == 54)) {
                        var2 = true;
                    }

                    if(!var2) {
                        label258: {
                            if(this.s) {
                                if(this.a(a() - 12, b() - 24) && this.a(a() + 12, b() - 24)) {
                                    if(this.f()) {
                                        c[10] = 0;
                                        c[13] = 0;
                                        c[14] = 0;
                                        if(this.a[4]) {
                                            this.s();
                                        }
                                    }

                                    if(!this.g()) {
                                        break label258;
                                    }

                                    c[10] = 0;
                                    c[13] = 0;
                                    c[14] = 0;
                                    if(!this.a[3]) {
                                        break label258;
                                    }
                                } else {
                                    if(this.h() || this.f()) {
                                        c[10] = 0;
                                        c[13] = 0;
                                        c[14] = 0;
                                        if(this.a[4]) {
                                            this.s();
                                        }
                                    }

                                    if(!this.i() && !this.g()) {
                                        break label258;
                                    }

                                    c[10] = 0;
                                    c[13] = 0;
                                    c[14] = 0;
                                    if(!this.a[3]) {
                                        break label258;
                                    }
                                }
                            } else {
                                if(this.j()) {
                                    c[10] = 0;
                                    c[13] = 0;
                                    c[14] = 0;
                                    if(this.a[4]) {
                                        this.s();
                                    }
                                }

                                if(!this.k()) {
                                    break label258;
                                }

                                c[10] = 0;
                                c[13] = 0;
                                c[14] = 0;
                                if(!this.a[3]) {
                                    break label258;
                                }
                            }

                            this.s();
                        }
                    }

                    int var4 = c[0];
                    int var5 = c[1];
                    boolean var6 = true;
                    if(this.o()) {
                        this.h[0] = true;
                        var6 = false;
                    }

                    if(this.av > 0) {
                        if(var6) {
                            c[0] = var4;
                            c[1] = var5;
                        }
                    } else if(!this.s && var6) {
                        c[0] = var4;
                        c[1] = var5;
                        if(p != 22 || this.aj != 1 || this.ak != 1) {
                            c[3] = a(p + 90) * c[10] / 100;
                            c[5] = b(p + 90) * c[10] / 100;
                        }

                        if((p - 90) % 180 == 0) {
                            if(p == 90) {
                                c[0] += 256;
                                if(this.aj == 4 && this.ak != 0) {
                                    c[5] = 0;
                                }
                            } else {
                                c[0] -= 256;
                                if(c[10] > 2816) {
                                    this.av = 15;
                                }
                            }
                        }

                        c[10] = 0;
                        c[13] = 0;
                        c[14] = 0;
                        h = true;
                        g = true;
                        d = false;
                        this.s = false;
                        if(this.l()) {
                            c[5] = 0;
                        }
                    } else {
                        var2 = false;
                        if(this.aj == 0 && (var3 == 31 || var3 == 32)) {
                            var2 = true;
                        }

                        if(this.aj == 2 && (c[8] == 365 || c[8] == 364 || c[8] == 363 || c[8] == 362)) {
                            this.u();
                        }

                        if(!var2) {
                            this.u();
                        }
                    }
                }

                return false;
            }
        }
    }

    private void ao() {
        int[] var10000;
        byte var10001;
        int var10002;
        if(this.av > 0) {
            --this.av;
        } else {
            label76: {
                if(this.a[3]) {
                    c[12] = 1;
                    if(c[3] == 0) {
                        var10000 = c;
                        var10001 = 3;
                        var10002 = c[3] - (this.bi << 1);
                    } else {
                        c[3] -= this.o;
                        if(c[3] <= 0) {
                            break label76;
                        }

                        var10000 = c;
                        var10001 = 3;
                        var10002 = c[3] - this.o;
                    }
                } else {
                    if(!this.a[4]) {
                        break label76;
                    }

                    c[12] = 0;
                    int var10003;
                    if(c[3] == 0) {
                        var10000 = c;
                        var10001 = 3;
                        var10002 = c[3];
                        var10003 = this.bi << 1;
                    } else {
                        c[3] += this.o;
                        if(c[3] >= 0) {
                            break label76;
                        }

                        var10000 = c;
                        var10001 = 3;
                        var10002 = c[3];
                        var10003 = this.o;
                    }

                    var10002 += var10003;
                }

                var10000[var10001] = var10002;
            }
        }

        if(Math.abs(c[3]) > this.n) {
            if(c[3] < 0) {
                var10000 = c;
                var10001 = 3;
                var10002 = -this.n;
            } else {
                var10000 = c;
                var10001 = 3;
                var10002 = this.n;
            }

            var10000[var10001] = var10002;
        }

        this.F[0] += c[3];
        this.F[1] += c[5];
        if(c[5] > 0 && this.bJ <= 0) {
            label59: {
                if(p == 270) {
                    var10000 = c;
                    var10001 = 0;
                    var10002 = c[0] - 3072;
                } else {
                    if(p != 90) {
                        break label59;
                    }

                    var10000 = c;
                    var10001 = 0;
                    var10002 = c[0] + 3072;
                }

                var10000[var10001] = var10002;
            }

            p = 0;
        }

        this.k(1);
        if(this.aj == 0 || this.aj == 3) {
            this.aw();
        }

        if(g && this.bn <= 0) {
            if(this.f()) {
                c[10] = 0;
                c[13] = 0;
                c[14] = 0;
                c[3] = 0;
            }

            if(this.g()) {
                c[10] = 0;
                c[13] = 0;
                c[14] = 0;
                c[3] = 0;
            }
        }

        this.aq();
    }

    private boolean t() {
        this.F[0] = 0;
        this.F[1] = 0;
        if(this.c(0)) {
            return true;
        } else {
            this.h(1);
            this.as();
            this.k(0);
            int[] var10000;
            byte var10001;
            short var10002;
            if(Math.abs(c[10]) > 4096) {
                if(c[10] < 0) {
                    var10000 = c;
                    var10001 = 10;
                    var10002 = -4096;
                } else {
                    var10000 = c;
                    var10001 = 10;
                    var10002 = 4096;
                }

                var10000[var10001] = var10002;
            }

            Math.abs(c[10]);
            if(this.aj == 0 || this.aj == 3) {
                this.aw();
            }

            if(!l) {
                boolean var1 = false;
                byte var2 = this.d[(b() >> 8) % this.bv][a() >> 8];
                if(this.aj == 0) {
                    if(var2 == 31 || var2 == 32) {
                        var1 = true;
                        c[10] += 12;
                        if(c[10] > 4096) {
                            c[10] = 4096;
                        }
                    }
                } else {
                    label209: {
                        boolean var6;
                        if(this.aj == 0) {
                            if(var2 != 53 && var2 != 54) {
                                break label209;
                            }

                            var6 = true;
                        } else {
                            if(this.aj != 3 || var2 != 42 && var2 != 43 && var2 != 52 && var2 != 53) {
                                break label209;
                            }

                            var6 = true;
                        }

                        var1 = var6;
                    }
                }

                if(!var1) {
                    label210: {
                        if(this.s) {
                            if(this.a(a() - 12, b() - 24) && this.a(a() + 12, b() - 24)) {
                                if(this.f()) {
                                    c[10] = 0;
                                    c[13] = 0;
                                    c[14] = 0;
                                    if(this.a[4]) {
                                        this.s();
                                    }
                                }

                                if(!this.g()) {
                                    break label210;
                                }

                                c[10] = 0;
                                c[13] = 0;
                                c[14] = 0;
                                if(!this.a[3]) {
                                    break label210;
                                }
                            } else {
                                if(this.h() || this.f()) {
                                    c[10] = 0;
                                    c[13] = 0;
                                    c[14] = 0;
                                    if(this.a[4]) {
                                        this.s();
                                    }
                                }

                                if(!this.i() && !this.g()) {
                                    break label210;
                                }

                                c[10] = 0;
                                c[13] = 0;
                                c[14] = 0;
                                if(!this.a[3]) {
                                    break label210;
                                }
                            }
                        } else {
                            if(this.j()) {
                                c[10] = 0;
                                c[13] = 0;
                                c[14] = 0;
                                if(this.a[4]) {
                                    this.s();
                                }
                            }

                            if(!this.k()) {
                                break label210;
                            }

                            c[10] = 0;
                            c[13] = 0;
                            c[14] = 0;
                            if(!this.a[3]) {
                                break label210;
                            }
                        }

                        this.s();
                    }
                }

                int var3 = c[0];
                int var4 = c[1];
                boolean var5 = true;
                if(this.o()) {
                    this.h[0] = true;
                    var5 = false;
                }

                if(this.av > 0) {
                    if(var5) {
                        c[0] = var3;
                        c[1] = var4;
                    }
                } else if(!this.s && var5 && !var1) {
                    c[0] = var3;
                    c[1] = var4;
                    if(this.aj == 0 && Math.abs(c[10]) > 2560) {
                        if(c[10] < 0) {
                            var10000 = c;
                            var10001 = 10;
                            var10002 = -4224;
                        } else {
                            var10000 = c;
                            var10001 = 10;
                            var10002 = 4224;
                        }

                        var10000[var10001] = var10002;
                    }

                    c[3] = a(p + 90) * c[10] / 100;
                    c[5] = b(p + 90) * c[10] / 100;
                    if((p - 90) % 180 == 0) {
                        if(p == 90) {
                            c[0] += 256;
                            if(this.aj == 4 && this.ak != 0) {
                                c[5] = 0;
                            }
                        } else {
                            c[0] -= 256;
                            if(c[10] > 3072 && this.aj == 4) {
                                this.av = 15;
                            }
                        }
                    }

                    c[10] = 0;
                    c[13] = 0;
                    c[14] = 0;
                    h = true;
                    g = true;
                    d = false;
                    this.s = false;
                    if(this.l()) {
                        c[5] = 0;
                    }
                } else {
                    var1 = false;
                    if(this.aj == 0 && (this.d[(b() >> 8) % this.bv][a() >> 8] == 31 || this.d[(b() >> 8) % this.bv][a() >> 8] == 32)) {
                        var1 = true;
                    }

                    if(this.aj == 2 && (c[8] == 365 || c[8] == 364 || c[8] == 363 || c[8] == 362)) {
                        this.u();
                    }

                    if(!var1) {
                        this.u();
                    }
                }
            }

            return false;
        }
    }

    private void ap() {
        int[] var10000;
        byte var10001;
        int var10002;
        if(this.av > 0) {
            --this.av;
        } else if(!this.C) {
            label78: {
                if(this.a[3]) {
                    c[12] = 1;
                    if(c[3] == 0) {
                        var10000 = c;
                        var10001 = 3;
                        var10002 = c[3] - (this.bi << 1);
                    } else {
                        c[3] -= this.o;
                        if(c[3] <= 0) {
                            break label78;
                        }

                        var10000 = c;
                        var10001 = 3;
                        var10002 = c[3] - this.o;
                    }
                } else {
                    if(!this.a[4]) {
                        break label78;
                    }

                    c[12] = 0;
                    int var10003;
                    if(c[3] == 0) {
                        var10000 = c;
                        var10001 = 3;
                        var10002 = c[3];
                        var10003 = this.bi << 1;
                    } else {
                        c[3] += this.o;
                        if(c[3] >= 0) {
                            break label78;
                        }

                        var10000 = c;
                        var10001 = 3;
                        var10002 = c[3];
                        var10003 = this.o;
                    }

                    var10002 += var10003;
                }

                var10000[var10001] = var10002;
            }
        }

        if(Math.abs(c[3]) > 4096) {
            short var1;
            if(c[3] < 0) {
                var10000 = c;
                var10001 = 3;
                var1 = -4096;
            } else {
                var10000 = c;
                var10001 = 3;
                var1 = 4096;
            }

            var10000[var10001] = var1;
        }

        this.F[0] += c[3];
        this.F[1] += c[5];
        if(c[5] > 0 && this.bJ <= 0) {
            label61: {
                if(p == 270) {
                    var10000 = c;
                    var10001 = 0;
                    var10002 = c[0] - 3072;
                } else {
                    if(p != 90) {
                        break label61;
                    }

                    var10000 = c;
                    var10001 = 0;
                    var10002 = c[0] + 3072;
                }

                var10000[var10001] = var10002;
            }

            p = 0;
        }

        this.k(1);
        if(this.aj == 0 || this.aj == 3) {
            this.aw();
        }

        --this.bn;
        if(g && this.bn <= 0) {
            if(this.f()) {
                c[10] = 0;
                c[13] = 0;
                c[14] = 0;
                c[3] = 0;
            }

            if(this.g()) {
                c[10] = 0;
                c[13] = 0;
                c[14] = 0;
                c[3] = 0;
            }
        }

        this.aq();
    }

    private void e(int var1) {
        if(var1 == 0) {
            i = false;
            this.aw = 0;
            g = false;
            c = false;
            d = false;
        }

        int[] var10000;
        byte var10001;
        int var10002;
        label100: {
            int var2;
            if(var1 == 0) {
                c[10] = c[3];
                if((var2 = this.a(a(), b())) < 0) {
                    for(int var3 = 1; var3 < this.bI + 1 && (var2 = this.a(a() - var3, b())) < 0 && (var2 = this.a(a() + var3, b())) < 0; ++var3) {
                        ;
                    }
                }

                label117: {
                    p = var2;
                    if((var2 > 67 || var2 < 44) && (var2 < 293 || var2 > 316)) {
                        if(var2 >= 338 || var2 <= 22) {
                            break label117;
                        }

                        var10000 = c;
                        var10001 = 10;
                        var10002 = c[10] + b(var2 + 90) * c[5] / 100;
                    } else {
                        if(c[5] > 3072) {
                            c[5] = 4096;
                        }

                        if(b(var2 + 90) > 0) {
                            var10000 = c;
                            var10001 = 10;
                            var10002 = c[5];
                        } else {
                            var10000 = c;
                            var10001 = 10;
                            var10002 = -c[5];
                        }
                    }

                    var10000[var10001] = var10002;
                }

                c[5] = 0;
                c[3] = 0;
                if(this.aj == 2 && (c[8] == 365 || c[8] == 364 || c[8] == 363 || c[8] == 362)) {
                    this.D = true;
                }

                if(c[10] < 0) {
                    c[13] = 1;
                }

                if(c[10] > 0) {
                    c[13] = 2;
                }

                var10000 = c;
                var10001 = 14;
            } else {
                if(c) {
                    if((var2 = this.a(a(), b() - 32)) < 0) {
                        var2 = p;
                    }

                    if(var2 % 90 != 0) {
                        var10000 = c;
                        var10001 = 3;
                        var10002 = c[3] + -(b(var2 + 90) * c[5]) / 100;
                        break label100;
                    }
                }

                var10000 = c;
                var10001 = 5;
            }

            var10002 = 0;
        }

        var10000[var10001] = var10002;
    }

    private void aq() {
        if(this.bJ > 0) {
            --this.bJ;
        } else {
            if(-this.bl <= c[5]) {
                this.a[2] = false;
            } else if(!this.a[2] && !c && !h) {
                c[5] = -this.bl;
            }

            c var10000;
            byte var10001;
            if(c[5] > 0) {
                c = false;
                if(!this.p()) {
                    return;
                }

                if(p < 270 && p > 90) {
                    p = 0;
                    return;
                }

                var10000 = this;
                var10001 = 0;
            } else {
                if(!this.l()) {
                    return;
                }

                var10000 = this;
                var10001 = 1;
            }

            var10000.e(var10001);
        }
    }

    private void ar() {
        label99: {
            c var10000;
            byte var10001;
            label98: {
                if(this.C) {
                    c[12] = 0;
                    if(c[13] == 0) {
                        c[13] = 2;
                        c[14] = 2;
                    }

                    var10000 = this;
                } else {
                    if(Q) {
                        break label99;
                    }

                    if(this.aj == 5 && this.ak != 2 && (37 == c[8] || 38 == c[8] || 39 == c[8] || 41 == c[8] || 42 == c[8] || 47 == c[8] || 48 == c[8] || 49 == c[8] || 52 == c[8] || 59 == c[8] || 62 == c[8] || 69 == c[8] || 71 == c[8] || 72 == c[8] || 78 == c[8] || 79 == c[8] || 87 == c[8] || 88 == c[8] || 89 == c[8])) {
                        c[10] += 256;
                        if(1024 < c[10]) {
                            c[10] = 1024;
                        }

                        c[12] = 0;
                        c[13] = 0;
                        c[14] = 0;
                        break label99;
                    }

                    if(this.av > 0) {
                        --this.av;
                        break label99;
                    }

                    if(this.a[3]) {
                        c[12] = 1;
                        if(c[13] == 0) {
                            c[13] = 1;
                        }

                        if(c[14] == 0) {
                            c[14] = 1;
                        }

                        var10000 = this;
                        var10001 = 0;
                        break label98;
                    }

                    if(!this.a[4]) {
                        break label99;
                    }

                    c[12] = 0;
                    if(c[13] == 0) {
                        c[13] = 2;
                    }

                    if(c[14] == 0) {
                        c[14] = 2;
                    }

                    var10000 = this;
                }

                var10001 = 1;
            }

            var10000.f(var10001);
        }

        this.F[0] += a(p + 90) * c[10] / 100;
        this.F[1] += b(p + 90) * c[10] / 100;
    }

    private void f(int var1) {
        if(var1 == 1) {
            if(c[10] < 0 && c[13] == 1) {
                c[10] += this.bi;
                if(c[10] > 0) {
                    c[10] = 0;
                    c[13] = 0;
                    c[14] = 0;
                }
            }

            if(c[10] == 0) {
                c[10] += this.o;
            }

            c[10] += this.o;
            if(c[10] <= 0 || c[13] != 1) {
                return;
            }
        } else {
            if(c[10] > 0 && c[13] == 2) {
                c[10] -= this.bi;
                if(c[10] < 0) {
                    c[10] = 0;
                    c[13] = 0;
                    c[14] = 0;
                }
            }

            if(c[10] == 0) {
                c[10] -= this.o;
            }

            c[10] -= this.o;
            if(c[10] >= 0 || c[13] != 2) {
                return;
            }
        }

        c[13] = 0;
        c[14] = 0;
    }

    private void as() {
        if(this.C) {
            c[12] = 0;
            if(c[13] == 0) {
                c[13] = 2;
                c[14] = 2;
            }

            this.f(1);
        } else if(this.aj != 5 || this.ak == 2 || 37 != c[8] && 38 != c[8] && 39 != c[8] && 41 != c[8] && 42 != c[8] && 47 != c[8] && 48 != c[8] && 49 != c[8] && 52 != c[8] && 59 != c[8] && 62 != c[8] && 69 != c[8] && 71 != c[8] && 72 != c[8] && 78 != c[8] && 79 != c[8] && 87 != c[8] && 88 != c[8] && 89 != c[8]) {
            if(this.av > 0) {
                --this.av;
            } else {
                label82: {
                    c var10000;
                    byte var10001;
                    if(this.a[3]) {
                        if(c[13] == 0) {
                            c[13] = 1;
                        }

                        if(c[14] == 0) {
                            c[14] = 1;
                        }

                        c[12] = 1;
                        var10000 = this;
                        var10001 = 0;
                    } else {
                        if(!this.a[4]) {
                            break label82;
                        }

                        if(c[13] == 0) {
                            c[13] = 2;
                        }

                        if(c[14] == 0) {
                            c[14] = 2;
                        }

                        c[12] = 0;
                        var10000 = this;
                        var10001 = 1;
                    }

                    var10000.g(var10001);
                }
            }
        } else {
            c[10] += 256;
            if(2560 < c[10]) {
                c[10] = 2560;
            }
        }

        this.F[0] += a(p + 90) * c[10] / 100;
        this.F[1] += b(p + 90) * c[10] / 100;
        if(c[10] != 0 && c[10] != 0) {
            label74: {
                if(c[10] < 0) {
                    c[10] += this.o;
                    if(c[10] < 0) {
                        break label74;
                    }
                } else {
                    c[10] -= this.o;
                    if(c[10] > 0) {
                        break label74;
                    }
                }

                c[10] = 0;
                c[13] = 0;
                c[14] = 0;
                i = false;
            }
        }

        if(c[10] == 0) {
            i = false;
            this.aw = 0;
        }

    }

    private void g(int var1) {
        int[] var10000;
        byte var10001;
        short var10002;
        label27: {
            if(var1 == 1) {
                c[10] += this.o >> 1;
                if(Math.abs(c[10]) <= 4096) {
                    return;
                }

                if(c[10] < 0) {
                    var10000 = c;
                    var10001 = 10;
                    var10002 = -4096;
                    break label27;
                }

                var10000 = c;
            } else {
                c[10] -= this.o >> 1;
                if(Math.abs(c[10]) <= 4096) {
                    return;
                }

                if(c[10] < 0) {
                    var10000 = c;
                    var10001 = 10;
                    var10002 = -4096;
                    break label27;
                }

                var10000 = c;
            }

            var10001 = 10;
            var10002 = 4096;
        }

        var10000[var10001] = var10002;
    }

    private void h(int var1) {
        if(!this.s) {
            int var2;
            if(0 == var1) {
                var2 = p;
                if(p < 0) {
                    var2 = 0;
                    if(p != 0 && !this.s && (p <= 22 || p >= 338)) {
                        var2 = c[10] > 0?90:(c[10] < 0?270:p);
                    }
                }

                if(p > 22 && p < 338) {
                    c[10] += b(var2 + 90) * 32 / 100;
                    return;
                }
            } else {
                var2 = c[10];
                int var3 = p;
                if(p < 0) {
                    var3 = 0;
                    if(p != 0 && !this.s && (p <= 22 || p >= 338)) {
                        var3 = c[10] > 0?90:(c[10] < 0?270:p);
                    }
                }

                label146: {
                    if(var3 < 338 && var3 > 22) {
                        if(b(var3 + 90) * 80 / 100 < 0 && c[10] < 0) {
                            c[10] += b(var3 + 90) * 80 / 100;
                        }

                        if(b(var3 + 90) * 80 / 100 <= 0 || c[10] <= 0) {
                            break label146;
                        }
                    } else if(p == 338 || p == 22) {
                        if((b(var3 + 90) << 5) / 100 < 0 && c[10] < 0) {
                            c[10] += b(var3 + 90) * 80 / 100;
                        }

                        if((b(var3 + 90) << 5) / 100 <= 0 || c[10] <= 0) {
                            break label146;
                        }
                    }

                    c[10] += b(var3 + 90) * 80 / 100;
                }

                if(c[10] >= 0 && var2 <= 0) {
                    c[10] = 0;
                    c[13] = 0;
                    c[14] = 0;
                    i = false;
                }

                if(c[10] <= 0 && var2 >= 0) {
                    c[10] = 0;
                    c[13] = 0;
                    c[14] = 0;
                    i = false;
                }
            }

        }
    }

    public final void t() {
        int var1 = 112;
        if(this.bh > 0) {
            var1 = 112 + (this.bh << 1);
        }

        if(this.bg > 0) {
            var1 -= this.bg << 1;
        }

        label115: {
            int[] var10000;
            byte var10001;
            int var3;
            if(this.aj == 0 && this.ak == 3) {
                this.K[0] = 0;
                this.K[2] = 0;
                this.K[1] = 3840;
                this.K[3] = 128;
                if(!this.u) {
                    break label115;
                }

                var10000 = this.K;
                var10001 = 1;
                var3 = this.K[1] + 768;
            } else {
                if(this.aj == 5 && this.ak == 3) {
                    break label115;
                }

                this.K[0] = 0;
                this.K[2] = 0;
                this.K[1] = c[this.aj][this.ak][2] + 320;
                this.K[3] = this.c() + (240 - (184 - var1));
                if(this.c == 2) {
                    this.C = true;
                }

                if(this.ak != 2 || this.aj != 1) {
                    if(this.ak < 2) {
                        if(a() >= f[this.aj][this.ak] || this.c == 1) {
                            this.K[0] = f[this.aj][this.ak] - 144;
                            this.c = 1;
                        }
                    } else if(this.c == 2 && this.aj != 1) {
                        this.K[0] = (short)(c[this.aj][this.ak][2] + 320);
                    }
                }

                if(this.ak == 2 && this.aj != 1 && this.u) {
                    this.K[1] += 256;
                }

                if(this.t) {
                    label112: {
                        short var10002;
                        if(this.aj == 0) {
                            this.K[0] = 10752 - (g >> 1) + -16;
                            this.K[1] = 10752 - (g >> 1) + g + 16;
                            this.K[2] = 0;
                            var10000 = this.K;
                            var10001 = 3;
                            var10002 = 800;
                        } else if(this.aj == 2) {
                            this.K[0] = 6304 - (g >> 1) + -16;
                            this.K[1] = 6304 - (g >> 1) + g + 16;
                            this.K[2] = 560;
                            var10000 = this.K;
                            var10001 = 3;
                            var10002 = 568;
                        } else if(this.aj == 4) {
                            this.K[0] = 11424 - (g >> 1) + -40;
                            this.K[1] = 11424 - (g >> 1) + g + 40;
                            this.K[2] = 1232;
                            var10000 = this.K;
                            var10001 = 3;
                            var10002 = 1248;
                        } else {
                            if(this.aj != 3) {
                                break label112;
                            }

                            this.K[0] = 8400 - (g >> 1);
                            this.K[1] = 8400 - (g >> 1) + g;
                            this.K[2] = 528;
                            var10000 = this.K;
                            var10001 = 3;
                            var10002 = 576;
                        }

                        var10000[var10001] = var10002 + var1;
                    }
                }

                if(!this.u) {
                    break label115;
                }

                if(this.aj == 0) {
                    this.K[0] = 10752 - (g >> 1);
                    var10000 = this.K;
                    var10001 = 1;
                    var3 = this.K[1] + 16;
                } else if(this.aj == 2) {
                    this.K[0] = 6304 - (g >> 1);
                    var10000 = this.K;
                    var10001 = 1;
                    var3 = this.K[1] + 16;
                } else if(this.aj == 4) {
                    this.K[0] = 11424 - (g >> 1);
                    var10000 = this.K;
                    var10001 = 1;
                    var3 = this.K[1] + -16;
                } else {
                    if(this.aj != 3) {
                        break label115;
                    }

                    var10000 = this.K;
                    var10001 = 0;
                    var3 = 8400 - (g >> 1);
                }
            }

            var10000[var10001] = var3;
        }

        if(j) {
            this.au();
        } else {
            this.i(var1);
        }
    }

    private void i(int var1) {
        this.at();
        this.j(var1);

        for(int var2 = 0; var2 < 2; ++var2) {
            if(y[var2] < 0) {
                y[var2] = 0;
            }
        }

    }

    private void at() {
        int var1 = g >> 1;
        int var2 = a();
        if(y[0] >= this.K[1] - g && !this.t && this.bw == 0 && this.ak == 2) {
            this.aH();
        }

        if(var2 - y[0] < var1) {
            if(!this.p) {
                this.aa = true;
                y[0] -= var1 - (var2 - y[0]);
                if(y[0] < this.K[0]) {
                    y[0] = this.K[0];
                }

                if(y[0] + 16 << 8 > c[0]) {
                    c[0] = y[0] + 16 << 8;
                    if(c[10] < 0) {
                        c[10] = 0;
                        c[13] = 0;
                        c[14] = 0;
                    }

                    if(!g && i) {
                        i = false;
                    }

                    if(g && c[3] < 0) {
                        c[3] = 0;
                        return;
                    }
                }

                return;
            }

            if(y[0] + 16 << 8 <= c[0]) {
                return;
            }

            c[0] = y[0] + 16 << 8;
            if(c[10] < 0) {
                c[10] = 0;
                c[13] = 0;
                c[14] = 0;
            }

            if(g || !i) {
                return;
            }
        } else {
            if(var2 - y[0] <= var1) {
                return;
            }

            this.Z = true;
            y[0] -= var1 - (var2 - y[0]);
            if(y[0] + (var1 << 1) > this.K[1]) {
                y[0] = this.K[1] - (var1 << 1);
            }

            if(this.C) {
                if(y[0] + 96 + 240 << 8 >= c[0]) {
                    return;
                }

                c[0] = y[0] + 96 + 240 << 8;
                c[10] = 0;
                c[13] = 0;
                c[14] = 0;
                if(g || !i) {
                    return;
                }
            } else {
                if(y[0] - 16 + 240 << 8 >= c[0]) {
                    return;
                }

                c[0] = y[0] - 16 + 240 << 8;
                c[10] = 0;
                c[13] = 0;
                c[14] = 0;
                if(g || !i) {
                    return;
                }
            }
        }

        i = false;
    }

    private void j(int var1) {
        int var3 = b();
        if(this.t && (this.aj != 1 || this.ak != 2) && y[1] + var1 > this.K[3]) {
            y[1] = this.K[3] - var1;
        }

        if(var3 - y[1] < var1) {
            this.Z = true;
            y[1] -= var1 - (var3 - y[1]);
            if((this.aj == 1 && this.ak == 2 && y[0] < 7936 || this.aj == 5 && this.ak == 1) && this.bh <= 0 && this.bg <= 0) {
                return;
            }

            if(y[1] < this.K[2]) {
                y[1] = this.K[2];
                return;
            }
        } else if(var3 - y[1] > var1) {
            this.Z = true;
            y[1] -= var1 - (var3 - y[1]);
            if(y[1] + var1 > this.K[3]) {
                y[1] = this.K[3] - var1;
            }

            if(this.aj != 1 || this.ak != 2) {
                if(this.aj == 5 && this.ak == 1) {
                    return;
                }

                if((this.aj == 3 && y[1] + 168 << 8 < c[1] || y[1] - 16 + 240 << 8 < c[1]) && !j) {
                    c[1] = y[1] - 16 + 240 << 8;
                    this.v();
                }
            }
        }

    }

    private int c() {
        int var1 = this.bv * 256 - 232;
        int var10000;
        switch(this.aj) {
        case 0:
            var10000 = this.d();
            break;
        case 1:
        case 3:
        default:
            return var1;
        case 2:
            var10000 = this.e();
            break;
        case 4:
            var10000 = this.f();
        }

        var1 = var10000;
        return var1;
    }

    private int d() {
        int var1 = 1024;
        int var10000;
        switch(this.ak) {
        case 0:
            if(6016 <= y[0]) {
                return var1;
            }

            var10000 = 768;
            break;
        case 1:
            var10000 = 3792 > y[0]?768:(5632 > y[0]?512:(7632 > y[0]?1024:768));
            break;
        case 2:
            if(896 > y[0]) {
                var10000 = 768;
            } else if(2400 > y[0]) {
                var10000 = 784;
            } else if(640 > y[1]) {
                var10000 = 768;
            } else if(4992 <= y[0]) {
                var1 = 1024;
                if(5888 <= y[0]) {
                    if(y[1] <= 880) {
                        var10000 = 768;
                        break;
                    } else if(6144 <= y[0]) {
                        this.K[1] = 6144 + g;
                        this.bw = 1;
                        return var1;
                    }
                }

                return var1;
            } else {
                var10000 = 1216;
            }
            break;
        default:
            return var1;
        }

        var1 = var10000;
        return var1;
    }

    private int e() {
        short var10000;
        short var2;
        switch(this.ak) {
        case 0:
            if((this.B != 0 || this.C != 0) && y[0] == 0 && y[1] == 0) {
                var10000 = 1280;
            } else {
                boolean var1 = false;
                if(a() > 3584 && a() < 4096 && b() > 1024 && b() < 1248) {
                    var10000 = 1280;
                } else if(3696 <= y[0]) {
                    var2 = 528;
                    if(5168 <= y[0]) {
                        return var2;
                    }

                    var10000 = 1280;
                } else if(1792 > y[0]) {
                    var10000 = 464;
                } else if(2400 <= y[0] && 2752 > y[0]) {
                    var2 = 1280;
                    if(728 <= y[1]) {
                        return var2;
                    }

                    var10000 = 544;
                } else {
                    var2 = 1280;
                    if(728 <= y[1]) {
                        if(1176 > y[1] && 3792 > y[0]) {
                            ;
                        }

                        return var2;
                    }

                    if(3328 <= y[0]) {
                        return var2;
                    }

                    var10000 = 544;
                }
            }
            break;
        case 1:
            var10000 = 1312;
            break;
        default:
            var2 = 1824;
            if(5472 >= y[0] || b() >= 1280) {
                return var2;
            }

            var10000 = 528;
        }

        var2 = var10000;
        return var2;
    }

    private int f() {
        boolean var1 = false;
        short var10000;
        short var2;
        switch(this.ak) {
        case 1:
            var2 = 1312;
            if(9632 > y[0] || 1248 <= b()) {
                return var2;
            }

            var10000 = 1056;
            break;
        default:
            var2 = 1228;
            if(11264 <= y[0]) {
                return var2;
            }

            var10000 = 1824;
        }

        var2 = var10000;
        return var2;
    }

    private void k(int var1) {
        this.an();
        int[] var10000;
        byte var10001;
        int var10002;
        int var10003;
        if(this.aj == 1 && this.ah < b() - 12) {
            c[0] += this.F[0] >> 1;
            var10000 = c;
            var10001 = 1;
            var10002 = c[1];
            var10003 = this.F[1] >> 1;
        } else {
            if(this.F[0] > 4096) {
                this.F[0] = 4096;
            }

            if(this.F[0] < -4096) {
                this.F[0] = -4096;
            }

            if(this.F[1] > 4096) {
                this.F[1] = 4096;
            }

            if(this.F[1] < -4096) {
                this.F[1] = -4096;
            }

            c[0] += this.F[0];
            var10000 = c;
            var10001 = 1;
            var10002 = c[1];
            var10003 = this.F[1];
        }

        var10000[var10001] = var10002 + var10003;
        if(var1 == 1) {
            if(this.bm <= 0) {
                if(this.aj == 1 && this.ah < b() - 12) {
                    c[5] += this.bj / 2;
                } else {
                    c[5] += this.bj;
                }
            } else {
                --this.bm;
            }
        }

        if(var1 == 1 && i) {
            var10000 = c;
            var10001 = 11;
            var10002 = c[11];
            var10003 = this.n;
        } else if(Math.abs(this.F[0]) + Math.abs(this.F[1]) > this.n) {
            var10000 = c;
            var10001 = 11;
            var10002 = c[11];
            var10003 = this.n;
        } else {
            var10000 = c;
            var10001 = 11;
            var10002 = c[11];
            var10003 = Math.abs(this.F[0]) + Math.abs(this.F[1]);
        }

        var10000[var10001] = var10002 + var10003;
    }

    private boolean u() {
        if(p <= 290 && p >= 70) {
            int[] var10000;
            byte var10001;
            int var1;
            byte var10002;
            if(p >= 90 && p <= 270) {
                if(Math.abs(c[10]) < 640) {
                    if(c[10] < 0) {
                        var10000 = c;
                        var10001 = 12;
                        var10002 = 1;
                    } else {
                        var10000 = c;
                        var10001 = 12;
                        var10002 = 0;
                    }

                    var10000[var10001] = var10002;
                    c[13] = 0;
                    c[14] = 0;
                    var1 = c[10];
                    c[5] = b(p + 90) * var1 / 100;
                    if(p > 90 && p < 270) {
                        c[5] = 0;
                    }

                    c[3] = a(p + 90) * var1 / 100;
                    g = true;
                    d = false;
                    this.s = false;
                    this.bJ = 15;
                    if(p == 90 || p == 270) {
                        this.bJ = 0;
                    }

                    this.l();
                }
            } else if(Math.abs(c[10]) < 640) {
                if(c[10] < 0) {
                    var10000 = c;
                    var10001 = 12;
                    var10002 = 1;
                } else {
                    var10000 = c;
                    var10001 = 12;
                    var10002 = 0;
                }

                var10000[var10001] = var10002;
                c[13] = 0;
                c[14] = 0;
                var1 = Math.abs(c[10]);
                c[5] = 280;
                c[3] = -(a(p + 90) * var1) / 100;
                g = true;
                d = false;
                this.s = false;
                this.av = 30;
                this.l();
            }
        }

        return false;
    }

    public static int a() {
        return c[0] >> 8;
    }

    public static int b() {
        return c[1] >> 8;
    }

    public final void u() {
        if(!this.E) {
            if(this.q <= 0) {
                if(this.G && this.f[0]) {
                    return;
                }

                int[] var10000;
                byte var10001;
                short var10002;
                if(this.t > 0) {
                    this.t = 0;
                    this.r = 60;
                    d = true;
                    g = true;
                    if(c[12] == 1) {
                        var10000 = c;
                        var10001 = 3;
                        var10002 = 512;
                    } else {
                        var10000 = c;
                        var10001 = 3;
                        var10002 = -512;
                    }

                    var10000[var10001] = var10002;
                    c[5] = -1024;
                    c[12] = (c[12] + 1) % 2;
                    c[13] = 0;
                    c[14] = 0;
                } else {
                    if(this.r > 0) {
                        return;
                    }

                    if(this.v <= 0) {
                        this.v();
                        return;
                    }

                    this.r = 60;
                    d = true;
                    g = true;
                    if(!e() && c[12] == 1) {
                        var10000 = c;
                        var10001 = 3;
                        var10002 = 512;
                    } else {
                        var10000 = c;
                        var10001 = 3;
                        var10002 = -512;
                    }

                    var10000[var10001] = var10002;
                    c[5] = -1024;
                    c[12] = (c[12] + 1) % 2;
                    c[13] = 0;
                    c[14] = 0;
                    if(!this.G || !this.f[0]) {
                        this.k(a(), b() - 12, this.v);
                        this.v = 0;
                    }
                }

                this.E = true;
            }

        }
    }

    public final void v() {
        if(j) {
            this.v = true;
            this.ao = 10;
        } else {
            o = true;
            this.bf = 2100;
            g = true;
            d = false;
            i = false;
            j = true;
            this.V = true;
            this.s = false;
            c[10] = 0;
            c[13] = 0;
            c[14] = 0;
            this.bm = 5;
            c[3] = 0;
            c[5] = b(0) * this.bk / 100;
            this.z = 120;
        }
    }

    private void au() {
        if(j) {
            c[3] = 0;
            --this.z;
            if(y[1] - 16 + 240 << 8 < c[1] && this.V) {
                this.V = false;
                if(!this.G || !this.f[0]) {
                    --this.A;
                }

                if(this.A <= 0) {
                    this.a.a(14, 1, false);
                    this.z = 240;
                    this.v = true;
                    this.ao = 10;
                } else if(this.x == 59 && this.y == 9) {
                    this.z = 240;
                    X = true;
                    this.v = true;
                    this.ao = 10;
                    this.D = 0;
                    this.E = 0;
                    this.Y = true;
                }
            }

            if(this.z < 0) {
                if(this.A <= 0) {
                    if(!d.a()) {
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var2) {
                            ;
                        }

                        this.aI();
                    }

                    this.v = true;
                    this.ao = 10;
                    return;
                }

                this.p();
            }
        }

    }

    public final void a(int var1) {
        this.h[0] = true;
        if(!this.E && c[5] >= 0) {
            if(g && i && !h) {
                i = false;
            }

            int var2;
            if((var2 = this.as - 8) >= 0 && Math.abs(a() - this.at) > var2) {
                this.F = true;
                this.ar = 0;
                if(a() - this.at > 0) {
                    this.ar = 1;
                }
            }

            this.D = false;
            c[8] = 0;
            c[5] = 0;
            if(g) {
                c[10] = c[3];
                if(c[10] < 0) {
                    c[13] = 1;
                }

                if(c[10] > 0) {
                    c[13] = 2;
                }

                c[14] = 0;
            }

            c[3] = 0;
            this.s = true;
            this.ag = var1;
            p = 0;
            g = false;
            c = false;
            Q = false;
            this.aw = 0;
        }
    }

    private int a(int var1, int var2) {
        if(var1 < 0) {
            var1 = 0;
        }

        if(var2 < 0) {
            var2 = 0;
        }

        int var3 = (this.d[(var2 >> 4 >> 4) % this.bv][var1 >> 4 >> 4] << 9) + ((var1 >> 4 & 15) + ((var2 >> 4 & 15) << 4) << 1) + 1;
        if(this.f[var3 >> 1] == 1) {
            return -1;
        } else {
            int var5;
            label39: {
                short var10000;
                label38: {
                    int var4 = (this.h[var3] & 255) + (this.d[var3 >> 1] << 8);
                    var5 = this.f(var4) * 360 / 255;
                    if(this.e[var3 >> 1] != 1) {
                        if(this.e[var3 >> 1] == 2) {
                            var10000 = 540;
                            break label38;
                        }

                        if(this.e[var3 >> 1] != 3) {
                            break label39;
                        }

                        var5 = (var5 = 540 - var5) % 360;
                    }

                    var10000 = 360;
                }

                var5 = var10000 - var5;
            }

            if(var5 % 90 == 0) {
                if(p == 62) {
                    return 90;
                }

                var5 = Math.abs((p - 22 + 45) / 90) * 90;
                if(p == 44) {
                    var5 = 0;
                }
            }

            return var5 % 360;
        }
    }

    public final void w() {
        if(!this.K) {
            if(this.r > 0) {
                --this.r;
            }

            if((this.r & 1) != 1) {
                int var1 = a[0];
                int var3 = (540 - p) % 360;
                if(c[12] == 1) {
                    var1 = a[4];
                }

                c[11] %= 92160;
                int var4 = 0;
                int var5 = 0;
                boolean var6 = false;
                boolean var7 = false;
                int var8 = a();
                int var9 = b();
                byte var10 = 33;
                int var11 = 1;
                boolean var12 = false;
                int var10000;
                int var17;
                if(c) {
                    var17 = 28;
                } else {
                    byte var10001;
                    int[] var18;
                    if(d && g) {
                        if(c[12] == 1) {
                            var18 = a;
                            var10001 = 0;
                        } else {
                            var18 = a;
                            var10001 = 4;
                        }

                        var1 = var18[var10001];
                        var9 -= 5;
                        var17 = 26;
                    } else if(this.bo > 0) {
                        var17 = 11;
                        --this.bo;
                    } else if(f) {
                        var1 = a[4];
                        var17 = 35 + (this.j >> 1) % 2;
                        f = false;
                    } else if(e) {
                        if((this.j >> 1) % 5 < 3) {
                            var1 = a[0];
                            var10000 = 32 + (this.j >> 1) % 4;
                        } else {
                            var1 = a[4];
                            var10000 = 36 - (this.j >> 1) % 4;
                        }

                        var17 = var10000;
                        e = false;
                    } else if(i && g) {
                        var4 = 0;
                        if(g && p == 270) {
                            var4 -= 16;
                        }

                        var8 += var4;
                        var17 = 6 + c[11] / this.n / 4 % 5;
                    } else if(Q) {
                        var9 -= 5;
                        var17 = 25 + this.j / 2 % 2;
                    } else if(j) {
                        if(W) {
                            var17 = 29;
                        } else {
                            var17 = 27;
                        }
                    } else if(i && !g) {
                        var4 = -16 + a(var3) * 16 / 100;
                        var5 = -15 - b(var3) * 15 / 100;
                        var8 += var4;
                        var9 += var5;
                        var10 = 20;
                        var17 = 6 + c[11] / this.n / 4 % 4;
                    } else if(k) {
                        var17 = 22;
                        k = false;
                    } else if(R) {
                        var17 = 5;
                        R = false;
                    } else if(this.be > 0) {
                        var17 = 37 + this.j / 4 % 4;
                    } else if(c[10] == 0 && !g) {
                        if(this.F) {
                            if(this.ar == 1) {
                                var18 = a;
                                var10001 = 0;
                            } else {
                                var18 = a;
                                var10001 = 4;
                            }

                            var1 = var18[var10001];
                            var17 = 23 + this.au / 8 % 2;
                        } else if(this.s || p > 22 && p < 338 || (this.e(a() + 12, b()) || this.e(a() + 12, b() + 16)) && (this.e(a() - 12, b()) || this.e(a() - 12, b() + 16))) {
                            if(this.au < 75) {
                                var17 = 0;
                            } else if(this.au < 90) {
                                var17 = 1;
                            } else if(this.au < 105) {
                                var17 = 2;
                            } else {
                                var17 = 3 + this.au / 8 % 2;
                            }
                        } else {
                            if(!this.e(a() + 12, b()) && !this.e(a() + 12, b() + 16)) {
                                var18 = a;
                                var10001 = 0;
                            } else {
                                var18 = a;
                                var10001 = 4;
                            }

                            var1 = var18[var10001];
                            var17 = 23 + this.au / 8 % 2;
                        }
                    } else if(!g && (c[14] == 2 && c[10] > 0 && c[12] == 1 || c[14] == 1 && c[10] < 0 && c[12] == 0)) {
                        var1 = a[0];
                        if(c[12] == 0) {
                            var1 = a[4];
                        }

                        var17 = 30 + c[11] / this.n / 4 % 2;
                    } else {
                        int var2;
                        for(var2 = 0; var2 < 7 && (var2 * 45 + 23 >= var3 || (var2 + 1) * 45 + 23 < var3); ++var2) {
                            ;
                        }

                        var1 = g(var2);
                        var11 = var2 % 2;
                        var10 = 20;
                        var17 = Math.abs(c[10]) < this.n && !S?(var11 == 1?12 + c[11] / this.n / 4 % 6:c[11] / this.n / 4 % 6):(var11 == 1?18 + c[11] / this.n / 4 % 4:6 + c[11] / this.n / 4 % 4);
                        int var13 = a[var11 == 1?151:152][var17][2] >> 1;
                        int var14 = a[var11 == 1?151:152][var17][3] >> 1;
                        var4 = -var13 + a(var3) * var13 / 100;
                        var5 = -var14 - b(var3) * var14 / 100;
                        var8 += var4;
                        var9 += var5;
                    }
                }

                short var10002;
                int var19;
                if(var11 == 1) {
                    var10000 = var8;
                    var19 = var9;
                    var10002 = 151;
                } else {
                    var10000 = var8;
                    var19 = var9;
                    var10002 = 152;
                }

                a(var10000, var19, var10002, var17, var1, var10);
                S = false;
                if(this.be > 0) {
                    --this.be;
                }

                c var20;
                if(c[10] == 0 && !g) {
                    var20 = this;
                    var19 = this.au + 1;
                } else {
                    var20 = this;
                    var19 = 0;
                }

                var20.au = var19;
                int var15 = -16 + a(var3) * 16 / 100;
                int var16 = -16 - b(var3) * 16 / 100;
                if(this.q > 0) {
                    if(this.j % 2 == 0) {
                        if(var4 == 0 && var5 == 0) {
                            this.j(a(), b() - 18, 0);
                            return;
                        }

                        this.j(a() + var15 + 16, b() + var16 + 16, 0);
                        return;
                    }
                } else if(this.t > 0) {
                    if(var15 == 0 && var16 == 0) {
                        var8 = a() + var4;
                        var10000 = b() - 18;
                        var19 = var5;
                    } else {
                        var8 = a() + var15 + 16;
                        var10000 = b() + var16;
                        var19 = 16;
                    }

                    var9 = var10000 + var19;
                    if(i && g && var3 == 254) {
                        var8 += 16;
                        var9 -= 8;
                    }

                    b(109, 48, 48 * (this.j % 2), 48, 48, a[0], var8, var9 - 4);
                }

            }
        }
    }

    private static int g(int var0) {
        int[] var10000;
        int[] var10001;
        byte var10002;
        int[] var10003;
        byte var10004;
        if(c[12] == 1) {
            boolean var1 = false;
            var10000 = new int[]{a[5], a[5], a[4], a[4], a[7], a[7], a[6], 0};
            var10001 = var10000;
            var10002 = 7;
            var10003 = a;
            var10004 = 6;
        } else {
            var10000 = new int[]{a[2], a[1], a[1], a[0], a[0], a[3], a[3], 0};
            var10001 = var10000;
            var10002 = 7;
            var10003 = a;
            var10004 = 2;
        }

        var10001[var10002] = var10003[var10004];
        return var10000[var0];
    }

    private void j(int var1, int var2, int var3) {
        for(int var4 = 0; var4 < this.k.length; ++var4) {
            if(this.k[var4][0] == 0) {
                this.k[var4][0] = 1;
                this.k[var4][1] = var3;
                this.k[var4][2] = var1;
                this.k[var4][3] = var2;
                this.k[var4][5] = 0;
                return;
            }
        }

    }

    public final void x() {
        for(int var1 = 0; var1 < this.k.length; ++var1) {
            if(this.k[var1][0] == 1 && this.k[var1][1] == 0) {
                ++this.k[var1][5];
                if(this.k[var1][5] > 60) {
                    this.k[var1][5] = 0;
                    this.k[var1][0] = 0;
                }
            }
        }

    }

    public final void y() {
        for(int var2 = 0; var2 < this.k.length; ++var2) {
            if(this.k[var2][0] == 1 && this.k[var2][1] == 0) {
                b(109, 0, 48 * (this.k[var2][5] / 4 % 2), 48, 48, a[0], this.k[var2][2], this.k[var2][3]);
            }
        }

    }

    private void av() {
        int var1 = 0;
        if(this.ak > 3) {
            this.ak = 3;
        }

        int var2;
        byte var3;
        for(var2 = 0; var2 < this.c[this.ak].length / 7; ++var2) {
            var3 = this.c[this.ak][var2 * 7 + 5];
            if(0 != var3 && 1 != var3 && 63 != var3 && 64 != var3 && 65 != var3 && 66 != var3 && 67 != var3 && 68 != var3 && 69 != var3) {
                ++var1;
            } else {
                ++var1;
                var1 += this.c[this.ak][var2 * 7 + 6];
            }
        }

        this.J = new int[var1];
        this.c = new boolean[var1 + 20];
        this.d = new boolean[var1 + 20];
        var1 = 0;

        for(var2 = 0; var2 < this.c[this.ak].length / 7; ++var2) {
            this.J[var2] = var1;
            var3 = this.c[this.ak][var2 * 7 + 5];
            if(0 != var3 && 1 != var3 && 63 != var3 && 64 != var3 && 65 != var3 && 66 != var3 && 67 != var3 && 68 != var3 && 69 != var3) {
                ++var1;
            } else {
                for(int var4 = 0; var4 < this.c[this.ak][var2 * 7 + 6] + 1; ++var4) {
                    ++var1;
                }
            }
        }

    }

    public final boolean a(int[] var1) {
        return var1[2] - y[0] < this.bM?true:(var1[2] - y[0] > this.bN?true:Math.abs(var1[3] - y[1]) > this.bO);
    }

    public final void z() {
        int var2 = this.c[this.ak].length / 7;

        try {
            int var3;
            int var4;
            if(this.Z) {
                if(this.bK < this.bL) {
                    this.bL = this.bK;
                } else {
                    this.bK = this.bL;
                }

                var3 = this.bL * 7;
                var4 = this.bK * 7;

                while(((this.c[this.ak][var3 + 0] & 255) << 8 | this.c[this.ak][var3 + 1] & 255) - y[0] <= this.bN) {
                    if(Math.abs(((this.c[this.ak][var3 + 2] & 255) << 8 | this.c[this.ak][var3 + 3] & 255) - y[1]) < this.bO && !this.c[this.J[this.bL]]) {
                        this.l(this.bL);
                    }

                    ++this.bL;
                    var3 += 7;
                    if(this.bL >= var2) {
                        this.bL = var2 - 1;
                        break;
                    }
                }

                this.Z = false;

                while(((this.c[this.ak][var4 + 0] & 255) << 8 | this.c[this.ak][var4 + 1] & 255) - y[0] < this.bM) {
                    ++this.bK;
                    var4 += 7;
                    if(this.bK >= var2) {
                        this.bK = var2 - 1;
                        break;
                    }
                }
            }

            if(this.aa) {
                if(this.bK > this.bL) {
                    this.bL = this.bK;
                } else {
                    this.bK = this.bL;
                }

                var3 = this.bL * 7;
                var4 = this.bK * 7;

                while(((this.c[this.ak][var3 + 0] & 255) << 8 | this.c[this.ak][var3 + 1] & 255) - y[0] >= this.bM) {
                    if(Math.abs(((this.c[this.ak][var3 + 2] & 255) << 8 | this.c[this.ak][var3 + 3] & 255) - y[1]) < this.bO && !this.c[this.J[this.bL]]) {
                        this.l(this.bL);
                    }

                    --this.bL;
                    var3 -= 7;
                    if(this.bL < 0) {
                        this.bL = 0;
                        break;
                    }
                }

                this.aa = false;

                while(((this.c[this.ak][var4 + 0] & 255) << 8 | this.c[this.ak][var4 + 1] & 255) - y[0] > this.bN) {
                    --this.bK;
                    var4 -= 7;
                    if(this.bK < 0) {
                        this.bK = 0;
                        break;
                    }
                }
            }

        } catch (Exception var6) {
            this.Z = false;
        }
    }

    private void l(int var1) {
        int var2 = 1;
        int var3 = var1 * 7;
        int var4 = this.c[this.ak][var1 * 7 + 5] & 255;
        int var5;
        if(0 != var4 && 1 != var4 && 63 != var4 && 64 != var4 && 65 != var4 && 66 != var4 && 67 != var4 && 68 != var4 && 69 != var4) {
            if((var4 == 41 || var4 == 86 || var4 == 57 || var4 == 78 || var4 == 40 || var4 == 70 || var4 == 39 || var4 == 49 || var4 == 71 || var4 == 10 || var4 == 35) && (var5 = (this.c[this.ak][var3 + 0] & 255) << 8 | this.c[this.ak][var3 + 1] & 255) - y[0] > -48 && var5 - y[0] < 288) {
                return;
            }
        } else {
            var2 = 1 + this.c[this.ak][var3 + 6];
            var5 = (this.c[this.ak][var3 + 0] & 255) << 8 | this.c[this.ak][var3 + 1] & 255;
            boolean var6 = false;
            if(var2 != 1) {
                label148: {
                    int var10000;
                    label147: {
                        int var10001;
                        byte var10002;
                        label146: {
                            switch(this.c[this.ak][var3 + 5]) {
                            case 0:
                                var10000 = var5;
                                var10001 = var2 - 1;
                                var10002 = 24;
                                break label146;
                            case 1:
                            case 68:
                            case 69:
                            default:
                                break label148;
                            case 63:
                                var10000 = var5 - (var2 - 1) * 16;
                                break label147;
                            case 64:
                                var10000 = var5;
                                var10001 = var2 - 1;
                                var10002 = 16;
                                break label146;
                            case 65:
                                var10000 = var5;
                                break;
                            case 66:
                                var10000 = var5;
                                var10001 = var2 - 1;
                                var10002 = 16;
                                break label146;
                            case 67:
                                var10000 = var5;
                            }

                            var10001 = var2 - 1;
                            var10002 = 32;
                        }

                        var10000 += var10001 * var10002;
                    }

                    var5 = var10000;
                }

                if(var5 - y[0] < this.bM) {
                    return;
                }

                if(var5 - y[0] > this.bN) {
                    return;
                }
            }
        }

        for(var5 = 0; var5 < var2; ++var5) {
            int[] var7 = new int[25];
            if(!this.d[this.J[var1] + var5] && !this.c[this.J[var1] + var5]) {
                var7[0] = 1;
                var7[1] = this.c[this.ak][var3 + 5] & 255;
                var7[2] = (this.c[this.ak][var3 + 0] & 255) << 8 | this.c[this.ak][var3 + 1] & 255;
                var7[3] = (this.c[this.ak][var3 + 2] & 255) << 8 | this.c[this.ak][var3 + 3] & 255;
                var7[8] = (this.c[this.ak][var3 + 0] & 255) << 8 | this.c[this.ak][var3 + 1] & 255;
                var7[9] = (this.c[this.ak][var3 + 2] & 255) << 8 | this.c[this.ak][var3 + 3] & 255;
                if(var2 != 1) {
                    label129: {
                        byte var8;
                        int[] var9;
                        int var10;
                        int var10003;
                        byte var10004;
                        label128: {
                            switch(this.c[this.ak][var3 + 5]) {
                            case 0:
                                var7[2] += var5 * 24;
                                var9 = var7;
                                var8 = 8;
                                var10 = var7[8];
                                var10003 = var5;
                                var10004 = 24;
                                break label128;
                            case 1:
                                var7[3] += var5 * 24;
                                var9 = var7;
                                var8 = 9;
                                var10 = var7[9];
                                var10003 = var5;
                                var10004 = 24;
                                break label128;
                            case 63:
                                var7[2] -= var5 * 16;
                                var7[8] -= var5 * 16;
                                var7[3] += var5 * 16;
                                var9 = var7;
                                var8 = 9;
                                var10 = var7[9];
                                var10003 = var5;
                                var10004 = 16;
                                break label128;
                            case 64:
                                var7[2] += var5 * 16;
                                var7[8] += var5 * 16;
                                var7[3] += var5 * 16;
                                var9 = var7;
                                var8 = 9;
                                var10 = var7[9];
                                var10003 = var5;
                                var10004 = 16;
                                break label128;
                            case 65:
                                var7[2] += var5 * 32;
                                var7[8] += var5 * 32;
                            case 69:
                                var7[3] += var5 * 32;
                                var9 = var7;
                                var8 = 9;
                                break;
                            case 66:
                                var7[2] += var5 * 16;
                                var9 = var7;
                                var8 = 8;
                                var10 = var7[8];
                                var10003 = var5;
                                var10004 = 16;
                                break label128;
                            case 67:
                                var7[2] += var5 * 32;
                                var9 = var7;
                                var8 = 8;
                                break;
                            case 68:
                                var7[3] += var5 * 16;
                                var9 = var7;
                                var8 = 9;
                                var10 = var7[9];
                                var10003 = var5;
                                var10004 = 16;
                                break label128;
                            default:
                                break label129;
                            }

                            var10 = var9[var8];
                            var10003 = var5;
                            var10004 = 32;
                        }

                        var9[var8] = var10 + var10003 * var10004;
                    }
                }

                var7[4] = this.c[this.ak][var3 + 6] & 255;
                var7[19] = this.c[this.ak][var3 + 4] & 255;
                var7[20] = this.J[var1] + var5;
                var7[22] = this.J[var1];
                if(this.m[0] == 0) {
                    if(var7[1] == 41 || var7[1] == 86 || var7[1] == 57 || var7[1] == 78 || var7[1] == 40 || var7[1] == 70 || var7[1] == 39 || var7[1] == 49 || var7[1] == 71) {
                        return;
                    }
                } else if(this.m[0] == 1 && (var7[1] == 40 || var7[1] == 70 || var7[1] == 39 || var7[1] == 49 || var7[1] == 71)) {
                    return;
                }

                this.c[this.J[var1] + var5] = true;
                this.d(var7);
            }
        }

    }

    public final void A() {
        if(!this.G || !this.f[0]) {
            label55: {
                c var10000;
                label63: {
                    if((!this.h[0] || !this.h[3]) && (g && !this.s || !this.h[3])) {
                        if(this.aj != 2 && this.aj != 4) {
                            if(!this.s || !this.a(a() - 8, b() - 24) && !this.a(a() + 8, b() - 24)) {
                                break label55;
                            }

                            var10000 = this;
                            break label63;
                        }

                        if(!this.s || !this.a(a() - 8, b() - 24) || !this.a(a() + 8, b() - 24)) {
                            break label55;
                        }
                    }

                    var10000 = this;
                }

                var10000.v();
            }

            this.h[0] = false;
            this.h[3] = false;
        }
    }

    private void d(int[] var1) {
        int var2;
        if(var1[1] != 9 && var1[1] != 15 && var1[1] != 48 && var1[1] != 11 && var1[1] != 2 && var1[1] != 79 && 0 != var1[1] && 1 != var1[1] && 63 != var1[1] && 64 != var1[1] && 65 != var1[1] && 66 != var1[1] && 67 != var1[1] && 68 != var1[1] && 69 != var1[1]) {
            if(this.e[this.F][24] == 0) {
                this.e[this.F] = var1;
                this.e[this.F][24] = 1;
                ++this.af;

                for(var2 = 0; var2 < this.e.length; ++var2) {
                    if(this.e[var2][24] == 0) {
                        this.F = var2;
                        return;
                    }
                }
            } else {
                for(var2 = 0; var2 < this.e.length; ++var2) {
                    if(this.e[var2][24] == 0) {
                        this.F = var2;
                        break;
                    }
                }

                this.e[this.F] = var1;
                this.e[this.F][24] = 1;
                ++this.af;

                for(var2 = 0; var2 < this.e.length; ++var2) {
                    if(this.e[var2][24] == 0) {
                        this.F = var2;
                        return;
                    }
                }
            }
        } else {
            for(var2 = this.e.length - 1; var2 > 0; --var2) {
                if(this.e[var2][24] == 0) {
                    this.e[var2] = var1;
                    this.e[var2][24] = 1;
                    if(this.F != var2) {
                        ++this.af;
                        return;
                    }

                    ++this.af;

                    for(int var3 = 0; var3 < this.e.length; ++var3) {
                        if(this.e[var2][24] == 0) {
                            this.F = var2;
                            return;
                        }
                    }

                    return;
                }
            }
        }

    }

    public final void b(int var1) {
        this.F = var1;
        this.e[var1][24] = 0;
        --this.G;
    }

    public final int[][] a(int var1, int var2) {
        this.H = 0;
        int var3 = 0;

        for(int var4 = 0; var4 < this.e.length && var3 < this.af; ++var4) {
            if(this.e[var4][24] == 1) {
                ++var3;
                if(this.e[var4][1] == var1 && (var2 < 0 || var2 == this.e[var4][4])) {
                    this.c[this.H] = this.e[var4];
                    this.c[this.H][23] = var4;
                    ++this.H;
                }
            }
        }

        int[][] var5 = new int[this.H][25];
        System.arraycopy(this.c, 0, var5, 0, var5.length);
        return var5;
    }

    private void aw() {
        if(this.bp-- <= 0) {
            if(b() >= 0) {
                boolean var1 = false;
                int var2 = a() >> 8;
                int var3 = b() >> 8;
                byte var4 = this.d[var3 % this.bv][var2];
                if(b[0] >> 8 < var2 && this.aj == 0 && (var4 == 53 || var4 == 54)) {
                    this.d[var3 % this.bv][var2] = 53;
                }

                if(b[0] >> 8 > var2 && this.aj == 0 && (var4 == 53 || var4 == 54)) {
                    this.d[var3 % this.bv][var2] = 54;
                }

                int var5 = this.d[var3 % this.bv][var2] & 1;
                if(this.aj == 0 && (var4 == 53 || var4 == 54)) {
                    var1 = true;
                }

                if(var1) {
                    if(this.d(a(), b())) {
                        int var10001;
                        int var10002;
                        byte[] var6;
                        if(var5 % 2 == 1 && (a() >> 4) % 16 < 9 && (b() >> 4) % 16 < 3) {
                            var6 = this.d[var3 % this.bv];
                            var10001 = var2;
                            var10002 = var6[var2] + 1;
                        } else {
                            if(var5 % 2 != 0 || (a() >> 4) % 16 < 7 || (b() >> 4) % 16 >= 3) {
                                return;
                            }

                            var6 = this.d[var3 % this.bv];
                            var10001 = var2;
                            var10002 = var6[var2] - 1;
                        }

                        var6[var10001] = (byte)var10002;
                        this.bp = 60;
                    }

                }
            }
        }
    }

    public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        a(a, b[var0], var1, var2, var3, var4, var5, var6, var7, 3, true);
    }

    private static int h(int var0) {
        return var0;
    }

    public static int d(int var0) {
        return var0;
    }

    public static void b(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = d(var6 - z[0]);
        int var9 = d(var7 - z[1]);
        a(a, b[var0], var1, var2, var3, var4, var5, var8, var9, 3, true);
    }

    public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = d(var6 - z[0]);
        int var10 = d(var7 - z[1]);
        a(a, b[var0], var1, var2, var3, var4, var5, var9, var10, var8, true);
    }

    public static void a(int var0, int var1, int var2, int var3, int var4) {
        if(b[var0] != null) {
            int var5 = d(var2 - z[0]);
            int var6 = d(var3 - z[1]);
            a(a, b[var0], 0, 0, b[var0].getWidth(), b[var0].getHeight(), var1, var5, var6, var4, true);
        }
    }

    public static void c(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = d(var6 - z[0]);
        int var9 = d(var7 - z[1]);
        a(a, b[var0], var1, var2, var3, var4, var5, var8, var9, 20, true);
    }

    public static void b(int var0, int var1, int var2, int var3, int var4) {
        a(var0, var1, var2, var3, var4, 3);
    }

    public static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
        if(var3 >= 0) {
            if(a[var2].length != 0) {
                var3 %= a[var2].length;
                int var6 = a[var2][var3][0];
                int var7 = a[var2][var3][1];
                int var8 = a[var2][var3][2];
                int var9 = a[var2][var3][3];
                int var10 = 0;
                if(a[var2][var3].length > 4) {
                    var10 = a[var2][var3][4];
                }

                int var11 = d(var0 - z[0]);
                int var12 = d(var1 - z[1]);
                a(a, b[var2], var6, var7, var8, var9, var4, var11, var12 + var10, var5, true);
            }
        }
    }

    public static void a(Graphics var0, Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
        try {
            if(var1 != null) {
                int var10000;
                int var10001;
                if(var10) {
                    var10000 = var8;
                    var10001 = i;
                } else {
                    var10000 = var8;
                    var10001 = f;
                }

                var8 = var10000 + var10001;
                var0.drawRegion(var1, var2, var3, var4, var5, var6, var7, var8, var9);
            }
        } catch (Exception var12) {
            var12.printStackTrace();
        }
    }

    private static void a(Image[] var0) {
        synchronized(var0) {
            int var2 = 0;

            while(true) {
                if(var2 >= var0.length) {
                    break;
                }

                var0[var2] = null;
                ++var2;
            }
        }

        System.gc();
    }

    private static Image a(String var0) {
        try {
            return Image.createImage(var0);
        } catch (Exception var2) {
            return null;
        }
    }

    public final void c(int var1) {
        switch(var1) {
        case 2:
            ++this.A;
            this.a.a(7, 1, false);
            return;
        case 3:
            this.s = 1200;
            this.n = 3072;
            this.o = 24;
            return;
        case 4:
            this.t = 1;
            return;
        case 5:
            this.q = 1200;
            this.a.a(6, -1, false);
            return;
        case 6:
            this.v += 10;
        default:
        }
    }

    public static int a(int var0, int var1, int var2, int var3, int var4, int var5) {
        return a(a(), b() - 12, b[0], b[1] - 12, 12, 12, var0, var1, var2, var3, var4, var5);
    }

    public static int a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        return !j && !l?(var3 + var5 <= var9 - var11 && var1 + var5 >= var7 - var11 && var0 + var4 >= var6 - var10 && var0 - var4 <= var6 + var10?(var0 + var4 > var6 - var10 && var0 - var4 < var6 + var10?0:-1):(var2 + var4 <= var8 - var10 && var0 + var4 >= var6 - var10 && var1 + var5 >= var7 - var11 && var1 - var5 <= var7 + var11?1:(var2 - var4 >= var8 + var10 && var0 - var4 <= var6 + var10 && var1 + var5 >= var7 - var11 && var1 - var5 <= var7 + var11?2:(var3 - var5 >= var9 + var11 && var1 - var5 <= var7 + var11 && var0 + var4 >= var6 - var10 && var0 - var4 <= var6 + var10?3:(var0 + var4 >= var6 - var10 && var0 - var4 <= var6 + var10 && var1 + var5 >= var7 - var11 && var1 - var5 <= var7 + var11?4:-1))))):-1;
    }

    public final void b(int var1, int var2) {
        this.as = var2;
        this.at = var1;
    }

    public final void B() {
        this.h[3] = true;
        if(c[5] < 0) {
            c[5] = 0;
        }

    }

    public static int b(int var0, int var1, int var2, int var3, int var4, int var5) {
        if(!j && !l) {
            int var6 = (540 - p) % 360;
            if(0 > var6) {
                var6 = 0;
            }

            byte var7 = 12;
            if(!i && !k) {
                var7 = 18;
            }

            int var8 = a(var6) * var7 / 100;
            int var9 = -b(var6) * var7 / 100;
            int var10 = a() + var8;
            int var11 = b() + var9;
            int var12 = b[0] + var8;
            int var13 = b[1] + var9;
            return var13 + var7 <= var3 - var5 && var11 + var7 >= var1 - var5 && var10 + 12 >= var0 - var4 && var10 - 12 <= var0 + var4?0:(var12 + 12 <= var2 - var4 && var10 + 12 >= var0 - var4 && var11 + var7 >= var1 - var5 && var11 - var7 <= var1 + var5?1:(var12 - 12 >= var2 + var4 && var10 - 12 <= var0 + var4 && var11 + var7 >= var1 - var5 && var11 - var7 <= var1 + var5?2:(var13 - var7 >= var3 + var5 && var11 - var7 <= var1 + var5 && var10 + 12 >= var0 - var4 && var10 - 12 <= var0 + var4?3:(var10 + 12 >= var0 - var4 && var10 - 12 <= var0 + var4 && var11 + var7 >= var1 - var5 && var11 - var7 <= var1 + var5?4:-1))));
        } else {
            return -1;
        }
    }

    public static int c(int var0, int var1, int var2, int var3, int var4, int var5) {
        if(!j && !l) {
            byte var6 = 12;
            if(!i) {
                var6 = 16;
            }

            int var8 = -var6;
            int var9 = a() + 0;
            int var10 = b() + var8;
            int var11 = b[0] + 0;
            int var12 = b[1] + var8;
            return var12 + var6 <= var3 - var5 && var10 + var6 >= var1 - var5 && var9 + 12 >= var0 - var4 && var9 - 12 <= var0 + var4?0:(var11 + 12 <= var2 - var4 && var9 + 12 >= var0 - var4 && var10 + var6 >= var1 - var5 && var10 - var6 <= var1 + var5?1:(var11 - 12 >= var2 + var4 && var9 - 12 <= var0 + var4 && var10 + var6 >= var1 - var5 && var10 - var6 <= var1 + var5?2:(var12 - var6 >= var3 + var5 && var10 - var6 <= var1 + var5 && var9 + 12 >= var0 - var4 && var9 - 12 <= var0 + var4?3:(var9 + 12 >= var0 - var4 && var9 - 12 <= var0 + var4 && var10 + var6 >= var1 - var5 && var10 - var6 <= var1 + var5?4:-1))));
        } else {
            return -1;
        }
    }

    private void f(boolean var1) {
        if(var1) {
            this.A = 3;
            this.w = 0;
            this.z = 0;
            this.p();
            this.B = 0;
            this.C = 0;
            this.D = 0;
            this.E = 0;
            this.Y = false;
        } else {
            for(int var2 = 0; var2 < C.length; ++var2) {
                if(C[var2] < this.w) {
                    this.ai = 9;
                    this.v = true;
                    return;
                }
            }

            this.d(3);
        }
    }

    public static Vector a(String var0) {
        int var1 = 0;
        Vector var2 = new Vector();

        while(var1 < var0.length()) {
            String var3 = var0.substring(var1);
            int var4 = 0;
            int var5 = 0;

            label33: {
                while(true) {
                    if(b(var3, var4) >= g - 32) {
                        break label33;
                    }

                    var5 = var4;
                    if((var4 = a(var3, var4 + 1)) == -1) {
                        var4 = var3.length();
                        if(var5 == 0) {
                            break label33;
                        }

                        if(b(var3, var4) < g - 32) {
                            break;
                        }
                    } else if(var3.charAt(var4) == 126) {
                        break;
                    }
                }

                var5 = 0;
            }

            if(var5 == 0) {
                var2.addElement(var3.substring(0, var4));
                var1 += var4 + 1;
            } else {
                var2.addElement(var3.substring(0, var5));
                var1 += var5 + 1;
            }
        }

        return var2;
    }

    private static int a(String var0, int var1) {
        while(true) {
            if(var1 < var0.length()) {
                char var2;
                if((var2 = var0.charAt(var1)) != 32 && var2 != 126) {
                    ++var1;
                    continue;
                }

                return var1;
            }

            return -1;
        }
    }

    private static int b(String var0, int var1) {
        return b.substringWidth(var0, 0, var1);
    }

    public final void d(int var1) {
        this.v = true;
        this.ao = 10;
        this.d(false);
        this.a = (byte)var1;
        this.ai = 1;
    }

    public final void C() {
        this.v = true;

        int var10001;
        int var1;
        for(var1 = 0; var1 < 10; ++var1) {
            boolean[] var10000;
            boolean var10002;
            if(this.g[var1]) {
                if(this.a[var1]) {
                    var10000 = this.a;
                    var10001 = var1;
                    var10002 = false;
                } else {
                    var10000 = this.g;
                    var10001 = var1;
                    var10002 = false;
                }
            } else {
                var10000 = this.g;
                var10001 = var1;
                var10002 = this.a[var1];
            }

            var10000[var10001] = var10002;
        }

        if(this.L) {
            this.L = false;
        }

        this.b = (byte)((this.b + 1) % 24);
        c var5;
        byte var8;
        switch(this.a) {
        case 0:
            ++this.bP;
            if(this.bP > 150) {
                this.bP = 0;
                this.a = 11;
                this.q = true;
            }
            break;
        case 1:
            ++this.bP;
            if(this.bP > 150) {
                this.bP = 0;
                this.d(false);
            }
            break;
        case 2:
            if(this.a[4]) {
                ++this.m[2];
                if(this.m[2] >= 5) {
                    this.m[2] = 0;
                }

                this.aA();
            } else if(this.a[3]) {
                --this.m[2];
                if(this.m[2] < 0) {
                    this.m[2] = 4;
                }

                this.aA();
            } else if(this.a[0]) {
                this.h();
                this.d(false);
                this.o(0);
            }
            break;
        case 3:
            if(this.I) {
                if(this.d < 12) {
                    ++this.bP;
                    if(this.bP > 10) {
                        ++this.d;
                    }
                } else {
                    this.bP = (byte)((this.bP + 1) % 10);
                }
            }

            if(this.d >= 12) {
                for(var1 = 0; var1 < this.a.length; ++var1) {
                    if(this.a[var1]) {
                        this.a = 4;
                        this.g();
                        this.e = 0;
                        this.n(11 + this.e);
                        this.o(2);
                    }
                }
            }

            if(this.a[6]) {
                this.a = 14;
                this.e = 1;
            }
            break;
        case 4:
            if(this.I) {
                this.bP = (byte)((this.bP + 1) % 5);
            }

            if(this.a[4]) {
                ++this.e;
                if(this.G && this.e == 9 || !this.G && this.e == 8) {
                    this.e = 0;
                }

                this.n(11 + this.e);
            }

            if(this.a[3]) {
                --this.e;
                if(this.e < 0) {
                    if(this.G) {
                        var5 = this;
                        var8 = 8;
                    } else {
                        var5 = this;
                        var8 = 7;
                    }

                    var5.e = var8;
                }

                this.n(11 + this.e);
            }

            if(this.a[0]) {
                label604: {
                    if(this.e == 0) {
                        this.ad();
                        if(this.g == 0 && this.h == 9) {
                            this.e();
                            this.q = true;
                            this.A = 3;
                            if(this.G) {
                                var5 = this;
                                var10001 = this.ay;
                            } else {
                                var5 = this;
                                var10001 = 0;
                            }

                            var5.l = var10001;
                            this.w = 0;
                            if(this.az <= 0) {
                                this.g = 0;
                                this.am = 0;
                            }

                            this.al = 0;
                            this.aj = f[this.al][this.am];
                            this.ak = g[this.al][this.am];
                            this.r = true;
                            this.p();
                            return;
                        }

                        this.o(1);
                        this.e = 1;
                        this.n(50 + this.e);
                        this.a = 9;
                        return;
                    }

                    if(this.e == 1) {
                        this.e = 1;
                        this.e();
                        this.al = 0;
                        this.am = 0;
                        this.aj = f[this.al][this.am];
                        this.ak = g[this.al][this.am];
                        this.q = true;
                        this.ai = 3;
                        this.v = true;
                        this.ao = 10;
                        a(c);
                        return;
                    }

                    if(this.e == 2) {
                        this.e = 0;
                        this.f = 0;
                        this.a = 10;
                        b[36] = a("../Art/Checkpoint.png");
                        b[42] = a("../Art/Monitors.png");
                        this.a = new Vector();
                        this.L = true;
                        this.N = false;
                        b = Font.getFont(64, 0, 0);
                    } else {
                        if(this.e == 3) {
                            this.a = 5;
                            this.o(1);
                            this.f = 0;
                            break label604;
                        }

                        if(this.e == 4) {
                            this.e = 0;
                            this.a = 8;
                            this.n(52 + this.e);
                            this.o(1);
                            this.L = true;
                            break label604;
                        }

                        if(this.e == 5) {
                            this.e = 0;
                            this.f = 0;
                            this.N = false;
                            this.a = 12;
                        } else {
                            if(this.e == 6) {
                                this.e = 0;
                                this.a = 16;
                                this.n(52 + this.e);
                                this.o(1);
                                this.L = true;
                                break label604;
                            }

                            if(this.e == 7) {
                                this.e = 0;
                                this.a = 17;
                                this.b = "";
                                this.n(52 + this.e);
                                this.o(4);
                                this.L = true;
                                break label604;
                            }

                            if(this.e != 8) {
                                break label604;
                            }

                            this.e = 0;
                            this.a = 13;
                            this.ay = this.l;
                        }

                        this.L = true;
                    }

                    this.o(1);
                }
            }

            if(this.a[6]) {
                this.o(0);
                this.a = 3;
                this.a.a(9, 1, false);
                return;
            }

            this.ay();
            break;
        case 5:
            if(this.a[6]) {
                this.e = 3;
                this.a = 4;
                this.o(2);
                this.n(11 + this.e);
            } else if(this.a[9]) {
                this.e = 1;
                this.a = 6;
            }

            if(this.a[2] && this.f > 0) {
                --this.f;
                this.L = true;
            }

            if(this.a[1] && this.N) {
                ++this.f;
                this.L = true;
            }
            break;
        case 6:
            if(this.a[6]) {
                this.a = 5;
            } else if(!this.a[2] && !this.a[1]) {
                if(this.a[0]) {
                    this.a = 5;
                    if(this.e == 0) {
                        C = new int[5];
                        D = new int[5];
                        d = new String[]{"   ", "   ", "   ", "   ", "   "};
                        this.ae();
                        this.a = 7;
                    }
                }
            } else {
                this.e = (byte)((this.e + 1) % 2);
            }
            break;
        case 7:
            if(this.a[6] || this.a[0]) {
                this.a = 5;
            }
            break;
        case 8:
            if(!this.a[6] && !this.a[0]) {
                label535: {
                    label534: {
                        if(this.a[2]) {
                            --this.e;
                            if(this.e < 0) {
                                this.e = 2;
                            }

                            this.n(52 + this.e);
                        } else if(this.a[1]) {
                            this.e = (byte)((this.e + 1) % 3);
                            this.n(52 + this.e);
                        } else {
                            if(this.a[4]) {
                                if(this.e == 0) {
                                    this.m[0] = (byte)((this.m[0] + 1) % 3);
                                } else if(this.e == 1) {
                                    this.m[1] = (byte)((this.m[1] + 1) % 2);
                                    this.a.a(this.m[1]);
                                }

                                if(this.e == 2) {
                                    this.m[2] = (byte)((this.m[2] + 1) % 5);
                                    this.aA();
                                    this.n(52 + this.e);
                                    this.a[1] = this.b[59];
                                }

                                var5 = this;
                                break label534;
                            }

                            if(!this.a[3]) {
                                break label535;
                            }

                            label527: {
                                --this.m[this.e];
                                d var7;
                                if(this.m[this.e] < 0) {
                                    if(this.e == 0) {
                                        this.m[0] = 2;
                                        break label527;
                                    }

                                    if(this.e != 1) {
                                        this.m[2] = 4;
                                        break label527;
                                    }

                                    this.m[1] = 1;
                                    var7 = this.a;
                                    var8 = 1;
                                } else {
                                    if(this.e != 1) {
                                        break label527;
                                    }

                                    var7 = this.a;
                                    var8 = 0;
                                }

                                var7.a(var8);
                            }

                            if(this.e == 2) {
                                this.aA();
                                this.n(52 + this.e);
                                this.a[1] = this.b[59];
                            }
                        }

                        var5 = this;
                    }

                    var5.L = true;
                }
            } else {
                this.a = 4;
                this.o(2);
                this.e = 4;
                this.n(11 + this.e);
                this.h();
            }

            this.ay();
            break;
        case 9:
            if(this.a[6]) {
                this.a = 4;
                this.e = 0;
                this.n(11 + this.e);
                this.o(2);
            } else if(!this.a[2] && !this.a[1]) {
                if(this.a[0]) {
                    label650: {
                        if(this.e == 0) {
                            this.e();
                            this.q = true;
                            a(c);
                            this.A = 3;
                            if(this.G) {
                                var5 = this;
                                var10001 = this.ay;
                            } else {
                                var5 = this;
                                var10001 = 0;
                            }

                            var5.l = var10001;
                            this.w = 0;
                            this.g = 0;
                            this.al = 0;
                            var5 = this;
                            var10001 = 0;
                        } else {
                            if(this.e != 1) {
                                break label650;
                            }

                            this.e();
                            this.q = true;
                            a(c);
                            this.A = this.i;
                            this.w = this.bx;
                            this.al = this.g / 3;
                            var5 = this;
                            var10001 = this.g % 3;
                        }

                        var5.am = var10001;
                        this.aj = f[this.al][this.am];
                        this.ak = g[this.al][this.am];
                        this.r = true;
                        this.p();
                    }
                }
            } else {
                this.e = (byte)((this.e + 1) % 2);
                this.n(50 + this.e);
            }

            this.ay();
            break;
        case 10:
            if(this.a[4] && this.e < 25) {
                ++this.e;
                if(this.e == 23 || this.e == 24) {
                    this.e = 25;
                }

                this.f = 0;
                this.L = true;
            }

            if(this.a[3] && this.e > 0) {
                --this.e;
                if(this.e == 23 || this.e == 24) {
                    this.e = 22;
                }

                this.f = 0;
                this.L = true;
            }

            if(this.a[2] && this.f > 0) {
                --this.f;
                this.L = true;
            }

            if(this.a[1] && this.N) {
                ++this.f;
                this.L = true;
            }

            if(this.a[6]) {
                this.e = 2;
                this.a = 4;
                b[36] = null;
                b[42] = null;
                this.o(2);
            }

            this.a = a(this.f[1 + this.e * 2]);
            break;
        case 11:
            ++this.bP;
            if(this.bP > 150) {
                this.bP = 0;
                this.a = 1;
                this.q = true;
            }
            break;
        case 12:
            if(this.a[4] && this.e < 5) {
                this.f = 0;
                ++this.e;
                this.L = true;
            }

            if(this.a[3] && this.e > 0) {
                this.f = 0;
                --this.e;
                this.L = true;
            }

            if(this.a[2] && this.f > 0) {
                --this.f;
                this.L = true;
            }

            if(this.a[1] && this.N) {
                ++this.f;
                this.L = true;
            }

            if(this.a[6]) {
                this.e = 5;
                this.a = 4;
                this.o(2);
            }
            break;
        case 13:
            if(!this.a[6] && !this.a[0]) {
                if(this.a[2]) {
                    --this.e;
                    if(this.e < 0) {
                        this.e = 6;
                    }

                    this.L = true;
                } else if(this.a[1]) {
                    this.e = (byte)((this.e + 1) % 7);
                    this.L = true;
                } else if(this.a[4]) {
                    if(this.e == 0) {
                        this.f[0] = !this.f[0];
                    } else if(this.e == 1) {
                        this.f[2] = !this.f[2];
                    } else if(this.e == 2) {
                        ++this.ay;
                        if(this.ay > 6) {
                            this.ay = 0;
                        }

                        this.l = this.ay;
                    } else if(this.e == 3) {
                        this.f[1] = !this.f[1];
                    } else if(this.e == 4) {
                        this.f[3] = !this.f[3];
                    } else if(this.e == 5) {
                        this.f[4] = !this.f[4];
                    } else if(this.e == 6) {
                        this.ai = 8;
                        this.aL = 0;
                        this.g();
                    }

                    this.L = true;
                } else if(this.a[3]) {
                    if(this.e == 0) {
                        this.f[0] = !this.f[0];
                    } else if(this.e == 1) {
                        this.f[2] = !this.f[2];
                    } else if(this.e == 2) {
                        --this.ay;
                        if(this.ay < 0) {
                            this.ay = 6;
                        }

                        this.l = this.ay;
                    } else if(this.e == 3) {
                        this.f[1] = !this.f[1];
                    } else if(this.e == 4) {
                        this.f[3] = !this.f[3];
                    } else if(this.e == 5) {
                        this.f[4] = !this.f[4];
                    } else if(this.e == 6) {
                        this.ai = 8;
                        this.aL = 0;
                        this.g();
                    }

                    this.L = true;
                }
            } else {
                this.a = 4;
                this.o(2);
                this.e = 8;
                this.n(11 + this.e);
            }
            break;
        case 14:
            this.v = true;
            this.e = (byte)(this.e % 2);
            if(!this.a[2] && !this.a[1]) {
                if(this.a[0]) {
                    if(this.e == 0) {
                        this.a.notifyDestroyed();
                    } else {
                        this.a = 3;
                        this.a.a(9, 1, false);
                    }
                } else if(this.a[6]) {
                    this.a = 3;
                    this.a.a(9, 1, false);
                }
            } else {
                this.e = (byte)((this.e + 1) % 2);
            }
        case 15:
        default:
            break;
        case 16:
            if(this.a[6] || this.a[0]) {
                this.a = 4;
                this.o(2);
                this.e = 6;
                this.n(11 + this.e);
            }
            break;
        case 17:
            if(!this.a[6] && !this.a[0]) {
                if(this.a[5]) {
                    StringBuffer var3 = new StringBuffer(8);

                    for(int var2 = 0; var2 < 8; ++var2) {
                        var3.append(a[this.M[var2]]);
                    }

                    if(this.a(var3.toString())) {
                        this.b = this.b[89];
                    } else {
                        this.b = this.b[88];
                    }
                } else if(this.a[3]) {
                    --this.bS;
                    if(this.bS < 0) {
                        this.bS = 7;
                    }
                } else if(this.a[4]) {
                    ++this.bS;
                    if(this.bS > 7) {
                        this.bS = 0;
                    }
                } else {
                    int[] var4;
                    int var6;
                    if(this.a[2]) {
                        ++this.M[this.bS];
                        if(this.M[this.bS] <= a.length - 7) {
                            break;
                        }

                        var4 = this.M;
                        var10001 = this.bS;
                        var6 = 0;
                    } else {
                        if(!this.a[1]) {
                            break;
                        }

                        --this.M[this.bS];
                        if(this.M[this.bS] >= 0) {
                            break;
                        }

                        var4 = this.M;
                        var10001 = this.bS;
                        var6 = a.length - 7;
                    }

                    var4[var10001] = var6;
                }
            } else {
                this.a = 4;
                this.o(2);
                this.e = 7;
                this.n(11 + this.e);
            }
            break;
        case 18:
            if(this.I) {
                this.d(false);
                this.a = (byte)this.aG;
            }
        }

        this.a[5] = false;
        this.a[6] = false;
    }

    public final void D() {
        int var1;
        int var2;
        int var4;
        int var5;
        int var6;
        int var7;
        int var13;
        int var18;
        switch(this.a) {
        case 0:
            a.setColor(16777215);
            a.fillRect(0, 0, d, b);
            a.drawImage(c[0], d >> 1, f + (e >> 1), 3);
            if(this.bP < 30) {
                var6 = d * this.bP / 30;
                a.fillRect(var6 - d - 10, i, d, h);
                a.fillRect(var6 + 10, i, d, h);
                var7 = var6 - 11;
                a.drawLine(var7 + 2, 0, var7 + 2, b);
                a.drawLine(var7 + 3, 0, var7 + 3, b);
                a.drawLine(var7 + 5, 0, var7 + 5, b);
                a.drawLine(var7 + 8, 0, var7 + 8, b);
                var7 = var6 + 10;
                a.drawLine(var7 - 2, 0, var7 - 2, b);
                a.drawLine(var7 - 3, 0, var7 - 3, b);
                a.drawLine(var7 - 5, 0, var7 - 5, b);
                a.drawLine(var7 - 8, 0, var7 - 8, b);
                return;
            }
            break;
        case 1:
            a.setColor(0);
            a.fillRect(0, 0, d, b);
            a.drawImage(c[1], d >> 1, f + (e >> 1), 3);
            return;
        case 2:
            a.setColor(0);
            a.fillRect(0, f, d, e);
            this.F();
            a.setColor(16777215);
            String var22 = this.b[this.a[2][this.m[2]]];
            var2 = a.stringWidth(var22);
            var1 = f + (e >> 1);
            a.drawString(var22, d >> 1, var1, 65);
            a.drawImage(c[1], (d >> 1) + (var2 >> 1) + 5, var1, 36);
            a.drawImage(c[2], (d >> 1) - (var2 >> 1) - 5, var1, 40);
            return;
        case 3:
            this.a(true, false);
            this.ax();
            this.F();
            var1 = i + h;
            if(this.d >= 12) {
                this.a(this.b[0], d >> 1, var1, 16777215, 0);
                return;
            }
            break;
        case 4:
            this.a(true, false);
            this.ax();
            this.F();
            var1 = i + h;
            if(this.az > 0) {
                this.b[2] = this.b[70];
            }

            this.a(this.b[2 + this.e], d >> 1, var1, 16777215, 16386570);
            a.drawImage(c[1], d - 5, var1 + (a >> 1), 6);
            a.drawImage(c[2], 2, var1 + (a >> 1), 6);
            this.a(this.a, true);
            return;
        case 5:
            var7 = a.getFont().getHeight();
            this.a(true, true);
            this.F();
            a.setColor(16777215);
            boolean var21 = false;
            this.N = false;

            for(int var8 = this.f; var8 < 5; ++var8) {
                if(f + 42 + var7 * (var8 - this.f) + a < i + h) {
                    a.drawString("" + (var8 + 1) + " " + d[var8] + " " + C[var8], 6, f + 42 + var7 * (var8 - this.f), 20);
                    a.drawString(this.b[31 + D[var8]], d - 6, f + 42 + var7 * (var8 - this.f), 24);
                } else {
                    this.N = true;
                }
            }

            if(this.f > 0) {
                a(a, c[1], 0, 0, c[1].getWidth(), c[1].getHeight(), a[3], d >> 1, 0, 17, true);
            }

            if(this.N) {
                a(a, c[1], 0, 0, c[1].getWidth(), c[1].getHeight(), a[1], d >> 1, h - c[1].getHeight(), 17, true);
            }

            var1 = i + h;
            this.a(this.b[5], false);
            this.a(this.b[20], d >> 1, var1, 16777215, 0);
            return;
        case 6:
            this.a(true, true);
            this.F();
            a.setColor(16777215);
            this.a(this.b[21], false);
            this.a(this.b[24], 2, 0, this.e == 0);
            this.a(this.b[25], 2, 1, this.e == 1);
            return;
        case 7:
            this.a(true, true);
            this.F();
            a.setColor(16777215);
            a.drawString(this.b[26], d >> 1, f + (e >> 1) - 25, 17);
            a.drawString(this.b[27], d >> 1, f + (e >> 1) + 2, 17);
            return;
        case 8:
            this.a(true, true);
            a.setColor(16777215);
            int[] var9 = new int[3];
            int var10 = c[1].getWidth();
            c[2].getWidth();
            int var12 = c - var10;
            if(this.m[1] > 1) {
                this.m[1] = 1;
            }

            for(var13 = 0; var13 < this.a.length; ++var13) {
                var9[var13] = a.getFont().stringWidth(this.b[this.a[var13][this.m[var13]]]);
                a.drawString(this.b[28 + var13], 11, i + 4 + var13 * 22, 20);
                a.drawString(this.b[this.a[var13][this.m[var13]]], var12, i + 4 + var13 * 22, 24);
            }

            a.drawImage(c[1], var12 + var10, i + this.e * 22 + (a >> 1), 10);
            a.getFont().stringWidth(this.b[this.a[this.e][this.m[this.e]]]);
            a.drawImage(c[2], var12 - var9[this.e], i + this.e * 22 + (a >> 1), 10);
            this.F();
            this.az();
            this.a(this.b[6], false);
            return;
        case 9:
            this.a(true, true);
            this.F();
            a.setColor(16777215);
            this.a(this.b[47], 2, 0, this.e == 0);
            this.a(this.b[48], 2, 1, this.e == 1);
            a.stringWidth(this.b[47 + this.e]);
            this.az();
            return;
        case 10:
            int var15;
            label198: {
                a.setFont(b);
                var15 = a.getFont().getHeight();
                this.a(true, true);
                this.F();
                int[] var16 = new int[]{5, 0, 3, 2, 1, 4};
                int var10003;
                byte var10004;
                byte var10005;
                int var10006;
                int var10007;
                Graphics var24;
                byte var10008;
                Image var25;
                byte var26;
                if(this.e == 25) {
                    var24 = a;
                    var25 = b[36];
                    var26 = 0;
                    var10003 = 16;
                    var10004 = 16;
                    var10005 = 64;
                    var10006 = a[0];
                    var10007 = d;
                    var10008 = 1;
                } else {
                    if(this.e <= 10 || this.e >= 17) {
                        break label198;
                    }

                    boolean var17 = false;
                    var24 = a;
                    var25 = b[42];
                    var26 = 0;
                    var10003 = var16[this.e - 11] * 16 * 2;
                    var10004 = 32;
                    var10005 = 32;
                    var10006 = a[0];
                    var10007 = d;
                    var10008 = 4;
                }

                a(var24, var25, var26, var10003, var10004, var10005, var10006, var10007 - var10008, h - 2, 40, true);
            }

            int var23 = f + 42;
            var4 = h + i - var15;
            var5 = this.f;
            a.setColor(16777215);

            while(var23 < var4 && var5 < this.a.size()) {
                a.drawString((String)this.a.elementAt(var5), d >> 1, var23, 17);
                var23 += var15;
                ++var5;
            }

            if(var5 < this.a.size()) {
                this.N = true;
                var18 = h;
                a(a, c[1], 0, 0, c[1].getWidth(), c[1].getHeight(), a[1], d >> 1, var18, 33, true);
            } else {
                this.N = false;
            }

            if(this.f > 0) {
                a(a, c[1], 0, 0, c[1].getWidth(), c[1].getHeight(), a[3], d >> 1, 0, 17, true);
            }

            this.a(this.f[this.e * 2], false);
            this.m(24);
            return;
        case 11:
            a.setColor(16777215);
            a.fillRect(0, 0, c, b);
            a.drawImage(c[2], 0, 0, 20);
            if(this.bP >= 120) {
                a.setColor(0);
                var6 = (this.bP - 120) * (d >> 1) / 30;

                for(var7 = 0; var7 < var6 << 1; var7 += 2) {
                    a.drawLine(var7, 0, var7, b);
                    a.drawLine(d - 1 - var7, 0, d - 1 - var7, b);
                }
            }
            break;
        case 12:
            label182: {
                var13 = a + 2;
                this.a(true, true);
                this.F();
                String[] var10000;
                byte var10001;
                String var10002;
                switch(this.m[2]) {
                case 0:
                case 1:
                case 2:
                    var10000 = this.f;
                    var10001 = 55;
                    var10002 = "Version 1.0.46";
                    break;
                case 3:
                    var10000 = this.f;
                    var10001 = 55;
                    var10002 = "Versión 1.0.46";
                    break;
                case 4:
                    var10000 = this.f;
                    var10001 = 55;
                    var10002 = "Versione 1.0.46";
                    break;
                default:
                    break label182;
                }

                var10000[var10001] = var10002;
            }

            var1 = i + 5;
            var4 = h + i - var13;
            var5 = this.f;
            int var14;
            if((var14 = this.e * 7 + 52) + 6 >= this.f.length) {
                this.e = 1;
            }

            if(this.e >= 0) {
                a.setColor(16777215);

                while(var1 < var4 && var5 < 5) {
                    if(this.f[1 + var14 + var5] != null) {
                        a.drawString(this.f[1 + var14 + var5], d >> 1, var1, 17);
                    }

                    var1 += var13;
                    ++var5;
                }
            }

            if(var5 < 5) {
                this.N = true;
                a(a, c[1], 0, 0, c[1].getWidth(), c[1].getHeight(), a[1], d >> 1, h, 33, true);
            } else {
                this.N = false;
            }

            if(this.f > 0) {
                a(a, c[1], 0, 0, c[1].getWidth(), c[1].getHeight(), a[3], d >> 1, 0, 17, true);
            }

            this.a(this.f[var14], false);
            this.m(6);
            return;
        case 13:
            this.a(true, true);
            a.setColor(16777215);
            var18 = (h - 4) / 22;
            int var19 = 0;
            if(var18 < 7 && this.e + 2 > var18) {
                var19 = this.e - var18 + 1;
            }

            int var20 = i + 4 + (0 - var19) * 22;
            a.drawString(this.b[81], 11, var20, 20);
            a.drawString(this.b[this.f[0]?34:35], d - 10, var20, 24);
            var20 += 22;
            a.drawString(this.b[83], 11, var20, 20);
            a.drawString(this.b[this.f[2]?34:35], d - 10, var20, 24);
            var20 += 22;
            a.drawString(this.b[84], 11, var20, 20);
            a.drawString(String.valueOf(this.ay), d - 10, var20, 24);
            var20 += 22;
            a.drawString(this.b[82], 11, var20, 20);
            a.drawString(this.b[this.f[1]?34:35], d - 10, var20, 24);
            var20 += 22;
            a.drawString("COORDS", 11, var20, 20);
            a.drawString(this.b[this.f[3]?34:35], d - 10, var20, 24);
            var20 += 22;
            a.drawString("CAMERA", 11, var20, 20);
            a.drawString(this.b[this.f[4]?34:35], d - 10, var20, 24);
            var20 += 22;
            a.drawString("PLAY ENDING", 11, var20, 20);
            a.drawImage(c[1], d - 8, i + (this.e - var19) * 22 + 8, 20);
            var2 = a.stringWidth(this.b[35]);
            a.drawImage(c[2], d - var2 - 12, i + (this.e - var19) * 22 + 8, 24);
            this.F();
            this.a("CHEATS", false);
            return;
        case 14:
            this.a(true, true);
            this.F();
            this.a(this.b[85], false);
            this.a(this.b[24], 2, 0, this.e == 0);
            this.a(this.b[25], 2, 1, this.e == 1);
            return;
        case 15:
        default:
            break;
        case 16:
            this.Z();
            return;
        case 17:
            this.aa();
            break;
        case 18:
            return;
        }

    }

    public final void a(String var1, int var2, int var3, boolean var4) {
        Font var5;
        int var6 = (var5 = a.getFont()).stringWidth(var1);
        int var7;
        int var8 = (var7 = var5.getHeight()) + 2;
        int var9 = var2 * var8;
        int var10 = b - var9 >> 1;
        int var11 = var3 * var8 + var10;
        this.a(var1, c >> 1, var11, 16777215, 0);
        Image var12 = null;
        if(c != null) {
            var12 = c[4];
        }

        if(var12 == null) {
            var12 = b[0];
        }

        if(var4) {
            int var13 = var12.getWidth() >> 1;
            int var14 = var12.getHeight() >> 2;
            int var15 = (this.b >> 3) * var14;
            a(a, var12, 0, var15, var13, var14, a[0], (c >> 1) - (var6 >> 1) - 15, var11 - f + (var7 >> 1), 3, false);
            a(a, var12, 0, var15, var13, var14, a[0], (c >> 1) + (var6 >> 1) + 15, var11 - f + (var7 >> 1), 3, false);
        }

    }

    private void m(int var1) {
        int var3;
        int var4 = (var3 = i + h) + 1;
        int var6;
        int var7 = (var6 = d - 30) / var1;
        a.setColor(2257915);
        a.fillRect(15, var3, var6, 7);
        a.setColor(410260);
        a.drawRect(14, var3, var6 + 1, 7);
        a.setColor(8506866);
        Graphics var10000;
        byte var10001;
        int var10002;
        if(this.e > 22) {
            int var8 = this.e - 2;
            var10000 = a;
            var10001 = 15;
            var10002 = var8;
        } else {
            var10000 = a;
            var10001 = 15;
            var10002 = this.e;
        }

        var10000.fillRect(var10001 + var10002 * var6 / var1, var4, var7, 5);
        a.drawImage(c[1], 15 + var6 + 5, var3, 20);
        a.drawImage(c[2], 7, var3, 20);
    }

    private void ax() {
        int var4;
        int var5;
        Graphics var10000;
        Image var10001;
        int var10002;
        int var10003;
        int var10004;
        int var10007;
        int var10008;
        byte var10009;
        label18: {
            a(a, c[0], l[0][0], l[0][1], l[0][2], l[0][3], a[0], d >> 1, (e >> 1) - 0, 3, false);
            int var1 = (10 - this.bP) * 3;
            int[][] var10005;
            byte var10006;
            switch(this.d >> 1) {
            case 0:
                var10000 = a;
                var10001 = c[0];
                var10002 = l[1][0];
                var10003 = l[1][1];
                var10004 = l[1][2];
                var4 = l[1][3];
                var5 = a[0];
                var10007 = (d >> 1) + 5;
                var10008 = (e >> 1) + var1 - 0;
                var10009 = 33;
                break label18;
            case 1:
                a(a, c[0], l[2][0], l[2][1], l[2][2], l[2][3], a[0], (d >> 1) + 5, (e >> 1) - 0, 33, false);
                var10000 = a;
                var10001 = c[0];
                var10002 = l[3][0];
                var10003 = l[3][1];
                var10004 = l[3][2];
                var4 = l[3][3];
                var5 = a[0];
                var10007 = (d >> 1) + 5;
                var10008 = (e >> 1) - 0;
                var10009 = 33;
                break label18;
            case 2:
                var10000 = a;
                var10001 = c[0];
                var10002 = l[4][0];
                var10003 = l[4][1];
                var10004 = l[4][2];
                var4 = l[4][3];
                var5 = a[0];
                var10007 = (d >> 1) + 5;
                var10008 = (e >> 1) - 0;
                var10009 = 33;
                break label18;
            case 3:
                var10000 = a;
                var10001 = c[0];
                var10002 = l[5][0];
                var10003 = l[5][1];
                var10004 = l[5][2];
                var4 = l[5][3];
                var5 = a[0];
                var10007 = (d >> 1) + 5;
                var10008 = (e >> 1) - 0;
                var10009 = 33;
                break label18;
            case 4:
                a(a, c[0], l[6][0], l[6][1], l[6][2], l[6][3], a[0], (d >> 1) + 5, (e >> 1) - 0, 40, false);
                var10000 = a;
                var10001 = c[0];
                var10002 = l[7][0];
                var10003 = l[7][1];
                var10004 = l[7][2];
                var10005 = l;
                var10006 = 7;
                break;
            default:
                a(a, c[0], l[8][0], l[8][1], l[8][2], l[8][3], a[0], (d >> 1) + 5, (e >> 1) - 0, 40, false);
                a(a, c[0], l[9][0], l[9][1], l[9][2], l[9][3], a[0], (d >> 1) + 5 - 30, (e >> 1) - 0 - 22, 36, false);
                if((this.bP >> 1 & 1) == 0) {
                    var10000 = a;
                    var10001 = c[0];
                    var10002 = l[10][0];
                    var10003 = l[10][1];
                    var10004 = l[10][2];
                    var10005 = l;
                    var10006 = 10;
                } else {
                    var10000 = a;
                    var10001 = c[0];
                    var10002 = l[11][0];
                    var10003 = l[11][1];
                    var10004 = l[11][2];
                    var10005 = l;
                    var10006 = 11;
                }
            }

            var4 = var10005[var10006][3];
            var5 = a[0];
            var10007 = (d >> 1) + 5;
            var10008 = (e >> 1) - 0;
            var10009 = 36;
        }

        a(var10000, var10001, var10002, var10003, var10004, var4, var5, var10007, var10008, var10009, false);
        a(a, c[0], l[12][0], l[12][1], l[12][2], l[12][3], a[0], d >> 1, (e >> 1) - 1 - 0, 17, false);
    }

    public static void b(int var0, int var1, int var2, int var3) {
        if((b & 1) == 1 && var1 != 0) {
            ++var3;
        }

        a.setClip(var0, var1, var2, var3);
        int var4 = a.getColor();
        boolean var5 = false;

        for(int var6 = 0; var6 < var3; ++var6) {
            int var7;
            int var8 = (var7 = var6 + var1) == 0?8506866:(var7 % 3 == 0?1858252:2257915);
            a.setColor(var8);
            a.drawLine(var0, var7, var0 + var2, var7);
        }

        if(var0 == 0) {
            a.setColor(2257915);
            a.drawRect(var0, var1, 1, var3);
        }

        a.setColor(var4);
        a.setClip(0, 0, c, b);
    }

    public static void E() {
        if(a[8] != null) {
            a.drawImage(a[8], d - 2, f + e - 5, 40);
        }

    }

    public static void a(String var0, int var1, int var2, int var3, int var4, int var5) {
        a.setColor(var4);
        a.drawString(var0, var1 - 1, var2, var5);
        a.drawString(var0, var1 + 1, var2, var5);
        a.drawString(var0, var1, var2 + 1, var5);
        a.drawString(var0, var1, var2 - 1, var5);
        a.setColor(var3);
        a.drawString(var0, var1, var2, var5);
    }

    public final void a(String var1, int var2, int var3, int var4, int var5) {
        a(var1, var2, var3, var4, var5, 17);
    }

    public final void F() {
        b(0, 0, d, i);
        b(0, i + h, d, i);
    }

    private void n(int var1) {
        this.a = this.b[var1];
        this.bb = 0;
    }

    private void ay() {
        int var1 = a.stringWidth(this.a) + 218;
        this.bb = (this.bb + 1) % var1;
    }

    public final void a(String var1, boolean var2) {
        int var3;
        if((var3 = (i >> 1) - (a >> 1)) < 2) {
            var3 = 2;
        }

        String var10000;
        int var10001;
        int var10002;
        int var10003;
        byte var10004;
        byte var10005;
        if(!var2) {
            var10000 = var1;
            var10001 = d >> 1;
            var10002 = var3;
            var10003 = 16777215;
            var10004 = 0;
            var10005 = 17;
        } else {
            var10000 = var1;
            var10001 = d - this.bb;
            var10002 = var3;
            var10003 = 16777215;
            var10004 = 0;
            var10005 = 20;
        }

        a(var10000, var10001, var10002, var10003, var10004, var10005);
    }

    private void az() {
        int var1 = i + h + 2;
        a(this.a, d - this.bb, var1, 16777215, 0, 20);
    }

    private void a(boolean var1, boolean var2) {
        a.a(a, this.j * 5, 120, var1);
        if(var2) {
            a.setColor(0);

            for(int var3 = 0; var3 < h; var3 += 2) {
                a.drawLine(0, i + var3, d, i + var3);
            }
        }

        ++this.j;
    }

    public final void d(boolean var1) {
        label27: {
            a(b);
            this.o(3);
            d var10000;
            byte var10001;
            if(var1) {
                c[0] = a("../Art/SEGA Logo.png");  // SEGA logo
                c[1] = a("../Art/Sonic Team Presents.png");    // Sonic Team presents text
                c[2] = a("../Art/iFone Splash.png");   // iFone splash screen
                this.a = 0;
                var10000 = this.a;
                var10001 = 20;
            } else {
                a(c);
                a.a(0, 0);
                c[0] = a("../Art/Title Screen.png");   // Title screen assets (Including emblem, Sonic, text, and sprite mask)
                c[1] = a("../Art/Menu Right Arrow.png");   // Small right arrow for menuing
                c[2] = a("../Art/Menu Left Arrow.png");    // Small left arrow for menuing
                c[4] = a("../Art/Ring.png");   // Rings used for other menus
                if(this.M) {
                    this.M = false;
                    this.a = 2;
                    return;
                }

                aB();
                this.a = 3;
                this.o(0);
                if(this.ai == 3) {
                    break label27;
                }

                var10000 = this.a;
                var10001 = 9;
            }

            var10000.a(var10001, 1, false);
        }

        this.bP = 0;

        for(int var2 = 0; var2 < 10; ++var2) {
            this.g[var2] = false;
        }

        this.b = 0;
        this.g();
    }

    private void aA() {
        int var1 = 0;

        try {
            InputStream var2 = a("/lang_" + this.m[2] + ".txt");
            ByteArrayOutputStream var3 = new ByteArrayOutputStream(300);
            byte[] var4 = new byte[1];

            while(var2.read(var4) > 0) {
                if(var4[0] == 13) {
                    var2.read(var4);
                    this.b[var1] = new String(var3.toByteArray(), "UTF-8");
                    var3.reset();
                    ++var1;
                } else {
                    var3.write(var4);
                }
            }

            q();
            var3.close();
            var2 = a("/manual_" + this.m[2] + ".txt");
            var3 = new ByteArrayOutputStream(300);
            var1 = 0;

            while(var2.read(var4) > 0) {
                if(var4[0] == 13) {
                    var2.read(var4);
                    this.f[var1] = new String(var3.toByteArray(), "UTF-8");
                    var3.reset();
                    ++var1;
                } else {
                    var3.write(var4);
                }
            }

            q();
            var3.close();
        } catch (Exception var5) {
            System.err.println(this.m[2] + ": error on line: " + (var1 + 1));
        }
    }

    private static void aB() {
        a[10] = a("../Art/Systxt.png");
        a[13] = a("../Art/Results Text.png");
        a[11] = a("../Art/HUD Time.png");
        a[12] = a("../Art/HUD Numbers.png");
        a[14] = a("../Art/Game Over.png");
        a[15] = a("../Art/Time Over.png");
        a[1] = a("../Art/HUD Rings.png");
        a[2] = a("../Art/Life Icon.png");
        a[3] = a("../Art/Score.png");
        a[4] = a("../Art/Menu Right Arrow.png");
        a[5] = a("../Art/Menu Left Arrow.png");
    }

    private void o(int var1) {
        String[] var10000;
        byte var10001;
        String var10002;
        label49: {
            String[] var3;
            byte var10003;
            label39: {
                c var2;
                label38: {
                    switch(var1) {
                    case 0:
                        if(this.m[1] == 0) {
                            var10000 = this.a;
                            var10001 = 0;
                            var3 = this.b;
                            var10003 = 29;
                        } else {
                            var10000 = this.a;
                            var10001 = 0;
                            var3 = this.b;
                            var10003 = 46;
                        }

                        var10000[var10001] = var3[var10003];
                        var10000 = this.a;
                        var10001 = 1;
                        var3 = this.b;
                        var10003 = 45;
                        break label39;
                    case 1:
                        var10000 = this.a;
                        var10001 = 0;
                        var10002 = "";
                        break;
                    case 2:
                        if(this.m[1] == 0) {
                            var10000 = this.a;
                            var10001 = 0;
                            var3 = this.b;
                            var10003 = 29;
                        } else {
                            var10000 = this.a;
                            var10001 = 0;
                            var3 = this.b;
                            var10003 = 46;
                        }

                        var10000[var10001] = var3[var10003];
                        var2 = this;
                        break label38;
                    case 3:
                        this.a[0] = "";
                        var10000 = this.a;
                        var10001 = 1;
                        var10002 = "";
                        break label49;
                    case 4:
                        var10000 = this.a;
                        var10001 = 0;
                        var10002 = this.b[90];
                        break;
                    default:
                        return;
                    }

                    var10000[var10001] = var10002;
                    var2 = this;
                }

                var10000 = var2.a;
                var10001 = 1;
                var3 = this.b;
                var10003 = 44;
            }

            var10002 = var3[var10003];
        }

        var10000[var10001] = var10002;
    }

    public final void G() {
        this.bq = 0;
        this.br = -1;
        this.bs = 0;
        this.bt = 0;

        for(int var1 = 0; var1 < 2; ++var1) {
            this.G[var1] = z[var1] = y[var1];
            this.I[var1] = this.H[var1] = 0;
        }

    }

    public final void a(int var1, int var2, int var3) {
        if(var3 == 1 || var3 == 21) {
            if(this.bt <= 1) {
                if(this.bs <= 1) {
                    if(Math.abs(a() - var1) < 300 && Math.abs(b() + 40 - var2) < 120) {
                        this.bs = 20;
                        this.br = 10;
                        this.bt = 1;
                    }

                }
            }
        }
    }

    public final void c(int var1, int var2) {
        if(this.bt <= 2) {
            if(this.bt != 2 || this.bs <= 1) {
                int var3 = this.w[4] == 35?48:136;
                if(Math.abs(a() - var1) < var3 && b() + 40 > var2 && b() - 320 < var2) {
                    this.bs = 20;
                    this.br = 8;
                    this.bt = 2;
                }

            }
        }
    }

    public final void b(int var1, int var2, int var3) {
        if(var3 == 2 || var3 == 10) {
            if(this.bt <= 3) {
                if(this.bt != 3 || this.bs <= 1) {
                    if(this.bs < 2 && Math.abs(a() - var1) < 128 && Math.abs(b() - var2) < 96) {
                        this.bs = 20;
                        this.br = 7;
                        this.bt = 3;
                    }

                }
            }
        }
    }

    public final void c(int var1, int var2, int var3) {
        if(var3 == 2) {
            if(this.bt <= 4) {
                if(this.bt != 4 || this.bs <= 1) {
                    if(Math.abs(a() - var1) < 96 && Math.abs(b() - var2) < 96) {
                        this.bs = 20;
                        this.br = 5;
                        this.bt = 4;
                    }

                }
            }
        }
    }

    public final void d(int var1, int var2, int var3) {
        if(var3 == 1 || var3 == 2) {
            if(this.bt <= 4) {
                if(this.bt != 4 || this.bs <= 1) {
                    if(Math.abs(a() - var1) < 96 && Math.abs(b() - var2) < 96) {
                        this.bs = 20;
                        this.br = 5;
                        this.bt = 4;
                    }

                }
            }
        }
    }

    public final void e(int var1, int var2, int var3) {
        if(var3 == 2) {
            if(this.bt <= 5) {
                if(this.bt != 5 || this.bs <= 1) {
                    if(Math.abs(a() - var1) < 96 && Math.abs(b() - var2) < 96) {
                        this.bs = 20;
                        this.br = 2;
                        this.bt = 5;
                    }

                }
            }
        }
    }

    public final void f(int var1, int var2, int var3) {
        if(var3 == 1 || var3 == 2) {
            if(this.bt <= 5) {
                if(this.bt != 5 || this.bs <= 1) {
                    if(Math.abs(a() - var1) < 96 && Math.abs(b() - var2) < 96) {
                        this.bs = 20;
                        this.br = 2;
                        this.bt = 5;
                    }

                }
            }
        }
    }

    public final void H() {
        int var1 = a();
        int var2 = b();
        if(this.bs > 0) {
            --this.bs;
            if(this.bs == 0) {
                this.br = -1;
                this.bt = 0;
            }
        }

        label168: {
            c var10000;
            int var10001;
            if(this.br >= 0) {
                var10000 = this;
                var10001 = this.br;
            } else {
                this.bt = 0;
                if(!this.t && !this.u) {
                    switch(this.aj) {
                    case 0:
                        var10000 = this;
                        var10001 = 1;
                        break;
                    case 1:
                    case 3:
                    default:
                        break label168;
                    case 2:
                        this.bq = 1;
                    case 4:
                        this.bq = 1;
                        if(this.ak != 1 || Math.abs(var1 - 8464) >= 240 || Math.abs(var2 - 640) >= 80) {
                            break label168;
                        }

                        var10000 = this;
                        var10001 = 2;
                    }
                } else if(this.aj == 5 && y[0] < 1024) {
                    var10000 = this;
                    var10001 = 1;
                } else {
                    var10000 = this;
                    var10001 = 6;
                }
            }

            var10000.bq = var10001;
        }

        int[] var7;
        int var8;
        byte var9;
        label147: {
            byte var10002;
            switch(this.bq) {
            case 1:
                this.I[0] = 0;
                var7 = this.I;
                var9 = 1;
                var8 = 0;
                break label147;
            case 2:
                this.I[0] = 0;
                var7 = this.I;
                var9 = 1;
                var8 = 32;
                break label147;
            case 3:
                var7 = this.I;
                var9 = 0;
                var10002 = 0;
                break;
            case 4:
                if(c[5] > 0) {
                    this.I[0] = 0;
                    var7 = this.I;
                    var9 = 1;
                    var8 = 48;
                } else {
                    this.I[0] = 0;
                    var7 = this.I;
                    var9 = 1;
                    var8 = 0;
                }
                break label147;
            case 5:
                this.I[0] = 0;
                var7 = this.I;
                var9 = 1;
                var8 = -16;
                break label147;
            case 6:
                this.I[0] = 0;
                var7 = this.I;
                var9 = 1;
                var8 = 0;
                break label147;
            case 7:
                this.I[0] = 0;
                var7 = this.I;
                var9 = 1;
                var8 = 16;
                break label147;
            case 8:
                this.I[0] = 0;
                var7 = this.I;
                var9 = 1;
                var8 = -32;
                break label147;
            case 9:
                this.I[0] = 36;
                var7 = this.I;
                var9 = 1;
                var8 = 16;
                break label147;
            case 10:
                var7 = this.I;
                var9 = 0;
                var10002 = 32;
                break;
            default:
                z[0] = y[0];
                var7 = z;
                var9 = 1;
                var8 = y[1];
                break label147;
            }

            var7[var9] = var10002;
            var7 = this.I;
            var9 = 1;
            var8 = 40;
        }

        label143: {
            var7[var9] = var8;
            int var3 = Math.abs(y[0] - this.G[0]);
            int var4 = Math.abs(y[1] - this.G[1]);
            if(this.bq == 6) {
                if(var3 >= 4 && var3 <= 256) {
                    var7 = this.G;
                    var9 = 0;
                    var8 = this.G[0] + (y[0] > this.G[0]?4:-4);
                } else {
                    var7 = this.G;
                    var9 = 0;
                    var8 = y[0];
                }

                var7[var9] = var8;
                if(var4 >= 4 && var4 <= 256) {
                    var7 = this.G;
                    var9 = 1;
                    var8 = this.G[1] + (y[1] > this.G[1]?4:-4);
                } else {
                    var7 = this.G;
                    var9 = 1;
                    var8 = y[1];
                }
            } else {
                if(var3 >= 32 && var3 <= 256) {
                    var7 = this.G;
                    var9 = 0;
                    var8 = this.G[0] + (y[0] > this.G[0]?32:-32);
                } else {
                    var7 = this.G;
                    var9 = 0;
                    var8 = y[0];
                }

                var7[var9] = var8;
                if(var4 >= 16 && var4 <= 256) {
                    if(var4 > 32) {
                        this.G[1] = y[1] > this.G[1]?this.G[1] + 32:this.G[1] - 32;
                        break label143;
                    }

                    var7 = this.G;
                    var9 = 1;
                    var8 = this.G[1] + (y[1] > this.G[1]?16:-16);
                } else {
                    var7 = this.G;
                    var9 = 1;
                    var8 = y[1];
                }
            }

            var7[var9] = var8;
        }

        if(this.H[0] != this.I[0]) {
            this.H[0] += this.H[0] < this.I[0]?1:-1;
        }

        z[0] = this.G[0] + this.H[0];
        if(this.H[1] != this.I[1]) {
            this.H[1] += this.H[1] < this.I[1]?1:-1;
        }

        z[1] = this.G[1] + this.H[1];
        int var5 = 0;
        if(this.bh > 0) {
            var5 = 0 + (this.bh << 1);
        }

        if(this.bg > 0) {
            var5 -= this.bg << 1;
        }

        int var6 = this.K[3] - var5;
        if(z[1] > var6) {
            z[1] = var6;
        }

        if(z[0] < 0) {
            z[0] = 0;
        }

    }

    public final void I() {
        if(this.T && this.bC > 0) {
            --this.bC;
        } else {
            int var3;
            if(this.U) {
                if(this.bD < 0) {
                    this.C = false;
                    this.U = false;
                    this.T = false;
                    this.B = 0;
                    this.C = 0;
                    this.D = 0;
                    this.E = 0;
                    this.Y = false;
                    boolean var1 = false;
                    ++this.am;
                    this.am %= 3;
                    if(this.am == 0) {
                        this.a(true);
                    }

                    this.g = (byte)(this.am + this.al * 3);
                    this.i = (byte)this.A;
                    this.bx = this.w;
                    if(this.j < this.g) {
                        this.j = this.g;
                    }

                    this.ac();
                    this.aj = f[this.al][this.am];
                    this.ak = g[this.al][this.am];
                    this.aC();
                    if(this.aj == 0 && this.ak == 0) {
                        this.ai = 8;
                        this.aL = 0;
                        this.g();
                    } else {
                        this.r = true;
                        this.aj();
                        if(this.K) {
                            this.ai = 7;
                            this.aJ = 0;
                        } else {
                            this.p();
                        }
                    }
                } else {
                    --this.bD;
                    if(this.bD == 10) {
                        this.a.a(19, 1, false);
                    }

                    if(this.bE - this.bD > 0) {
                        for(var3 = 0; var3 < 20; ++var3) {
                            if(this.bG > 0) {
                                this.bG -= 10;
                                this.a(10, false);
                            }

                            if(this.bF > 0) {
                                this.bF -= 10;
                                this.a(10, false);
                            }
                        }
                    }
                }
            }

            if(this.T) {
                this.C = true;
                c[12] = 0;
                c[10] += 128;
            } else {
                this.a = true;
            }

            for(var3 = 0; var3 < this.h.length; ++var3) {
                if(this.h[var3][0] == 1 && this.bd >= this.h[var3][9]) {
                    for(int var2 = 0; var2 < 6; ++var2) {
                        if(this.m + this.h[var3][8] > this.h[var3][2]) {
                            ++this.h[var3][2];
                        } else {
                            if(this.m + this.h[var3][8] >= this.h[var3][2]) {
                                ++this.bd;
                                this.h[var3][0] = 2;
                                if(this.bd < 5) {
                                    break;
                                }

                                if(!this.T) {
                                    this.j();
                                    if(this.r) {
                                        this.ai();
                                        this.r = false;
                                        this.B = 0;
                                        this.C = 0;
                                        this.D = 0;
                                        this.E = 0;
                                        this.Y = false;
                                        this.ak();
                                    } else {
                                        this.av();
                                        this.ak();
                                    }
                                    break;
                                }

                                this.j();
                                this.U = true;
                                this.q = -1;
                                this.bF = this.v * 100;
                                this.bG = 0;
                                c var10000;
                                char var10001;
                                if(this.x < 30 && this.y == 0 && !this.Y) {
                                    var10000 = this;
                                    var10001 = '썐';
                                } else if(this.x < 45 && this.y == 0) {
                                    var10000 = this;
                                    var10001 = 10000;
                                } else if(this.y < 1) {
                                    var10000 = this;
                                    var10001 = 5000;
                                } else if(this.x < 30 && this.y == 1) {
                                    var10000 = this;
                                    var10001 = 4000;
                                } else if(this.y < 2) {
                                    var10000 = this;
                                    var10001 = 3000;
                                } else if(this.x < 30 && this.y == 2) {
                                    var10000 = this;
                                    var10001 = 2000;
                                } else {
                                    var10000 = this;
                                    var10001 = 1000;
                                }

                                var10000.bG = var10001;
                                int var4;
                                if(this.bG > this.bF) {
                                    var10000 = this;
                                    var4 = this.bG;
                                } else {
                                    var10000 = this;
                                    var4 = this.bF;
                                }

                                var10000.bE = var4 / 120;
                                this.bD = 330;
                                break;
                            }

                            --this.h[var3][2];
                        }
                    }
                }

                if(this.ai == 2 && !this.T) {
                    ++this.bd;
                    this.a = false;
                    if(this.bd < 20) {
                        this.g();
                    } else if(this.bd < 30) {
                        this.h[0][2] += d / 20;
                        this.h[1][2] += d / 20;
                        this.h[2][2] += d / 20;
                        this.h[3][2] -= d / 20;
                        this.h[4][2] -= d / 20;
                        this.g();
                    } else if(this.bd == 30) {
                        this.h[0][0] = 0;
                        this.h[1][0] = 0;
                        this.h[2][0] = 0;
                        this.h[3][0] = 0;
                        this.h[4][0] = 0;
                    }
                }
            }

        }
    }

    public final void J() {
        int var1 = 0;

        for(int var2 = 0; var2 < this.h.length; ++var2) {
            if(this.h[var2][0] >= 1) {
                if(a[10] != null) {
                    a(a, a[10], this.h[var2][4], this.h[var2][5], this.h[var2][6], this.h[var2][7], a[0], this.h[var2][2], this.h[var2][3], 20, true);
                }

                if(var1 < this.h[var2][3]) {
                    var1 = this.h[var2][3];
                }
            }
        }

        if(this.U) {
            int[] var7 = new int[]{this.w, this.bG, this.bF};
            int var3 = c * 30 / 100 - 24;
            int var4 = c * 90 / 100 - 24;
            int var5 = var1 + 10;

            for(int var6 = 0; var6 < 3; ++var6) {
                a(a, a[13], 0, var6 * 16, 84, 16, a[0], var3, var5 + 16 * var6, 20, true);
                i(var4, var5 + 16 * var6 - 36 + 40, var7[var6]);
            }

            if(this.bG == 0 && this.bF == 0) {
                this.a(this.b[0], d >> 1, i + h - a - 2, 16777215, 0);
            }
        }

    }

    private void aC() {
        while(true) {
            for(int var1 = 0; var1 < this.a.length; ++var1) {
                if(this.a[var1]) {
                    return;
                }
            }

            try {
                Thread.sleep(100L);
            } catch (Exception var2) {
                ;
            }
        }
    }

    private int a(boolean var1) {
        if(this.bf < 600) {
            return 17;
        } else if(this.q > 0) {
            return 6;
        } else if(this.t) {
            return this.aj == 5?12:11;
        } else if(var1) {
            switch(this.aj) {
            case 0:
                return 21;
            case 1:
                if(this.ak == 3) {
                    return 5;
                }

                return 1;
            case 2:
                return 22;
            case 3:
                return 3;
            case 4:
                return 23;
            case 5:
                if(this.ak == 3) {
                    return 12;
                }

                return 5;
            case 6:
                return 8;
            default:
                return 21;
            }
        } else {
            switch(this.aj) {
            case 0:
                return 0;
            case 1:
                if(this.ak == 3) {
                    return 5;
                }

                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                if(this.ak == 3) {
                    return 12;
                }

                return 5;
            case 6:
                return 8;
            default:
                return 0;
            }
        }
    }

    public final void e(boolean var1) {
        byte var2 = -1;
        if(var1) {
            var2 = 1;
        }

        d var10000;
        int var10001;
        if(this.t && this.aj < 5) {
            var10000 = this.a;
            var10001 = 11;
        } else {
            var10000 = this.a;
            var10001 = this.a(var1);
        }

        var10000.a(var10001, var2, true);
    }

    private void aD() {
        label14: {
            // Generic universal graphics
            b[151] = a("../Art/Sonic.png"); // Sonic's normal sprites and anims
            b[152] = a("../Art/Sonic Rotated.png"); // Sonic's walking and running frames on a slope
            b[2] = a("../Art/Red Spring.png");  // Powerful red spring
            b[96] = a("../Art/Projectiles.png");    // Various projectiles like missiles, spike balls, and Caterkiller's body
            b[47] = a("../Art/Special Ring.png");   // Big ring for the special stage
            b[0] = a("../Art/Ring.png");    // Generic ring
            b[36] = a("../Art/Checkpoint.png"); // Checkpoint lamppost
            b[42] = a("../Art/Monitors.png");   // Powerup monitors
            b[109] = a("../Art/Power Ups.png"); // Shield and invincibility stars
            b[9] = a("../Art/Spikes.png");  // Spikes
            b[153] = a("../Art/Yellow Spring.png"); // Normal yellow spring
            b[15] = a("../Art/MZ Switch.png");  // Generic button switch (For some reason MZ's switch is the default)
            b[97] = a("../Art/Explosion.png");  // Explosions from enemies, monitors, bosses, and other
            b[44] = a("../Art/Signpost.png");   // End of level sign panel
            b[45] = a("../Art/Score Bonuses.png");  // Point bonuses hidden at the end of the level
            b[100] = a("../Art/Animals.png");   // Enemies that come out of the prison capsule
            Image[] var10000;
            byte var10001;
            String var10002;
            switch(this.aj) {

            case 0: // Green Hill Zone Graphics
                b[41] = a("../Art/Motobug.png");    // Motobug enemy
                b[40] = a("../Art/Buzz Bomber.png");    // Buzz bomber enemy
                b[86] = a("../Art/Chopper.png");    // Chopper enemy
                b[39] = a("../Art/Newtron.png");    // Newtron enemy
                b[57] = a("../Art/Crabmeat.png");   // Crabmeat enemy
                b[3] = a("../Art/GHZ Swing.png");   // Swinging platform
                b[4] = a("../Art/GHZ Spike Helix.png"); // Spikey helix log
                b[18] = a("../Art/GHZ Breakable Wall.png"); // Walls that can be broken by rolling
                b[5] = a("../Art/GHZ Bridge.png");  // Bridge and bridge stump
                b[58] = a("../Art/GHZ Rock.png");   // Purple rock
                b[6] = a("../Art/GHZ Cliff.png");   // Cliff that collapses when stood on
                b[37] = a("../Art/GHZ Walls.png");  // Standard walls
                var10000 = b;
                var10001 = 16;
                var10002 = "../Art/GHZ Platforms.png";  // Basic moving and static platforms (Normal and tall variant)
                break;

            case 1: // Labyrinth Zone Graphics

            case 3: // Star Light Zone Graphics

            case 5: // Scrap Brain Zone Graphics

            case 6: // ???

            default:
                break label14;

            case 2: // Marble Zone Graphics
                b[40] = a("../Art/Buzz Bomber.png");    // Buzz bomber enemy
                b[49] = a("../Art/Caterkiller.png");    // Caterkiller enemy
                b[78] = a("../Art/Batbrain.png");   // Batbrain enemy
                b[101] = a("../Art/Fire.png");  // Fire ball
                b[79] = a("../Art/MZ Pillar.png");  // Green glossy pillar
                b[54] = a("../Art/MZ Push Block.png");  // Pushable green block for riding on lava
                b[8] = a("../Art/MZ Spike Crusher.png");    // Spiked part of chain machine that raises and drops
                b[94] = a("../Art/MZ Chain.png");   // Chain of chain machine that raises and drops
                b[95] = a("../Art/MZ Crush Block.png"); // Non-spike version of chain machine that raises and drops, for crushing instead
                b[13] = a("../Art/Lava Flow.png");  // Edge of lava that flows in MZ Act 2
                b[99] = a("../Art/Lava.png");   // Generic lava
                b[11] = a("../Art/MZ Fall Block.png");  // Block that falls and becomes a platform when Sonic gets near it (Or just a generic block)
                b[77] = a("../Art/Laval Foam.png"); // Foam and bubbles that appear when lava shoots up
                b[14] = a("../Art/Lava Stream.png");    // Main body of falling lava
                b[98] = a("../Art/Lava Fall.png");  // Edge of falling lava
                b[7] = a("../Art/MZ Platforms.png");    // Various curved platforms
                b[27] = a("../Art/MZ Break Block.png"); // Blocks that Sonic can jump and break, or will automatically collapse
                var10000 = b;
                var10001 = 3;
                var10002 = "../Art/MZ Swing.png";   // Swinging platform
                break;

            case 4: // Spring Yard Zone Graphics
                b[101] = a("../Art/Fire.png");  // Fire ball (Unused here)
                b[40] = a("../Art/Buzz Bomber.png");    // Buzz bomber enemy
                b[57] = a("../Art/Crabmeat.png");   // Crabmeat enemy
                b[71] = a("../Art/Yadrin.png"); // Yadrin enemy
                b[70] = a("../Art/Roller.png"); // Roller enemy
                b[60] = a("../Art/Spike Balls.png");    // Various spikey balls of different sizes
                b[102] = a("../Art/SYZ Boss Block.png");    // Blocks that get destroyed in the SBZ3 boss fight
                b[107] = a("../Art/SYZ Large Block.png");   // Large block that floats to the right and is used like once
                b[83] = a("../Art/SBZ Girder.png"); // A piece of Scrap Brain Zone (Unused here)
                b[17] = a("../Art/SYZ Shift Block.png");    // Blocks used to make shifting stair cases
                b[61] = a("../Art/SYZ Lamp.png");   // Little lighthouse thingy
                b[56] = a("../Art/SYZ Bumper.png"); // Star bumper
                var10000 = b;
                var10001 = 16;
                var10002 = "../Art/SYZ Platform.png";   // Generic platform
            }

            var10000[var10001] = a(var10002);
        }

        this.J = false;
    }

    private void aE() {
        label14: {
            b[2] = null;
            b[96] = null;
            b[36] = null;
            b[42] = null;
            b[9] = null;
            b[153] = null;
            b[15] = null;
            b[44] = null;
            b[45] = null;
            Image[] var10000;
            byte var10001;
            switch(this.aj) {
            case 0:
                b[41] = null;
                b[40] = null;
                b[86] = null;
                b[39] = null;
                b[57] = null;
                b[3] = null;
                b[4] = null;
                b[18] = null;
                b[5] = null;
                b[58] = null;
                b[6] = null;
                var10000 = b;
                var10001 = 37;
                break;
            case 1:
            case 3:
            default:
                break label14;
            case 2:
                b[40] = null;
                b[49] = null;
                b[78] = null;
                b[79] = null;
                b[54] = null;
                b[8] = null;
                b[94] = null;
                b[95] = null;
                b[13] = null;
                b[99] = null;
                b[11] = null;
                b[77] = null;
                b[14] = null;
                b[98] = null;
                b[7] = null;
                b[27] = null;
                var10000 = b;
                var10001 = 3;
                break;
            case 4:
                b[101] = null;
                b[40] = null;
                b[57] = null;
                b[71] = null;
                b[70] = null;
                b[60] = null;
                b[107] = null;
                b[83] = null;
                b[17] = null;
                b[61] = null;
                b[56] = null;
                var10000 = b;
                var10001 = 16;
            }

            var10000[var10001] = null;
        }

        System.gc();
        this.J = true;
    }

    private static void a(byte[] var0, String var1) {
        var1 = var1 + "6390";

        try {
            RecordStore var2 = RecordStore.openRecordStore(var1, true);

            try {
                var2.setRecord(1, var0, 0, var0.length);
            } catch (Throwable var4) {
                var2.addRecord(var0, 0, var0.length);
            }

            var2.closeRecordStore();
        } catch (Throwable var5) {
            ;
        }
    }

    private static byte[] b(String var0) {
        var0 = var0 + "6390";
        RecordStore var1 = null;

        try {
            byte[] var2 = new byte[(var1 = RecordStore.openRecordStore(var0, false)).getRecordSize(1)];
            var1.getRecord(1, var2, 0);
            var1.closeRecordStore();
            return var2;
        } catch (Throwable var5) {
            try {
                var1.closeRecordStore();
            } catch (Throwable var4) {
                ;
            }

            return null;
        }
    }

    private static int i(int var0) {
        switch(var0) {
        case 1:
            return a[1];
        case 2:
            return a[2];
        case 3:
            return a[3];
        default:
            return 0;
        }
    }

    public static boolean b(int[] var0) {
        if(var0[14] == 0) {
            var0[5] = 0;
            var0[6] = 0;
            var0[7] = 0;
            var0[10] = 0;
            var0[11] = 0;
            var0[12] = var0[2] * 100;
            var0[13] = var0[3] * 100;
            var0[15] = -1;
            var0[16] = var0[2];
            var0[17] = var0[3];
            ++var0[14];
        }

        if(var0[5] > 0) {
            --var0[5];
        }

        ++var0[6];
        if(var0[7] > 0) {
            --var0[7];
        }

        return false;
    }

    public final void a(int[] var1) {
        this.a(var1, (this.j[var1[1]][1] >> 1) - 2);
    }

    public final void a(int[] var1, int var2) {
        int var3;
        int var4 = (var3 = var1[3]) + var2;
        if(var3 < 99999) {
            ++var3;
        }

        if(this.b(var1[2], var4)) {
            var3 -= 2;
        }

        if(var3 < 0) {
            var3 = 0;
        }

        var1[3] = var3;
    }

    public static void b(int[] var0) {
        int[] var10000;
        byte var10001;
        byte var10002;
        if(var0[19] == 0) {
            var10000 = var0;
            var10001 = 19;
            var10002 = 1;
        } else {
            var10000 = var0;
            var10001 = 19;
            var10002 = 0;
        }

        var10000[var10001] = var10002;
    }

    public final int a(int var1, int var2, int var3) {
        int var5 = var2 + var3;
        int var4;
        if(this.b(var1, var5)) {
            for(var4 = 0; var4 < 8; ++var4) {
                --var5;
                if(!this.b(var1, var5)) {
                    break;
                }
            }
        } else {
            for(var4 = 0; var4 < 8 && !this.b(var1, var5 + 1); ++var4) {
                ++var5;
            }
        }

        if((var5 -= var3) < 0) {
            var5 = 0;
        }

        return var5;
    }

    public final boolean a(int var1, int var2, int var3, int var4, int var5) {
        if(var5 == 0) {
            if(var1 - var3 - 1 < 0) {
                return true;
            }

            if(this.b(var1 - var3 - 1, var2 - 12)) {
                return true;
            }

            if(!this.b(var1 - var3 - 1, var2 + var4 + 10)) {
                return true;
            }
        } else {
            if(this.b(var1 + var3 + 1, var2 - 12)) {
                return true;
            }

            if(!this.b(var1 + var3 + 1, var2 + var4 + 10)) {
                return true;
            }
        }

        return false;
    }

    public final boolean c(int[] var1) {
        int var2 = this.j[var1[1]][0] >> 1;
        int var3 = this.j[var1[1]][1] >> 1;
        return this.a(var1[2], var1[3], var2, var3, var1[19] & 1);
    }

    public static boolean a(int[] var0, int var1, int var2) {
        int var3 = a();
        int var4 = b() - (i?16:20);
        if(var0[3] - var2 <= var4 && var4 <= var0[3] + var2) {
            switch(var0[19]) {
            case 0:
                if(var0[2] - var1 < var3 && var3 < var0[2]) {
                    return true;
                }
                break;
            case 1:
                if(var0[2] < var3 && var3 < var0[2] + var1) {
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }

    public static boolean c(int var0, int var1) {
        return Math.abs(var0 - a()) > 240 || Math.abs(var1 - b()) > 240;
    }

    public static boolean a(int var0, int var1, int var2) {
        int var3 = var0 - a();
        int var4 = var1 - (b() - (i?16:20));
        return var3 * var3 + var4 * var4 < var2 * var2;
    }

    public final int a(int var1, int var2, int var3, int var4, boolean var5) {
        if(g && d) {
            return 0;
        } else {
            int var7 = !i && !k?16:12;
            int var8 = a();
            int var9 = b() - var7;
            int var10 = (var3 >> 1) + 12;
            int var11 = (var4 >> 1) + var7;
            if(i) {
                if(var8 - var10 < var1 && var1 < var8 + var10 && var9 - var11 < var2 && var2 < var9 + var11) {
                    if(this.q <= 0 && (!this.G || !this.f[0])) {
                        if(var5) {
                            return 1;
                        }

                        return 2;
                    }

                    return 1;
                }
            } else if(var8 - var10 < var1 && var1 < var8 + var10 && var9 - var11 < var2 && var2 < var9 + var11) {
                if(this.q <= 0 && (!this.G || !this.f[0])) {
                    return 2;
                }

                return 1;
            }

            return 0;
        }
    }

    public final boolean d(int[] var1) {
        int var2 = this.j[var1[1]][0];
        int var3 = this.j[var1[1]][1];
        int var4 = this.a(var1[2], var1[3], var2, var3, true);
        if(var1[1] == 71 && var4 == 1 && var1[3] - 4 > b() - 16) {
            var4 = 2;
        }

        if(var4 == 1) {
            if(c[5] > 0) {
                c[5] = c[5] > 2560?-2560:-c[5];
            }

            label41: {
                c var10000;
                short var10001;
                if(this.aw == 0) {
                    var10000 = this;
                    var10001 = 100;
                } else if(this.aw == 100) {
                    var10000 = this;
                    var10001 = 200;
                } else if(this.aw == 200) {
                    var10000 = this;
                    var10001 = 500;
                } else {
                    if(this.aw != 500) {
                        break label41;
                    }

                    var10000 = this;
                    var10001 = 1000;
                }

                var10000.aw = var10001;
            }

            this.a(this.aw, true);
            this.h(var1[2], var1[3], this.aw);
            this.a(2, var1[2], var1[3], 0, 0, 0, 0);
            this.a(b[this.aj][c(2)], var1[2], var1[3], 0, -300, 0, 0);
            var1[0] = 0;
            return true;
        } else if(var4 == 2) {
            this.u();
            return false;
        } else {
            return false;
        }
    }

    public final boolean a(int[] var1, int var2) {
        int var3;
        int var5 = (var3 = var1[13]) / 100 + var2;
        boolean var6 = false;
        if(var3 < 9999900) {
            var3 += 100;
        }

        if(this.b(var1[12] / 100, var5)) {
            var3 -= 200;
            var1[11] = 50;
            var6 = true;
        }

        if(var3 < 0) {
            var3 = 0;
        }

        var1[13] = var3;
        return var6;
    }

    private void c(int var1, int var2, int var3, int var4, int var5) {
        int[] var6 = new int[25];
        if(var1 >= 1) {
            var6[0] = 1;
            var6[1] = var1;
            var6[2] = var2;
            var6[3] = var3;
            var6[4] = var4;
            var6[19] = var5;
            var6[21] = 1;
            this.d(var6);
        }
    }

    public final void K() {
        this.i = new int[50][20];
    }

    public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if(var1 >= 1) {
            for(int var9 = 0; var9 < 50; ++var9) {
                int[] var8;
                if((var8 = this.i[var9])[0] <= 0) {
                    for(int var10 = 4; var10 < 20; ++var10) {
                        var8[var10] = 0;
                    }

                    var8[0] = 1;
                    var8[1] = var1;
                    var8[2] = var2 * 100;
                    var8[3] = var3 * 100;
                    var8[8] = var7;
                    var8[10] = var4;
                    var8[11] = var5;
                    var8[19] = var6;
                    return;
                }
            }

        }
    }

    public final void b(int var1, int var2, int var3, int var4, int var5, int var6) {
        if(var1 >= 1) {
            for(int var8 = 0; var8 < 50; ++var8) {
                int[] var7;
                if((var7 = this.i[var8])[0] <= 0) {
                    for(int var9 = 4; var9 < 20; ++var9) {
                        var7[var9] = 0;
                    }

                    var7[0] = 1;
                    var7[1] = var1;
                    var7[2] = var2 * 100;
                    var7[3] = var3 * 100;
                    var7[8] = var6;
                    var7[10] = a(var4) * var5 / 100;
                    var7[11] = b(var4) * var5 / 100;
                    return;
                }
            }

        }
    }

    private void k(int var1, int var2, int var3) {
        if(var3 > 0) {
            if(var3 > 32) {
                var3 = 32;
            }

            this.e(var1, var2, var3, 256);
            if(var3 > 16) {
                var3 -= 16;
                this.e(var1, var2, var3, 128);
            }

        }
    }

    private void e(int var1, int var2, int var3, int var4) {
        boolean var5 = false;
        int var6 = var3 > 16?16:var3;

        for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = (var7 >> 1) * 2250 + 1125;
            if((var7 & 1) == 1) {
                var8 = -var8 + '負';
            }

            this.b(4, var1, var2, var8 / 100, var4, 0);
        }

    }

    public final void g(int var1, int var2, int var3) {
        int[] var4 = new int[24];
        if(var3 < 0 || var3 > 5) {
            var3 = 0;
        }

        int var5 = 60;

        int var6;
        for(var6 = 0; var6 < 24; ++var6) {
            var5 += 2 + c(18);
            var4[var6] = var5;
        }

        for(var6 = 0; var6 < 24; ++var6) {
            this.a(b[var3][c(2)], var1 + (var6 % 8 * 8 - 32), var2, 0, -350 + c(60), c(2), var5 - var4[var6]);
        }

    }

    public final void h(int var1, int var2, int var3) {
        c var10000;
        byte var10001;
        int var10002;
        int var10003;
        byte var10004;
        byte var10005;
        byte var10006;
        byte var10007;
        if(var3 < 10) {
            var10000 = this;
            var10001 = 6;
            var10002 = var1;
            var10003 = var2;
            var10004 = 0;
            var10005 = 0;
            var10006 = 0;
            var10007 = 0;
        } else if(var3 < 50) {
            var10000 = this;
            var10001 = 6;
            var10002 = var1;
            var10003 = var2;
            var10004 = 0;
            var10005 = 0;
            var10006 = 0;
            var10007 = 1;
        } else if(var3 < 100) {
            var10000 = this;
            var10001 = 6;
            var10002 = var1;
            var10003 = var2;
            var10004 = 0;
            var10005 = 0;
            var10006 = 0;
            var10007 = 2;
        } else if(var3 < 200) {
            var10000 = this;
            var10001 = 6;
            var10002 = var1;
            var10003 = var2;
            var10004 = 0;
            var10005 = 0;
            var10006 = 0;
            var10007 = 3;
        } else if(var3 < 500) {
            var10000 = this;
            var10001 = 6;
            var10002 = var1;
            var10003 = var2;
            var10004 = 0;
            var10005 = 0;
            var10006 = 0;
            var10007 = 4;
        } else if(var3 < 1000) {
            var10000 = this;
            var10001 = 6;
            var10002 = var1;
            var10003 = var2;
            var10004 = 0;
            var10005 = 0;
            var10006 = 0;
            var10007 = 5;
        } else {
            var10000 = this;
            var10001 = 6;
            var10002 = var1;
            var10003 = var2;
            var10004 = 0;
            var10005 = 0;
            var10006 = 0;
            var10007 = 6;
        }

        var10000.a(var10001, var10002, var10003, var10004, var10005, var10006, var10007);
    }

    public final void L() {
        for(int var2 = 0; var2 < 50; ++var2) {
            int[] var1;
            if((var1 = this.i[var2])[0] > 0) {
                int[] var10000;
                byte var10001;
                int var10002;
                if(var1[6] > 600) {
                    var10000 = var1;
                    var10001 = 0;
                    var10002 = 0;
                } else {
                    this.e(var1);
                    if(var1[5] > 0) {
                        --var1[5];
                    }

                    var10000 = var1;
                    var10001 = 6;
                    var10002 = var1[6] + 1;
                }

                var10000[var10001] = var10002;
            }
        }

    }

    private void e(int[] var1) {
        switch(var1[1]) {
        case 1:
            f(var1);
            return;
        case 2:
            f(var1);
            return;
        case 4:
            this.g(var1);
            return;
        case 5:
            h(var1);
            return;
        case 6:
            i(var1);
            return;
        case 7:
            this.j(var1);
            return;
        case 8:
            this.k(var1);
            return;
        case 9:
            this.l(var1);
            return;
        case 10:
            this.m(var1);
            return;
        case 12:
            this.o(var1);
            return;
        case 13:
            this.n(var1);
            return;
        case 14:
            this.p(var1);
            return;
        case 15:
            q(var1);
            return;
        case 16:
            this.r(var1);
            return;
        case 17:
            this.s(var1);
            return;
        case 18:
            this.t(var1);
            return;
        case 19:
            this.u(var1);
            return;
        case 20:
            this.v(var1);
            return;
        case 21:
            this.w(var1);
            return;
        case 22:
        case 23:
        case 24:
        case 25:
        case 26:
            x(var1);
            return;
        case 28:
        case 29:
        case 30:
        case 31:
        case 32:
        case 33:
        case 34:
            this.I(var1);
        case 3:
        case 11:
        case 27:
        default:
        }
    }

    public final void M() {
        for(int var3 = 0; var3 < 50; ++var3) {
            int[] var1;
            if((var1 = this.i[var3])[0] > 0) {
                switch(var1[1]) {
                case 1:
                case 2:
                case 3:
                    y(var1);
                    break;
                case 4:
                    this.z(var1);
                    break;
                case 5:
                    A(var1);
                    break;
                case 6:
                    B(var1);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    C(var1);
                    break;
                case 14:
                    D(var1);
                    break;
                case 15:
                    this.E(var1);
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    this.F(var1);
                case 21:
                case 27:
                default:
                    break;
                case 22:
                case 23:
                case 24:
                case 25:
                    G(var1);
                    break;
                case 26:
                    H(var1);
                    break;
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    J(var1);
                }
            }
        }

    }

    private static void f(int[] var0) {
        if(var0[6] > 24) {
            var0[0] = 0;
        }

    }

    private void g(int[] var1) {
        var1[2] += var1[10];
        var1[3] += var1[11];
        var1[15] = this.j >> 1;
        int var2 = var1[11];
        int var3 = var1[2] / 100;
        int var4 = var1[3] / 100;
        if(this.a(var3, var4, 12, 12, false) != 0) {
            this.a(5, var3, var4, 0, 0, 0, 0);
            ++this.v;
            var1[0] = 0;
        } else {
            label52: {
                int var10000;
                label51: {
                    int var5;
                    if(var2 > 0) {
                        if(this.b(var3, var4 + 4)) {
                            var5 = (this.b[this.aq] & 255) << 4;
                            var4 = (var4 & -16) + (16 - Math.abs(this.c[var5 + (var3 & 15)]));
                            var10000 = -(var2 >> 1);
                            break label51;
                        }

                        var2 += 6;
                        if(var2 <= 500) {
                            break label52;
                        }
                    } else {
                        if(this.b(var3, var4 - 4)) {
                            for(var5 = 0; var5 < 3; ++var5) {
                                ++var4;
                                if(!this.b(var3, var4 - 4)) {
                                    break;
                                }
                            }

                            var10000 = -(var2 >> 1);
                            break label51;
                        }

                        var2 += 6;
                        if(var2 <= 500) {
                            break label52;
                        }
                    }

                    var10000 = 500;
                }

                var2 = var10000;
            }

            if(var4 < 0) {
                var4 = 0;
            } else if(var4 > 99999) {
                var1[0] = 0;
            }

            var1[3] = var4 * 100;
            var1[11] = var2;
            if(var1[6] > 300) {
                var1[0] = 0;
            }

        }
    }

    private static void h(int[] var0) {
        var0[15] = var0[6] / 8;
        if(var0[15] > 3) {
            var0[0] = 0;
        }

    }

    private static void i(int[] var0) {
        var0[3] -= 100;
        if(var0[6] > 50) {
            var0[0] = 0;
        }

    }

    private void j(int[] var1) {
        if(this.a(var1[2] / 100, var1[3] / 100, 8, 8, false) != 0) {
            this.u();
        }

        var1[2] += var1[10];
        var1[3] += var1[11];
        var1[15] = 2 + (this.j & 1);
    }

    private void k(int[] var1) {
        if(var1[6] > 10) {
            if(this.a(var1[2] / 100, var1[3] / 100, 10, 10, false) != 0) {
                this.u();
            }

            var1[2] += var1[10];
            var1[3] += var1[11];
        }

        var1[15] = 2 + (this.j & 1);
    }

    private void l(int[] var1) {
        if(var1[6] > 5) {
            if(this.a(var1[2] / 100, var1[3] / 100, 10, 10, false) != 0) {
                this.u();
            }

            var1[2] += var1[10];
            var1[3] += var1[11];
            var1[11] += 10;
            if(var1[11] > 600) {
                var1[11] = 600;
            }
        }

        var1[15] = 4 + (this.j & 1);
    }

    private void m(int[] var1) {
        if(this.a(var1[2] / 100, var1[3] / 100, 12, 12, false) != 0) {
            this.u();
        }

        int var2 = var1[2];
        int var3 = var1[3];
        int var4 = var1[10];
        int var5 = var1[11];
        var5 += 10;
        if(var5 > 300) {
            var5 = 300;
        }

        var2 += var4;
        var3 += var5;
        if(var5 > 0 && this.b(var2 / 100, var3 / 100 + 5)) {
            boolean var6 = false;

            int var7;
            do {
                var7 = this.a(var2 / 100, var3 / 100 + 5);
                var3 -= 100;
            } while(this.b(var2 / 100, var3 / 100 + 5));

            label35: {
                int var10000;
                if(var7 > 270) {
                    var10000 = -Math.abs(var4);
                } else {
                    if(var7 <= 15) {
                        break label35;
                    }

                    var10000 = Math.abs(var4);
                }

                var4 = var10000;
            }

            var5 = -var5;
        }

        if(var3 < 0) {
            var3 = 0;
        } else if(var3 > 999900) {
            var1[0] = 0;
        }

        var1[15] = 8 + (this.j & 1);
        var1[2] = var2;
        var1[3] = var3;
        var1[10] = var4;
        var1[11] = var5;
        if(var1[6] > 300) {
            this.a(1, var1[2] / 100, var1[3] / 100, 0, 0, 0, 0);
            var1[0] = 0;
        }

    }

    private void n(int[] var1) {
        if(this.a(var1[2] / 100, var1[3] / 100, 8, 8, false) != 0) {
            this.u();
        }

        var1[2] += var1[10];
        var1[3] += var1[11];
        var1[11] += 10;
        if(var1[11] > 800) {
            var1[11] = 800;
        }

        var1[15] = 12 + (this.j & 1);
    }

    private void o(int[] var1) {
        if(this.a(var1[2] / 100, var1[3] / 100, 12, 12, false) != 0) {
            this.u();
        }

        var1[2] += var1[10];
        var1[3] += var1[11];
        var1[15] = 7;
    }

    private void p(int[] var1) {
        if(this.a(var1[2] / 100, var1[3] / 100, 12, 12, false) != 0) {
            this.u();
        }

        var1[15] = 11;
        int var2 = var1[2];
        int var3 = var1[3];
        int var4 = var1[10];
        int var5 = var1[11];
        var5 += 10;
        if(var5 > 400) {
            var5 = 400;
        }

        var2 += var4;
        var3 += var5;
        if(var5 > 0 && this.b(var2 / 100, var3 / 100 + 4)) {
            do {
                var3 -= 100;
            } while(this.b(var2 / 100, var3 / 100 + 4));

            var5 = -var5;
        }

        if(var3 < 0) {
            var3 = 0;
        } else if(var3 > 999900) {
            var1[0] = 0;
        }

        var1[2] = var2;
        var1[3] = var3;
        var1[10] = var4;
        var1[11] = var5;
        if(var1[6] > 180) {
            var1[0] = 0;
        }

    }

    private static void q(int[] var0) {
        if(var0[6] > 30) {
            var0[0] = 0;
        }

    }

    private void r(int[] var1) {
        switch(var1[14]) {
        case 2:
            var1[15] = 4;
            var1[5] = 8;
            ++var1[14];
        case 3:
            if(var1[5] > 0) {
                return;
            }

            var1[0] = 0;
            return;
        default:
            if(var1[6] > 4) {
                if(this.a(var1[2] / 100, var1[3] / 100, 12, 12, false) != 0) {
                    this.u();
                }

                var1[2] += var1[10];
                var1[3] += var1[11];
                if(var1[8] == 1) {
                    var1[11] += 6;
                    if(var1[11] > 1000) {
                        var1[11] = 1000;
                    }
                }
            }

            int[] var10000;
            byte var10001;
            label46: {
                if(var1[10] > 0) {
                    var1[18] = 3;
                    if(!this.b(var1[2] / 100 + 15, var1[3] / 100)) {
                        return;
                    }
                } else if(var1[10] < 0) {
                    var1[18] = 1;
                    if(!this.b(var1[2] / 100 - 15, var1[3] / 100)) {
                        return;
                    }
                } else {
                    if(var1[11] < 0) {
                        var10000 = var1;
                        var10001 = 18;
                        break label46;
                    }

                    if(var1[11] <= 0) {
                        return;
                    }

                    var1[18] = 0;
                    if(!this.b(var1[2] / 100, var1[3] / 100 + 16)) {
                        return;
                    }
                }

                var10000 = var1;
                var10001 = 14;
            }

            var10000[var10001] = 2;
        }
    }

    private void s(int[] var1) {
        int var2 = var1[2] / 100;
        int var3 = var1[3] / 100 + 6;
        if(this.a(var2, var3, 10, 10, false) != 0) {
            this.u();
        }

        var1[2] += var1[10];
        var1[3] += var1[11];
        switch(var1[14]) {
        default:
            var1[10] = 0;
            var1[11] = 20;
            var1[18] = 0;
            var1[19] = 0;
            var1[14] = 1;
        case 1:
            var1[11] += 4;
            if(var1[11] > 300) {
                var1[11] = 300;
            }

            if(!this.b(var1[2] / 100, var1[3] / 100 + 14)) {
                return;
            } else {
                this.a(18, var1[2] / 100, var1[3] / 100, 0, 0, 0, 0);
                this.a(18, var1[2] / 100, var1[3] / 100, 0, 0, 1, 0);
                var1[11] = 0;
                var1[5] = 13;
                ++var1[14];
            }
        case 2:
            var1[15] = 4;
            if(var1[5] <= 0) {
                var1[0] = 0;
            }
        }
    }

    private void t(int[] var1) {
        int var2 = var1[2] / 100;
        int var3 = var1[3] / 100 + 6;
        if(this.a(var2, var3, 12, 12, false) != 0) {
            this.u();
        }

        var1[2] += var1[10];
        var1[3] += var1[11];
        byte var10001;
        switch(var1[14]) {
        default:
            var1[10] = var1[19] == 1?64:-64;
            var1[11] = 100;
            var1[5] = 100;
            int[] var10000;
            byte var10002;
            switch(var1[8]) {
            case 1:
                var1[5] = 140;
                var10000 = var1;
                var10001 = 9;
                var10002 = 8;
                break;
            default:
                var1[5] = 100;
                var10000 = var1;
                var10001 = 9;
                var10002 = 5;
            }

            var10000[var10001] = var10002;
            var1[18] = 0;
            var1[15] = 0;
            var1[14] = 1;
        case 1:
            if(this.b(var1[2] / 100, var1[3] / 100 + 14)) {
                var1[3] -= 200;
            }

            if(var1[6] % 24 == 0 && var1[9] > 0) {
                label56: {
                    --var1[9];
                    c var4;
                    int var5;
                    int var10003;
                    byte var10004;
                    byte var10005;
                    byte var10006;
                    short var10007;
                    if(var1[8] == 0) {
                        var4 = this;
                        var10001 = 19;
                        var5 = var1[2] / 100;
                        var10003 = var1[3] / 100;
                        var10004 = 0;
                        var10005 = 0;
                        var10006 = 0;
                        var10007 = 0;
                    } else {
                        if(var1[8] != 1) {
                            break label56;
                        }

                        var4 = this;
                        var10001 = 19;
                        var5 = var1[2] / 100;
                        var10003 = var1[3] / 100;
                        var10004 = 0;
                        var10005 = 0;
                        var10006 = 0;
                        var10007 = 999;
                    }

                    var4.a(var10001, var5, var10003, var10004, var10005, var10006, var10007);
                }
            }

            if(var1[5] > 0) {
                return;
            } else {
                var1[5] = 12;
                ++var1[14];
            }
        case 2:
            var1[15] = 4;
            if(var1[5] <= 0) {
                var1[0] = 0;
            }
        }
    }

    private void u(int[] var1) {
        int var2 = var1[2] / 100;
        int var3 = var1[3] / 100 + 6;
        if(this.a(var2, var3, 12, 12, false) != 0) {
            this.u();
        }

        switch(var1[14]) {
        default:
            var1[14] = 1;
        case 1:
            if(var1[8] == 0) {
                var1[8] = 100;
            }

            var1[5] = 0;
            var1[18] = 0;
            var1[15] = 0;
            var1[14] = 1;
        case 2:
            if(var1[8] > 998) {
                return;
            } else if(var1[6] < var1[8]) {
                return;
            } else {
                var1[15] = 4;
                var1[5] = 8;
                ++var1[14];
            }
        case 3:
            if(var1[5] <= 0) {
                var1[0] = 0;
            }
        }
    }

    private void v(int[] var1) {
        int var3 = var1[2] / 100;
        int var4 = var1[3] / 100 + (var1[18] == 0?6:-6);
        if(this.a(var3, var4, 10, 12, false) != 0) {
            this.u();
        }

        switch(var1[14]) {
        default:
            var1[14] = 1;
        case 1:
            if(var1[8] == 0) {
                var1[8] = 64;
            }

            var1[5] = 0;
            var1[9] = 0;
            var1[18] = 0;
            var1[15] = 0;
            var1[17] = var1[3];
            ++var1[14];
        case 2:
            var1[9] += 140;
            var1[15] = this.j & 1;
            int var2 = var1[9] / 100 % 180;
            var1[3] = var1[17] - Math.abs(a(var2)) * var1[8];
            int[] var10000;
            byte var10001;
            byte var10002;
            if(var2 < 90) {
                var10000 = var1;
                var10001 = 18;
                var10002 = 2;
            } else {
                var10000 = var1;
                var10001 = 18;
                var10002 = 0;
            }

            var10000[var10001] = var10002;
            if(var1[9] >= 18000) {
                var1[0] = 0;
            }

        }
    }

    private void w(int[] var1) {
        if(this.a(var1[2] / 100, var1[3] / 100 + 2, 10, 10, false) != 0) {
            this.u();
        }

        var1[2] += var1[10];
        var1[3] += var1[11];
        if(this.b(var1[2] / 100, var1[3] / 100)) {
            var1[0] = 0;
        }

    }

    private static void x(int[] var0) {
        var0[15] = var0[8];
        var0[2] += var0[10];
        var0[3] += var0[11];
        var0[11] += 20;
        if(var0[11] > 800) {
            var0[11] = 800;
        }

    }

    private static void y(int[] var0) {
        int var1 = var0[6] / 4 % 5;
        if(var0[1] != 2) {
            var1 += 5;
        }

        b(var0[2] / 100, var0[3] / 100, 97, var1, a[0]);
    }

    private void z(int[] var1) {
        int[] var2 = new int[]{a[0], a[0], a[0], a[4]};
        int[] var3 = new int[]{0, 16, 32, 16};
        b(0, 0, var3[this.j & 3], 16, 16, var2[this.j & 3], var1[2] / 100, var1[3] / 100);
    }

    private static void A(int[] var0) {
        if(var0[15] >= 0 && var0[15] <= 3) {
            b(0, 16, var0[15] * 16, 16, 16, 0, var0[2] / 100, var0[3] / 100);
        }
    }

    private static void B(int[] var0) {
        int var6 = var0[2] / 100 - z[0];
        int var7 = var0[3] / 100 - z[1];
        int var1;
        if((var1 = var0[8]) >= 0) {
            if(var1 > 6) {
                var1 = 6;
            }

            byte var10000;
            byte var2;
            byte var4;
            label33: {
                label32: {
                    switch(var1) {
                    case 1:
                        var10000 = 10;
                        break;
                    case 2:
                        var4 = 10;
                        var2 = 3;
                        var10000 = 16;
                        break label33;
                    case 3:
                        var10000 = 15;
                        break;
                    case 4:
                        var4 = 15;
                        var2 = 3;
                        var10000 = 8;
                        break label33;
                    case 5:
                        var4 = 15;
                        var2 = 3;
                        var10000 = 16;
                        break label33;
                    case 6:
                        var10000 = 20;
                        break;
                    default:
                        var4 = 5;
                        var10000 = 8;
                        break label32;
                    }

                    var4 = var10000;
                    var10000 = 3;
                }

                var2 = var10000;
                var10000 = 0;
            }

            byte var3 = var10000;
            a(a, a[3], var2, var3, var4, 8, 0, var6, var7, 3, true);
        }
    }

    private static void C(int[] var0) {
        b(var0[2] / 100, var0[3] / 100, 96, var0[15], a[0]);
    }

    private static void D(int[] var0) {
        int var10000 = var0[2] / 100;
        int var10001 = var0[3] / 100;
        int var10003 = var0[8] == 0?0:2;
        int[] var10004;
        byte var10005;
        if(var0[19] == 0) {
            var10004 = a;
            var10005 = 0;
        } else {
            var10004 = a;
            var10005 = 4;
        }

        b(var10000, var10001, 49, var10003, var10004[var10005]);
    }

    private void E(int[] var1) {
        byte var2;
        if(var1[6] < 5) {
            var2 = 3;
        } else if(var1[6] < 10) {
            var2 = 4;
        } else {
            if(var1[6] >= 15) {
                return;
            }

            var2 = 5;
        }

        if((this.j & 1) == 0) {
            b(var1[2] / 100, var1[3] / 100, 41, var2, a[0]);
        }

    }

    private void F(int[] var1) {
        int var2;
        if((var2 = var1[15] % 5) == 0) {
            var2 += this.j & 3;
        }

        int var7 = var1[18];
        int var4 = var2 * 32;
        b(101, 0, var4, 24, 32, i(var7), var1[2] / 100, var1[3] / 100);
    }

    private static void G(int[] var0) {
        int var1 = var0[15] & 3;
        int var6 = var0[1] == 23?102:(var0[1] == 24?18:27);
        short var2 = d[var1][0];
        short var3 = d[var1][1];
        b(var6, var2, var3, 16, 16, 0, var0[2] / 100, var0[3] / 100);
    }

    private static void H(int[] var0) {
        byte var10000;
        switch(var0[8]) {
        case 1:
            var10000 = 16;
            break;
        case 2:
            var10000 = 32;
            break;
        default:
            var10000 = 0;
        }

        byte var1 = var10000;
        b(18, var1, 0, 16, 16, 0, var0[2] / 100, var0[3] / 100);
    }

    private void I(int[] var1) {
        int var2 = (var1[1] - 28) % 7;
        if(var1[14] > 2) {
            var1[2] += var1[10];
            var1[3] += var1[11];
            var1[11] += 10;
            if(var1[11] > 800) {
                var1[11] = 800;
            }
        }

        switch(var1[14]) {
        default:
            var1[14] = 1;
        case 1:
            var1[10] = 0;
            var1[15] = 0;
            var1[5] = var1[8];
            ++var1[14];
        case 2:
            if(var1[5] > 0) {
                break;
            }

            ++var1[14];
        case 3:
            var1[15] = 0;
            if(!this.b(var1[2] / 100, var1[3] / 100 + 8)) {
                break;
            }

            var1[10] = e[var2][0];
            var1[11] = e[var2][1];
            if(var1[19] == 1) {
                var1[10] = -var1[10];
            }

            var1[6] = 0;
            ++var1[14];
        case 4:
            var1[15] = 1;
            if(this.b(var1[2] / 100, var1[3] / 100 + 8)) {
                for(int var3 = 0; var3 < 3; ++var3) {
                    var1[3] -= 200;
                    if(!this.b(var1[2] / 100, var1[3] / 100 + 8)) {
                        break;
                    }
                }

                var1[11] = e[var2][1];
            }
        }

        int[] var10000;
        byte var10001;
        if(var1[3] < 0) {
            var10000 = var1;
            var10001 = 3;
        } else {
            if(var1[3] <= 999900) {
                return;
            }

            var10000 = var1;
            var10001 = 0;
        }

        var10000[var10001] = 0;
    }

    private static void J(int[] var0) {
        int var1;
        if((var1 = var0[15] % 3) >= 0) {
            int var3;
            label16: {
                int[] var10000;
                byte var10001;
                switch(var0[19]) {
                case 1:
                    var10000 = a;
                    var10001 = 4;
                    break;
                case 2:
                    var10000 = a;
                    var10001 = 6;
                    break;
                case 3:
                    var10000 = a;
                    var10001 = 2;
                    break;
                default:
                    var3 = 0;
                    break label16;
                }

                var3 = var10000[var10001];
            }

            int var2 = var3;
            b(var0[2] / 100, var0[3] / 100, 100, var1, var2);
        }
    }

    private void aF() {
        c var10000;
        byte var10001;
        label30: {
            this.K = this.aj;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = this.T = 0;
            this.U = this.V = 0;
            this.Y = 0;
            this.Z = 0;
            this.aa = 0;
            this.ab = 0;
            this.ac = 0;
            this.ad = 0;
            if(this.aj != 3 && this.aj != 4) {
                switch(this.m[0]) {
                case 1:
                    var10000 = this;
                    var10001 = 6;
                    break label30;
                case 2:
                    var10000 = this;
                    var10001 = 8;
                    break label30;
                default:
                    var10000 = this;
                }
            } else {
                switch(this.m[0]) {
                case 1:
                    var10000 = this;
                    var10001 = 5;
                    break label30;
                case 2:
                    var10000 = this;
                    var10001 = 6;
                    break label30;
                default:
                    var10000 = this;
                }
            }

            var10001 = 4;
        }

        var10000.ae = var10001;
        if(this.aj < 5) {
            this.a.a(11, -1, false);
        }

    }

    private void aG() {
        try {
            int[] var1;
            label18: {
                var1 = new int[25];
                this.aF();
                this.aE();
                c var10000;
                int var10001;
                switch(this.aj) {
                case 0:
                    b[120] = a("/boss.png");
                    b[121] = a("/bossball.png");
                    var1[1] = 120;
                    this.W = 10752;
                    this.X = 808;
                case 1:
                case 3:
                default:
                    break label18;
                case 2:
                    b[120] = a("/boss.png");
                    b[131] = a("/fire.png");
                    var1[1] = 130;
                    this.W = 6304;
                    this.X = 608;
                    this.S = (6640 - this.W) * 100;
                    var10000 = this;
                    var10001 = (544 - this.X) * 100;
                    break;
                case 4:
                    this.a();
                    b[120] = a("/boss.png");
                    var1[1] = 140;
                    this.S = 0;
                    var10000 = this;
                    var10001 = 0;
                }

                var10000.T = var10001;
            }

            b[55] = a("/masin.png");
            var1[0] = 1;
            var1[2] = var1[16] = z[0] + 256 + 46;
            var1[3] = var1[17] = z[1] + 46;
            var1[4] = 0;
            var1[14] = 0;
            var1[20] = this.c.length - 1;
            this.c[var1[20]] = true;
            this.d[var1[20]] = false;
            this.d(var1);
        } catch (Exception var2) {
            ;
        }
    }

    public final void N() {
        b[120] = null;
        Image[] var10000;
        short var10001;
        switch(this.aj) {
        case 0:
            var10000 = b;
            var10001 = 121;
            break;
        case 2:
            var10000 = b;
            var10001 = 131;
            break;
        default:
            return;
        }

        var10000[var10001] = null;
    }

    private void aH() {
        this.t = true;
        this.aG();
    }

    public final void O() {
        this.u = true;
        this.t = false;
        this.bw = 1;
        if(this.aj != 5) {
            this.e(false);
        }

    }

    public final boolean e(int[] var1) {
        var1[2] = (this.S + this.U) / 100 + this.W;
        var1[3] = (this.T + this.V) / 100 + this.X;
        if(this.aa > 0) {
            --this.aa;
        }

        if(this.ad > 0 && --this.ad == 0) {
            this.ac = 0;
        }

        if(this.ab > 0) {
            --this.ab;
            return true;
        } else {
            if(this.Y > 0) {
                --this.Y;
            }

            ++this.Z;
            return false;
        }
    }

    public final boolean b() {
        label53: {
            int var1 = this.X + (this.T + this.V) / 100;
            switch(this.L) {
            case 100:
                this.M = 3;
                this.Y = 120;
                ++this.L;
            case 101:
                if(this.Q > 0) {
                    --this.Q;
                }

                if(this.Y > 0) {
                    break;
                }

                this.M = 4;
                this.Y = 80;
                ++this.L;
            case 102:
                this.M = 4;
                this.T += 200;
                if(var1 < d[this.aj]) {
                    break;
                }

                this.Y = 40;
                ++this.L;
            case 103:
                if(this.Y > 0) {
                    break;
                }

                this.O();
                this.Y = 24;
                ++this.L;
            case 104:
                this.T -= 80;
                if(this.Y > 0) {
                    break;
                }

                this.Y = 40;
                ++this.L;
            case 105:
                if(this.Y > 0) {
                    break;
                }

                ++this.L;
            case 106:
                this.M = 5;
                this.N = 1;
                this.S += 100;
                this.T -= 50;
                if(this.Y > 0) {
                    break;
                }

                this.Y = 120;
                ++this.L;
            case 107:
                this.M = 6;
                this.N = 1;
                this.S += 500;
                this.T -= 50;
                if(this.Y <= 0) {
                    ++this.L;
                    break label53;
                }
                break;
            case 108:
                break label53;
            }

            return false;
        }

        this.M = -1;
        return true;
    }

    public final void c(int[] var1) {
        var1[2] = this.W + (this.S + this.U) / 100;
        var1[3] = this.X + (this.T + this.V) / 100;
    }

    public final void c(int var1, int var2, int var3, int var4) {
        int var5;
        if((var5 = a(var1, var2, var1, var2, var3, var4)) >= 0) {
            if(var5 == 0) {
                c[1] = var2 - var4 << 8;
                this.a(-1);
            } else {
                label26: {
                    int[] var10000;
                    byte var10001;
                    int var10002;
                    if(var5 == 1) {
                        c[0] = var1 - var3 - 12 << 8;
                        var10000 = c;
                        var10001 = 10;
                        var10002 = 0;
                    } else if(var5 == 2) {
                        c[0] = var1 + var3 + 12 + 1 << 8;
                        var10000 = c;
                        var10001 = 10;
                        var10002 = 0;
                    } else {
                        if(var5 != 3) {
                            break label26;
                        }

                        var10000 = c;
                        var10001 = 1;
                        var10002 = var2 + var4 + 12 + 12 + 1 << 8;
                    }

                    var10000[var10001] = var10002;
                }
            }
        }

        if(this.s && var5 != 0) {
            this.s = false;
        }

    }

    public final boolean c() {
        if(this.L >= 50) {
            return false;
        } else if(g && d) {
            return false;
        } else if(this.aw > 0) {
            return false;
        } else {
            int var1 = (this.S + this.U) / 100 + this.W;
            int var2 = (this.T + this.V) / 100 + this.X - 16;
            int var3 = var1 - a();
            int var4 = var2 - (b() - 16);
            if(var3 * var3 + var4 * var4 < 1024) {
                if(i) {
                    this.aw = 1;
                    return true;
                } else {
                    if(this.q == 0) {
                        this.u();
                    }

                    this.aw = 1;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public static void d(int var0, int var1) {
        int var3 = a();
        int var4 = b() - 16;
        int var2 = var1 >= var4?(var0 <= var3?45:315):(var0 <= var3?135:225);
        c[3] = a(var2) * 8;
        c[5] = b(var2) * 8;
    }

    public final void P() {
        int[] var1 = this.w;
        this.U = 0;
        this.V = a(this.P / 100) * 8;
        this.e(var1);
        if(this.c()) {
            d(var1[2], var1[3]);
            if(this.aa == 0 && this.L < 100) {
                if(--this.ae <= 0) {
                    this.L = 100;
                    return;
                }

                this.ac = 3;
                this.aa = this.ad = 60;
            }
        }

        if(this.L < 100) {
            int var10000 = this.O / 100;

            while(true) {
                int var4 = var10000;
                if(var10000 >= 0) {
                    int var5 = 180 + a(var4) * 90 / 100;
                    int var2 = (this.S + this.U) / 100 + a(var5) * this.Q / 100 + a[120][15][4];
                    int var3 = (this.T + this.V) / 100 + b(var5) * this.Q / 100 + a[120][15][5];
                    if(a(this.W + var2, this.X + var3, 36)) {
                        this.u();
                        this.ac = 1;
                        this.ad = 60;
                    }
                    break;
                }

                var10000 = var4 + 360;
            }
        }

        switch(this.L) {
        case 6:
            this.M = 2;
            this.S -= 100;
            this.O += this.R;
            this.P += 100;
            if(this.S > -3200) {
                return;
            }

            this.S = -3200;
            ++this.L;
        case 7:
            this.M = 0;
            this.N = 1;
            this.P += 100;
            if(this.R < 0) {
                this.O += this.R;
                if(this.O < -9000) {
                    this.R = -this.R;
                    this.O = -9000;
                    return;
                }
                break;
            } else {
                this.O += this.R;
                if(this.O < 9000) {
                    return;
                }

                this.O = 9000;
                this.R = -this.R;
                this.Y = 64;
                ++this.L;
            }
        case 8:
            this.M = 2;
            this.S += 100;
            this.O += this.R;
            this.P += 100;
            if(this.S < 3200) {
                return;
            }

            if(this.Y > 0) {
                return;
            }

            this.S = 3200;
            ++this.L;
        case 9:
            this.M = 0;
            this.N = 0;
            this.P += 100;
            if(this.R <= 0) {
                this.O += this.R;
                if(this.O > -9000) {
                    return;
                }

                this.O = -9000;
                this.R = -this.R;
                this.Y = 64;
                this.L = 6;
                return;
            }

            this.O += this.R;
            if(this.O > 9000) {
                this.R = -this.R;
                this.O = 9000;
                return;
            }
            break;
        case 100:
            this.M = 3;
            this.Y = 40;
            ++this.L;
        case 101:
            if(this.Y > 0) {
                return;
            }

            this.Y = 180;
            ++this.L;
        case 102:
            if(this.Q > 0) {
                --this.Q;
            }

            if(this.Y > 0) {
                return;
            }

            this.M = 4;
            this.Y = 80;
            ++this.L;
        case 103:
            this.M = 4;
            this.T += 200;
            this.c(var1);
            if(var1[3] < d[this.aj]) {
                return;
            }

            this.Y = 40;
            ++this.L;
        case 104:
            if(this.Y > 0) {
                return;
            }

            this.O();
            this.Y = 16;
            ++this.L;
        case 105:
            this.M = 5;
            this.N = 1;
            this.S += 200;
            this.T -= 50;
            if(this.Y > 0) {
                return;
            }

            this.Y = 120;
            ++this.L;
        case 106:
            this.M = 6;
            this.N = 1;
            this.S += 600;
            this.T -= 50;
            if(this.Y > 0) {
                return;
            }

            ++this.L;
        case 107:
            this.M = -1;
            this.w[0] = 0;
            this.N();
            break;
        default:
            this.L = 1;
        case 1:
            this.S = 10000;
            this.T = -12000;
            this.Q = -32;
            this.R = -100;
            this.O = 0;
            this.P = 0;
            this.Y = 80;
            ++this.L;
        case 2:
            this.M = 0;
            this.T += 80;
            if(this.T < 0) {
                return;
            }

            this.T = 0;
            this.Y = 100;
            ++this.L;
        case 3:
            this.M = 2;
            this.S -= 100;
            if(this.Y > 0) {
                return;
            }

            ++this.L;
        case 4:
            this.M = 1;
            if(++this.Q < 96) {
                return;
            }

            this.Y = 32;
            ++this.L;
        case 5:
            this.M = 2;
            this.S -= 50;
            this.O += this.R;
            this.P += 100;
            if(this.S > -3200) {
                return;
            }

            this.S = -3200;
            this.L = 6;
            return;
        }

    }

    public final void Q() {
        int[] var1 = this.w;
        if(!this.e(this.w)) {
            this.P += 100;
            this.U = 0;
            this.V = a(this.P / 100) * 10;
            if(this.L > 99) {
                if(this.b()) {
                    var1[0] = 0;
                }

            } else {
                if(this.c() && this.L > 3) {
                    d(var1[2], var1[3]);
                    if(this.aa == 0 && this.L < 100) {
                        if(--this.ae <= 0) {
                            this.I = 0;
                            this.L = 100;
                            return;
                        }

                        this.ac = 3;
                        this.aa = this.ad = 60;
                        this.ab = 20;
                    }
                }

                if(this.I > 0 && --this.I == 0) {
                    this.I = 150 + c(150);
                    this.a(16, this.W + c(40) - 20, this.X + 130, 0, -300, 0, 1);
                }

                c var10000;
                int var10001;
                switch(this.L) {
                case 4:
                    this.M = 2;
                    this.N = 0;
                    ++this.L;
                case 5:
                    this.M = 2;
                    this.N = 0;
                    this.S -= 150;
                    this.T -= 12;
                    if(this.S > -10400) {
                        return;
                    }

                    this.S = -10400;
                    ++this.L;
                case 6:
                    this.T += 50;
                    if(this.T <= 1200) {
                        return;
                    }

                    this.T = 1200;
                    ++this.L;
                case 7:
                    this.ac = 1;
                    this.ad = 60;
                    this.Y = 48;
                    ++this.L;
                case 8:
                    if(this.Y == 8) {
                        this.a(17, var1[2], var1[3] + 16, 0, 0, 0, 0);
                    }

                    if(this.Y > 0) {
                        return;
                    }

                    this.c(var1);
                    var10000 = this;
                    var10001 = this.L + 1;
                    break;
                case 9:
                    this.M = 2;
                    this.N = 1;
                    ++this.L;
                case 10:
                    this.M = 2;
                    this.N = 1;
                    this.S += 150;
                    this.T -= 12;
                    if(this.S < 10400) {
                        return;
                    }

                    this.S = 10400;
                    ++this.L;
                case 11:
                    this.T += 50;
                    if(this.T <= 1200) {
                        return;
                    }

                    this.T = 1200;
                    ++this.L;
                case 12:
                    this.ac = 1;
                    this.ad = 60;
                    this.Y = 48;
                    ++this.L;
                case 13:
                    if(this.Y == 8) {
                        this.a(17, var1[2], var1[3] + 16, 0, 0, 0, 0);
                    }

                    if(this.Y > 0) {
                        return;
                    }

                    this.c(var1);
                    ++this.L;
                case 14:
                    this.T -= 100;
                    if(this.T > 0) {
                        return;
                    }

                    this.T = 0;
                    var10000 = this;
                    var10001 = 4;
                    break;
                default:
                    this.L = 1;
                case 1:
                    this.ac = 0;
                    this.M = 2;
                    this.S = 31200;
                    this.T = 4800;
                    this.O = 0;
                    this.P = 0;
                    this.I = 0;
                    this.Y = 30;
                    ++this.L;
                case 2:
                    if(this.Y > 0) {
                        return;
                    }

                    ++this.L;
                case 3:
                    this.M = 2;
                    this.S -= 150;
                    this.T -= 20;
                    if(this.S > 10400) {
                        return;
                    }

                    if(this.Y > 0) {
                        return;
                    }

                    this.S = 10400;
                    this.M = 0;
                    this.ac = 1;
                    this.ad = 60;
                    this.Y = 60;
                    this.I = 120;
                    var10000 = this;
                    var10001 = this.L + 1;
                }

                var10000.L = var10001;
            }
        }
    }

    private void aI() {
        this.aT = 0;
        this.ai = 6;
        this.q = true;
    }

    public final void R() {
        if(this.ab) {
            if(this.aY > 0 && this.aT < 4) {
                --this.aY;
            }

            label50: {
                c var10000;
                short var1;
                label49: {
                    boolean var10001;
                    switch(this.aT) {
                    case 2:
                        this.aW = 0;
                        this.aV += 4;
                        if(this.aV < this.ba) {
                            break label50;
                        }

                        this.aV = this.ba;
                        this.aW = 1;
                        var10000 = this;
                        var1 = 3;
                        break label49;
                    case 3:
                        if(this.aY != 0) {
                            if(!this.a[0]) {
                                break label50;
                            }

                            this.aW = 2;
                            this.aX = 0;
                            this.e();
                            var10000 = this;
                            var1 = 4;
                            break label49;
                        }

                        var10000 = this;
                        var10001 = false;
                        break;
                    case 4:
                        ++this.aX;
                        if(this.aX > 8) {
                            ++this.aU;
                        }

                        if(this.aX > 12) {
                            this.aU += 20;
                        }

                        if(this.aX < 45) {
                            break label50;
                        }

                        var10000 = this;
                        var1 = 5;
                        break label49;
                    case 5:
                        this.a.b();
                        var10000 = this;
                        var10001 = true;
                        break;
                    case 999:
                        break label50;
                    default:
                        this.aT = 1;
                    case 1:
                        this.aU = this.aZ;
                        this.aV = 0;
                        this.aY = 604;
                        this.aW = -1;
                        this.aX = -1;
                        b[121] = a("/continue.png");
                        this.a.a(15, -1, false);
                        var10000 = this;
                        var1 = 2;
                        break label49;
                    }

                    var10000.f(var10001);
                    var10000 = this;
                    var1 = 999;
                }

                var10000.aT = var1;
            }

            this.ab = false;
        }
    }

    public final void S() {
        this.ab = true;
        int var1;
        int var2 = (var1 = h >> 1) + 8;
        int var3 = h >> 2;
        int var4 = d >> 1;
        a.setColor(0);
        a.setClip(0, i, d, h);
        a.fillRect(0, i, d, h);
        if(b[121] != null) {
            if(this.aT != 1) {
                label38: {
                    int var5;
                    short var6;
                    short var7;
                    boolean var8;
                    boolean var9;
                    short var10000;
                    int var10001;
                    short var10002;
                    byte var10003;
                    byte var10004;
                    byte var10005;
                    int var10006;
                    int var10007;
                    if(this.aW == 0) {
                        a(121, 0, 0, 48, 32, 0, var4, this.ba);
                        var5 = this.j % 5;
                        var6 = b[var5][0];
                        var7 = b[var5][1];
                        var8 = false;
                        var9 = false;
                        var10000 = 151;
                        var10001 = var6;
                        var10002 = var7;
                        var10003 = 48;
                        var10004 = 24;
                        var10005 = 0;
                        var10006 = var4;
                        var10007 = this.aV;
                    } else {
                        if(this.aW == 1) {
                            var5 = this.j >> 2 & 3;
                            var6 = c[var5][0];
                            var7 = c[var5][1];
                            var8 = false;
                            var9 = false;
                            var10000 = 121;
                            var10001 = var6;
                            var10002 = var7;
                            var10003 = 48;
                            var10004 = 32;
                            var10005 = 0;
                            var10006 = var4;
                        } else {
                            if(this.aW != 2) {
                                break label38;
                            }

                            boolean var10 = false;
                            int var11;
                            byte var12;
                            byte var13;
                            byte var15;
                            if(this.aX < 1) {
                                var11 = 48;
                                var12 = 120;
                                var13 = 48;
                                var15 = 24;
                            } else {
                                var11 = (this.aX < 12?(this.aX >> 1) % 6:6 + (this.aX - 12) % 4) * 40;
                                var12 = 40;
                                var13 = 40;
                                var15 = 40;
                            }

                            byte var14 = var15;
                            a(121, 0, 0, 48, 32, 0, var4, this.ba);
                            var10000 = 151;
                            var10001 = var11;
                            var10002 = var12;
                            var10003 = var13;
                            var10004 = var14;
                            var10005 = 0;
                            var10006 = this.aU;
                        }

                        var10007 = this.ba;
                    }

                    a(var10000, var10001, var10002, var10003, var10004, var10005, var10006, var10007);
                }

                if(this.aW < 2) {
                    a(121, 96, 0, 16, 16, 0, var4 - 16, var2);
                    a(121, 96, 0, 16, 16, 0, var4 + 16, var2);
                    d(var4 - 10, var1, this.aY / 55, 2);
                }

                a(121, 0, 64, 120, 16, 0, var4, var3);
            }
        }
    }

    public final void T() {
        switch(this.aJ) {
        case 0:
            b[154] = a("/emeralds.png");
            this.aK = 0;
            this.aJ = 2;
            return;
        case 2:
            ++this.aK;
            if(this.aK > 720) {
                this.p();
            }
        default:
        }
    }

    public final void U() {
        int var1 = b[154].getWidth() / 6;
        int var2 = a[10].getWidth();
        this.F();
        a.setColor(16777215);
        a.fillRect(0, i, d, h);
        a(a, a[10], 0, 144, var2, var1, a[0], aH, 10, 17, true);

        for(int var4 = 0; var4 < this.l - 1; ++var4) {
            a(a, b[154], var4 * var1, 0, var1, var1, a[0], this.E[var4] >> 16, this.E[var4] & '\uffff', 0, true);
        }

        switch(this.aJ) {
        case 2:
            if((this.j >> 1 & 1) == 0) {
                a(a, b[154], (this.l - 1) * var1, 0, var1, var1, a[0], this.E[this.l - 1] >> 16, this.E[this.l - 1] & '\uffff', 0, true);
            }
        default:
        }
    }

    private static void aJ() {
        b[158] = null;
        b[157] = null;
        b[154] = null;
        b[155] = null;
    }

    public final void V() throws Exception {
        label108: {
            c var10000;
            switch(this.aL) {
            case 0:
                break label108;
            case 1:
                ++this.aN;
                if(this.aN > 480) {
                    this.aL = 2;
                    return;
                }

                if(this.aN > 360) {
                    this.aM = 2;
                    return;
                }

                if(this.aN > 240) {
                    this.aM = 1;
                    return;
                }

                return;
            case 2:
                ++this.aO;
                if(this.aO > 240) {
                    if(this.l == 6) {
                        this.aL = 3;
                        return;
                    }

                    this.aL = 4;
                    this.aS = 3;
                    this.aR = 0;
                    return;
                }

                if(this.aO > 32) {
                    this.aP = 2;
                    return;
                }

                if(this.aO > 16) {
                    this.aP = 1;
                    return;
                }

                return;
            case 3:
                ++this.aQ;
                if(this.aQ <= 240) {
                    return;
                }

                aJ();
                if(this.d()) {
                    this.ai = 9;
                    this.v = true;
                    return;
                }

                var10000 = this;
                break;
            case 4:
                label82: {
                    ++this.aQ;
                    int var10001;
                    switch(this.aS) {
                    case 0:
                        if(this.bQ + (6 - this.l) * 16 <= 0) {
                            this.bQ = 0;
                            this.aQ = 0;
                            ++this.aR;
                            this.aS = 3;
                            break label82;
                        }

                        var10000 = this;
                        var10001 = this.bQ - 2;
                        break;
                    case 1:
                        if(this.aQ <= 24) {
                            break label82;
                        }

                        this.aS = 0;
                        var10000 = this;
                        var10001 = 145;
                        break;
                    case 2:
                        if(this.bQ - (6 - this.l) * 16 >= 180) {
                            this.bQ = 180;
                            this.aQ = 0;
                            ++this.aR;
                            this.aS = 1;
                            break label82;
                        }

                        var10000 = this;
                        var10001 = this.bQ + 2;
                        break;
                    case 3:
                        if(this.aQ > 24) {
                            this.aS = 2;
                            var10000 = this;
                            var10001 = 35;
                            break;
                        }
                    default:
                        break label82;
                    }

                    var10000.bQ = var10001;
                }

                if(this.aR <= 4) {
                    return;
                }

                if(this.d()) {
                    this.ai = 9;
                    this.v = true;
                    return;
                }

                var10000 = this;
                break;
            default:
                this.aL = 0;
                break label108;
            }

            var10000.d(3);
            return;
        }

        a = null;
        a(b);
        a.a(0, 0);
        b[158] = a("/landscape.png");
        if(this.l == 6) {
            b[157] = a("/endegg_b.png");
            this.aL = 1;
            this.aM = 0;
            this.aP = 0;
        } else {
            b[157] = a("/endegg_a.png");
            this.aP = 0;
            this.aL = 2;
        }

        b[155] = a("/ED3.png");
        b[154] = a("/emeralds.png");
        this.aN = 0;
        this.aO = 0;
        this.aQ = 0;
    }

    public final boolean d() {
        for(int var1 = 0; var1 < C.length; ++var1) {
            if(C[var1] < this.w) {
                return true;
            }
        }

        return false;
    }

    public final void W() {
        this.o(3);
        a.setClip(0, 0, c, b);
        a.setColor(0);
        a.fillRect(0, 0, c, b);
        if(this.aL == 2 || this.aL == 1) {
            this.a(false, false);
        }

        this.F();
        int var1;
        if(g < c) {
            var1 = c - g >> 1;
            a.translate(var1, 0);
        }

        label85: {
            int var2;
            int var3;
            int var4;
            int var5;
            Graphics var6;
            Image var10001;
            int var10002;
            byte var10003;
            short var10004;
            byte var10005;
            int var10006;
            int var10007;
            int var10008;
            byte var10009;
            switch(this.aL) {
            case 1:
                a.setClip(0, i, c, h);
                a.drawImage(b[158], 0, i, 20);
                switch(this.aM) {
                case 0:
                    var1 = this.aN >> 1 & 1;
                    a(a, b[157], var1 * 32, 96, 32, 40, a[0], aH, i + h - 10, 33, false);
                    break label85;
                case 1:
                    a(a, b[157], 64, 96, 32, 40, a[0], aH, i + h - 10, 33, false);
                    if((this.aN >> 1 & 1) == 0) {
                        for(var2 = 0; var2 < 6; ++var2) {
                            var4 = (var3 = Math.min(60, this.aN - 240)) * b(var2 * 36) / 100;
                            var5 = var3 * a(var2 * 36) / 100;
                            a(a, b[154], var2 * 16, 0, 16, 16, a[0], aH + var4, i + h - 22 - (var3 >> 1) - var5, 3, false);
                        }
                    }
                    break label85;
                case 2:
                    var1 = 3 + (this.aN >> 5 & 1);
                    a(a, b[157], var1 * 32, 96, 32, 40, a[0], aH, i + h - 10, 33, false);

                    for(var2 = 0; var2 < 6; ++var2) {
                        var4 = 60 * b(var2 * 36) / 100;
                        var5 = 60 * a(var2 * 36) / 100;
                        a(a, b[154], var2 * 16, 0, 16, 16, a[0], aH + var4, i + h - 22 - 30 - var5, 3, false);
                    }
                default:
                    break label85;
                }
            case 2:
                byte var7;
                short var8;
                label51: {
                    a.setClip(0, i, c, h);
                    a.drawImage(b[158], 0, i, 20);
                    switch(this.aP) {
                    case 0:
                        var6 = a;
                        var10001 = b[155];
                        var7 = 0;
                        var10003 = 0;
                        var10004 = 32;
                        var8 = 40;
                        var10006 = a[0];
                        var10007 = aH;
                        var10008 = i + h;
                        var10009 = 10;
                        break label51;
                    case 1:
                        var6 = a;
                        var10001 = b[155];
                        var7 = 0;
                        var10003 = 40;
                        var10004 = 46;
                        var8 = 71;
                        break;
                    case 2:
                        var6 = a;
                        var10001 = b[155];
                        var7 = 48;
                        var10003 = 0;
                        var10004 = 176;
                        var8 = 136;
                        break;
                    default:
                        break label85;
                    }

                    var10006 = a[0];
                    var10007 = aH;
                    var10008 = i + h;
                    var10009 = 20;
                }

                a(var6, var10001, var7, var10003, var10004, var8, var10006, var10007, var10008 - var10009, 33, false);
                break label85;
            case 3:
                a.setColor(0);
                a.fillRect(0, i, c, h);
                var1 = this.aQ / 15 % 3;
                var6 = a;
                var10001 = b[157];
                var10002 = var1 * 60;
                var10003 = 0;
                var10004 = 60;
                var10005 = 96;
                var10006 = a[0];
                var10007 = aH;
                var10008 = aI;
                var10009 = 3;
                break;
            case 4:
                label80: {
                    a.setColor(0);
                    a.fillRect(0, i, c, h);
                    int var10000;
                    switch(this.aS) {
                    case 0:
                        a(a, b[157], 128, 0, 128, 112, a[0], aH, aI, 3, false);
                        var4 = 0;

                        while(true) {
                            if(var4 >= 6 - this.l) {
                                break label80;
                            }

                            var5 = Math.max(Math.min(145, this.bQ + var4 * 16), 0);
                            var2 = aH + 55 * b(var5) / 100;
                            var3 = aI - 10 - 55 * a(var5) / 100;
                            a(a, b[154], (5 - var4) * 16, 0, 16, 16, a[0], var2, var3, 3, false);
                            ++var4;
                        }
                    case 1:
                        var10000 = aH + 55;
                        break;
                    case 2:
                        a(a, b[157], 128, 0, 128, 112, a[4], aH, aI, 3, false);
                        var4 = 0;

                        while(true) {
                            if(var4 >= 6 - this.l) {
                                break label80;
                            }

                            var5 = Math.min(Math.max(35, this.bQ - var4 * 16), 180);
                            var2 = aH + 55 * b(var5) / 100;
                            var3 = aI - 10 - 55 * a(var5) / 100;
                            a(a, b[154], (5 - var4) * 16, 0, 16, 16, a[0], var2, var3, 3, false);
                            ++var4;
                        }
                    case 3:
                        var10000 = aH - 55;
                        break;
                    default:
                        break label80;
                    }

                    var2 = var10000;
                    var3 = aI - 20;
                    a(a, b[157], 0, 0, 128, 112, a[0], aH, aI, 3, false);
                    a(a, b[154], 0, 0, 16, 16, a[0], var2, var3, 3, false);
                }

                var6 = a;
                var10001 = b[157];
                var10002 = 0;
                var10003 = 116;
                var10004 = 240;
                var10005 = 36;
                var10006 = a[0];
                var10007 = aH;
                var10008 = i + h;
                var10009 = 33;
                break;
            default:
                break label85;
            }

            a(var6, var10001, var10002, var10003, var10004, var10005, var10006, var10007, var10008, var10009, false);
        }

        if(g < c) {
            a.translate(-(c - g >> 1), 0);
        }

    }

    public final void X() {
        if(this.a[4]) {
            ++this.bR;
            if(this.bR > 2) {
                this.bR = 0;
                return;
            }
        } else if(this.a[3]) {
            --this.bR;
            if(this.bR < 0) {
                this.bR = 2;
                return;
            }
        } else if(this.a[2]) {
            --this.L[this.bR];
            if(this.L[this.bR] < 0) {
                this.L[this.bR] = a.length - 1;
                return;
            }
        } else if(this.a[1]) {
            ++this.L[this.bR];
            if(this.L[this.bR] >= a.length) {
                this.L[this.bR] = 0;
                return;
            }
        } else if(this.a[0]) {
            this.aK();
        }

    }

    private void aK() {
        int var1;
        label26:
        for(var1 = 0; var1 < C.length; ++var1) {
            if(C[var1] < this.w) {
                int var2 = C.length - 1;

                while(true) {
                    if(var2 <= var1) {
                        break label26;
                    }

                    C[var2] = C[var2 - 1];
                    D[var2] = D[var2 - 1];
                    --var2;
                }
            }
        }

        if(var1 < C.length) {
            C[var1] = this.w;
            D[var1] = this.m[0];
            d[var1] = new String(new char[]{a[this.L[0]], a[this.L[1]], a[this.L[2]]});
            this.ae();
        }

        this.ai = 1;
        this.d(5);
        this.o(1);
        this.w = 0;
    }

    public final void Y() { // Name entry for the leaderboard
        label25: {
            this.F();
            a.setColor(0);
            a.fillRect(0, i, d, h);
            c var10000;
            String var10001;
            switch(this.m[2]) {
            case 0: // English
                var10000 = this;
                var10001 = "ENTER NAME";
                break;
            case 1: // German
                var10000 = this;
                var10001 = "NAMEN EINGEBEN";
                break;
            case 2: // French
                var10000 = this;
                var10001 = "ENTREZ VOTRE NOM";
                break;
            case 3: // Spanish
                var10000 = this;
                var10001 = "INTRODUCE TU NOMBRE";
                break;
            case 4: // Italian
                var10000 = this;
                var10001 = "INSERISCI NOME";
                break;
            default:
                break label25;
            }

            var10000.a(var10001, false);
        }

        a.setColor(16777215);
        int var1 = c / (this.L.length + 1);

        int var2;
        for(var2 = 0; var2 < this.L.length; ++var2) {
            a.drawString(String.valueOf(a[this.L[var2]]), (var2 + 1) * var1, aI + (a.getFont().getHeight() >> 1), 65);
        }

        a.setColor(16386570);
        var2 = a.getFont().getHeight() * 3 >> 1;
        a.drawRect((this.bR + 1) * var1 - (var2 >> 1), aI - (var2 >> 1), var2, var2);
    }

    public final void Z() {
        this.F();
        a.setColor(0);
        a.fillRect(0, i, d, h);
        this.a(this.b[87], false);
        a.setColor(16777215);
        String var1 = this.a();
        a.drawString(var1, c >> 1, i + (h >> 1), 65);
    }

    public final void aa() {
        this.F();
        a.setColor(0);
        a.fillRect(0, i, d, h);
        this.a(this.b[86], false);
        a.setColor(16777215);
        int var1 = a.charWidth('X') + 2;

        for(int var2 = 0; var2 < 8; ++var2) {
            int var3 = (c >> 1) + (var2 - 4) * var1 + 2;
            a.drawChar(a[this.M[var2]], var3, i + (h >> 1), 36);
        }

        a.setColor(16386570);
        a.drawRect((c >> 1) + (this.bS - 4) * var1, i + (h >> 1) - a, var1, a);
        a.setColor(16777215);
        a.drawString(this.b, c >> 1, i, 17);
    }

    public final int e(int var1) {
        try {
            switch(var1) {
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
                switch(this.getGameAction(var1)) {
                case 1:
                    return 14;
                case 2:
                    return 16;
                case 3:
                case 4:
                case 7:
                default:
                    break;
                case 5:
                    return 17;
                case 6:
                    return 15;
                case 8:
                    return 18;
                }
            }
        } catch (Exception var3) {
            ;
        }

        return 19;
    }

    static {
        a = a.getHeight();
        b = 0;
        c = 0;
        d = c;
        e = b;
        g = c;
        h = b;
        a = new Image[20];
        b = new Image[160];
        a = new Random();
        a = new int[]{0, 5, 3, 6, 2, 7, 1, 4};
        e = new String[]{"../Music/GHZ Loop", "../Music/LZ Loop", "../Music/MZ Loop", "../Music/SLZ Loop", "../Music/SYZ Loop", "../Music/SBZ", "../Music/Invincibility", "../Music/1-Up", "../Music/Special Stage", "../Music/Title Screen", "../Music/Ending Sequence", "../Music/Boss Theme", "../Music/Final Zone Loop", "../Music/Act Clear", "../Music/Game Over", "../Music/Continue", "../Music/Credits", "../Music/Drowning", "../Music/Emerald Jingle", "../Music/Tally SFX", "../Misc/SEGA Chant", "../Music/GHZ Intro", "../Music/MZ Intro", "../Music/SYZ Intro"};
        b = new short[][]{{0, 120, 0}, {48, 120, 0}, {96, 120, 0}, {96, 120, 1}, {48, 120, 1}};
        c = new short[][]{{48, 0}, {0, 32}, {48, 32}, {0, 32}};
        a = new int[][]{{0, 0, 112, 16}, {112, 0, 56, 16}, {0, 16, 80, 16}, {80, 16, 48, 16}, {128, 16, 8, 16}, {136, 16, 16, 16}, {152, 16, 16, 16}, {0, 32, 128, 16}, {128, 32, 24, 8}, {0, 48, 128, 16}, {128, 40, 40, 40}, {0, 64, 120, 16}, {0, 80, 104, 16}, {104, 80, 40, 40}, {0, 96, 104, 16}, {0, 112, 72, 16}, {0, 128, 152, 16}, {0, 144, 176, 16}};
        b = new int[2];
        c = new int[16];
        b = new int[][]{{80, 944, 80, 252, 80, 944, 128, 168}, {96, 108, 80, 236, 80, 748, 2944, 0}, {48, 614, 48, 614, 48, 358, 128, 168}, {64, 716, 64, 332, 64, 332, 128, 168}, {48, 957, 48, 445, 48, 236, 128, 168}, {48, 1164, 48, 1868, 8512, 1452, 128, 168, 304, 168}, {1568, 363, 3808, 364, 128, 168, 128, 168}};
        a = new byte[]{1, 2, 3, 2};
        d = new int[]{912, 224, 656, 672, 1360, -16};
        e = new int[]{32, 32, 32, 32, 32, 32, 32, 32, 33, 33, 34, 34, 35, 35, 36, 36, 37, 37, 38, 38, 39, 39, 40, 40, 41, 41, 42, 42, 43, 43, 44, 44, 45, 45, 46, 46, 47, 47, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48};
        g = new int[]{1296, 3632, 752, 4880};
        h = new int[]{1168, 1104, 1680, 1360};
        i = new int[]{1263, 3598, 785, 4845};
        j = new int[]{1216, 1136, 1728, 1392};
        k = new int[]{-1, -1, 1, -1};
        l = new int[]{4, 7, 5, 6, 0, 3, 2, 1};
        m = new int[]{0, 5, 8, 17, 20, 28, 32, 34};
        int[] var10000 = new int[]{16, 16, 8, 8, 8};
        var10000 = new int[]{32, 32, 24, 24, 16};
        var10000 = new int[]{32, 32, 16, 24, 16};
        n = new int[]{0, 10000, 1000, 100};
        o = new int[]{-8, -16, -12, 12, 16, 8};
        p = new int[]{22, 25, 13, 22, 25, 13};
        q = new int[]{2, 3, 2, 3, 2, 3, 2, 3, 2, 2, 3, 0, 1, 0, 1};
        int[][] var0 = new int[][]{{-1, 1}, {1, -1}};
        var10000 = new int[]{40, 40, 16, 16, 0};
        var0 = new int[][]{{0, 4}, {4, 0}, {2, 6}, {0, 0}};
        var0 = new int[][]{{2, 6}, {2, 6}, {4, 0}, {2, 6}};
        r = new int[]{8, 0, 4, 3, 2, 1, 0};
        s = new int[]{a[0], a[1], a[7], a[4]};
        t = new int[]{8, 0, 40, 24, 10, 40, 30, 24, 41, 6};
        u = new int[]{8, 16, 8, 30, 23, 24, 18, 16, 18, 8};
        v = new int[]{0, 32, 64, 96, 128, 168, 208};
        d = new int[][]{{44, 44, 44, 44, 44, 44, 44, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 44, 44, 44, 44, 44, 44, 44}, {52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52}, {37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53}};
        d = new short[][]{{0, 0}, {16, 0}, {0, 16}, {16, 16}};
        short[][] var1 = new short[][]{{88, 56, 16, 16}, {64, 56, 24, 24}, {88, 72, 16, 16}, {88, 88, 16, 16}, {64, 80, 24, 24}};
        e = new short[][]{{-250, -360}, {-80, -100}, {-160, -250}, {-200, -300}, {-120, -225}, {-150, -250}, {-100, -165}};
        b = new byte[][]{{28, 31}, {32, 29}, {33, 29}, {28, 34}, {34, 30}, {31, 30}, {33, 33}, {31, 31}};
        f = new short[][]{{9312, 7776}, {6736, 4176, 8208}, {6224, 6224}, {8288, 8032}, {8800, 10336}, {8544, 7648}};
        x = new int[]{0, 2, 7, 12, 11, 9, 1};
        f = new int[][]{{0, 0, 0}, {2, 2, 2}, {4, 4, 4}, {1, 1, 1}, {3, 3, 3}, {5, 5, 1}, {5, 0}};
        g = new int[][]{{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 3}, {3, 3}};
        y = new int[2];
        z = new int[2];
        c = new int[][][]{{{4, 0, 9407, 0, 768, 96}, {4, 0, 7871, 0, 768, 96}, {4, 0, 10592, 0, 768, 96}, {4, 0, 10943, 0, 768, 96}}, new int[0][], {{4, 0, 6079, 0, 464, 96}, {4, 0, 6079, 0, 1312, 96}, {4, 0, 6144, 0, 1824, 96}, {4, 0, 5823, 0, 1824, 96}}, new int[0][], {{4, 0, 8896, 0, 1056, 96}, {4, 0, 10432, 0, 1312, 96}, {4, 0, 11264, 0, 1568, 96}, {4, 0, 11968, 0, 1568, 96}}, new int[0][]};
        z = true;
        A = true;
        B = true;
        A = new int[]{0, 175, 349, 523, 698, 872, 1045, 1219, 1392, 1564, 1736, 1908, 2079, 2249, 2419, 2588, 2756, 2924, 3090, 3256, 3420, 3584, 3746, 3907, 4067, 4226, 4384, 4540, 4695, 4848, 5000, 5150, 5299, 5446, 5592, 5736, 5878, 6018, 6156, 6293, 6428, 6560, 6691, 6820, 6946, 7071, 7193, 7313, 7431, 7547, 7660, 7771, 7880, 7986, 8090, 8191, 8290, 8387, 8480, 8572, 8660, 8746, 8829, 8910, 8988, 9063, 9135, 9205, 9272, 9336, 9397, 9455, 9510, 9563, 9613, 9659, 9703, 9744, 9781, 9816, 9848, 9877, 9903, 9925, 9945, 9962, 9976, 9986, 9994, 9998, 10000};
        var10000 = new int[]{0, 0, 0, 2};
        var10000 = new int[]{0, 16, 32, 16};
        l = new int[][]{{0, 0, 190, 109}, {0, 159, 49, 57}, {0, 109, 56, 50}, {107, 188, 53, 36}, {62, 109, 60, 55}, {50, 164, 55, 57}, {127, 110, 35, 57}, {163, 109, 27, 58}, {127, 110, 35, 57}, {135, 167, 26, 21}, {163, 167, 27, 57}, {163, 109, 27, 58}, {0, 224, 190, 56}};
        a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1', '@', '?', '!', ',', '.', ' '};
    }
}
