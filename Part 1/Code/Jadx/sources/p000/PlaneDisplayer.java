package p000;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: a */
public final class PlaneDisplayer {

    /* renamed from: a */
    public static final int f2a = RunnableC0002c.f66g;

    /* renamed from: a */
    private static final int[] BackgroundColorArray = {2228394, 6496256, 4333667, 0, 4456516, 8738};

    /* renamed from: a */
    public static Image[] f4a;

    /* renamed from: a */
    public static final int[][] f5a = {new int[]{25, 50, 75, 80, 90, 120}, new int[0], new int[]{40, 60, 80, 90}, new int[0], new int[]{10, 20, 30, 40}, new int[0]};

    /* renamed from: a */
    public static final int[][][][] HscrollArray = {new int[][][]{new int[][]{new int[]{251, 252, 253, 254, 255, 251, 251, 261, 262, 263, 251, 252, 253, 254, 255, 251}, new int[]{251, 256, 257, 258, 259, 260, 251, 251, 251, 251, 251, 256, 257, 258, 259, 260}, new int[]{251, 251, 251, 251, 251, 251, 251, 264, 251, 251, 251, 251, 251, 261, 262, 263}, new int[]{251, 251, 251, 251, 261, 262, 263, 251, 251, 264, 251, 251, 251, 251, 251, 251}}, new int[][]{new int[]{251, 251, 310, 251, 251, 251, 251, 251, 251, 251, 251, 251, 251, 251, 251, 251}, new int[]{311, 311, 312, 310, 251, 251, 313, 310, 313, 251, 251, 311, 310, 313, 251, 251}, new int[]{314, 315, 316, 317, 319, 318, 317, 315, 317, 319, 318, 314, 315, 317, 318, 348}}, new int[][]{new int[]{283, 284, 285, 286, 295, 296, 297, 298, 270, 269, 270, 271, 273, 273, 268, 270}, new int[]{287, 288, 289, 290, 299, 300, 301, 302, 299, 275, 276, 277, 278, 279, 274, 299}, new int[]{291, 292, 293, 294, 303, 304, 305, 306, 294, 292, 282, 282, 280, 281, 303, 306}}, new int[][]{new int[]{308, 307, 308, 353, 353, 309, 309, 309, 353, 353, 307, 307, 365, 353, 308, 353}, new int[]{307, 308, 365, 307, 307, 365, 308, 353, 307, 308, 365, 307, 248, 248, 308, 307}, new int[]{248, 307, 307, 248, 248, 248, 248, 307, 307, 308, 248, 248, 249, 248, 248, 249}}, new int[][]{new int[]{249, 249, 248, 248, 369, 272, 248, 272, 369, 249, 249, 248, 369, 272, 368, 249}, new int[]{368, 249, 369, 272, 249, 249, 249, 369, 272, 272, 368, 368, 272, 272, 369, 272}, new int[]{250, 250, 250, 250, 354, 354, 250, 354, 250, 250, 354, 250, 250, 250, 354, 250}}}, new int[0][][], new int[][][]{new int[][]{new int[]{333, 334, 335, 336, 333, 334, 335, 336, 333, 334, 335, 336, 333, 334, 335, 336}, new int[]{335, 336, 333, 334, 335, 336, 333, 334, 335, 336, 333, 334, 335, 336, 333, 334}, new int[]{333, 334, 335, 336, 333, 334, 335, 336, 333, 334, 335, 336, 333, 334, 335, 336}, new int[]{335, 336, 333, 334, 335, 336, 333, 334, 335, 336, 333, 334, 335, 336, 333, 334}, new int[]{341, 341, 342, 342, 342, 343, 344, 345, 346, 343, 344, 339, 341, 337, 338, 339}}, new int[][]{new int[]{348, 244, 246, 248, 250, 345, 346, 344, 348, 254, 250, 356, 348, 342, 342, 356}, new int[]{243, 245, 247, 249, 249, 251, 252, 253, 252, 353, 249, 251, 243, 252, 253, 243}, new int[]{249, 230, 231, 232, 249, 249, 249, 249, 249, 249, 249, 249, 222, 223, 206, 249}, new int[]{213, 233, 234, 235, 219, 207, 215, 220, 219, 220, 213, 225, 224, 225, 238, 218}, new int[]{240, 239, 240, 239, 221, 208, 226, 227, 221, 212, 240, 239, 354, 239, 240, 239}, new int[]{242, 241, 242, 241, 242, 241, 242, 255, 242, 241, 242, 241, 242, 241, 242, 241}, new int[]{239, 240, 239, 240, 239, 240, 239, 240, 239, 240, 239, 240, 239, 240, 239, 240}, new int[]{241, 242, 241, 242, 241, 242, 241, 242, 241, 242, 241, 242, 241, 242, 241, 242}, new int[]{240, 239, 240, 239, 240, 239, 240, 239, 240, 239, 240, 239, 240, 239, 240, 239}, new int[]{242, 241, 242, 241, 242, 241, 242, 241, 242, 241, 242, 241, 242, 241, 242, 241}, new int[]{239, 240, 239, 240, 239, 240, 239, 240, 239, 240, 239, 240, 239, 240, 239, 240}}, new int[][]{new int[]{258, 256, 257, 258, 256, 257, 258, 312, 360, 314, 256, 257, 258, 256, 257, 328}, new int[]{261, 259, 260, 261, 259, 260, 261, 315, 361, 317, 259, 260, 261, 259, 260, 328}, new int[]{264, 262, 285, 286, 286, 287, 264, 318, 319, 320, 262, 263, 264, 262, 263, 328}, new int[]{258, 256, 284, 199, 199, 284, 258, 256, 257, 258, 256, 257, 258, 256, 257, 328}, new int[]{261, 259, 284, 199, 199, 284, 261, 259, 260, 261, 259, 260, 261, 259, 260, 328}, new int[]{264, 262, 284, 199, 199, 284, 264, 262, 263, 264, 262, 263, 264, 262, 263, 328}, new int[]{258, 256, 285, 286, 286, 287, 258, 256, 257, 258, 256, 257, 258, 256, 257, 328}, new int[]{261, 259, 260, 261, 259, 260, 261, 259, 260, 261, 259, 260, 261, 259, 260, 328}, new int[]{264, 262, 263, 264, 262, 263, 264, 262, 263, 264, 262, 263, 264, 262, 263, 328}, new int[]{258, 256, 257, 258, 256, 257, 293, 294, 257, 288, 289, 257, 258, 256, 257, 328}, new int[]{261, 259, 260, 261, 259, 260, 295, 296, 260, 290, 291, 260, 261, 259, 260, 328}, new int[]{264, 262, 263, 264, 262, 263, 295, 296, 263, 290, 291, 263, 264, 262, 263, 328}, new int[]{258, 256, 257, 258, 256, 257, 203, 297, 257, 202, 292, 257, 258, 256, 257, 328}, new int[]{261, 259, 260, 261, 259, 285, 286, 286, 286, 286, 286, 287, 321, 259, 260, 328}, new int[]{264, 262, 263, 264, 262, 308, 309, 310, 308, 309, 310, 308, 322, 262, 263, 328}, new int[]{328, 328, 328, 328, 328, 328, 328, 328, 328, 328, 328, 328, 328, 328, 328, 328}}}, new int[0][][], new int[][][]{new int[][]{new int[]{432, 432, 63, 64, 54, 33, 432, 408, 432, 51, 52, 53, 54, 63, 64, 54}, new int[]{33, 34, 35, 36, 432, 63, 64, 54, 33, 432, 63, 408, 51, 52, 53, 54}, new int[]{51, 52, 53, 54, 34, 408, 432, 51, 52, 53, 54, 33, 73, 74, 408, 33}, new int[]{432, 432, 63, 64, 53, 54, 432, 432, 432, 51, 52, 54, 33, 432, 63, 408}, new int[]{432, 432, 73, 74, 408, 432, 63, 408, 73, 74, 408, 432, 51, 52, 54, 33}, new int[]{432, 33, 432, 432, 432, 63, 408, 432, 63, 408, 73, 74, 408, 432, 432, 432}, new int[]{432, 432, 63, 432, 432, 33, 432, 432, 432, 432, 432, 33, 432, 432, 432, 432}, new int[]{432, 432, 432, 432, 432, 432, 432, 432, 432, 432, 432, 432, 432, 432, 432, 432}}, new int[][]{new int[]{432, 432, 83, 84, 360, 432, 432, 432, 432, 432, 432, 83, 84, 432, 432, 432}, new int[]{432, 381, 373, 383, 370, 372, 155, 360, 432, 432, 372, 373, 383, 155, 432, 432}, new int[]{372, 377, 383, 383, 376, 377, 383, 370, 371, 381, 382, 383, 383, 383, 370, 371}, new int[]{382, 383, 383, 383, 383, 383, 383, 383, 376, 377, 383, 383, 383, 383, 383, 376}, new int[]{383, 383, 383, 383, 383, 383, 383, 383, 383, 383, 383, 383, 383, 383, 383, 383}, new int[]{383, 383, 405, 427, 405, 383, 383, 383, 383, 383, 383, 383, 406, 383, 383, 383}, new int[]{383, 383, 410, 414, 402, 383, 409, 423, 412, 383, 383, 412, 416, 405, 383, 383}, new int[]{405, 412, 414, 411, 431, 413, 424, 424, 402, 416, 417, 400, 414, 402, 403, 412}, new int[]{410, 410, 402, 414, 425, 400, 414, 410, 402, 411, 410, 402, 411, 402, 411, 402}, new int[]{426, 426, 431, 426, 431, 424, 402, 423, 431, 426, 424, 423, 431, 431, 426, 431}, new int[]{431, 431, 431, 431, 431, 426, 431, 431, 431, 431, 426, 431, 431, 431, 431, 431}}, new int[][]{new int[]{10, 11, 13, 14, 10, 11, 13, 14, 10, 11, 13, 14, 10, 11, 13, 14}, new int[]{21, 23, 24, 25, 21, 23, 24, 25, 21, 23, 24, 25, 21, 23, 24, 25}, new int[]{23, 24, 25, 21, 23, 24, 25, 21, 23, 24, 25, 21, 23, 24, 25, 21}, new int[]{24, 25, 21, 23, 24, 25, 21, 23, 24, 25, 21, 23, 24, 25, 21, 23}, new int[]{25, 21, 23, 24, 25, 21, 23, 24, 25, 21, 23, 24, 25, 21, 23, 24}}, new int[][]{new int[]{32, 31, 32, 31, 32, 31, 32, 31, 32, 31, 32, 31, 32, 31, 32, 31}, new int[]{42, 41, 42, 41, 42, 41, 42, 41, 42, 41, 42, 41, 42, 41, 42, 41}, new int[]{42, 41, 42, 41, 42, 41, 42, 41, 42, 41, 42, 41, 42, 41, 42, 41}, new int[]{15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15}, new int[]{15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15}, new int[]{15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15}, new int[]{15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15}, new int[]{15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15}, new int[]{15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15}}}, new int[0][][]};

