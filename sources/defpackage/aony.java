package defpackage;

import java.util.Collection;

/* renamed from: aony  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aony {
    public static int a(boolean z, boolean z2) {
        if (z != z2) {
            return !z ? -1 : 1;
        }
        return 0;
    }

    public static int a(boolean[] zArr, boolean z, int i, int i2) {
        while (i < i2) {
            if (zArr[i] == z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean[] a(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            amrl.a(obj);
            zArr[i] = ((Boolean) obj).booleanValue();
        }
        return zArr;
    }
}
