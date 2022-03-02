package defpackage;

import java.lang.reflect.Array;

/* renamed from: aemd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aemd {
    public final double[][] a = ((double[][]) Array.newInstance(double.class, new int[]{3, 3}));

    public final void a(int i, int i2, double d) {
        this.a[i][i2] = Math.log10(d);
    }
}
