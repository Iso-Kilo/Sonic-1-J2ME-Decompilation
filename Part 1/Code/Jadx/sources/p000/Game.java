package p000;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

/* renamed from: b */
public final class Game extends RunnableC0002c {

    /* renamed from: a */
    public long f11a;

    static {
        short[][] sArr = {new short[]{0, 0, 16, 24, -4}, new short[]{0, 24, 16, 24, -4}, new short[]{0, 48, 16, 16, 0}};
    }

    public Game(MIDlet mIDlet, int i) {
        super(mIDlet, i);
    }

    /* renamed from: a */
    private static void m6a(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        int i7 = iArr[4];
        int i8 = iArr[5];
        switch (i4) {
            case 1:
                i6 = RunnableC0002c.rotationQuadrants[4];
                i7 = -i7;
                break;
            case 2:
                i5 = RunnableC0002c.rotationQuadrants[6];
                i8 = -i8;
                i6 = i5;
                break;
            case 3:
                i5 = RunnableC0002c.rotationQuadrants[2];
                i7 = -i7;
                i8 = -i8;
                i6 = i5;
                break;
            default:
                i6 = 0;
                break;
        }
        RunnableC0002c.m147a(i, iArr[0], iArr[1], iArr[2], iArr[3], i6, i2 + ((i7 * 4) / 4), ((i8 * 4) / 4) + i3, 3);
    }

    /* renamed from: a */
    private static boolean m7a(int i, int i2, int i3, int i4) {
        if (i3 == -1 || ((i - RunnableC0002c.f98y[0]) + i3 >= 0 && RunnableC0002c.f51d >= (i - RunnableC0002c.f98y[0]) - i3)) {
            return i4 == -1 || ((i2 - RunnableC0002c.f98y[1]) + i4 >= 0 && 240 >= (i2 - RunnableC0002c.f98y[1]) - i4);
        }
        return false;
    }

