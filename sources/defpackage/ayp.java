package defpackage;

import android.graphics.Paint;

/* renamed from: ayp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayp {
    public static Paint.Cap a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Paint.Cap.BUTT;
        }
        if (i2 != 1) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.ROUND;
    }

    public static int[] a() {
        return new int[]{1, 2, 3};
    }
}
