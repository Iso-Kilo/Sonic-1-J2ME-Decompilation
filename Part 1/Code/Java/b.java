import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public final class b extends c {
    public long a;

    public b(MIDlet var1, int var2) {
        super(var1, var2);
    }

    private void f(boolean var1) {
        int var2 = 0;

        for(int var3 = super.e.length - 1; var3 >= 0 && var2 < super.af; --var3) {
            if(super.e[var3][24] == 1) {
                ++var2;
                int var4 = super.e[var3][1];
                if(var1 == (var4 == 45 || var4 == 26 || var4 == 53 || var4 == 10 || var4 == 88 && super.e[var3][4] == 127)) {
                    super.w = super.e[var3];
                    this.e(super.w[1]);
                }
            }
        }

    }

    private void ab() {
        if(c.g < c.c) {
            int var1 = c.c - c.g >> 1;
            c.a.translate(var1, 0);
        }

        c.a.setClip(0, c.i, c.g, c.h);
        a.a(c.a, c.z[0], c.z[1], true);
        this.b(c.a, super.aj == 1 || super.aj == 5);
        this.f(false);
        this.M();
        if(!c.j) {
            this.w();
        }

        this.y();
        this.a(c.a, super.aj == 1 || super.aj == 5);
        this.f(true);
        if(c.j) {
            this.w();
        }

        if(c.g < c.c) {
            c.a.translate(-(c.c - c.g >> 1), 0);
        }

        this.l();
        c.a.setClip(0, 0, c.c, c.b);
    }

    private void ac() {
        switch(super.ai) {
        case 1:
            this.D();
            break;
        case 2:
            if(!super.q && !super.p) {
                if(super.j % 10 == 0) {
                    c.b(0, 0, c.d, c.i);
                    c.b(0, c.i + c.h, c.d, c.i);
                    this.c(true);
                    this.b(true);
                }
            } else {
                c.b(0, 0, c.c, c.b);
                c.E();
                c.z = true;
                c.B = true;
                c.A = true;
                super.q = false;
            }

            this.ab();
            ++super.j;
            break;
        case 3:
            this.F();
            c.a.setColor(0);
            c.a.fillRect(0, c.i, c.d, c.h);
            super.m = c.d + c.a[c.x[super.al]][2] >> 1;
            int[] var3 = new int[]{82, 100, 108, 116, 100, 84};
            c.a(c.a, c.a[10], c.a[10][0], c.a[10][1], c.a[10][2], c.a[10][3], c.a[0], super.m - c.a[10][2] - 1, var3[0], 20, false);
            Graphics var10000;
            Image var10001;
            int var10002;
            int var10003;
            int var10004;
            int var10005;
            int var10006;
            int var10007;
            int var10008;
            byte var10009;
            if(super.al == 6) {
                var10000 = c.a;
                var10001 = c.a[10];
                var10002 = c.a[3][0];
                var10003 = c.a[3][1];
                var10004 = c.a[3][2];
                var10005 = c.a[3][3];
                var10006 = c.a[0];
                var10007 = super.m - 48;
                var10008 = var3[1];
                var10009 = 20;
            } else {
                c.a(c.a, c.a[10], c.a[4 + super.am][0], c.a[4 + super.am][1], c.a[4 + super.am][2], c.a[4 + super.am][3], c.a[0], super.m - c.a[10][2] + 25, var3[2], 20, false);
                c.a(c.a, c.a[10], c.a[8][0], c.a[8][1], c.a[8][2], c.a[8][3], c.a[0], super.m - c.a[10][2] + 1, var3[3], 20, false);
                var10000 = c.a;
                var10001 = c.a[10];
                var10002 = c.a[3][0];
                var10003 = c.a[3][1];
                var10004 = c.a[3][2];
                var10005 = c.a[3][3];
                var10006 = c.a[0];
                var10007 = super.m - (c.a[10][2] >> 1);
                var10008 = var3[4];
                var10009 = 24;
            }

            c.a(var10000, var10001, var10002, var10003, var10004, var10005, var10006, var10007, var10008, var10009, false);
            c.a(c.a, c.a[10], c.a[c.x[super.al]][0], c.a[c.x[super.al]][1], c.a[c.x[super.al]][2], c.a[c.x[super.al]][3], c.a[0], super.m, var3[5], 24, false);
            c.a.drawImage(c.a[4], c.d - 10, c.f + (c.e >> 1), 20);
            c.a.drawImage(c.a[5], 10, c.f + (c.e >> 1), 24);
            break;
        case 4:
            this.F();
            c.E();
            super.q = false;
            c.B = true;
            c.a.setColor(0);
            c.a.fillRect(0, c.i, c.d, c.h);
        case 5:
        default:
            break;
        case 6:
            super.a[0] = "";
            this.F();
            ++super.j;
            this.S();
            break;
        case 7:
            ++super.j;
            this.U();
            break;
        case 8:
            this.W();
            break;
        case 9:
            this.Y();
            break;
        case 10:
        case 11:
            c.b(0, 0, c.c, c.b);
            this.ab();
            c.a.setColor(0);

            for(int var1 = 0; var1 < c.h; var1 += 2) {
                c.a.fillRect(0, var1 + c.i, c.d, 1);
            }

            if(super.ai == 11) {
                this.a(super.b[85], false);
                this.a(super.b[24], 2, 0, super.an == 0);
                this.a(super.b[25], 2, 1, super.an == 1);
            } else {
                this.a(super.b[60], false);
                this.a(super.b[70], 2, 0, super.an == 0);
                this.a(super.b[71], 2, 1, super.an == 1);
            }

            super.q = true;
        }

        if(super.ai == 4 || super.ai == 2) {
            this.ad();
        }

        if(super.y) {
            c.E();
            super.y = false;
        }

        if(super.ai != 2 || super.j % 5 == 0) {
            this.k();
        }

    }

    private void ad() {
        int var1;
        int var2;
        if(super.w) {
            c.a.setColor(0);

            for(var1 = 0; var1 < 10; ++var1) {
                if((var2 = 24 - (super.ap - var1) * 4) >= 0) {
                    if(var2 > 24) {
                        var2 = 24;
                    }

                    c.a.fillRect(var1 * 24 + (24 - var2), 0, var2, 240);
                }
            }

            if(22 < super.ap) {
                super.ap = 0;
                super.w = false;
            }

            ++super.ap;
        }

        this.J();
        if(super.x) {
            c.a.setColor(0);

            for(var1 = 0; var1 < 10; ++var1) {
                if(super.ap - var1 > 0) {
                    if((var2 = super.ap - var1 << 2) > 24) {
                        var2 = 24;
                    }

                    c.a.fillRect(var1 * 24, c.f, var2, c.e);
                }
            }

            if(22 < super.ap) {
                super.ap = 0;
                super.x = false;
            }

            ++super.ap;
        }

        if(super.a) {
            this.a(super.b[49], c.d >> 1, c.i + c.h - c.a - 2, 16777215, 658170);
        }

    }

    public final void paint(Graphics var1) {
        try {
            c.a = var1;
            this.ac();
            if(super.G) {
                Font var2 = var1.getFont();
                String var3;
                int var4;
                if(super.f[1]) {
                    var3 = (var4 = super.B[super.aD]) != 0?String.valueOf(1000 / var4):"??";
                    var3 = var3 + " fps";
                    var1.setColor(0);
                    var1.fillRect(0, 0, var2.stringWidth("XXXXXX"), c.a);
                    var1.setColor(16777215);
                    var1.drawString(var3, 0, 0, 20);
                }

                if(super.f[3]) {
                    var3 = Integer.toHexString(c.z[0]).toUpperCase() + ", " + Integer.toHexString(c.z[1]).toUpperCase();
                    var4 = var2.stringWidth(var3);
                    var1.setColor(0);
                    var1.fillRect(c.d - var4, 0, var4, c.a);
                    var1.setColor(16777215);
                    var1.drawString(var3, c.d, 0, 24);
                }
            }

            c.a = null;
        } catch (Throwable var5) {
            ;
        }
    }

    private void ae() {
        super.G = 0;
        int var2 = 0;

        for(int var3 = 0; var3 < super.e.length && var2 < super.af; ++var3) {
            if(super.e[var3][24] == 1) {
                ++var2;
                super.w = super.e[var3];
                this.ag();
                if(super.w[1] != 17 || super.w[4] != 55) {
                    label76: {
                        boolean[] var10000;
                        int[] var10001;
                        byte var10002;
                        if(super.w[0] <= 0 && super.w[21] == 0) {
                            super.d[super.w[20]] = true;
                            var10000 = super.c;
                            var10001 = super.w;
                            var10002 = 20;
                        } else {
                            if(!super.c[super.w[20]] && super.w[1] < 120 && super.w[1] != 42 && super.w[1] != 43 && super.w[1] != 36) {
                                break label76;
                            }

                            if(!this.a(super.w) || super.w[21] != 0 || super.w[1] >= 120 || super.w[1] == 42 || super.w[1] == 43 || super.w[1] == 36) {
                                continue;
                            }

                            super.c[super.w[20]] = false;
                            var10000 = super.c;
                            var10001 = super.w;
                            var10002 = 22;
                        }

                        var10000[var10001[var10002]] = false;
                    }

                    this.b(var3);
                }
            }
        }

        super.af += super.G;
    }

    private void af() throws Exception {
        if(this.a()) {
            this.e();
        } else {
            switch(super.ai) {
            case 1:
                this.C();
                break;
            case 2:
                super.u = super.v;
                if(super.p) {
                    super.v = true;
                    super.ao = 10;
                    c.o = true;
                }

                c.b[0] = c.a();
                c.b[1] = c.b() - 1;
                super.as = 0;
                super.at = 0;
                super.F = false;
                super.E = false;
                super.D = false;
                this.r();
                if(!c.j) {
                    this.z();
                    this.ae();
                }

                if(!c.j) {
                    this.L();
                } else {
                    this.K();
                }

                if(super.D) {
                    this.u();
                }

                this.x();
                this.A();
                --super.q;
                --super.s;
                if(super.q == 0) {
                    this.e(false);
                }

                if(super.s <= 0) {
                    super.n = 1536;
                    super.o = 12;
                }

                this.t();
                this.H();
                ++super.k;
                if(super.k % 55 == 0 && !c.o) {
                    super.x = (super.x + 1) % 60;
                    if(super.x == 0) {
                        if(super.y == 9) {
                            super.x = 59;
                            this.v();
                        } else {
                            ++super.y;
                        }
                    }
                }

                if(c.n) {
                    super.x = 0;
                    super.y = 0;
                }

                if(!c.d && super.v >= 100 && super.u < 100) {
                    super.a.a(7, 1, false);
                    ++super.A;
                }

                if(!c.d && super.v >= 200 && super.u < 200) {
                    super.a.a(7, 1, false);
                    ++super.A;
                }

                if(!c.d && super.v >= 300 && super.u < 300) {
                    super.a.a(7, 1, false);
                    ++super.A;
                }
                break;
            case 3:
                b var10000;
                if(super.a[0]) {
                    super.aj = c.f[super.al][super.am];
                    super.ak = c.g[super.al][super.am];
                    super.A = 3;
                    int var1;
                    if(super.G) {
                        var10000 = this;
                        var1 = super.ay;
                    } else {
                        var10000 = this;
                        var1 = 0;
                    }

                    var10000.l = var1;
                    super.w = 0;
                    super.r = true;
                    this.p();
                } else {
                    label151: {
                        boolean var10001;
                        if(super.a[4]) {
                            this.e();
                            super.am = (super.am + 1) % 3;
                            if(super.am != 0) {
                                break label151;
                            }

                            var10000 = this;
                            var10001 = true;
                        } else {
                            if(!super.a[3]) {
                                break label151;
                            }

                            this.e();
                            super.am = (super.am + 2) % 3;
                            if(super.am != 2) {
                                break label151;
                            }

                            var10000 = this;
                            var10001 = false;
                        }

                        var10000.a(var10001);
                    }
                }

                if(super.al == 6) {
                    super.am = 0;
                }
            case 4:
            case 5:
            default:
                break;
            case 6:
                ++super.k;
                this.R();
                break;
            case 7:
                this.T();
                break;
            case 8:
                this.V();
                break;
            case 9:
                if(super.I && System.currentTimeMillis() - this.a > 250L) {
                    this.a = System.currentTimeMillis();
                    this.X();
                }
                break;
            case 10:
                super.au = 0;
                super.b = (byte)((super.b + 1) % 24);
                if(super.a[0]) {
                    this.h();
                    if(super.an == 0) {
                        super.ai = 2;
                        super.q = true;
                        super.v = true;
                        super.ao = 10;
                        super.y = true;
                        c.B = true;
                        this.e(false);
                        this.g();
                    } else {
                        super.ai = 11;
                    }
                } else if(super.a[1] || super.a[2]) {
                    super.an = super.an + 1 & 1;
                }

                this.e();
                break;
            case 11:
                super.au = 0;
                super.b = (byte)((super.b + 1) % 24);
                if(super.a[0]) {
                    if(super.an == 0) {
                        this.d(3);
                    } else {
                        this.e();
                        super.ai = 10;
                        super.v = true;
                        super.ao = 10;
                        super.y = true;
                    }
                } else if(super.a[1]) {
                    this.e();
                    super.an = super.an + 1 & 1;
                } else if(super.a[2]) {
                    this.e();
                    super.an = super.an + 1 & 1;
                }
            }

            this.I();
        }
    }

    public final void run() {
        try {
            super.b = System.currentTimeMillis();
            this.f();
            int var1 = 0;

            while(true) {
                while(true) {
                    super.c = System.currentTimeMillis();
                    this.af();
                    ++super.aA;
                    super.d = (long)(super.aA * 18);
                    super.e = System.currentTimeMillis() - super.b;
                    if((long)super.aC >= super.d - super.e && var1 <= 7) {
                        ++var1;
                        super.I = false;
                    } else {
                        long var2 = System.currentTimeMillis();
                        var1 = 0;
                        this.j();
                        this.repaint();
                        this.serviceRepaints();
                        ++super.aB;
                        super.B[super.aD++] = (int)(System.currentTimeMillis() - var2);
                        if(super.aD == super.B.length) {
                            super.aD = 0;
                        }

                        super.aC = 0;

                        for(int var4 = 0; var4 < super.B.length; ++var4) {
                            super.aC += super.B[var4];
                        }

                        super.aC /= super.B.length;
                        Thread.yield();
                        long var9;
                        if((var9 = System.currentTimeMillis()) - super.c < 18L) {
                            try {
                                Thread.sleep(18L - (var9 - super.c));
                            } catch (Exception var7) {
                                ;
                            }
                        }

                        super.I = true;
                    }
                }
            }
        } catch (Throwable var8) {
            ;
        }
    }

    private void ag() {
        try {
            switch(super.w[1]) {
            case 0:
            case 1:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                if(super.w[5] != 0 || a(super.w[2], super.w[3], 8, -1)) {
                    this.ai();
                    return;
                }
                break;
            case 2:
                if(a(super.w[2], super.w[3], 16, 16)) {
                    this.bC();
                    return;
                }
                break;
            case 3:
                this.aj();
                return;
            case 4:
                this.al();
                return;
            case 5:
                this.ak();
                return;
            case 6:
                this.am();
                return;
            case 7:
                this.an();
                return;
            case 8:
                this.ao();
                return;
            case 9:
                this.ap();
                return;
            case 10:
                this.aq();
                return;
            case 11:
                this.ar();
                return;
            case 12:
            case 38:
            case 61:
            case 89:
                return;
            case 13:
                this.at();
                return;
            case 14:
                this.au();
                return;
            case 15:
                this.av();
                return;
            case 16:
                this.aw();
                return;
            case 17:
                this.ax();
                return;
            case 18:
                if(a(super.w[2], super.w[3], 16, 32)) {
                    this.ay();
                    return;
                }
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 50:
            case 51:
            case 52:
            case 53:
            case 72:
            case 73:
            case 74:
            case 76:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 87:
            case 88:
            case 91:
            case 92:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            default:
                break;
            case 20:
                if(a(super.w[2], super.w[3], 16, -1)) {
                    this.az();
                    return;
                }
                break;
            case 27:
                this.aA();
                return;
            case 36:
                this.aB();
                return;
            case 37:
                if(a(super.w[2], super.w[3], 8, 32)) {
                    this.aC();
                    return;
                }
                break;
            case 39:
                this.bD();
                return;
            case 40:
                this.bE();
                return;
            case 41:
                this.bF();
                return;
            case 42:
                if(a(super.w[2], super.w[3], 16, 16)) {
                    this.aD();
                    return;
                }
                break;
            case 43:
                if(super.w[4] < 10 && a(super.w[2], super.w[3], 16, 16)) {
                    this.aD();
                    return;
                }
                break;
            case 44:
                this.aE();
                return;
            case 45:
                if(a(super.w[2], super.w[3], 32, 32)) {
                    this.aF();
                    return;
                }
                break;
            case 46:
                if(a(super.w[2], super.w[3], 32, 32)) {
                    this.aG();
                    return;
                }
                break;
            case 47:
                if(super.l < 6) {
                    this.n();
                    return;
                }
                break;
            case 48:
                this.aH();
                return;
            case 49:
                this.bG();
                return;
            case 54:
                this.as();
                return;
            case 55:
                this.aI();
                return;
            case 56:
                if(a(super.w[2], super.w[3], 32, 32)) {
                    this.aJ();
                    return;
                }
                break;
            case 57:
                this.bH();
                return;
            case 58:
                if(a(super.w[2], super.w[3], 24, 24)) {
                    this.aK();
                    return;
                }
                break;
            case 59:
                this.aL();
                return;
            case 60:
                this.aM();
                return;
            case 62:
                this.aN();
                return;
            case 70:
                this.bI();
                return;
            case 71:
                this.bJ();
                return;
            case 75:
                this.aO();
                return;
            case 77:
                this.aP();
                return;
            case 78:
                this.bK();
                return;
            case 79:
                this.aQ();
                return;
            case 86:
                this.bL();
                return;
            case 90:
                this.aR();
                return;
            case 93:
                this.bN();
                return;
            case 120:
                this.P();
                return;
            case 130:
                this.Q();
                return;
            case 140:
                this.d();
                return;
            case 150:
                this.c();
            }

        } catch (Exception var2) {
            ;
        }
    }

    private void e(int var1) {
        try {
            switch(var1) {
            case 0:
            case 1:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                this.aS();
                return;
            case 2:
                this.bO();
                return;
            case 3:
                this.aT();
                return;
            case 4:
                this.aV();
                return;
            case 5:
                this.aU();
                return;
            case 6:
                this.aW();
                return;
            case 7:
                this.aX();
                return;
            case 8:
                this.aY();
                return;
            case 9:
                this.aZ();
                return;
            case 10:
                this.ba();
                return;
            case 11:
                this.bb();
                return;
            case 12:
            case 48:
            case 89:
                return;
            case 13:
                this.bd();
                return;
            case 14:
                this.be();
                return;
            case 15:
                this.bf();
                return;
            case 16:
                this.bg();
                return;
            case 17:
                this.bh();
                return;
            case 18:
                this.bi();
                return;
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 52:
            case 53:
            case 72:
            case 73:
            case 74:
            case 76:
            case 80:
            case 82:
            case 83:
            case 84:
            case 85:
            case 88:
            case 91:
            case 92:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 121:
            case 122:
            case 123:
            case 124:
            case 126:
            case 127:
            case 128:
            case 129:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            default:
                break;
            case 20:
                this.bj();
                return;
            case 27:
                this.bk();
                return;
            case 36:
                this.bl();
                return;
            case 37:
                this.bm();
                return;
            case 38:
                this.bP();
                return;
            case 39:
            case 41:
            case 50:
            case 51:
            case 57:
            case 70:
            case 71:
            case 78:
            case 81:
            case 86:
            case 87:
                this.f(var1);
                return;
            case 40:
                this.bQ();
                return;
            case 42:
            case 43:
                this.bo();
                return;
            case 44:
                this.bp();
                return;
            case 45:
                this.bq();
                return;
            case 46:
                this.br();
                return;
            case 47:
                if(super.l < 6) {
                    this.m();
                    return;
                }
                break;
            case 49:
                this.bS();
                return;
            case 54:
                this.bc();
                return;
            case 55:
                this.bs();
                return;
            case 56:
                this.bt();
                return;
            case 58:
                this.bu();
                return;
            case 59:
                this.bv();
                return;
            case 60:
                this.bw();
                return;
            case 61:
                this.bR();
                return;
            case 62:
                this.bx();
                return;
            case 75:
                this.by();
                return;
            case 77:
                this.bz();
                return;
            case 79:
                this.bA();
                return;
            case 90:
                this.bB();
                return;
            case 93:
                this.bU();
                return;
            case 120:
            case 125:
            case 130:
            case 135:
            case 140:
                this.ah();
                return;
            case 150:
                this.g(false);
            }

        } catch (Exception var3) {
            ;
        }
    }

    private void ah() {
        this.d(super.w);
        if(super.aj == 4) {
            this.g(true);
        }

    }

    private void g(boolean var1) {
        for(int var4 = 0; var4 < 10; ++var4) {
            if(super.a[var4][2] == 0) {
                int var10000;
                int var2;
                if(super.a[var4][3] == 0) {
                    var2 = super.a[var4][0];
                    var10000 = super.a[var4][1];
                } else {
                    var2 = (super.S + super.U) / 100;
                    var10000 = (super.T + super.V) / 100 + 24;
                }

                int var3 = var10000;
                if(var1) {
                    short var5 = super.a[var4][0];
                    int var6 = (super.S + super.U) / 100;
                    if(Math.abs(var5 - var6) > 32) {
                        continue;
                    }
                }

                c.b(102, 0, 0, 32, 32, 0, var2 + super.W, var3 + super.X);
            }
        }

    }

    private void c(int var1, int var2, int var3, int var4, int var5) {
        a(var1, var2, var3, var4, c.a[var1][var5]);
    }

    private static void a(int var0, int var1, int var2, int var3, int[] var4) {
        int var5;
        int var6;
        int var7;
        label13: {
            var5 = var4[4];
            var6 = var4[5];
            switch(var3) {
            case 1:
                var7 = c.a[4];
                var5 = -var5;
                break label13;
            case 2:
                var7 = c.a[6];
                break;
            case 3:
                var7 = c.a[2];
                var5 = -var5;
                break;
            default:
                var7 = 0;
                break label13;
            }

            var6 = -var6;
        }

        var5 = var5 * 4 / 4;
        var6 = var6 * 4 / 4;
        c.a(var0, var4[0], var4[1], var4[2], var4[3], var7, var1 + var5, var2 + var6, 3);
    }

    private void d(int var1, int var2, int var3, int var4, int var5) {
        b var10000;
        byte var10001;
        int var10002;
        int var10003;
        int var10004;
        byte var10005;
        switch(var1) {
        case 0:
            if(var5 == 0) {
                var10000 = this;
                var10001 = 120;
                var10002 = var2;
                var10003 = var3;
                var10004 = var4;
                var10005 = 1;
            } else {
                var10000 = this;
                var10001 = 120;
                var10002 = var2;
                var10003 = var3;
                var10004 = var4;
                var10005 = 2;
            }
            break;
        case 1:
            if(var5 == 0) {
                var10000 = this;
                var10001 = 120;
                var10002 = var2;
                var10003 = var3;
                var10004 = var4;
                var10005 = 3;
            } else {
                var10000 = this;
                var10001 = 120;
                var10002 = var2;
                var10003 = var3;
                var10004 = var4;
                var10005 = 4;
            }
            break;
        case 2:
            if(var5 == 0) {
                var10000 = this;
                var10001 = 120;
                var10002 = var2;
                var10003 = var3;
                var10004 = var4;
                var10005 = 1;
            } else {
                var10000 = this;
                var10001 = 120;
                var10002 = var2;
                var10003 = var3;
                var10004 = var4;
                var10005 = 6;
            }
            break;
        case 3:
            var10000 = this;
            var10001 = 120;
            var10002 = var2;
            var10003 = var3;
            var10004 = var4;
            var10005 = 6;
            break;
        case 4:
            var10000 = this;
            var10001 = 120;
            var10002 = var2;
            var10003 = var3;
            var10004 = var4;
            var10005 = 7;
            break;
        case 5:
            if(var5 == 0) {
                var10000 = this;
                var10001 = 120;
                var10002 = var2;
                var10003 = var3;
                var10004 = var4;
                var10005 = 21;
            } else {
                var10000 = this;
                var10001 = 120;
                var10002 = var2;
                var10003 = var3;
                var10004 = var4;
                var10005 = 22;
            }
            break;
        case 6:
            var10000 = this;
            var10001 = 120;
            var10002 = var2;
            var10003 = var3;
            var10004 = var4;
            var10005 = 0;
            break;
        default:
            return;
        }

        var10000.c(var10001, var10002, var10003, var10004, var10005);
    }

    private void d(int var1, int var2, int var3, int var4) {
        int var7 = c.a[120][15][4];
        int var8 = c.a[120][15][5];
        int var9 = super.Q;
        int var10 = super.O / 100;
        if(var3 == 1) {
            var7 = -var7;
        }

        while(var10 < 0) {
            var10 += 360;
        }

        int var11 = 180 + c.a(var10) * 90 / 100;
        if(var9 > 16) {
            this.c(120, var1, var2, var3, 15 + (super.j >> 2 & 1));
        }

        int var5;
        int var6;
        int var13;
        for(var13 = 0; var13 < 4; ++var13) {
            int var12 = (var13 + 1) * 16;
            var5 = var1 + c.a(var11) * var12 / 100 + var7;
            var6 = var2 + c.b(var11) * var12 / 100 + var8;
            if(var9 > 16 + var12) {
                this.c(120, var5, var6, 0, 17);
            }

            if(var4 == 2 && Math.abs(var9 - (16 + var12)) < 4) {
                this.a(1, var5, var6, 0, 0, 0, 0);
            }
        }

        var5 = var1 + var7 + c.a(var11) * var9 / 100;
        var6 = var2 + var8 + c.b(var11) * var9 / 100;
        if(var4 == 2) {
            var13 = var1 + var7 + c.a(var11) * 96 / 100;
            int var14 = var2 + var8 + c.b(var11) * 96 / 100;
            this.c(121, var13, var14, 0, 0);
            if((super.j & 7) == 4) {
                this.a(1, var13 + c.c(48) - 24, var14 + c.c(48) - 24, 0, 0, 0, 0);
                return;
            }
        } else {
            this.c(121, var5, var6, 0, 0);
        }

    }

    private void i(int var1, int var2, int var3) {
        this.c(120, var1, var2, var3, 19);
    }

    private void j(int var1, int var2, int var3) {
        this.c(120, var1, var2, var3, 19);
    }

    private void k(int var1, int var2, int var3) {
        this.c(120, var1, var2 + 8 - 32 + super.Q, var3, 20);
    }

    private void l(int var1, int var2, int var3) {
        switch(super.K) {
        case 0:
            this.d(var1, var2, var3, 0);
            return;
        case 1:
            return;
        case 2:
            this.i(var1, var2, var3);
            return;
        case 3:
            this.j(var1, var2, var3);
            return;
        case 4:
            this.k(var1, var2, var3);
        case 5:
        default:
        }
    }

    private void m(int var1, int var2, int var3) {
        switch(super.K) {
        case 0:
            this.d(var1, var2, var3, 2);
            return;
        case 1:
            return;
        case 2:
            this.i(var1, var2, var3);
            return;
        case 3:
            this.j(var1, var2, var3);
        case 5:
        default:
            return;
        case 4:
            this.k(var1, var2, var3);
        }
    }

    private void d(int[] var1) {
        int var7 = super.j >> 3 & 1;
        int var8 = super.j >> 2 & 1;
        int var9 = super.j >> 1 & 1;
        int var10 = super.j & 1;
        if(super.L >= 2) {
            int var11;
            b var10000;
            byte var10001;
            int var10002;
            int var10003;
            int var10004;
            label37: {
                this.c(var1);
                int var2 = var1[2];
                int var3 = var1[3];
                int var4 = super.M;
                int var5 = super.N;
                int var6 = (super.j & 1) == 0 && super.aa > 0?1:0;
                byte var10005;
                int var10006;
                switch(var4) {
                case 0:
                    this.l(var2, var3, var5);
                    this.d(super.ac, var2, var3, var5, var8);
                    var10000 = this;
                    var10001 = 120;
                    var10002 = var2;
                    var10003 = var3;
                    var10004 = var5;
                    var10005 = 8;
                    var10006 = var6;
                    break;
                case 1:
                    this.l(var2, var3, var5);
                    this.d(1, var2, var3, var5, var8);
                    var10000 = this;
                    var10001 = 120;
                    var10002 = var2;
                    var10003 = var3;
                    var10004 = var5;
                    var11 = 8;
                    break label37;
                case 2:
                    this.l(var2, var3, var5);
                    this.d(super.ac, var2, var3, var5, var8);
                    this.c(120, var2, var3, var5, 11 + var10);
                    var10000 = this;
                    var10001 = 120;
                    var10002 = var2;
                    var10003 = var3;
                    var10004 = var5;
                    var10005 = 8;
                    var10006 = var6;
                    break;
                case 3:
                    this.m(var2, var3, var5);
                    this.d(2, var2, var3, var5, var7);
                    this.c(120, var2, var3, var5, 8);
                    if(var8 != 0) {
                        this.a(1, var2 + c.c(32) - 16, var3 + c.c(32) - 16 - 8, 0, 0, 0, 0);
                        return;
                    }

                    return;
                case 4:
                    this.c(120, var2, var3, var5, 7);
                    var10000 = this;
                    var10001 = 120;
                    var10002 = var2;
                    var10003 = var3;
                    var10004 = var5;
                    var11 = 8;
                    break label37;
                case 5:
                    this.d(0, var2, var3, var5, var8);
                    this.c(120, var2, var3, var5, 8);
                    if(var9 == 1) {
                        this.c(120, var2, var3, var5, 18);
                    }

                    var10000 = this;
                    var10001 = 120;
                    var10002 = var2;
                    var10003 = var3;
                    var10004 = var5;
                    var10005 = 13;
                    var10006 = var8;
                    break;
                case 6:
                    this.d(0, var2, var3, var5, var8);
                    this.c(120, var2, var3, var5, 8);
                    if(var9 != 0) {
                        this.c(120, var2, var3, var5, 18);
                    }

                    var10000 = this;
                    var10001 = 120;
                    var10002 = var2;
                    var10003 = var3;
                    var10004 = var5;
                    var10005 = 11;
                    var10006 = var10;
                    break;
                case 7:
                default:
                    return;
                }

                var11 = var10005 + var10006;
            }

            var10000.c(var10001, var10002, var10003, var10004, var11);
        }
    }

    private static boolean a(int var0, int var1, int var2, int var3) {
        return (var2 == -1 || 0 <= var0 - c.y[0] + var2 && c.d >= var0 - c.y[0] - var2) && (var3 == -1 || 0 <= var1 - c.y[1] + var3 && 240 >= var1 - c.y[1] - var3);
    }

    private void ai() {
        label32: {
            super.w[6] = super.w[2];
            super.w[7] = super.w[3];
            if(c.b(super.w[2], super.w[3], super.w[6], super.w[7], 8, 8) > 0) {
                if(super.w[5] != 0 || super.w[0] == -1) {
                    break label32;
                }
            } else if(super.w[12] == 0 || c.b(super.w[2], super.w[12], super.w[6], super.w[12], 8, 8) < 0 || super.w[5] != 0 || super.w[0] == -1) {
                break label32;
            }

            super.w[5] = 1;
            super.w[10] = super.k;
            ++super.v;
        }

        if(super.w[5] == 1 && super.k - super.w[10] >= 20) {
            super.w[0] = -1;
            super.w[5] = 0;
        }

    }

    private void aj() {
        int var1 = c.a(super.j * 3) * 87;
        int var2 = c.a(super.w[6] * 3) * 87;
        super.w[6] = super.j;
        int var4 = super.w[4] + 1;
        if(super.w[4] == 5 || super.w[19] == 1) {
            var1 = -var1;
            var2 = -var2;
        }

        byte var5 = 24;
        byte var6 = 8;
        int var3;
        if(super.aj == 3) {
            var5 = 44;
            var6 = 24;
            var3 = var4 << 4;
            var3 += 8;
        } else if(super.aj == 5) {
            var5 = 24;
            var6 = 24;
            var3 = var4 << 4;
            var3 -= 24;
        } else {
            var3 = var4 << 4;
            var3 -= 8;
        }

        int var8 = c.a(super.w[2] + c.a(180 + var1 / 100) * var3 / 100, super.w[3] + c.b(180 + var1 / 100) * var3 / 100, super.w[2] + c.a(180 + var2 / 100) * var3 / 100, super.w[3] + c.b(180 + var2 / 100) * var3 / 100, var5, var6);
        if(super.aj != 3 && super.aj != 5) {
            if(var8 != 0) {
                var8 = c.a(super.w[2] + c.a(180 + var1 / 100) * var3 / 100, super.w[3] + c.b(180 + var1 / 100) * var3 / 100 + 5, super.w[2] + c.a(180 + var2 / 100) * var3 / 100, super.w[3] + c.b(180 + var2 / 100) * var3 / 100 + 5, var5, var6);
            }

            if(var8 == 0) {
                c.c[1] = super.w[3] + c.b(180 + var1 / 100) * var3 / 100 - var6 << 8;
                c.c[0] += (c.a(180 + var1 / 100) * var3 - c.a(180 + var2 / 100) * var3 << 8) / 100;
                this.b(super.w[2] + c.a(180 + var1 / 100) * var3 / 100, var5);
                this.a(super.w[22]);
            }
        }

        if(super.s && super.ag == super.w[20] && var8 != 0) {
            super.s = false;
        }

    }

    private void ak() {
        int var1 = 0;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        super.w[6] = super.w[2];
        super.w[7] = super.w[3];
        int var10 = super.k - super.w[14];
        super.w[14] = super.k;
        int var3 = 99;
        boolean var9 = false;

        for(int var2 = 0; var2 < 12; ++var2) {
            if((var1 = c.a(c.a(), c.b() - 12, c.b[0], c.b[1] - 12, 4, 12, super.w[2] - 96 + (var2 << 4), super.w[3] + super.w[10], super.w[6] - 96 + (var2 << 4), super.w[7] + super.w[10], 8, 8)) >= 0 && var1 != 3) {
                var7 = true;
                c.c[1] = super.w[3] - 8 << 8;
                if(Math.abs(c.a() - (super.w[2] - 8)) < 999) {
                    var3 = var2;
                    Math.abs(c.a() - super.w[2]);
                }
                break;
            }
        }

        label48: {
            b var10000;
            if(var3 != 99) {
                c.c[1] = super.w[3] - 8 + super.w[10] << 8;
                this.b(super.w[2], 96);
                this.a(super.w[22]);
                super.w[5] = var3;
                int var11 = var3 <= 6?var3:6 - var3 % 6;
                super.w[10] += var10;
                if(super.w[10] >= var11 * 2) {
                    super.w[10] = var11 * 2;
                }

                if(var3 != 0 && var3 != 11) {
                    break label48;
                }

                var10000 = this;
            } else {
                super.w[10] -= var10;
                if(super.w[10] > 0) {
                    break label48;
                }

                var10000 = this;
            }

            var10000.w[10] = 0;
        }

        if(var7) {
            var1 = 0;
        }

        if(super.s && super.ag == super.w[20] && var1 != 0) {
            super.s = false;
        }

    }

    private void al() {
        boolean var4 = false;

        for(int var1 = 0; var1 < 12; ++var1) {
            if((super.j / 10 + (12 - var1)) % 7 == 2 && c.a(super.w[2] - 96 + (var1 << 4), super.w[3], super.w[2] - 96 + (var1 << 4), super.w[3], 8, 12) >= 0) {
                this.u();
                return;
            }
        }

    }

    private void am() {
        boolean var1 = false;
        boolean var2 = false;
        int var3 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -99;
        int var7 = 999;
        boolean var8 = false;
        byte var9 = 0;
        if(super.w[4] != 0) {
            var9 = -1;
        }

        int var14 = super.w[2];
        int var15;
        if(super.w[5] == 0) {
            var15 = var9 == 0?c.e.length:-c.e.length;
            if((var5 = c.a(c.a(), c.b() - 12, c.b[0], c.b[1] - 12, 2, 12, super.w[2] - var15, super.w[3] - c.e[0] + 8, super.w[2] - var15, super.w[3] - c.e[0] + 8, 8, 8)) >= 0) {
                c.c[1] = super.w[3] - c.e[0] + 8 - 8 << 8;
            }
        }

        int var10;
        if(super.w[5] != 0) {
            for(var10 = 0; var10 < 36; ++var10) {
                if(super.k / 2 - super.w[10] - ((var10 << 1) + var10) < 0) {
                    var3 = var10 / 6 << 3;
                    break;
                }

                if(var10 == 29) {
                    super.w[5] = 2;
                }
            }

            if(var3 >= 48) {
                super.w[5] = 2;
            }

            var14 = super.w[4] != 0?super.w[2] - var3:super.w[2] + var3;
        }

        if(super.w[5] != 2) {
            var10 = c.e.length;
            if(c.a(super.w[2], super.w[3], super.w[2], super.w[3], 128, 128) >= 0) {
                for(int var12 = 0; var12 < var10; ++var12) {
                    var15 = var9 == 0?var12:var10 - var12 - 1;
                    if(var9 == 0 && var3 <= var12 || var9 != 0 && var10 - var3 >= var12) {
                        if(c.a(c.a(), c.b() - 12, c.b[0], c.b[1] - 12, 2, 12, super.w[2] - var10 + (var12 << 1), super.w[3] - c.e[var15], super.w[2] - var10 + (var12 << 1), super.w[3] - c.e[var15], 1, 1) == 0 && var7 > Math.abs(c.a() - (super.w[2] - var10 + (var12 << 1)))) {
                            var7 = Math.abs(c.a() - (super.w[2] - var10 + (var12 << 1)));
                            var6 = var15;
                        }

                        if(var6 != -99 && 8 > Math.abs(c.a() - (super.w[2] - var10 + (var12 << 1))) && c.b() - (super.w[3] - c.e[var15]) > 0 && c.b() - (super.w[3] - c.e[var15]) <= 64 && var7 > Math.abs(c.a() - (super.w[2] - var10 + (var12 << 1)))) {
                            var7 = Math.abs(c.a() - (super.w[2] - var10 + (var12 << 1)));
                            var6 = var15;
                            break;
                        }
                    }
                }
            }

            var5 = -1;
            if(var7 != 999) {
                super.w[17] = var6;
                c.c[1] = super.w[3] - c.e[var6] - 1 << 8;
                if(super.w[5] == 0) {
                    super.w[10] = super.k / 2;
                }

                super.w[5] = 1;
                int var13 = var9 == 0?var3:var10 - var3;
                this.b(var14, var13);
                this.a(super.w[22]);
                var5 = 0;
            }
        }

        if(super.s && super.ag == super.w[20] && var5 != 0) {
            super.s = false;
        }

    }

    private void an() {
        boolean var1 = false;
        boolean var2 = false;
        int var3 = -1;
        this.a(super.w[2], super.w[3], super.w[4]);
        int var13 = super.w[4] == 21?2:(super.w[4] == 1?0:1);
        boolean var5 = false;
        boolean var6 = false;
        super.w[17] = super.w[2];
        super.w[18] = super.w[3];
        if(var13 != 2 && super.w[4] != 32) {
            label170: {
                byte var17;
                label163: {
                    ++super.w[5];
                    var17 = 32;
                    byte var10000;
                    if(super.w[4] == 35) {
                        var10000 = 32;
                    } else if(super.w[4] == 1) {
                        var10000 = 16;
                    } else if(super.w[4] == 41) {
                        var10000 = 16;
                    } else {
                        label159: {
                            if(super.w[4] != 34) {
                                if(super.w[4] == 43) {
                                    var10000 = 32;
                                    break label159;
                                }

                                if(super.w[4] == 33) {
                                    var10000 = 16;
                                    break label159;
                                }

                                if(super.w[4] != 42) {
                                    break label163;
                                }
                            }

                            var10000 = 24;
                        }
                    }

                    var17 = var10000;
                }

                int var16;
                byte var10001;
                int var10002;
                int[] var21;
                label149: {
                    int var20;
                    if(super.w[4] == 3) {
                        var20 = super.w[18] >> 8;
                    } else {
                        if(super.w[4] == 7) {
                            break label170;
                        }

                        if(super.w[4] == 1) {
                            var16 = c.a(super.w[5]) * var17 / 100 - var17;
                            var21 = super.w;
                            var10001 = 3;
                            var10002 = super.w[9] + 8;
                            break label149;
                        }

                        var20 = c.a(super.w[5]) * var17 / 100 - var17;
                    }

                    var16 = var20;
                    var21 = super.w;
                    var10001 = 3;
                    var10002 = super.w[9];
                }

                var21[var10001] = var10002 + var16;
            }
        }

        if(var13 == 2) {
            super.w[3] = super.w[9];
        }

        if(var13 == 2 && super.w[13] != 0) {
            super.w[3] = super.w[9] + 15;
            if(super.w[16] == 0) {
                super.w[16] = 1;
            }
        }

        super.w[13] = 0;
        int var7 = 999;
        int var14;
        if((var14 = c.a(super.w[2], super.w[3], super.w[17], super.w[18], super.f[var13], c.d[var13][0])) >= 0) {
            label136: {
                if(var14 == 1) {
                    c.c[0] = super.w[2] - super.f[var13] - 12 << 8;
                    c.c[10] = 0;
                    var3 = -99;
                    if(!super.a[4]) {
                        break label136;
                    }
                } else {
                    if(var14 != 2) {
                        break label136;
                    }

                    c.c[0] = super.w[2] + super.f[var13] + 12 + 1 << 8;
                    c.c[10] = 0;
                    var3 = -99;
                    if(!super.a[3]) {
                        break label136;
                    }
                }

                this.s();
            }
        }

        int var8 = c.d[var13].length;
        int var9 = c.d[var13][0];
        if(var13 == 2) {
            var9 = 96;
        }

        int var4;
        if(c.a(super.w[2], super.w[3], super.w[17], super.w[18], var8, var9) >= 0) {
            for(var4 = 0; var4 < var8; ++var4) {
                if(c.a(c.a(), c.b() - 12, c.b[0], c.b[1] - 12, 2, 13, super.w[2] - var8 + (var4 << 1), super.w[3] - c.d[var13][var4], super.w[17] - var8 + (var4 << 1), super.w[18] - c.d[var13][var4], 1, 1) == 0 && var7 > Math.abs(c.a() - (super.w[2] - var8 + (var4 << 1)))) {
                    var7 = Math.abs(c.a() - (super.w[2] - var8 + (var4 << 1)));
                    var3 = var4;
                }

                if(var3 != -99 && 8 >= Math.abs(c.a() - (super.w[2] - var8 + (var4 << 1))) && c.b() - (super.w[3] - c.d[var13][var4]) >= -1 && c.b() - (super.w[3] - c.d[var13][var4]) <= 64 && var7 > Math.abs(c.a() - (super.w[2] - var8 + (var4 << 1)))) {
                    var7 = Math.abs(c.a() - (super.w[2] - var8 + (var4 << 1)));
                    var3 = var4;
                    break;
                }
            }
        }

        byte var15 = -1;
        if(var7 != 999) {
            c.c[1] = super.w[3] - c.d[var13][var3] + 4 << 8;
            this.b(super.w[2], c.d[var13].length);
            this.a(super.w[22]);
            var15 = 0;
            if(var13 == 2) {
                super.w[13] = 1;
            }
        }

        if(super.s && super.ag == super.w[20] && var15 != 0) {
            super.s = false;
        }

        if(super.w[16] != 0) {
            ++super.w[16];
            if(super.w[16] == 60) {
                super.w[15] = super.j - 1;
            }

            if(super.w[16] >= 60) {
                boolean var11 = false;
                boolean var12 = false;

                for(var4 = 0; var4 < 8; ++var4) {
                    int var18;
                    int var19;
                    if((var19 = (var18 = super.j - super.w[15]) - 1) < 0) {
                        var19 = 0;
                    }

                    if(var4 << 3 < var18) {
                        var19 = var18 = var4 << 3;
                    }

                    if(c.a(super.w[2] + (var18 << 1) - 56, super.w[3] - c.d[var13][var18], super.w[17] + (var19 << 1) - 56, super.w[18] - c.d[var13][var19], 6, 6) >= 0) {
                        this.u();
                        return;
                    }
                }
            }
        }

    }

    private void ao() {
        byte var2 = 56;
        boolean var4 = false;
        this.c(super.w[8], super.w[9]);
        super.w[7] = super.w[3];
        int[] var10000;
        byte var10001;
        int var10002;
        if(super.w[4] == 128) {
            if(super.w[18] == 0) {
                super.w[3] = super.w[9] + 112;
            }

            label143: {
                super.w[18] = 1;
                if(!super.e[128] && !super.e[129]) {
                    if(super.w[3] >= super.w[9] + 112) {
                        break label143;
                    }

                    super.w[3] += 2;
                    if(super.w[3] <= super.w[9] + 112) {
                        break label143;
                    }

                    var10000 = super.w;
                    var10001 = 3;
                    var10002 = super.w[9] + 112;
                } else {
                    if(super.w[3] <= super.w[9]) {
                        break label143;
                    }

                    var10000 = super.w;
                    var10001 = 3;
                    var10002 = super.w[3] - 1;
                }

                var10000[var10001] = var10002;
            }

            int[][] var5 = this.a(10, 0);

            for(int var1 = 0; var1 < var5.length; ++var1) {
                if(super.w[2] - 56 - (var5[var1][2] - 16) <= 32 && super.w[2] - 56 - (var5[var1][2] - 16) >= -112 && super.e[128] && super.w[3] < super.w[9] + 16) {
                    super.w[3] = super.w[9] + 16;
                }
            }
        } else {
            label141: {
                short var7 = 160;
                if(super.w[4] == 17) {
                    var2 = 48;
                } else {
                    label140: {
                        byte var8;
                        label105: {
                            if(super.w[4] == 2) {
                                var8 = 56;
                            } else {
                                if(super.w[4] == 35) {
                                    var2 = 16;
                                    var8 = 120;
                                    break label105;
                                }

                                if(super.w[4] != 18) {
                                    break label140;
                                }

                                var8 = 48;
                            }

                            var2 = var8;
                            var8 = 80;
                        }

                        var7 = var8;
                    }
                }

                if(super.w[5] == 0) {
                    if(super.w[3] >= super.w[9] + var7) {
                        break label141;
                    }

                    super.w[3] += 4;
                    if(super.w[3] < super.w[9] + var7) {
                        break label141;
                    }

                    super.w[3] = super.w[9] + var7;
                    var10000 = super.w;
                    var10001 = 5;
                    var10002 = 1;
                } else if(super.w[5] < 60) {
                    var10000 = super.w;
                    var10001 = 5;
                    var10002 = super.w[5] + 1;
                } else {
                    if(super.w[3] <= super.w[9]) {
                        break label141;
                    }

                    --super.w[3];
                    if(super.w[3] != super.w[9]) {
                        break label141;
                    }

                    var10000 = super.w;
                    var10001 = 5;
                    var10002 = 0;
                }

                var10000[var10001] = var10002;
            }
        }

        int var6;
        if((var6 = c.a(super.w[2], super.w[3], super.w[2], super.w[7], var2, 12)) >= 0) {
            if(var6 == 0) {
                c.c[1] = super.w[3] - 12 << 8;
                this.b(super.w[2], var2);
                this.a(super.w[22]);
                if(super.w[3] - 24 < super.w[9]) {
                    this.B();
                }
            } else if(var6 == 1) {
                c.c[0] = super.w[2] - var2 - 12 << 8;
                c.c[10] = 0;
                if(super.a[4]) {
                    this.s();
                }
            } else if(var6 == 2) {
                c.c[0] = super.w[2] + var2 + 12 + 1 << 8;
                c.c[10] = 0;
                if(super.a[3]) {
                    this.s();
                }
            } else if(var6 == 3) {
                this.B();
                c.c[1] = super.w[3] + 12 + 12 + 12 + 1 << 8;
            }
        }

        if(super.s && super.ag == super.w[20] && var6 != 0) {
            super.s = false;
        }

        if(super.w[4] != 35 && c.a(super.w[2], super.w[3] + 32, super.w[2], super.w[7] + 32, 40, 14) >= 0) {
            this.u();
        }

    }

    private void ap() {
        byte var1 = 20;
        byte var2 = 14;
        super.w[7] = super.w[3];
        super.w[15] = super.w[2];
        int var3;
        if((var3 = super.w[4]) == 64) {
            var1 = 64;
        } else if(var3 == 16) {
            var1 = 16;
            var2 = 19;
        }

        int[] var10000;
        byte var10001;
        int var10002;
        if(var3 == 48) {
            var1 = 30;
        } else {
            label170: {
                byte var10003;
                int[] var6;
                if(var3 == 18) {
                    label167: {
                        var1 = 14;
                        var2 = 20;
                        ++super.w[6];
                        super.w[5] = super.w[6];
                        if(super.w[6] < 60) {
                            var10000 = super.w;
                            var10001 = 5;
                        } else {
                            if(super.w[6] < 68) {
                                var10000 = super.w;
                                var10001 = 5;
                                var10002 = super.w[6] - 60;
                                break label167;
                            }

                            if(super.w[6] < 128) {
                                var10000 = super.w;
                                var10001 = 5;
                                var10002 = 8;
                                break label167;
                            }

                            if(super.w[6] < 136) {
                                var10000 = super.w;
                                var10001 = 5;
                                var10002 = 136 - super.w[6];
                                break label167;
                            }

                            super.w[5] = 0;
                            var10000 = super.w;
                            var10001 = 6;
                        }

                        var10002 = 0;
                    }

                    var10000[var10001] = var10002;
                    var10000 = super.w;
                    var10001 = 2;
                    var6 = super.w;
                    var10003 = 8;
                } else {
                    if(var3 == 32) {
                        var1 = 8;
                        var2 = 18;
                        break label170;
                    }

                    if(var3 == 82) {
                        label155: {
                            var1 = 20;
                            var2 = 6;
                            ++super.w[6];
                            super.w[5] = super.w[6];
                            if(super.w[6] < 60) {
                                var10000 = super.w;
                                var10001 = 5;
                            } else {
                                if(super.w[6] < 68) {
                                    var10000 = super.w;
                                    var10001 = 5;
                                    var10002 = super.w[6] - 60;
                                    break label155;
                                }

                                if(super.w[6] < 128) {
                                    var10000 = super.w;
                                    var10001 = 5;
                                    var10002 = 8;
                                    break label155;
                                }

                                if(super.w[6] < 136) {
                                    var10000 = super.w;
                                    var10001 = 5;
                                    var10002 = 136 - super.w[6];
                                    break label155;
                                }

                                super.w[5] = 0;
                                var10000 = super.w;
                                var10001 = 6;
                            }

                            var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        var10000 = super.w;
                        var10001 = 2;
                        var6 = super.w;
                        var10003 = 8;
                    } else {
                        if(var3 != 1) {
                            break label170;
                        }

                        label144: {
                            var1 = 20;
                            ++super.w[6];
                            super.w[5] = super.w[6];
                            if(super.w[6] < 60) {
                                var10000 = super.w;
                                var10001 = 5;
                            } else {
                                if(super.w[6] < 68) {
                                    var10000 = super.w;
                                    var10001 = 5;
                                    var10002 = super.w[6] - 60;
                                    break label144;
                                }

                                if(super.w[6] < 128) {
                                    var10000 = super.w;
                                    var10001 = 5;
                                    var10002 = 8;
                                    break label144;
                                }

                                if(super.w[6] < 136) {
                                    var10000 = super.w;
                                    var10001 = 5;
                                    var10002 = 136 - super.w[6];
                                    break label144;
                                }

                                super.w[5] = 0;
                                var10000 = super.w;
                                var10001 = 6;
                            }

                            var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        var10000 = super.w;
                        var10001 = 3;
                        var6 = super.w;
                        var10003 = 9;
                    }
                }

                var10000[var10001] = var6[var10003] - (super.w[5] << 2) + 32;
            }
        }

        boolean var4 = false;
        int var5;
        if((var5 = c.a(super.w[2], super.w[3], super.w[15], super.w[7], var1, var2)) >= 0) {
            label179: {
                label186: {
                    b var7;
                    if(super.w[4] != 82 && super.w[4] != 18 && super.w[4] != 16) {
                        if((var5 != 0 || super.w[19] != 0) && (var5 != 3 || super.w[19] == 0)) {
                            break label186;
                        }

                        var7 = this;
                    } else {
                        if(var5 != 1 && var5 != 2) {
                            break label186;
                        }

                        var7 = this;
                    }

                    var7.u();
                    var4 = true;
                }

                if(var5 == 0) {
                    c.c[1] = super.w[3] - var2 << 8;
                    this.b(super.w[2], var1);
                    this.a(super.w[22]);
                    if(!this.a(c.a(), c.b() - 32)) {
                        break label179;
                    }

                    if(c.c[12] == 0) {
                        var10000 = c.c;
                        var10001 = 0;
                        var10002 = super.w[2] - var1 - 12 << 8;
                    } else {
                        var10000 = c.c;
                        var10001 = 0;
                        var10002 = super.w[2] + var1 + 12 + 1 << 8;
                    }
                } else {
                    if(var5 == 1) {
                        c.c[0] = super.w[2] - var1 - 12 << 8;
                        c.c[10] = 0;
                        if(!var4 && super.a[4]) {
                            this.s();
                        }
                        break label179;
                    }

                    if(var5 == 2) {
                        c.c[0] = super.w[2] + var1 + 12 + 1 << 8;
                        c.c[10] = 0;
                        if(var4 && super.a[3]) {
                            this.s();
                        }
                        break label179;
                    }

                    if(var5 != 3) {
                        break label179;
                    }

                    c.c[1] = super.w[3] + var2 + 12 + 12 + 1 << 8;
                    if(c.c[5] < 0) {
                        c.c[5] = 0;
                    }

                    if(super.aj != 0) {
                        break label179;
                    }

                    var10000 = c.c;
                    var10001 = 1;
                    var10002 = c.c[1] + 4096;
                }

                var10000[var10001] = var10002;
            }
        }

        if(super.s && super.ag == super.w[20] && var5 != 0) {
            super.s = false;
        }

    }

    private void aq() {
        byte var1 = 16;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = -1;
        boolean var6 = false;
        super.w[15] = super.w[2];
        super.w[16] = super.w[3];
        if(super.w[4] == 129) {
            var1 = 64;
        }

        int var10 = super.w[2];
        if(super.w[5] != 0 && super.w[10] == 0) {
            super.w[3] += 2;
            if(this.b(super.w[2] - var1 + 1, super.w[3] + 16) || this.b(super.w[2] + var1 - 1, super.w[3] + 16)) {
                super.w[5] = 0;
                if(super.w[4] == 0) {
                    super.w[6] = 1;
                }
            }
        }

        int var7;
        for(var7 = 0; var7 < 4; ++var7) {
            if(super.w[8] == c.g[var7] && super.w[9] == c.h[var7]) {
                var5 = var7;
                break;
            }
        }

        if(super.w[5] == 0 && var5 != -1 && super.w[10] == 0 && Math.abs(super.w[2] - c.i[var5]) <= 16 && Math.abs(super.w[3] - c.j[var5]) <= 16) {
            super.w[10] = 1;
        }

        if(super.w[17] == 0 && super.w[10] > 0 && super.w[3] < c.j[var5]) {
            super.w[3] += 2;
            if(super.w[3] > c.j[var5]) {
                super.w[3] = c.j[var5];
            }
        }

        int[] var10000;
        byte var10001;
        int var10002;
        label301: {
            int var10003;
            label300: {
                if(super.w[17] == 0) {
                    if(super.w[10] >= 1 && super.w[10] < 15) {
                        var10000 = super.w;
                        var10001 = 10;
                        var10002 = super.w[10];
                        var10003 = 1;
                        break label300;
                    }

                    if(super.w[10] != 15) {
                        if(super.w[10] < 16) {
                            break label301;
                        }

                        ++super.w[10];
                        if(super.w[10] < 46 || super.w[10] - 48 > 96 || super.w[10] % 2 != 0) {
                            break label301;
                        }

                        var10000 = super.w;
                        var10001 = 3;
                        var10002 = super.w[3];
                        var10003 = 1;
                        break label300;
                    }
                } else if(c.k[var5] < 0) {
                    if(super.w[18] >= super.w[2]) {
                        break label301;
                    }
                } else if(super.w[18] <= super.w[2]) {
                    break label301;
                }

                var10000 = super.w;
                var10001 = 2;
                var10002 = super.w[2];
                var10003 = c.k[var5];
            }

            var10000[var10001] = var10002 + var10003;
        }

        super.w[17] = 0;
        if(super.w[4] != 129 && super.aj == 2) {
            int var8;
            int[][] var12;
            if(super.aj == 2 && super.ak == 0 && super.w[4] == 0) {
                var12 = this.a(8, 128);

                for(var8 = 0; var8 < var12.length; ++var8) {
                    if(var12[var8][2] - 56 - (super.w[2] - 16) <= 32 && var12[var8][2] - 56 - (super.w[2] - 16) >= -112) {
                        super.w[3] = var12[var8][3] - 28;
                    }
                }

                int[][] var14 = this.a(15, 128);
                super.e[129] = false;

                for(int var9 = 0; var9 < var14.length; ++var9) {
                    if(var14[var9][2] - 8 - (super.w[2] - 16) <= 32 && var14[var9][2] - 8 - (super.w[2] - 16) >= -32 && var14[var9][3] - 8 - (super.w[3] - 16) <= 32 && var14[var9][3] - 8 - (super.w[3] - 16) >= -32) {
                        super.e[129] = true;
                        super.b[129] = true;
                    }
                }
            }

            if(super.w[4] != 0) {
                var12 = this.a(9, 16);

                for(var8 = 0; var8 < var12.length; ++var8) {
                    if(var12[var8][2] - 20 - (super.w[2] - 16) <= 32 && var12[var8][2] - 20 - (super.w[2] - 16) >= -40 && var12[var8][3] - 20 - (super.w[3] - 16) <= 32 && var12[var8][3] - 20 - (super.w[3] - 16) >= -40 && super.w[10] == 15) {
                        super.w[10] = 16;
                    }
                }
            }

            if(super.w[4] == 2) {
                var12 = this.a(77, 16);

                for(var8 = 0; var8 < var12.length; ++var8) {
                    if(var12[var8][2] - 20 - 64 - (super.w[2] - 16) <= 32 && var12[var8][2] - 20 - 64 - (super.w[2] - 16) >= -112 && var12[var8][3] - 48 + 16 - 16 - (super.w[3] - 16) <= 32 && var12[var8][3] - 48 + 16 - 16 - (super.w[3] - 16) >= -32 && var12[var8][5] > 1 && var12[var8][5] / 4 < 26) {
                        super.w[3] = var12[var8][3] - 48 + 16 - 16;
                        super.w[18] = var12[var8][2] - 10 + 16;
                        super.w[17] = 1;
                        break;
                    }
                }
            }
        }

        var10 -= super.w[2];
        int var11;
        if((var11 = c.a(super.w[2], super.w[3], super.w[15], super.w[16], var1, 16)) >= 0) {
            if(var11 == 0) {
                label234: {
                    boolean var13 = false;
                    if((var7 = c.a(super.w[2], super.w[3] - 16, super.w[15], super.w[16] - 16, var1, 2)) == 1) {
                        if((!super.a[4] || super.w[5] != 0) && super.w[4] != 129 && super.w[4] != 0 || super.w[10] != 0) {
                            break label234;
                        }

                        ++super.w[2];
                        if(!this.b(super.w[2] + var1, super.w[3] - 16)) {
                            break label234;
                        }

                        var10000 = super.w;
                        var10001 = 2;
                        var10002 = super.w[2] - 1;
                    } else {
                        if(var7 != 2 || (!super.a[3] || super.w[5] != 0) && super.w[4] != 129 && super.w[4] != 0 || super.w[10] != 0) {
                            break label234;
                        }

                        --super.w[2];
                        if(!this.b(super.w[2] - var1, super.w[3] - 16)) {
                            break label234;
                        }

                        var10000 = super.w;
                        var10001 = 2;
                        var10002 = super.w[2] + 1;
                    }

                    var10000[var10001] = var10002;
                }

                c.c[1] = super.w[3] - 16 << 8;
                this.b(super.w[2], var1);
                this.a(super.w[22]);
                var6 = true;
                c.c[0] -= var10 << 8;
            }

            if(var11 == 1) {
                if(super.a[4] && (super.w[5] == 0 || super.w[4] == 129 || super.w[4] == 0)) {
                    if(super.w[10] == 0) {
                        ++super.w[2];
                        super.w[7] = 1;
                        if(this.b(super.w[2] + var1, super.w[3] + 16 - 1)) {
                            --super.w[2];
                        }

                        if(super.w[4] == 129 && super.w[2] > super.w[8] + 64) {
                            super.w[2] = super.w[8] + 64;
                        }
                    }

                    this.s();
                }

                c.c[0] = super.w[2] - var1 - 12 << 8;
                c.c[10] = 0;
            }

            if(var11 == 2) {
                if(super.a[3] && (super.w[5] == 0 || super.w[4] == 129 || super.w[4] == 0)) {
                    if(super.w[10] == 0) {
                        --super.w[2];
                        super.w[7] = -1;
                        if(this.b(super.w[2] - var1, super.w[3] + 16 - 1)) {
                            ++super.w[2];
                        }
                    }

                    this.s();
                }

                c.c[0] = super.w[2] + var1 + 12 + 1 << 8;
                c.c[10] = 0;
            }

            if(var11 == 3) {
                c.c[1] = super.w[3] + 16 + 12 + 12 + 1 << 8;
                this.B();
            }
        }

        if(!this.b(super.w[2] - var1 + 1, super.w[3] + 16) && !this.b(super.w[2] + var1 - 1, super.w[3] + 16)) {
            ++super.w[5];
        }

        if(super.s && super.ag == super.w[20] && var11 != 0) {
            super.s = false;
        }

        if(var6) {
            this.d(super.w[2], super.w[3], super.w[4]);
        } else {
            this.f(super.w[2], super.w[3], super.w[4]);
        }
    }

    private void ar() {
        label99: {
            int[] var10000;
            byte var10001;
            int var10002;
            label109: {
                this.b(super.w[2], super.w[3], super.w[4]);
                if(super.w[4] != 2 && super.w[4] != 10) {
                    if(super.w[4] != 1) {
                        break label99;
                    }

                    super.w[3] = super.w[9] + (c.a(super.w[5]) << 3) / 100 - 8;
                    var10000 = super.w;
                    var10001 = 5;
                    var10002 = super.w[5];
                } else {
                    if(super.w[5] != 2) {
                        if(super.w[5] == 1) {
                            ++super.w[10];
                            super.w[3] += super.w[10];
                            if(!this.b(super.w[2] - 16 + 1, super.w[3] + 16) && !this.b(super.w[2] + 16 - 1, super.w[3] + 16)) {
                                break label99;
                            }

                            byte var4;
                            if((super.w[8] != 4016 || super.w[9] != 1296) && (super.w[8] != 3920 || super.w[9] != 1328)) {
                                var10000 = super.w;
                                var10001 = 5;
                                var4 = 2;
                            } else {
                                var10000 = super.w;
                                var10001 = 5;
                                var4 = 0;
                            }

                            var10000[var10001] = var4;
                            super.w[3] -= (super.w[3] + 16) % 16;
                            var10000 = super.w;
                            var10001 = 11;
                            var10002 = super.w[3];
                        } else {
                            if(super.w[3] >= c.b() || super.w[2] - 100 >= c.a()) {
                                break label99;
                            }

                            super.w[10] = 1;
                            var10000 = super.w;
                            var10001 = 5;
                            var10002 = 1;
                        }
                        break label109;
                    }

                    var10000 = super.w;
                    var10001 = 3;
                    var10002 = super.w[11] + c.a(super.k) * 6 / 100;
                }

                var10002 += 6;
            }

            var10000[var10001] = var10002;
        }

        int var3;
        if((var3 = c.a(super.w[2], super.w[3], super.w[2], super.w[3], 16, 16)) >= 0) {
            if(var3 == 0) {
                c.c[1] = super.w[3] - 16 << 8;
                this.b(super.w[2], 16);
                this.a(super.w[22]);
            } else {
                label66: {
                    if(var3 == 1) {
                        c.c[0] = super.w[2] - 16 - 12 << 8;
                        c.c[10] = 0;
                        if(!super.a[4]) {
                            break label66;
                        }
                    } else if(var3 == 2) {
                        c.c[0] = super.w[2] + 16 + 12 + 1 << 8;
                        c.c[10] = 0;
                        if(!super.a[3]) {
                            break label66;
                        }
                    } else {
                        if(var3 == 3) {
                            c.c[1] = super.w[3] + 16 + 12 + 12 + 1 << 8;
                            this.B();
                            break label66;
                        }

                        if(var3 != 4 || super.ag == super.w[20]) {
                            break label66;
                        }

                        if(c.a() < super.w[2]) {
                            c.c[0] = super.w[2] - 16 - 12 << 8;
                            c.c[10] = 0;
                            if(!super.a[4]) {
                                break label66;
                            }
                        } else {
                            c.c[0] = super.w[2] + 16 + 12 + 1 << 8;
                            c.c[10] = 0;
                            if(!super.a[3]) {
                                break label66;
                            }
                        }
                    }

                    this.s();
                }
            }
        }

        if(super.s && super.ag == super.w[20] && var3 != 0) {
            super.s = false;
        }

    }

    private void as() {
        byte var1;
        byte var2;
        byte var3;
        int var6;
        boolean var7;
        label198: {
            var1 = 48;
            var2 = 16;
            var3 = 0;
            var6 = 0;
            var7 = false;
            byte var10000;
            if(super.w[4] == 57) {
                var10000 = 63;
            } else {
                if(super.w[4] != 40) {
                    break label198;
                }

                var10000 = 32;
            }

            var1 = var10000;
            var2 = 8;
        }

        super.w[6] = super.w[2];
        super.w[7] = super.w[3];
        byte var10001;
        int var10002;
        int[] var9;
        if(super.w[4] == 7 || super.w[4] == 4) {
            var1 = 16;
            var2 = 8;
            if(super.w[10] == 1) {
                label186: {
                    var6 = super.w[2]++;
                    if(super.w[4] == 7) {
                        if(!this.b(super.w[2] + 16, super.w[3] + 8 - 1 - 16)) {
                            break label186;
                        }

                        var9 = super.w;
                        var10001 = 2;
                        var10002 = super.w[2] - 1;
                    } else {
                        if(Math.abs(super.w[2] - super.w[8]) < 96) {
                            break label186;
                        }

                        var9 = super.w;
                        var10001 = 2;
                        var10002 = super.w[8] + 96;
                    }

                    var9[var10001] = var10002;
                    super.w[10] = 2;
                }

                var6 -= super.w[2];
            } else if(super.w[10] == 2) {
                super.w[3] += 5;
                if(this.b(super.w[2] - 16 + 1, super.w[3] + 8) || this.b(super.w[2] + 16 - 1, super.w[3] + 8)) {
                    super.w[5] = 0;
                    super.w[3] -= (super.w[3] + 8) % 16;
                    super.w[10] = 3;
                }
            }
        }

        int var10003;
        if(super.w[4] == 1) {
            label171: {
                var1 = 16;
                var2 = 16;
                var6 = super.w[2];
                if(super.k % 384 <= 144) {
                    var9 = super.w;
                    var10001 = 2;
                    var10002 = super.w[8];
                    var10003 = super.k % 384 / 3;
                } else {
                    if(super.k % 384 <= 240) {
                        break label171;
                    }

                    var9 = super.w;
                    var10001 = 2;
                    var10002 = super.w[8];
                    var10003 = 48 - (super.k % 384 / 3 - 80);
                }

                var9[var10001] = var10002 - var10003;
            }

            var6 -= super.w[2];
        } else if(super.w[4] == 2) {
            var1 = 16;
            var2 = 16;
            super.w[3] = super.w[9] + 9;
            if(super.w[10] != 0) {
                var6 = super.w[2]++;
                if(this.b(super.w[2] + 16, super.w[3] + 16 - 1 - 16)) {
                    --super.w[2];
                }

                var6 -= super.w[2];
            }
        } else if(super.w[4] == 65) {
            var6 = super.w[2];
            super.w[2] = super.w[8] + c.a(super.k) * 48 / 100 - 32 - 48;
            super.w[3] = super.w[9] + 8;
            var3 = 32;
            var1 = 47;
            var6 -= super.w[2];
        } else {
            label164: {
                if(super.w[4] == 57) {
                    if(super.w[10] != 0) {
                        ++super.w[10];
                    }

                    if(super.w[10] > 5) {
                        label155: {
                            var6 = super.w[2];
                            if(super.w[19] == 0) {
                                if(super.k - super.w[11] <= 32) {
                                    var9 = super.w;
                                    var10001 = 2;
                                    var10002 = super.w[8] + (super.k - super.w[11] << 2);
                                } else {
                                    if(super.k - super.w[11] < 500 || super.k - super.w[11] >= 532) {
                                        break label155;
                                    }

                                    var9 = super.w;
                                    var10001 = 2;
                                    var10002 = super.w[8] + (128 - (super.k - super.w[11] - 500 << 2));
                                }
                            } else {
                                if(super.k - super.w[11] <= 32) {
                                    var9 = super.w;
                                    var10001 = 2;
                                    var10002 = super.w[8];
                                    var10003 = super.k - super.w[11] << 2;
                                } else {
                                    if(super.k - super.w[11] < 500 || super.k - super.w[11] >= 532) {
                                        break label155;
                                    }

                                    var9 = super.w;
                                    var10001 = 2;
                                    var10002 = super.w[8];
                                    var10003 = 128 - (super.k - super.w[11] - 500 << 2);
                                }

                                var10002 -= var10003;
                            }

                            var9[var10001] = var10002;
                        }

                        if(super.k - super.w[11] >= 532) {
                            super.w[10] = 0;
                            super.w[11] = 0;
                            super.w[2] = super.w[8];
                        }

                        var6 -= super.w[2];
                        break label164;
                    }

                    var9 = super.w;
                    var10001 = 2;
                    var10002 = super.w[8];
                } else {
                    if(super.w[4] != 40) {
                        break label164;
                    }

                    if((super.k >> 1) % 256 < 128) {
                        var9 = super.w;
                        var10001 = 3;
                        var10002 = super.w[9];
                        var10003 = (super.k >> 1) % 256;
                    } else {
                        var9 = super.w;
                        var10001 = 3;
                        var10002 = super.w[9];
                        var10003 = 128 - ((super.k >>> 1) % 256 - 128);
                    }

                    var10002 -= var10003;
                }

                var9[var10001] = var10002;
            }
        }

        int var8 = -1;
        if((super.w[4] != 7 && super.w[4] != 4 || super.w[5] != 0) && (var8 = c.a(super.w[2] + var3, super.w[3] + 0, super.w[6] + var3, super.w[7] + 0, var1, var2)) >= 0 && var8 == 0) {
            c.c[1] = super.w[3] - var2 + 0 << 8;
            if(super.w[4] == 2 || super.w[4] == 1 || super.w[4] == 65) {
                if(super.w[10] == 0) {
                    super.w[10] = 1;
                    super.w[11] = super.k;
                }

                c.c[0] -= var6 << 8;
            }

            if(super.w[4] == 57) {
                if(super.w[2] + var3 - var1 <= c.a() && c.a() <= super.w[2] + var3 + var1 && super.w[10] == 0) {
                    super.w[10] = 1;
                    super.w[11] = super.k;
                }

                c.c[0] -= var6 << 8;
            }

            if(super.w[4] == 7 || super.w[4] == 4) {
                if(super.w[5] == 1 && super.w[10] == 0) {
                    super.w[10] = 1;
                }

                c.c[0] -= var6 << 8;
            }

            this.b(super.w[2] + var3, var1);
            this.a(super.w[22]);
            var7 = true;
        }

        if(super.s && super.ag == super.w[20] && var8 != 0) {
            super.s = false;
        }

        if(var7) {
            this.c(super.w[2], super.w[3], super.w[4]);
        } else {
            this.e(super.w[2], super.w[3], super.w[4]);
        }
    }

    private void at() {
        int var1;
        label49: {
            var1 = super.w[2];
            int[] var10000;
            byte var10001;
            int var10002;
            int var10003;
            if(super.w[5] == 0) {
                if(super.w[2] + 160 >= c.a() || Math.abs(super.w[3] - c.b() + 12) >= 43) {
                    break label49;
                }

                var10000 = super.w;
                var10001 = 5;
                var10002 = super.w[5];
                var10003 = 1;
            } else {
                super.w[5] += 2;
                if(super.w[5] > 1152) {
                    super.w[5] = 1152;
                }

                var10000 = super.w;
                var10001 = 2;
                var10002 = super.w[5];
                var10003 = super.w[8];
            }

            var10000[var10001] = var10002 + var10003;
        }

        if(super.w[2] + 96 > c.a() && Math.abs(super.w[3] - c.b() + 12) < 43) {
            this.u();
            if(super.w[5] > 0 && c.a() + 300 < super.w[2]) {
                super.w[2] = c.a() + 300;
            }
        }

        int var4;
        if((var4 = c.a(super.w[2] - 96, super.w[3], var1 - 96, super.w[3], 120, 32)) >= 0) {
            if(var4 == 0) {
                return;
            }

            if(var4 == 1) {
                return;
            }

            if(var4 == 2) {
                c.c[0] = super.w[2] + 120 - 96 + 12 + 1 << 8;
                c.c[10] = 0;
                return;
            }

            if(var4 == 3) {
                c.c[1] = super.w[3] + 32 + 12 + 12 + 1 << 8;
                c.c[5] = 0;
                this.B();
            }
        }

    }

    private void au() {
        super.w[5] = super.k / 2 % 180;
        if(super.w[5] == 0) {
            super.w[10] = 0;
        }

        super.w[2] = super.w[8];
        super.w[3] = super.w[9] - 356 + (super.w[5] << 3);
        if(Math.abs(c.a() - super.w[2]) < 44) {
            label35: {
                if(super.w[3] < super.w[9]) {
                    if(super.w[3] - 240 >= c.b() || super.w[3] <= c.b() - 12) {
                        break label35;
                    }
                } else if(super.w[3] - 240 >= c.b() || super.w[9] <= c.b() - 12) {
                    break label35;
                }

                this.u();
            }
        }

        int[] var10000;
        byte var10001;
        int var10002;
        if(super.w[10] == 0) {
            if(super.w[3] <= super.w[9]) {
                return;
            }

            var10000 = super.w;
            var10001 = 10;
            var10002 = 1;
        } else {
            var10000 = super.w;
            var10001 = 10;
            var10002 = super.w[10] + 1;
        }

        var10000[var10001] = var10002;
    }

    private void av() {
        byte var2 = 7;
        if(super.e[super.w[4]]) {
            var2 = 0;
        }

        super.e[super.w[4]] = false;
        int var3;
        if((var3 = c.a(super.w[2], super.w[3], super.w[2], super.w[3], 14, var2)) >= 0) {
            if(var3 == 0) {
                c.c[1] = super.w[3] - var2 << 8;
                super.e[super.w[4]] = true;
                super.b[super.w[4]] = true;
                this.b(super.w[2], 14);
                this.a(super.w[22]);
            } else {
                label31: {
                    if(var3 == 1) {
                        c.c[0] = super.w[2] - 14 - 12 << 8;
                        c.c[10] = 0;
                        if(!super.a[4]) {
                            break label31;
                        }
                    } else {
                        if(var3 != 2) {
                            break label31;
                        }

                        c.c[0] = super.w[2] + 14 + 12 + 1 << 8;
                        c.c[10] = 0;
                        if(!super.a[3]) {
                            break label31;
                        }
                    }

                    this.s();
                }
            }
        }

        if(super.s && super.ag == super.w[20] && var3 != 0) {
            super.s = false;
        }

    }

    private void aw() {
        byte var2 = 8;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        byte var6 = 0;
        byte var7 = 0;
        int var8 = super.w[2];
        super.w[11] = super.w[2];
        super.w[7] = super.w[3] + super.w[14];
        if(super.aj == 4) {
            var2 = 16;
        }

        byte var10000;
        label125: {
            if(super.w[4] == 5) {
                super.w[5] = super.k * 15 / 10 % 360;
                var5 = super.w[5];
                var10000 = 64;
            } else {
                if(super.w[4] != 1) {
                    break label125;
                }

                super.w[5] = super.k * 15 / 10 % 360;
                var5 = super.w[5];
                var10000 = -64;
            }

            var6 = var10000;
        }

        label119: {
            if(super.w[4] == 12) {
                super.w[5] = super.k * 15 / 10 % 360;
                var5 = super.w[5];
                var10000 = 48;
            } else if(super.w[4] == 11) {
                super.w[5] = super.k * 15 / 10 % 360;
                var5 = super.w[5];
                var10000 = -48;
            } else if(super.w[4] == 6) {
                super.w[5] = super.k * 15 / 10 % 360;
                var5 = super.w[5];
                var10000 = 64;
            } else if(super.w[4] == 2) {
                super.w[5] = super.k * 15 / 10 % 360;
                var5 = super.w[5];
                var10000 = -64;
            } else {
                if(super.w[4] != 16) {
                    break label119;
                }

                super.w[5] = super.k * 15 / 10 % 360;
                var5 = super.w[5];
                var10000 = -32;
            }

            var7 = var10000;
        }

        label110: {
            b var13;
            if(super.w[4] == 7) {
                if(super.e[128] && super.w[5] <= 0) {
                    ++super.w[5];
                }

                if(super.w[5] > 0) {
                    ++super.w[5];
                    if(super.w[5] > 90) {
                        super.w[3] -= 2;
                        if(super.w[3] < 368) {
                            super.w[3] = 368;
                        }
                    }
                }

                var13 = this;
            } else {
                if(super.w[4] != 3 || super.w[5] == 0) {
                    break label110;
                }

                ++super.w[5];
                if(super.w[5] > 40) {
                    super.w[6] += 80;
                    super.w[18] += super.w[6];
                }

                var13 = this;
            }

            var5 = var13.w[5];
        }

        label102: {
            int var11;
            int[] var14;
            byte var10001;
            int var10002;
            int var10003;
            if(super.w[4] == 3) {
                var11 = super.w[18] >> 8;
                var14 = super.w;
                var10001 = 3;
                var10002 = super.w[9];
                var10003 = var11;
            } else {
                if(super.w[4] == 7) {
                    break label102;
                }

                var11 = c.a(var5) * var7 / 100;
                super.w[3] = super.w[9] + var11;
                int var10 = c.a(var5) * var6 / 100;
                var14 = super.w;
                var10001 = 2;
                var10002 = super.w[8];
                var10003 = var10;
            }

            var14[var10001] = var10002 + var10003;
        }

        super.w[14] = 0;
        if(super.w[13] != 0) {
            super.w[14] = 4;
        }

        super.w[13] = 0;
        boolean var9 = false;
        var8 -= super.w[2];
        int var12;
        if((var12 = c.a(super.w[2], super.w[3] + super.w[14] + 32, super.w[11], super.w[7] + 32, 32, 8)) >= 0 && var12 == 0) {
            c.c[0] = c.a() - var8 << 8;
            c.c[1] = super.w[3] - var2 + super.w[14] << 8;
            if(super.w[4] == 3 && var5 == 0) {
                super.w[5] = 1;
            }

            this.b(super.w[2], 32);
            this.a(super.w[22]);
            super.w[13] = 1;
        }

        if(super.s && super.ag == super.w[20] && var12 != 0) {
            super.s = false;
        }

        if((var12 = c.a(super.w[2], super.w[3] + super.w[14] - 4, super.w[11], super.w[7] - 4, 32, 4)) >= 0 && var12 != 3) {
            c.c[0] = c.a() - var8 << 8;
            c.c[1] = super.w[3] - var2 + super.w[14] << 8;
            if(super.w[4] == 3 && var5 == 0) {
                super.w[5] = 1;
            }

            this.b(super.w[2], 32);
            this.a(super.w[22]);
            super.w[13] = 1;
        }

        if(super.s && super.ag == super.w[20] && var12 != 0) {
            super.s = false;
        }

    }

    private void ax() {
        this.aN();
    }

    private void ay() {
        int var4 = -1;
        super.w[6] = super.w[2];
        super.w[7] = super.w[3];

        for(int var1 = 0; var1 < 2; ++var1) {
            if(super.w[10 + var1] != 1 && (var4 = c.a(super.w[2] - 8 + (var1 << 4), super.w[3], super.w[6] - 8 + (var1 << 4), super.w[7], 8, 32)) >= 0) {
                byte var6 = -1;
                if(var4 == 1) {
                    var6 = 1;
                }

                if(var4 != 1 && var4 != 2) {
                    if(var4 == 3) {
                        c.c[1] = super.w[3] + 32 + 12 + 12 + 1 << 8;
                        this.B();
                    }
                } else {
                    if(Math.abs(c.c[10]) >= 300 && !c.g && c.i) {
                        c.c[10] -= 10 * var6;
                        super.w[10 + var1] = 1;
                        int var7 = 0;
                        byte var8 = 24;
                        if(super.aj == 0) {
                            var7 = super.w[4];
                            var8 = 26;
                        }

                        this.b(var8, super.w[2] - 8 + (var1 << 4), super.w[3] - 16 - 16, 30 * var6 + 360, 400, var7);
                        this.b(var8, super.w[2] - 8 + (var1 << 4), super.w[3] - 16 - 16 + 16, 60 * var6 + 360, 400, var7);
                        this.b(var8, super.w[2] - 8 + (var1 << 4), super.w[3] - 16 - 16 + 32, 40 * var6 + 360, 400, var7);
                        this.b(var8, super.w[2] - 8 + (var1 << 4), super.w[3] - 16 - 16 + 48, 50 * var6 + 360, 400, var7);
                    } else {
                        c.c[10] = 0;
                    }

                    if(c.c[10] == 0) {
                        int[] var10000;
                        byte var10001;
                        int var10002;
                        if(var6 == 1) {
                            var10000 = c.c;
                            var10001 = 0;
                            var10002 = super.w[2] - 8 - 12;
                        } else {
                            var10000 = c.c;
                            var10001 = 0;
                            var10002 = super.w[2] + 8 + 12 + 1;
                        }

                        var10000[var10001] = var10002 - 8 + (var1 << 4) << 8;
                        if(var6 == 1) {
                            if(super.a[4]) {
                                this.s();
                            }
                        } else if(super.a[3]) {
                            this.s();
                        }
                    }
                }
            }
        }

        if(super.w[10] == 1 && super.w[11] == 1) {
            super.w[0] = 0;
        }

        if(super.s && super.ag == super.w[20] && var4 != 0) {
            super.s = false;
        }

    }

    private void az() {
        int var4 = 0;
        int var5 = 0;
        boolean var6 = false;
        super.w[10] = super.k;
        super.w[6] = super.w[2];
        super.w[7] = super.w[3];

        for(int var1 = 0; var1 < 8; ++var1) {
            if(super.w[15] != 0 && (var4 = super.k - super.w[16] - c.m[var1]) < 0) {
                var4 = 0;
            }

            int var7 = c.l[var1];
            int var10000 = var4 != 0?-1:c.a(c.a(), c.b() - 12, c.b[0], c.b[1] - 12, 12, 12, super.w[2] + ((var7 % 4 << 4) - 16 - 8), super.w[3] + (var7 >> 2 << 4), super.w[6] + ((var7 % 4 << 4) - 16 - 8), super.w[7] + (var7 >> 2 << 4), 8, 8);
            var5 = var10000;
            if(var10000 >= 0) {
                if(var5 == 0) {
                    var6 = true;
                    c.c[1] = super.w[3] + (var7 >> 2 << 4) + var4 * 5 - 8 << 8;
                    this.b(super.w[2] + ((var7 % 4 << 4) - 16 - 8), 8);
                    this.a(super.w[22]);
                    if(super.w[15] == 0) {
                        super.w[16] = super.k;
                    }

                    super.w[15] = 1;
                } else {
                    if(var5 == 1) {
                        c.c[0] = super.w[2] + ((var7 % 4 << 4) - 16 - 8) - 8 - 12 << 8;
                        c.c[10] = 0;
                        if(!super.a[4]) {
                            continue;
                        }
                    } else {
                        if(var5 != 2) {
                            continue;
                        }

                        c.c[0] = super.w[2] + ((var7 % 4 << 4) - 16 - 8) + 8 + 12 + 1 << 8;
                        c.c[10] = 0;
                        if(!super.a[3]) {
                            continue;
                        }
                    }

                    this.s();
                }
            }
        }

        if(var6) {
            var5 = 0;
        }

        if(super.s && super.ag == super.w[20] && var5 != 0) {
            super.s = false;
        }

    }

    private void aA() {
        int var3;
        if((var3 = c.a(super.w[2], super.w[3], super.w[2], super.w[3], 14, 14)) >= 0) {
            if(var3 == 0) {
                if(c.i) {
                    label50: {
                        super.w[0] = 0;
                        c.g = true;
                        c.d = false;
                        c.i = true;
                        c.c[5] = -1280;
                        b var10000;
                        short var10001;
                        if(super.aw == 0) {
                            var10000 = this;
                            var10001 = 100;
                        } else if(super.aw == 100) {
                            var10000 = this;
                            var10001 = 200;
                        } else if(super.aw == 200) {
                            var10000 = this;
                            var10001 = 500;
                        } else {
                            if(super.aw != 500) {
                                break label50;
                            }

                            var10000 = this;
                            var10001 = 1000;
                        }

                        var10000.aw = var10001;
                    }

                    this.a(super.aw, true);
                    this.h(super.w[2], super.w[3], super.aw);
                    this.b(22, super.w[2] - 8, super.w[3] - 16, 330, 400, 0);
                    this.b(22, super.w[2] - 8, super.w[3] - 16, 300, 400, 1);
                    this.b(22, super.w[2] - 8, super.w[3] - 16, 390, 400, 2);
                    this.b(22, super.w[2] - 8, super.w[3] - 16, 420, 400, 3);
                    c.c[1] = super.w[3] - 14 << 8;
                } else {
                    c.c[1] = super.w[3] - 14 << 8;
                    if(c.p != 0) {
                        c.c[0] = c.a() + c.a(c.p + 90) * 24 / 100 << 8;
                        c.p = 0;
                    }

                    this.b(super.w[2], 14);
                    this.a(super.w[22]);
                }
            } else if(var3 == 1) {
                c.c[0] = super.w[2] - 14 - 12 << 8;
                c.c[10] = 0;
                if(super.a[4]) {
                    this.s();
                }
            } else if(var3 == 2) {
                c.c[0] = super.w[2] + 14 + 12 + 1 << 8;
                c.c[10] = 0;
                if(super.a[3]) {
                    this.s();
                }
            } else if(var3 == 3) {
                c.c[1] = super.w[3] + 14 + 12 + 12 + 1 << 8;
                this.B();
            }
        }

        if(super.s && super.ag == super.w[20] && var3 != 0) {
            super.s = false;
        }

    }

    private void aB() {
        if(super.w[5] == 0 && super.B == super.w[2] && super.C == super.w[3]) {
            super.w[5] = 32;
        }

        if(super.w[5] > 0) {
            ++super.w[5];
            if(super.w[5] > 32) {
                super.w[5] = 32;
            }
        }

        if(c.a(super.w[2], super.w[3] - 12, super.w[2], super.w[3] - 12, 8, 32) >= 0 && super.w[5] == 0) {
            super.w[5] = 1;
            super.B = c.a();
            super.C = c.b();
            super.D = super.x;
            super.E = super.y;
        }

    }

    private void aC() {
        if(super.w[4] < 16) {
            int var3;
            if((var3 = c.a(super.w[2], super.w[3], super.w[2], super.w[3], 8, 32)) >= 0) {
                if(var3 == 1) {
                    c.c[0] = super.w[2] - 8 - 12 << 8;
                    c.c[10] = 0;
                    if(super.a[4]) {
                        this.s();
                    }
                } else if(var3 == 2) {
                    c.c[0] = super.w[2] + 8 + 12 + 1 << 8;
                    c.c[10] = 0;
                    if(super.a[3]) {
                        this.s();
                    }
                } else if(var3 == 3) {
                    c.c[1] = super.w[3] + 32 + 12 + 12 + 1 << 8;
                    this.B();
                }
            }

            if(super.s && super.ag == super.w[20] && var3 != 0) {
                super.s = false;
            }
        }

    }

    private void aD() {
        super.w[6] = super.w[2];
        super.w[7] = super.w[3];
        int var5;
        if(super.w[12] == 1) {
            boolean var3 = false;
            var5 = (super.j - super.w[14]) * 4;
            super.w[14] = super.j;
            if(var5 > 0) {
                for(int var4 = var5; var4 >= 0; --var4) {
                    if(super.w[3] < super.w[7] + 1000) {
                        super.w[3] += 2;
                    }

                    if(this.b(super.w[2], super.w[3] + 16) && super.w[3] > super.w[7] - 1000) {
                        super.w[3] -= 2;
                        super.w[12] = 0;
                        break;
                    }

                    if(super.w[3] < 0) {
                        super.w[3] = 0;
                    }
                }
            }
        }

        if(super.w[4] != 0) {
            var5 = c.b(super.w[2], super.w[3], super.w[6], super.w[7], 16, 16);
            if(super.w[5] != 0) {
                super.w[7] = (super.j - super.w[13]) * 2;
                if(super.w[7] > 60) {
                    super.w[7] = 60;
                }
            }

            if(var5 >= 0) {
                label115: {
                    int[] var10000;
                    byte var10001;
                    int var10002;
                    if((!c.i || var5 == 3) && (c.g || !c.i || var5 != 3)) {
                        if(var5 == 0) {
                            c.c[1] = super.w[3] - 16 << 8;
                            this.b(super.w[2], 16);
                            this.a(super.w[22]);
                            break label115;
                        }

                        if(var5 == 1) {
                            c.c[0] = super.w[2] - 16 - 12 << 8;
                            c.c[10] = 0;
                            if(super.a[4]) {
                                this.s();
                            }
                            break label115;
                        }

                        if(var5 == 2) {
                            c.c[0] = super.w[2] + 16 + 12 + 1 << 8;
                            c.c[10] = 0;
                            if(super.a[3]) {
                                this.s();
                            }
                            break label115;
                        }

                        if(var5 != 3) {
                            break label115;
                        }

                        c.c[1] = super.w[3] + 16 + 12 + 12 + 1 << 8;
                        if(c.c[5] < 0) {
                            c.c[5] *= -1;
                        }

                        if(super.w[12] == 0) {
                            super.w[3] -= 5;
                            super.w[14] = super.j;
                        }

                        super.w[12] = 1;
                        if(c.g) {
                            break label115;
                        }

                        if(c.a() < super.w[2]) {
                            var10000 = c.c;
                            var10001 = 0;
                            var10002 = c.a() - 5;
                        } else {
                            var10000 = c.c;
                            var10001 = 0;
                            var10002 = c.a() + 5;
                        }

                        var10002 <<= 8;
                    } else {
                        c.c[5] = -768;
                        this.a(1, super.w[2], super.w[3], 0, 0, 0, 0);
                        super.w[5] = super.w[4];
                        super.w[13] = super.j;
                        this.c(super.w[4]);
                        var10000 = super.w;
                        var10001 = 4;
                        var10002 = 0;
                    }

                    var10000[var10001] = var10002;
                }
            }

            if(super.s && super.ag == super.w[20] && var5 != 0) {
                super.s = false;
            }

        }
    }

    private void aE() {
        super.w[6] = super.w[2];
        super.w[7] = super.w[3];
        if(super.w[5] == 1) {
            ++super.w[10];
            if(super.w[10] > 129) {
                super.w[10] = 129;
                super.w[5] = 2;
                this.o();
                return;
            }
        } else if(super.w[5] == 0 && c.a() > super.w[2] - 3 && super.w[3] + 48 > c.b()) {
            super.w[5] = 1;
            super.w[10] = 0;
            super.p = true;
        }

    }

    private void aF() {
        super.w[6] = super.w[2];
        super.w[7] = super.w[3];
        if(super.w[5] == 0) {
            if(c.a(super.w[2], super.w[3], super.w[6], super.w[7], 12, 12) >= 0) {
                super.w[5] = 1;
                super.w[11] = 0;
                this.a(c.n[super.w[4]], true);
                return;
            }
        } else if(super.w[5] == 1) {
            ++super.w[11];
            if(super.w[11] > 120) {
                super.w[5] = 2;
            }
        }

    }

    private void aG() {
        this.aF();
    }

    private void aH() {
        int var3;
        if((var3 = c.a(super.w[2], super.w[3], super.w[2], super.w[3], 16, 16)) >= 0 && var3 != 0) {
            if(var3 == 1) {
                c.c[0] = super.w[2] - 16 - 12 << 8;
                c.c[10] = 0;
            } else if(var3 == 2) {
                c.c[0] = super.w[2] + 16 + 12 + 1 << 8;
                c.c[10] = 0;
            } else if(var3 == 3) {
                c.c[1] = super.w[3] + 16 + 12 + 12 + 1 << 8;
                this.B();
            }
        }

        if(super.s && super.ag == super.w[20] && var3 != 0) {
            super.s = false;
        }

    }

    private void aI() {
        byte var1 = 32;
        byte var2 = 28;
        byte var3 = 4;
        if(super.w[4] == 1) {
            var1 = 12;
            var2 = 8;
            var3 = 0;
        }

        super.w[6] = super.w[2];
        super.w[7] = super.w[3];
        int var4;
        if((var4 = c.a(super.w[2], super.w[3] + var3, super.w[6], super.w[7] + var3, var1, var2)) >= 0) {
            if(var4 == 0) {
                c.c[1] = super.w[3] - var2 + var3 << 8;
                this.b(super.w[2], var1);
                this.a(super.w[22]);
                if(super.w[4] == 1 && super.w[5] == 0) {
                    super.p = true;
                    super.w[5] = 1;
                    super.w[3] += 8;
                    super.w[10] = super.k;
                    super.c = 2;
                }
            } else if(!super.C) {
                if(var4 == 1) {
                    c.c[0] = super.w[2] - var1 - 12 << 8;
                    c.c[10] = 0;
                    if(super.a[4]) {
                        this.s();
                    }
                } else if(var4 == 2) {
                    c.c[0] = super.w[2] + var1 + 12 + 1 << 8;
                    c.c[10] = 0;
                    if(super.a[3]) {
                        this.s();
                    }
                } else if(var4 == 3) {
                    c.c[1] = super.w[3] + var2 + 12 + 12 + 1 + var3 << 8;
                }
            }
        }

        if(super.w[5] == 1) {
            if((super.k - super.w[10]) % 20 == 0 && c.o.length > (super.k - super.w[10]) / 20) {
                this.a(1, super.w[8] + c.o[(super.k - super.w[10]) / 20], super.w[9] + c.p[(super.k - super.w[10]) / 20], 0, 0, 0, 0);
            }

            if(super.k - super.w[10] > 100) {
                super.w[5] = 2;
                super.w[10] = super.k;
                this.g(super.w[8] + 4, super.w[9] + 27 + 16, super.aj);
            }
        } else if(super.w[5] == 2 && super.k - super.w[10] > 180) {
            this.o();
            ++super.w[5];
        }

        if(super.s && super.ag == super.w[20] && var4 != 0) {
            super.s = false;
        }

    }

    private void aJ() {
        if(c.c(super.w[2], super.w[3], super.w[2], super.w[3], 8, 8) >= 0) {
            int var4 = Math.abs(c.a() - super.w[2]);
            int var5 = Math.abs(c.b() - 12 - super.w[3]);
            if(super.w[10] < 10) {
                this.h(super.w[2], super.w[3], 10);
                this.a(10, true);
                ++super.w[10];
            }

            int[] var10000;
            byte var10001;
            short var10002;
            if(c.a() - super.w[2] > 0) {
                var10000 = c.c;
                var10001 = 3;
                var10002 = 1792;
            } else {
                var10000 = c.c;
                var10001 = 3;
                var10002 = -1792;
            }

            var10000[var10001] = var10002 * var4 / (var4 + var5);
            if(c.b() - 12 - super.w[3] > 0) {
                var10000 = c.c;
                var10001 = 5;
                var10002 = 2048;
            } else {
                var10000 = c.c;
                var10001 = 5;
                var10002 = -2048;
            }

            var10000[var10001] = var10002 * var5 / (var4 + var5);
            if(!c.g) {
                c.c[3] = c.c[3] * 80 / 100;
                c.c[5] -= 1024;
            }

            c.c[10] = 0;
            c.c[13] = 0;
            c.c[14] = 0;
            c.g = true;
            c.d = false;
            c.h = true;
            super.s = false;
        }

    }

    private void aK() {
        int var3;
        if((var3 = c.c(super.w[2], super.w[3], super.w[2], super.w[3], 16, 16)) >= 0) {
            if(var3 == 0) {
                c.c[1] = super.w[3] - 16 << 8;
                this.b(super.w[2], 16);
                this.a(super.w[22]);
            } else {
                label36: {
                    int[] var10000;
                    byte var10001;
                    int var10002;
                    if(var3 == 1) {
                        c.c[0] = super.w[2] - 16 - 12 << 8;
                        if(super.a[4]) {
                            this.s();
                        }

                        c.c[10] = 0;
                        c.c[13] = 0;
                        var10000 = c.c;
                        var10001 = 14;
                        var10002 = 0;
                    } else if(var3 == 2) {
                        c.c[0] = super.w[2] + 16 + 12 + 1 << 8;
                        if(super.a[3]) {
                            this.s();
                        }

                        c.c[10] = 0;
                        c.c[13] = 0;
                        var10000 = c.c;
                        var10001 = 14;
                        var10002 = 0;
                    } else {
                        if(var3 != 3) {
                            break label36;
                        }

                        var10000 = c.c;
                        var10001 = 1;
                        var10002 = super.w[3] + 16 + 12 + 12 + 1 << 8;
                    }

                    var10000[var10001] = var10002;
                }
            }
        }

        if(super.s && super.ag == super.w[20] && var3 != 0) {
            super.s = false;
        }

    }

    private void aL() {
        int var1 = super.j;
        boolean var2 = false;
        byte var5 = 4;
        super.w[6] = super.w[2];
        super.w[7] = super.w[3];
        if(super.w[19] == 1) {
            var1 += 45;
        } else {
            label85: {
                int var10000;
                short var10001;
                if(super.w[19] == 2) {
                    var10000 = var1;
                    var10001 = 135;
                } else {
                    if(super.w[19] != 3) {
                        break label85;
                    }

                    var10000 = var1;
                    var10001 = 180;
                }

                var1 = var10000 + var10001;
            }
        }

        if(super.w[4] == 195 || super.w[4] == 179) {
            var5 = 2;
        }

        label92: {
            int[] var8;
            byte var9;
            int var10002;
            if(super.w[4] != 243 && super.w[4] != 195 && super.w[4] != 227 && super.w[4] != 179) {
                label67: {
                    int var11;
                    label66: {
                        int var6 = super.j;
                        int[] var10;
                        byte var10003;
                        if(super.w[4] == 2) {
                            if(super.w[19] != 0) {
                                if(var6 % 96 * 2 < 96) {
                                    var8 = super.w;
                                    var9 = 3;
                                    var10002 = super.w[9] - (96 - (var6 % 96 * 2 - 96)) + 64;
                                } else {
                                    var8 = super.w;
                                    var9 = 3;
                                    var10002 = super.w[9] - var6 % 96 * 2 + 64;
                                }
                                break label67;
                            }

                            if(var6 % 96 * 2 < 96) {
                                var8 = super.w;
                                var9 = 3;
                                var10002 = super.w[9];
                                var11 = var6 % 96 * 2;
                                break label66;
                            }

                            var8 = super.w;
                            var9 = 3;
                            var10 = super.w;
                            var10003 = 9;
                        } else {
                            if(super.w[4] != 1) {
                                break label92;
                            }

                            if(var6 % 96 * 2 < 96) {
                                var8 = super.w;
                                var9 = 2;
                                var10002 = super.w[8];
                                var11 = var6 % 96 * 2;
                                break label66;
                            }

                            var8 = super.w;
                            var9 = 2;
                            var10 = super.w;
                            var10003 = 8;
                        }

                        var10002 = var10[var10003];
                        var11 = 96 - (var6 % 96 * 2 - 96);
                    }

                    var10002 -= var11;
                }
            } else {
                this.n((360 / var5 - var1 % (360 / var5)) * var5, 16, 17);
                super.w[2] = super.w[8] + super.w[16] * 80 / 10000;
                var8 = super.w;
                var9 = 3;
                var10002 = super.w[9] + super.w[17] * 80 / 10000;
            }

            var8[var9] = var10002;
        }

        byte var7 = 12;
        if(!c.i && !c.k) {
            var7 = 20;
        }

        if(c.a(super.w[2], super.w[3], super.w[6], super.w[7], 16, 16) >= 0 || Math.abs(super.w[2] - c.a()) < 28 && Math.abs(super.w[3] - (c.b() - var7)) < var7 + 16) {
            this.u();
        }

    }

    private void aM() {
        boolean var1 = false;
        boolean var2 = false;
        byte var3 = 0;
        byte var4 = 0;
        byte var5 = 12;
        if(!c.i && !c.k) {
            var5 = 20;
        }

        if(super.w[18] == 0) {
            super.w[5] = super.j;
            super.w[18] = 1;
        }

        int var10;
        int var11;
        byte var10000;
        label156: {
            var11 = (var10 = super.j - super.w[5]) - 1;
            if(super.w[4] != 213 && super.w[4] != 181 && super.w[4] != 197 && super.w[4] != 101 && super.w[4] != 69 && super.w[4] != 53) {
                if(super.w[4] != 212 && super.w[4] != 196 && super.w[4] != 84 && super.w[4] != 68 && super.w[4] != 52) {
                    if(super.w[4] == 38) {
                        var10000 = 6;
                    } else {
                        if(super.w[4] != 195) {
                            break label156;
                        }

                        var10000 = 3;
                    }
                } else {
                    var10000 = 4;
                }
            } else {
                var10000 = 5;
            }

            var3 = var10000;
        }

        label157: {
            if(super.w[4] != 181 && super.w[4] != 101) {
                if(super.w[4] != 196 && super.w[4] != 197 && super.w[4] != 84 && super.w[4] != 195) {
                    if(super.w[4] != 213 && super.w[4] != 212 && super.w[4] != 69 && super.w[4] != 68) {
                        if(super.w[4] != 52 && super.w[4] != 53) {
                            if(super.w[4] != 38) {
                                break label157;
                            }

                            var10000 = 4;
                        } else {
                            var10000 = 6;
                        }
                    } else {
                        var10000 = 8;
                    }
                } else {
                    var10000 = 10;
                }
            } else {
                var10000 = 12;
            }

            var4 = var10000;
        }

        b var12;
        int var10001;
        if(super.w[4] != 69 && super.w[4] != 84 && super.w[4] != 101 && super.w[4] != 38 && super.w[4] != 68 && super.w[4] != 52 && super.w[4] != 53) {
            this.n((360 / var4 - var10 % (360 / var4)) * var4, 16, 17);
            var12 = this;
            var10001 = (360 / var4 - var11 % (360 / var4)) * var4;
        } else {
            this.n(360 - (360 / var4 - var10 % (360 / var4)) * var4 % 360, 16, 17);
            var12 = this;
            var10001 = 360 - (360 / var4 - var11 % (360 / var4)) * var4 % 360;
        }

        var12.n(var10001, 14, 15);
        if(super.w[4] == 84 || super.w[19] == 1) {
            this.n(var10 % (360 / var4) * var4, 16, 17);
            this.n(var11 % (360 / var4) * var4, 14, 15);
        }

        boolean var6 = false;
        byte var7 = 16;
        byte var8 = 16;
        if(super.aj == 4) {
            var7 = 8;
            var8 = 8;
        }

        for(int var9 = 1; var9 < var3; ++var9) {
            if(super.aj == 4) {
                var7 = 8;
                var8 = 8;
                if(c.a(c.a(), c.b() - var5, c.b[0], c.b[1] - var5, 12, var5, super.w[2] + var9 * super.w[16] * 16 / 10000, super.w[3] + var9 * super.w[17] * 16 / 10000, super.w[2] + var9 * super.w[14] * 16 / 10000, super.w[3] + var9 * super.w[15] * 16 / 10000, 6, 6) >= 0) {
                    this.u();
                }
            }
        }

        int var13;
        int var10002;
        int var10003;
        byte var10004;
        byte var10005;
        int var10006;
        int var10007;
        int var10008;
        int var10009;
        int var10010;
        int var10011;
        if(super.aj == 4) {
            var13 = c.a();
            var10001 = c.b() - var5;
            var10002 = c.b[0];
            var10003 = c.b[1] - var5;
            var10004 = 12;
            var10005 = var5;
            var10006 = super.w[2] + var3 * super.w[16] * (var7 << 1) / 10000;
            var10007 = super.w[3] + var3 * super.w[17] * (var7 << 1) / 10000;
            var10008 = super.w[2] + var3 * super.w[14] * (var7 << 1) / 10000;
            var10009 = super.w[3] + var3 * super.w[15] * (var7 << 1) / 10000;
            var10010 = var7 - 2;
            var10011 = var8 - 2;
        } else {
            var13 = c.a();
            var10001 = c.b() - var5;
            var10002 = c.b[0];
            var10003 = c.b[1] - var5;
            var10004 = 12;
            var10005 = var5;
            var10006 = super.w[2] + var3 * super.w[16] * var7 / 10000;
            var10007 = super.w[3] + var3 * super.w[17] * var7 / 10000;
            var10008 = super.w[2] + var3 * super.w[14] * var7 / 10000;
            var10009 = super.w[3] + var3 * super.w[15] * var7 / 10000;
            var10010 = 6;
            var10011 = 6;
        }

        if(c.a(var13, var10001, var10002, var10003, var10004, var10005, var10006, var10007, var10008, var10009, var10010, var10011) >= 0) {
            this.u();
        }

    }

    private void aN() {
        int var1 = 16;
        byte var2 = 16;
        int var3 = 0;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.w[6] = super.w[2];
        super.w[7] = super.w[3];
        byte var9;
        int[] var10000;
        byte var10001;
        int var10002;
        if(super.w[4] == 248 && super.ak == 2) {
            var9 = 64;
            var2 = 16;
            if(Math.abs(c.a() - super.w[8]) <= 64 && Math.abs(c.b() + 12 - (super.w[9] - 32 + 8)) <= 32) {
                super.b[super.w[4] - 240] = true;
            }

            if(Math.abs(c.a() - super.w[8]) <= 64 && Math.abs(c.b() + 12 - (super.w[9] + 48)) <= 32) {
                super.b[super.w[4] - 240] = false;
            }

            short var13;
            if(super.b[super.w[4] - 240] && super.w[3] > super.ah) {
                super.w[18] = 1;
                var10000 = super.w;
                var10001 = 5;
                var13 = 128;
            } else {
                super.w[18] = 1;
                var10000 = super.w;
                var10001 = 5;
                var13 = 0;
            }

            var10000[var10001] = var13;
            super.w[2] = super.w[8] + 128 - super.w[5];
            var1 = var9 - 1;
        } else if(super.w[4] != 241 || !super.b[128] || super.aj != 1 || super.ak != 3) {
            if(super.w[4] >= 240) {
                label296: {
                    var9 = 64;
                    var2 = 16;
                    int var10003;
                    if(super.w[19] == 0) {
                        if(super.b[super.w[4] - 240] && super.w[18] == 0) {
                            super.w[18] = 1;
                            super.w[5] = 128;
                            super.w[2] = super.w[8] + 128 - super.w[5];
                        }

                        super.w[18] = 1;
                        if(super.w[5] != 0) {
                            ++super.w[5];
                            if(super.w[5] > 128) {
                                super.w[5] = 128;
                            }

                            var10000 = super.w;
                            var10001 = 2;
                            var10002 = super.w[8] + 128 - super.w[5];
                            break label296;
                        }

                        if(super.b[super.w[4] - 240]) {
                            var10000 = super.w;
                            var10001 = 5;
                            var10002 = 1;
                            break label296;
                        }

                        var10000 = super.w;
                        var10001 = 2;
                        var10002 = super.w[8];
                        var10003 = 128;
                    } else {
                        if(super.b[super.w[4] - 240] && super.w[18] == 0) {
                            super.w[18] = 1;
                            super.w[5] = 128;
                            super.w[2] = super.w[8] + super.w[5];
                        }

                        super.w[18] = 1;
                        if(super.w[5] == 0) {
                            if(super.b[super.w[4] - 240]) {
                                var10000 = super.w;
                                var10001 = 5;
                                var10002 = 1;
                            } else {
                                var10000 = super.w;
                                var10001 = 2;
                                var10002 = super.w[8];
                            }
                            break label296;
                        }

                        ++super.w[5];
                        if(super.w[5] > 128) {
                            super.w[5] = 128;
                        }

                        var10000 = super.w;
                        var10001 = 2;
                        var10002 = super.w[8];
                        var10003 = super.w[5];
                    }

                    var10002 += var10003;
                }

                var10000[var10001] = var10002;
                var1 = var9 - 1;
            } else if(super.w[4] != 229 || super.aj != 1 || super.ak != 0) {
                if(super.w[4] >= 224) {
                    var9 = 8;
                    var2 = 32;
                    if(super.b[super.w[4] - 224] && super.w[18] == 0) {
                        super.w[18] = 1;
                        super.w[5] = 64;
                        super.w[3] = super.w[9] + 64 - super.w[5];
                    }

                    super.w[18] = 1;
                    if(super.w[5] == 0) {
                        if(super.b[super.w[4] - 224]) {
                            var10000 = super.w;
                            var10001 = 5;
                            var10002 = 1;
                        } else {
                            var10000 = super.w;
                            var10001 = 3;
                            var10002 = super.w[9] + 64;
                        }
                    } else {
                        ++super.w[5];
                        if(super.w[5] > 64) {
                            super.w[5] = 64;
                        }

                        var10000 = super.w;
                        var10001 = 3;
                        var10002 = super.w[9] + 64 - super.w[5];
                    }

                    var10000[var10001] = var10002;
                    var1 = var9 - 1;
                } else {
                    int var10;
                    if(super.w[4] == 19) {
                        var1 = 32;
                        var2 = 32;
                        ++super.w[5];
                        var10 = super.k % 360 > 90 && super.k % 360 < 270?33:32;
                        if(super.w[19] == 0) {
                            var10000 = super.w;
                            var10001 = 3;
                            var10002 = super.w[9] + c.a(super.k) * var10 / 100;
                        } else {
                            var10000 = super.w;
                            var10001 = 3;
                            var10002 = super.w[9] - c.a(super.k) * var10 / 100;
                        }

                        var10000[var10001] = var10002 - var10;
                        var6 = true;
                    } else if(super.w[4] >= 0 && super.w[4] <= 2) {
                        var1 = 16;
                        var2 = 16;
                        var3 = super.w[2];
                        if(super.w[4] != 0) {
                            ++super.w[5];
                            var10 = 32 * super.w[4];
                            if(super.w[19] == 0) {
                                var10000 = super.w;
                                var10001 = 2;
                                var10002 = super.w[8] + c.a(super.k) * var10 / 100;
                            } else {
                                var10000 = super.w;
                                var10001 = 2;
                                var10002 = super.w[8] - c.a(super.k) * var10 / 100;
                            }

                            var10000[var10001] = var10002 - var10;
                        }

                        var3 -= super.w[2];
                        var5 = true;
                    } else if(super.w[4] <= 91 && super.w[4] >= 88) {
                        var1 = 16;
                        var2 = 16;
                        var3 = super.w[2];
                        var10 = 32 * (super.w[4] - 88 + 1) - 16;
                        if(super.k % 720 < 180) {
                            if(super.w[19] == 0) {
                                super.w[3] = super.w[9] - c.a(90 + super.k % 720) * var10 / 100;
                                super.w[2] = super.w[8] - 16 + 32 * (super.w[4] - 88 + 1);
                            } else {
                                super.w[3] = super.w[9] + c.a(90 + super.k % 720) * var10 / 100;
                                super.w[2] = super.w[8] + 16 - 32 * (super.w[4] - 88 + 1);
                            }
                        } else {
                            label331: {
                                boolean var12;
                                if(super.k % 720 < 360) {
                                    if(super.w[19] == 0) {
                                        super.w[2] = super.w[8] - c.a(270 - (super.k % 720 - 180)) * var10 / 100;
                                        var10000 = super.w;
                                        var10001 = 3;
                                        var10002 = super.w[9] - 16 + 32 * (super.w[4] - 88 + 1);
                                    } else {
                                        super.w[2] = super.w[8] + c.a(270 - (super.k % 720 - 180)) * var10 / 100;
                                        var10000 = super.w;
                                        var10001 = 3;
                                        var10002 = super.w[9] + 16 - 32 * (super.w[4] - 88 + 1);
                                    }

                                    var10000[var10001] = var10002;
                                    var12 = true;
                                } else {
                                    if(super.k % 720 < 540) {
                                        if(super.w[19] == 0) {
                                            super.w[3] = super.w[9] + c.a(90 + (super.k % 720 - 360)) * var10 / 100;
                                            super.w[2] = super.w[8] + 16 - 32 * (super.w[4] - 88 + 1);
                                        } else {
                                            super.w[3] = super.w[9] - c.a(90 + (super.k % 720 - 360)) * var10 / 100;
                                            super.w[2] = super.w[8] - 16 + 32 * (super.w[4] - 88 + 1);
                                        }
                                        break label331;
                                    }

                                    if(super.k % 720 >= 720) {
                                        break label331;
                                    }

                                    if(super.w[19] == 0) {
                                        super.w[2] = super.w[8] + c.a(270 - (super.k % 720 - 540)) * var10 / 100;
                                        var10000 = super.w;
                                        var10001 = 3;
                                        var10002 = super.w[9] + 16 - 32 * (super.w[4] - 88 + 1);
                                    } else {
                                        super.w[2] = super.w[8] - c.a(270 - (super.k % 720 - 540)) * var10 / 100;
                                        var10000 = super.w;
                                        var10001 = 3;
                                        var10002 = super.w[9] - 16 + 32 * (super.w[4] - 88 + 1);
                                    }

                                    var10000[var10001] = var10002;
                                    var12 = true;
                                }

                                var5 = var12;
                            }
                        }

                        var3 -= super.w[2];
                    } else {
                        label340: {
                            if(super.w[4] == 160) {
                                var1 = 16;
                                var2 = 32;
                                if(super.b[0] && super.w[18] == 0) {
                                    super.w[18] = 1;
                                    super.w[3] = super.w[9];
                                }

                                super.w[18] = 1;
                                if(super.b[0]) {
                                    --super.w[3];
                                    if(super.w[3] >= super.w[9]) {
                                        break label340;
                                    }

                                    var10000 = super.w;
                                    var10001 = 3;
                                    var10002 = super.w[9];
                                } else if(super.ak == 0) {
                                    var10000 = super.w;
                                    var10001 = 3;
                                    var10002 = 688;
                                } else {
                                    var10000 = super.w;
                                    var10001 = 3;
                                    var10002 = super.w[9] + 64;
                                }
                            } else {
                                if(super.w[4] != 55) {
                                    break label340;
                                }

                                var1 = 32;
                                var2 = 25;
                                if(super.b[super.w[4] - 40] && super.w[18] == 0) {
                                    super.w[18] = 1;
                                    super.w[2] = 7992;
                                }

                                super.w[18] = 1;
                                if(super.w[8] == 7992 && super.w[9] == 1353 || !super.b[super.w[4] - 40]) {
                                    break label340;
                                }

                                ++super.w[2];
                                if(super.w[2] <= 7992) {
                                    break label340;
                                }

                                var10000 = super.w;
                                var10001 = 2;
                                var10002 = 7992;
                            }

                            var10000[var10001] = var10002;
                        }
                    }
                }
            }
        }

        byte var7 = 12;
        if(!c.i && !c.k) {
            var7 = 16;
        }

        int var8 = -1;
        if((super.w[4] != 55 || super.w[8] != 7992 || super.w[9] != 1353) && (var8 = c.a(c.a(), c.b() - var7, c.b[0], c.b[1] - var7, 12, var7, super.w[2], super.w[3], super.w[6], super.w[7], var1, var2)) >= 0) {
            if(var8 == 0) {
                c.c[1] = super.w[3] - var2 << 8;
                this.b(super.w[2], var1);
                this.a(super.w[22]);
                c.c[0] -= var3 << 8;
            } else if(var8 == 1) {
                if(!c.e || super.w[4] != 227) {
                    c.c[0] = super.w[2] - var1 - 12 << 8;
                    c.c[10] = 0;
                    if(super.a[4]) {
                        this.s();
                    }
                }
            } else if(var8 == 2) {
                c.c[0] = super.w[2] + var1 + 12 + 1 << 8;
                c.c[10] = 0;
                if(super.a[3]) {
                    this.s();
                }
            } else {
                label223: {
                    byte var11;
                    if(var8 == 3) {
                        var10000 = c.c;
                        var10001 = 1;
                        var10002 = super.w[3] + var2 + var7 + var7;
                        var11 = 1;
                    } else {
                        if(var8 != 4) {
                            break label223;
                        }

                        if(var5) {
                            label332: {
                                if(super.w[2] > c.a()) {
                                    if(c.e && super.w[4] == 227) {
                                        break label332;
                                    }

                                    c.c[0] = super.w[2] - var1 - 12 << 8;
                                    c.c[10] = 0;
                                    if(!super.a[4]) {
                                        break label332;
                                    }
                                } else {
                                    c.c[0] = super.w[2] + var1 + 12 + 1 << 8;
                                    c.c[10] = 0;
                                    if(!super.a[3]) {
                                        break label332;
                                    }
                                }

                                this.s();
                            }
                        }

                        if(!var6) {
                            break label223;
                        }

                        if(super.w[3] > c.b() - var7) {
                            c.c[1] = super.w[3] - var2 << 8;
                            this.b(super.w[2], var1);
                            this.a(super.w[22]);
                            c.c[0] -= var3 << 8;
                            var8 = 0;
                            break label223;
                        }

                        var10000 = c.c;
                        var10001 = 1;
                        var10002 = super.w[3] + var2 + var7 + var7 + 1;
                        var11 = 8;
                    }

                    var10000[var10001] = var10002 + var11 << 8;
                    this.B();
                }
            }
        }

        if(super.s && super.ag == super.w[20] && var8 != 0) {
            super.s = false;
        }

    }

    private void aO() {
        boolean var1 = false;
        short var2 = 0;
        boolean var3 = false;
        int var4 = super.w[4] / 16;
        if(super.w[18] == 0) {
            super.w[10] = super.k;
            super.w[18] = 1;
        }

        if((super.k - super.w[10]) % (var4 * 50) == 0 && super.w[2] - c.y[0] >= -16 && super.w[2] - c.y[0] <= 256 && super.w[3] - c.y[1] >= -16 && super.w[3] - c.y[1] <= 184) {
            b var10000;
            byte var10001;
            int var10002;
            int var10003;
            short var10004;
            short var10005;
            byte var10006;
            short var10007;
            if(super.w[4] != 48 && super.w[4] != 66 && super.w[4] != 65 && super.w[4] != 49 && super.w[4] != 80 && super.w[4] != 64 && super.w[4] != 81) {
                if(super.w[4] != 53 && super.w[4] != 37 && super.w[4] != 69) {
                    if(super.w[4] != 55 && super.w[4] != 71 && super.w[4] != 23) {
                        if(super.w[4] != 54) {
                            return;
                        }

                        var10000 = this;
                        var10001 = 16;
                        var10002 = super.w[2];
                        var10003 = super.w[3];
                        var10004 = -200;
                    } else {
                        var10000 = this;
                        var10001 = 16;
                        var10002 = super.w[2];
                        var10003 = super.w[3];
                        var10004 = 200;
                    }

                    var10005 = 0;
                } else {
                    var10000 = this;
                    var10001 = 16;
                    var10002 = super.w[2];
                    var10003 = super.w[3];
                    var10004 = 0;
                    var10005 = 200;
                }

                var10006 = 0;
                var10007 = 0;
            } else {
                if(super.w[4] == 48) {
                    var2 = 96;
                }

                if(super.w[4] == 49) {
                    var2 = 128;
                }

                if(super.w[4] == 64) {
                    var2 = 96;
                }

                if(super.w[4] == 65) {
                    var2 = 128;
                }

                if(super.w[4] == 66) {
                    var2 = 196;
                }

                if(super.w[4] == 80) {
                    var2 = 72;
                }

                if(super.w[4] == 81) {
                    var2 = 136;
                }

                var10000 = this;
                var10001 = 20;
                var10002 = super.w[2];
                var10003 = super.w[3];
                var10004 = 0;
                var10005 = 0;
                var10006 = 0;
                var10007 = var2;
            }

            var10000.a(var10001, var10002, var10003, var10004, var10005, var10006, var10007);
        }

    }

    private void aP() {
        byte var2 = 0;
        if(super.ak == 2) {
            var2 = 1;
        }

        if(super.w[4] == 16) {
            int[][] var3 = this.a(10, 2);

            int var1;
            for(var1 = 0; var1 < var3.length; ++var1) {
                if(Math.abs(super.w[2] + 32 - 64 * var2 - var3[var1][2]) < 2) {
                    if(super.w[5] == 0) {
                        super.w[5] = 1;
                        super.w[10] = super.k;
                    }

                    super.w[7] = var3[var1][20];
                    break;
                }
            }

            if(super.w[7] > 0) {
                for(var1 = 0; var1 < var3.length; ++var1) {
                    if(var3[var1][20] == super.w[7]) {
                        super.w[6] = var1;
                        break;
                    }
                }
            }

            if(super.w[10] != 0) {
                super.w[5] = super.k - super.w[10];
            }

            if(super.w[5] > 0 && super.w[7] > 0) {
                label61: {
                    int[] var10000;
                    byte var10001;
                    int var10002;
                    if(super.w[5] / 4 > 44) {
                        super.w[5] = 0;
                        super.w[6] = 0;
                        super.w[7] = 0;
                        var10000 = super.w;
                        var10001 = 10;
                        var10002 = 0;
                    } else {
                        int var10003;
                        if(super.w[5] / 4 > 26) {
                            var10000 = super.w;
                            var10001 = 3;
                            var10002 = super.w[9];
                            var10003 = 160 - (super.w[5] - 104) * 2;
                        } else {
                            if(super.w[5] / 4 <= 6) {
                                break label61;
                            }

                            var10000 = super.w;
                            var10001 = 3;
                            var10002 = super.w[9];
                            var10003 = (super.w[5] - 24) * 2;
                        }

                        var10002 -= var10003;
                    }

                    var10000[var10001] = var10002;
                }

                ++super.w[5];
            }

            if(super.w[4] == 16 && super.w[5] / 4 > 0 && super.w[2] - 20 - 32 <= c.a() && super.w[2] - 20 - 32 + 112 >= c.a() && super.w[3] <= c.b() && super.w[9] >= c.b()) {
                this.u();
            }
        }

    }

    private void aQ() {
        byte var2 = 72;
        int var3 = 0;
        if(super.w[6] == 0 && super.w[7] == 0) {
            super.w[6] = super.w[2];
            super.w[7] = super.w[3];
        }

        label113: {
            int var10000;
            if(super.w[4] == 1) {
                super.w[5] = super.k;
                var10000 = (c.a(super.w[5]) * 16 / 100 - 16 << 1) + 2;
            } else if(super.w[4] == 2) {
                super.w[5] = super.k;
                var10000 = (c.a(super.w[5]) * -16 / 100 + -16 << 1) + 2;
            } else {
                byte var10001;
                int var10002;
                int[] var5;
                if(super.w[4] == 20) {
                    var2 = 56;
                    if(super.w[5] == 0) {
                        if(super.e[1]) {
                            super.w[5] = 1;
                            var5 = super.w;
                            var10001 = 10;
                            var10002 = super.k;
                        } else {
                            var5 = super.w;
                            var10001 = 3;
                            var10002 = super.w[9] - 160;
                        }
                    } else {
                        super.w[5] = super.k - (super.w[10] - 1);
                        if(super.w[5] > 72) {
                            super.w[5] = 72;
                        }

                        var5 = super.w;
                        var10001 = 3;
                        var10002 = super.w[9] - 160 + super.w[5] * 2;
                    }

                    var5[var10001] = var10002;
                    var10000 = 16;
                } else {
                    if(super.w[4] != 4) {
                        break label113;
                    }

                    var2 = 56;
                    if(!super.e[0] && super.w[5] == 0) {
                        var5 = super.w;
                        var10001 = 3;
                        var10002 = super.w[9] - 160;
                    } else {
                        if(super.e[0] && super.w[5] == 0) {
                            super.w[10] = super.k;
                        }

                        super.w[5] = super.k - (super.w[10] - 1);
                        if(super.w[5] > 72) {
                            super.w[5] = 72;
                        }

                        var5 = super.w;
                        var10001 = 3;
                        var10002 = super.w[9] - 160 + super.w[5] * 2;
                    }

                    var5[var10001] = var10002;
                    var10000 = 16;
                }
            }

            var3 = var10000;
        }

        int var4;
        if((var4 = c.a(super.w[2], super.w[3] + var3, super.w[6], super.w[7], 32, var2)) >= 0) {
            if(var4 == 0) {
                c.c[1] = super.w[3] + var3 - var2 << 8;
                this.b(super.w[2], 32);
                this.a(super.w[22]);
            } else if(var4 == 1) {
                c.c[0] = super.w[2] - 32 - 12 << 8;
                c.c[10] = 0;
                if(super.a[4]) {
                    this.s();
                }
            } else if(var4 == 2) {
                c.c[0] = super.w[2] + 32 + 12 + 1 << 8;
                c.c[10] = 0;
                if(super.a[3]) {
                    this.s();
                }
            } else if(var4 == 3) {
                label129: {
                    c.c[1] = super.w[3] + var3 + var2 + 12 + 12 + 1 << 8;
                    b var6;
                    if(super.w[4] == 1 && (super.w[5] % 360 < 90 || super.w[5] % 360 > 270)) {
                        var6 = this;
                    } else {
                        if((super.w[4] != 2 || super.w[5] % 360 >= 270 || super.w[5] % 360 <= 90) && (super.w[4] == 1 || super.w[4] == 2)) {
                            break label129;
                        }

                        var6 = this;
                    }

                    var6.B();
                }
            }
        }

        if(super.s && super.ag == super.w[20] && var4 != 0) {
            super.s = false;
        }

        super.w[7] = super.w[3] + var3;
        super.w[6] = super.w[2];
    }

    private void aR() {
        this.aw();
    }

    private void aS() {
        byte var1 = 0;
        int var2 = (super.j >> 2) % 4 * 16;
        if((super.j >> 2) % 4 == 3) {
            var1 = 4;
            var2 = 16;
        }

        byte var10000;
        byte var10001;
        int var10002;
        byte var10003;
        byte var10004;
        int[] var10005;
        byte var10006;
        if(super.w[5] == 0) {
            var10000 = 0;
            var10001 = 0;
            var10002 = var2;
            var10003 = 16;
            var10004 = 16;
            var10005 = c.a;
            var10006 = var1;
        } else {
            var10000 = 0;
            var10001 = 16;
            var10002 = (super.k - super.w[10]) / 5 % 4 * 16;
            var10003 = 16;
            var10004 = 16;
            var10005 = c.a;
            var10006 = 0;
        }

        c.b(var10000, var10001, var10002, var10003, var10004, var10005[var10006], super.w[2], super.w[3]);
        if(super.w[11] == 1) {
            if(super.w[5] == 0) {
                var10000 = 0;
                var10001 = 0;
                var10002 = var2;
                var10003 = 16;
                var10004 = 16;
                var10005 = c.a;
                var10006 = var1;
            } else {
                var10000 = 0;
                var10001 = 16;
                var10002 = (super.k - super.w[10]) / 5 % 4 * 16;
                var10003 = 16;
                var10004 = 16;
                var10005 = c.a;
                var10006 = 0;
            }

            c.b(var10000, var10001, var10002, var10003, var10004, var10005[var10006], super.w[2], super.w[12]);
        }

    }

    private void aT() {
        boolean var1 = false;
        int var2 = c.a(super.j * 3) * 87;
        int var3 = super.w[4] + 1;
        if(super.w[4] == 5 || super.w[19] == 1) {
            var2 = -var2;
        }

        int var4;
        for(var4 = 1; var4 < var3; ++var4) {
            if(super.aj != 3) {
                byte var10000;
                byte var10001;
                byte var10002;
                if(super.aj != 5) {
                    var10000 = 3;
                    var10001 = 16;
                    var10002 = 32;
                } else {
                    var10000 = 3;
                    var10001 = 0;
                    var10002 = 96;
                }

                c.b(var10000, var10001, var10002, 16, 16, c.a[0], super.w[2] + var4 * c.a(180 + var2 / 100) * 16 / 100, super.w[3] + var4 * c.b(180 + var2 / 100) * 16 / 100);
            }
        }

        if(super.aj != 3 && super.aj != 5) {
            c.b(3, 16, 16, 16, 16, c.a[0], super.w[2], super.w[3]);
        }

        if(super.aj != 3) {
            if(super.aj != 5) {
                var4 = var3 * 16;
                var4 -= 8;
                c.b(3, 0, 0, 48, 16, c.a[0], super.w[2] + c.a(180 + var2 / 100) * var4 / 100, super.w[3] + c.b(180 + var2 / 100) * var4 / 100);
            }

        }
    }

    private void aU() {
        boolean var1 = false;
        if(c.b[5] != null) {
            int var2 = c.b[5].getHeight();
            int var3 = c.b[5].getWidth() / 3;

            for(int var4 = 0; var4 < 12; ++var4) {
                int var5;
                if((var5 = super.w[10] - Math.abs(super.w[5] - var4)) < 0) {
                    var5 = 0;
                }

                if(var4 == 0 || var4 == 11) {
                    var5 = 0;
                }

                c.b(5, var3 * 2, 0, var3, var2, c.a[0], super.w[2] - 96 + var4 * 16, super.w[3] + var5);
            }

        }
    }

    private void aV() {
        int[] var3 = new int[]{-4, 4};
        boolean var4 = false;

        for(int var5 = 0; var5 < 12; ++var5) {
            int var6 = (super.j / 10 + (12 - var5)) % 7;
            c.b(4, 0, var6 * 24, 16, 24, c.a[0], super.w[2] - 96 + var5 * 16, super.w[3] + var3[var6 / 4]);
        }

    }

    private void aW() {
        int var1 = c.a[0];
        int var2 = 0;
        boolean var3 = false;
        boolean var4 = false;
        if(super.w[4] != 0) {
            var1 = c.a[4];
        }

        if(super.w[5] != 0) {
            var2 = super.k / 2 - super.w[10];
        }

        for(int var11 = 0; var11 < 36; ++var11) {
            int var12 = (var12 = var2 - var11 * 3) < 0?0:var12 * (var2 / 6);
            int var13 = super.w[4] != 0?96 - var11 / 6 * 16 - 16:var11 / 6 * 16;
            c.b(6, var11 / 6 * 16, 96 - (var11 % 6 + 1) * 16, 16, 16, var1, super.w[2] + var13 - 40, super.w[3] + 96 - (var11 % 6 + 1) * 16 - 48 + var12 + 0);
        }

    }

    private void aX() {
        boolean var1 = false;
        int var2;
        int var4;
        if((var4 = super.w[4] == 21?2:(super.w[4] == 1?0:1)) == 2) {
            c.a(7, 16, 0, 128, 96, c.a[0], super.w[2], super.w[3] - 16, 3);
            if(super.w[16] >= 60) {
                boolean var3 = false;

                for(var2 = 0; var2 < 8; ++var2) {
                    int var5 = super.j - super.w[15];
                    if(var2 << 3 < var5) {
                        var5 = var2 << 3;
                    }

                    c.a(101, 0, (super.j + (var2 << 1)) % 4 * 32, 24, 32, c.a[0], super.w[2] + (var5 << 1) - 56, super.w[3] - c.d[var4][var5], 3);
                }
            }
        } else {
            if(var4 == 0) {
                c.a(7, 0, 96, 128, 80, c.a[0], super.w[2], super.w[3] - 16, 3);
                return;
            }

            for(var2 = 0; var2 < 4; ++var2) {
                c.a(7, 0, 0, 16, 96, c.a[0], super.w[2] + var2 * 16 - 32, super.w[3] - 48, 20);
            }
        }

    }

    private void aY() {
        int var1 = c.a[0];
        int var2 = (super.w[3] - super.w[9]) % 16;

        for(int var3 = 0; var3 <= (super.w[3] - super.w[9]) / 16; ++var3) {
            int var4 = super.w[9] - 24 + var3 * 16 + var2;
            if(var3 == 0) {
                int var5 = Math.max(c.d(super.w[9] - 24 - c.z[1] + 4), 0);
                c.a.clipRect(0, c.i + var5, c.g, c.h - var5);
            }

            c.b(94, 0, 8, 32, 16, var1, super.w[8], var4);
            if(var3 == 0) {
                c.a.setClip(0, c.i, c.g, c.h);
            }
        }

        c.b(94, 0, 0, 32, 8, var1, super.w[8], super.w[9] - 24);
        c.b(94, 0, 24, 32, 8, var1, super.w[2], super.w[3] - 16);
        byte var10000;
        byte var10001;
        byte var10002;
        byte var10003;
        byte var10004;
        int var10005;
        int var10006;
        int var10007;
        if(super.w[4] != 128 && super.w[4] != 2) {
            if(super.w[4] == 35) {
                var10000 = 95;
                var10001 = 0;
                var10002 = 0;
                var10003 = 32;
                var10004 = 24;
                var10005 = var1;
                var10006 = super.w[2];
            } else {
                if(super.w[4] != 17 && super.w[4] != 18) {
                    return;
                }

                c.b(8, 0, 24, 112, 32, var1, super.w[2], super.w[3] + 28);
                c.b(8, 0, 0, 48, 24, var1, super.w[2] - 24, super.w[3]);
                var10000 = 8;
                var10001 = 64;
                var10002 = 0;
                var10003 = 48;
                var10004 = 24;
                var10005 = var1;
                var10006 = super.w[2] + 24;
            }

            var10007 = super.w[3];
        } else {
            var10000 = 8;
            var10001 = 0;
            var10002 = 0;
            var10003 = 112;
            var10004 = 56;
            var10005 = var1;
            var10006 = super.w[2];
            var10007 = super.w[3] + 16;
        }

        c.b(var10000, var10001, var10002, var10003, var10004, var10005, var10006, var10007);
    }

    private void aZ() {
        if(c.b[9] != null) {
            byte var1 = 0;
            if(super.w[19] == 2) {
                var1 = 2;
            }

            int var2;
            int var3 = (var2 = c.b[9].getWidth()) / 5;
            int var4 = c.b[9].getHeight();
            int var5;
            if(super.w[4] == 48) {
                for(var5 = 0; var5 < 3; ++var5) {
                    c.b(9, 0, 0, var3, var4, c.a[var1], super.w[2] - 24 + var5 * 24, super.w[3]);
                }
            } else if(super.w[4] == 64) {
                if(super.aj != 1 || super.ak != 0 || super.w[4] != 64 || super.w[19] == 0) {
                    for(var5 = 0; var5 < 6; ++var5) {
                        c.b(9, var4 >> 1, 0, var3, var4, c.a[var1], super.w[2] - 60 + var5 * 24, super.w[3]);
                    }
                }
            } else {
                byte var10000;
                int var10001;
                byte var10002;
                int var10003;
                int var10004;
                int var10005;
                int var10006;
                int var10007;
                if(super.w[4] != 18 && super.w[4] != 16) {
                    if(super.w[4] == 82) {
                        if(super.w[19] == 0) {
                            var10000 = 9;
                            var10001 = var4 >> 1;
                            var10002 = 0;
                            var10003 = var3;
                            var10004 = var4;
                            var10005 = c.a[7];
                            var10006 = super.w[2];
                            var10007 = super.w[3];
                        } else {
                            var10000 = 9;
                            var10001 = var4 >> 1;
                            var10002 = 0;
                            var10003 = var3;
                            var10004 = var4;
                            var10005 = c.a[1];
                            var10006 = super.w[2];
                            var10007 = super.w[3];
                        }
                    } else if(super.w[4] == 32) {
                        var10000 = 9;
                        var10001 = var4 >> 1;
                        var10002 = 0;
                        var10003 = var3;
                        var10004 = var4;
                        var10005 = c.a[var1];
                        var10006 = super.w[2];
                        var10007 = super.w[3];
                    } else {
                        var10000 = 9;
                        var10001 = 0;
                        var10002 = 0;
                        var10003 = var2;
                        var10004 = var4;
                        var10005 = c.a[var1];
                        var10006 = super.w[2];
                        var10007 = super.w[3] - 4;
                    }
                } else {
                    int var6 = super.w[19] == 0?3:1;
                    var10000 = 9;
                    var10001 = 0;
                    var10002 = 0;
                    var10003 = var2;
                    var10004 = var4;
                    var10005 = c.a[var6];
                    var10006 = super.w[2];
                    var10007 = super.w[3];
                }

                c.b(var10000, var10001, var10002, var10003, var10004, var10005, var10006, var10007);
            }

        }
    }

    private void ba() {
        if(super.w[4] == 129) {
            for(int var1 = 0; var1 < 4; ++var1) {
                c.a(54, 0, super.w[2] - 62 + 31 * var1, super.w[3] - 16, 20);
            }
        } else {
            c.b(54, 0, 0, c.b[54].getWidth(), c.b[54].getHeight(), c.a[0], super.w[2], super.w[3]);
        }

    }

    private void bb() {
        c.b(11, 0, 0, c.b[11].getWidth(), c.b[11].getHeight(), c.a[0], super.w[2], super.w[3]);
    }

    private void bc() {
        if(super.w[4] != 2 && super.w[4] != 1) {
            int var1;
            if(super.w[4] == 65) {
                for(var1 = 0; var1 < 3; ++var1) {
                    c.b(54, 0, 0, 31, 32, c.a[0], super.w[2] + (var1 << 5), super.w[3]);
                }
            } else {
                byte var10000;
                byte var10001;
                byte var10002;
                byte var10003;
                byte var10004;
                int var10005;
                int var10006;
                int var10007;
                if(super.w[4] == 57) {
                    for(var1 = 1; var1 < 15; ++var1) {
                        c.b(12, 0, 24, 8, 24, c.a[0], super.w[2] - 64 + (var1 << 3), super.w[3] - 8);
                    }

                    c.b(12, 0, 0, 8, 24, c.a[0], super.w[2] - 64, super.w[3] - 8);
                    var10000 = 12;
                    var10001 = 0;
                    var10002 = 0;
                    var10003 = 8;
                    var10004 = 24;
                    var10005 = c.a[4];
                    var10006 = super.w[2] + 56;
                    var10007 = super.w[3] - 8;
                } else {
                    if(super.w[4] == 40) {
                        for(var1 = 0; var1 < 8; ++var1) {
                            c.b(12, 8, var1 % 2 * 24, 8, 24, c.a[0], super.w[2] - 32 + (var1 << 3), super.w[3] - 8);
                        }

                        return;
                    }

                    if(super.w[4] != 7 && super.w[4] != 4 || super.w[5] == 0) {
                        return;
                    }

                    var10000 = 12;
                    var10001 = 0;
                    var10002 = 0;
                    var10003 = 32;
                    var10004 = 16;
                    var10005 = c.a[4];
                    var10006 = super.w[2];
                    var10007 = super.w[3];
                }

                c.b(var10000, var10001, var10002, var10003, var10004, var10005, var10006, var10007);
            }
        } else {
            c.b(54, 0, 0, 31, 32, c.a[0], super.w[2], super.w[3]);
            if(super.w[4] == 2) {
                this.a((super.w[2] >> 4) - 1, (super.w[3] >> 4) - 1, 4, 4);
                return;
            }
        }

    }

    private void bd() {
        int var1;
        for(var1 = 0; var1 < 2; ++var1) {
            c.b(13, 0, (super.j + var1) % 3 * 32, 32, 32, c.a[0], super.w[2] + var1 * 32 + 48, super.w[3] + var1 * 32 - 16);
        }

        for(int var2 = 0; var2 < 4; ++var2) {
            var1 = super.w[2] - c.z[0] + (var2 >> 1) * 32 + 16;

            for(int var3 = 0; var3 < var1 / 32 + 2; ++var3) {
                c.b(99, 0, (super.j + var2) % 3 * 16, 32, 16, c.a[0], super.w[2] + (var2 >> 1) * 32 + 16 - var3 * 32, super.w[3] + var2 * 16 - 24);
            }
        }

    }

    private void be() {
        boolean var1 = false;
        int var2;
        if((var2 = super.w[5] / 4) != 0 && super.w[3] - 32 < super.w[9]) {
            c.c(98, 0, 32 * (super.j % 2), 64, 32, c.a[0], super.w[2] - 32, super.w[3] - 32);
        }

        if(var2 > 6) {
            var2 = 6;
        }

        int var3;
        for(var3 = 1; var3 < var2; ++var3) {
            byte var10000;
            byte var10001;
            int var10002;
            byte var10003;
            byte var10004;
            if(super.w[3] - var3 * 32 < super.w[9]) {
                var10000 = 14;
                var10001 = 0;
                var10002 = 32 * (var3 % 2);
                var10003 = 64;
                var10004 = 32;
            } else {
                if(super.w[3] - var3 * 32 - 32 >= super.w[9]) {
                    continue;
                }

                var10000 = 14;
                var10001 = 0;
                var10002 = 32 * (var3 % 2);
                var10003 = 64;
                var10004 = 24;
            }

            c.c(var10000, var10001, var10002, var10003, var10004, c.a[0], super.w[2] - 32, super.w[3] - var3 * 32 - 32);
        }

        if(super.w[5] / 4 != 0 && super.w[3] - var3 * 32 - 32 < super.w[9]) {
            c.c(98, 0, 64 + 32 * (super.j % 2), 64, 32, c.a[0], super.w[2] - 32, super.w[3] - var3 * 32 - 32);
        }

        if(super.w[10] > 0 && c.q.length > super.w[10] / 3) {
            c.a(77, 0, 32 * c.q[super.w[10] / 3], 112, 32, c.a[0], super.w[8], super.w[9], 17);
        }

    }

    private void bf() {
        int var1 = c.b[15].getWidth();
        c.b[15].getHeight();
        byte var10000;
        byte var10001;
        byte var10002;
        int var10003;
        byte var10004;
        int var10005;
        int var10006;
        int var10007;
        byte var10008;
        if(super.e[super.w[4]]) {
            var10000 = 15;
            var10001 = 0;
            var10002 = 16;
            var10003 = var1;
            var10004 = 8;
            var10005 = c.a[0];
            var10006 = super.w[2];
            var10007 = super.w[3];
            var10008 = 1;
        } else {
            var10000 = 15;
            var10001 = 0;
            var10002 = 0;
            var10003 = var1;
            var10004 = 11;
            var10005 = c.a[0];
            var10006 = super.w[2];
            var10007 = super.w[3];
            var10008 = 3;
        }

        c.b(var10000, var10001, var10002, var10003, var10004, var10005, var10006, var10007 - var10008);
        c.b(15, 0, 11, var1, 5, c.a[0], super.w[2], super.w[3] + 5);
    }

    private void bg() {
        if(super.aj != 3) {
            if(super.w[4] != 16) {
                c.b(16, 0, 0, 64, 32, 0, super.w[2], super.w[3] + super.w[14]);
                return;
            }

            c.b(16, 0, 32, 64, 48, 0, super.w[2], super.w[3] + 8 + super.w[14]);

            for(int var1 = 5; var1 >= 0; --var1) {
                c.b(16, 0, 64, 64, 16, 0, super.w[2], super.w[3] + 8 + 48 - 16 + 16 * var1 + super.w[14]);
            }
        }

    }

    private void bh() {
        this.bx();
    }

    private void bi() {
        boolean var2 = false;
        int var3 = super.w[4] == 0?0:1;
        int var1;
        if(super.w[10] != 1) {
            for(var1 = 0; var1 < 4; ++var1) {
                c.c(18, var3 * 16, 0, 16, 16, 0, super.w[2] - 16, super.w[3] - 16 - 16 + var1 * 16);
            }
        }

        var3 = super.w[4] == 2?2:1;
        if(super.w[11] != 1) {
            for(var1 = 0; var1 < 4; ++var1) {
                c.c(18, var3 * 16, 0, 16, 16, 0, super.w[2], super.w[3] - 16 - 16 + var1 * 16);
            }
        }

    }

    private void bj() {
        int var4 = 0;
        if(super.w[5] < 129) {
            for(int var1 = 0; var1 < 8; ++var1) {
                int var3 = c.l[var1];
                if(c.l[var1] % 4 >= 2) {
                    var3 -= 2;
                }

                if(super.w[15] != 0 && (var4 = super.k - super.w[16] - c.m[var1]) < 0) {
                    var4 = 0;
                }

                int var5 = c.b[27].getWidth() / 4;
                c.b(27, var3 % 4 * var5, var3 / 4 * var5, var5, var5, 0, super.w[2] + c.l[var1] % 4 * 16 - 16 - 8, super.w[3] + c.l[var1] / 4 * 16 + var4 * (var4 / 5));
            }
        }

    }

    private void bk() {
        c.b(27, 0, 0, 32, 32, c.a[0], super.w[2], super.w[3]);
    }

    private void bl() {
        if(!super.t && !super.u) {
            byte var10000;
            byte var10001;
            byte var10002;
            byte var10003;
            byte var10004;
            int var10005;
            int var10006;
            int var10007;
            if(super.w[5] == 0) {
                var10000 = 36;
                var10001 = 0;
                var10002 = 16;
                var10003 = 16;
                var10004 = 16;
                var10005 = c.a[4];
                var10006 = super.w[2];
                var10007 = super.w[3] - 32;
            } else {
                var10000 = 36;
                var10001 = 0;
                var10002 = 0;
                var10003 = 16;
                var10004 = 16;
                var10005 = c.a[4];
                var10006 = super.w[2] - c.a(90 * super.w[5] / 4) * 8 / 100;
                var10007 = super.w[3] - 24 + c.b(90 * super.w[5] / 4) * 8 / 100;
            }

            c.b(var10000, var10001, var10002, var10003, var10004, var10005, var10006, var10007 - 4);
            c.b(36, 0, 32, 16, 48, c.a[4], super.w[2], super.w[3] - 4);
        }
    }

    private void bm() {
        byte var1;
        label23: {
            var1 = 0;
            byte var10000;
            if(super.w[4] == 1) {
                var10000 = 1;
            } else if(super.w[4] == 2) {
                var10000 = 2;
            } else if(super.w[4] == 16) {
                var10000 = 3;
            } else if(super.w[4] == 17) {
                var10000 = 4;
            } else {
                if(super.w[4] != 18) {
                    break label23;
                }

                var10000 = 5;
            }

            var1 = var10000;
        }

        c.b(37, var1 * 16, 0, 16, 64, 0, super.w[2], super.w[3]);
    }

    private void bn() {
        byte var1 = 32;
        if(c.b[42] != null) {
            int var3 = c.b[42].getWidth();
            byte var4 = 0;
            if(super.w[4] < 7) {
                if(c.r[super.w[4]] == 8) {
                    var1 = 16;
                    var4 = 8;
                }

                int var5;
                if(super.w[5] != 0 && super.w[7] < 60) {
                    if(super.w[5] >= 7) {
                        return;
                    }

                    if((var5 = super.w[7]) >= 48) {
                        var5 = 48;
                    }

                    c.b(42, 8, c.r[super.w[5]] * var1 + 7, 16, 14, c.a[0], super.w[2], super.w[3] - var5);
                }

                if(c.r[super.w[4]] != 8) {
                    if(super.j % 2 == 0) {
                        var5 = c.r[super.w[4]] * var1;
                    } else {
                        var5 = (super.j % 6 / 2 + 5) * var1;
                    }
                } else {
                    var5 = 256;
                    var1 = 16;
                }

                c.b(42, 0, var5, var3, var1, c.a[0], super.w[2], super.w[3] + var4);
            }
        }
    }

    private void bo() {
        this.bn();
    }

    private void bp() {
        byte var1 = 0;
        if(super.w[10] / 3 > 22) {
            var1 = 48;
        }

        byte var10000;
        byte var10001;
        int var10002;
        if(super.w[5] != 2) {
            var10000 = 44;
            var10001 = 0;
            var10002 = var1 + super.w[10] / 3 % 4 * 48;
        } else {
            var10000 = 44;
            var10001 = 0;
            var10002 = 192;
        }

        c.b(var10000, var10001, var10002, 48, 48, 0, super.w[2], super.w[3] + 10);
        if(super.w[5] == 1) {
            c.b(0, 16, super.w[10] / 4 % 4 * 16, 16, 16, c.s[super.w[10] / 2 % 4], super.w[2] + c.t[super.w[10] / 4 % 10] - 32, super.w[3] + 10 + c.u[super.w[10] / 4 % 10] - 32);
        }

    }

    private void bq() {
        boolean var1 = false;
        int var2 = c.b[45].getWidth();
        int var6 = super.w[4] != 0 && super.w[4] != 3?(super.w[4] == 1?48:24):0;
        if(super.w[5] == 1) {
            c.b(45, 0, var6, var2, 24, 0, super.w[2], super.w[3]);
        }

    }

    private void br() {
        this.bq();
    }

    private void bs() {
        if(super.w[4] == 1) {
            byte var10000;
            byte var10001;
            byte var10002;
            byte var10003;
            byte var10004;
            int var10005;
            int var10006;
            int var10007;
            if(super.w[5] < 2) {
                c.b(55, super.j % 2 * 24, 96, 24, 16, c.a[0], super.w[2], super.w[3]);
                var10000 = 55;
                var10001 = 0;
                var10002 = 0;
                var10003 = 64;
                var10004 = 64;
                var10005 = c.a[0];
                var10006 = super.w[8];
                var10007 = super.w[9];
            } else {
                var10000 = 55;
                var10001 = 0;
                var10002 = 64;
                var10003 = 64;
                var10004 = 32;
                var10005 = c.a[0];
                var10006 = super.w[8];
                var10007 = super.w[9] + 16;
            }

            c.b(var10000, var10001, var10002, var10003, var10004, var10005, var10006, var10007 + 37);
        }

    }

    private void bt() {
        c.b(56, 0, 32, 32, 32, c.a[0], super.w[2], super.w[3]);
    }

    private void bu() {
        c.a(58, 0, super.w[2], super.w[3], 3);
    }

    private void bv() {
        c.b(super.w[2], super.w[3], 60, 0, c.a[0]);
    }

    private void n(int var1, int var2, int var3) {
        if(var1 < 0) {
            var1 += 360;
        }

        if(360 >= var1) {
            var1 -= var1 / 360 * 360;
        }

        if(var1 <= 90) {
            super.w[var2] = c.A[90 - var1];
            super.w[var3] = c.A[var1];
        }

        if(var1 > 90 && var1 <= 180) {
            super.w[var2] = -c.A[90 - (180 - var1)];
            super.w[var3] = c.A[180 - var1];
        }

        if(var1 > 180 && var1 <= 270) {
            super.w[var2] = -c.A[90 - (var1 - 180)];
            super.w[var3] = -c.A[var1 - 180];
        }

        if(var1 > 270 && var1 < 360) {
            super.w[var2] = c.A[90 - (360 - var1)];
            super.w[var3] = -c.A[360 - var1];
        }

    }

    private void bw() {
        byte var10000;
        byte var3;
        byte var4;
        int var5;
        label143: {
            boolean var1 = false;
            var3 = 0;
            var4 = 0;
            var5 = super.j - super.w[5];
            if(super.w[4] != 213 && super.w[4] != 181 && super.w[4] != 197 && super.w[4] != 101 && super.w[4] != 69 && super.w[4] != 53) {
                if(super.w[4] != 212 && super.w[4] != 196 && super.w[4] != 84 && super.w[4] != 68 && super.w[4] != 52) {
                    if(super.w[4] == 38) {
                        var10000 = 6;
                    } else {
                        if(super.w[4] != 195) {
                            break label143;
                        }

                        var10000 = 3;
                    }
                } else {
                    var10000 = 4;
                }
            } else {
                var10000 = 5;
            }

            var3 = var10000;
        }

        label144: {
            if(super.w[4] != 181 && super.w[4] != 101) {
                if(super.w[4] != 196 && super.w[4] != 197 && super.w[4] != 84 && super.w[4] != 195) {
                    if(super.w[4] != 213 && super.w[4] != 212 && super.w[4] != 69 && super.w[4] != 68) {
                        if(super.w[4] != 52 && super.w[4] != 53) {
                            if(super.w[4] != 38) {
                                break label144;
                            }

                            var10000 = 4;
                        } else {
                            var10000 = 6;
                        }
                    } else {
                        var10000 = 8;
                    }
                } else {
                    var10000 = 10;
                }
            } else {
                var10000 = 12;
            }

            var4 = var10000;
        }

        int var10001;
        b var6;
        if(super.w[4] != 69 && super.w[4] != 84 && super.w[4] != 101 && super.w[4] != 38 && super.w[4] != 68 && super.w[4] != 52 && super.w[4] != 53) {
            var6 = this;
            var10001 = (360 / var4 - var5 % (360 / var4)) * var4;
        } else {
            var6 = this;
            var10001 = 360 - (360 / var4 - var5 % (360 / var4)) * var4 % 360;
        }

        var6.n(var10001, 16, 17);
        if(super.w[4] == 84 || super.w[19] == 1) {
            this.n(var5 % (360 / var4) * var4, 16, 17);
        }

        int var2;
        byte var10002;
        byte var10003;
        int var7;
        if(super.aj != 4) {
            for(var2 = 1; var2 < var3; ++var2) {
                c.b(super.w[2] + var2 * super.w[16] * 16 / 10000, super.w[3] + var2 * super.w[17] * 16 / 10000, 60, 2, c.a[0]);
            }

            c.b(super.w[2], super.w[3], 60, 4, c.a[0]);
            var7 = super.w[2] + var2 * super.w[16] * 16 / 10000;
            var10001 = super.w[3] + var2 * super.w[17] * 16 / 10000;
            var10002 = 60;
            var10003 = 3;
        } else {
            for(var2 = 1; var2 < var3; ++var2) {
                c.b(super.w[2] + var2 * super.w[16] * 16 / 10000, super.w[3] + var2 * super.w[17] * 16 / 10000, 60, 1, c.a[0]);
            }

            c.b(super.w[2], super.w[3], 60, 1, c.a[0]);
            var7 = super.w[2] + var2 * super.w[16] * 16 / 10000;
            var10001 = super.w[3] + var2 * super.w[17] * 16 / 10000;
            var10002 = 60;
            var10003 = 1;
        }

        c.b(var7, var10001, var10002, var10003, c.a[0]);
    }

    private void bx() {
        int var1 = super.w[2];
        int var2 = super.w[3];
        if(super.w[4] >= 240) {
            for(int var3 = 0; var3 < 4; ++var3) {
                c.a(107, 0, var1 - 48 + var3 * 32, var2, 3);
            }
        } else {
            byte var10000;
            byte var10001;
            int var10002;
            int var10003;
            byte var10004;
            label60: {
                label47: {
                    label46: {
                        if(super.w[4] < 224) {
                            if(super.w[4] <= 2) {
                                var10000 = 17;
                                var10001 = 0;
                                var10002 = var1 - 16;
                                var10003 = var2 - 16;
                                var10004 = 20;
                                break label60;
                            }

                            if(super.w[4] == 19) {
                                c.a(17, 0, var1 - 32, var2 - 32, 20);
                                c.a(17, 0, var1, var2 - 32, 20);
                                c.a(17, 0, var1 - 32, var2, 20);
                                var10000 = 17;
                                var10001 = 0;
                                var10002 = var1;
                                var10003 = var2;
                                var10004 = 20;
                                break label60;
                            }

                            if(super.w[4] <= 91 && super.w[4] >= 88) {
                                var10000 = 21;
                                break label46;
                            }

                            if(super.w[4] == 160) {
                                c.a(17, 0, var1, var2 - 16, 3);
                                var10000 = 17;
                                var10001 = 0;
                                var10002 = var1;
                                var10003 = var2 + 16;
                                break label47;
                            }

                            if(super.w[4] != 55 || super.w[8] == 7992 && super.w[9] == 1353) {
                                return;
                            }
                        }

                        var10000 = 107;
                    }

                    var10001 = 0;
                    var10002 = var1;
                    var10003 = var2;
                }

                var10004 = 3;
            }

            c.a(var10000, var10001, var10002, var10003, var10004);
        }

    }

    private void by() {
        byte var1 = 0;
        byte var2 = -25;
        if(super.aj == 3) {
            if(super.w[4] == 54) {
                var1 = 4;
                var2 = 25;
            }

            c.b(75, 0, 0, 16, 32, c.a[var1], super.w[2] + var2, super.w[3]);
        }

    }

    private void bz() {
        int var1 = super.w[5] / 4;
        if(super.w[4] == 16 && var1 > 0) {
            var1 = var1 < 6?var1 % 2:var1 % 2 + 2;
            int var3 = c.b[14].getWidth();

            int var2;
            for(var2 = 0; var2 < (super.w[9] - super.w[3]) / 32; ++var2) {
                c.c(14, 0, var3 / 2 * (var2 % 2), var3, var3 / 2, c.a[0], super.w[2] - 20 + 24 - 32, super.w[3] - 48 + var2 * 32 + 16);
            }

            int var4;
            if((var4 = (super.w[9] - super.w[3]) % (var3 / 2)) > 0) {
                c.c(14, 0, var3 / 2 * (var2 % 2), var3, var4, c.a[0], super.w[2] - 20 + 24 - 32, super.w[3] - 48 + var2 * 32 + 16);
            }

            int var5 = c.b[77].getWidth();
            c.c(77, 0, c.v[var1], var5, c.v[var1 + 1] - c.v[var1], c.a[0], super.w[8] - 20 - 32, super.w[9] - 48);
            c.c(77, 0, c.v[var1 + 2], var5, c.v[var1 + 1 + 2] - c.v[var1 + 2], c.a[0], super.w[2] - 20 - 32, super.w[3] - 48);
        }

    }

    private void bA() {
        int var1;
        int var2;
        label23: {
            var1 = 0;
            var2 = 0;
            int var10000;
            if(super.w[4] == 1) {
                var1 = c.a(super.w[5]) * 16 / 100 - 16;
                var10000 = c.a(super.w[5]) * -9 / 100 + -9;
            } else {
                if(super.w[4] != 2) {
                    break label23;
                }

                var1 = c.a(super.w[5]) * -16 / 100 + -16;
                var10000 = c.a(super.w[5]) * 9 / 100 - 9;
            }

            var2 = var10000;
            var1 *= 2;
            var2 *= 2;
            var1 += 2;
            var2 += 2;
        }

        byte var16;
        byte var10001;
        byte var10002;
        byte var10003;
        byte var10004;
        int var10005;
        int var10006;
        int var10007;
        if(super.w[4] != 20 && super.w[4] != 4) {
            c.b(79, 0, 0, 32, 72, c.a[0], super.w[2] - 16, super.w[3] + var1 - 36);
            c.b(79, 0, 0, 32, 72, c.a[4], super.w[2] + 16, super.w[3] + var1 - 36);
            c.b(79, 0, 0, 32, 72, c.a[6], super.w[2] - 16, super.w[3] + var1 + 36);
            c.b(79, 0, 0, 32, 72, c.a[2], super.w[2] + 16, super.w[3] + var1 + 36);
            var16 = 79;
            var10001 = 0;
            var10002 = 72;
            var10003 = 32;
            var10004 = 32;
            var10005 = c.a[2];
            var10006 = super.w[2];
            var10007 = super.w[3] + var2 - 8 - 6;
        } else {
            var2 = c.a(super.k) * 28 / 100 - 28;
            c.b(79, 0, 0, 32, 56, c.a[0], super.w[2] - 16, super.w[3] - 28 + 16);
            c.b(79, 0, 0, 32, 56, c.a[4], super.w[2] + 16, super.w[3] - 28 + 16);
            c.b(79, 0, 0, 32, 56, c.a[6], super.w[2] - 16, super.w[3] + 28 + 16);
            c.b(79, 0, 0, 32, 56, c.a[2], super.w[2] + 16, super.w[3] + 28 + 16);
            var16 = 79;
            var10001 = 0;
            var10002 = 72;
            var10003 = 32;
            var10004 = 32;
            var10005 = c.a[2];
            var10006 = super.w[2];
            var10007 = super.w[3] + var2 + 28 + 1;
        }

        c.b(var16, var10001, var10002, var10003, var10004, var10005, var10006, var10007 + 8);
    }

    private void bB() {
        this.bg();
    }

    private void bC() {
        byte var1 = 16;
        byte var2 = 8;
        if(super.w[4] == 16 || super.w[4] == 18) {
            var1 = 8;
            var2 = 16;
        }

        if(super.w[5] > 0) {
            ++super.w[5];
            if(super.w[5] > 12) {
                super.w[5] = 0;
            }
        }

        int var3;
        if((var3 = c.c(super.w[2], super.w[3], super.w[2], super.w[3], var1, var2)) >= 0) {
            label94: {
                short var4 = 4096;
                int var5 = super.w[4] / 16;
                if(super.w[4] % 16 == 2) {
                    var4 = 2560;
                }

                if(var5 == 1) {
                    var1 = 7;
                } else {
                    var2 = 7;
                }

                int[] var10000;
                byte var10001;
                int var10002;
                if(var3 != 0 && var3 != 4) {
                    if(var3 == 1) {
                        c.c[0] = super.w[2] - var1 - 12 - 1 << 8;
                        c.c[10] = 0;
                        c.c[13] = 0;
                        c.c[14] = 0;
                        if(var5 != 1 || super.w[19] != 1) {
                            break label94;
                        }

                        super.av = 15;
                        c.c[10] = -var4;
                        c.c[12] = 1;
                        c.c[13] = 1;
                        c.c[14] = 1;
                        var10000 = super.w;
                        var10001 = 5;
                        var10002 = super.w[5] + 1;
                    } else if(var3 == 2) {
                        c.c[0] = super.w[2] + var1 + 12 + 1 << 8;
                        c.c[10] = 0;
                        c.c[13] = 0;
                        c.c[14] = 0;
                        if(var5 != 1 || super.w[19] != 0) {
                            break label94;
                        }

                        super.av = 15;
                        c.c[10] = var4;
                        c.c[12] = 0;
                        c.c[13] = 2;
                        c.c[14] = 2;
                        var10000 = super.w;
                        var10001 = 5;
                        var10002 = super.w[5] + 1;
                    } else {
                        if(var3 != 3) {
                            break label94;
                        }

                        if(var5 == 2) {
                            if(super.w[19] == 2) {
                                c.c[5] = var4;
                                c.g = true;
                                super.av = 30;
                            }

                            ++super.w[5];
                        }

                        var10000 = c.c;
                        var10001 = 1;
                        var10002 = super.w[3] + var2 + 12 + 12 + 1 << 8;
                    }
                } else {
                    c.c[1] = super.w[3] - var2 << 8;
                    if(var5 != 0) {
                        this.a(super.w[22]);
                        break label94;
                    }

                    if(super.w[5] == 4) {
                        c.c[1] = super.w[3] - 8 << 8;
                        c.g = true;
                        c.d = false;
                        c.c = true;
                        c.i = false;
                        super.aw = 0;
                        c.c[5] = c.b(0) * var4 / 100;
                    }

                    var10000 = super.w;
                    var10001 = 5;
                    var10002 = super.w[5] + 1;
                }

                var10000[var10001] = var10002;
            }
        }

        if(super.s && super.ag == super.w[20] && var3 != 0) {
            super.s = false;
        }

    }

    private void bD() {
        int[] var1 = super.w;
        int var2;
        int var3 = (var2 = super.w[19]) == 0?-2:2;
        if(!c.b(var1)) {
            label73: {
                int[] var10000;
                byte var10001;
                int var10002;
                switch(var1[14]) {
                case 1:
                    if(Math.abs(c.a() - var1[2]) >= 50) {
                        break label73;
                    }

                    var1[5] = 30;
                    var1[15] = 0;
                    var10000 = var1;
                    var10001 = 14;
                    var10002 = var1[14] + 1;
                    break;
                case 2:
                    byte var4;
                    if(c.a() > var1[2]) {
                        var10000 = var1;
                        var10001 = 19;
                        var4 = 1;
                    } else {
                        var10000 = var1;
                        var10001 = 19;
                        var4 = 0;
                    }

                    var10000[var10001] = var4;
                    if(var1[5] > 0) {
                        break label73;
                    }

                    var1[5] = 48;
                    var1[15] = 1;
                    if(var1[4] == 1) {
                        var10000 = var1;
                        var10001 = 14;
                        var10002 = 6;
                    } else {
                        var10000 = var1;
                        var10001 = 14;
                        var10002 = var1[14] + 1;
                    }
                    break;
                case 3:
                    this.a(var1);
                    if(var1[5] > 0) {
                        break label73;
                    }

                    var1[5] = 8;
                    var1[15] = 2;
                    var10000 = var1;
                    var10001 = 14;
                    var10002 = var1[14] + 1;
                    break;
                case 4:
                    this.a(var1);
                    if(var1[5] > 0) {
                        break label73;
                    }

                    var1[5] = 8;
                    var1[15] = 3;
                    var10000 = var1;
                    var10001 = 14;
                    var10002 = var1[14] + 1;
                    break;
                case 5:
                    var1[2] += var3;
                    this.a(var1);
                    var10000 = var1;
                    var10001 = 15;
                    var10002 = 4 + (super.j & 1);
                    break;
                case 6:
                    if(var1[5] > 0) {
                        break label73;
                    }

                    this.b(7, var1[2], var1[3], var2 == 0?270:90, 150, 0);
                    var1[5] = 60;
                    ++var1[14];
                case 7:
                    if(var1[5] > 0) {
                        break label73;
                    }

                    var1[15] = 0;
                    var1[5] = 10;
                    ++var1[14];
                case 8:
                    if(var1[5] > 0) {
                        break label73;
                    }

                    ++var1[14];
                case 9:
                    var10000 = var1;
                    var10001 = 15;
                    var10002 = -1;
                    break;
                default:
                    var1[15] = -1;
                    var10000 = var1;
                    var10001 = 14;
                    var10002 = 1;
                }

                var10000[var10001] = var10002;
            }

            if(var1[14] >= 3 && var1[14] <= 7) {
                this.d(var1);
            }

        }
    }

    private void bE() {
        int[] var1 = super.w;
        int var2;
        int var3 = (var2 = super.w[19]) == 0?-2:2;
        if(!c.b(var1)) {
            label86: {
                int[] var10000;
                byte var10001;
                int var4;
                label101: {
                    byte var10002;
                    label91: {
                        switch(var1[14]) {
                        case 1:
                            var1[18] = 0;
                            ++var1[14];
                        case 2:
                            break label91;
                        case 3:
                            --var1[6];
                            var1[15] = 2 + (super.j & 1);
                            if(var1[5] > 0) {
                                break label86;
                            }

                            var1[5] = 90;
                            ++var1[14];
                        case 4:
                            label74: {
                                --var1[6];
                                var1[15] = 4 + (super.j & 1);
                                if(var1[5] == 16) {
                                    var10000 = var1;
                                    var10001 = 18;
                                    var10002 = 1;
                                } else {
                                    if(var1[5] != 8) {
                                        break label74;
                                    }

                                    var10000 = var1;
                                    var10001 = 18;
                                    var10002 = 2;
                                }

                                var10000[var10001] = var10002;
                            }

                            if(var1[5] > 0) {
                                break label86;
                            }

                            var1[18] = 0;
                            this.b(7, var1[2] + (var2 == 0?-18:18), var1[3] + 24, var2 == 0?210:150, 150, 0);
                            var1[5] = 30;
                            ++var1[14];
                        case 5:
                            --var1[6];
                            if(var1[5] > 0) {
                                break label86;
                            }

                            ++var1[14];
                        case 6:
                            break;
                        default:
                            var10000 = var1;
                            var10001 = 14;
                            var4 = 1;
                            break label101;
                        }

                        var1[2] += var3;
                        var1[15] = super.j & 1;
                        if(var1[6] <= 480) {
                            break label86;
                        }

                        var10000 = var1;
                        var10001 = 14;
                        var4 = 2;
                        break label101;
                    }

                    var1[18] = 0;
                    if(var1[6] > 440) {
                        if(var1[19] == 0) {
                            var10000 = var1;
                            var10001 = 19;
                            var10002 = 1;
                        } else {
                            var10000 = var1;
                            var10001 = 19;
                            var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        var1[6] = 0;
                    }

                    if(c.a(var1, 160, 100)) {
                        var1[5] = 20;
                        var1[14] = 3;
                    }

                    var1[2] += var3;
                    var10000 = var1;
                    var10001 = 15;
                    var4 = super.j & 1;
                }

                var10000[var10001] = var4;
            }

            this.d(var1);
        }
    }

    private void bF() {
        int[] var1 = super.w;
        int var2;
        int var3 = (var2 = super.w[19]) == 0?-1:1;
        if(Math.abs(var1[2] - c.a()) <= 240 || Math.abs(var1[3] - c.b()) <= 168) {
            if(!c.b(var1)) {
                switch(var1[14]) {
                case 3:
                    if(var1[5] <= 0) {
                        c.b(var1);
                        var1[6] = 0;
                        --var1[14];
                    }
                    break;
                default:
                    var1[14] = 1;
                case 1:
                    ++var1[14];
                case 2:
                    var1[15] = (super.j >> 1) % 3;
                    var1[2] += var3;
                    this.a(var1);
                    if(this.c(var1)) {
                        var1[5] = 60;
                        ++var1[14];
                    }

                    if((super.j & 7) == 0) {
                        this.a(15, var1[2] - var3 * 20, var1[3] - 2, 0, 0, 0, 0);
                    }
                }

                this.d(var1);
            }
        }
    }

    private void bG() {
        int[] var1 = super.w;
        int var2 = super.w[19] == 0?-1:1;
        if(Math.abs(var1[2] - c.a()) <= 240 || Math.abs(var1[3] - c.b()) <= 168) {
            ++var1[5];
            if(c.c(var1[2], var1[3])) {
                var1[18] = 0;
            } else {
                int var3;
                int var4;
                if(var1[18] == 3 || var1[18] == 4) {
                    for(var3 = 0; var3 < 4; ++var3) {
                        var4 = 6 + var3 * 3;
                        if(this.a(var1[var4] >> 8, var1[var4 + 1] >> 8, 8, 8, var1[var4 + 2] == -1?0:1)) {
                            var1[var4 + 2] = var1[var4 + 2] == 1?-1:1;
                        }
                    }
                }

                label95: {
                    int[] var10000;
                    byte var10001;
                    int var10002;
                    switch(var1[18]) {
                    case 3:
                        var1[6] += 0 * var1[8];
                        var1[9] += 32 * var1[11];
                        var1[12] += 64 * var1[14];
                        var1[15] += 96 * var1[17];
                        if(var1[5] < 32) {
                            break label95;
                        }

                        var10000 = var1;
                        var10001 = 18;
                        var10002 = var1[18] + 1;
                        break;
                    case 4:
                        var1[6] += 96 * var1[8];
                        var1[9] += 64 * var1[11];
                        var1[12] += 32 * var1[14];
                        var1[15] += 0 * var1[17];
                        if(var1[5] < 64) {
                            break label95;
                        }

                        var10000 = var1;
                        var10001 = 18;
                        var10002 = var1[18] + 1;
                        break;
                    case 5:
                        if(var1[8] == var1[11] && var1[11] == var1[14] && var1[14] == var1[17]) {
                            var1[9] = var1[6] + (-var1[8] * 12 << 8);
                            var1[12] = var1[9] + (-var1[8] * 12 << 8);
                            var1[15] = var1[12] + (-var1[8] * 12 << 8);
                        }

                        var1[5] = 0;
                        var10000 = var1;
                        var10001 = 18;
                        var10002 = 3;
                        break;
                    default:
                        var1[18] = 1;
                    case 1:
                        var1[5] = 0;
                        var1[6] = var1[2] << 8;
                        var1[7] = var1[3] << 8;
                        var1[8] = var2;
                        var1[9] = var1[6] + (-var2 * 12 << 8);
                        var1[10] = var1[7];
                        var1[11] = var2;
                        var1[12] = var1[9] + (-var2 * 12 << 8);
                        var1[13] = var1[10];
                        var1[14] = var2;
                        var1[15] = var1[12] + (-var2 * 12 << 8);
                        var1[16] = var1[13];
                        var1[17] = var2;
                        ++var1[18];
                    case 2:
                        var1[7] = this.a(var1[6] >> 8, var1[7] >> 8, 8) << 8;
                        var1[10] = this.a(var1[9] >> 8, var1[10] >> 8, 8) << 8;
                        var1[13] = this.a(var1[12] >> 8, var1[13] >> 8, 8) << 8;
                        var1[16] = this.a(var1[15] >> 8, var1[16] >> 8, 8) << 8;
                        if(var1[5] < 8) {
                            break label95;
                        }

                        var1[5] = 0;
                        var10000 = var1;
                        var10001 = 18;
                        var10002 = var1[18] + 1;
                    }

                    var10000[var10001] = var10002;
                }

                for(var3 = 0; var3 < 4; ++var3) {
                    var4 = 7 + var3 * 3;
                    var1[var4] = this.a(var1[var4 - 1] >> 8, var1[var4] >> 8, 8) << 8;
                }

                for(var3 = 0; var3 < 3; ++var3) {
                    var4 = 7 + var3 * 3;
                    if(var1[7] + 4096 < var1[var4 + 3]) {
                        var1[var4 + 3] = var1[7];
                    }

                    if(Math.abs(var1[8] - var1[var4 + 4]) > 3072) {
                        var1[var4 + 4] += var1[8] << 8;
                    }
                }

                var1[2] = var1[6] >> 8;
                var1[3] = var1[7] >> 8;
                if(!this.d(var1) && this.a(var1[12] >> 8, var1[13] >> 8, 22, 10, false) != 0) {
                    this.b(14, var1[2], var1[3], 30 * var2 + 360, 300, 0);
                    this.b(14, var1[9] >> 8, var1[10] >> 8, 15 * var2 + 360, 300, 1);
                    this.b(14, var1[12] >> 8, var1[13] >> 8, -15 * var2 + 360, 300, 1);
                    this.b(14, var1[15] >> 8, var1[16] >> 8, -30 * var2 + 360, 300, 1);
                    var1[0] = 0;
                    this.u();
                }

            }
        }
    }

    private void bH() {
        int[] var1 = super.w;
        int var2 = super.w[19] == 0?-1:1;
        if(Math.abs(var1[2] - c.a()) <= 240 || Math.abs(var1[3] - c.b()) <= 168) {
            if(!c.b(var1)) {
                label50: {
                    int[] var10000;
                    byte var10001;
                    int var10002;
                    switch(var1[14]) {
                    case 4:
                        this.a(var1, 16);
                        if(var1[5] > 0) {
                            break label50;
                        }

                        var10000 = var1;
                        var10001 = 14;
                        var10002 = 1;
                        break;
                    default:
                        var1[14] = 1;
                    case 1:
                        var1[10] = 0;
                        var1[11] = 0;
                        var1[5] = 360;
                        ++var1[14];
                    case 2:
                        var1[15] = (super.j >> 2) % 3;
                        var1[10] = var2 * 20;
                        var1[12] += var1[10];
                        var1[13] += var1[11];
                        this.a(var1, 16);
                        var1[2] = var1[12] / 100;
                        var1[3] = var1[13] / 100;
                        if(this.c(var1) || var1[6] > 180) {
                            c.b(var1);
                            var1[6] = 0;
                        }

                        if(var1[5] > 0) {
                            break label50;
                        }

                        var1[15] = 1;
                        var1[5] = 60;
                        ++var1[14];
                    case 3:
                        this.a(var1, 16);
                        if(var1[5] < 12) {
                            var1[15] = 3;
                        }

                        if(var1[5] > 0) {
                            break label50;
                        }

                        this.b(9, var1[2] + 16, var1[3] - 16, 15, 240, 0);
                        this.b(9, var1[2] - 16, var1[3] - 16, 345, 240, 0);
                        var1[5] = 50;
                        var10000 = var1;
                        var10001 = 14;
                        var10002 = var1[14] + 1;
                    }

                    var10000[var10001] = var10002;
                }

                this.d(var1);
            }
        }
    }

    private void bI() {
        int[] var1 = super.w;
        if(!c.b(super.w)) {
            switch(var1[14]) {
            default:
                var1[14] = 1;
            case 1:
                var1[15] = -1;
                var1[8] = 0;
                var1[9] = 0;
                var1[10] = 0;
                var1[11] = 400;
                ++var1[14];
            case 2:
                if(c.a() - 160 < var1[2]) {
                    break;
                }

                ++var1[14];
            case 3:
                var1[10] = 500;
                var1[11] = 400;
                var1[15] = 0;
                var1[5] = 94;
                ++var1[14];
            case 4:
                var1[15] = super.j & 1;
                var1[10] = 400;
                if(var1[9] == 0 && this.a(var1[2], var1[3], 20, 20, 1)) {
                    var1[9] = 1;
                    var1[11] = -800;
                    var1[5] = 94;
                }

                if(var1[5] > 0) {
                    break;
                }

                var1[5] = 94;
                ++var1[14];
            case 5:
                var1[10] = 0;
                var1[11] = 0;
                var1[15] = 1;
                var1[5] = 20;
                ++var1[14];
            case 6:
                if(var1[5] > 0) {
                    break;
                }

                var1[15] = 2;
                var1[5] = 20;
                ++var1[14];
            case 7:
                if(var1[5] > 0) {
                    break;
                }

                var1[15] = 3;
                var1[5] = 60;
                ++var1[14];
            case 8:
                if(var1[5] > 0) {
                    break;
                }

                var1[15] = 2;
                var1[5] = 20;
                ++var1[14];
            case 9:
                if(var1[5] > 0) {
                    break;
                }

                var1[15] = 1;
                var1[5] = 20;
                ++var1[14];
            case 10:
                if(var1[5] <= 0) {
                    var1[5] = 94;
                    var1[14] = 3;
                }
            }

            var1[11] += 20;
            if(var1[11] > 400) {
                var1[11] = 400;
            }

            var1[12] += var1[10];
            var1[13] += var1[11];
            if(var1[11] > 0 && this.b(var1[12] / 100, var1[13] / 100 + 12)) {
                var1[9] = 0;

                for(int var2 = 0; var2 < 4; ++var2) {
                    this.b(var1[12] / 100, var1[13] / 100 + 12);
                    var1[13] -= 100;
                }

                if(var1[13] < 0) {
                    var1[13] = 0;
                }
            }

            var1[2] = var1[12] / 100;
            var1[3] = var1[13] / 100;
            if(var1[15] >= 0) {
                this.d(var1);
            }

        }
    }

    private void bJ() {
        int[] var1 = super.w;
        int var2 = super.w[19] == 0?-1:1;
        if(Math.abs(var1[2] - c.a()) <= 240 || Math.abs(var1[3] - c.b()) <= 168) {
            if(!c.b(var1)) {
                switch(var1[14]) {
                case 2:
                    break;
                default:
                    var1[14] = 1;
                case 1:
                    var1[10] = 0;
                    var1[11] = 0;
                    var1[5] = 120;
                    ++var1[14];
                }

                var1[15] = (super.j >> 2) % 3;
                var1[10] = var2 * 25;
                var1[12] += var1[10];
                var1[13] += var1[11];
                var1[2] = var1[12] / 100;
                var1[3] = var1[13] / 100;
                this.a(var1, 24);
                if(this.c(var1) || var1[6] > 240) {
                    c.b(var1);
                    var1[6] = 0;
                }

                if(var1[5] <= 0) {
                    var1[15] = 1;
                    var1[5] = 40;
                }

                this.d(var1);
            }
        }
    }

    private void bK() {
        int[] var1 = super.w;
        int var2 = super.w[19] == 0?-1:1;
        if(!c.b(var1)) {
            label47: {
                int var3 = super.j >> 2;
                int[] var10000;
                byte var10001;
                int var10002;
                switch(var1[14]) {
                case 2:
                    var1[15] = 1;
                    var1[3] += 2;
                    if(var1[3] < var1[9]) {
                        break label47;
                    }

                    var1[3] = var1[9];
                    var10000 = var1;
                    var10001 = 14;
                    var10002 = var1[14] + 1;
                    break;
                case 3:
                    var1[15] = c.a[var3 & 3];
                    var1[2] += var2;
                    if(Math.abs(var1[2] - c.a()) <= 80) {
                        break label47;
                    }

                    var10000 = var1;
                    var10001 = 14;
                    var10002 = var1[14] + 1;
                    break;
                case 4:
                    var1[15] = c.a[var3 & 3];
                    var1[2] += var2;
                    var1[3] -= 2;
                    if(!this.b(var1[2], var1[3] - 16)) {
                        break label47;
                    }

                    var10000 = var1;
                    var10001 = 14;
                    var10002 = 1;
                    break;
                default:
                    var1[14] = 1;
                case 1:
                    var1[15] = 0;
                    byte var4;
                    if(c.a() > var1[2]) {
                        var10000 = var1;
                        var10001 = 19;
                        var4 = 1;
                    } else {
                        var10000 = var1;
                        var10001 = 19;
                        var4 = 0;
                    }

                    var10000[var10001] = var4;
                    if(var1[3] + 40 > c.b() || var1[3] + 100 < c.b() || Math.abs(var1[2] - c.a()) >= 100) {
                        break label47;
                    }

                    var1[9] = c.b() - 16;
                    var10000 = var1;
                    var10001 = 14;
                    var10002 = var1[14] + 1;
                }

                var10000[var10001] = var10002;
            }

            this.d(var1);
        }
    }

    private void bL() {
        int[] var1 = super.w;
        if(!c.b(super.w)) {
            var1[15] = super.j >> 2 & 1;
            var1[3] = var1[17] - Math.abs(c.b(var1[6] % 180)) * 268 / 100;
            this.d(var1);
        }
    }

    private void bM() {
        if(super.j % 60 < 30) {
            if(super.s && super.ag == super.w[20]) {
                super.s = false;
            }

        } else {
            int var3 = c.c(super.w[2], super.w[3], super.w[2], super.w[3], 8, 32);
            if(super.w[5] == 1) {
                var3 = -1;
            }

            if(var3 >= 0 && var3 == 1) {
                c.c[0] = super.w[2] - 8 - 12 << 8;
            }

            if(super.s && super.ag == super.w[20] && var3 != 0) {
                super.s = false;
            }

        }
    }

    private void bN() {
        this.bM();
    }

    private void bO() {
        short var1 = 2;
        int var2 = super.w[4] / 16;
        if(super.w[4] % 16 == 2) {
            var1 = 153;
        }

        byte var3;
        label45: {
            var3 = 0;
            byte var10000;
            if(super.w[5] > 4) {
                var10000 = 2;
            } else {
                if(super.w[5] <= 0) {
                    break label45;
                }

                var10000 = 1;
            }

            var3 = var10000;
        }

        int var4 = c.a[0];
        switch(var2) {
        case 1:
            byte var10001;
            int[] var7;
            if(super.w[19] == 0) {
                var7 = c.a;
                var10001 = 1;
            } else {
                var7 = c.a;
                var10001 = 7;
            }

            var4 = var7[var10001];
            break;
        case 2:
            var4 = c.a[6];
        }

        byte var5 = 0;
        byte var6 = 0;
        if(var3 == 2) {
            label37: {
                byte var8;
                switch(var2) {
                case 0:
                    var8 = -8;
                    break;
                case 1:
                    if(super.w[19] == 0) {
                        var5 = 8;
                    } else {
                        var5 = -8;
                    }
                    break label37;
                case 2:
                    var8 = 8;
                    break;
                default:
                    break label37;
                }

                var6 = var8;
            }
        }

        c.b(super.w[2] + var5, super.w[3] + var6, var1, var3, var4);
    }

    private void bP() {
        if(super.aj == 0) {
            if(c.b[5] != null) {
                int var1 = c.b[5].getHeight();
                int var2 = c.b[5].getWidth() / 3 * 2;
                int var3 = c.a[0];
                if(super.w[19] == 0) {
                    var3 = c.a[4];
                }

                c.b(5, 0, 0, var2, var1, var3, super.w[2], super.w[3]);
            }
        }
    }

    private void bQ() {
        int var1 = super.w[19] == 0?-1:1;
        this.f(40);
        byte var10000;
        byte var10001;
        short var10002;
        byte var10003;
        byte var10004;
        int var10005;
        b var10006;
        if(super.w[18] == 1) {
            var10000 = 40;
            var10001 = 0;
            var10002 = 184;
            var10003 = 16;
            var10004 = 16;
            var10005 = super.w[19] == 0?0:c.a[4];
            var10006 = this;
        } else {
            if(super.w[18] != 2) {
                return;
            }

            var10000 = 40;
            var10001 = 16;
            var10002 = 184;
            var10003 = 16;
            var10004 = 16;
            var10005 = super.w[19] == 0?0:c.a[4];
            var10006 = this;
        }

        c.b(var10000, var10001, var10002, var10003, var10004, var10005, var10006.w[2] + var1 * 18, super.w[3] + 28);
    }

    private void bR() {
        c.b(61, 0, 16 * ((super.j >> 1) % 6), 32, 16, c.a[0], super.w[2], super.w[3]);
    }

    private void bS() {
        if(super.w[18] >= 1) {
            int var1 = super.w[18] == 3?super.w[5] >> 2:8 - (super.w[5] - 30 >> 2);

            int var10000;
            int var10001;
            int[] var10004;
            byte var10005;
            for(int var2 = 0; var2 < 3; ++var2) {
                int var3 = 15 - var2 * 3;
                var10000 = super.w[var3] >> 8;
                var10001 = (super.w[var3 + 1] >> 8) - (var2 == 1?var1:0);
                if(super.w[var3 + 2] == 1) {
                    var10004 = c.a;
                    var10005 = 4;
                } else {
                    var10004 = c.a;
                    var10005 = 0;
                }

                c.b(var10000, var10001, 49, 2, var10004[var10005]);
            }

            var10000 = super.w[6] >> 8;
            var10001 = (super.w[7] >> 8) - var1;
            int var10003 = super.w[18] > 3?1:0;
            if(super.w[8] == 1) {
                var10004 = c.a;
                var10005 = 4;
            } else {
                var10004 = c.a;
                var10005 = 0;
            }

            c.b(var10000, var10001, 49, var10003, var10004[var10005]);
        }
    }

    private void f(int var1) {
        if(super.w[15] >= 0) {
            int var2;
            label17: {
                var2 = c.a[0];
                int[] var10000;
                byte var10001;
                switch(super.w[19]) {
                case 1:
                    var10000 = c.a;
                    var10001 = 4;
                    break;
                case 2:
                    var10000 = c.a;
                    var10001 = 6;
                    break;
                case 3:
                    var10000 = c.a;
                    var10001 = 2;
                    break;
                default:
                    break label17;
                }

                var2 = var10000[var10001];
            }

            c.b(super.w[2], super.w[3], var1, super.w[15], var2);
        }
    }

    private void bT() {
        byte var10000;
        byte var10001;
        byte var10002;
        byte var10003;
        byte var10004;
        int var10005;
        int var10006;
        int var10007;
        byte var10008;
        if(super.j % 60 < 30) {
            c.b(92, 0, 0, 32, 16, c.a[0], super.w[2] + 8, super.w[3] - 32);
            var10000 = 92;
            var10001 = 0;
            var10002 = 0;
            var10003 = 32;
            var10004 = 16;
            var10005 = c.a[6];
            var10006 = super.w[2] + 8;
            var10007 = super.w[3];
            var10008 = 32;
        } else {
            c.b(92, 0, 0, 32, 16, c.a[1], super.w[2], super.w[3] - 16);
            var10000 = 92;
            var10001 = 0;
            var10002 = 0;
            var10003 = 32;
            var10004 = 16;
            var10005 = c.a[5];
            var10006 = super.w[2];
            var10007 = super.w[3];
            var10008 = 16;
        }

        c.b(var10000, var10001, var10002, var10003, var10004, var10005, var10006, var10007 + var10008);
    }

    private void bU() {
        this.bT();
    }

    static {
        short[][] var10000 = new short[][]{{0, 0, 16, 24, -4}, {0, 24, 16, 24, -4}, {0, 48, 16, 16, 0}};
    }
}
