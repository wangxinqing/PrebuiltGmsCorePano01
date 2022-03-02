package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: aoog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoog {
    public static int a(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int a(int i, int i2) {
        if (i >= i2) {
            return i <= i2 ? 0 : 1;
        }
        return -1;
    }

    public static int b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j >= -2147483648L) {
            return (int) j;
        }
        return Integer.MIN_VALUE;
    }

    public static List b(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new aoof(iArr, 0, length);
    }

    public static int a(int i, int i2, int i3) {
        amrl.a(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int a(long j) {
        int i = (int) j;
        amrl.a(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int a(byte[] bArr) {
        int length = bArr.length;
        amrl.a(length >= 4, "array too small: %s < %s", length, 4);
        return a(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int a(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static int a(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static Integer a(String str) {
        Long a = aook.a(str);
        if (a == null || a.longValue() != ((long) a.intValue())) {
            return null;
        }
        return Integer.valueOf(a.intValue());
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int[] a(Collection collection) {
        if (collection instanceof aoof) {
            aoof aoof = (aoof) collection;
            return Arrays.copyOfRange(aoof.a, aoof.b, aoof.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            amrl.a(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