    /* renamed from: aA */
    private void m8aA() {
        int i;
        Game bVar;
        int a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 14, 14);
        if (a >= 0) {
            if (a == 0) {
                if (RunnableC0002c.f74i) {
                    ((RunnableC0002c) this).objData[0] = 0;
                    RunnableC0002c.f67g = true;
                    RunnableC0002c.f52d = false;
                    RunnableC0002c.f74i = true;
                    RunnableC0002c.f47c[5] = -1280;
                    if (this.f212aw == 0) {
                        i = 100;
                        bVar = this;
                    } else if (this.f212aw == 100) {
                        i = 200;
                        bVar = this;
                    } else if (this.f212aw == 200) {
                        i = 500;
                        bVar = this;
                    } else {
                        if (this.f212aw == 500) {
                            i = 1000;
                            bVar = this;
                        }
                        mo37a(this.f212aw, true);
                        mo77h(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], this.f212aw);
                        m336b(22, ((RunnableC0002c) this).objData[2] - 8, ((RunnableC0002c) this).objData[3] - 16, 330, 400, 0);
                        m336b(22, ((RunnableC0002c) this).objData[2] - 8, ((RunnableC0002c) this).objData[3] - 16, 300, 400, 1);
                        m336b(22, ((RunnableC0002c) this).objData[2] - 8, ((RunnableC0002c) this).objData[3] - 16, 390, 400, 2);
                        m336b(22, ((RunnableC0002c) this).objData[2] - 8, ((RunnableC0002c) this).objData[3] - 16, 420, 400, 3);
                        RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 14) << 8;
                    }
                    bVar.f212aw = i;
                    mo37a(this.f212aw, true);
                    mo77h(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], this.f212aw);
                    m336b(22, ((RunnableC0002c) this).objData[2] - 8, ((RunnableC0002c) this).objData[3] - 16, 330, 400, 0);
                    m336b(22, ((RunnableC0002c) this).objData[2] - 8, ((RunnableC0002c) this).objData[3] - 16, 300, 400, 1);
                    m336b(22, ((RunnableC0002c) this).objData[2] - 8, ((RunnableC0002c) this).objData[3] - 16, 390, 400, 2);
                    m336b(22, ((RunnableC0002c) this).objData[2] - 8, ((RunnableC0002c) this).objData[3] - 16, 420, 400, 3);
                    RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 14) << 8;
                } else {
                    RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 14) << 8;
                    if (RunnableC0002c.sonicAngle != 0) {
                        RunnableC0002c.f47c[0] = (RunnableC0002c.mo33a() + ((RunnableC0002c.mo34a(RunnableC0002c.sonicAngle + 90) * 24) / 100)) << 8;
                        RunnableC0002c.sonicAngle = 0;
                    }
                    mo50b(((RunnableC0002c) this).objData[2], 14);
                    m313a(((RunnableC0002c) this).objData[22]);
                }
            } else if (a == 1) {
                RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - 14) - 12) << 8;
                RunnableC0002c.f47c[10] = 0;
                if (((RunnableC0002c) this).f163a[4]) {
                    m376s();
                }
            } else if (a == 2) {
                RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + 14) + 12) + 1) << 8;
                RunnableC0002c.f47c[10] = 0;
                if (((RunnableC0002c) this).f163a[3]) {
                    m376s();
                }
            } else if (a == 3) {
                RunnableC0002c.f47c[1] = ((((((RunnableC0002c) this).objData[3] + 14) + 12) + 12) + 1) << 8;
                mo7B();
            }
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* renamed from: aB */
    private void m9aB() {
        if (((RunnableC0002c) this).objData[5] == 0 && ((RunnableC0002c) this).f102B == ((RunnableC0002c) this).objData[2] && ((RunnableC0002c) this).f104C == ((RunnableC0002c) this).objData[3]) {
            ((RunnableC0002c) this).objData[5] = 32;
        }
        if (((RunnableC0002c) this).objData[5] > 0) {
            int[] iArr = ((RunnableC0002c) this).objData;
            iArr[5] = iArr[5] + 1;
            if (((RunnableC0002c) this).objData[5] > 32) {
                ((RunnableC0002c) this).objData[5] = 32;
            }
        }
        if (RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] - 12, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] - 12, 8, 32) >= 0 && ((RunnableC0002c) this).objData[5] == 0) {
            ((RunnableC0002c) this).objData[5] = 1;
            ((RunnableC0002c) this).f102B = RunnableC0002c.mo33a();
            ((RunnableC0002c) this).f104C = RunnableC0002c.mo48b();
            ((RunnableC0002c) this).f106D = ((RunnableC0002c) this).f330x;
            ((RunnableC0002c) this).f108E = ((RunnableC0002c) this).f332y;
        }
    }

    /* renamed from: aC */
    private void m10aC() {
        if (((RunnableC0002c) this).objData[4] < 16) {
            int a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 8, 32);
            if (a >= 0) {
                if (a == 1) {
                    RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - 8) - 12) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (((RunnableC0002c) this).f163a[4]) {
                        m376s();
                    }
                } else if (a == 2) {
                    RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + 8) + 12) + 1) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (((RunnableC0002c) this).f163a[3]) {
                        m376s();
                    }
                } else if (a == 3) {
                    RunnableC0002c.f47c[1] = ((((((RunnableC0002c) this).objData[3] + 32) + 12) + 12) + 1) << 8;
                    mo7B();
                }
            }
            if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a != 0) {
                ((RunnableC0002c) this).f320s = false;
            }
        }
    }

    /* renamed from: aD */
    private void m11aD() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        int a;
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        if (((RunnableC0002c) this).objData[12] == 1) {
            int i2 = (((RunnableC0002c) this).f302j - ((RunnableC0002c) this).objData[14]) * 4;
            ((RunnableC0002c) this).objData[14] = ((RunnableC0002c) this).f302j;
            if (i2 > 0) {
                while (true) {
                    if (i2 >= 0) {
                        if (((RunnableC0002c) this).objData[3] < ((RunnableC0002c) this).objData[7] + 1000) {
                            int[] iArr3 = ((RunnableC0002c) this).objData;
                            iArr3[3] = iArr3[3] + 2;
                        }
                        if (m340b(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + 16) && ((RunnableC0002c) this).objData[3] > ((RunnableC0002c) this).objData[7] - 1000) {
                            int[] iArr4 = ((RunnableC0002c) this).objData;
                            iArr4[3] = iArr4[3] - 2;
                            ((RunnableC0002c) this).objData[12] = 0;
                            break;
                        }
                        if (((RunnableC0002c) this).objData[3] < 0) {
                            ((RunnableC0002c) this).objData[3] = 0;
                        }
                        i2--;
                    } else {
                        break;
                    }
                }
            }
        }
        if (((RunnableC0002c) this).objData[4] != 0) {
            int b = RunnableC0002c.mo52b(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[6], ((RunnableC0002c) this).objData[7], 16, 16);
            if (((RunnableC0002c) this).objData[5] != 0) {
                ((RunnableC0002c) this).objData[7] = (((RunnableC0002c) this).f302j - ((RunnableC0002c) this).objData[13]) * 2;
                if (((RunnableC0002c) this).objData[7] > 60) {
                    ((RunnableC0002c) this).objData[7] = 60;
                }
            }
            if (b >= 0) {
                if ((RunnableC0002c.f74i && b != 3) || (!RunnableC0002c.f67g && RunnableC0002c.f74i && b == 3)) {
                    RunnableC0002c.f47c[5] = -768;
                    mo36a(1, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 0, 0, 0, 0);
                    ((RunnableC0002c) this).objData[5] = ((RunnableC0002c) this).objData[4];
                    ((RunnableC0002c) this).objData[13] = ((RunnableC0002c) this).f302j;
                    activateMonitorItem(((RunnableC0002c) this).objData[4]);
                    iArr = ((RunnableC0002c) this).objData;
                    i = 0;
                    c = 4;
                } else if (b == 0) {
                    RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 16) << 8;
                    mo50b(((RunnableC0002c) this).objData[2], 16);
                    m313a(((RunnableC0002c) this).objData[22]);
                } else if (b == 1) {
                    RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - 16) - 12) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (((RunnableC0002c) this).f163a[4]) {
                        m376s();
                    }
                } else if (b == 2) {
                    RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + 16) + 12) + 1) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (((RunnableC0002c) this).f163a[3]) {
                        m376s();
                    }
                } else if (b == 3) {
                    RunnableC0002c.f47c[1] = ((((((RunnableC0002c) this).objData[3] + 16) + 12) + 12) + 1) << 8;
                    if (RunnableC0002c.f47c[5] < 0) {
                        int[] iArr5 = RunnableC0002c.f47c;
                        iArr5[5] = iArr5[5] * -1;
                    }
                    if (((RunnableC0002c) this).objData[12] == 0) {
                        int[] iArr6 = ((RunnableC0002c) this).objData;
                        iArr6[3] = iArr6[3] - 5;
                        ((RunnableC0002c) this).objData[14] = ((RunnableC0002c) this).f302j;
                    }
                    ((RunnableC0002c) this).objData[12] = 1;
                    if (!RunnableC0002c.f67g) {
                        if (RunnableC0002c.mo33a() < ((RunnableC0002c) this).objData[2]) {
                            iArr2 = RunnableC0002c.f47c;
                            a = RunnableC0002c.mo33a() - 5;
                        } else {
                            iArr2 = RunnableC0002c.f47c;
                            a = RunnableC0002c.mo33a() + 5;
                        }
                        i = a << 8;
                        c = 0;
                        iArr = iArr2;
                    }
                }
                iArr[c] = i;
            }
            if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && b != 0) {
                ((RunnableC0002c) this).f320s = false;
            }
        }
    }

    /* renamed from: aE */
    private void m12aE() {
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        if (((RunnableC0002c) this).objData[5] == 1) {
            int[] iArr = ((RunnableC0002c) this).objData;
            iArr[10] = iArr[10] + 1;
            if (((RunnableC0002c) this).objData[10] > 129) {
                ((RunnableC0002c) this).objData[10] = 129;
                ((RunnableC0002c) this).objData[5] = 2;
                m373o();
            }
        } else if (((RunnableC0002c) this).objData[5] == 0 && RunnableC0002c.mo33a() > ((RunnableC0002c) this).objData[2] - 3 && ((RunnableC0002c) this).objData[3] + 48 > RunnableC0002c.mo48b()) {
            ((RunnableC0002c) this).objData[5] = 1;
            ((RunnableC0002c) this).objData[10] = 0;
            this.f314p = true;
        }
    }

    /* renamed from: aF */
    private void m13aF() {
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        if (((RunnableC0002c) this).objData[5] == 0) {
            if (RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[6], ((RunnableC0002c) this).objData[7], 12, 12) >= 0) {
                ((RunnableC0002c) this).objData[5] = 1;
                ((RunnableC0002c) this).objData[11] = 0;
                mo37a(RunnableC0002c.f86n[((RunnableC0002c) this).objData[4]], true);
            }
        } else if (((RunnableC0002c) this).objData[5] == 1) {
            int[] iArr = ((RunnableC0002c) this).objData;
            iArr[11] = iArr[11] + 1;
            if (((RunnableC0002c) this).objData[11] > 120) {
                ((RunnableC0002c) this).objData[5] = 2;
            }
        }
    }

    /* renamed from: aG */
    private void m14aG() {
        m13aF();
    }

    /* renamed from: aH */
    private void m15aH() {
        int a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, 16);
        if (a >= 0 && a != 0) {
            if (a == 1) {
                RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - 16) - 12) << 8;
                RunnableC0002c.f47c[10] = 0;
            } else if (a == 2) {
                RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + 16) + 12) + 1) << 8;
                RunnableC0002c.f47c[10] = 0;
            } else if (a == 3) {
                RunnableC0002c.f47c[1] = ((((((RunnableC0002c) this).objData[3] + 16) + 12) + 12) + 1) << 8;
                mo7B();
            }
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* renamed from: aI */
    private void m16aI() {
        int i;
        int i2 = 32;
        int i3 = 28;
        if (((RunnableC0002c) this).objData[4] == 1) {
            i2 = 12;
            i3 = 8;
            i = 0;
        } else {
            i = 4;
        }
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        int a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + i, ((RunnableC0002c) this).objData[6], ((RunnableC0002c) this).objData[7] + i, i2, i3);
        if (a >= 0) {
            if (a == 0) {
                RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - i3) + i) << 8;
                mo50b(((RunnableC0002c) this).objData[2], i2);
                m313a(((RunnableC0002c) this).objData[22]);
                if (((RunnableC0002c) this).objData[4] == 1 && ((RunnableC0002c) this).objData[5] == 0) {
                    this.f314p = true;
                    ((RunnableC0002c) this).objData[5] = 1;
                    int[] iArr = ((RunnableC0002c) this).objData;
                    iArr[3] = iArr[3] + 8;
                    ((RunnableC0002c) this).objData[10] = ((RunnableC0002c) this).f305k;
                    ((RunnableC0002c) this).f269c = 2;
                }
            } else if (!((RunnableC0002c) this).f105C) {
                if (a == 1) {
                    RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - i2) - 12) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (((RunnableC0002c) this).f163a[4]) {
                        m376s();
                    }
                } else if (a == 2) {
                    RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + i2) + 12) + 1) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (((RunnableC0002c) this).f163a[3]) {
                        m376s();
                    }
                } else if (a == 3) {
                    RunnableC0002c.f47c[1] = (((((((RunnableC0002c) this).objData[3] + i3) + 12) + 12) + 1) + i) << 8;
                }
            }
        }
        if (((RunnableC0002c) this).objData[5] == 1) {
            if ((((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10]) % 20 == 0 && RunnableC0002c.f88o.length > (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10]) / 20) {
                mo36a(1, ((RunnableC0002c) this).objData[8] + RunnableC0002c.f88o[(((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10]) / 20], ((RunnableC0002c) this).objData[9] + RunnableC0002c.f90p[(((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10]) / 20], 0, 0, 0, 0);
            }
            if (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10] > 100) {
                ((RunnableC0002c) this).objData[5] = 2;
                ((RunnableC0002c) this).objData[10] = ((RunnableC0002c) this).f305k;
                mo75g(((RunnableC0002c) this).objData[8] + 4, ((RunnableC0002c) this).objData[9] + 27 + 16, this.zoneID);
            }
        } else if (((RunnableC0002c) this).objData[5] == 2 && ((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10] > 180) {
            m373o();
            int[] iArr2 = ((RunnableC0002c) this).objData;
            iArr2[5] = iArr2[5] + 1;
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* renamed from: aJ */
    private void m17aJ() {
        int[] iArr;
        int i;
        int[] iArr2;
        char c;
        int i2;
        if (RunnableC0002c.m211c(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 8, 8) >= 0) {
            int abs = Math.abs(RunnableC0002c.mo33a() - ((RunnableC0002c) this).objData[2]);
            int abs2 = Math.abs((RunnableC0002c.mo48b() - 12) - ((RunnableC0002c) this).objData[3]);
            if (((RunnableC0002c) this).objData[10] < 10) {
                mo77h(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 10);
                mo37a(10, true);
                int[] iArr3 = ((RunnableC0002c) this).objData;
                iArr3[10] = iArr3[10] + 1;
            }
            if (RunnableC0002c.mo33a() - ((RunnableC0002c) this).objData[2] > 0) {
                iArr = RunnableC0002c.f47c;
                i = 1792;
            } else {
                iArr = RunnableC0002c.f47c;
                i = -1792;
            }
            iArr[3] = (i * abs) / (abs + abs2);
            if ((RunnableC0002c.mo48b() - 12) - ((RunnableC0002c) this).objData[3] > 0) {
                iArr2 = RunnableC0002c.f47c;
                c = 5;
                i2 = 2048;
            } else {
                iArr2 = RunnableC0002c.f47c;
                c = 5;
                i2 = -2048;
            }
            iArr2[c] = (i2 * abs2) / (abs + abs2);
            if (!RunnableC0002c.f67g) {
                RunnableC0002c.f47c[3] = (RunnableC0002c.f47c[3] * 80) / 100;
                int[] iArr4 = RunnableC0002c.f47c;
                iArr4[5] = iArr4[5] - 1024;
            }
            RunnableC0002c.f47c[10] = 0;
            RunnableC0002c.f47c[13] = 0;
            RunnableC0002c.f47c[14] = 0;
            RunnableC0002c.f67g = true;
            RunnableC0002c.f52d = false;
            RunnableC0002c.f71h = true;
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* renamed from: aK */
    private void m18aK() {
        int[] iArr;
        int i;
        char c;
        int c2 = RunnableC0002c.m211c(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, 16);
        if (c2 >= 0) {
            if (c2 == 0) {
                RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 16) << 8;
                mo50b(((RunnableC0002c) this).objData[2], 16);
                m313a(((RunnableC0002c) this).objData[22]);
            } else {
                if (c2 == 1) {
                    RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - 16) - 12) << 8;
                    if (((RunnableC0002c) this).f163a[4]) {
                        m376s();
                    }
                    RunnableC0002c.f47c[10] = 0;
                    RunnableC0002c.f47c[13] = 0;
                    iArr = RunnableC0002c.f47c;
                    c = 14;
                    i = 0;
                } else if (c2 == 2) {
                    RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + 16) + 12) + 1) << 8;
                    if (((RunnableC0002c) this).f163a[3]) {
                        m376s();
                    }
                    RunnableC0002c.f47c[10] = 0;
                    RunnableC0002c.f47c[13] = 0;
                    iArr = RunnableC0002c.f47c;
                    c = 14;
                    i = 0;
                } else if (c2 == 3) {
                    iArr = RunnableC0002c.f47c;
                    i = ((((((RunnableC0002c) this).objData[3] + 16) + 12) + 12) + 1) << 8;
                    c = 1;
                }
                iArr[c] = i;
            }
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && c2 != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* renamed from: aL */
    private void m19aL() {
        int i;
        int[] iArr;
        char c;
        int i2;
        int[] iArr2;
        char c2;
        int i3;
        int i4;
        int i5 = ((RunnableC0002c) this).f302j;
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        if (((RunnableC0002c) this).objData[19] == 1) {
            i5 += 45;
        } else {
            if (((RunnableC0002c) this).objData[19] == 2) {
                i = 135;
            } else if (((RunnableC0002c) this).objData[19] == 3) {
                i = 180;
            }
            i5 += i;
        }
        int i6 = (((RunnableC0002c) this).objData[4] == 195 || ((RunnableC0002c) this).objData[4] == 179) ? 2 : 4;
        if (((RunnableC0002c) this).objData[4] == 243 || ((RunnableC0002c) this).objData[4] == 195 || ((RunnableC0002c) this).objData[4] == 227 || ((RunnableC0002c) this).objData[4] == 179) {
            m119n(i6 * ((360 / i6) - (i5 % (360 / i6))), 16, 17);
            ((RunnableC0002c) this).objData[2] = ((RunnableC0002c) this).objData[8] + ((((RunnableC0002c) this).objData[16] * 80) / 10000);
            iArr = ((RunnableC0002c) this).objData;
            i2 = ((RunnableC0002c) this).objData[9] + ((((RunnableC0002c) this).objData[17] * 80) / 10000);
            c = 3;
        } else {
            int i7 = ((RunnableC0002c) this).f302j;
            if (((RunnableC0002c) this).objData[4] != 2) {
                if (((RunnableC0002c) this).objData[4] == 1) {
                    if ((i7 % 96) * 2 < 96) {
                        iArr = ((RunnableC0002c) this).objData;
                        i3 = ((RunnableC0002c) this).objData[8];
                        i4 = (i7 % 96) * 2;
                        c = 2;
                    } else {
                        int[] iArr3 = ((RunnableC0002c) this).objData;
                        iArr2 = ((RunnableC0002c) this).objData;
                        c2 = '\b';
                        c = 2;
                        iArr = iArr3;
                        i3 = iArr2[c2];
                        i4 = 96 - (((i7 % 96) * 2) - 96);
                    }
                }
                int i8 = (!RunnableC0002c.f74i || RunnableC0002c.f78k) ? 12 : 20;
                if (RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[6], ((RunnableC0002c) this).objData[7], 16, 16) >= 0 || (Math.abs(((RunnableC0002c) this).objData[2] - RunnableC0002c.mo33a()) < 28 && Math.abs(((RunnableC0002c) this).objData[3] - (RunnableC0002c.mo48b() - i8)) < i8 + 16)) {
                    m378u();
                }
                return;
            } else if (((RunnableC0002c) this).objData[19] != 0) {
                if ((i7 % 96) * 2 < 96) {
                    iArr = ((RunnableC0002c) this).objData;
                    i2 = (((RunnableC0002c) this).objData[9] - (96 - (((i7 % 96) * 2) - 96))) + 64;
                    c = 3;
                } else {
                    iArr = ((RunnableC0002c) this).objData;
                    i2 = (((RunnableC0002c) this).objData[9] - ((i7 % 96) * 2)) + 64;
                    c = 3;
                }
            } else if ((i7 % 96) * 2 < 96) {
                iArr = ((RunnableC0002c) this).objData;
                i3 = ((RunnableC0002c) this).objData[9];
                i4 = (i7 % 96) * 2;
                c = 3;
            } else {
                iArr = ((RunnableC0002c) this).objData;
                iArr2 = ((RunnableC0002c) this).objData;
                c2 = '\t';
                c = 3;
                i3 = iArr2[c2];
                i4 = 96 - (((i7 % 96) * 2) - 96);
            }
            i2 = i3 - i4;
        }
        iArr[c] = i2;
        if (!RunnableC0002c.f74i) {
        }
        if (RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[6], ((RunnableC0002c) this).objData[7], 16, 16) >= 0) {
            return;
        }
        m378u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0149  */
    /* renamed from: aM */
    private void m20aM() {
        int i;
        int i2;
        int i3;
        Game bVar;
        int i4;
        int a;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 12;
        if (!RunnableC0002c.f74i && !RunnableC0002c.f78k) {
            i16 = 20;
        }
        if (((RunnableC0002c) this).objData[18] == 0) {
            ((RunnableC0002c) this).objData[5] = ((RunnableC0002c) this).f302j;
            ((RunnableC0002c) this).objData[18] = 1;
        }
        int i17 = ((RunnableC0002c) this).f302j - ((RunnableC0002c) this).objData[5];
        int i18 = i17 - 1;
        if (((RunnableC0002c) this).objData[4] == 213 || ((RunnableC0002c) this).objData[4] == 181 || ((RunnableC0002c) this).objData[4] == 197 || ((RunnableC0002c) this).objData[4] == 101 || ((RunnableC0002c) this).objData[4] == 69 || ((RunnableC0002c) this).objData[4] == 53) {
            i15 = 5;
        } else if (((RunnableC0002c) this).objData[4] == 212 || ((RunnableC0002c) this).objData[4] == 196 || ((RunnableC0002c) this).objData[4] == 84 || ((RunnableC0002c) this).objData[4] == 68 || ((RunnableC0002c) this).objData[4] == 52) {
            i15 = 4;
        } else if (((RunnableC0002c) this).objData[4] == 38) {
            i15 = 6;
        } else if (((RunnableC0002c) this).objData[4] == 195) {
            i15 = 3;
        } else {
            i = 0;
            i2 = (((RunnableC0002c) this).objData[4] != 181 || ((RunnableC0002c) this).objData[4] == 101) ? 12 : (((RunnableC0002c) this).objData[4] == 196 || ((RunnableC0002c) this).objData[4] == 197 || ((RunnableC0002c) this).objData[4] == 84 || ((RunnableC0002c) this).objData[4] == 195) ? 10 : (((RunnableC0002c) this).objData[4] == 213 || ((RunnableC0002c) this).objData[4] == 212 || ((RunnableC0002c) this).objData[4] == 69 || ((RunnableC0002c) this).objData[4] == 68) ? 8 : (((RunnableC0002c) this).objData[4] == 52 || ((RunnableC0002c) this).objData[4] == 53) ? 6 : ((RunnableC0002c) this).objData[4] == 38 ? 4 : 0;
            if (((RunnableC0002c) this).objData[4] != 69 || ((RunnableC0002c) this).objData[4] == 84 || ((RunnableC0002c) this).objData[4] == 101 || ((RunnableC0002c) this).objData[4] == 38 || ((RunnableC0002c) this).objData[4] == 68 || ((RunnableC0002c) this).objData[4] == 52 || ((RunnableC0002c) this).objData[4] == 53) {
                m119n(360 - ((((360 / i2) - (i17 % (360 / i2))) * i2) % 360), 16, 17);
                i3 = 360 - ((((360 / i2) - (i18 % (360 / i2))) * i2) % 360);
                bVar = this;
            } else {
                m119n(((360 / i2) - (i17 % (360 / i2))) * i2, 16, 17);
                i3 = ((360 / i2) - (i18 % (360 / i2))) * i2;
                bVar = this;
            }
            bVar.m119n(i3, 14, 15);
            if (((RunnableC0002c) this).objData[4] == 84 || ((RunnableC0002c) this).objData[19] == 1) {
                m119n((i17 % (360 / i2)) * i2, 16, 17);
                m119n(i2 * (i18 % (360 / i2)), 14, 15);
            }
            int i19 = 16;
            int i20 = 16;
            if (this.zoneID == 4) {
                i19 = 8;
                i20 = 8;
            }
            for (i4 = 1; i4 < i; i4++) {
                if (this.zoneID == 4) {
                    if (RunnableC0002c.m135a(RunnableC0002c.mo33a(), RunnableC0002c.mo48b() - i16, RunnableC0002c.f40b[0], RunnableC0002c.f40b[1] - i16, 12, i16, ((RunnableC0002c) this).objData[2] + (((((RunnableC0002c) this).objData[16] * 16) * i4) / 10000), ((RunnableC0002c) this).objData[3] + (((((RunnableC0002c) this).objData[17] * 16) * i4) / 10000), ((RunnableC0002c) this).objData[2] + (((((RunnableC0002c) this).objData[14] * 16) * i4) / 10000), ((RunnableC0002c) this).objData[3] + (((((RunnableC0002c) this).objData[15] * 16) * i4) / 10000), 6, 6) >= 0) {
                        m378u();
                    }
                    i20 = 8;
                    i19 = 8;
                }
            }
            if (this.zoneID != 4) {
                int a2 = RunnableC0002c.mo33a();
                int b = RunnableC0002c.mo48b() - i16;
                i5 = RunnableC0002c.f40b[0];
                i6 = RunnableC0002c.f40b[1] - i16;
                i7 = 12;
                i8 = ((RunnableC0002c) this).objData[2] + (((((RunnableC0002c) this).objData[16] * (i19 << 1)) * i) / 10000);
                i9 = ((RunnableC0002c) this).objData[3] + (((((RunnableC0002c) this).objData[17] * (i19 << 1)) * i) / 10000);
                i10 = ((RunnableC0002c) this).objData[2] + (((((RunnableC0002c) this).objData[14] * (i19 << 1)) * i) / 10000);
                i11 = ((RunnableC0002c) this).objData[3] + (((((RunnableC0002c) this).objData[15] * (i19 << 1)) * i) / 10000);
                i12 = i19 - 2;
                i13 = i20 - 2;
                i14 = b;
                a = a2;
            } else {
                a = RunnableC0002c.mo33a();
                int b2 = RunnableC0002c.mo48b() - i16;
                i5 = RunnableC0002c.f40b[0];
                i6 = RunnableC0002c.f40b[1] - i16;
                i7 = 12;
                i8 = ((RunnableC0002c) this).objData[2] + (((((RunnableC0002c) this).objData[16] * i19) * i) / 10000);
                i9 = ((RunnableC0002c) this).objData[3] + (((((RunnableC0002c) this).objData[17] * i19) * i) / 10000);
                i10 = ((RunnableC0002c) this).objData[2] + (((((RunnableC0002c) this).objData[14] * i19) * i) / 10000);
                i11 = ((RunnableC0002c) this).objData[3] + (((i19 * ((RunnableC0002c) this).objData[15]) * i) / 10000);
                i12 = 6;
                i13 = 6;
                i14 = b2;
            }
            if (RunnableC0002c.m135a(a, i14, i5, i6, i7, i16, i8, i9, i10, i11, i12, i13) < 0) {
                m378u();
                return;
            }
            return;
        }
        i = i15;
        if (((RunnableC0002c) this).objData[4] != 181) {
        }
        if (((RunnableC0002c) this).objData[4] != 69) {
        }
        m119n(360 - ((((360 / i2) - (i17 % (360 / i2))) * i2) % 360), 16, 17);
        i3 = 360 - ((((360 / i2) - (i18 % (360 / i2))) * i2) % 360);
        bVar = this;
        bVar.m119n(i3, 14, 15);
        m119n((i17 % (360 / i2)) * i2, 16, 17);
        m119n(i2 * (i18 % (360 / i2)), 14, 15);
        int i192 = 16;
        int i202 = 16;
        if (this.zoneID == 4) {
        }
        while (i4 < i) {
        }
        if (this.zoneID != 4) {
        }
        if (RunnableC0002c.m135a(a, i14, i5, i6, i7, i16, i8, i9, i10, i11, i12, i13) < 0) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0a00, code lost:
        if (((p000.RunnableC0002c) r17).f163a[4] != false) goto L_0x0a02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0a6b, code lost:
        if (((p000.RunnableC0002c) r17).f163a[3] != false) goto L_0x0a02;
     */
    /* renamed from: aN */
    private void m21aN() {
        int[] iArr;
        char c;
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int[] iArr2;
        char c2;
        int i5;
        int[] iArr3;
        char c3;
        int i6;
        int[] iArr4;
        char c4;
        int a;
        int[] iArr5;
        char c5;
        int a2;
        int[] iArr6;
        char c6;
        int i7;
        int[] iArr7;
        char c7;
        int i8;
        int i9;
        int i10;
        int[] iArr8;
        char c8;
        int i11;
        int i12;
        int[] iArr9;
        char c9;
        int i13;
        int i14 = 16;
        int i15 = 16;
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        if (((RunnableC0002c) this).objData[4] == 248 && this.actID == 2) {
            if (Math.abs(RunnableC0002c.mo33a() - ((RunnableC0002c) this).objData[8]) <= 64 && Math.abs((RunnableC0002c.mo48b() + 12) - ((((RunnableC0002c) this).objData[9] - 32) + 8)) <= 32) {
                ((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 240] = true;
            }
            if (Math.abs(RunnableC0002c.mo33a() - ((RunnableC0002c) this).objData[8]) <= 64 && Math.abs((RunnableC0002c.mo48b() + 12) - (((RunnableC0002c) this).objData[9] + 48)) <= 32) {
                ((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 240] = false;
            }
            if (!((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 240] || ((RunnableC0002c) this).objData[3] <= this.f197ah) {
                ((RunnableC0002c) this).objData[18] = 1;
                iArr9 = ((RunnableC0002c) this).objData;
                c9 = 5;
                i13 = 0;
            } else {
                ((RunnableC0002c) this).objData[18] = 1;
                iArr9 = ((RunnableC0002c) this).objData;
                c9 = 5;
                i13 = 128;
            }
            iArr9[c9] = i13;
            ((RunnableC0002c) this).objData[2] = (((RunnableC0002c) this).objData[8] + 128) - ((RunnableC0002c) this).objData[5];
            z = false;
            z2 = false;
            i2 = 0;
            i3 = 16;
            i4 = 63;
        } else if (((RunnableC0002c) this).objData[4] == 241 && ((RunnableC0002c) this).f222b[128] && this.zoneID == 1 && this.actID == 3) {
            z = false;
            z2 = false;
            i2 = 0;
            i3 = 16;
            i4 = 16;
        } else if (((RunnableC0002c) this).objData[4] >= 240) {
            i3 = 16;
            if (((RunnableC0002c) this).objData[19] == 0) {
                if (((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 240] && ((RunnableC0002c) this).objData[18] == 0) {
                    ((RunnableC0002c) this).objData[18] = 1;
                    ((RunnableC0002c) this).objData[5] = 128;
                    ((RunnableC0002c) this).objData[2] = (((RunnableC0002c) this).objData[8] + 128) - ((RunnableC0002c) this).objData[5];
                }
                ((RunnableC0002c) this).objData[18] = 1;
                if (((RunnableC0002c) this).objData[5] != 0) {
                    int[] iArr10 = ((RunnableC0002c) this).objData;
                    iArr10[5] = iArr10[5] + 1;
                    if (((RunnableC0002c) this).objData[5] > 128) {
                        ((RunnableC0002c) this).objData[5] = 128;
                    }
                    iArr7 = ((RunnableC0002c) this).objData;
                    c7 = 2;
                    i10 = (((RunnableC0002c) this).objData[8] + 128) - ((RunnableC0002c) this).objData[5];
                } else if (((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 240]) {
                    iArr7 = ((RunnableC0002c) this).objData;
                    c7 = 5;
                    i10 = 1;
                } else {
                    iArr7 = ((RunnableC0002c) this).objData;
                    c7 = 2;
                    i8 = ((RunnableC0002c) this).objData[8];
                    i9 = 128;
                    i10 = i9 + i8;
                }
            } else {
                if (((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 240] && ((RunnableC0002c) this).objData[18] == 0) {
                    ((RunnableC0002c) this).objData[18] = 1;
                    ((RunnableC0002c) this).objData[5] = 128;
                    ((RunnableC0002c) this).objData[2] = ((RunnableC0002c) this).objData[8] + ((RunnableC0002c) this).objData[5];
                }
                ((RunnableC0002c) this).objData[18] = 1;
                if (((RunnableC0002c) this).objData[5] != 0) {
                    int[] iArr11 = ((RunnableC0002c) this).objData;
                    iArr11[5] = iArr11[5] + 1;
                    if (((RunnableC0002c) this).objData[5] > 128) {
                        ((RunnableC0002c) this).objData[5] = 128;
                    }
                    iArr7 = ((RunnableC0002c) this).objData;
                    c7 = 2;
                    i8 = ((RunnableC0002c) this).objData[8];
                    i9 = ((RunnableC0002c) this).objData[5];
                    i10 = i9 + i8;
                } else if (((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 240]) {
                    iArr7 = ((RunnableC0002c) this).objData;
                    c7 = 5;
                    i10 = 1;
                } else {
                    iArr7 = ((RunnableC0002c) this).objData;
                    c7 = 2;
                    i10 = ((RunnableC0002c) this).objData[8];
                }
            }
            iArr7[c7] = i10;
            z = false;
            z2 = false;
            i2 = 0;
            i4 = 63;
        } else if (((RunnableC0002c) this).objData[4] == 229 && this.zoneID == 1 && this.actID == 0) {
            z = false;
            z2 = false;
            i2 = 0;
            i3 = 16;
            i4 = 16;
        } else if (((RunnableC0002c) this).objData[4] >= 224) {
            if (((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 224] && ((RunnableC0002c) this).objData[18] == 0) {
                ((RunnableC0002c) this).objData[18] = 1;
                ((RunnableC0002c) this).objData[5] = 64;
                ((RunnableC0002c) this).objData[3] = (((RunnableC0002c) this).objData[9] + 64) - ((RunnableC0002c) this).objData[5];
            }
            ((RunnableC0002c) this).objData[18] = 1;
            if (((RunnableC0002c) this).objData[5] != 0) {
                int[] iArr12 = ((RunnableC0002c) this).objData;
                iArr12[5] = iArr12[5] + 1;
                if (((RunnableC0002c) this).objData[5] > 64) {
                    ((RunnableC0002c) this).objData[5] = 64;
                }
                iArr6 = ((RunnableC0002c) this).objData;
                c6 = 3;
                i7 = (((RunnableC0002c) this).objData[9] + 64) - ((RunnableC0002c) this).objData[5];
            } else if (((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 224]) {
                iArr6 = ((RunnableC0002c) this).objData;
                c6 = 5;
                i7 = 1;
            } else {
                iArr6 = ((RunnableC0002c) this).objData;
                c6 = 3;
                i7 = ((RunnableC0002c) this).objData[9] + 64;
            }
            iArr6[c6] = i7;
            z = false;
            z2 = false;
            i2 = 0;
            i3 = 32;
            i4 = 7;
        } else if (((RunnableC0002c) this).objData[4] == 19) {
            i3 = 32;
            int[] iArr13 = ((RunnableC0002c) this).objData;
            iArr13[5] = iArr13[5] + 1;
            int i16 = (((RunnableC0002c) this).f305k % 360 <= 90 || ((RunnableC0002c) this).f305k % 360 >= 270) ? 32 : 33;
            if (((RunnableC0002c) this).objData[19] == 0) {
                iArr5 = ((RunnableC0002c) this).objData;
                c5 = 3;
                a2 = ((RunnableC0002c) this).objData[9] + ((RunnableC0002c.mo34a(((RunnableC0002c) this).f305k) * i16) / 100);
            } else {
                iArr5 = ((RunnableC0002c) this).objData;
                c5 = 3;
                a2 = ((RunnableC0002c) this).objData[9] - ((RunnableC0002c.mo34a(((RunnableC0002c) this).f305k) * i16) / 100);
            }
            iArr5[c5] = a2 - i16;
            z = true;
            z2 = false;
            i2 = 0;
            i4 = 32;
        } else if (((RunnableC0002c) this).objData[4] >= 0 && ((RunnableC0002c) this).objData[4] <= 2) {
            int i17 = ((RunnableC0002c) this).objData[2];
            if (((RunnableC0002c) this).objData[4] != 0) {
                int[] iArr14 = ((RunnableC0002c) this).objData;
                iArr14[5] = iArr14[5] + 1;
                int i18 = ((RunnableC0002c) this).objData[4] * 32;
                if (((RunnableC0002c) this).objData[19] == 0) {
                    iArr4 = ((RunnableC0002c) this).objData;
                    c4 = 2;
                    a = ((RunnableC0002c) this).objData[8] + ((RunnableC0002c.mo34a(((RunnableC0002c) this).f305k) * i18) / 100);
                } else {
                    iArr4 = ((RunnableC0002c) this).objData;
                    c4 = 2;
                    a = ((RunnableC0002c) this).objData[8] - ((RunnableC0002c.mo34a(((RunnableC0002c) this).f305k) * i18) / 100);
                }
                iArr4[c4] = a - i18;
            }
            z = false;
            z2 = true;
            i2 = i17 - ((RunnableC0002c) this).objData[2];
            i3 = 16;
            i4 = 16;
        } else if (((RunnableC0002c) this).objData[4] > 91 || ((RunnableC0002c) this).objData[4] < 88) {
            if (((RunnableC0002c) this).objData[4] == 160) {
                i14 = 16;
                i15 = 32;
                if (((RunnableC0002c) this).f222b[0] && ((RunnableC0002c) this).objData[18] == 0) {
                    ((RunnableC0002c) this).objData[18] = 1;
                    ((RunnableC0002c) this).objData[3] = ((RunnableC0002c) this).objData[9];
                }
                ((RunnableC0002c) this).objData[18] = 1;
                if (((RunnableC0002c) this).f222b[0]) {
                    int[] iArr15 = ((RunnableC0002c) this).objData;
                    iArr15[3] = iArr15[3] - 1;
                    if (((RunnableC0002c) this).objData[3] < ((RunnableC0002c) this).objData[9]) {
                        iArr = ((RunnableC0002c) this).objData;
                        c = 3;
                        i = ((RunnableC0002c) this).objData[9];
                    }
                    z = false;
                    z2 = false;
                    i2 = 0;
                    i3 = i15;
                    i4 = i14;
                } else if (this.actID == 0) {
                    iArr = ((RunnableC0002c) this).objData;
                    c = 3;
                    i = 688;
                } else {
                    iArr = ((RunnableC0002c) this).objData;
                    c = 3;
                    i = ((RunnableC0002c) this).objData[9] + 64;
                }
            } else {
                if (((RunnableC0002c) this).objData[4] == 55) {
                    i14 = 32;
                    i15 = 25;
                    if (((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 40] && ((RunnableC0002c) this).objData[18] == 0) {
                        ((RunnableC0002c) this).objData[18] = 1;
                        ((RunnableC0002c) this).objData[2] = 7992;
                    }
                    ((RunnableC0002c) this).objData[18] = 1;
                    if (!(((RunnableC0002c) this).objData[8] == 7992 && ((RunnableC0002c) this).objData[9] == 1353) && ((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4] - 40]) {
                        int[] iArr16 = ((RunnableC0002c) this).objData;
                        iArr16[2] = iArr16[2] + 1;
                        if (((RunnableC0002c) this).objData[2] > 7992) {
                            iArr = ((RunnableC0002c) this).objData;
                            c = 2;
                            i = 7992;
                        }
                    }
                }
                z = false;
                z2 = false;
                i2 = 0;
                i3 = i15;
                i4 = i14;
            }
            iArr[c] = i;
            z = false;
            z2 = false;
            i2 = 0;
            i3 = i15;
            i4 = i14;
        } else {
            int i19 = ((RunnableC0002c) this).objData[2];
            int i20 = (((((RunnableC0002c) this).objData[4] - 88) + 1) * 32) - 16;
            if (((RunnableC0002c) this).f305k % 720 < 180) {
                if (((RunnableC0002c) this).objData[19] == 0) {
                    ((RunnableC0002c) this).objData[3] = ((RunnableC0002c) this).objData[9] - ((i20 * RunnableC0002c.mo34a((((RunnableC0002c) this).f305k % 720) + 90)) / 100);
                    ((RunnableC0002c) this).objData[2] = (((RunnableC0002c) this).objData[8] - 16) + (((((RunnableC0002c) this).objData[4] - 88) + 1) * 32);
                    z3 = false;
                } else {
                    ((RunnableC0002c) this).objData[3] = ((i20 * RunnableC0002c.mo34a((((RunnableC0002c) this).f305k % 720) + 90)) / 100) + ((RunnableC0002c) this).objData[9];
                    ((RunnableC0002c) this).objData[2] = (((RunnableC0002c) this).objData[8] + 16) - (((((RunnableC0002c) this).objData[4] - 88) + 1) * 32);
                    z3 = false;
                }
            } else if (((RunnableC0002c) this).f305k % 720 < 360) {
                if (((RunnableC0002c) this).objData[19] == 0) {
                    ((RunnableC0002c) this).objData[2] = ((RunnableC0002c) this).objData[8] - ((i20 * RunnableC0002c.mo34a(270 - ((((RunnableC0002c) this).f305k % 720) - 180))) / 100);
                    iArr3 = ((RunnableC0002c) this).objData;
                    c3 = 3;
                    i6 = (((RunnableC0002c) this).objData[9] - 16) + (((((RunnableC0002c) this).objData[4] - 88) + 1) * 32);
                } else {
                    ((RunnableC0002c) this).objData[2] = ((i20 * RunnableC0002c.mo34a(270 - ((((RunnableC0002c) this).f305k % 720) - 180))) / 100) + ((RunnableC0002c) this).objData[8];
                    iArr3 = ((RunnableC0002c) this).objData;
                    c3 = 3;
                    i6 = (((RunnableC0002c) this).objData[9] + 16) - (((((RunnableC0002c) this).objData[4] - 88) + 1) * 32);
                }
                iArr3[c3] = i6;
                z3 = true;
            } else if (((RunnableC0002c) this).f305k % 720 < 540) {
                if (((RunnableC0002c) this).objData[19] == 0) {
                    ((RunnableC0002c) this).objData[3] = ((i20 * RunnableC0002c.mo34a(((((RunnableC0002c) this).f305k % 720) - 360) + 90)) / 100) + ((RunnableC0002c) this).objData[9];
                    ((RunnableC0002c) this).objData[2] = (((RunnableC0002c) this).objData[8] + 16) - (((((RunnableC0002c) this).objData[4] - 88) + 1) * 32);
                    z3 = false;
                } else {
                    ((RunnableC0002c) this).objData[3] = ((RunnableC0002c) this).objData[9] - ((i20 * RunnableC0002c.mo34a(((((RunnableC0002c) this).f305k % 720) - 360) + 90)) / 100);
                    ((RunnableC0002c) this).objData[2] = (((RunnableC0002c) this).objData[8] - 16) + (((((RunnableC0002c) this).objData[4] - 88) + 1) * 32);
                    z3 = false;
                }
            } else if (((RunnableC0002c) this).f305k % 720 < 720) {
                if (((RunnableC0002c) this).objData[19] == 0) {
                    ((RunnableC0002c) this).objData[2] = ((i20 * RunnableC0002c.mo34a(270 - ((((RunnableC0002c) this).f305k % 720) - 540))) / 100) + ((RunnableC0002c) this).objData[8];
                    iArr2 = ((RunnableC0002c) this).objData;
                    c2 = 3;
                    i5 = (((RunnableC0002c) this).objData[9] + 16) - (((((RunnableC0002c) this).objData[4] - 88) + 1) * 32);
                } else {
                    ((RunnableC0002c) this).objData[2] = ((RunnableC0002c) this).objData[8] - ((i20 * RunnableC0002c.mo34a(270 - ((((RunnableC0002c) this).f305k % 720) - 540))) / 100);
                    iArr2 = ((RunnableC0002c) this).objData;
                    c2 = 3;
                    i5 = (((RunnableC0002c) this).objData[9] - 16) + (((((RunnableC0002c) this).objData[4] - 88) + 1) * 32);
                }
                iArr2[c2] = i5;
                z3 = true;
            } else {
                z3 = false;
            }
            z = false;
            z2 = z3;
            i2 = i19 - ((RunnableC0002c) this).objData[2];
            i3 = 16;
            i4 = 16;
        }
        int i21 = 12;
        if (!RunnableC0002c.f74i && !RunnableC0002c.f78k) {
            i21 = 16;
        }
        int i22 = -1;
        if (!(((RunnableC0002c) this).objData[4] == 55 && ((RunnableC0002c) this).objData[8] == 7992 && ((RunnableC0002c) this).objData[9] == 1353)) {
            int a3 = RunnableC0002c.m135a(RunnableC0002c.mo33a(), RunnableC0002c.mo48b() - i21, RunnableC0002c.f40b[0], RunnableC0002c.f40b[1] - i21, 12, i21, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[6], ((RunnableC0002c) this).objData[7], i4, i3);
            if (a3 >= 0) {
                if (a3 == 0) {
                    RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - i3) << 8;
                    mo50b(((RunnableC0002c) this).objData[2], i4);
                    m313a(((RunnableC0002c) this).objData[22]);
                    int[] iArr17 = RunnableC0002c.f47c;
                    iArr17[0] = iArr17[0] - (i2 << 8);
                    i22 = a3;
                } else if (a3 == 1) {
                    if (!RunnableC0002c.f58e || ((RunnableC0002c) this).objData[4] != 227) {
                        RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - i4) - 12) << 8;
                        RunnableC0002c.f47c[10] = 0;
                        if (((RunnableC0002c) this).f163a[4]) {
                            m376s();
                            i22 = a3;
                        }
                    }
                } else if (a3 == 2) {
                    RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + i4) + 12) + 1) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (((RunnableC0002c) this).f163a[3]) {
                        m376s();
                        i22 = a3;
                    }
                } else {
                    if (a3 == 3) {
                        iArr8 = RunnableC0002c.f47c;
                        c8 = 1;
                        i11 = ((RunnableC0002c) this).objData[3] + i3 + i21 + i21;
                        i12 = 1;
                    } else if (a3 == 4) {
                        if (z2) {
                            if (((RunnableC0002c) this).objData[2] <= RunnableC0002c.mo33a()) {
                                RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + i4) + 12) + 1) << 8;
                                RunnableC0002c.f47c[10] = 0;
                            } else if (!RunnableC0002c.f58e || ((RunnableC0002c) this).objData[4] != 227) {
                                RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - i4) - 12) << 8;
                                RunnableC0002c.f47c[10] = 0;
                            }
                            m376s();
                        }
                        if (z) {
                            if (((RunnableC0002c) this).objData[3] > RunnableC0002c.mo48b() - i21) {
                                RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - i3) << 8;
                                mo50b(((RunnableC0002c) this).objData[2], i4);
                                m313a(((RunnableC0002c) this).objData[22]);
                                int[] iArr18 = RunnableC0002c.f47c;
                                iArr18[0] = iArr18[0] - (i2 << 8);
                                i22 = 0;
                            } else {
                                iArr8 = RunnableC0002c.f47c;
                                c8 = 1;
                                i11 = ((RunnableC0002c) this).objData[3] + i3 + i21 + i21 + 1;
                                i12 = 8;
                            }
                        }
                    }
                    iArr8[c8] = (i12 + i11) << 8;
                    mo7B();
                }
            }
            i22 = a3;
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && i22 != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* renamed from: aO */
    private void m22aO() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Game bVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = ((RunnableC0002c) this).objData[4] / 16;
        if (((RunnableC0002c) this).objData[18] == 0) {
            ((RunnableC0002c) this).objData[10] = ((RunnableC0002c) this).f305k;
            ((RunnableC0002c) this).objData[18] = 1;
        }
        if ((((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10]) % (i12 * 50) == 0 && ((RunnableC0002c) this).objData[2] - RunnableC0002c.f98y[0] >= -16 && ((RunnableC0002c) this).objData[2] - RunnableC0002c.f98y[0] <= 256 && ((RunnableC0002c) this).objData[3] - RunnableC0002c.f98y[1] >= -16 && ((RunnableC0002c) this).objData[3] - RunnableC0002c.f98y[1] <= 184) {
            if (((RunnableC0002c) this).objData[4] == 48 || ((RunnableC0002c) this).objData[4] == 66 || ((RunnableC0002c) this).objData[4] == 65 || ((RunnableC0002c) this).objData[4] == 49 || ((RunnableC0002c) this).objData[4] == 80 || ((RunnableC0002c) this).objData[4] == 64 || ((RunnableC0002c) this).objData[4] == 81) {
                int i13 = ((RunnableC0002c) this).objData[4] == 48 ? 96 : 0;
                if (((RunnableC0002c) this).objData[4] == 49) {
                    i13 = 128;
                }
                if (((RunnableC0002c) this).objData[4] == 64) {
                    i13 = 96;
                }
                if (((RunnableC0002c) this).objData[4] == 65) {
                    i13 = 128;
                }
                if (((RunnableC0002c) this).objData[4] == 66) {
                    i13 = 196;
                }
                if (((RunnableC0002c) this).objData[4] == 80) {
                    i13 = 72;
                }
                i = ((RunnableC0002c) this).objData[4] == 81 ? 136 : i13;
                i6 = 20;
                i5 = ((RunnableC0002c) this).objData[2];
                i4 = ((RunnableC0002c) this).objData[3];
                i2 = 0;
                i3 = 0;
                bVar = this;
            } else {
                if (((RunnableC0002c) this).objData[4] == 53 || ((RunnableC0002c) this).objData[4] == 37 || ((RunnableC0002c) this).objData[4] == 69) {
                    i5 = ((RunnableC0002c) this).objData[2];
                    i2 = 200;
                    i3 = 0;
                    i8 = ((RunnableC0002c) this).objData[3];
                    i7 = 16;
                } else {
                    if (((RunnableC0002c) this).objData[4] == 55 || ((RunnableC0002c) this).objData[4] == 71 || ((RunnableC0002c) this).objData[4] == 23) {
                        i9 = 16;
                        i5 = ((RunnableC0002c) this).objData[2];
                        i10 = ((RunnableC0002c) this).objData[3];
                        i11 = 200;
                    } else if (((RunnableC0002c) this).objData[4] == 54) {
                        i9 = 16;
                        i5 = ((RunnableC0002c) this).objData[2];
                        i10 = ((RunnableC0002c) this).objData[3];
                        i11 = -200;
                    } else {
                        return;
                    }
                    i2 = 0;
                    i3 = i11;
                    i8 = i10;
                    i7 = i9;
                }
                i = 0;
                i4 = i8;
                i6 = i7;
                bVar = this;
            }
            bVar.mo36a(i6, i5, i4, i3, i2, 0, i);
        }
    }

    /* renamed from: aP */
    private void m23aP() {
        int[] iArr;
        char c;
        int i;
        int i2;
        int[] iArr2;
        int i3 = 0;
        int i4 = this.actID == 2 ? 1 : 0;
        if (((RunnableC0002c) this).objData[4] == 16) {
            int[][] a = m330a(10, 2);
            int i5 = 0;
            while (true) {
                if (i5 >= a.length) {
                    break;
                } else if (Math.abs(((((RunnableC0002c) this).objData[2] + 32) - (i4 * 64)) - a[i5][2]) < 2) {
                    if (((RunnableC0002c) this).objData[5] == 0) {
                        ((RunnableC0002c) this).objData[5] = 1;
                        ((RunnableC0002c) this).objData[10] = ((RunnableC0002c) this).f305k;
                    }
                    ((RunnableC0002c) this).objData[7] = a[i5][20];
                } else {
                    i5++;
                }
            }
            if (((RunnableC0002c) this).objData[7] > 0) {
                int i6 = 0;
                while (true) {
                    if (i6 >= a.length) {
                        break;
                    } else if (a[i6][20] == ((RunnableC0002c) this).objData[7]) {
                        ((RunnableC0002c) this).objData[6] = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            if (((RunnableC0002c) this).objData[10] != 0) {
                ((RunnableC0002c) this).objData[5] = ((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10];
            }
            if (((RunnableC0002c) this).objData[5] > 0 && ((RunnableC0002c) this).objData[7] > 0) {
                if (((RunnableC0002c) this).objData[5] / 4 > 44) {
                    ((RunnableC0002c) this).objData[5] = 0;
                    ((RunnableC0002c) this).objData[6] = 0;
                    ((RunnableC0002c) this).objData[7] = 0;
                    iArr2 = ((RunnableC0002c) this).objData;
                    c = '\n';
                } else {
                    if (((RunnableC0002c) this).objData[5] / 4 > 26) {
                        iArr = ((RunnableC0002c) this).objData;
                        c = 3;
                        i = ((RunnableC0002c) this).objData[9];
                        i2 = 160 - ((((RunnableC0002c) this).objData[5] - 104) * 2);
                    } else {
                        if (((RunnableC0002c) this).objData[5] / 4 > 6) {
                            iArr = ((RunnableC0002c) this).objData;
                            c = 3;
                            i = ((RunnableC0002c) this).objData[9];
                            i2 = (((RunnableC0002c) this).objData[5] - 24) * 2;
                        }
                        int[] iArr3 = ((RunnableC0002c) this).objData;
                        iArr3[5] = iArr3[5] + 1;
                    }
                    i3 = i - i2;
                    iArr2 = iArr;
                }
                iArr2[c] = i3;
                int[] iArr32 = ((RunnableC0002c) this).objData;
                iArr32[5] = iArr32[5] + 1;
            }
            if (((RunnableC0002c) this).objData[4] == 16 && ((RunnableC0002c) this).objData[5] / 4 > 0 && (((RunnableC0002c) this).objData[2] - 20) - 32 <= RunnableC0002c.mo33a() && ((((RunnableC0002c) this).objData[2] - 20) - 32) + 112 >= RunnableC0002c.mo33a() && ((RunnableC0002c) this).objData[3] <= RunnableC0002c.mo48b() && ((RunnableC0002c) this).objData[9] >= RunnableC0002c.mo48b()) {
                m378u();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063  */
    /* renamed from: aQ */
    private void m24aQ() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int[] iArr2;
        int i5;
        char c;
        int a;
        Game bVar;
        int i6 = 72;
        if (((RunnableC0002c) this).objData[6] == 0 && ((RunnableC0002c) this).objData[7] == 0) {
            ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
            ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        }
        if (((RunnableC0002c) this).objData[4] == 1) {
            ((RunnableC0002c) this).objData[5] = ((RunnableC0002c) this).f305k;
            i4 = ((((RunnableC0002c.mo34a(((RunnableC0002c) this).objData[5]) * 16) / 100) - 16) << 1) + 2;
        } else if (((RunnableC0002c) this).objData[4] == 2) {
            ((RunnableC0002c) this).objData[5] = ((RunnableC0002c) this).f305k;
            i4 = ((((RunnableC0002c.mo34a(((RunnableC0002c) this).objData[5]) * -16) / 100) - 16) << 1) + 2;
        } else if (((RunnableC0002c) this).objData[4] == 20) {
            if (((RunnableC0002c) this).objData[5] != 0) {
                ((RunnableC0002c) this).objData[5] = ((RunnableC0002c) this).f305k - (((RunnableC0002c) this).objData[10] - 1);
                if (((RunnableC0002c) this).objData[5] > 72) {
                    ((RunnableC0002c) this).objData[5] = 72;
                }
                iArr2 = ((RunnableC0002c) this).objData;
                i5 = (((RunnableC0002c) this).objData[9] - 160) + (((RunnableC0002c) this).objData[5] * 2);
                c = 3;
            } else if (((RunnableC0002c) this).f284e[1]) {
                ((RunnableC0002c) this).objData[5] = 1;
                iArr2 = ((RunnableC0002c) this).objData;
                c = '\n';
                i5 = ((RunnableC0002c) this).f305k;
            } else {
                iArr2 = ((RunnableC0002c) this).objData;
                i5 = ((RunnableC0002c) this).objData[9] - 160;
                c = 3;
            }
            iArr2[c] = i5;
            i4 = 16;
            i6 = 56;
        } else if (((RunnableC0002c) this).objData[4] == 4) {
            if (((RunnableC0002c) this).f284e[0] || ((RunnableC0002c) this).objData[5] != 0) {
                if (((RunnableC0002c) this).f284e[0] && ((RunnableC0002c) this).objData[5] == 0) {
                    ((RunnableC0002c) this).objData[10] = ((RunnableC0002c) this).f305k;
                }
                ((RunnableC0002c) this).objData[5] = ((RunnableC0002c) this).f305k - (((RunnableC0002c) this).objData[10] - 1);
                if (((RunnableC0002c) this).objData[5] > 72) {
                    ((RunnableC0002c) this).objData[5] = 72;
                }
                iArr = ((RunnableC0002c) this).objData;
                i3 = (((RunnableC0002c) this).objData[9] - 160) + (((RunnableC0002c) this).objData[5] * 2);
            } else {
                iArr = ((RunnableC0002c) this).objData;
                i3 = ((RunnableC0002c) this).objData[9] - 160;
            }
            iArr[3] = i3;
            i4 = 16;
            i6 = 56;
        } else {
            i = 0;
            i2 = 72;
            a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + i, ((RunnableC0002c) this).objData[6], ((RunnableC0002c) this).objData[7], 32, i2);
            if (a >= 0) {
                if (a == 0) {
                    RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] + i) - i2) << 8;
                    mo50b(((RunnableC0002c) this).objData[2], 32);
                    m313a(((RunnableC0002c) this).objData[22]);
                } else if (a == 1) {
                    RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - 32) - 12) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (((RunnableC0002c) this).f163a[4]) {
                        m376s();
                    }
                } else if (a == 2) {
                    RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + 32) + 12) + 1) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (((RunnableC0002c) this).f163a[3]) {
                        m376s();
                    }
                } else if (a == 3) {
                    RunnableC0002c.f47c[1] = (((((((RunnableC0002c) this).objData[3] + i) + i2) + 12) + 12) + 1) << 8;
                    if (((RunnableC0002c) this).objData[4] == 1 && (((RunnableC0002c) this).objData[5] % 360 < 90 || ((RunnableC0002c) this).objData[5] % 360 > 270)) {
                        bVar = this;
                    } else if ((((RunnableC0002c) this).objData[4] == 2 && ((RunnableC0002c) this).objData[5] % 360 < 270 && ((RunnableC0002c) this).objData[5] % 360 > 90) || !(((RunnableC0002c) this).objData[4] == 1 || ((RunnableC0002c) this).objData[4] == 2)) {
                        bVar = this;
                    }
                    bVar.mo7B();
                }
            }
            if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a != 0) {
                ((RunnableC0002c) this).f320s = false;
            }
            ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3] + i;
            ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        }
        i = i4;
        i2 = i6;
        a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + i, ((RunnableC0002c) this).objData[6], ((RunnableC0002c) this).objData[7], 32, i2);
        if (a >= 0) {
        }
        ((RunnableC0002c) this).f320s = false;
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3] + i;
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
    }

    /* renamed from: aR */
    private void m25aR() {
        m55aw();
    }

    /* renamed from: aS */
    private void DisplayRings() {
        int i;
        char c;
        int i2;
        int[] iArr;
        char c2;
        int i3;
        int i4;
        int[] iArr2;
        int i5;
        int i6 = ((((RunnableC0002c) this).f302j >> 2) % 4) * 16;
        if ((((RunnableC0002c) this).f302j >> 2) % 4 == 3) {
            i = 16;
            c = 4;
        } else {
            i = i6;
            c = 0;
        }
        if (((RunnableC0002c) this).objData[5] == 0) {
            iArr = RunnableC0002c.rotationQuadrants;
            c2 = c;
            i2 = i;
            i3 = 0;
        } else {
            i2 = (((((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10]) / 5) % 4) * 16;
            iArr = RunnableC0002c.rotationQuadrants;
            c2 = 0;
            i3 = 16;
        }
        RunnableC0002c.m204b(0, i3, i2, 16, 16, iArr[c2], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
        if (((RunnableC0002c) this).objData[11] == 1) {
            if (((RunnableC0002c) this).objData[5] == 0) {
                iArr2 = RunnableC0002c.rotationQuadrants;
                i4 = i;
                i5 = 0;
            } else {
                i4 = (((((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10]) / 5) % 4) * 16;
                iArr2 = RunnableC0002c.rotationQuadrants;
                c = 0;
                i5 = 16;
            }
            RunnableC0002c.m204b(0, i5, i4, 16, 16, iArr2[c], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[12]);
        }
    }

    /* renamed from: aT */
    private void m27aT() {
        int i;
        int i2;
        int a = RunnableC0002c.mo34a(((RunnableC0002c) this).f302j * 3) * 87;
        int i3 = ((RunnableC0002c) this).objData[4] + 1;
        int i4 = (((RunnableC0002c) this).objData[4] == 5 || ((RunnableC0002c) this).objData[19] == 1) ? -a : a;
        for (int i5 = 1; i5 < i3; i5++) {
            if (this.zoneID != 3) {
                if (this.zoneID != 5) {
                    i = 32;
                    i2 = 16;
                } else {
                    i = 96;
                    i2 = 0;
                }
                RunnableC0002c.m204b(3, i2, i, 16, 16, RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c.mo34a((i4 / 100) + 180) * 16) * i5) / 100) + ((RunnableC0002c) this).objData[2], (((RunnableC0002c.mo49b((i4 / 100) + 180) * 16) * i5) / 100) + ((RunnableC0002c) this).objData[3]);
            }
        }
        if (!(this.zoneID == 3 || this.zoneID == 5)) {
            RunnableC0002c.m204b(3, 16, 16, 16, 16, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
        }
        if (!(this.zoneID == 3 || this.zoneID == 5)) {
            int i6 = (i3 * 16) - 8;
            RunnableC0002c.m204b(3, 0, 0, 48, 16, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2] + ((RunnableC0002c.mo34a((i4 / 100) + 180) * i6) / 100), ((RunnableC0002c) this).objData[3] + ((i6 * RunnableC0002c.mo49b((i4 / 100) + 180)) / 100));
        }
    }

    /* renamed from: aU */
    private void m28aU() {
        if (RunnableC0002c.gameObjGfx[5] != null) {
            int height = RunnableC0002c.gameObjGfx[5].getHeight();
            int width = RunnableC0002c.gameObjGfx[5].getWidth() / 3;
            int i = 0;
            while (i < 12) {
                int abs = ((RunnableC0002c) this).objData[10] - Math.abs(((RunnableC0002c) this).objData[5] - i);
                if (abs < 0) {
                    abs = 0;
                }
                RunnableC0002c.m204b(5, width * 2, 0, width, height, RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c) this).objData[2] - 96) + (i * 16), ((i == 0 || i == 11) ? 0 : abs) + ((RunnableC0002c) this).objData[3]);
                i++;
            }
        }
    }

    /* renamed from: aV */
    private void m29aV() {
        int[] iArr = {-4, 4};
        for (int i = 0; i < 12; i++) {
            int i2 = ((((RunnableC0002c) this).f302j / 10) + (12 - i)) % 7;
            RunnableC0002c.m204b(4, 0, i2 * 24, 16, 24, RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c) this).objData[2] - 96) + (i * 16), iArr[i2 / 4] + ((RunnableC0002c) this).objData[3]);
        }
    }

    /* renamed from: aW */
    private void m30aW() {
        int i = RunnableC0002c.rotationQuadrants[0];
        if (((RunnableC0002c) this).objData[4] != 0) {
            i = RunnableC0002c.rotationQuadrants[4];
        }
        int i2 = ((RunnableC0002c) this).objData[5] != 0 ? (((RunnableC0002c) this).f305k / 2) - ((RunnableC0002c) this).objData[10] : 0;
        for (int i3 = 0; i3 < 36; i3++) {
            int i4 = i2 - (i3 * 3);
            RunnableC0002c.m204b(6, (i3 / 6) * 16, 96 - (((i3 % 6) + 1) * 16), 16, 16, i, ((((RunnableC0002c) this).objData[4] != 0 ? (96 - ((i3 / 6) * 16)) - 16 : (i3 / 6) * 16) + ((RunnableC0002c) this).objData[2]) - 40, (i4 < 0 ? 0 : i4 * (i2 / 6)) + (((((RunnableC0002c) this).objData[3] + 96) - (((i3 % 6) + 1) * 16)) - 48) + 0);
        }
    }

    /* renamed from: aX */
    private void m31aX() {
        char c = ((RunnableC0002c) this).objData[4] == 21 ? 2 : ((RunnableC0002c) this).objData[4] == 1 ? (char) 0 : 1;
        if (c == 2) {
            RunnableC0002c.m147a(7, 16, 0, 128, 96, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] - 16, 3);
            if (((RunnableC0002c) this).objData[16] >= 60) {
                for (int i = 0; i < 8; i++) {
                    int i2 = ((RunnableC0002c) this).f302j - ((RunnableC0002c) this).objData[15];
                    if ((i << 3) < i2) {
                        i2 = i << 3;
                    }
                    RunnableC0002c.m147a(101, 0, ((((RunnableC0002c) this).f302j + (i << 1)) % 4) * 32, 24, 32, RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c) this).objData[2] + (i2 << 1)) - 56, ((RunnableC0002c) this).objData[3] - RunnableC0002c.f55d[c][i2], 3);
                }
            }
        } else if (c == 0) {
            RunnableC0002c.m147a(7, 0, 96, 128, 80, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] - 16, 3);
        } else {
            for (int i3 = 0; i3 < 4; i3++) {
                RunnableC0002c.m147a(7, 0, 0, 16, 96, RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c) this).objData[2] + (i3 * 16)) - 32, ((RunnableC0002c) this).objData[3] - 48, 20);
            }
        }
    }

    /* renamed from: aY */
    private void m32aY() {
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
        int i11 = RunnableC0002c.rotationQuadrants[0];
        int i12 = (((RunnableC0002c) this).objData[3] - ((RunnableC0002c) this).objData[9]) % 16;
        for (int i13 = 0; i13 <= (((RunnableC0002c) this).objData[3] - ((RunnableC0002c) this).objData[9]) / 16; i13++) {
            int i14 = (((RunnableC0002c) this).objData[9] - 24) + (i13 * 16) + i12;
            if (i13 == 0) {
                int max = Math.max(RunnableC0002c.mo63d(((((RunnableC0002c) this).objData[9] - 24) - RunnableC0002c.f100z[1]) + 4), 0);
                RunnableC0002c.screenBuffer.clipRect(0, RunnableC0002c.f73i + max, RunnableC0002c.f66g, RunnableC0002c.f70h - max);
            }
            RunnableC0002c.m204b(94, 0, 8, 32, 16, i11, ((RunnableC0002c) this).objData[8], i14);
            if (i13 == 0) {
                RunnableC0002c.screenBuffer.setClip(0, RunnableC0002c.f73i, RunnableC0002c.f66g, RunnableC0002c.f70h);
            }
        }
        RunnableC0002c.m204b(94, 0, 0, 32, 8, i11, ((RunnableC0002c) this).objData[8], ((RunnableC0002c) this).objData[9] - 24);
        RunnableC0002c.m204b(94, 0, 24, 32, 8, i11, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] - 16);
        if (((RunnableC0002c) this).objData[4] == 128 || ((RunnableC0002c) this).objData[4] == 2) {
            i7 = 8;
            i6 = 0;
            i5 = 0;
            i4 = 112;
            i3 = 56;
            i2 = ((RunnableC0002c) this).objData[2];
            i = ((RunnableC0002c) this).objData[3] + 16;
        } else {
            if (((RunnableC0002c) this).objData[4] == 35) {
                i8 = 95;
                i9 = 0;
                i2 = ((RunnableC0002c) this).objData[2];
                i3 = 24;
                i4 = 32;
                i10 = 0;
            } else if (((RunnableC0002c) this).objData[4] == 17 || ((RunnableC0002c) this).objData[4] == 18) {
                RunnableC0002c.m204b(8, 0, 24, 112, 32, i11, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + 28);
                RunnableC0002c.m204b(8, 0, 0, 48, 24, i11, ((RunnableC0002c) this).objData[2] - 24, ((RunnableC0002c) this).objData[3]);
                i8 = 8;
                i9 = 64;
                i2 = ((RunnableC0002c) this).objData[2] + 24;
                i3 = 24;
                i4 = 48;
                i10 = 0;
            } else {
                return;
            }
            i = ((RunnableC0002c) this).objData[3];
            i5 = i10;
            i6 = i9;
            i7 = i8;
        }
        RunnableC0002c.m204b(i7, i6, i5, i4, i3, i11, i2, i);
    }

    /* renamed from: aZ */
    private void m33aZ() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (RunnableC0002c.gameObjGfx[9] != null) {
            char c = ((RunnableC0002c) this).objData[19] == 2 ? (char) 2 : 0;
            int width = RunnableC0002c.gameObjGfx[9].getWidth();
            int i7 = width / 5;
            int height = RunnableC0002c.gameObjGfx[9].getHeight();
            if (((RunnableC0002c) this).objData[4] == 48) {
                for (int i8 = 0; i8 < 3; i8++) {
                    RunnableC0002c.m204b(9, 0, 0, i7, height, RunnableC0002c.rotationQuadrants[c], (((RunnableC0002c) this).objData[2] - 24) + (i8 * 24), ((RunnableC0002c) this).objData[3]);
                }
            } else if (((RunnableC0002c) this).objData[4] != 64) {
                if (((RunnableC0002c) this).objData[4] == 18 || ((RunnableC0002c) this).objData[4] == 16) {
                    i5 = 0;
                    i4 = 0;
                    i3 = RunnableC0002c.rotationQuadrants[((RunnableC0002c) this).objData[19] == 0 ? (char) 3 : 1];
                    i2 = ((RunnableC0002c) this).objData[2];
                    i = ((RunnableC0002c) this).objData[3];
                    i7 = width;
                    i6 = 9;
                } else if (((RunnableC0002c) this).objData[4] == 82) {
                    if (((RunnableC0002c) this).objData[19] == 0) {
                        i6 = 9;
                        i5 = height >> 1;
                        i4 = 0;
                        i3 = RunnableC0002c.rotationQuadrants[7];
                        i2 = ((RunnableC0002c) this).objData[2];
                        i = ((RunnableC0002c) this).objData[3];
                    } else {
                        i6 = 9;
                        i5 = height >> 1;
                        i4 = 0;
                        i3 = RunnableC0002c.rotationQuadrants[1];
                        i2 = ((RunnableC0002c) this).objData[2];
                        i = ((RunnableC0002c) this).objData[3];
                    }
                } else if (((RunnableC0002c) this).objData[4] == 32) {
                    i6 = 9;
                    i5 = height >> 1;
                    i4 = 0;
                    i3 = RunnableC0002c.rotationQuadrants[c];
                    i2 = ((RunnableC0002c) this).objData[2];
                    i = ((RunnableC0002c) this).objData[3];
                } else {
                    i6 = 9;
                    i5 = 0;
                    i4 = 0;
                    i3 = RunnableC0002c.rotationQuadrants[c];
                    i2 = ((RunnableC0002c) this).objData[2];
                    i = ((RunnableC0002c) this).objData[3] - 4;
                    i7 = width;
                }
                RunnableC0002c.m204b(i6, i5, i4, i7, height, i3, i2, i);
            } else if (this.zoneID != 1 || this.actID != 0 || ((RunnableC0002c) this).objData[4] != 64 || ((RunnableC0002c) this).objData[19] == 0) {
                for (int i9 = 0; i9 < 6; i9++) {
                    RunnableC0002c.m204b(9, height >> 1, 0, i7, height, RunnableC0002c.rotationQuadrants[c], (((RunnableC0002c) this).objData[2] - 60) + (i9 * 24), ((RunnableC0002c) this).objData[3]);
                }
            }
        }
    }

    /* renamed from: ab */
    private void m34ab() {
        if (RunnableC0002c.f66g < RunnableC0002c.screenWidth) {
            RunnableC0002c.screenBuffer.translate((RunnableC0002c.screenWidth - RunnableC0002c.f66g) >> 1, 0);
        }
        RunnableC0002c.screenBuffer.setClip(0, RunnableC0002c.f73i, RunnableC0002c.f66g, RunnableC0002c.f70h);
        PlaneDisplayer.m3a(RunnableC0002c.screenBuffer, RunnableC0002c.f100z[0], RunnableC0002c.f100z[1], true);
        mo53b(RunnableC0002c.screenBuffer, this.zoneID == 1 || this.zoneID == 5);
        m112f(false);
        mo17M();
        if (!RunnableC0002c.f76j) {
            mo97w();
        }
        mo99y();
        mo41a(RunnableC0002c.screenBuffer, this.zoneID == 1 || this.zoneID == 5);
        m112f(true);
        if (RunnableC0002c.f76j) {
            mo97w();
        }
        if (RunnableC0002c.f66g < RunnableC0002c.screenWidth) {
            RunnableC0002c.screenBuffer.translate(-((RunnableC0002c.screenWidth - RunnableC0002c.f66g) >> 1), 0);
        }
        m370l();
        RunnableC0002c.screenBuffer.setClip(0, 0, RunnableC0002c.screenWidth, RunnableC0002c.screenHeight);
    }

    /* renamed from: ac */
    private void m35ac() {
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
        switch (this.gameMode) {
            case 1:
                mo9D();
                break;
            case 2:
                if (((RunnableC0002c) this).f316q || this.f314p) {
                    RunnableC0002c.m202b(0, 0, RunnableC0002c.screenWidth, RunnableC0002c.screenHeight);
                    RunnableC0002c.m124E();
                    RunnableC0002c.updateHUDRingsScore = true;
                    RunnableC0002c.updateHUDLives = true;
                    RunnableC0002c.updateHUDTime = true;
                    ((RunnableC0002c) this).f316q = false;
                } else if (((RunnableC0002c) this).f302j % 10 == 0) {
                    RunnableC0002c.m202b(0, 0, RunnableC0002c.f51d, RunnableC0002c.f73i);
                    RunnableC0002c.m202b(0, RunnableC0002c.f73i + RunnableC0002c.f70h, RunnableC0002c.f51d, RunnableC0002c.f73i);
                    updateHUD(true);
                    mo54b(true);
                }
                m34ab();
                ((RunnableC0002c) this).f302j++;
                break;
            case 3:
                mo10F();
                RunnableC0002c.screenBuffer.setColor(0);
                RunnableC0002c.screenBuffer.fillRect(0, RunnableC0002c.f73i, RunnableC0002c.f51d, RunnableC0002c.f70h);
                ((RunnableC0002c) this).f310m = (RunnableC0002c.f51d + RunnableC0002c.f32a[RunnableC0002c.f97x[this.f201al]][2]) >> 1;
                int[] iArr = {82, 100, 108, 116, 100, 84};
                RunnableC0002c.drawSprite(RunnableC0002c.screenBuffer, RunnableC0002c.uiObjGfx[10], RunnableC0002c.f32a[10][0], RunnableC0002c.f32a[10][1], RunnableC0002c.f32a[10][2], RunnableC0002c.f32a[10][3], RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c) this).f310m - RunnableC0002c.f32a[10][2]) - 1, iArr[0], 20, false);
                if (this.f201al == 6) {
                    graphics = RunnableC0002c.screenBuffer;
                    image = RunnableC0002c.uiObjGfx[10];
                    i = RunnableC0002c.f32a[3][0];
                    i2 = RunnableC0002c.f32a[3][1];
                    i3 = RunnableC0002c.f32a[3][2];
                    i4 = RunnableC0002c.f32a[3][3];
                    i5 = RunnableC0002c.rotationQuadrants[0];
                    i6 = ((RunnableC0002c) this).f310m - 48;
                    i7 = iArr[1];
                    i8 = 20;
                } else {
                    RunnableC0002c.drawSprite(RunnableC0002c.screenBuffer, RunnableC0002c.uiObjGfx[10], RunnableC0002c.f32a[this.f202am + 4][0], RunnableC0002c.f32a[this.f202am + 4][1], RunnableC0002c.f32a[this.f202am + 4][2], RunnableC0002c.f32a[this.f202am + 4][3], RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c) this).f310m - RunnableC0002c.f32a[10][2]) + 25, iArr[2], 20, false);
                    RunnableC0002c.drawSprite(RunnableC0002c.screenBuffer, RunnableC0002c.uiObjGfx[10], RunnableC0002c.f32a[8][0], RunnableC0002c.f32a[8][1], RunnableC0002c.f32a[8][2], RunnableC0002c.f32a[8][3], RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c) this).f310m - RunnableC0002c.f32a[10][2]) + 1, iArr[3], 20, false);
                    graphics = RunnableC0002c.screenBuffer;
                    image = RunnableC0002c.uiObjGfx[10];
                    i = RunnableC0002c.f32a[3][0];
                    i2 = RunnableC0002c.f32a[3][1];
                    i3 = RunnableC0002c.f32a[3][2];
                    i4 = RunnableC0002c.f32a[3][3];
                    i5 = RunnableC0002c.rotationQuadrants[0];
                    i6 = ((RunnableC0002c) this).f310m - (RunnableC0002c.f32a[10][2] >> 1);
                    i7 = iArr[4];
                    i8 = 24;
                }
                RunnableC0002c.drawSprite(graphics, image, i, i2, i3, i4, i5, i6, i7, i8, false);
                RunnableC0002c.drawSprite(RunnableC0002c.screenBuffer, RunnableC0002c.uiObjGfx[10], RunnableC0002c.f32a[RunnableC0002c.f97x[this.f201al]][0], RunnableC0002c.f32a[RunnableC0002c.f97x[this.f201al]][1], RunnableC0002c.f32a[RunnableC0002c.f97x[this.f201al]][2], RunnableC0002c.f32a[RunnableC0002c.f97x[this.f201al]][3], RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).f310m, iArr[5], 24, false);
                RunnableC0002c.screenBuffer.drawImage(RunnableC0002c.uiObjGfx[4], RunnableC0002c.f51d - 10, RunnableC0002c.f62f + (RunnableC0002c.f57e >> 1), 20);
                RunnableC0002c.screenBuffer.drawImage(RunnableC0002c.uiObjGfx[5], 10, RunnableC0002c.f62f + (RunnableC0002c.f57e >> 1), 24);
                break;
            case 4:
                mo10F();
                RunnableC0002c.m124E();
                ((RunnableC0002c) this).f316q = false;
                RunnableC0002c.updateHUDLives = true;
                RunnableC0002c.screenBuffer.setColor(0);
                RunnableC0002c.screenBuffer.fillRect(0, RunnableC0002c.f73i, RunnableC0002c.f51d, RunnableC0002c.f70h);
                break;
            case 6:
                ((RunnableC0002c) this).f162a[0] = "";
                mo10F();
                ((RunnableC0002c) this).f302j++;
                mo23S();
                break;
            case 7:
                ((RunnableC0002c) this).f302j++;
                mo25U();
                break;
            case 8:
                mo27W();
                break;
            case 9:
                mo29Y();
                break;
            case 10:
            case 11:
                RunnableC0002c.m202b(0, 0, RunnableC0002c.screenWidth, RunnableC0002c.screenHeight);
                m34ab();
                RunnableC0002c.screenBuffer.setColor(0);
                for (int i9 = 0; i9 < RunnableC0002c.f70h; i9 += 2) {
                    RunnableC0002c.screenBuffer.fillRect(0, RunnableC0002c.f73i + i9, RunnableC0002c.f51d, 1);
                }
                if (this.gameMode == 11) {
                    mo40a(((RunnableC0002c) this).f221b[85], false);
                    mo39a(((RunnableC0002c) this).f221b[24], 2, 0, this.f203an == 0);
                    mo39a(((RunnableC0002c) this).f221b[25], 2, 1, this.f203an == 1);
                } else {
                    mo40a(((RunnableC0002c) this).f221b[60], false);
                    mo39a(((RunnableC0002c) this).f221b[70], 2, 0, this.f203an == 0);
                    mo39a(((RunnableC0002c) this).f221b[71], 2, 1, this.f203an == 1);
                }
                ((RunnableC0002c) this).f316q = true;
                break;
        }
        if (this.gameMode == 4 || this.gameMode == 2) {
            m36ad();
        }
        if (((RunnableC0002c) this).f333y) {
            RunnableC0002c.m124E();
            ((RunnableC0002c) this).f333y = false;
        }
        if (this.gameMode != 2 || ((RunnableC0002c) this).f302j % 5 == 0) {
            m369k();
        }
    }

    /* renamed from: ad */
    private void m36ad() {
        if (((RunnableC0002c) this).f328w) {
            RunnableC0002c.screenBuffer.setColor(0);
            for (int i = 0; i < 10; i++) {
                int i2 = 24 - ((this.f205ap - i) * 4);
                if (i2 >= 0) {
                    if (i2 > 24) {
                        i2 = 24;
                    }
                    RunnableC0002c.screenBuffer.fillRect((i * 24) + (24 - i2), 0, i2, 240);
                }
            }
            if (22 < this.f205ap) {
                this.f205ap = 0;
                ((RunnableC0002c) this).f328w = false;
            }
            this.f205ap++;
        }
        mo14J();
        if (((RunnableC0002c) this).f331x) {
            RunnableC0002c.screenBuffer.setColor(0);
            for (int i3 = 0; i3 < 10; i3++) {
                if (this.f205ap - i3 > 0) {
                    int i4 = (this.f205ap - i3) << 2;
                    if (i4 > 24) {
                        i4 = 24;
                    }
                    RunnableC0002c.screenBuffer.fillRect(i3 * 24, RunnableC0002c.f62f, i4, RunnableC0002c.f57e);
                }
            }
            if (22 < this.f205ap) {
                this.f205ap = 0;
                ((RunnableC0002c) this).f331x = false;
            }
            this.f205ap++;
        }
        if (((RunnableC0002c) this).f161a) {
            mo38a(((RunnableC0002c) this).f221b[49], RunnableC0002c.f51d >> 1, ((RunnableC0002c.f73i + RunnableC0002c.f70h) - RunnableC0002c.f22a) - 2, 16777215, 658170);
        }
    }

    /* renamed from: ae */
    private void RunObjects() {
        boolean[] zArr;
        int[] iArr;
        char c;
        ((RunnableC0002c) this).f114G = 0;
        int i = 0;
        for (int i2 = 0; i2 < ((RunnableC0002c) this).ObjectPool.length && i < this.ObjectsAmount; i2++) {
            if (((RunnableC0002c) this).ObjectPool[i2][24] == 1) {
                int i3 = i + 1;
                ((RunnableC0002c) this).objData = ((RunnableC0002c) this).ObjectPool[i2];
                runObject();
                if (((RunnableC0002c) this).objData[1] == 17 && ((RunnableC0002c) this).objData[4] == 55) {
                    i = i3;
                } else {
                    if (((RunnableC0002c) this).objData[0] > 0 || ((RunnableC0002c) this).objData[21] != 0) {
                        if (((RunnableC0002c) this).f273c[((RunnableC0002c) this).objData[20]] || ((RunnableC0002c) this).objData[1] >= 120 || ((RunnableC0002c) this).objData[1] == 42 || ((RunnableC0002c) this).objData[1] == 43 || ((RunnableC0002c) this).objData[1] == 36) {
                            if (m328a(((RunnableC0002c) this).objData) && ((RunnableC0002c) this).objData[21] == 0 && ((RunnableC0002c) this).objData[1] < 120 && ((RunnableC0002c) this).objData[1] != 42 && ((RunnableC0002c) this).objData[1] != 43 && ((RunnableC0002c) this).objData[1] != 36) {
                                ((RunnableC0002c) this).f273c[((RunnableC0002c) this).objData[20]] = false;
                                zArr = ((RunnableC0002c) this).f273c;
                                iArr = ((RunnableC0002c) this).objData;
                                c = 22;
                            }
                            i = i3;
                        }
                        m333b(i2);
                        i = i3;
                    } else {
                        ((RunnableC0002c) this).f279d[((RunnableC0002c) this).objData[20]] = true;
                        zArr = ((RunnableC0002c) this).f273c;
                        iArr = ((RunnableC0002c) this).objData;
                        c = 20;
                    }
                    zArr[iArr[c]] = false;
                    m333b(i2);
                    i = i3;
                }
            }
        }
        this.ObjectsAmount += ((RunnableC0002c) this).f114G;
    }

    /* renamed from: af */
    private void MainGameLoop() throws Exception {
        boolean z;
        Game bVar;
        int i;
        Game bVar2;
        if (m325a()) {
            m357e();
            return;
        }
        switch (this.gameMode) {
            case 1:
                mo8C();
                break;
            case 2:
                ((RunnableC0002c) this).f323u = ((RunnableC0002c) this).rings;
                if (this.f314p) {
                    ((RunnableC0002c) this).f326v = true;
                    this.f204ao = 10;
                    RunnableC0002c.f87o = true;
                }
                RunnableC0002c.f40b[0] = RunnableC0002c.mo33a();
                RunnableC0002c.f40b[1] = RunnableC0002c.mo48b() - 1;
                this.f208as = 0;
                this.f209at = 0;
                ((RunnableC0002c) this).f112F = false;
                ((RunnableC0002c) this).f109E = false;
                ((RunnableC0002c) this).f107D = false;
                m375r();
                if (!RunnableC0002c.f76j) {
                    ObjectsManager();
                    RunObjects();
                }
                if (!RunnableC0002c.f76j) {
                    mo16L();
                } else {
                    mo15K();
                }
                if (((RunnableC0002c) this).f107D) {
                    m378u();
                }
                mo98x();
                mo6A();
                ((RunnableC0002c) this).invincibilityTimer--;
                ((RunnableC0002c) this).spdshoesTimer--;
                if (((RunnableC0002c) this).invincibilityTimer == 0) {
                    mo70e(false);
                }
                if (((RunnableC0002c) this).spdshoesTimer <= 0) {
                    this.sonicMaxSpd = 1536;
                    this.sonicMaxAcc = 12;
                }
                m377t();
                mo12H();
                ((RunnableC0002c) this).f305k++;
                if (((RunnableC0002c) this).f305k % 55 == 0 && !RunnableC0002c.f87o) {
                    ((RunnableC0002c) this).f330x = (((RunnableC0002c) this).f330x + 1) % 60;
                    if (((RunnableC0002c) this).f330x == 0) {
                        if (((RunnableC0002c) this).f332y == 9) {
                            ((RunnableC0002c) this).f330x = 59;
                            mo96v();
                        } else {
                            ((RunnableC0002c) this).f332y++;
                        }
                    }
                }
                if (RunnableC0002c.f85n) {
                    ((RunnableC0002c) this).f330x = 0;
                    ((RunnableC0002c) this).f332y = 0;
                }
                if (!RunnableC0002c.f52d && ((RunnableC0002c) this).rings >= 100 && ((RunnableC0002c) this).f323u < 100) {
                    ((RunnableC0002c) this).samplePlayer.playSample(7, 1, false);
                    this.lives++;
                }
                if (!RunnableC0002c.f52d && ((RunnableC0002c) this).rings >= 200 && ((RunnableC0002c) this).f323u < 200) {
                    ((RunnableC0002c) this).samplePlayer.playSample(7, 1, false);
                    this.lives++;
                }
                if (!RunnableC0002c.f52d && ((RunnableC0002c) this).rings >= 300 && ((RunnableC0002c) this).f323u < 300) {
                    ((RunnableC0002c) this).samplePlayer.playSample(7, 1, false);
                    this.lives++;
                    break;
                }
            case 3:
                if (((RunnableC0002c) this).f163a[0]) {
                    this.zoneID = RunnableC0002c.f64f[this.f201al][this.f202am];
                    this.actID = RunnableC0002c.f69g[this.f201al][this.f202am];
                    this.lives = 3;
                    if (((RunnableC0002c) this).f115G) {
                        i = this.f214ay;
                        bVar2 = this;
                    } else {
                        i = 0;
                        bVar2 = this;
                    }
                    ((RunnableC0002c) bVar2).f308l = i;
                    ((RunnableC0002c) this).score = 0;
                    ((RunnableC0002c) this).f318r = true;
                    m374p();
                } else {
                    if (((RunnableC0002c) this).f163a[4]) {
                        m357e();
                        this.f202am = (this.f202am + 1) % 3;
                        if (this.f202am == 0) {
                            z = true;
                            bVar = this;
                        }
                    } else if (((RunnableC0002c) this).f163a[3]) {
                        m357e();
                        this.f202am = (this.f202am + 2) % 3;
                        if (this.f202am == 2) {
                            z = false;
                            bVar = this;
                        }
                    }
                    bVar.m322a(z);
                }
                if (this.f201al == 6) {
                    this.f202am = 0;
                    break;
                }
                break;
            case 6:
                ((RunnableC0002c) this).f305k++;
                mo22R();
                break;
            case 7:
                mo24T();
                break;
            case 8:
                mo26V();
                break;
            case 9:
                if (((RunnableC0002c) this).f121I && System.currentTimeMillis() - this.f11a > 250) {
                    this.f11a = System.currentTimeMillis();
                    mo28X();
                    break;
                }
            case 10:
                this.f210au = 0;
                ((RunnableC0002c) this).f216b = (byte) ((((RunnableC0002c) this).f216b + 1) % 24);
                if (((RunnableC0002c) this).f163a[0]) {
                    m365h();
                    if (this.f203an == 0) {
                        this.gameMode = 2;
                        ((RunnableC0002c) this).f316q = true;
                        ((RunnableC0002c) this).f326v = true;
                        this.f204ao = 10;
                        ((RunnableC0002c) this).f333y = true;
                        RunnableC0002c.updateHUDLives = true;
                        mo70e(false);
                        m363g();
                    } else {
                        this.gameMode = 11;
                    }
                } else if (((RunnableC0002c) this).f163a[1] || ((RunnableC0002c) this).f163a[2]) {
                    this.f203an = (this.f203an + 1) & 1;
                }
                m357e();
                break;
            case 11:
                this.f210au = 0;
                ((RunnableC0002c) this).f216b = (byte) ((((RunnableC0002c) this).f216b + 1) % 24);
                if (!((RunnableC0002c) this).f163a[0]) {
                    if (!((RunnableC0002c) this).f163a[1]) {
                        if (((RunnableC0002c) this).f163a[2]) {
                            m357e();
                            this.f203an = (this.f203an + 1) & 1;
                            break;
                        }
                    } else {
                        m357e();
                        this.f203an = (this.f203an + 1) & 1;
                        break;
                    }
                } else if (this.f203an != 0) {
                    m357e();
                    this.gameMode = 10;
                    ((RunnableC0002c) this).f326v = true;
                    this.f204ao = 10;
                    ((RunnableC0002c) this).f333y = true;
                    break;
                } else {
                    m351d(3);
                    break;
                }
                break;
        }
        mo13I();
    }

    /* renamed from: ag */
    private void runObject() {
        try {
            switch (((RunnableC0002c) this).objData[1]) {
                case 0:
                case 1:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                    if (((RunnableC0002c) this).objData[5] != 0 || m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 8, -1)) {
                        ExecuteCollectedRing();
                        return;
                    }
                    return;
                case 2:
                    if (m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, 16)) {
                        m61bC();
                        return;
                    }
                    return;
                case 3:
                    m42aj();
                    return;
                case 4:
                    m44al();
                    return;
                case 5:
                    GHZRock();
                    return;
                case 6:
                    m45am();
                    return;
                case 7:
                    m46an();
                    return;
                case 8:
                    m47ao();
                    return;
                case 9:
                    m48ap();
                    return;
                case 10:
                    m49aq();
                    return;
                case 11:
                    m50ar();
                    return;
                case 12:
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
                case 38:
                case 50:
                case 51:
                case 52:
                case 53:
                case 61:
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
                case 89:
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
                    return;
                case 13:
                    m52at();
                    return;
                case 14:
                    m53au();
                    return;
                case 15:
                    m54av();
                    return;
                case 16:
                    m55aw();
                    return;
                case 17:
                    BasicPlatform();
                    return;
                case 18:
                    if (m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, 32)) {
                        m57ay();
                        return;
                    }
                    return;
                case 20:
                    if (m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, -1)) {
                        m58az();
                        return;
                    }
                    return;
                case 27:
                    m8aA();
                    return;
                case 36:
                    m9aB();
                    return;
                case 37:
                    if (m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 8, 32)) {
                        m10aC();
                        return;
                    }
                    return;
                case 39:
                    m62bD();
                    return;
                case 40:
                    m63bE();
                    return;
                case 41:
                    m64bF();
                    return;
                case 42:
                    if (m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, 16)) {
                        m11aD();
                        return;
                    }
                    return;
                case 43:
                    if (((RunnableC0002c) this).objData[4] < 10 && m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, 16)) {
                        m11aD();
                        return;
                    }
                    return;
                case 44:
                    m12aE();
                    return;
                case 45:
                    if (m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 32, 32)) {
                        m13aF();
                        return;
                    }
                    return;
                case 46:
                    if (m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 32, 32)) {
                        m14aG();
                        return;
                    }
                    return;
                case 47:
                    if (((RunnableC0002c) this).f308l < 6) {
                        m372n();
                        return;
                    }
                    return;
                case 48:
                    m15aH();
                    return;
                case 49:
                    m65bG();
                    return;
                case 54:
                    m51as();
                    return;
                case 55:
                    m16aI();
                    return;
                case 56:
                    if (m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 32, 32)) {
                        m17aJ();
                        return;
                    }
                    return;
                case 57:
                    m66bH();
                    return;
                case 58:
                    if (m7a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 24, 24)) {
                        m18aK();
                        return;
                    }
                    return;
                case 59:
                    m19aL();
                    return;
                case 60:
                    m20aM();
                    return;
                case 62:
                    m21aN();
                    return;
                case 70:
                    m67bI();
                    return;
                case 71:
                    m68bJ();
                    return;
                case 75:
                    m22aO();
                    return;
                case 77:
                    m23aP();
                    return;
                case 78:
                    m69bK();
                    return;
                case 79:
                    m24aQ();
                    return;
                case 86:
                    m70bL();
                    return;
                case 90:
                    m25aR();
                    return;
                case 93:
                    m72bN();
                    return;
                case 120:
                    mo20P();
                    return;
                case 130:
                    mo21Q();
                    return;
                case 140:
                    m350d();
                    return;
                case 150:
                    m341c();
                    return;
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: ah */
    private void m40ah() {
        m109d(((RunnableC0002c) this).objData);
        if (this.zoneID == 4) {
            m113g(true);
        }
    }

    /* renamed from: ai */
    private void ExecuteCollectedRing() {
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        if (RunnableC0002c.mo52b(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[6], ((RunnableC0002c) this).objData[7], 8, 8) <= 0 ? !(((RunnableC0002c) this).objData[12] == 0 || RunnableC0002c.mo52b(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[12], ((RunnableC0002c) this).objData[6], ((RunnableC0002c) this).objData[12], 8, 8) < 0 || ((RunnableC0002c) this).objData[5] != 0 || ((RunnableC0002c) this).objData[0] == -1) : !(((RunnableC0002c) this).objData[5] != 0 || ((RunnableC0002c) this).objData[0] == -1)) {
            ((RunnableC0002c) this).objData[5] = 1;
            ((RunnableC0002c) this).objData[10] = ((RunnableC0002c) this).f305k;
            ((RunnableC0002c) this).rings++;
        }
        if (((RunnableC0002c) this).objData[5] == 1 && ((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[10] >= 20) {
            ((RunnableC0002c) this).objData[0] = -1;
            ((RunnableC0002c) this).objData[5] = 0;
        }
    }

    /* renamed from: aj */
    private void m42aj() {
        int i;
        int i2;
        int i3;
        int i4;
        int a = RunnableC0002c.mo34a(((RunnableC0002c) this).f302j * 3) * 87;
        int a2 = RunnableC0002c.mo34a(((RunnableC0002c) this).objData[6] * 3) * 87;
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).f302j;
        int i5 = ((RunnableC0002c) this).objData[4] + 1;
        if (((RunnableC0002c) this).objData[4] == 5 || ((RunnableC0002c) this).objData[19] == 1) {
            i = -a2;
            i2 = -a;
        } else {
            i = a2;
            i2 = a;
        }
        int i6 = 8;
        if (this.zoneID == 3) {
            i3 = 44;
            i6 = 24;
            i4 = (i5 << 4) + 8;
        } else if (this.zoneID == 5) {
            i6 = 24;
            i3 = 24;
            i4 = (i5 << 4) - 24;
        } else {
            i3 = 24;
            i4 = (i5 << 4) - 8;
        }
        int a3 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2] + ((RunnableC0002c.mo34a((i2 / 100) + 180) * i4) / 100), ((RunnableC0002c) this).objData[3] + ((RunnableC0002c.mo49b((i2 / 100) + 180) * i4) / 100), ((RunnableC0002c) this).objData[2] + ((RunnableC0002c.mo34a((i / 100) + 180) * i4) / 100), ((RunnableC0002c) this).objData[3] + ((RunnableC0002c.mo49b((i / 100) + 180) * i4) / 100), i3, i6);
        if (!(this.zoneID == 3 || this.zoneID == 5)) {
            if (a3 != 0) {
                a3 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2] + ((RunnableC0002c.mo34a((i2 / 100) + 180) * i4) / 100), ((RunnableC0002c) this).objData[3] + ((RunnableC0002c.mo49b((i2 / 100) + 180) * i4) / 100) + 5, ((RunnableC0002c) this).objData[2] + ((RunnableC0002c.mo34a((i / 100) + 180) * i4) / 100), ((RunnableC0002c) this).objData[3] + ((RunnableC0002c.mo49b((i / 100) + 180) * i4) / 100) + 5, i3, i6);
            }
            if (a3 == 0) {
                RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] + ((RunnableC0002c.mo49b((i2 / 100) + 180) * i4) / 100)) - i6) << 8;
                int[] iArr = RunnableC0002c.f47c;
                iArr[0] = iArr[0] + ((((RunnableC0002c.mo34a((i2 / 100) + 180) * i4) - (RunnableC0002c.mo34a((i / 100) + 180) * i4)) << 8) / 100);
                mo50b(((RunnableC0002c) this).objData[2] + ((RunnableC0002c.mo34a((i2 / 100) + 180) * i4) / 100), i3);
                m313a(((RunnableC0002c) this).objData[22]);
            }
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a3 != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ak */
    private void GHZRock() {
        boolean z;
        int i;
        Game bVar;
        int i2 = 0;
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        int i3 = ((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[14];
        ((RunnableC0002c) this).objData[14] = ((RunnableC0002c) this).f305k;
        int i4 = 0;
        while (true) {
            if (i4 >= 12) {
                z = false;
                i = 99;
                break;
            }
            i2 = RunnableC0002c.m135a(RunnableC0002c.mo33a(), RunnableC0002c.mo48b() - 12, RunnableC0002c.f40b[0], RunnableC0002c.f40b[1] - 12, 4, 12, (((RunnableC0002c) this).objData[2] - 96) + (i4 << 4), ((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[10], (((RunnableC0002c) this).objData[6] - 96) + (i4 << 4), ((RunnableC0002c) this).objData[7] + ((RunnableC0002c) this).objData[10], 8, 8);
            if (i2 < 0 || i2 == 3) {
                i4++;
            } else {
                RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 8) << 8;
                if (Math.abs(RunnableC0002c.mo33a() - (((RunnableC0002c) this).objData[2] - 8)) < 999) {
                    Math.abs(RunnableC0002c.mo33a() - ((RunnableC0002c) this).objData[2]);
                    z = true;
                    i = i4;
                } else {
                    z = true;
                    i = 99;
                }
            }
        }
        if (i != 99) {
            RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - 8) + ((RunnableC0002c) this).objData[10]) << 8;
            mo50b(((RunnableC0002c) this).objData[2], 96);
            m313a(((RunnableC0002c) this).objData[22]);
            ((RunnableC0002c) this).objData[5] = i;
            int i5 = i <= 6 ? i : 6 - (i % 6);
            int[] iArr = ((RunnableC0002c) this).objData;
            iArr[10] = iArr[10] + i3;
            if (((RunnableC0002c) this).objData[10] >= i5 * 2) {
                ((RunnableC0002c) this).objData[10] = i5 * 2;
            }
            if (i == 0 || i == 11) {
                bVar = this;
            }
            int i6 = z ? 0 : i2;
            if (!((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && i6 != 0) {
                ((RunnableC0002c) this).f320s = false;
                return;
            }
            return;
        }
        int[] iArr2 = ((RunnableC0002c) this).objData;
        iArr2[10] = iArr2[10] - i3;
        if (((RunnableC0002c) this).objData[10] <= 0) {
            bVar = this;
        }
        if (z) {
        }
        if (!((RunnableC0002c) this).f320s) {
            return;
        }
        return;
        ((RunnableC0002c) bVar).objData[10] = 0;
        if (z) {
        }
        if (!((RunnableC0002c) this).f320s) {
        }
    }

    /* renamed from: al */
    private void m44al() {
        for (int i = 0; i < 12; i++) {
            if (((((RunnableC0002c) this).f302j / 10) + (12 - i)) % 7 == 2 && RunnableC0002c.m134a((((RunnableC0002c) this).objData[2] - 96) + (i << 4), ((RunnableC0002c) this).objData[3], (((RunnableC0002c) this).objData[2] - 96) + (i << 4), ((RunnableC0002c) this).objData[3], 8, 12) >= 0) {
                m378u();
                return;
            }
        }
    }

    /* renamed from: am */
    private void m45am() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -99;
        int i7 = 999;
        boolean z = ((RunnableC0002c) this).objData[4] != 0 ? true : false;
        int i8 = ((RunnableC0002c) this).objData[2];
        if (((RunnableC0002c) this).objData[5] == 0) {
            int length = !z ? RunnableC0002c.f59e.length : -RunnableC0002c.f59e.length;
            i = RunnableC0002c.m135a(RunnableC0002c.mo33a(), RunnableC0002c.mo48b() - 12, RunnableC0002c.f40b[0], RunnableC0002c.f40b[1] - 12, 2, 12, ((RunnableC0002c) this).objData[2] - length, (((RunnableC0002c) this).objData[3] - RunnableC0002c.f59e[0]) + 8, ((RunnableC0002c) this).objData[2] - length, (((RunnableC0002c) this).objData[3] - RunnableC0002c.f59e[0]) + 8, 8, 8);
            if (i >= 0) {
                RunnableC0002c.f47c[1] = (((((RunnableC0002c) this).objData[3] - RunnableC0002c.f59e[0]) + 8) - 8) << 8;
            }
        } else {
            i = -1;
        }
        if (((RunnableC0002c) this).objData[5] != 0) {
            int i9 = 0;
            while (true) {
                if (i9 >= 36) {
                    i4 = 0;
                    break;
                } else if (((((RunnableC0002c) this).f305k / 2) - ((RunnableC0002c) this).objData[10]) - ((i9 << 1) + i9) < 0) {
                    i4 = (i9 / 6) << 3;
                    break;
                } else {
                    if (i9 == 29) {
                        ((RunnableC0002c) this).objData[5] = 2;
                    }
                    i9++;
                }
            }
            if (i4 >= 48) {
                ((RunnableC0002c) this).objData[5] = 2;
            }
            i8 = ((RunnableC0002c) this).objData[4] != 0 ? ((RunnableC0002c) this).objData[2] - i4 : ((RunnableC0002c) this).objData[2] + i4;
            i5 = i4;
        }
        if (((RunnableC0002c) this).objData[5] != 2) {
            int length2 = RunnableC0002c.f59e.length;
            if (RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 128, 128) >= 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        break;
                    }
                    int i11 = !z ? i10 : (length2 - i10) - 1;
                    if ((!z && i5 <= i10) || (z && length2 - i5 >= i10)) {
                        if (RunnableC0002c.m135a(RunnableC0002c.mo33a(), RunnableC0002c.mo48b() - 12, RunnableC0002c.f40b[0], RunnableC0002c.f40b[1] - 12, 2, 12, (((RunnableC0002c) this).objData[2] - length2) + (i10 << 1), ((RunnableC0002c) this).objData[3] - RunnableC0002c.f59e[i11], (((RunnableC0002c) this).objData[2] - length2) + (i10 << 1), ((RunnableC0002c) this).objData[3] - RunnableC0002c.f59e[i11], 1, 1) != 0 || i7 <= Math.abs(RunnableC0002c.mo33a() - ((((RunnableC0002c) this).objData[2] - length2) + (i10 << 1)))) {
                            i3 = i7;
                            i2 = i6;
                        } else {
                            i3 = Math.abs(RunnableC0002c.mo33a() - ((((RunnableC0002c) this).objData[2] - length2) + (i10 << 1)));
                            i2 = i11;
                        }
                        if (i2 != -99 && 8 > Math.abs(RunnableC0002c.mo33a() - ((((RunnableC0002c) this).objData[2] - length2) + (i10 << 1))) && RunnableC0002c.mo48b() - (((RunnableC0002c) this).objData[3] - RunnableC0002c.f59e[i11]) > 0 && RunnableC0002c.mo48b() - (((RunnableC0002c) this).objData[3] - RunnableC0002c.f59e[i11]) <= 64 && i3 > Math.abs(RunnableC0002c.mo33a() - ((((RunnableC0002c) this).objData[2] - length2) + (i10 << 1)))) {
                            i7 = Math.abs(RunnableC0002c.mo33a() - ((((RunnableC0002c) this).objData[2] - length2) + (i10 << 1)));
                            i6 = i11;
                            break;
                        }
                    } else {
                        i3 = i7;
                        i2 = i6;
                    }
                    i10++;
                    i7 = i3;
                    i6 = i2;
                }
            }
            i = -1;
            if (i7 != 999) {
                ((RunnableC0002c) this).objData[17] = i6;
                RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - RunnableC0002c.f59e[i6]) - 1) << 8;
                if (((RunnableC0002c) this).objData[5] == 0) {
                    ((RunnableC0002c) this).objData[10] = ((RunnableC0002c) this).f305k / 2;
                }
                ((RunnableC0002c) this).objData[5] = 1;
                if (z) {
                    i5 = length2 - i5;
                }
                mo50b(i8, i5);
                m313a(((RunnableC0002c) this).objData[22]);
                i = 0;
            }
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && i != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03eb, code lost:
        if (((p000.RunnableC0002c) r19).objData[4] == 42) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0462, code lost:
        if (((p000.RunnableC0002c) r19).f163a[3] != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0144, code lost:
        if (((p000.RunnableC0002c) r19).f163a[4] != false) goto L_0x0146;
     */
    /* renamed from: an */
    private void m46an() {
        int i;
        int i2;
        int i3;
        int a;
        int a2;
        int[] iArr;
        char c;
        int i4;
        int i5 = -1;
        m314a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[4]);
        char c2 = ((RunnableC0002c) this).objData[4] == 21 ? 2 : ((RunnableC0002c) this).objData[4] == 1 ? (char) 0 : 1;
        ((RunnableC0002c) this).objData[17] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[18] = ((RunnableC0002c) this).objData[3];
        if (!(c2 == 2 || ((RunnableC0002c) this).objData[4] == 32)) {
            int[] iArr2 = ((RunnableC0002c) this).objData;
            iArr2[5] = iArr2[5] + 1;
            int i6 = 32;
            if (((RunnableC0002c) this).objData[4] == 35) {
                i6 = 32;
            } else if (((RunnableC0002c) this).objData[4] == 1) {
                i6 = 16;
            } else if (((RunnableC0002c) this).objData[4] == 41) {
                i6 = 16;
            } else {
                if (((RunnableC0002c) this).objData[4] != 34) {
                    if (((RunnableC0002c) this).objData[4] == 43) {
                        i6 = 32;
                    } else if (((RunnableC0002c) this).objData[4] == 33) {
                        i6 = 16;
                    }
                }
                i6 = 24;
            }
            if (((RunnableC0002c) this).objData[4] == 3) {
                a = ((RunnableC0002c) this).objData[18] >> 8;
            } else if (((RunnableC0002c) this).objData[4] != 7) {
                if (((RunnableC0002c) this).objData[4] == 1) {
                    a2 = ((RunnableC0002c.mo34a(((RunnableC0002c) this).objData[5]) * i6) / 100) - i6;
                    iArr = ((RunnableC0002c) this).objData;
                    c = 3;
                    i4 = ((RunnableC0002c) this).objData[9] + 8;
                    iArr[c] = i4 + a2;
                } else {
                    a = ((RunnableC0002c.mo34a(((RunnableC0002c) this).objData[5]) * i6) / 100) - i6;
                }
            }
            iArr = ((RunnableC0002c) this).objData;
            c = 3;
            i4 = ((RunnableC0002c) this).objData[9];
            a2 = a;
            iArr[c] = i4 + a2;
        }
        if (c2 == 2) {
            ((RunnableC0002c) this).objData[3] = ((RunnableC0002c) this).objData[9];
        }
        if (c2 == 2 && ((RunnableC0002c) this).objData[13] != 0) {
            ((RunnableC0002c) this).objData[3] = ((RunnableC0002c) this).objData[9] + 15;
            if (((RunnableC0002c) this).objData[16] == 0) {
                ((RunnableC0002c) this).objData[16] = 1;
            }
        }
        ((RunnableC0002c) this).objData[13] = 0;
        int a3 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[17], ((RunnableC0002c) this).objData[18], ((RunnableC0002c) this).f288f[c2], RunnableC0002c.f55d[c2][0]);
        if (a3 >= 0) {
            if (a3 == 1) {
                RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - ((RunnableC0002c) this).f288f[c2]) - 12) << 8;
                RunnableC0002c.f47c[10] = 0;
                i3 = -99;
            } else if (a3 == 2) {
                RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + ((RunnableC0002c) this).f288f[c2]) + 12) + 1) << 8;
                RunnableC0002c.f47c[10] = 0;
                i3 = -99;
            }
            m376s();
            i5 = i3;
        }
        int length = RunnableC0002c.f55d[c2].length;
        int i7 = RunnableC0002c.f55d[c2][0];
        if (c2 == 2) {
            i7 = 96;
        }
        if (RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[17], ((RunnableC0002c) this).objData[18], length, i7) >= 0) {
            int i8 = 0;
            int i9 = 999;
            int i10 = i5;
            while (true) {
                if (i8 >= length) {
                    i = i9;
                    i5 = i10;
                    break;
                }
                if (RunnableC0002c.m135a(RunnableC0002c.mo33a(), RunnableC0002c.mo48b() - 12, RunnableC0002c.f40b[0], RunnableC0002c.f40b[1] - 12, 2, 13, (i8 << 1) + (((RunnableC0002c) this).objData[2] - length), ((RunnableC0002c) this).objData[3] - RunnableC0002c.f55d[c2][i8], (i8 << 1) + (((RunnableC0002c) this).objData[17] - length), ((RunnableC0002c) this).objData[18] - RunnableC0002c.f55d[c2][i8], 1, 1) == 0 && i9 > Math.abs(RunnableC0002c.mo33a() - ((((RunnableC0002c) this).objData[2] - length) + (i8 << 1)))) {
                    i9 = Math.abs(RunnableC0002c.mo33a() - ((((RunnableC0002c) this).objData[2] - length) + (i8 << 1)));
                    i10 = i8;
                }
                if (i10 != -99 && 8 >= Math.abs(RunnableC0002c.mo33a() - ((((RunnableC0002c) this).objData[2] - length) + (i8 << 1))) && RunnableC0002c.mo48b() - (((RunnableC0002c) this).objData[3] - RunnableC0002c.f55d[c2][i8]) >= -1 && RunnableC0002c.mo48b() - (((RunnableC0002c) this).objData[3] - RunnableC0002c.f55d[c2][i8]) <= 64 && i9 > Math.abs(RunnableC0002c.mo33a() - ((((RunnableC0002c) this).objData[2] - length) + (i8 << 1)))) {
                    i = Math.abs(RunnableC0002c.mo33a() - ((((RunnableC0002c) this).objData[2] - length) + (i8 << 1)));
                    i5 = i8;
                    break;
                }
                i8++;
            }
        } else {
            i = 999;
        }
        char c3 = 65535;
        if (i != 999) {
            RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - RunnableC0002c.f55d[c2][i5]) + 4) << 8;
            mo50b(((RunnableC0002c) this).objData[2], RunnableC0002c.f55d[c2].length);
            m313a(((RunnableC0002c) this).objData[22]);
            c3 = 0;
            if (c2 == 2) {
                ((RunnableC0002c) this).objData[13] = 1;
            }
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && c3 != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
        if (((RunnableC0002c) this).objData[16] != 0) {
            int[] iArr3 = ((RunnableC0002c) this).objData;
            iArr3[16] = iArr3[16] + 1;
            if (((RunnableC0002c) this).objData[16] == 60) {
                ((RunnableC0002c) this).objData[15] = ((RunnableC0002c) this).f302j - 1;
            }
            if (((RunnableC0002c) this).objData[16] >= 60) {
                for (int i11 = 0; i11 < 8; i11++) {
                    int i12 = ((RunnableC0002c) this).f302j - ((RunnableC0002c) this).objData[15];
                    int i13 = i12 - 1;
                    if (i13 < 0) {
                        i13 = 0;
                    }
                    if ((i11 << 3) < i12) {
                        int i14 = i11 << 3;
                        i2 = i14;
                        i12 = i14;
                    } else {
                        i2 = i13;
                    }
                    if (RunnableC0002c.m134a((((RunnableC0002c) this).objData[2] + (i12 << 1)) - 56, ((RunnableC0002c) this).objData[3] - RunnableC0002c.f55d[c2][i12], (((RunnableC0002c) this).objData[17] + (i2 << 1)) - 56, ((RunnableC0002c) this).objData[18] - RunnableC0002c.f55d[c2][i2], 6, 6) >= 0) {
                        m378u();
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* renamed from: ao */
    private void m47ao() {
        int i;
        int[] iArr;
        char c;
        int i2;
        int[] iArr2;
        int i3;
        int[][] a;
        int i4;
        int i5 = 56;
        m343c(((RunnableC0002c) this).objData[8], ((RunnableC0002c) this).objData[9]);
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        if (((RunnableC0002c) this).objData[4] == 128) {
            if (((RunnableC0002c) this).objData[18] == 0) {
                ((RunnableC0002c) this).objData[3] = ((RunnableC0002c) this).objData[9] + 112;
            }
            ((RunnableC0002c) this).objData[18] = 1;
            if (((RunnableC0002c) this).f284e[128] || ((RunnableC0002c) this).f284e[129]) {
                if (((RunnableC0002c) this).objData[3] > ((RunnableC0002c) this).objData[9]) {
                    iArr2 = ((RunnableC0002c) this).objData;
                    i3 = iArr2[3] - 1;
                }
                a = m330a(10, 0);
                for (i4 = 0; i4 < a.length; i4++) {
                    if ((((RunnableC0002c) this).objData[2] - 56) - (a[i4][2] - 16) <= 32 && (((RunnableC0002c) this).objData[2] - 56) - (a[i4][2] - 16) >= -112 && ((RunnableC0002c) this).f284e[128] && ((RunnableC0002c) this).objData[3] < ((RunnableC0002c) this).objData[9] + 16) {
                        ((RunnableC0002c) this).objData[3] = ((RunnableC0002c) this).objData[9] + 16;
                    }
                }
            } else {
                if (((RunnableC0002c) this).objData[3] < ((RunnableC0002c) this).objData[9] + 112) {
                    int[] iArr3 = ((RunnableC0002c) this).objData;
                    iArr3[3] = iArr3[3] + 2;
                    if (((RunnableC0002c) this).objData[3] > ((RunnableC0002c) this).objData[9] + 112) {
                        iArr2 = ((RunnableC0002c) this).objData;
                        i3 = ((RunnableC0002c) this).objData[9] + 112;
                    }
                }
                a = m330a(10, 0);
                while (i4 < a.length) {
                }
            }
            iArr2[3] = i3;
            a = m330a(10, 0);
            while (i4 < a.length) {
            }
        } else {
            int i6 = 160;
            if (((RunnableC0002c) this).objData[4] == 17) {
                i5 = 48;
            } else {
                if (((RunnableC0002c) this).objData[4] == 2) {
                    i = 56;
                } else if (((RunnableC0002c) this).objData[4] == 35) {
                    i5 = 16;
                    i6 = 120;
                } else if (((RunnableC0002c) this).objData[4] == 18) {
                    i = 48;
                }
                i6 = 80;
                i5 = i;
            }
            if (((RunnableC0002c) this).objData[5] == 0) {
                if (((RunnableC0002c) this).objData[3] < ((RunnableC0002c) this).objData[9] + i6) {
                    int[] iArr4 = ((RunnableC0002c) this).objData;
                    iArr4[3] = iArr4[3] + 4;
                    if (((RunnableC0002c) this).objData[3] >= ((RunnableC0002c) this).objData[9] + i6) {
                        ((RunnableC0002c) this).objData[3] = i6 + ((RunnableC0002c) this).objData[9];
                        iArr = ((RunnableC0002c) this).objData;
                        c = 5;
                        i2 = 1;
                    }
                }
            } else if (((RunnableC0002c) this).objData[5] < 60) {
                iArr = ((RunnableC0002c) this).objData;
                c = 5;
                i2 = iArr[5] + 1;
            } else if (((RunnableC0002c) this).objData[3] > ((RunnableC0002c) this).objData[9]) {
                int[] iArr5 = ((RunnableC0002c) this).objData;
                iArr5[3] = iArr5[3] - 1;
                if (((RunnableC0002c) this).objData[3] == ((RunnableC0002c) this).objData[9]) {
                    iArr = ((RunnableC0002c) this).objData;
                    c = 5;
                    i2 = 0;
                }
            }
            iArr[c] = i2;
        }
        int a2 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[7], i5, 12);
        if (a2 >= 0) {
            if (a2 == 0) {
                RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 12) << 8;
                mo50b(((RunnableC0002c) this).objData[2], i5);
                m313a(((RunnableC0002c) this).objData[22]);
                if (((RunnableC0002c) this).objData[3] - 24 < ((RunnableC0002c) this).objData[9]) {
                    mo7B();
                }
            } else if (a2 == 1) {
                RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - i5) - 12) << 8;
                RunnableC0002c.f47c[10] = 0;
                if (((RunnableC0002c) this).f163a[4]) {
                    m376s();
                }
            } else if (a2 == 2) {
                RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + i5) + 12) + 1) << 8;
                RunnableC0002c.f47c[10] = 0;
                if (((RunnableC0002c) this).f163a[3]) {
                    m376s();
                }
            } else if (a2 == 3) {
                mo7B();
                RunnableC0002c.f47c[1] = ((((((RunnableC0002c) this).objData[3] + 12) + 12) + 12) + 1) << 8;
            }
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a2 != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
        if (((RunnableC0002c) this).objData[4] != 35 && RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + 32, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[7] + 32, 40, 14) >= 0) {
            m378u();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x024e  */
    /* renamed from: ap */
    private void m48ap() {
        int i;
        int[] iArr;
        int i2;
        char c;
        int[] iArr2;
        int[] iArr3;
        char c2;
        char c3;
        int[] iArr4;
        char c4;
        int i3;
        char c5;
        int[] iArr5;
        int i4;
        char c6;
        boolean z;
        int[] iArr6;
        char c7;
        int i5;
        Game bVar;
        char c8 = 6;
        int i6 = 20;
        int i7 = 14;
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        ((RunnableC0002c) this).objData[15] = ((RunnableC0002c) this).objData[2];
        int i8 = ((RunnableC0002c) this).objData[4];
        if (i8 == 64) {
            i6 = 64;
        } else if (i8 == 16) {
            i6 = 16;
            i7 = 19;
        }
        if (i8 == 48) {
            i6 = 30;
        } else {
            if (i8 == 18) {
                i = 14;
                i7 = 20;
                int[] iArr7 = ((RunnableC0002c) this).objData;
                iArr7[6] = iArr7[6] + 1;
                ((RunnableC0002c) this).objData[5] = ((RunnableC0002c) this).objData[6];
                if (((RunnableC0002c) this).objData[6] < 60) {
                    iArr5 = ((RunnableC0002c) this).objData;
                    c8 = 5;
                } else {
                    if (((RunnableC0002c) this).objData[6] < 68) {
                        iArr5 = ((RunnableC0002c) this).objData;
                        i4 = ((RunnableC0002c) this).objData[6] - 60;
                        c6 = 5;
                    } else if (((RunnableC0002c) this).objData[6] < 128) {
                        iArr5 = ((RunnableC0002c) this).objData;
                        i4 = 8;
                        c6 = 5;
                    } else if (((RunnableC0002c) this).objData[6] < 136) {
                        iArr5 = ((RunnableC0002c) this).objData;
                        i4 = 136 - ((RunnableC0002c) this).objData[6];
                        c6 = 5;
                    } else {
                        ((RunnableC0002c) this).objData[5] = 0;
                        iArr5 = ((RunnableC0002c) this).objData;
                    }
                    iArr5[c6] = i4;
                    iArr2 = ((RunnableC0002c) this).objData;
                    iArr3 = ((RunnableC0002c) this).objData;
                    c2 = '\b';
                    c3 = 2;
                }
                i4 = 0;
                c6 = c8;
                iArr5[c6] = i4;
                iArr2 = ((RunnableC0002c) this).objData;
                iArr3 = ((RunnableC0002c) this).objData;
                c2 = '\b';
                c3 = 2;
            } else if (i8 == 32) {
                i6 = 8;
                i7 = 18;
            } else if (i8 == 82) {
                i = 20;
                int[] iArr8 = ((RunnableC0002c) this).objData;
                iArr8[6] = iArr8[6] + 1;
                ((RunnableC0002c) this).objData[5] = ((RunnableC0002c) this).objData[6];
                if (((RunnableC0002c) this).objData[6] < 60) {
                    iArr4 = ((RunnableC0002c) this).objData;
                    c4 = 5;
                } else {
                    if (((RunnableC0002c) this).objData[6] < 68) {
                        iArr4 = ((RunnableC0002c) this).objData;
                        i3 = ((RunnableC0002c) this).objData[6] - 60;
                        c5 = 5;
                    } else if (((RunnableC0002c) this).objData[6] < 128) {
                        iArr4 = ((RunnableC0002c) this).objData;
                        i3 = 8;
                        c5 = 5;
                    } else if (((RunnableC0002c) this).objData[6] < 136) {
                        iArr4 = ((RunnableC0002c) this).objData;
                        i3 = 136 - ((RunnableC0002c) this).objData[6];
                        c5 = 5;
                    } else {
                        ((RunnableC0002c) this).objData[5] = 0;
                        iArr4 = ((RunnableC0002c) this).objData;
                        c4 = 6;
                    }
                    iArr4[c5] = i3;
                    iArr2 = ((RunnableC0002c) this).objData;
                    iArr3 = ((RunnableC0002c) this).objData;
                    c2 = '\b';
                    c3 = 2;
                    i7 = 6;
                }
                i3 = 0;
                c5 = c4;
                iArr4[c5] = i3;
                iArr2 = ((RunnableC0002c) this).objData;
                iArr3 = ((RunnableC0002c) this).objData;
                c2 = '\b';
                c3 = 2;
                i7 = 6;
            } else if (i8 == 1) {
                i = 20;
                int[] iArr9 = ((RunnableC0002c) this).objData;
                iArr9[6] = iArr9[6] + 1;
                ((RunnableC0002c) this).objData[5] = ((RunnableC0002c) this).objData[6];
                if (((RunnableC0002c) this).objData[6] < 60) {
                    iArr = ((RunnableC0002c) this).objData;
                    c8 = 5;
                } else {
                    if (((RunnableC0002c) this).objData[6] < 68) {
                        iArr = ((RunnableC0002c) this).objData;
                        i2 = ((RunnableC0002c) this).objData[6] - 60;
                        c = 5;
                    } else if (((RunnableC0002c) this).objData[6] < 128) {
                        iArr = ((RunnableC0002c) this).objData;
                        i2 = 8;
                        c = 5;
                    } else if (((RunnableC0002c) this).objData[6] < 136) {
                        iArr = ((RunnableC0002c) this).objData;
                        i2 = 136 - ((RunnableC0002c) this).objData[6];
                        c = 5;
                    } else {
                        ((RunnableC0002c) this).objData[5] = 0;
                        iArr = ((RunnableC0002c) this).objData;
                    }
                    iArr[c] = i2;
                    iArr2 = ((RunnableC0002c) this).objData;
                    iArr3 = ((RunnableC0002c) this).objData;
                    c2 = '\t';
                    c3 = 3;
                }
                i2 = 0;
                c = c8;
                iArr[c] = i2;
                iArr2 = ((RunnableC0002c) this).objData;
                iArr3 = ((RunnableC0002c) this).objData;
                c2 = '\t';
                c3 = 3;
            }
            iArr2[c3] = (iArr3[c2] - (((RunnableC0002c) this).objData[5] << 2)) + 32;
            i6 = i;
        }
        int a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[15], ((RunnableC0002c) this).objData[7], i6, i7);
        if (a >= 0) {
            if (((RunnableC0002c) this).objData[4] == 82 || ((RunnableC0002c) this).objData[4] == 18 || ((RunnableC0002c) this).objData[4] == 16) {
                if (a == 1 || a == 2) {
                    bVar = this;
                }
                z = false;
                if (a == 0) {
                    RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - i7) << 8;
                    mo50b(((RunnableC0002c) this).objData[2], i6);
                    m313a(((RunnableC0002c) this).objData[22]);
                    if (m326a(RunnableC0002c.mo33a(), RunnableC0002c.mo48b() - 32)) {
                        if (RunnableC0002c.f47c[12] == 0) {
                            iArr6 = RunnableC0002c.f47c;
                            i5 = ((((RunnableC0002c) this).objData[2] - i6) - 12) << 8;
                            c7 = 0;
                        } else {
                            iArr6 = RunnableC0002c.f47c;
                            i5 = (((((RunnableC0002c) this).objData[2] + i6) + 12) + 1) << 8;
                            c7 = 0;
                        }
                    }
                } else if (a == 1) {
                    RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - i6) - 12) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (!z && ((RunnableC0002c) this).f163a[4]) {
                        m376s();
                    }
                } else if (a == 2) {
                    RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + i6) + 12) + 1) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    if (z && ((RunnableC0002c) this).f163a[3]) {
                        m376s();
                    }
                } else if (a == 3) {
                    RunnableC0002c.f47c[1] = ((((((RunnableC0002c) this).objData[3] + i7) + 12) + 12) + 1) << 8;
                    if (RunnableC0002c.f47c[5] < 0) {
                        RunnableC0002c.f47c[5] = 0;
                    }
                    if (this.zoneID == 0) {
                        iArr6 = RunnableC0002c.f47c;
                        c7 = 1;
                        i5 = iArr6[1] + 4096;
                    }
                }
                iArr6[c7] = i5;
            } else {
                if ((a == 0 && ((RunnableC0002c) this).objData[19] == 0) || (a == 3 && ((RunnableC0002c) this).objData[19] != 0)) {
                    bVar = this;
                }
                z = false;
                if (a == 0) {
                }
                iArr6[c7] = i5;
            }
            bVar.m378u();
            z = true;
            if (a == 0) {
            }
            iArr6[c7] = i5;
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01f0  */
    /* renamed from: aq */
    private void m49aq() {
        int[] iArr;
        int i;
        int i2;
        char c;
        int a;
        boolean z;
        int[] iArr2;
        int i3;
        int[][] a2;
        int i4;
        int[][] a3;
        int i5;
        int i6 = 16;
        ((RunnableC0002c) this).objData[15] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[16] = ((RunnableC0002c) this).objData[3];
        if (((RunnableC0002c) this).objData[4] == 129) {
            i6 = 64;
        }
        int i7 = ((RunnableC0002c) this).objData[2];
        if (((RunnableC0002c) this).objData[5] != 0 && ((RunnableC0002c) this).objData[10] == 0) {
            int[] iArr3 = ((RunnableC0002c) this).objData;
            iArr3[3] = iArr3[3] + 2;
            if (m340b((((RunnableC0002c) this).objData[2] - i6) + 1, ((RunnableC0002c) this).objData[3] + 16) || m340b((((RunnableC0002c) this).objData[2] + i6) - 1, ((RunnableC0002c) this).objData[3] + 16)) {
                ((RunnableC0002c) this).objData[5] = 0;
                if (((RunnableC0002c) this).objData[4] == 0) {
                    ((RunnableC0002c) this).objData[6] = 1;
                }
            }
        }
        int i8 = 0;
        while (true) {
            if (i8 >= 4) {
                i8 = -1;
                break;
            }
            if (((RunnableC0002c) this).objData[8] == RunnableC0002c.f68g[i8] && ((RunnableC0002c) this).objData[9] == RunnableC0002c.f72h[i8]) {
                break;
            }
            i8++;
        }
        if (((RunnableC0002c) this).objData[5] == 0 && i8 != -1 && ((RunnableC0002c) this).objData[10] == 0 && Math.abs(((RunnableC0002c) this).objData[2] - RunnableC0002c.f75i[i8]) <= 16 && Math.abs(((RunnableC0002c) this).objData[3] - RunnableC0002c.f77j[i8]) <= 16) {
            ((RunnableC0002c) this).objData[10] = 1;
        }
        if (((RunnableC0002c) this).objData[17] == 0 && ((RunnableC0002c) this).objData[10] > 0 && ((RunnableC0002c) this).objData[3] < RunnableC0002c.f77j[i8]) {
            int[] iArr4 = ((RunnableC0002c) this).objData;
            iArr4[3] = iArr4[3] + 2;
            if (((RunnableC0002c) this).objData[3] > RunnableC0002c.f77j[i8]) {
                ((RunnableC0002c) this).objData[3] = RunnableC0002c.f77j[i8];
            }
        }
        if (((RunnableC0002c) this).objData[17] == 0) {
            if (((RunnableC0002c) this).objData[10] < 1 || ((RunnableC0002c) this).objData[10] >= 15) {
                if (((RunnableC0002c) this).objData[10] != 15) {
                    if (((RunnableC0002c) this).objData[10] >= 16) {
                        int[] iArr5 = ((RunnableC0002c) this).objData;
                        iArr5[10] = iArr5[10] + 1;
                        if (((RunnableC0002c) this).objData[10] >= 46 && ((RunnableC0002c) this).objData[10] - 48 <= 96 && ((RunnableC0002c) this).objData[10] % 2 == 0) {
                            iArr = ((RunnableC0002c) this).objData;
                            i = iArr[3];
                            i2 = 1;
                            c = 3;
                        }
                    }
                    ((RunnableC0002c) this).objData[17] = 0;
                    if (((RunnableC0002c) this).objData[4] != 129 && this.zoneID == 2) {
                        if (this.zoneID == 2 && this.actID == 0 && ((RunnableC0002c) this).objData[4] == 0) {
                            a2 = m330a(8, 128);
                            for (i4 = 0; i4 < a2.length; i4++) {
                                if ((a2[i4][2] - 56) - (((RunnableC0002c) this).objData[2] - 16) <= 32 && (a2[i4][2] - 56) - (((RunnableC0002c) this).objData[2] - 16) >= -112) {
                                    ((RunnableC0002c) this).objData[3] = a2[i4][3] - 28;
                                }
                            }
                            a3 = m330a(15, 128);
                            ((RunnableC0002c) this).f284e[129] = false;
                            for (i5 = 0; i5 < a3.length; i5++) {
                                if ((a3[i5][2] - 8) - (((RunnableC0002c) this).objData[2] - 16) <= 32 && (a3[i5][2] - 8) - (((RunnableC0002c) this).objData[2] - 16) >= -32 && (a3[i5][3] - 8) - (((RunnableC0002c) this).objData[3] - 16) <= 32 && (a3[i5][3] - 8) - (((RunnableC0002c) this).objData[3] - 16) >= -32) {
                                    ((RunnableC0002c) this).f284e[129] = true;
                                    ((RunnableC0002c) this).f222b[129] = true;
                                }
                            }
                        }
                        if (((RunnableC0002c) this).objData[4] != 0) {
                            int[][] a4 = m330a(9, 16);
                            for (int i9 = 0; i9 < a4.length; i9++) {
                                if ((a4[i9][2] - 20) - (((RunnableC0002c) this).objData[2] - 16) <= 32 && (a4[i9][2] - 20) - (((RunnableC0002c) this).objData[2] - 16) >= -40 && (a4[i9][3] - 20) - (((RunnableC0002c) this).objData[3] - 16) <= 32 && (a4[i9][3] - 20) - (((RunnableC0002c) this).objData[3] - 16) >= -40 && ((RunnableC0002c) this).objData[10] == 15) {
                                    ((RunnableC0002c) this).objData[10] = 16;
                                }
                            }
                        }
                        if (((RunnableC0002c) this).objData[4] == 2) {
                            int[][] a5 = m330a(77, 16);
                            int i10 = 0;
                            while (true) {
                                if (i10 >= a5.length) {
                                    break;
                                }
                                if (((a5[i10][2] - 20) - 64) - (((RunnableC0002c) this).objData[2] - 16) <= 32 && ((a5[i10][2] - 20) - 64) - (((RunnableC0002c) this).objData[2] - 16) >= -112 && (((a5[i10][3] - 48) + 16) - 16) - (((RunnableC0002c) this).objData[3] - 16) <= 32 && (((a5[i10][3] - 48) + 16) - 16) - (((RunnableC0002c) this).objData[3] - 16) >= -32 && a5[i10][5] > 1 && a5[i10][5] / 4 < 26) {
                                    ((RunnableC0002c) this).objData[3] = ((a5[i10][3] - 48) + 16) - 16;
                                    ((RunnableC0002c) this).objData[18] = (a5[i10][2] - 10) + 16;
                                    ((RunnableC0002c) this).objData[17] = 1;
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    int i11 = i7 - ((RunnableC0002c) this).objData[2];
                    a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[15], ((RunnableC0002c) this).objData[16], i6, 16);
                    if (a < 0) {
                        if (a == 0) {
                            int a6 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] - 16, ((RunnableC0002c) this).objData[15], ((RunnableC0002c) this).objData[16] - 16, i6, 2);
                            if (a6 == 1) {
                                if (((((RunnableC0002c) this).f163a[4] && ((RunnableC0002c) this).objData[5] == 0) || ((RunnableC0002c) this).objData[4] == 129 || ((RunnableC0002c) this).objData[4] == 0) && ((RunnableC0002c) this).objData[10] == 0) {
                                    int[] iArr6 = ((RunnableC0002c) this).objData;
                                    iArr6[2] = iArr6[2] + 1;
                                    if (m340b(((RunnableC0002c) this).objData[2] + i6, ((RunnableC0002c) this).objData[3] - 16)) {
                                        iArr2 = ((RunnableC0002c) this).objData;
                                        i3 = iArr2[2] - 1;
                                    }
                                }
                                RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 16) << 8;
                                mo50b(((RunnableC0002c) this).objData[2], i6);
                                m313a(((RunnableC0002c) this).objData[22]);
                                z = true;
                                int[] iArr7 = RunnableC0002c.f47c;
                                iArr7[0] = iArr7[0] - (i11 << 8);
                            } else {
                                if (a6 == 2 && (((((RunnableC0002c) this).f163a[3] && ((RunnableC0002c) this).objData[5] == 0) || ((RunnableC0002c) this).objData[4] == 129 || ((RunnableC0002c) this).objData[4] == 0) && ((RunnableC0002c) this).objData[10] == 0)) {
                                    int[] iArr8 = ((RunnableC0002c) this).objData;
                                    iArr8[2] = iArr8[2] - 1;
                                    if (m340b(((RunnableC0002c) this).objData[2] - i6, ((RunnableC0002c) this).objData[3] - 16)) {
                                        iArr2 = ((RunnableC0002c) this).objData;
                                        i3 = iArr2[2] + 1;
                                    }
                                }
                                RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 16) << 8;
                                mo50b(((RunnableC0002c) this).objData[2], i6);
                                m313a(((RunnableC0002c) this).objData[22]);
                                z = true;
                                int[] iArr72 = RunnableC0002c.f47c;
                                iArr72[0] = iArr72[0] - (i11 << 8);
                            }
                            iArr2[2] = i3;
                            RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 16) << 8;
                            mo50b(((RunnableC0002c) this).objData[2], i6);
                            m313a(((RunnableC0002c) this).objData[22]);
                            z = true;
                            int[] iArr722 = RunnableC0002c.f47c;
                            iArr722[0] = iArr722[0] - (i11 << 8);
                        } else {
                            z = false;
                        }
                        if (a == 1) {
                            if (((RunnableC0002c) this).f163a[4] && (((RunnableC0002c) this).objData[5] == 0 || ((RunnableC0002c) this).objData[4] == 129 || ((RunnableC0002c) this).objData[4] == 0)) {
                                if (((RunnableC0002c) this).objData[10] == 0) {
                                    int[] iArr9 = ((RunnableC0002c) this).objData;
                                    iArr9[2] = iArr9[2] + 1;
                                    ((RunnableC0002c) this).objData[7] = 1;
                                    if (m340b(((RunnableC0002c) this).objData[2] + i6, (((RunnableC0002c) this).objData[3] + 16) - 1)) {
                                        int[] iArr10 = ((RunnableC0002c) this).objData;
                                        iArr10[2] = iArr10[2] - 1;
                                    }
                                    if (((RunnableC0002c) this).objData[4] == 129 && ((RunnableC0002c) this).objData[2] > ((RunnableC0002c) this).objData[8] + 64) {
                                        ((RunnableC0002c) this).objData[2] = ((RunnableC0002c) this).objData[8] + 64;
                                    }
                                }
                                m376s();
                            }
                            RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - i6) - 12) << 8;
                            RunnableC0002c.f47c[10] = 0;
                        }
                        if (a == 2) {
                            if (((RunnableC0002c) this).f163a[3] && (((RunnableC0002c) this).objData[5] == 0 || ((RunnableC0002c) this).objData[4] == 129 || ((RunnableC0002c) this).objData[4] == 0)) {
                                if (((RunnableC0002c) this).objData[10] == 0) {
                                    int[] iArr11 = ((RunnableC0002c) this).objData;
                                    iArr11[2] = iArr11[2] - 1;
                                    ((RunnableC0002c) this).objData[7] = -1;
                                    if (m340b(((RunnableC0002c) this).objData[2] - i6, (((RunnableC0002c) this).objData[3] + 16) - 1)) {
                                        int[] iArr12 = ((RunnableC0002c) this).objData;
                                        iArr12[2] = iArr12[2] + 1;
                                    }
                                }
                                m376s();
                            }
                            RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + i6) + 12) + 1) << 8;
                            RunnableC0002c.f47c[10] = 0;
                        }
                        if (a == 3) {
                            RunnableC0002c.f47c[1] = ((((((RunnableC0002c) this).objData[3] + 16) + 12) + 12) + 1) << 8;
                            mo7B();
                        }
                    } else {
                        z = false;
                    }
                    if (!m340b((((RunnableC0002c) this).objData[2] - i6) + 1, ((RunnableC0002c) this).objData[3] + 16) && !m340b((((RunnableC0002c) this).objData[2] + i6) - 1, ((RunnableC0002c) this).objData[3] + 16)) {
                        int[] iArr13 = ((RunnableC0002c) this).objData;
                        iArr13[5] = iArr13[5] + 1;
                    }
                    if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a != 0) {
                        ((RunnableC0002c) this).f320s = false;
                    }
                    if (!z) {
                        mo64d(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[4]);
                        return;
                    } else {
                        mo73f(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[4]);
                        return;
                    }
                }
                iArr = ((RunnableC0002c) this).objData;
                i = iArr[2];
                i2 = RunnableC0002c.f79k[i8];
                c = 2;
            } else {
                iArr = ((RunnableC0002c) this).objData;
                i = iArr[10];
                i2 = 1;
                c = '\n';
            }
        } else if (RunnableC0002c.f79k[i8] >= 0) {
            ((RunnableC0002c) this).objData[17] = 0;
            a2 = m330a(8, 128);
            while (i4 < a2.length) {
            }
            a3 = m330a(15, 128);
            ((RunnableC0002c) this).f284e[129] = false;
            while (i5 < a3.length) {
            }
            if (((RunnableC0002c) this).objData[4] != 0) {
            }
            if (((RunnableC0002c) this).objData[4] == 2) {
            }
            int i112 = i7 - ((RunnableC0002c) this).objData[2];
            a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[15], ((RunnableC0002c) this).objData[16], i6, 16);
            if (a < 0) {
            }
            int[] iArr132 = ((RunnableC0002c) this).objData;
            iArr132[5] = iArr132[5] + 1;
            ((RunnableC0002c) this).f320s = false;
            if (!z) {
            }
        } else {
            ((RunnableC0002c) this).objData[17] = 0;
            a2 = m330a(8, 128);
            while (i4 < a2.length) {
            }
            a3 = m330a(15, 128);
            ((RunnableC0002c) this).f284e[129] = false;
            while (i5 < a3.length) {
            }
            if (((RunnableC0002c) this).objData[4] != 0) {
            }
            if (((RunnableC0002c) this).objData[4] == 2) {
            }
            int i1122 = i7 - ((RunnableC0002c) this).objData[2];
            a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[15], ((RunnableC0002c) this).objData[16], i6, 16);
            if (a < 0) {
            }
            int[] iArr1322 = ((RunnableC0002c) this).objData;
            iArr1322[5] = iArr1322[5] + 1;
            ((RunnableC0002c) this).f320s = false;
            if (!z) {
            }
        }
        iArr[c] = i2 + i;
        ((RunnableC0002c) this).objData[17] = 0;
        a2 = m330a(8, 128);
        while (i4 < a2.length) {
        }
        a3 = m330a(15, 128);
        ((RunnableC0002c) this).f284e[129] = false;
        while (i5 < a3.length) {
        }
        if (((RunnableC0002c) this).objData[4] != 0) {
        }
        if (((RunnableC0002c) this).objData[4] == 2) {
        }
        int i11222 = i7 - ((RunnableC0002c) this).objData[2];
        a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[15], ((RunnableC0002c) this).objData[16], i6, 16);
        if (a < 0) {
        }
        int[] iArr13222 = ((RunnableC0002c) this).objData;
        iArr13222[5] = iArr13222[5] + 1;
        ((RunnableC0002c) this).f320s = false;
        if (!z) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017f, code lost:
        if (((p000.RunnableC0002c) r11).f163a[4] != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a0, code lost:
        if (((p000.RunnableC0002c) r11).f163a[3] != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ea, code lost:
        if (((p000.RunnableC0002c) r11).f163a[4] != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0205, code lost:
        if (((p000.RunnableC0002c) r11).f163a[3] != false) goto L_0x0181;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ar */
    private void m50ar() {
        int a;
        int[] iArr;
        char c;
        int i;
        int i2;
        int[] iArr2;
        char c2;
        int i3;
        mo51b(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[4]);
        if (((RunnableC0002c) this).objData[4] != 2 && ((RunnableC0002c) this).objData[4] != 10) {
            if (((RunnableC0002c) this).objData[4] == 1) {
                ((RunnableC0002c) this).objData[3] = (((RunnableC0002c) this).objData[9] + ((RunnableC0002c.mo34a(((RunnableC0002c) this).objData[5]) << 3) / 100)) - 8;
                iArr = ((RunnableC0002c) this).objData;
                c = 5;
                i2 = iArr[5];
            }
            a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, 16);
            if (a >= 0) {
            }
            if (((RunnableC0002c) this).f320s) {
            }
        } else if (((RunnableC0002c) this).objData[5] == 2) {
            iArr = ((RunnableC0002c) this).objData;
            i2 = ((RunnableC0002c) this).objData[11] + ((RunnableC0002c.mo34a(((RunnableC0002c) this).f305k) * 6) / 100);
            c = 3;
        } else if (((RunnableC0002c) this).objData[5] == 1) {
            int[] iArr3 = ((RunnableC0002c) this).objData;
            iArr3[10] = iArr3[10] + 1;
            int[] iArr4 = ((RunnableC0002c) this).objData;
            iArr4[3] = iArr4[3] + ((RunnableC0002c) this).objData[10];
            if (m340b((((RunnableC0002c) this).objData[2] - 16) + 1, ((RunnableC0002c) this).objData[3] + 16) || m340b((((RunnableC0002c) this).objData[2] + 16) - 1, ((RunnableC0002c) this).objData[3] + 16)) {
                if ((((RunnableC0002c) this).objData[8] == 4016 && ((RunnableC0002c) this).objData[9] == 1296) || (((RunnableC0002c) this).objData[8] == 3920 && ((RunnableC0002c) this).objData[9] == 1328)) {
                    iArr2 = ((RunnableC0002c) this).objData;
                    c2 = 5;
                    i3 = 0;
                } else {
                    iArr2 = ((RunnableC0002c) this).objData;
                    c2 = 5;
                    i3 = 2;
                }
                iArr2[c2] = i3;
                int[] iArr5 = ((RunnableC0002c) this).objData;
                iArr5[3] = iArr5[3] - ((((RunnableC0002c) this).objData[3] + 16) % 16);
                iArr = ((RunnableC0002c) this).objData;
                c = 11;
                i = ((RunnableC0002c) this).objData[3];
                iArr[c] = i;
            }
            a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, 16);
            if (a >= 0) {
                if (a == 0) {
                    RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 16) << 8;
                    mo50b(((RunnableC0002c) this).objData[2], 16);
                    m313a(((RunnableC0002c) this).objData[22]);
                } else {
                    if (a == 1) {
                        RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - 16) - 12) << 8;
                        RunnableC0002c.f47c[10] = 0;
                    } else if (a == 2) {
                        RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + 16) + 12) + 1) << 8;
                        RunnableC0002c.f47c[10] = 0;
                    } else if (a == 3) {
                        RunnableC0002c.f47c[1] = ((((((RunnableC0002c) this).objData[3] + 16) + 12) + 12) + 1) << 8;
                        mo7B();
                    } else if (a == 4 && this.f196ag != ((RunnableC0002c) this).objData[20]) {
                        if (RunnableC0002c.mo33a() < ((RunnableC0002c) this).objData[2]) {
                            RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - 16) - 12) << 8;
                            RunnableC0002c.f47c[10] = 0;
                        } else {
                            RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + 16) + 12) + 1) << 8;
                            RunnableC0002c.f47c[10] = 0;
                        }
                    }
                    m376s();
                }
            }
            if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a != 0) {
                ((RunnableC0002c) this).f320s = false;
                return;
            }
            return;
        } else {
            if (((RunnableC0002c) this).objData[3] < RunnableC0002c.mo48b() && ((RunnableC0002c) this).objData[2] - 100 < RunnableC0002c.mo33a()) {
                ((RunnableC0002c) this).objData[10] = 1;
                iArr = ((RunnableC0002c) this).objData;
                c = 5;
                i = 1;
                iArr[c] = i;
            }
            a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, 16);
            if (a >= 0) {
            }
            if (((RunnableC0002c) this).f320s) {
                return;
            }
            return;
        }
        i = i2 + 6;
        iArr[c] = i;
        a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 16, 16);
        if (a >= 0) {
        }
        if (((RunnableC0002c) this).f320s) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x025a  */
    /* renamed from: as */
    private void m51as() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        char c;
        int[] iArr2;
        int i10;
        int i11;
        int i12;
        boolean z;
        int[] iArr3;
        int i13;
        int i14;
        int[] iArr4;
        int i15;
        int i16 = 48;
        int i17 = 0;
        if (((RunnableC0002c) this).objData[4] == 57) {
            i2 = 63;
        } else if (((RunnableC0002c) this).objData[4] == 40) {
            i2 = 32;
        } else {
            i = 16;
            ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
            ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
            if (((RunnableC0002c) this).objData[4] != 7 || ((RunnableC0002c) this).objData[4] == 4) {
                i3 = 16;
                if (((RunnableC0002c) this).objData[10] != 1) {
                    int i18 = ((RunnableC0002c) this).objData[2];
                    int[] iArr5 = ((RunnableC0002c) this).objData;
                    iArr5[2] = iArr5[2] + 1;
                    if (((RunnableC0002c) this).objData[4] == 7) {
                        if (m340b(((RunnableC0002c) this).objData[2] + 16, ((((RunnableC0002c) this).objData[3] + 8) - 1) - 16)) {
                            iArr4 = ((RunnableC0002c) this).objData;
                            i15 = iArr4[2] - 1;
                        }
                        i4 = i18 - ((RunnableC0002c) this).objData[2];
                        i = 8;
                    } else {
                        if (Math.abs(((RunnableC0002c) this).objData[2] - ((RunnableC0002c) this).objData[8]) >= 96) {
                            iArr4 = ((RunnableC0002c) this).objData;
                            i15 = ((RunnableC0002c) this).objData[8] + 96;
                        }
                        i4 = i18 - ((RunnableC0002c) this).objData[2];
                        i = 8;
                    }
                    iArr4[2] = i15;
                    ((RunnableC0002c) this).objData[10] = 2;
                    i4 = i18 - ((RunnableC0002c) this).objData[2];
                    i = 8;
                } else {
                    if (((RunnableC0002c) this).objData[10] == 2) {
                        int[] iArr6 = ((RunnableC0002c) this).objData;
                        iArr6[3] = iArr6[3] + 5;
                        if (m340b((((RunnableC0002c) this).objData[2] - 16) + 1, ((RunnableC0002c) this).objData[3] + 8) || m340b((((RunnableC0002c) this).objData[2] + 16) - 1, ((RunnableC0002c) this).objData[3] + 8)) {
                            ((RunnableC0002c) this).objData[5] = 0;
                            int[] iArr7 = ((RunnableC0002c) this).objData;
                            iArr7[3] = iArr7[3] - ((((RunnableC0002c) this).objData[3] + 8) % 16);
                            ((RunnableC0002c) this).objData[10] = 3;
                        }
                    }
                    i4 = 0;
                    i = 8;
                }
            } else {
                i4 = 0;
                i3 = i16;
            }
            if (((RunnableC0002c) this).objData[4] != 1) {
                i3 = 16;
                i6 = 16;
                int i19 = ((RunnableC0002c) this).objData[2];
                if (((RunnableC0002c) this).f305k % 384 <= 144) {
                    iArr3 = ((RunnableC0002c) this).objData;
                    i13 = ((RunnableC0002c) this).objData[8];
                    i14 = (((RunnableC0002c) this).f305k % 384) / 3;
                } else {
                    if (((RunnableC0002c) this).f305k % 384 > 240) {
                        iArr3 = ((RunnableC0002c) this).objData;
                        i13 = ((RunnableC0002c) this).objData[8];
                        i14 = 48 - (((((RunnableC0002c) this).f305k % 384) / 3) - 80);
                    }
                    i5 = i19 - ((RunnableC0002c) this).objData[2];
                }
                iArr3[2] = i13 - i14;
                i5 = i19 - ((RunnableC0002c) this).objData[2];
            } else {
                if (((RunnableC0002c) this).objData[4] == 2) {
                    i3 = 16;
                    i = 16;
                    ((RunnableC0002c) this).objData[3] = ((RunnableC0002c) this).objData[9] + 9;
                    if (((RunnableC0002c) this).objData[10] != 0) {
                        int i20 = ((RunnableC0002c) this).objData[2];
                        int[] iArr8 = ((RunnableC0002c) this).objData;
                        iArr8[2] = iArr8[2] + 1;
                        if (m340b(((RunnableC0002c) this).objData[2] + 16, ((((RunnableC0002c) this).objData[3] + 16) - 1) - 16)) {
                            int[] iArr9 = ((RunnableC0002c) this).objData;
                            iArr9[2] = iArr9[2] - 1;
                        }
                        i5 = i20 - ((RunnableC0002c) this).objData[2];
                        i6 = 16;
                    }
                } else if (((RunnableC0002c) this).objData[4] == 65) {
                    int i21 = ((RunnableC0002c) this).objData[2];
                    ((RunnableC0002c) this).objData[2] = ((((RunnableC0002c) this).objData[8] + ((RunnableC0002c.mo34a(((RunnableC0002c) this).f305k) * 48) / 100)) - 32) - 48;
                    ((RunnableC0002c) this).objData[3] = ((RunnableC0002c) this).objData[9] + 8;
                    i3 = 47;
                    i5 = i21 - ((RunnableC0002c) this).objData[2];
                    i17 = 32;
                    i6 = i;
                } else {
                    if (((RunnableC0002c) this).objData[4] == 57) {
                        if (((RunnableC0002c) this).objData[10] != 0) {
                            int[] iArr10 = ((RunnableC0002c) this).objData;
                            iArr10[10] = iArr10[10] + 1;
                        }
                        if (((RunnableC0002c) this).objData[10] > 5) {
                            int i22 = ((RunnableC0002c) this).objData[2];
                            if (((RunnableC0002c) this).objData[19] != 0) {
                                if (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11] <= 32) {
                                    iArr2 = ((RunnableC0002c) this).objData;
                                    i10 = ((RunnableC0002c) this).objData[8];
                                    i11 = (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11]) << 2;
                                } else {
                                    if (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11] >= 500 && ((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11] < 532) {
                                        iArr2 = ((RunnableC0002c) this).objData;
                                        i10 = ((RunnableC0002c) this).objData[8];
                                        i11 = 128 - (((((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11]) - 500) << 2);
                                    }
                                    if (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11] >= 532) {
                                    }
                                    i5 = i22 - ((RunnableC0002c) this).objData[2];
                                    i6 = i;
                                }
                                i12 = i10 - i11;
                            } else if (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11] <= 32) {
                                iArr2 = ((RunnableC0002c) this).objData;
                                i12 = ((RunnableC0002c) this).objData[8] + ((((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11]) << 2);
                            } else {
                                if (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11] >= 500 && ((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11] < 532) {
                                    iArr2 = ((RunnableC0002c) this).objData;
                                    i12 = ((RunnableC0002c) this).objData[8] + (128 - (((((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11]) - 500) << 2));
                                }
                                if (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11] >= 532) {
                                    ((RunnableC0002c) this).objData[10] = 0;
                                    ((RunnableC0002c) this).objData[11] = 0;
                                    ((RunnableC0002c) this).objData[2] = ((RunnableC0002c) this).objData[8];
                                }
                                i5 = i22 - ((RunnableC0002c) this).objData[2];
                                i6 = i;
                            }
                            iArr2[2] = i12;
                            if (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[11] >= 532) {
                            }
                            i5 = i22 - ((RunnableC0002c) this).objData[2];
                            i6 = i;
                        } else {
                            iArr = ((RunnableC0002c) this).objData;
                            i9 = ((RunnableC0002c) this).objData[8];
                            c = 2;
                        }
                    } else if (((RunnableC0002c) this).objData[4] == 40) {
                        if ((((RunnableC0002c) this).f305k >> 1) % 256 < 128) {
                            iArr = ((RunnableC0002c) this).objData;
                            i7 = ((RunnableC0002c) this).objData[9];
                            i8 = (((RunnableC0002c) this).f305k >> 1) % 256;
                        } else {
                            iArr = ((RunnableC0002c) this).objData;
                            i7 = ((RunnableC0002c) this).objData[9];
                            i8 = 128 - (((((RunnableC0002c) this).f305k >>> 1) % 256) - 128);
                        }
                        i9 = i7 - i8;
                        c = 3;
                    }
                    iArr[c] = i9;
                }
                i5 = i4;
                i6 = i;
            }
            int i23 = -1;
            if (((((RunnableC0002c) this).objData[4] != 7 || ((RunnableC0002c) this).objData[4] == 4) && ((RunnableC0002c) this).objData[5] == 0) || (i23 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2] + i17, ((RunnableC0002c) this).objData[3] + 0, ((RunnableC0002c) this).objData[6] + i17, ((RunnableC0002c) this).objData[7] + 0, i3, i6)) < 0 || i23 != 0) {
                z = false;
            } else {
                RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - i6) + 0) << 8;
                if (((RunnableC0002c) this).objData[4] == 2 || ((RunnableC0002c) this).objData[4] == 1 || ((RunnableC0002c) this).objData[4] == 65) {
                    if (((RunnableC0002c) this).objData[10] == 0) {
                        ((RunnableC0002c) this).objData[10] = 1;
                        ((RunnableC0002c) this).objData[11] = ((RunnableC0002c) this).f305k;
                    }
                    int[] iArr11 = RunnableC0002c.f47c;
                    iArr11[0] = iArr11[0] - (i5 << 8);
                }
                if (((RunnableC0002c) this).objData[4] == 57) {
                    if ((((RunnableC0002c) this).objData[2] + i17) - i3 <= RunnableC0002c.mo33a() && RunnableC0002c.mo33a() <= ((RunnableC0002c) this).objData[2] + i17 + i3 && ((RunnableC0002c) this).objData[10] == 0) {
                        ((RunnableC0002c) this).objData[10] = 1;
                        ((RunnableC0002c) this).objData[11] = ((RunnableC0002c) this).f305k;
                    }
                    int[] iArr12 = RunnableC0002c.f47c;
                    iArr12[0] = iArr12[0] - (i5 << 8);
                }
                if (((RunnableC0002c) this).objData[4] == 7 || ((RunnableC0002c) this).objData[4] == 4) {
                    if (((RunnableC0002c) this).objData[5] == 1 && ((RunnableC0002c) this).objData[10] == 0) {
                        ((RunnableC0002c) this).objData[10] = 1;
                    }
                    int[] iArr13 = RunnableC0002c.f47c;
                    iArr13[0] = iArr13[0] - (i5 << 8);
                }
                mo50b(((RunnableC0002c) this).objData[2] + i17, i3);
                m313a(((RunnableC0002c) this).objData[22]);
                z = true;
            }
            if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && i23 != 0) {
                ((RunnableC0002c) this).f320s = false;
            }
            if (!z) {
                mo58c(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[4]);
                return;
            } else {
                mo69e(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[4]);
                return;
            }
        }
        i = 8;
        i16 = i2;
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        if (((RunnableC0002c) this).objData[4] != 7) {
        }
        i3 = 16;
        if (((RunnableC0002c) this).objData[10] != 1) {
        }
        if (((RunnableC0002c) this).objData[4] != 1) {
        }
        int i232 = -1;
        if (((RunnableC0002c) this).objData[4] != 7) {
        }
        z = false;
        ((RunnableC0002c) this).f320s = false;
        if (!z) {
        }
    }

    /* renamed from: at */
    private void m52at() {
        int[] iArr;
        int i;
        int i2;
        char c;
        int a;
        int i3 = ((RunnableC0002c) this).objData[2];
        if (((RunnableC0002c) this).objData[5] == 0) {
            if (((RunnableC0002c) this).objData[2] + 160 < RunnableC0002c.mo33a() && Math.abs((((RunnableC0002c) this).objData[3] - RunnableC0002c.mo48b()) + 12) < 43) {
                iArr = ((RunnableC0002c) this).objData;
                i = iArr[5];
                i2 = 1;
                c = 5;
            }
            if (((RunnableC0002c) this).objData[2] + 96 > RunnableC0002c.mo33a() && Math.abs((((RunnableC0002c) this).objData[3] - RunnableC0002c.mo48b()) + 12) < 43) {
                m378u();
                if (((RunnableC0002c) this).objData[5] > 0 && RunnableC0002c.mo33a() + 300 < ((RunnableC0002c) this).objData[2]) {
                    ((RunnableC0002c) this).objData[2] = RunnableC0002c.mo33a() + 300;
                }
            }
            a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2] - 96, ((RunnableC0002c) this).objData[3], i3 - 96, ((RunnableC0002c) this).objData[3], 120, 32);
            if (a >= 0 && a != 0 && a != 1) {
                if (a == 2) {
                    RunnableC0002c.f47c[0] = ((((((RunnableC0002c) this).objData[2] + 120) - 96) + 12) + 1) << 8;
                    RunnableC0002c.f47c[10] = 0;
                    return;
                } else if (a == 3) {
                    RunnableC0002c.f47c[1] = ((((((RunnableC0002c) this).objData[3] + 32) + 12) + 12) + 1) << 8;
                    RunnableC0002c.f47c[5] = 0;
                    mo7B();
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            int[] iArr2 = ((RunnableC0002c) this).objData;
            iArr2[5] = iArr2[5] + 2;
            if (((RunnableC0002c) this).objData[5] > 1152) {
                ((RunnableC0002c) this).objData[5] = 1152;
            }
            iArr = ((RunnableC0002c) this).objData;
            i = ((RunnableC0002c) this).objData[5];
            i2 = ((RunnableC0002c) this).objData[8];
            c = 2;
        }
        iArr[c] = i2 + i;
        m378u();
        ((RunnableC0002c) this).objData[2] = RunnableC0002c.mo33a() + 300;
        a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2] - 96, ((RunnableC0002c) this).objData[3], i3 - 96, ((RunnableC0002c) this).objData[3], 120, 32);
        if (a >= 0) {
        }
    }

    /* renamed from: au */
    private void m53au() {
        int[] iArr;
        int i;
        ((RunnableC0002c) this).objData[5] = (((RunnableC0002c) this).f305k / 2) % 180;
        if (((RunnableC0002c) this).objData[5] == 0) {
            ((RunnableC0002c) this).objData[10] = 0;
        }
        ((RunnableC0002c) this).objData[2] = ((RunnableC0002c) this).objData[8];
        ((RunnableC0002c) this).objData[3] = (((RunnableC0002c) this).objData[9] - 356) + (((RunnableC0002c) this).objData[5] << 3);
        if (Math.abs(RunnableC0002c.mo33a() - ((RunnableC0002c) this).objData[2]) < 44 && (((RunnableC0002c) this).objData[3] >= ((RunnableC0002c) this).objData[9] ? !(((RunnableC0002c) this).objData[3] - 240 >= RunnableC0002c.mo48b() || ((RunnableC0002c) this).objData[9] <= RunnableC0002c.mo48b() - 12) : !(((RunnableC0002c) this).objData[3] - 240 >= RunnableC0002c.mo48b() || ((RunnableC0002c) this).objData[3] <= RunnableC0002c.mo48b() - 12))) {
            m378u();
        }
        if (((RunnableC0002c) this).objData[10] != 0) {
            iArr = ((RunnableC0002c) this).objData;
            i = iArr[10] + 1;
        } else if (((RunnableC0002c) this).objData[3] > ((RunnableC0002c) this).objData[9]) {
            iArr = ((RunnableC0002c) this).objData;
            i = 1;
        } else {
            return;
        }
        iArr[10] = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008d, code lost:
        if (((p000.RunnableC0002c) r11).f163a[4] != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00af, code lost:
        if (((p000.RunnableC0002c) r11).f163a[3] != false) goto L_0x008f;
     */
    /* renamed from: av */
    private void m54av() {
        int i = 7;
        if (((RunnableC0002c) this).f284e[((RunnableC0002c) this).objData[4]]) {
            i = 0;
        }
        ((RunnableC0002c) this).f284e[((RunnableC0002c) this).objData[4]] = false;
        int a = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 14, i);
        if (a >= 0) {
            if (a == 0) {
                RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - i) << 8;
                ((RunnableC0002c) this).f284e[((RunnableC0002c) this).objData[4]] = true;
                ((RunnableC0002c) this).f222b[((RunnableC0002c) this).objData[4]] = true;
                mo50b(((RunnableC0002c) this).objData[2], 14);
                m313a(((RunnableC0002c) this).objData[22]);
            } else {
                if (a == 1) {
                    RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - 14) - 12) << 8;
                    RunnableC0002c.f47c[10] = 0;
                } else if (a == 2) {
                    RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + 14) + 12) + 1) << 8;
                    RunnableC0002c.f47c[10] = 0;
                }
                m376s();
            }
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: aw */
    private void m55aw() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Game bVar;
        int a;
        int[] iArr;
        int i7;
        char c;
        int i8 = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[11] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[14];
        int i9 = this.zoneID == 4 ? 16 : 8;
        if (((RunnableC0002c) this).objData[4] == 5) {
            ((RunnableC0002c) this).objData[5] = ((((RunnableC0002c) this).f305k * 15) / 10) % 360;
            i2 = ((RunnableC0002c) this).objData[5];
            i = 64;
        } else if (((RunnableC0002c) this).objData[4] == 1) {
            ((RunnableC0002c) this).objData[5] = ((((RunnableC0002c) this).f305k * 15) / 10) % 360;
            i2 = ((RunnableC0002c) this).objData[5];
            i = -64;
        } else {
            i = 0;
            i2 = 0;
        }
        if (((RunnableC0002c) this).objData[4] == 12) {
            ((RunnableC0002c) this).objData[5] = ((((RunnableC0002c) this).f305k * 15) / 10) % 360;
            i4 = ((RunnableC0002c) this).objData[5];
            i5 = 48;
        } else if (((RunnableC0002c) this).objData[4] == 11) {
            ((RunnableC0002c) this).objData[5] = ((((RunnableC0002c) this).f305k * 15) / 10) % 360;
            i4 = ((RunnableC0002c) this).objData[5];
            i5 = -48;
        } else if (((RunnableC0002c) this).objData[4] == 6) {
            ((RunnableC0002c) this).objData[5] = ((((RunnableC0002c) this).f305k * 15) / 10) % 360;
            i4 = ((RunnableC0002c) this).objData[5];
            i5 = 64;
        } else if (((RunnableC0002c) this).objData[4] == 2) {
            ((RunnableC0002c) this).objData[5] = ((((RunnableC0002c) this).f305k * 15) / 10) % 360;
            i4 = ((RunnableC0002c) this).objData[5];
            i5 = -64;
        } else if (((RunnableC0002c) this).objData[4] == 16) {
            ((RunnableC0002c) this).objData[5] = ((((RunnableC0002c) this).f305k * 15) / 10) % 360;
            i4 = ((RunnableC0002c) this).objData[5];
            i5 = -32;
        } else {
            i3 = 0;
            i4 = i2;
            if (((RunnableC0002c) this).objData[4] != 7) {
                if (((RunnableC0002c) this).f284e[128] && ((RunnableC0002c) this).objData[5] <= 0) {
                    int[] iArr2 = ((RunnableC0002c) this).objData;
                    iArr2[5] = iArr2[5] + 1;
                }
                if (((RunnableC0002c) this).objData[5] > 0) {
                    int[] iArr3 = ((RunnableC0002c) this).objData;
                    iArr3[5] = iArr3[5] + 1;
                    if (((RunnableC0002c) this).objData[5] > 90) {
                        int[] iArr4 = ((RunnableC0002c) this).objData;
                        iArr4[3] = iArr4[3] - 2;
                        if (((RunnableC0002c) this).objData[3] < 368) {
                            ((RunnableC0002c) this).objData[3] = 368;
                        }
                    }
                }
                bVar = this;
            } else if (((RunnableC0002c) this).objData[4] != 3 || ((RunnableC0002c) this).objData[5] == 0) {
                i6 = i4;
                if (((RunnableC0002c) this).objData[4] == 3) {
                    a = ((RunnableC0002c) this).objData[18] >> 8;
                    iArr = ((RunnableC0002c) this).objData;
                    i7 = ((RunnableC0002c) this).objData[9];
                    c = 3;
                } else {
                    if (((RunnableC0002c) this).objData[4] != 7) {
                        ((RunnableC0002c) this).objData[3] = ((RunnableC0002c.mo34a(i6) * i3) / 100) + ((RunnableC0002c) this).objData[9];
                        a = (i * RunnableC0002c.mo34a(i6)) / 100;
                        iArr = ((RunnableC0002c) this).objData;
                        i7 = ((RunnableC0002c) this).objData[8];
                        c = 2;
                    }
                    ((RunnableC0002c) this).objData[14] = 0;
                    if (((RunnableC0002c) this).objData[13] != 0) {
                        ((RunnableC0002c) this).objData[14] = 4;
                    }
                    ((RunnableC0002c) this).objData[13] = 0;
                    int i10 = i8 - ((RunnableC0002c) this).objData[2];
                    int a2 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[14] + 32, ((RunnableC0002c) this).objData[11], ((RunnableC0002c) this).objData[7] + 32, 32, 8);
                    if (a2 >= 0 && a2 == 0) {
                        RunnableC0002c.f47c[0] = (RunnableC0002c.mo33a() - i10) << 8;
                        RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - i9) + ((RunnableC0002c) this).objData[14]) << 8;
                        if (((RunnableC0002c) this).objData[4] == 3 && i6 == 0) {
                            ((RunnableC0002c) this).objData[5] = 1;
                        }
                        mo50b(((RunnableC0002c) this).objData[2], 32);
                        m313a(((RunnableC0002c) this).objData[22]);
                        ((RunnableC0002c) this).objData[13] = 1;
                    }
                    if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a2 != 0) {
                        ((RunnableC0002c) this).f320s = false;
                    }
                    int a3 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], (((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[14]) - 4, ((RunnableC0002c) this).objData[11], ((RunnableC0002c) this).objData[7] - 4, 32, 4);
                    if (a3 >= 0 && a3 != 3) {
                        RunnableC0002c.f47c[0] = (RunnableC0002c.mo33a() - i10) << 8;
                        RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - i9) + ((RunnableC0002c) this).objData[14]) << 8;
                        if (((RunnableC0002c) this).objData[4] == 3 && i6 == 0) {
                            ((RunnableC0002c) this).objData[5] = 1;
                        }
                        mo50b(((RunnableC0002c) this).objData[2], 32);
                        m313a(((RunnableC0002c) this).objData[22]);
                        ((RunnableC0002c) this).objData[13] = 1;
                    }
                    if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && a3 != 0) {
                        ((RunnableC0002c) this).f320s = false;
                        return;
                    }
                    return;
                }
                iArr[c] = a + i7;
                ((RunnableC0002c) this).objData[14] = 0;
                if (((RunnableC0002c) this).objData[13] != 0) {
                }
                ((RunnableC0002c) this).objData[13] = 0;
                int i102 = i8 - ((RunnableC0002c) this).objData[2];
                int a22 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[14] + 32, ((RunnableC0002c) this).objData[11], ((RunnableC0002c) this).objData[7] + 32, 32, 8);
                RunnableC0002c.f47c[0] = (RunnableC0002c.mo33a() - i102) << 8;
                RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - i9) + ((RunnableC0002c) this).objData[14]) << 8;
                ((RunnableC0002c) this).objData[5] = 1;
                mo50b(((RunnableC0002c) this).objData[2], 32);
                m313a(((RunnableC0002c) this).objData[22]);
                ((RunnableC0002c) this).objData[13] = 1;
                ((RunnableC0002c) this).f320s = false;
                int a32 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], (((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[14]) - 4, ((RunnableC0002c) this).objData[11], ((RunnableC0002c) this).objData[7] - 4, 32, 4);
                RunnableC0002c.f47c[0] = (RunnableC0002c.mo33a() - i102) << 8;
                RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - i9) + ((RunnableC0002c) this).objData[14]) << 8;
                ((RunnableC0002c) this).objData[5] = 1;
                mo50b(((RunnableC0002c) this).objData[2], 32);
                m313a(((RunnableC0002c) this).objData[22]);
                ((RunnableC0002c) this).objData[13] = 1;
                if (((RunnableC0002c) this).f320s) {
                    return;
                }
                return;
            } else {
                int[] iArr5 = ((RunnableC0002c) this).objData;
                iArr5[5] = iArr5[5] + 1;
                if (((RunnableC0002c) this).objData[5] > 40) {
                    int[] iArr6 = ((RunnableC0002c) this).objData;
                    iArr6[6] = iArr6[6] + 80;
                    int[] iArr7 = ((RunnableC0002c) this).objData;
                    iArr7[18] = iArr7[18] + ((RunnableC0002c) this).objData[6];
                }
                bVar = this;
            }
            i6 = ((RunnableC0002c) bVar).objData[5];
            if (((RunnableC0002c) this).objData[4] == 3) {
            }
            iArr[c] = a + i7;
            ((RunnableC0002c) this).objData[14] = 0;
            if (((RunnableC0002c) this).objData[13] != 0) {
            }
            ((RunnableC0002c) this).objData[13] = 0;
            int i1022 = i8 - ((RunnableC0002c) this).objData[2];
            int a222 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[14] + 32, ((RunnableC0002c) this).objData[11], ((RunnableC0002c) this).objData[7] + 32, 32, 8);
            RunnableC0002c.f47c[0] = (RunnableC0002c.mo33a() - i1022) << 8;
            RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - i9) + ((RunnableC0002c) this).objData[14]) << 8;
            ((RunnableC0002c) this).objData[5] = 1;
            mo50b(((RunnableC0002c) this).objData[2], 32);
            m313a(((RunnableC0002c) this).objData[22]);
            ((RunnableC0002c) this).objData[13] = 1;
            ((RunnableC0002c) this).f320s = false;
            int a322 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], (((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[14]) - 4, ((RunnableC0002c) this).objData[11], ((RunnableC0002c) this).objData[7] - 4, 32, 4);
            RunnableC0002c.f47c[0] = (RunnableC0002c.mo33a() - i1022) << 8;
            RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - i9) + ((RunnableC0002c) this).objData[14]) << 8;
            ((RunnableC0002c) this).objData[5] = 1;
            mo50b(((RunnableC0002c) this).objData[2], 32);
            m313a(((RunnableC0002c) this).objData[22]);
            ((RunnableC0002c) this).objData[13] = 1;
            if (((RunnableC0002c) this).f320s) {
            }
        }
        i3 = i5;
        if (((RunnableC0002c) this).objData[4] != 7) {
        }
        i6 = ((RunnableC0002c) bVar).objData[5];
        if (((RunnableC0002c) this).objData[4] == 3) {
        }
        iArr[c] = a + i7;
        ((RunnableC0002c) this).objData[14] = 0;
        if (((RunnableC0002c) this).objData[13] != 0) {
        }
        ((RunnableC0002c) this).objData[13] = 0;
        int i10222 = i8 - ((RunnableC0002c) this).objData[2];
        int a2222 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[14] + 32, ((RunnableC0002c) this).objData[11], ((RunnableC0002c) this).objData[7] + 32, 32, 8);
        RunnableC0002c.f47c[0] = (RunnableC0002c.mo33a() - i10222) << 8;
        RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - i9) + ((RunnableC0002c) this).objData[14]) << 8;
        ((RunnableC0002c) this).objData[5] = 1;
        mo50b(((RunnableC0002c) this).objData[2], 32);
        m313a(((RunnableC0002c) this).objData[22]);
        ((RunnableC0002c) this).objData[13] = 1;
        ((RunnableC0002c) this).f320s = false;
        int a3222 = RunnableC0002c.m134a(((RunnableC0002c) this).objData[2], (((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[14]) - 4, ((RunnableC0002c) this).objData[11], ((RunnableC0002c) this).objData[7] - 4, 32, 4);
        RunnableC0002c.f47c[0] = (RunnableC0002c.mo33a() - i10222) << 8;
        RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] - i9) + ((RunnableC0002c) this).objData[14]) << 8;
        ((RunnableC0002c) this).objData[5] = 1;
        mo50b(((RunnableC0002c) this).objData[2], 32);
        m313a(((RunnableC0002c) this).objData[22]);
        ((RunnableC0002c) this).objData[13] = 1;
        if (((RunnableC0002c) this).f320s) {
        }
    }

    /* renamed from: ax */
    private void BasicPlatform() {
        m21aN();
    }

    /* renamed from: ay */
    private void m57ay() {
        int[] iArr;
        int i;
        int i2;
        int i3 = -1;
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        for (int i4 = 0; i4 < 2; i4++) {
            if (((RunnableC0002c) this).objData[i4 + 10] != 1) {
                int a = RunnableC0002c.m134a((((RunnableC0002c) this).objData[2] - 8) + (i4 << 4), ((RunnableC0002c) this).objData[3], (((RunnableC0002c) this).objData[6] - 8) + (i4 << 4), ((RunnableC0002c) this).objData[7], 8, 32);
                if (a >= 0) {
                    int i5 = a == 1 ? 1 : -1;
                    if (a == 1 || a == 2) {
                        if (Math.abs(RunnableC0002c.f47c[10]) < 300 || RunnableC0002c.f67g || !RunnableC0002c.f74i) {
                            RunnableC0002c.f47c[10] = 0;
                        } else {
                            int[] iArr2 = RunnableC0002c.f47c;
                            iArr2[10] = iArr2[10] - (i5 * 10);
                            ((RunnableC0002c) this).objData[i4 + 10] = 1;
                            int i6 = 24;
                            if (this.zoneID == 0) {
                                i2 = ((RunnableC0002c) this).objData[4];
                                i6 = 26;
                            } else {
                                i2 = 0;
                            }
                            m336b(i6, (i4 << 4) + (((RunnableC0002c) this).objData[2] - 8), (((RunnableC0002c) this).objData[3] - 16) - 16, (i5 * 30) + 360, 400, i2);
                            m336b(i6, (i4 << 4) + (((RunnableC0002c) this).objData[2] - 8), ((((RunnableC0002c) this).objData[3] - 16) - 16) + 16, (i5 * 60) + 360, 400, i2);
                            m336b(i6, (i4 << 4) + (((RunnableC0002c) this).objData[2] - 8), ((((RunnableC0002c) this).objData[3] - 16) - 16) + 32, (i5 * 40) + 360, 400, i2);
                            m336b(i6, (i4 << 4) + (((RunnableC0002c) this).objData[2] - 8), ((((RunnableC0002c) this).objData[3] - 16) - 16) + 48, (i5 * 50) + 360, 400, i2);
                        }
                        if (RunnableC0002c.f47c[10] == 0) {
                            if (i5 == 1) {
                                iArr = RunnableC0002c.f47c;
                                i = (((RunnableC0002c) this).objData[2] - 8) - 12;
                            } else {
                                iArr = RunnableC0002c.f47c;
                                i = ((RunnableC0002c) this).objData[2] + 8 + 12 + 1;
                            }
                            iArr[0] = ((i - 8) + (i4 << 4)) << 8;
                            if (i5 == 1) {
                                if (((RunnableC0002c) this).f163a[4]) {
                                    m376s();
                                    i3 = a;
                                }
                            } else if (((RunnableC0002c) this).f163a[3]) {
                                m376s();
                                i3 = a;
                            }
                        }
                    } else if (a == 3) {
                        RunnableC0002c.f47c[1] = ((((((RunnableC0002c) this).objData[3] + 32) + 12) + 12) + 1) << 8;
                        mo7B();
                    }
                }
                i3 = a;
            }
        }
        if (((RunnableC0002c) this).objData[10] == 1 && ((RunnableC0002c) this).objData[11] == 1) {
            ((RunnableC0002c) this).objData[0] = 0;
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && i3 != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x014a, code lost:
        if (((p000.RunnableC0002c) r17).f163a[4] != false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0180, code lost:
        if (((p000.RunnableC0002c) r17).f163a[3] != false) goto L_0x014c;
     */
    /* renamed from: az */
    private void m58az() {
        boolean z;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        ((RunnableC0002c) this).objData[10] = ((RunnableC0002c) this).f305k;
        ((RunnableC0002c) this).objData[6] = ((RunnableC0002c) this).objData[2];
        ((RunnableC0002c) this).objData[7] = ((RunnableC0002c) this).objData[3];
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = (((RunnableC0002c) this).objData[15] == 0 || (i = (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[16]) - RunnableC0002c.f84m[i3]) >= 0) ? i : 0;
            int i5 = RunnableC0002c.f81l[i3];
            i2 = i4 != 0 ? -1 : RunnableC0002c.m135a(RunnableC0002c.mo33a(), RunnableC0002c.mo48b() - 12, RunnableC0002c.f40b[0], RunnableC0002c.f40b[1] - 12, 12, 12, ((RunnableC0002c) this).objData[2] + ((((i5 % 4) << 4) - 16) - 8), ((RunnableC0002c) this).objData[3] + ((i5 >> 2) << 4), ((RunnableC0002c) this).objData[6] + ((((i5 % 4) << 4) - 16) - 8), ((RunnableC0002c) this).objData[7] + ((i5 >> 2) << 4), 8, 8);
            if (i2 >= 0) {
                if (i2 == 0) {
                    RunnableC0002c.f47c[1] = ((((RunnableC0002c) this).objData[3] + (((i5 >> 2) << 4) + (i4 * 5))) - 8) << 8;
                    mo50b(((RunnableC0002c) this).objData[2] + ((((i5 % 4) << 4) - 16) - 8), 8);
                    m313a(((RunnableC0002c) this).objData[22]);
                    if (((RunnableC0002c) this).objData[15] == 0) {
                        ((RunnableC0002c) this).objData[16] = ((RunnableC0002c) this).f305k;
                    }
                    ((RunnableC0002c) this).objData[15] = 1;
                    z = true;
                    z2 = z;
                    i = i4;
                } else {
                    if (i2 == 1) {
                        RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] + ((((i5 % 4) << 4) - 16) - 8)) - 8) - 12) << 8;
                        RunnableC0002c.f47c[10] = 0;
                    } else if (i2 == 2) {
                        RunnableC0002c.f47c[0] = ((((((RunnableC0002c) this).objData[2] + ((((i5 % 4) << 4) - 16) - 8)) + 8) + 12) + 1) << 8;
                        RunnableC0002c.f47c[10] = 0;
                    }
                    m376s();
                }
            }
            z = z2;
            z2 = z;
            i = i4;
        }
        int i6 = z2 ? 0 : i2;
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && i6 != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* renamed from: bA */
    private void m59bA() {
        int i;
        int i2;
        int a;
        int a2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (((RunnableC0002c) this).objData[4] == 1) {
            a = ((RunnableC0002c.mo34a(((RunnableC0002c) this).objData[5]) * 16) / 100) - 16;
            a2 = ((RunnableC0002c.mo34a(((RunnableC0002c) this).objData[5]) * -9) / 100) - 9;
        } else if (((RunnableC0002c) this).objData[4] == 2) {
            a = ((RunnableC0002c.mo34a(((RunnableC0002c) this).objData[5]) * -16) / 100) - 16;
            a2 = ((RunnableC0002c.mo34a(((RunnableC0002c) this).objData[5]) * 9) / 100) - 9;
        } else {
            i = 0;
            i2 = 0;
            if (((RunnableC0002c) this).objData[4] != 20 || ((RunnableC0002c) this).objData[4] == 4) {
                int a3 = ((RunnableC0002c.mo34a(((RunnableC0002c) this).f305k) * 28) / 100) - 28;
                RunnableC0002c.m204b(79, 0, 0, 32, 56, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2] - 16, (((RunnableC0002c) this).objData[3] - 28) + 16);
                RunnableC0002c.m204b(79, 0, 0, 32, 56, RunnableC0002c.rotationQuadrants[4], ((RunnableC0002c) this).objData[2] + 16, (((RunnableC0002c) this).objData[3] - 28) + 16);
                RunnableC0002c.m204b(79, 0, 0, 32, 56, RunnableC0002c.rotationQuadrants[6], ((RunnableC0002c) this).objData[2] - 16, ((RunnableC0002c) this).objData[3] + 28 + 16);
                RunnableC0002c.m204b(79, 0, 0, 32, 56, RunnableC0002c.rotationQuadrants[2], ((RunnableC0002c) this).objData[2] + 16, ((RunnableC0002c) this).objData[3] + 28 + 16);
                i6 = 72;
                i4 = RunnableC0002c.rotationQuadrants[2];
                i3 = ((RunnableC0002c) this).objData[2];
                i5 = ((RunnableC0002c) this).objData[3] + a3 + 28 + 1;
            } else {
                RunnableC0002c.m204b(79, 0, 0, 32, 72, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2] - 16, (((RunnableC0002c) this).objData[3] + i2) - 36);
                RunnableC0002c.m204b(79, 0, 0, 32, 72, RunnableC0002c.rotationQuadrants[4], ((RunnableC0002c) this).objData[2] + 16, (((RunnableC0002c) this).objData[3] + i2) - 36);
                RunnableC0002c.m204b(79, 0, 0, 32, 72, RunnableC0002c.rotationQuadrants[6], ((RunnableC0002c) this).objData[2] - 16, ((RunnableC0002c) this).objData[3] + i2 + 36);
                RunnableC0002c.m204b(79, 0, 0, 32, 72, RunnableC0002c.rotationQuadrants[2], ((RunnableC0002c) this).objData[2] + 16, ((RunnableC0002c) this).objData[3] + i2 + 36);
                i6 = 72;
                i4 = RunnableC0002c.rotationQuadrants[2];
                i3 = ((RunnableC0002c) this).objData[2];
                i5 = ((((RunnableC0002c) this).objData[3] + i) - 8) - 6;
            }
            RunnableC0002c.m204b(79, 0, i6, 32, 32, i4, i3, i5 + 8);
        }
        i = (a2 * 2) + 2;
        i2 = (a * 2) + 2;
        if (((RunnableC0002c) this).objData[4] != 20) {
        }
        int a32 = ((RunnableC0002c.mo34a(((RunnableC0002c) this).f305k) * 28) / 100) - 28;
        RunnableC0002c.m204b(79, 0, 0, 32, 56, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2] - 16, (((RunnableC0002c) this).objData[3] - 28) + 16);
        RunnableC0002c.m204b(79, 0, 0, 32, 56, RunnableC0002c.rotationQuadrants[4], ((RunnableC0002c) this).objData[2] + 16, (((RunnableC0002c) this).objData[3] - 28) + 16);
        RunnableC0002c.m204b(79, 0, 0, 32, 56, RunnableC0002c.rotationQuadrants[6], ((RunnableC0002c) this).objData[2] - 16, ((RunnableC0002c) this).objData[3] + 28 + 16);
        RunnableC0002c.m204b(79, 0, 0, 32, 56, RunnableC0002c.rotationQuadrants[2], ((RunnableC0002c) this).objData[2] + 16, ((RunnableC0002c) this).objData[3] + 28 + 16);
        i6 = 72;
        i4 = RunnableC0002c.rotationQuadrants[2];
        i3 = ((RunnableC0002c) this).objData[2];
        i5 = ((RunnableC0002c) this).objData[3] + a32 + 28 + 1;
        RunnableC0002c.m204b(79, 0, i6, 32, 32, i4, i3, i5 + 8);
    }

    /* renamed from: bB */
    private void m60bB() {
        m86bg();
    }

    /* renamed from: bC */
    private void m61bC() {
        int[] iArr;
        char c;
        int i;
        int i2 = 16;
        int i3 = 8;
        if (((RunnableC0002c) this).objData[4] == 16 || ((RunnableC0002c) this).objData[4] == 18) {
            i2 = 8;
            i3 = 16;
        }
        if (((RunnableC0002c) this).objData[5] > 0) {
            int[] iArr2 = ((RunnableC0002c) this).objData;
            iArr2[5] = iArr2[5] + 1;
            if (((RunnableC0002c) this).objData[5] > 12) {
                ((RunnableC0002c) this).objData[5] = 0;
            }
        }
        int c2 = RunnableC0002c.m211c(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], i2, i3);
        if (c2 >= 0) {
            int i4 = 4096;
            int i5 = ((RunnableC0002c) this).objData[4] / 16;
            if (((RunnableC0002c) this).objData[4] % 16 == 2) {
                i4 = 2560;
            }
            if (i5 == 1) {
                i2 = 7;
            } else {
                i3 = 7;
            }
            if (c2 == 0 || c2 == 4) {
                RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - i3) << 8;
                if (i5 == 0) {
                    if (((RunnableC0002c) this).objData[5] == 4) {
                        RunnableC0002c.f47c[1] = (((RunnableC0002c) this).objData[3] - 8) << 8;
                        RunnableC0002c.f67g = true;
                        RunnableC0002c.f52d = false;
                        RunnableC0002c.f46c = true;
                        RunnableC0002c.f74i = false;
                        this.f212aw = 0;
                        RunnableC0002c.f47c[5] = (i4 * RunnableC0002c.mo49b(0)) / 100;
                    }
                    iArr = ((RunnableC0002c) this).objData;
                    i = iArr[5] + 1;
                    c = 5;
                } else {
                    m313a(((RunnableC0002c) this).objData[22]);
                }
            } else if (c2 == 1) {
                RunnableC0002c.f47c[0] = (((((RunnableC0002c) this).objData[2] - i2) - 12) - 1) << 8;
                RunnableC0002c.f47c[10] = 0;
                RunnableC0002c.f47c[13] = 0;
                RunnableC0002c.f47c[14] = 0;
                if (i5 == 1 && ((RunnableC0002c) this).objData[19] == 1) {
                    this.f211av = 15;
                    RunnableC0002c.f47c[10] = -i4;
                    RunnableC0002c.f47c[12] = 1;
                    RunnableC0002c.f47c[13] = 1;
                    RunnableC0002c.f47c[14] = 1;
                    iArr = ((RunnableC0002c) this).objData;
                    i = iArr[5] + 1;
                    c = 5;
                }
            } else if (c2 == 2) {
                RunnableC0002c.f47c[0] = (((i2 + ((RunnableC0002c) this).objData[2]) + 12) + 1) << 8;
                RunnableC0002c.f47c[10] = 0;
                RunnableC0002c.f47c[13] = 0;
                RunnableC0002c.f47c[14] = 0;
                if (i5 == 1 && ((RunnableC0002c) this).objData[19] == 0) {
                    this.f211av = 15;
                    RunnableC0002c.f47c[10] = i4;
                    RunnableC0002c.f47c[12] = 0;
                    RunnableC0002c.f47c[13] = 2;
                    RunnableC0002c.f47c[14] = 2;
                    iArr = ((RunnableC0002c) this).objData;
                    i = iArr[5] + 1;
                    c = 5;
                }
            } else if (c2 == 3) {
                if (i5 == 2) {
                    if (((RunnableC0002c) this).objData[19] == 2) {
                        RunnableC0002c.f47c[5] = i4;
                        RunnableC0002c.f67g = true;
                        this.f211av = 30;
                    }
                    int[] iArr3 = ((RunnableC0002c) this).objData;
                    iArr3[5] = iArr3[5] + 1;
                }
                iArr = RunnableC0002c.f47c;
                i = ((((((RunnableC0002c) this).objData[3] + i3) + 12) + 12) + 1) << 8;
                c = 1;
            }
            iArr[c] = i;
        }
        if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && c2 != 0) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* renamed from: bD */
    private void m62bD() {
        int i;
        char c;
        int[] iArr;
        char c2;
        int[] iArr2;
        int i2 = 0;
        int[] iArr3 = ((RunnableC0002c) this).objData;
        int i3 = iArr3[19];
        int i4 = i3 == 0 ? -2 : 2;
        if (!RunnableC0002c.m207b(iArr3)) {
            switch (iArr3[14]) {
                case 1:
                    if (Math.abs(RunnableC0002c.mo33a() - iArr3[2]) < 50) {
                        iArr3[5] = 30;
                        iArr3[15] = 0;
                        i = iArr3[14] + 1;
                        c = 14;
                        iArr = iArr3;
                        iArr[c] = i;
                        break;
                    }
                    break;
                case 2:
                    if (RunnableC0002c.mo33a() > iArr3[2]) {
                        c2 = 19;
                        i2 = 1;
                        iArr2 = iArr3;
                    } else {
                        c2 = 19;
                        iArr2 = iArr3;
                    }
                    iArr2[c2] = i2;
                    if (iArr3[5] <= 0) {
                        iArr3[5] = 48;
                        iArr3[15] = 1;
                        if (iArr3[4] == 1) {
                            i = 6;
                            c = 14;
                            iArr = iArr3;
                        } else {
                            i = iArr3[14] + 1;
                            c = 14;
                            iArr = iArr3;
                        }
                        iArr[c] = i;
                        break;
                    }
                    break;
                case 3:
                    mo43a(iArr3);
                    if (iArr3[5] <= 0) {
                        iArr3[5] = 8;
                        iArr3[15] = 2;
                        i = iArr3[14] + 1;
                        c = 14;
                        iArr = iArr3;
                        iArr[c] = i;
                        break;
                    }
                    break;
                case 4:
                    mo43a(iArr3);
                    if (iArr3[5] <= 0) {
                        iArr3[5] = 8;
                        iArr3[15] = 3;
                        i = iArr3[14] + 1;
                        c = 14;
                        iArr = iArr3;
                        iArr[c] = i;
                        break;
                    }
                    break;
                case 5:
                    iArr3[2] = i4 + iArr3[2];
                    mo43a(iArr3);
                    i = (((RunnableC0002c) this).f302j & 1) + 4;
                    c = 15;
                    iArr = iArr3;
                    iArr[c] = i;
                    break;
                case 6:
                    if (iArr3[5] <= 0) {
                        m336b(7, iArr3[2], iArr3[3], i3 == 0 ? 270 : 90, 150, 0);
                        iArr3[5] = 60;
                        iArr3[14] = iArr3[14] + 1;
                    }
                    break;
                case 7:
                    if (iArr3[5] <= 0) {
                        iArr3[15] = 0;
                        iArr3[5] = 10;
                        iArr3[14] = iArr3[14] + 1;
                    }
                    break;
                case 8:
                    if (iArr3[5] <= 0) {
                        iArr3[14] = iArr3[14] + 1;
                    }
                    break;
                case 9:
                    i = -1;
                    c = 15;
                    iArr = iArr3;
                    iArr[c] = i;
                    break;
                default:
                    iArr3[15] = -1;
                    i = 1;
                    c = 14;
                    iArr = iArr3;
                    iArr[c] = i;
                    break;
            }
            if (iArr3[14] >= 3 && iArr3[14] <= 7) {
                m355d(iArr3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* renamed from: bE */
    private void m63bE() {
        char c;
        int[] iArr;
        char c2;
        int i;
        int[] iArr2;
        char c3;
        int i2;
        int[] iArr3;
        int i3 = 2;
        int[] iArr4 = ((RunnableC0002c) this).objData;
        int i4 = iArr4[19];
        int i5 = i4 == 0 ? -2 : 2;
        if (!RunnableC0002c.m207b(iArr4)) {
            switch (iArr4[14]) {
                case 1:
                    iArr4[18] = 0;
                    iArr4[14] = iArr4[14] + 1;
                case 2:
                    iArr4[18] = 0;
                    if (iArr4[6] > 440) {
                        if (iArr4[19] == 0) {
                            c3 = 19;
                            i2 = 1;
                            iArr3 = iArr4;
                        } else {
                            c3 = 19;
                            i2 = 0;
                            iArr3 = iArr4;
                        }
                        iArr3[c3] = i2;
                        iArr4[6] = 0;
                    }
                    if (RunnableC0002c.m157a(iArr4, 160, 100)) {
                        iArr4[5] = 20;
                        iArr4[14] = 3;
                    }
                    iArr4[2] = iArr4[2] + i5;
                    c = 15;
                    i3 = ((RunnableC0002c) this).f302j & 1;
                    iArr = iArr4;
                    iArr[c] = i3;
                    break;
                case 3:
                    iArr4[6] = iArr4[6] - 1;
                    iArr4[15] = (((RunnableC0002c) this).f302j & 1) + 2;
                    if (iArr4[5] <= 0) {
                        iArr4[5] = 90;
                        iArr4[14] = iArr4[14] + 1;
                    }
                    break;
                case 4:
                    iArr4[6] = iArr4[6] - 1;
                    iArr4[15] = (((RunnableC0002c) this).f302j & 1) + 4;
                    if (iArr4[5] == 16) {
                        c2 = 18;
                        i = 1;
                        iArr2 = iArr4;
                    } else {
                        if (iArr4[5] == 8) {
                            c2 = 18;
                            i = 2;
                            iArr2 = iArr4;
                        }
                        if (iArr4[5] <= 0) {
                            iArr4[18] = 0;
                            m336b(7, iArr4[2] + (i4 == 0 ? -18 : 18), iArr4[3] + 24, i4 == 0 ? 210 : 150, 150, 0);
                            iArr4[5] = 30;
                            iArr4[14] = iArr4[14] + 1;
                        }
                    }
                    iArr2[c2] = i;
                    if (iArr4[5] <= 0) {
                    }
                    break;
                case 5:
                    iArr4[6] = iArr4[6] - 1;
                    if (iArr4[5] <= 0) {
                        iArr4[14] = iArr4[14] + 1;
                    }
                    break;
                case 6:
                    iArr4[2] = iArr4[2] + i5;
                    iArr4[15] = ((RunnableC0002c) this).f302j & 1;
                    if (iArr4[6] > 480) {
                        c = 14;
                        iArr = iArr4;
                        iArr[c] = i3;
                        break;
                    }
                    break;
                default:
                    i3 = 1;
                    c = 14;
                    iArr = iArr4;
                    iArr[c] = i3;
                    break;
            }
            m355d(iArr4);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* renamed from: bF */
    private void m64bF() {
        int[] iArr = ((RunnableC0002c) this).objData;
        int i = iArr[19] == 0 ? -1 : 1;
        if ((Math.abs(iArr[2] - RunnableC0002c.mo33a()) <= 240 || Math.abs(iArr[3] - RunnableC0002c.mo48b()) <= 168) && !RunnableC0002c.m207b(iArr)) {
            switch (iArr[14]) {
                case 1:
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = (((RunnableC0002c) this).f302j >> 1) % 3;
                    iArr[2] = iArr[2] + i;
                    mo43a(iArr);
                    if (m349c(iArr)) {
                        iArr[5] = 60;
                        iArr[14] = iArr[14] + 1;
                    }
                    if ((((RunnableC0002c) this).f302j & 7) == 0) {
                        mo36a(15, iArr[2] - (i * 20), iArr[3] - 2, 0, 0, 0, 0);
                        break;
                    }
                    break;
                case 2:
                    iArr[15] = (((RunnableC0002c) this).f302j >> 1) % 3;
                    iArr[2] = iArr[2] + i;
                    mo43a(iArr);
                    if (m349c(iArr)) {
                    }
                    if ((((RunnableC0002c) this).f302j & 7) == 0) {
                    }
                    break;
                case 3:
                    if (iArr[5] <= 0) {
                        RunnableC0002c.m205b(iArr);
                        iArr[6] = 0;
                        iArr[14] = iArr[14] - 1;
                        break;
                    }
                    break;
                default:
                    iArr[14] = 1;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = (((RunnableC0002c) this).f302j >> 1) % 3;
                    iArr[2] = iArr[2] + i;
                    mo43a(iArr);
                    if (m349c(iArr)) {
                    }
                    if ((((RunnableC0002c) this).f302j & 7) == 0) {
                    }
                    break;
            }
            m355d(iArr);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x018a  */
    /* renamed from: bG */
    private void m65bG() {
        char c;
        int i;
        int[] iArr;
        int[] iArr2 = ((RunnableC0002c) this).objData;
        int i2 = iArr2[19] == 0 ? -1 : 1;
        if (Math.abs(iArr2[2] - RunnableC0002c.mo33a()) <= 240 || Math.abs(iArr2[3] - RunnableC0002c.mo48b()) <= 168) {
            iArr2[5] = iArr2[5] + 1;
            if (RunnableC0002c.mo57c(iArr2[2], iArr2[3])) {
                iArr2[18] = 0;
                return;
            }
            if (iArr2[18] == 3 || iArr2[18] == 4) {
                for (int i3 = 0; i3 < 4; i3++) {
                    int i4 = (i3 * 3) + 6;
                    if (m327a(iArr2[i4] >> 8, iArr2[i4 + 1] >> 8, 8, 8, iArr2[i4 + 2] == -1 ? 0 : 1)) {
                        iArr2[i4 + 2] = iArr2[i4 + 2] == 1 ? -1 : 1;
                    }
                }
            }
            switch (iArr2[18]) {
                case 1:
                    iArr2[5] = 0;
                    iArr2[6] = iArr2[2] << 8;
                    iArr2[7] = iArr2[3] << 8;
                    iArr2[8] = i2;
                    iArr2[9] = iArr2[6] + (((-i2) * 12) << 8);
                    iArr2[10] = iArr2[7];
                    iArr2[11] = i2;
                    iArr2[12] = iArr2[9] + (((-i2) * 12) << 8);
                    iArr2[13] = iArr2[10];
                    iArr2[14] = i2;
                    iArr2[15] = iArr2[12] + (((-i2) * 12) << 8);
                    iArr2[16] = iArr2[13];
                    iArr2[17] = i2;
                    iArr2[18] = iArr2[18] + 1;
                    iArr2[7] = m310a(iArr2[6] >> 8, iArr2[7] >> 8, 8) << 8;
                    iArr2[10] = m310a(iArr2[9] >> 8, iArr2[10] >> 8, 8) << 8;
                    iArr2[13] = m310a(iArr2[12] >> 8, iArr2[13] >> 8, 8) << 8;
                    iArr2[16] = m310a(iArr2[15] >> 8, iArr2[16] >> 8, 8) << 8;
                    if (iArr2[5] >= 8) {
                        iArr2[5] = 0;
                        c = 18;
                        i = iArr2[18] + 1;
                        iArr = iArr2;
                        iArr[c] = i;
                        break;
                    }
                    break;
                case 2:
                    iArr2[7] = m310a(iArr2[6] >> 8, iArr2[7] >> 8, 8) << 8;
                    iArr2[10] = m310a(iArr2[9] >> 8, iArr2[10] >> 8, 8) << 8;
                    iArr2[13] = m310a(iArr2[12] >> 8, iArr2[13] >> 8, 8) << 8;
                    iArr2[16] = m310a(iArr2[15] >> 8, iArr2[16] >> 8, 8) << 8;
                    if (iArr2[5] >= 8) {
                    }
                    break;
                case 3:
                    iArr2[6] = iArr2[6] + (iArr2[8] * 0);
                    iArr2[9] = iArr2[9] + (iArr2[11] * 32);
                    iArr2[12] = iArr2[12] + (iArr2[14] * 64);
                    iArr2[15] = iArr2[15] + (iArr2[17] * 96);
                    if (iArr2[5] >= 32) {
                        c = 18;
                        i = iArr2[18] + 1;
                        iArr = iArr2;
                        iArr[c] = i;
                        break;
                    }
                    break;
                case 4:
                    iArr2[6] = iArr2[6] + (iArr2[8] * 96);
                    iArr2[9] = iArr2[9] + (iArr2[11] * 64);
                    iArr2[12] = iArr2[12] + (iArr2[14] * 32);
                    iArr2[15] = iArr2[15] + (iArr2[17] * 0);
                    if (iArr2[5] >= 64) {
                        c = 18;
                        i = iArr2[18] + 1;
                        iArr = iArr2;
                        iArr[c] = i;
                        break;
                    }
                    break;
                case 5:
                    if (iArr2[8] == iArr2[11] && iArr2[11] == iArr2[14] && iArr2[14] == iArr2[17]) {
                        iArr2[9] = iArr2[6] + (((-iArr2[8]) * 12) << 8);
                        iArr2[12] = iArr2[9] + (((-iArr2[8]) * 12) << 8);
                        iArr2[15] = iArr2[12] + (((-iArr2[8]) * 12) << 8);
                    }
                    iArr2[5] = 0;
                    c = 18;
                    i = 3;
                    iArr = iArr2;
                    iArr[c] = i;
                    break;
                default:
                    iArr2[18] = 1;
                    iArr2[5] = 0;
                    iArr2[6] = iArr2[2] << 8;
                    iArr2[7] = iArr2[3] << 8;
                    iArr2[8] = i2;
                    iArr2[9] = iArr2[6] + (((-i2) * 12) << 8);
                    iArr2[10] = iArr2[7];
                    iArr2[11] = i2;
                    iArr2[12] = iArr2[9] + (((-i2) * 12) << 8);
                    iArr2[13] = iArr2[10];
                    iArr2[14] = i2;
                    iArr2[15] = iArr2[12] + (((-i2) * 12) << 8);
                    iArr2[16] = iArr2[13];
                    iArr2[17] = i2;
                    iArr2[18] = iArr2[18] + 1;
                    iArr2[7] = m310a(iArr2[6] >> 8, iArr2[7] >> 8, 8) << 8;
                    iArr2[10] = m310a(iArr2[9] >> 8, iArr2[10] >> 8, 8) << 8;
                    iArr2[13] = m310a(iArr2[12] >> 8, iArr2[13] >> 8, 8) << 8;
                    iArr2[16] = m310a(iArr2[15] >> 8, iArr2[16] >> 8, 8) << 8;
                    if (iArr2[5] >= 8) {
                    }
                    break;
            }
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = (i5 * 3) + 7;
                iArr2[i6] = m310a(iArr2[i6 - 1] >> 8, iArr2[i6] >> 8, 8) << 8;
            }
            for (int i7 = 0; i7 < 3; i7++) {
                int i8 = (i7 * 3) + 7;
                if (iArr2[7] + 4096 < iArr2[i8 + 3]) {
                    iArr2[i8 + 3] = iArr2[7];
                }
                if (Math.abs(iArr2[8] - iArr2[i8 + 4]) > 3072) {
                    int i9 = i8 + 4;
                    iArr2[i9] = iArr2[i9] + (iArr2[8] << 8);
                }
            }
            iArr2[2] = iArr2[6] >> 8;
            iArr2[3] = iArr2[7] >> 8;
            if (!(m355d(iArr2) || mo32a(iArr2[12] >> 8, iArr2[13] >> 8, 22, 10, false) == 0)) {
                m336b(14, iArr2[2], iArr2[3], (i2 * 30) + 360, 300, 0);
                m336b(14, iArr2[9] >> 8, iArr2[10] >> 8, (i2 * 15) + 360, 300, 1);
                m336b(14, iArr2[12] >> 8, iArr2[13] >> 8, (i2 * -15) + 360, 300, 1);
                m336b(14, iArr2[15] >> 8, iArr2[16] >> 8, (i2 * -30) + 360, 300, 1);
                iArr2[0] = 0;
                m378u();
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8  */
    /* renamed from: bH */
    private void m66bH() {
        int[] iArr;
        int i = 1;
        int[] iArr2 = ((RunnableC0002c) this).objData;
        int i2 = iArr2[19] == 0 ? -1 : 1;
        if ((Math.abs(iArr2[2] - RunnableC0002c.mo33a()) <= 240 || Math.abs(iArr2[3] - RunnableC0002c.mo48b()) <= 168) && !RunnableC0002c.m207b(iArr2)) {
            switch (iArr2[14]) {
                case 1:
                    iArr2[10] = 0;
                    iArr2[11] = 0;
                    iArr2[5] = 360;
                    iArr2[14] = iArr2[14] + 1;
                    iArr2[15] = (((RunnableC0002c) this).f302j >> 2) % 3;
                    iArr2[10] = i2 * 20;
                    iArr2[12] = iArr2[12] + iArr2[10];
                    iArr2[13] = iArr2[13] + iArr2[11];
                    m329a(iArr2, 16);
                    iArr2[2] = iArr2[12] / 100;
                    iArr2[3] = iArr2[13] / 100;
                    if (m349c(iArr2) || iArr2[6] > 180) {
                        RunnableC0002c.m205b(iArr2);
                        iArr2[6] = 0;
                    }
                    if (iArr2[5] <= 0) {
                        iArr2[15] = 1;
                        iArr2[5] = 60;
                        iArr2[14] = iArr2[14] + 1;
                        m329a(iArr2, 16);
                        if (iArr2[5] < 12) {
                            iArr2[15] = 3;
                        }
                        if (iArr2[5] <= 0) {
                            m336b(9, iArr2[2] + 16, iArr2[3] - 16, 15, 240, 0);
                            m336b(9, iArr2[2] - 16, iArr2[3] - 16, 345, 240, 0);
                            iArr2[5] = 50;
                            i = iArr2[14] + 1;
                            iArr = iArr2;
                            iArr[14] = i;
                            break;
                        }
                    }
                    break;
                case 2:
                    iArr2[15] = (((RunnableC0002c) this).f302j >> 2) % 3;
                    iArr2[10] = i2 * 20;
                    iArr2[12] = iArr2[12] + iArr2[10];
                    iArr2[13] = iArr2[13] + iArr2[11];
                    m329a(iArr2, 16);
                    iArr2[2] = iArr2[12] / 100;
                    iArr2[3] = iArr2[13] / 100;
                    RunnableC0002c.m205b(iArr2);
                    iArr2[6] = 0;
                    if (iArr2[5] <= 0) {
                    }
                    break;
                case 3:
                    m329a(iArr2, 16);
                    if (iArr2[5] < 12) {
                    }
                    if (iArr2[5] <= 0) {
                    }
                    break;
                case 4:
                    m329a(iArr2, 16);
                    if (iArr2[5] <= 0) {
                        iArr = iArr2;
                        iArr[14] = i;
                        break;
                    }
                    break;
                default:
                    iArr2[14] = 1;
                    iArr2[10] = 0;
                    iArr2[11] = 0;
                    iArr2[5] = 360;
                    iArr2[14] = iArr2[14] + 1;
                    iArr2[15] = (((RunnableC0002c) this).f302j >> 2) % 3;
                    iArr2[10] = i2 * 20;
                    iArr2[12] = iArr2[12] + iArr2[10];
                    iArr2[13] = iArr2[13] + iArr2[11];
                    m329a(iArr2, 16);
                    iArr2[2] = iArr2[12] / 100;
                    iArr2[3] = iArr2[13] / 100;
                    RunnableC0002c.m205b(iArr2);
                    iArr2[6] = 0;
                    if (iArr2[5] <= 0) {
                    }
                    break;
            }
            m355d(iArr2);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0153  */
    /* renamed from: bI */
    private void m67bI() {
        int[] iArr = ((RunnableC0002c) this).objData;
        if (!RunnableC0002c.m207b(iArr)) {
            switch (iArr[14]) {
                case 1:
                    iArr[15] = -1;
                    iArr[8] = 0;
                    iArr[9] = 0;
                    iArr[10] = 0;
                    iArr[11] = 400;
                    iArr[14] = iArr[14] + 1;
                    if (RunnableC0002c.mo33a() - 160 >= iArr[2]) {
                        iArr[14] = iArr[14] + 1;
                        iArr[10] = 500;
                        iArr[11] = 400;
                        iArr[15] = 0;
                        iArr[5] = 94;
                        iArr[14] = iArr[14] + 1;
                        iArr[15] = ((RunnableC0002c) this).f302j & 1;
                        iArr[10] = 400;
                        if (iArr[9] == 0 && m327a(iArr[2], iArr[3], 20, 20, 1)) {
                            iArr[9] = 1;
                            iArr[11] = -800;
                            iArr[5] = 94;
                        }
                        if (iArr[5] <= 0) {
                            iArr[5] = 94;
                            iArr[14] = iArr[14] + 1;
                            iArr[10] = 0;
                            iArr[11] = 0;
                            iArr[15] = 1;
                            iArr[5] = 20;
                            iArr[14] = iArr[14] + 1;
                            if (iArr[5] <= 0) {
                                iArr[15] = 2;
                                iArr[5] = 20;
                                iArr[14] = iArr[14] + 1;
                                if (iArr[5] <= 0) {
                                    iArr[15] = 3;
                                    iArr[5] = 60;
                                    iArr[14] = iArr[14] + 1;
                                    if (iArr[5] <= 0) {
                                        iArr[15] = 2;
                                        iArr[5] = 20;
                                        iArr[14] = iArr[14] + 1;
                                        if (iArr[5] <= 0) {
                                            iArr[15] = 1;
                                            iArr[5] = 20;
                                            iArr[14] = iArr[14] + 1;
                                            if (iArr[5] <= 0) {
                                                iArr[5] = 94;
                                                iArr[14] = 3;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    if (RunnableC0002c.mo33a() - 160 >= iArr[2]) {
                    }
                    break;
                case 3:
                    iArr[10] = 500;
                    iArr[11] = 400;
                    iArr[15] = 0;
                    iArr[5] = 94;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = ((RunnableC0002c) this).f302j & 1;
                    iArr[10] = 400;
                    iArr[9] = 1;
                    iArr[11] = -800;
                    iArr[5] = 94;
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 4:
                    iArr[15] = ((RunnableC0002c) this).f302j & 1;
                    iArr[10] = 400;
                    iArr[9] = 1;
                    iArr[11] = -800;
                    iArr[5] = 94;
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 5:
                    iArr[10] = 0;
                    iArr[11] = 0;
                    iArr[15] = 1;
                    iArr[5] = 20;
                    iArr[14] = iArr[14] + 1;
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 6:
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 7:
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 8:
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 9:
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 10:
                    if (iArr[5] <= 0) {
                    }
                    break;
                default:
                    iArr[14] = 1;
                    iArr[15] = -1;
                    iArr[8] = 0;
                    iArr[9] = 0;
                    iArr[10] = 0;
                    iArr[11] = 400;
                    iArr[14] = iArr[14] + 1;
                    if (RunnableC0002c.mo33a() - 160 >= iArr[2]) {
                    }
                    break;
            }
            iArr[11] = iArr[11] + 20;
            if (iArr[11] > 400) {
                iArr[11] = 400;
            }
            iArr[12] = iArr[12] + iArr[10];
            iArr[13] = iArr[13] + iArr[11];
            if (iArr[11] > 0 && m340b(iArr[12] / 100, (iArr[13] / 100) + 12)) {
                iArr[9] = 0;
                for (int i = 0; i < 4; i++) {
                    m340b(iArr[12] / 100, (iArr[13] / 100) + 12);
                    iArr[13] = iArr[13] - 100;
                }
                if (iArr[13] < 0) {
                    iArr[13] = 0;
                }
            }
            iArr[2] = iArr[12] / 100;
            iArr[3] = iArr[13] / 100;
            if (iArr[15] >= 0) {
                m355d(iArr);
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: bJ */
    private void m68bJ() {
        int[] iArr = ((RunnableC0002c) this).objData;
        int i = iArr[19] == 0 ? -1 : 1;
        if ((Math.abs(iArr[2] - RunnableC0002c.mo33a()) <= 240 || Math.abs(iArr[3] - RunnableC0002c.mo48b()) <= 168) && !RunnableC0002c.m207b(iArr)) {
            switch (iArr[14]) {
                case 1:
                    iArr[10] = 0;
                    iArr[11] = 0;
                    iArr[5] = 120;
                    iArr[14] = iArr[14] + 1;
                    break;
                case 2:
                    break;
                default:
                    iArr[14] = 1;
                    iArr[10] = 0;
                    iArr[11] = 0;
                    iArr[5] = 120;
                    iArr[14] = iArr[14] + 1;
                    break;
            }
            iArr[15] = (((RunnableC0002c) this).f302j >> 2) % 3;
            iArr[10] = i * 25;
            iArr[12] = iArr[12] + iArr[10];
            iArr[13] = iArr[13] + iArr[11];
            iArr[2] = iArr[12] / 100;
            iArr[3] = iArr[13] / 100;
            mo44a(iArr, 24);
            if (m349c(iArr) || iArr[6] > 240) {
                RunnableC0002c.m205b(iArr);
                iArr[6] = 0;
            }
            if (iArr[5] <= 0) {
                iArr[15] = 1;
                iArr[5] = 40;
            }
            m355d(iArr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v37, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* renamed from: bK */
    private void m69bK() {
        Object[] objArr;
        char c;
        Object[] objArr2;
        int i = 1;
        int[] iArr = ((RunnableC0002c) this).objData;
        int i2 = iArr[19] == 0 ? -1 : 1;
        if (!RunnableC0002c.m207b(iArr)) {
            int i3 = ((RunnableC0002c) this).f302j >> 2;
            switch (iArr[14]) {
                case 1:
                    iArr[15] = 0;
                    if (RunnableC0002c.mo33a() <= iArr[2]) {
                        c = 19;
                        objArr2 = iArr;
                    } else {
                        c = 19;
                        i = 0;
                        objArr2 = iArr;
                    }
                    objArr2[c] = i;
                    if (iArr[3] + 40 <= RunnableC0002c.mo48b() && iArr[3] + 100 >= RunnableC0002c.mo48b() && Math.abs(iArr[2] - RunnableC0002c.mo33a()) < 100) {
                        iArr[9] = RunnableC0002c.mo48b() - 16;
                        i = iArr[14] + 1;
                        objArr = iArr;
                        objArr[14] = i;
                        break;
                    }
                case 2:
                    iArr[15] = 1;
                    iArr[3] = iArr[3] + 2;
                    if (iArr[3] >= iArr[9]) {
                        iArr[3] = iArr[9];
                        i = iArr[14] + 1;
                        objArr = iArr;
                        objArr[14] = i;
                        break;
                    }
                    break;
                case 3:
                    iArr[15] = RunnableC0002c.f28a[i3 & 3];
                    iArr[2] = i2 + iArr[2];
                    if (Math.abs(iArr[2] - RunnableC0002c.mo33a()) > 80) {
                        i = iArr[14] + 1;
                        objArr = iArr;
                        objArr[14] = i;
                        break;
                    }
                    break;
                case 4:
                    iArr[15] = RunnableC0002c.f28a[i3 & 3];
                    iArr[2] = i2 + iArr[2];
                    iArr[3] = iArr[3] - 2;
                    if (m340b(iArr[2], iArr[3] - 16)) {
                        objArr = iArr;
                        objArr[14] = i;
                        break;
                    }
                    break;
                default:
                    iArr[14] = 1;
                    iArr[15] = 0;
                    if (RunnableC0002c.mo33a() <= iArr[2]) {
                    }
                    objArr2[c] = i;
                    iArr[9] = RunnableC0002c.mo48b() - 16;
                    i = iArr[14] + 1;
                    objArr = iArr;
                    objArr[14] = i;
                    break;
            }
            m355d(iArr);
        }
    }

    /* renamed from: bL */
    private void m70bL() {
        int[] iArr = ((RunnableC0002c) this).objData;
        if (!RunnableC0002c.m207b(iArr)) {
            iArr[15] = (((RunnableC0002c) this).f302j >> 2) & 1;
            iArr[3] = iArr[17] - ((Math.abs(RunnableC0002c.mo49b(iArr[6] % 180)) * 268) / 100);
            m355d(iArr);
        }
    }

    /* renamed from: bM */
    private void m71bM() {
        if (((RunnableC0002c) this).f302j % 60 >= 30) {
            int c = RunnableC0002c.m211c(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 8, 32);
            if (((RunnableC0002c) this).objData[5] == 1) {
                c = -1;
            }
            if (c >= 0 && c == 1) {
                RunnableC0002c.f47c[0] = ((((RunnableC0002c) this).objData[2] - 8) - 12) << 8;
            }
            if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20] && c != 0) {
                ((RunnableC0002c) this).f320s = false;
            }
        } else if (((RunnableC0002c) this).f320s && this.f196ag == ((RunnableC0002c) this).objData[20]) {
            ((RunnableC0002c) this).f320s = false;
        }
    }

    /* renamed from: bN */
    private void m72bN() {
        m71bM();
    }

    /* renamed from: bO */
    private void m73bO() {
        int[] iArr;
        int i;
        char c = 1;
        int i2 = -8;
        int i3 = ((RunnableC0002c) this).objData[4] / 16;
        int i4 = ((RunnableC0002c) this).objData[4] % 16 == 2 ? 153 : 2;
        int i5 = ((RunnableC0002c) this).objData[5] > 4 ? 2 : ((RunnableC0002c) this).objData[5] > 0 ? 1 : 0;
        int i6 = RunnableC0002c.rotationQuadrants[0];
        switch (i3) {
            case 1:
                if (((RunnableC0002c) this).objData[19] == 0) {
                    iArr = RunnableC0002c.rotationQuadrants;
                } else {
                    iArr = RunnableC0002c.rotationQuadrants;
                    c = 7;
                }
                i6 = iArr[c];
                break;
            case 2:
                i6 = RunnableC0002c.rotationQuadrants[6];
                break;
        }
        if (i5 == 2) {
            switch (i3) {
                case 0:
                    i = -8;
                    i2 = 0;
                    break;
                case 1:
                    if (((RunnableC0002c) this).objData[19] != 0) {
                        i = 0;
                        break;
                    } else {
                        i2 = 8;
                        i = 0;
                        break;
                    }
                case 2:
                    i = 8;
                    i2 = 0;
                    break;
            }
            RunnableC0002c.m203b(((RunnableC0002c) this).objData[2] + i2, i + ((RunnableC0002c) this).objData[3], i4, i5, i6);
        }
        i = 0;
        i2 = 0;
        RunnableC0002c.m203b(((RunnableC0002c) this).objData[2] + i2, i + ((RunnableC0002c) this).objData[3], i4, i5, i6);
    }

    /* renamed from: bP */
    private void m74bP() {
        if (this.zoneID == 0 && RunnableC0002c.gameObjGfx[5] != null) {
            int height = RunnableC0002c.gameObjGfx[5].getHeight();
            int width = (RunnableC0002c.gameObjGfx[5].getWidth() / 3) * 2;
            int i = RunnableC0002c.rotationQuadrants[0];
            if (((RunnableC0002c) this).objData[19] == 0) {
                i = RunnableC0002c.rotationQuadrants[4];
            }
            RunnableC0002c.m204b(5, 0, 0, width, height, i, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
        }
    }

    /* renamed from: bQ */
    private void m75bQ() {
        int i;
        Game bVar;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = ((RunnableC0002c) this).objData[19] == 0 ? -1 : 1;
        m111f(40);
        if (((RunnableC0002c) this).objData[18] == 1) {
            i = 184;
            i2 = ((RunnableC0002c) this).objData[19] == 0 ? 0 : RunnableC0002c.rotationQuadrants[4];
            bVar = this;
            i3 = 0;
        } else if (((RunnableC0002c) this).objData[18] == 2) {
            i = 184;
            if (((RunnableC0002c) this).objData[19] != 0) {
                i4 = RunnableC0002c.rotationQuadrants[4];
            }
            bVar = this;
            i2 = i4;
            i3 = 16;
        } else {
            return;
        }
        RunnableC0002c.m204b(40, i3, i, 16, 16, i2, ((RunnableC0002c) bVar).objData[2] + (i5 * 18), ((RunnableC0002c) this).objData[3] + 28);
    }

    /* renamed from: bR */
    private void m76bR() {
        RunnableC0002c.m204b(61, 0, ((((RunnableC0002c) this).f302j >> 1) % 6) * 16, 32, 16, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
    }

    /* renamed from: bS */
    private void m77bS() {
        int[] iArr;
        int[] iArr2;
        char c;
        char c2 = 4;
        if (((RunnableC0002c) this).objData[18] >= 1) {
            int i = ((RunnableC0002c) this).objData[18] == 3 ? ((RunnableC0002c) this).objData[5] >> 2 : 8 - ((((RunnableC0002c) this).objData[5] - 30) >> 2);
            int i2 = 0;
            while (i2 < 3) {
                int i3 = 15 - (i2 * 3);
                int i4 = ((RunnableC0002c) this).objData[i3] >> 8;
                int i5 = (((RunnableC0002c) this).objData[i3 + 1] >> 8) - (i2 == 1 ? i : 0);
                if (((RunnableC0002c) this).objData[i3 + 2] == 1) {
                    iArr2 = RunnableC0002c.rotationQuadrants;
                    c = 4;
                } else {
                    iArr2 = RunnableC0002c.rotationQuadrants;
                    c = 0;
                }
                RunnableC0002c.m203b(i4, i5, 49, 2, iArr2[c]);
                i2++;
            }
            int i6 = ((RunnableC0002c) this).objData[6] >> 8;
            int i7 = (((RunnableC0002c) this).objData[7] >> 8) - i;
            int i8 = ((RunnableC0002c) this).objData[18] > 3 ? 1 : 0;
            if (((RunnableC0002c) this).objData[8] == 1) {
                iArr = RunnableC0002c.rotationQuadrants;
            } else {
                iArr = RunnableC0002c.rotationQuadrants;
                c2 = 0;
            }
            RunnableC0002c.m203b(i6, i7, 49, i8, iArr[c2]);
        }
    }

    /* renamed from: bT */
    private void m78bT() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (((RunnableC0002c) this).f302j % 60 < 30) {
            RunnableC0002c.m204b(92, 0, 0, 32, 16, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2] + 8, ((RunnableC0002c) this).objData[3] - 32);
            i = 92;
            i2 = RunnableC0002c.rotationQuadrants[6];
            i3 = ((RunnableC0002c) this).objData[2] + 8;
            i4 = ((RunnableC0002c) this).objData[3];
            i5 = 32;
        } else {
            RunnableC0002c.m204b(92, 0, 0, 32, 16, RunnableC0002c.rotationQuadrants[1], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] - 16);
            i = 92;
            i2 = RunnableC0002c.rotationQuadrants[5];
            i3 = ((RunnableC0002c) this).objData[2];
            i4 = ((RunnableC0002c) this).objData[3];
            i5 = 16;
        }
        RunnableC0002c.m204b(i, 0, 0, 32, 16, i2, i3, i4 + i5);
    }

    /* renamed from: bU */
    private void m79bU() {
        m78bT();
    }

    /* renamed from: ba */
    private void m80ba() {
        if (((RunnableC0002c) this).objData[4] == 129) {
            for (int i = 0; i < 4; i++) {
                RunnableC0002c.mo46a(54, 0, (((RunnableC0002c) this).objData[2] - 62) + (i * 31), ((RunnableC0002c) this).objData[3] - 16, 20);
            }
            return;
        }
        RunnableC0002c.m204b(54, 0, 0, RunnableC0002c.gameObjGfx[54].getWidth(), RunnableC0002c.gameObjGfx[54].getHeight(), RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
    }

    /* renamed from: bb */
    private void m81bb() {
        RunnableC0002c.m204b(11, 0, 0, RunnableC0002c.gameObjGfx[11].getWidth(), RunnableC0002c.gameObjGfx[11].getHeight(), RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
    }

    /* renamed from: bc */
    private void m82bc() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 8;
        if (((RunnableC0002c) this).objData[4] == 2 || ((RunnableC0002c) this).objData[4] == 1) {
            RunnableC0002c.m204b(54, 0, 0, 31, 32, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
            if (((RunnableC0002c) this).objData[4] == 2) {
                mo35a((((RunnableC0002c) this).objData[2] >> 4) - 1, (((RunnableC0002c) this).objData[3] >> 4) - 1, 4, 4);
            }
        } else if (((RunnableC0002c) this).objData[4] == 65) {
            for (int i7 = 0; i7 < 3; i7++) {
                RunnableC0002c.m204b(54, 0, 0, 31, 32, RunnableC0002c.rotationQuadrants[0], (i7 << 5) + ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
            }
        } else {
            if (((RunnableC0002c) this).objData[4] == 57) {
                for (int i8 = 1; i8 < 15; i8++) {
                    RunnableC0002c.m204b(12, 0, 24, 8, 24, RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c) this).objData[2] - 64) + (i8 << 3), ((RunnableC0002c) this).objData[3] - 8);
                }
                RunnableC0002c.m204b(12, 0, 0, 8, 24, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2] - 64, ((RunnableC0002c) this).objData[3] - 8);
                i = 12;
                i2 = 24;
                i3 = RunnableC0002c.rotationQuadrants[4];
                i4 = ((RunnableC0002c) this).objData[2] + 56;
                i5 = ((RunnableC0002c) this).objData[3] - 8;
            } else if (((RunnableC0002c) this).objData[4] == 40) {
                for (int i9 = 0; i9 < 8; i9++) {
                    RunnableC0002c.m204b(12, 8, (i9 % 2) * 24, 8, 24, RunnableC0002c.rotationQuadrants[0], (i9 << 3) + (((RunnableC0002c) this).objData[2] - 32), ((RunnableC0002c) this).objData[3] - 8);
                }
                return;
            } else if ((((RunnableC0002c) this).objData[4] == 7 || ((RunnableC0002c) this).objData[4] == 4) && ((RunnableC0002c) this).objData[5] != 0) {
                i = 12;
                i6 = 32;
                i2 = 16;
                i3 = RunnableC0002c.rotationQuadrants[4];
                i4 = ((RunnableC0002c) this).objData[2];
                i5 = ((RunnableC0002c) this).objData[3];
            } else {
                return;
            }
            RunnableC0002c.m204b(i, 0, 0, i6, i2, i3, i4, i5);
        }
    }

    /* renamed from: bd */
    private void m83bd() {
        for (int i = 0; i < 2; i++) {
            RunnableC0002c.m204b(13, 0, ((((RunnableC0002c) this).f302j + i) % 3) * 32, 32, 32, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2] + (i * 32) + 48, (((RunnableC0002c) this).objData[3] + (i * 32)) - 16);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = (((RunnableC0002c) this).objData[2] - RunnableC0002c.f100z[0]) + ((i2 >> 1) * 32) + 16;
            for (int i4 = 0; i4 < (i3 / 32) + 2; i4++) {
                RunnableC0002c.m204b(99, 0, ((((RunnableC0002c) this).f302j + i2) % 3) * 16, 32, 16, RunnableC0002c.rotationQuadrants[0], ((((RunnableC0002c) this).objData[2] + ((i2 >> 1) * 32)) + 16) - (i4 * 32), (((RunnableC0002c) this).objData[3] + (i2 * 16)) - 24);
            }
        }
    }

    /* renamed from: be */
    private void m84be() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((RunnableC0002c) this).objData[5] / 4;
        if (i6 != 0 && ((RunnableC0002c) this).objData[3] - 32 < ((RunnableC0002c) this).objData[9]) {
            RunnableC0002c.m213c(98, 0, (((RunnableC0002c) this).f302j % 2) * 32, 64, 32, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2] - 32, ((RunnableC0002c) this).objData[3] - 32);
        }
        if (i6 > 6) {
            i6 = 6;
        }
        int i7 = 1;
        while (i7 < i6) {
            if (((RunnableC0002c) this).objData[3] - (i7 * 32) < ((RunnableC0002c) this).objData[9]) {
                i = 14;
                i2 = 0;
                i3 = (i7 % 2) * 32;
                i4 = 64;
                i5 = 32;
            } else if ((((RunnableC0002c) this).objData[3] - (i7 * 32)) - 32 < ((RunnableC0002c) this).objData[9]) {
                i = 14;
                i2 = 0;
                i3 = (i7 % 2) * 32;
                i4 = 64;
                i5 = 24;
            } else {
                i7++;
            }
            RunnableC0002c.m213c(i, i2, i3, i4, i5, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2] - 32, (((RunnableC0002c) this).objData[3] - (i7 * 32)) - 32);
            i7++;
        }
        if (((RunnableC0002c) this).objData[5] / 4 != 0 && (((RunnableC0002c) this).objData[3] - (i7 * 32)) - 32 < ((RunnableC0002c) this).objData[9]) {
            RunnableC0002c.m213c(98, 0, ((((RunnableC0002c) this).f302j % 2) * 32) + 64, 64, 32, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2] - 32, (((RunnableC0002c) this).objData[3] - (i7 * 32)) - 32);
        }
        if (((RunnableC0002c) this).objData[10] > 0 && RunnableC0002c.f91q.length > ((RunnableC0002c) this).objData[10] / 3) {
            RunnableC0002c.m147a(77, 0, RunnableC0002c.f91q[((RunnableC0002c) this).objData[10] / 3] * 32, 112, 32, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[8], ((RunnableC0002c) this).objData[9], 17);
        }
    }

    /* renamed from: bf */
    private void m85bf() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int width = RunnableC0002c.gameObjGfx[15].getWidth();
        RunnableC0002c.gameObjGfx[15].getHeight();
        if (((RunnableC0002c) this).f284e[((RunnableC0002c) this).objData[4]]) {
            i7 = 16;
            i5 = 8;
            i = RunnableC0002c.rotationQuadrants[0];
            i2 = ((RunnableC0002c) this).objData[2];
            i3 = ((RunnableC0002c) this).objData[3];
            i4 = 1;
            i6 = width;
        } else {
            i = RunnableC0002c.rotationQuadrants[0];
            i2 = ((RunnableC0002c) this).objData[2];
            i3 = ((RunnableC0002c) this).objData[3];
            i4 = 3;
            i5 = 11;
            i6 = width;
            i7 = 0;
        }
        RunnableC0002c.m204b(15, 0, i7, i6, i5, i, i2, i3 - i4);
        RunnableC0002c.m204b(15, 0, 11, width, 5, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + 5);
    }

    /* renamed from: bg */
    private void m86bg() {
        if (this.zoneID == 3) {
            return;
        }
        if (((RunnableC0002c) this).objData[4] != 16) {
            RunnableC0002c.m204b(16, 0, 0, 64, 32, 0, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + ((RunnableC0002c) this).objData[14]);
            return;
        }
        RunnableC0002c.m204b(16, 0, 32, 64, 48, 0, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[14] + ((RunnableC0002c) this).objData[3] + 8);
        for (int i = 5; i >= 0; i--) {
            RunnableC0002c.m204b(16, 0, 64, 64, 16, 0, ((RunnableC0002c) this).objData[2], (((((RunnableC0002c) this).objData[3] + 8) + 48) - 16) + (i * 16) + ((RunnableC0002c) this).objData[14]);
        }
    }

    /* renamed from: bh */
    private void m87bh() {
        m103bx();
    }

    /* renamed from: bi */
    private void m88bi() {
        int i = ((RunnableC0002c) this).objData[4] == 0 ? 0 : 1;
        if (((RunnableC0002c) this).objData[10] != 1) {
            for (int i2 = 0; i2 < 4; i2++) {
                RunnableC0002c.m213c(18, i * 16, 0, 16, 16, 0, ((RunnableC0002c) this).objData[2] - 16, ((((RunnableC0002c) this).objData[3] - 16) - 16) + (i2 * 16));
            }
        }
        int i3 = ((RunnableC0002c) this).objData[4] == 2 ? 2 : 1;
        if (((RunnableC0002c) this).objData[11] != 1) {
            for (int i4 = 0; i4 < 4; i4++) {
                RunnableC0002c.m213c(18, i3 * 16, 0, 16, 16, 0, ((RunnableC0002c) this).objData[2], ((((RunnableC0002c) this).objData[3] - 16) - 16) + (i4 * 16));
            }
        }
    }

    /* renamed from: bj */
    private void m89bj() {
        int i;
        if (((RunnableC0002c) this).objData[5] < 129) {
            int i2 = 0;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = RunnableC0002c.f81l[i3];
                int i5 = RunnableC0002c.f81l[i3] % 4 >= 2 ? i4 - 2 : i4;
                if (((RunnableC0002c) this).objData[15] != 0) {
                    int i6 = (((RunnableC0002c) this).f305k - ((RunnableC0002c) this).objData[16]) - RunnableC0002c.f84m[i3];
                    i = i6 < 0 ? 0 : i6;
                } else {
                    i = i2;
                }
                int width = RunnableC0002c.gameObjGfx[27].getWidth() / 4;
                RunnableC0002c.m204b(27, (i5 % 4) * width, (i5 / 4) * width, width, width, 0, ((((RunnableC0002c) this).objData[2] + ((RunnableC0002c.f81l[i3] % 4) * 16)) - 16) - 8, ((i / 5) * i) + ((RunnableC0002c) this).objData[3] + ((RunnableC0002c.f81l[i3] / 4) * 16));
                i2 = i;
            }
        }
    }

    /* renamed from: bk */
    private void m90bk() {
        RunnableC0002c.m204b(27, 0, 0, 32, 32, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
    }

    /* renamed from: bl */
    private void m91bl() {
        int i;
        int i2;
        int a;
        int b;
        int i3;
        if (!((RunnableC0002c) this).f322t && !((RunnableC0002c) this).f324u) {
            if (((RunnableC0002c) this).objData[5] == 0) {
                i = 36;
                i2 = RunnableC0002c.rotationQuadrants[4];
                a = ((RunnableC0002c) this).objData[2];
                b = ((RunnableC0002c) this).objData[3] - 32;
                i3 = 16;
            } else {
                i = 36;
                i2 = RunnableC0002c.rotationQuadrants[4];
                a = ((RunnableC0002c) this).objData[2] - ((RunnableC0002c.mo34a((((RunnableC0002c) this).objData[5] * 90) / 4) * 8) / 100);
                b = ((RunnableC0002c.mo49b((((RunnableC0002c) this).objData[5] * 90) / 4) * 8) / 100) + (((RunnableC0002c) this).objData[3] - 24);
                i3 = 0;
            }
            RunnableC0002c.m204b(i, 0, i3, 16, 16, i2, a, b - 4);
            RunnableC0002c.m204b(36, 0, 32, 16, 48, RunnableC0002c.rotationQuadrants[4], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] - 4);
        }
    }

    /* renamed from: bm */
    private void m92bm() {
        int i;
        int i2 = 1;
        if (((RunnableC0002c) this).objData[4] != 1) {
            if (((RunnableC0002c) this).objData[4] == 2) {
                i2 = 2;
            } else if (((RunnableC0002c) this).objData[4] == 16) {
                i2 = 3;
            } else if (((RunnableC0002c) this).objData[4] == 17) {
                i2 = 4;
            } else if (((RunnableC0002c) this).objData[4] == 18) {
                i2 = 5;
            } else {
                i = 0;
                RunnableC0002c.m204b(37, i * 16, 0, 16, 64, 0, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
            }
        }
        i = i2;
        RunnableC0002c.m204b(37, i * 16, 0, 16, 64, 0, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
    }

    /* renamed from: bn */
    private void m93bn() {
        int i;
        int i2;
        int i3;
        int i4;
        if (RunnableC0002c.gameObjGfx[42] != null) {
            int width = RunnableC0002c.gameObjGfx[42].getWidth();
            if (((RunnableC0002c) this).objData[4] < 7) {
                if (RunnableC0002c.f92r[((RunnableC0002c) this).objData[4]] == 8) {
                    i = 8;
                    i2 = 16;
                } else {
                    i = 0;
                    i2 = 32;
                }
                if (((RunnableC0002c) this).objData[5] != 0 && ((RunnableC0002c) this).objData[7] < 60) {
                    if (((RunnableC0002c) this).objData[5] < 7) {
                        int i5 = ((RunnableC0002c) this).objData[7];
                        RunnableC0002c.m204b(42, 8, (RunnableC0002c.f92r[((RunnableC0002c) this).objData[5]] * i2) + 7, 16, 14, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] - (i5 >= 48 ? 48 : i5));
                    } else {
                        return;
                    }
                }
                if (RunnableC0002c.f92r[((RunnableC0002c) this).objData[4]] == 8) {
                    i3 = 256;
                    i4 = 16;
                } else if (((RunnableC0002c) this).f302j % 2 == 0) {
                    i3 = RunnableC0002c.f92r[((RunnableC0002c) this).objData[4]] * i2;
                    i4 = i2;
                } else {
                    i3 = (((((RunnableC0002c) this).f302j % 6) / 2) + 5) * i2;
                    i4 = i2;
                }
                RunnableC0002c.m204b(42, 0, i3, width, i4, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + i);
            }
        }
    }

    /* renamed from: bo */
    private void m94bo() {
        m93bn();
    }

    /* renamed from: bp */
    private void m95bp() {
        int i;
        int i2;
        int i3 = ((RunnableC0002c) this).objData[10] / 3 > 22 ? 48 : 0;
        if (((RunnableC0002c) this).objData[5] != 2) {
            i2 = (((((RunnableC0002c) this).objData[10] / 3) % 4) * 48) + i3;
            i = 44;
        } else {
            i = 44;
            i2 = 192;
        }
        RunnableC0002c.m204b(i, 0, i2, 48, 48, 0, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3] + 10);
        if (((RunnableC0002c) this).objData[5] == 1) {
            RunnableC0002c.m204b(0, 16, ((((RunnableC0002c) this).objData[10] / 4) % 4) * 16, 16, 16, RunnableC0002c.f93s[(((RunnableC0002c) this).objData[10] / 2) % 4], (((RunnableC0002c) this).objData[2] + RunnableC0002c.f94t[(((RunnableC0002c) this).objData[10] / 4) % 10]) - 32, ((((RunnableC0002c) this).objData[3] + 10) + RunnableC0002c.f95u[(((RunnableC0002c) this).objData[10] / 4) % 10]) - 32);
        }
    }

    /* renamed from: bq */
    private void m96bq() {
        int width = RunnableC0002c.gameObjGfx[45].getWidth();
        int i = (((RunnableC0002c) this).objData[4] == 0 || ((RunnableC0002c) this).objData[4] == 3) ? 0 : ((RunnableC0002c) this).objData[4] == 1 ? 48 : 24;
        if (((RunnableC0002c) this).objData[5] == 1) {
            RunnableC0002c.m204b(45, 0, i, width, 24, 0, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
        }
    }

    /* renamed from: br */
    private void m97br() {
        m96bq();
    }

    /* renamed from: bs */
    private void m98bs() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (((RunnableC0002c) this).objData[4] == 1) {
            if (((RunnableC0002c) this).objData[5] < 2) {
                RunnableC0002c.m204b(55, (((RunnableC0002c) this).f302j % 2) * 24, 96, 24, 16, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
                i2 = RunnableC0002c.rotationQuadrants[0];
                i3 = ((RunnableC0002c) this).objData[8];
                i4 = ((RunnableC0002c) this).objData[9];
                i = 64;
                i5 = 0;
            } else {
                i = 32;
                i2 = RunnableC0002c.rotationQuadrants[0];
                i3 = ((RunnableC0002c) this).objData[8];
                i4 = ((RunnableC0002c) this).objData[9] + 16;
                i5 = 64;
            }
            RunnableC0002c.m204b(55, 0, i5, 64, i, i2, i3, i4 + 37);
        }
    }

    /* renamed from: bt */
    private void m99bt() {
        RunnableC0002c.m204b(56, 0, 32, 32, 32, RunnableC0002c.rotationQuadrants[0], ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3]);
    }

    /* renamed from: bu */
    private void m100bu() {
        RunnableC0002c.mo46a(58, 0, ((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 3);
    }

    /* renamed from: bv */
    private void m101bv() {
        RunnableC0002c.m203b(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 60, 0, RunnableC0002c.rotationQuadrants[0]);
    }

    /* renamed from: bw */
    private void m102bw() {
        int i;
        Game bVar;
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        int i6 = 3;
        int i7 = ((RunnableC0002c) this).f302j - ((RunnableC0002c) this).objData[5];
        int i8 = (((RunnableC0002c) this).objData[4] == 213 || ((RunnableC0002c) this).objData[4] == 181 || ((RunnableC0002c) this).objData[4] == 197 || ((RunnableC0002c) this).objData[4] == 101 || ((RunnableC0002c) this).objData[4] == 69 || ((RunnableC0002c) this).objData[4] == 53) ? 5 : (((RunnableC0002c) this).objData[4] == 212 || ((RunnableC0002c) this).objData[4] == 196 || ((RunnableC0002c) this).objData[4] == 84 || ((RunnableC0002c) this).objData[4] == 68 || ((RunnableC0002c) this).objData[4] == 52) ? 4 : ((RunnableC0002c) this).objData[4] == 38 ? 6 : ((RunnableC0002c) this).objData[4] == 195 ? 3 : 0;
        int i9 = (((RunnableC0002c) this).objData[4] == 181 || ((RunnableC0002c) this).objData[4] == 101) ? 12 : (((RunnableC0002c) this).objData[4] == 196 || ((RunnableC0002c) this).objData[4] == 197 || ((RunnableC0002c) this).objData[4] == 84 || ((RunnableC0002c) this).objData[4] == 195) ? 10 : (((RunnableC0002c) this).objData[4] == 213 || ((RunnableC0002c) this).objData[4] == 212 || ((RunnableC0002c) this).objData[4] == 69 || ((RunnableC0002c) this).objData[4] == 68) ? 8 : (((RunnableC0002c) this).objData[4] == 52 || ((RunnableC0002c) this).objData[4] == 53) ? 6 : ((RunnableC0002c) this).objData[4] == 38 ? 4 : 0;
        if (((RunnableC0002c) this).objData[4] == 69 || ((RunnableC0002c) this).objData[4] == 84 || ((RunnableC0002c) this).objData[4] == 101 || ((RunnableC0002c) this).objData[4] == 38 || ((RunnableC0002c) this).objData[4] == 68 || ((RunnableC0002c) this).objData[4] == 52 || ((RunnableC0002c) this).objData[4] == 53) {
            i = 360 - ((((360 / i9) - (i7 % (360 / i9))) * i9) % 360);
            bVar = this;
        } else {
            i = ((360 / i9) - (i7 % (360 / i9))) * i9;
            bVar = this;
        }
        bVar.m119n(i, 16, 17);
        if (((RunnableC0002c) this).objData[4] == 84 || ((RunnableC0002c) this).objData[19] == 1) {
            m119n(i9 * (i7 % (360 / i9)), 16, 17);
        }
        if (this.zoneID != 4) {
            while (i5 < i8) {
                RunnableC0002c.m203b(((RunnableC0002c) this).objData[2] + (((((RunnableC0002c) this).objData[16] * 16) * i5) / 10000), ((RunnableC0002c) this).objData[3] + (((((RunnableC0002c) this).objData[17] * 16) * i5) / 10000), 60, 2, RunnableC0002c.rotationQuadrants[0]);
                i5++;
            }
            RunnableC0002c.m203b(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 60, 4, RunnableC0002c.rotationQuadrants[0]);
            i2 = ((RunnableC0002c) this).objData[2] + (((((RunnableC0002c) this).objData[16] * 16) * i5) / 10000);
            i3 = (((((RunnableC0002c) this).objData[17] * 16) * i5) / 10000) + ((RunnableC0002c) this).objData[3];
            i4 = 60;
        } else {
            int i10 = 1;
            while (i10 < i8) {
                RunnableC0002c.m203b(((RunnableC0002c) this).objData[2] + (((((RunnableC0002c) this).objData[16] * 16) * i10) / 10000), ((RunnableC0002c) this).objData[3] + (((((RunnableC0002c) this).objData[17] * 16) * i10) / 10000), 60, 1, RunnableC0002c.rotationQuadrants[0]);
                i10++;
            }
            RunnableC0002c.m203b(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], 60, 1, RunnableC0002c.rotationQuadrants[0]);
            i2 = (((((RunnableC0002c) this).objData[16] * 16) * i10) / 10000) + ((RunnableC0002c) this).objData[2];
            i3 = ((RunnableC0002c) this).objData[3] + (((((RunnableC0002c) this).objData[17] * 16) * i10) / 10000);
            i4 = 60;
            i6 = 1;
        }
        RunnableC0002c.m203b(i2, i3, i4, i6, RunnableC0002c.rotationQuadrants[0]);
    }

    /* renamed from: bx */
    private void m103bx() {
        int i;
        int i2 = 20;
        int i3 = 17;
        int i4 = ((RunnableC0002c) this).objData[2];
        int i5 = ((RunnableC0002c) this).objData[3];
        if (((RunnableC0002c) this).objData[4] >= 240) {
            for (int i6 = 0; i6 < 4; i6++) {
                RunnableC0002c.mo46a(107, 0, (i4 - 48) + (i6 * 32), i5, 3);
            }
            return;
        }
        if (((RunnableC0002c) this).objData[4] < 224) {
            if (((RunnableC0002c) this).objData[4] <= 2) {
                i4 -= 16;
                i5 -= 16;
            } else if (((RunnableC0002c) this).objData[4] == 19) {
                RunnableC0002c.mo46a(17, 0, i4 - 32, i5 - 32, 20);
                RunnableC0002c.mo46a(17, 0, i4, i5 - 32, 20);
                RunnableC0002c.mo46a(17, 0, i4 - 32, i5, 20);
            } else if (((RunnableC0002c) this).objData[4] <= 91 && ((RunnableC0002c) this).objData[4] >= 88) {
                i = 21;
                i3 = i;
                i2 = 3;
            } else if (((RunnableC0002c) this).objData[4] == 160) {
                RunnableC0002c.mo46a(17, 0, i4, i5 - 16, 3);
                i5 += 16;
                i2 = 3;
            } else if (((RunnableC0002c) this).objData[4] == 55) {
                if (((RunnableC0002c) this).objData[8] == 7992 && ((RunnableC0002c) this).objData[9] == 1353) {
                    return;
                }
            } else {
                return;
            }
            RunnableC0002c.mo46a(i3, 0, i4, i5, i2);
        }
        i = 107;
        i3 = i;
        i2 = 3;
        RunnableC0002c.mo46a(i3, 0, i4, i5, i2);
    }

    /* renamed from: by */
    private void m104by() {
        int i;
        char c;
        if (this.zoneID == 3) {
            if (((RunnableC0002c) this).objData[4] == 54) {
                i = 25;
                c = 4;
            } else {
                i = -25;
                c = 0;
            }
            RunnableC0002c.m204b(75, 0, 0, 16, 32, RunnableC0002c.rotationQuadrants[c], ((RunnableC0002c) this).objData[2] + i, ((RunnableC0002c) this).objData[3]);
        }
    }

    /* renamed from: bz */
    private void m105bz() {
        int i = ((RunnableC0002c) this).objData[5] / 4;
        if (((RunnableC0002c) this).objData[4] == 16 && i > 0) {
            int i2 = i < 6 ? i % 2 : (i % 2) + 2;
            int width = RunnableC0002c.gameObjGfx[14].getWidth();
            int i3 = 0;
            while (i3 < (((RunnableC0002c) this).objData[9] - ((RunnableC0002c) this).objData[3]) / 32) {
                RunnableC0002c.m213c(14, 0, (width / 2) * (i3 % 2), width, width / 2, RunnableC0002c.rotationQuadrants[0], ((((RunnableC0002c) this).objData[2] - 20) + 24) - 32, (((RunnableC0002c) this).objData[3] - 48) + (i3 * 32) + 16);
                i3++;
            }
            int i4 = (((RunnableC0002c) this).objData[9] - ((RunnableC0002c) this).objData[3]) % (width / 2);
            if (i4 > 0) {
                RunnableC0002c.m213c(14, 0, (width / 2) * (i3 % 2), width, i4, RunnableC0002c.rotationQuadrants[0], ((((RunnableC0002c) this).objData[2] - 20) + 24) - 32, (((RunnableC0002c) this).objData[3] - 48) + (i3 * 32) + 16);
            }
            int width2 = RunnableC0002c.gameObjGfx[77].getWidth();
            RunnableC0002c.m213c(77, 0, RunnableC0002c.f96v[i2], width2, RunnableC0002c.f96v[i2 + 1] - RunnableC0002c.f96v[i2], RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c) this).objData[8] - 20) - 32, ((RunnableC0002c) this).objData[9] - 48);
            RunnableC0002c.m213c(77, 0, RunnableC0002c.f96v[i2 + 2], width2, RunnableC0002c.f96v[(i2 + 1) + 2] - RunnableC0002c.f96v[i2 + 2], RunnableC0002c.rotationQuadrants[0], (((RunnableC0002c) this).objData[2] - 20) - 32, ((RunnableC0002c) this).objData[3] - 48);
        }
    }

    /* renamed from: c */
    private void m106c(int i, int i2, int i3, int i4, int i5) {
        m6a(i, i2, i3, i4, RunnableC0002c.framedata[i][i5]);
    }

    /* renamed from: d */
    private void m107d(int i, int i2, int i3, int i4) {
        int i5 = RunnableC0002c.framedata[120][15][4];
        int i6 = RunnableC0002c.framedata[120][15][5];
        int i7 = this.f141Q;
        int i8 = ((RunnableC0002c) this).f137O / 100;
        int i9 = i3 == 1 ? -i5 : i5;
        while (i8 < 0) {
            i8 += 360;
        }
        int a = ((RunnableC0002c.mo34a(i8) * 90) / 100) + 180;
        if (i7 > 16) {
            m106c(120, i, i2, i3, ((((RunnableC0002c) this).f302j >> 2) & 1) + 15);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = (i10 + 1) * 16;
            int a2 = ((RunnableC0002c.mo34a(a) * i11) / 100) + i + i9;
            int b = ((RunnableC0002c.mo49b(a) * i11) / 100) + i2 + i6;
            if (i7 > i11 + 16) {
                m106c(120, a2, b, 0, 17);
            }
            if (i4 == 2 && Math.abs(i7 - (i11 + 16)) < 4) {
                mo36a(1, a2, b, 0, 0, 0, 0);
            }
        }
        int a3 = i + i9 + ((RunnableC0002c.mo34a(a) * i7) / 100);
        int b2 = i2 + i6 + ((RunnableC0002c.mo49b(a) * i7) / 100);
        if (i4 == 2) {
            int a4 = i + i9 + ((RunnableC0002c.mo34a(a) * 96) / 100);
            int b3 = i2 + i6 + ((RunnableC0002c.mo49b(a) * 96) / 100);
            m106c(121, a4, b3, 0, 0);
            if ((((RunnableC0002c) this).f302j & 7) == 4) {
                mo36a(1, (RunnableC0002c.getRandomInt(48) + a4) - 24, (RunnableC0002c.getRandomInt(48) + b3) - 24, 0, 0, 0, 0);
                return;
            }
            return;
        }
        m106c(121, a3, b2, 0, 0);
    }

    /* renamed from: d */
    private void m108d(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        Game bVar;
        int i9 = 1;
        switch (i) {
            case 0:
                if (i5 != 0) {
                    i9 = 2;
                    i6 = i4;
                    i7 = i3;
                    i8 = i2;
                    bVar = this;
                    break;
                } else {
                    i6 = i4;
                    i7 = i3;
                    i8 = i2;
                    bVar = this;
                    break;
                }
            case 1:
                if (i5 != 0) {
                    i9 = 4;
                    i6 = i4;
                    i7 = i3;
                    i8 = i2;
                    bVar = this;
                    break;
                } else {
                    i9 = 3;
                    i6 = i4;
                    i7 = i3;
                    i8 = i2;
                    bVar = this;
                    break;
                }
            case 2:
                if (i5 != 0) {
                    i9 = 6;
                    i6 = i4;
                    i7 = i3;
                    i8 = i2;
                    bVar = this;
                    break;
                } else {
                    i6 = i4;
                    i7 = i3;
                    i8 = i2;
                    bVar = this;
                    break;
                }
            case 3:
                i9 = 6;
                i6 = i4;
                i7 = i3;
                i8 = i2;
                bVar = this;
                break;
            case 4:
                i9 = 7;
                i6 = i4;
                i7 = i3;
                i8 = i2;
                bVar = this;
                break;
            case 5:
                if (i5 != 0) {
                    i9 = 22;
                    i6 = i4;
                    i7 = i3;
                    i8 = i2;
                    bVar = this;
                    break;
                } else {
                    i9 = 21;
                    i6 = i4;
                    i7 = i3;
                    i8 = i2;
                    bVar = this;
                    break;
                }
            case 6:
                i9 = 0;
                i6 = i4;
                i7 = i3;
                i8 = i2;
                bVar = this;
                break;
            default:
                return;
        }
        bVar.m106c(120, i8, i7, i6, i9);
    }

    @Override // p000.RunnableC0002c
    /* renamed from: d */
    private void m109d(int[] iArr) {
        int i;
        int i2;
        int i3;
        Game bVar;
        int i4 = (((RunnableC0002c) this).f302j >> 3) & 1;
        int i5 = (((RunnableC0002c) this).f302j >> 2) & 1;
        int i6 = (((RunnableC0002c) this).f302j >> 1) & 1;
        int i7 = ((RunnableC0002c) this).f302j & 1;
        if (((RunnableC0002c) this).f129L >= 2) {
            mo61c(iArr);
            int i8 = iArr[2];
            int i9 = iArr[3];
            int i10 = ((RunnableC0002c) this).f132M;
            int i11 = ((RunnableC0002c) this).f135N;
            int i12 = ((((RunnableC0002c) this).f302j & 1) != 0 || ((RunnableC0002c) this).f188aa <= 0) ? 0 : 1;
            switch (i10) {
                case 0:
                    m117l(i8, i9, i11);
                    m108d(this.f192ac, i8, i9, i11, i5);
                    i = 120;
                    i2 = 8;
                    i5 = i12;
                    i3 = i5 + i2;
                    bVar = this;
                    break;
                case 1:
                    m117l(i8, i9, i11);
                    m108d(1, i8, i9, i11, i5);
                    i = 120;
                    i3 = 8;
                    bVar = this;
                    break;
                case 2:
                    m117l(i8, i9, i11);
                    m108d(this.f192ac, i8, i9, i11, i5);
                    m106c(120, i8, i9, i11, i7 + 11);
                    i = 120;
                    i2 = 8;
                    i5 = i12;
                    i3 = i5 + i2;
                    bVar = this;
                    break;
                case 3:
                    m118m(i8, i9, i11);
                    m108d(2, i8, i9, i11, i4);
                    m106c(120, i8, i9, i11, 8);
                    if (i5 != 0) {
                        mo36a(1, (RunnableC0002c.getRandomInt(32) + i8) - 16, ((RunnableC0002c.getRandomInt(32) + i9) - 16) - 8, 0, 0, 0, 0);
                        return;
                    }
                    return;
                case 4:
                    m106c(120, i8, i9, i11, 7);
                    i = 120;
                    i3 = 8;
                    bVar = this;
                    break;
                case 5:
                    m108d(0, i8, i9, i11, i5);
                    m106c(120, i8, i9, i11, 8);
                    if (i6 == 1) {
                        m106c(120, i8, i9, i11, 18);
                    }
                    i = 120;
                    i2 = 13;
                    i3 = i5 + i2;
                    bVar = this;
                    break;
                case 6:
                    m108d(0, i8, i9, i11, i5);
                    m106c(120, i8, i9, i11, 8);
                    if (i6 != 0) {
                        m106c(120, i8, i9, i11, 18);
                    }
                    i = 120;
                    i2 = 11;
                    i5 = i7;
                    i3 = i5 + i2;
                    bVar = this;
                    break;
                default:
                    return;
            }
            bVar.m106c(i, i8, i9, i11, i3);
        }
    }

    @Override // p000.RunnableC0002c
    /* renamed from: e */
    private void displayObject(int i) {
        switch (i) {
            case 0:
            case 1:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                DisplayRings();
                return;
            case 2:
                try {
                    m73bO();
                    return;
                } catch (Exception e) {
                    return;
                }
            case 3:
                m27aT();
                return;
            case 4:
                m29aV();
                return;
            case 5:
                m28aU();
                return;
            case 6:
                m30aW();
                return;
            case 7:
                m31aX();
                return;
            case 8:
                m32aY();
                return;
            case 9:
                m33aZ();
                return;
            case 10:
                m80ba();
                return;
            case 11:
                m81bb();
                return;
            case 12:
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
            case 48:
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
            case 89:
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
                return;
            case 13:
                m83bd();
                return;
            case 14:
                m84be();
                return;
            case 15:
                m85bf();
                return;
            case 16:
                m86bg();
                return;
            case 17:
                m87bh();
                return;
            case 18:
                m88bi();
                return;
            case 20:
                m89bj();
                return;
            case 27:
                m90bk();
                return;
            case 36:
                m91bl();
                return;
            case 37:
                m92bm();
                return;
            case 38:
                m74bP();
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
                m111f(i);
                return;
            case 40:
                m75bQ();
                return;
            case 42:
            case 43:
                m94bo();
                return;
            case 44:
                m95bp();
                return;
            case 45:
                m96bq();
                return;
            case 46:
                m97br();
                return;
            case 47:
                if (((RunnableC0002c) this).f308l < 6) {
                    m371m();
                    return;
                }
                return;
            case 49:
                m77bS();
                return;
            case 54:
                m82bc();
                return;
            case 55:
                m98bs();
                return;
            case 56:
                m99bt();
                return;
            case 58:
                m100bu();
                return;
            case 59:
                m101bv();
                return;
            case 60:
                m102bw();
                return;
            case 61:
                m76bR();
                return;
            case 62:
                m103bx();
                return;
            case 75:
                m104by();
                return;
            case 77:
                m105bz();
                return;
            case 79:
                m59bA();
                return;
            case 90:
                m60bB();
                return;
            case 93:
                m79bU();
                return;
            case 120:
            case 125:
            case 130:
            case 135:
            case 140:
                m40ah();
                return;
            case 150:
                m113g(false);
                return;
        }
    }

    /* renamed from: f */
    private void m111f(int i) {
        int[] iArr;
        char c;
        if (((RunnableC0002c) this).objData[15] >= 0) {
            int i2 = RunnableC0002c.rotationQuadrants[0];
            switch (((RunnableC0002c) this).objData[19]) {
                case 1:
                    iArr = RunnableC0002c.rotationQuadrants;
                    c = 4;
                    break;
                case 2:
                    iArr = RunnableC0002c.rotationQuadrants;
                    c = 6;
                    break;
                case 3:
                    iArr = RunnableC0002c.rotationQuadrants;
                    c = 2;
                    break;
                default:
                    RunnableC0002c.m203b(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], i, ((RunnableC0002c) this).objData[15], i2);
            }
            i2 = iArr[c];
            RunnableC0002c.m203b(((RunnableC0002c) this).objData[2], ((RunnableC0002c) this).objData[3], i, ((RunnableC0002c) this).objData[15], i2);
        }
    }

    /* renamed from: f */
    private void m112f(boolean z) {
        int i = 0;
        for (int length = ((RunnableC0002c) this).ObjectPool.length - 1; length >= 0 && i < this.ObjectsAmount; length--) {
            if (((RunnableC0002c) this).ObjectPool[length][24] == 1) {
                i++;
                int i2 = ((RunnableC0002c) this).ObjectPool[length][1];
                if (z == (i2 == 45 || i2 == 26 || i2 == 53 || i2 == 10 || (i2 == 88 && ((RunnableC0002c) this).ObjectPool[length][4] == 127))) {
                    ((RunnableC0002c) this).objData = ((RunnableC0002c) this).ObjectPool[length];
                    displayObject(((RunnableC0002c) this).objData[1]);
                }
            }
        }
    }

    /* renamed from: g */
    private void m113g(boolean z) {
        short s;
        short s2;
        for (int i = 0; i < 10; i++) {
            if (((RunnableC0002c) this).f165a[i][2] == 0) {
                if (((RunnableC0002c) this).f165a[i][3] == 0) {
                    short s3 = ((RunnableC0002c) this).f165a[i][0];
                    s = ((RunnableC0002c) this).f165a[i][1];
                    s2 = s3;
                } else {
                    int i2 = (this.f143S + ((RunnableC0002c) this).f146U) / 100;
                    s = ((((RunnableC0002c) this).f144T + ((RunnableC0002c) this).f148V) / 100) + 24;
                    s2 = i2;
                }
                if (!z || Math.abs(((RunnableC0002c) this).f165a[i][0] - ((this.f143S + ((RunnableC0002c) this).f146U) / 100)) <= 32) {
                    RunnableC0002c.m204b(102, 0, 0, 32, 32, 0, (s2 == 1 ? 1 : 0) + this.xPos, s + this.yPos);
                }
            }
        }
    }

    /* renamed from: i */
    private void m114i(int i, int i2, int i3) {
        m106c(120, i, i2, i3, 19);
    }

    /* renamed from: j */
    private void m115j(int i, int i2, int i3) {
        m106c(120, i, i2, i3, 19);
    }

    /* renamed from: k */
    private void m116k(int i, int i2, int i3) {
        m106c(120, i, ((i2 + 8) - 32) + this.f141Q, i3, 20);
    }

    /* renamed from: l */
    private void m117l(int i, int i2, int i3) {
        switch (((RunnableC0002c) this).f126K) {
            case 0:
                m107d(i, i2, i3, 0);
                return;
            case 1:
            default:
                return;
            case 2:
                m114i(i, i2, i3);
                return;
            case 3:
                m115j(i, i2, i3);
                return;
            case 4:
                m116k(i, i2, i3);
                return;
        }
    }

    /* renamed from: m */
    private void m118m(int i, int i2, int i3) {
        switch (((RunnableC0002c) this).f126K) {
            case 0:
                m107d(i, i2, i3, 2);
                return;
            case 1:
            default:
                return;
            case 2:
                m114i(i, i2, i3);
                return;
            case 3:
                m115j(i, i2, i3);
                return;
            case 4:
                m116k(i, i2, i3);
                return;
        }
    }

    /* renamed from: n */
    private void m119n(int i, int i2, int i3) {
        int i4 = i < 0 ? i + 360 : i;
        if (360 >= i4) {
            i4 -= (i4 / 360) * 360;
        }
        if (i4 <= 90) {
            ((RunnableC0002c) this).objData[i2] = RunnableC0002c.f13A[90 - i4];
            ((RunnableC0002c) this).objData[i3] = RunnableC0002c.f13A[i4];
        }
        if (i4 > 90 && i4 <= 180) {
            ((RunnableC0002c) this).objData[i2] = -RunnableC0002c.f13A[90 - (180 - i4)];
            ((RunnableC0002c) this).objData[i3] = RunnableC0002c.f13A[180 - i4];
        }
        if (i4 > 180 && i4 <= 270) {
            ((RunnableC0002c) this).objData[i2] = -RunnableC0002c.f13A[90 - (i4 - 180)];
            ((RunnableC0002c) this).objData[i3] = -RunnableC0002c.f13A[i4 - 180];
        }
        if (i4 > 270 && i4 < 360) {
            ((RunnableC0002c) this).objData[i2] = RunnableC0002c.f13A[90 - (360 - i4)];
            ((RunnableC0002c) this).objData[i3] = -RunnableC0002c.f13A[360 - i4];
        }
    }

    @Override // p000.RunnableC0002c
    public final void paint(Graphics graphics) {
        try {
            RunnableC0002c.screenBuffer = graphics;
            m35ac();
            if (((RunnableC0002c) this).f115G) {
                Font font = graphics.getFont();
                if (((RunnableC0002c) this).f290f[1]) {
                    int i = ((RunnableC0002c) this).f103B[this.f169aD];
                    String stringBuffer = new StringBuffer().append(i != 0 ? String.valueOf(1000 / i) : "??").append(" fps").toString();
                    graphics.setColor(0);
                    graphics.fillRect(0, 0, font.stringWidth("XXXXXX"), RunnableC0002c.f22a);
                    graphics.setColor(16777215);
                    graphics.drawString(stringBuffer, 0, 0, 20);
                }
                if (((RunnableC0002c) this).f290f[3]) {
                    String stringBuffer2 = new StringBuffer().append(Integer.toHexString(RunnableC0002c.f100z[0]).toUpperCase()).append(", ").append(Integer.toHexString(RunnableC0002c.f100z[1]).toUpperCase()).toString();
                    int stringWidth = font.stringWidth(stringBuffer2);
                    graphics.setColor(0);
                    graphics.fillRect(RunnableC0002c.f51d - stringWidth, 0, stringWidth, RunnableC0002c.f22a);
                    graphics.setColor(16777215);
                    graphics.drawString(stringBuffer2, RunnableC0002c.f51d, 0, 24);
                }
            }
            RunnableC0002c.screenBuffer = null;
        } catch (Throwable th) {
        }
    }

    @Override // p000.RunnableC0002c
    public final void run() {
        try {
            ((RunnableC0002c) this).f217b = System.currentTimeMillis();
            InitGame();
            int i = 0;
            while (true) {
                ((RunnableC0002c) this).f270c = System.currentTimeMillis();
                MainGameLoop();
                this.f166aA++;
                ((RunnableC0002c) this).f277d = (long) (this.f166aA * 18);
                ((RunnableC0002c) this).f282e = System.currentTimeMillis() - ((RunnableC0002c) this).f217b;
                if (((long) this.minValue) < ((RunnableC0002c) this).f277d - ((RunnableC0002c) this).f282e || i > 7) {
                    long currentTimeMillis = System.currentTimeMillis();
                    m368j();
                    repaint();
                    serviceRepaints();
                    this.f167aB++;
                    int[] iArr = ((RunnableC0002c) this).f103B;
                    int i2 = this.f169aD;
                    this.f169aD = i2 + 1;
                    iArr[i2] = (int) (System.currentTimeMillis() - currentTimeMillis);
                    if (this.f169aD == ((RunnableC0002c) this).f103B.length) {
                        this.f169aD = 0;
                    }
                    this.minValue = 0;
                    for (int i3 = 0; i3 < ((RunnableC0002c) this).f103B.length; i3++) {
                        this.minValue += ((RunnableC0002c) this).f103B[i3];
                    }
                    this.minValue /= ((RunnableC0002c) this).f103B.length;
                    Thread.yield();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 - ((RunnableC0002c) this).f270c < 18) {
                        try {
                            Thread.sleep(18 - (currentTimeMillis2 - ((RunnableC0002c) this).f270c));
                        } catch (Exception e) {
                        }
                    }
                    ((RunnableC0002c) this).f121I = true;
                    i = 0;
                } else {
                    i++;
                    ((RunnableC0002c) this).f121I = false;
                }
            }
        } catch (Throwable th) {
        }
    }
}
