package defpackage;

import android.util.SparseArray;

/* renamed from: uro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uro {
    private static final int[] b = new int[0];
    public final SparseArray a = new SparseArray();

    public uro() {
        int[] iArr = b;
        a(2, iArr, iArr, iArr, new int[]{1, 23, 24, 36, 37, 38});
        int[] iArr2 = b;
        a(1, iArr2, iArr2, iArr2, iArr2);
        a(21, new int[]{1, 2}, new int[]{1}, new int[]{2}, b);
        a(22, new int[]{1, 2, 23, 36, 37}, new int[]{1}, new int[]{2, 23, 36, 37}, b);
        int[] iArr3 = b;
        int[] iArr4 = iArr3;
        a(23, iArr4, iArr3, new int[]{2, 36, 37}, new int[]{1});
        int[] iArr5 = b;
        a(24, iArr5, iArr5, iArr5, new int[]{1});
        a(31, new int[]{1, 2}, new int[]{1}, new int[]{2}, b);
        a(35, new int[]{1, 2, 23, 36, 37}, new int[]{1}, new int[]{2, 23, 36, 37}, b);
        a(32, new int[]{1, 2}, new int[]{1}, new int[]{2}, b);
        a(33, new int[]{1, 2}, new int[]{1}, new int[]{2}, b);
        a(34, new int[]{1, 2}, new int[]{1}, new int[]{2}, b);
        int[] iArr6 = b;
        int[] iArr7 = iArr6;
        a(36, iArr7, iArr6, new int[]{2, 23, 37}, new int[]{1});
        int[] iArr8 = b;
        int[] iArr9 = iArr8;
        a(37, iArr9, iArr8, new int[]{2, 23, 36}, new int[]{1});
        int[] iArr10 = b;
        a(38, iArr10, iArr10, iArr10, new int[]{1});
        int[] iArr11 = b;
        a(12, iArr11, iArr11, iArr11, new int[]{11, 43, 44, 53, 54, 63, 61, 62, 64, 65, 71, 72, 73});
        int[] iArr12 = b;
        a(11, iArr12, iArr12, iArr12, iArr12);
        a(41, new int[]{11, 12, 63, 62, 64}, new int[]{11}, new int[]{12}, b);
        a(42, new int[]{11, 12, 63, 62, 64}, new int[]{11}, new int[]{12}, b);
        int[] iArr13 = b;
        int[] iArr14 = iArr13;
        a(43, iArr14, iArr13, new int[]{12}, new int[]{11, 63, 62, 64, 65});
        int[] iArr15 = b;
        a(44, iArr15, iArr15, iArr15, new int[]{11});
        a(51, new int[]{11, 12, 63, 61, 62, 71, 72, 73}, new int[]{11}, new int[]{12}, b);
        a(52, new int[]{11, 12, 63, 61, 62, 71, 72, 73}, new int[]{11}, new int[]{12}, b);
        int[] iArr16 = b;
        int[] iArr17 = iArr16;
        a(53, iArr17, iArr16, new int[]{12}, new int[]{11, 63, 61, 62, 71, 72, 73});
        int[] iArr18 = b;
        a(54, iArr18, iArr18, iArr18, new int[]{11});
        int[] iArr19 = b;
        int[] iArr20 = iArr19;
        a(63, iArr20, iArr19, new int[]{12}, new int[]{43, 44, 53, 54, 61, 62, 64, 65, 71, 72, 73});
        int[] iArr21 = b;
        int[] iArr22 = iArr21;
        a(61, iArr22, iArr21, new int[]{12}, new int[]{11, 53, 54, 63, 62});
        int[] iArr23 = b;
        int[] iArr24 = iArr23;
        a(62, iArr24, iArr23, new int[]{12}, new int[]{43, 44, 53, 54, 63, 61, 64, 65});
        int[] iArr25 = b;
        int[] iArr26 = iArr25;
        a(64, iArr26, iArr25, new int[]{12}, new int[]{11, 43, 44, 63, 62});
        int[] iArr27 = b;
        a(65, iArr27, iArr27, iArr27, iArr27);
        int[] iArr28 = b;
        int[] iArr29 = iArr28;
        a(71, iArr29, iArr28, new int[]{12}, new int[]{11, 53, 54});
        int[] iArr30 = b;
        int[] iArr31 = iArr30;
        a(72, iArr31, iArr30, new int[]{12}, new int[]{11, 53, 54, 63, 61, 62});
        int[] iArr32 = b;
        int[] iArr33 = iArr32;
        a(73, iArr33, iArr32, new int[]{12}, new int[]{11, 53, 54, 63, 61, 62});
    }

    private final void a(int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a.put(i, new urn(iArr, iArr2, iArr3, iArr4));
    }

    public static final boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(urq urq, urq urq2) {
        return a(((urn) this.a.get(urq.g)).a, urq2.g);
    }
}
