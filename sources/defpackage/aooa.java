package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: aooa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aooa {
    public static int a(byte[] bArr, byte b, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static byte[] a(Collection collection) {
        if (collection instanceof aonz) {
            aonz aonz = (aonz) collection;
            return Arrays.copyOfRange(aonz.a, aonz.b, aonz.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            amrl.a(obj);
            bArr[i] = ((Number) obj).byteValue();
        }
        return bArr;
    }

    public static byte[] a(byte[]... bArr) {
        int i = 0;
        for (byte[] length : bArr) {
            i += length.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i2, length2);
            i2 += length2;
        }
        return bArr2;
    }
}
