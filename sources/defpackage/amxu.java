package defpackage;

import java.util.Arrays;

/* renamed from: amxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amxu {
    static int a(int i) {
        return Math.max(4, amzi.b(i + 1));
    }

    static int a(int i, int i2) {
        return i & (i2 ^ -1);
    }

    static int a(int i, int i2, int i3) {
        return (i & (i3 ^ -1)) | (i2 & i3);
    }

    static Object b(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= 256) {
            return new byte[i];
        } else {
            if (i > 65536) {
                return new int[i];
            }
            return new short[i];
        }
    }

    static int c(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    static int a(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    static int a(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int a = amzi.a(obj);
        int i4 = a & i;
        int a2 = a(obj3, i4);
        if (a2 == 0) {
            return -1;
        }
        int a3 = a(a, i);
        int i5 = -1;
        while (true) {
            i2 = a2 - 1;
            i3 = iArr[i2];
            if (a(i3, i) != a3 || !amqx.a(obj, objArr[i2]) || (objArr2 != null && !amqx.a(obj2, objArr2[i2]))) {
                int i6 = i3 & i;
                if (i6 == 0) {
                    return -1;
                }
                int i7 = i6;
                i5 = i2;
                a2 = i7;
            }
        }
        int i8 = i3 & i;
        if (i5 != -1) {
            iArr[i5] = a(iArr[i5], i8, i);
        } else {
            a(obj3, i4, i8);
        }
        return i2;
    }

    static void a(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static void a(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
