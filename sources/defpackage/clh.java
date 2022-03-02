package defpackage;

import android.os.Build;
import android.util.SparseIntArray;

/* renamed from: clh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class clh {
    private static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.put(26, 18);
    }

    public static boolean a(int i) {
        return a.indexOfKey(i) < 0 || Build.VERSION.SDK_INT >= a.get(i);
    }
}