    /* renamed from: b */
    public static final int f7b = RunnableC0002c.f70h;

    /* renamed from: c */
    public static final int f8c = RunnableC0002c.f73i;

    /* renamed from: d */
    private static int plane_actID;

    /* renamed from: e */
    private static int plane_zoneID = -1;

    /* renamed from: a */
    private static int m0a(Graphics graphics, int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = -i2;
        if (i5 > 0) {
            i5 = 0;
        }
        int i6 = (RunnableC0002c.f73i + i5) - 4;
        int i7 = 0;
        while (i3 < i4) {
            do {
                int width = f4a[i3].getWidth();
                int i8 = -(((iArr[i7] * i) / 100) % width);
                int i9 = (f2a / width) + 2;
                for (int i10 = 0; i10 < i9; i10++) {
                    graphics.drawImage(f4a[i3], (width * i10) + i8, i6, 20);
                }
                i6 += f4a[i3].getHeight();
                if (i7 < iArr.length - 1) {
                    i7++;
                }
                if (i3 != i4 - 1) {
                    break;
                }
            } while (i5 + i6 < f8c + f7b);
            i3++;
        }
        return i6;
    }

    /* renamed from: a */
    public static void m1a() {
        f4a = null;
        System.gc();
    }

    /* renamed from: a */
    public static final void m2a(int i, int i2) {
        plane_zoneID = i;
        plane_actID = i2;
        RunnableC0002c.LoadZoneTiles(plane_zoneID, plane_actID);
        DeformBG();
    }

