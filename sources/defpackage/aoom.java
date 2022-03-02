package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: aoom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoom {
    public static int a(short[] sArr, short s, int i, int i2) {
        while (i < i2) {
            if (sArr[i] == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static short a(byte[] bArr) {
        int length = bArr.length;
        amrl.a(length >= 2, "array too small: %s < %s", length, 2);
        return (short) ((bArr[1] & 255) | (bArr[0] << 8));
    }

    public static short[] a(Collection collection) {
        if (collection instanceof aool) {
            aool aool = (aool) collection;
            return Arrays.copyOfRange(aool.a, aool.b, aool.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            amrl.a(obj);
            sArr[i] = ((Number) obj).shortValue();
        }
        return sArr;
    }
}
