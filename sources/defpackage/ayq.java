package defpackage;

import android.graphics.Paint;

/* renamed from: ayq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayq {
    public static Paint.Join a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Paint.Join.MITER;
        }
        if (i2 != 2) {
            return Paint.Join.ROUND;
        }
        return Paint.Join.BEVEL;
    }

    public static int[] a() {
        return new int[]{1, 2, 3};
    }
}