    /* renamed from: a */
    public static void m3a(Graphics graphics, int i, int i2, boolean z) {
        m4a(graphics, i, i2, z ? f5a[plane_zoneID] : new int[f5a[plane_zoneID].length]);
    }

    /* renamed from: a */
    private static void m4a(Graphics graphics, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = 32;
        switch (plane_zoneID) {
            case 0:
            case 4:
                int i6 = i2 >> 5;
                if (i6 <= 32) {
                    i5 = i6;
                }
                m0a(graphics, i, i5, 0, HscrollArray[plane_zoneID].length, iArr);
                return;
            case 1:
            case 3:
            default:
                return;
            case 2:
                if (i2 < 420) {
                    i2 >>= 1;
                    i3 = 244;
                } else if (i2 > 950) {
                    i4 = (i2 >> 1) - 12;
                    m0a(graphics, i, i4, 0, HscrollArray[plane_zoneID].length, iArr);
                    return;
                } else {
                    i3 = 488;
                }
                i4 = i2 - i3;
                m0a(graphics, i, i4, 0, HscrollArray[plane_zoneID].length, iArr);
                return;
        }
    }

    /* renamed from: b */
    private static void DeformBG() {
        try {
            f4a = new Image[HscrollArray[plane_zoneID].length];
            for (int i = 0; i < HscrollArray[plane_zoneID].length; i++) {
                f4a[i] = Image.createImage(HscrollArray[plane_zoneID][i][0].length * 16, HscrollArray[plane_zoneID][i].length * 16);
                Graphics graphics = f4a[i].getGraphics();
                graphics.setColor(BackgroundColorArray[plane_zoneID]);
                graphics.fillRect(0, 0, f4a[i].getWidth(), f4a[i].getHeight());
                for (int i2 = 0; i2 < HscrollArray[plane_zoneID][i].length; i2++) {
                    for (int i3 = 0; i3 < HscrollArray[plane_zoneID][i][i2].length; i3++) {
                        int i4 = HscrollArray[plane_zoneID][i][i2][i3];
                        if (i4 >= 0) {
                            graphics.setClip(i3 * 16, i2 * 16, 16, 16);
                            graphics.drawImage(RunnableC0002c.zoneTiles, (i3 * 16) - ((i4 % 16) * 16), (i2 * 16) - ((i4 / 16) * 16), 20);
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }
}