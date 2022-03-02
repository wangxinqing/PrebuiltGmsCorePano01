package defpackage;

import java.util.Arrays;

/* renamed from: du  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class du {
    final long[] a;
    final boolean[] b;
    boolean c;

    public du(int i) {
        long[] jArr = new long[i];
        this.a = jArr;
        this.b = new boolean[i];
        Arrays.fill(jArr, 0);
        Arrays.fill(this.b, false);
    }
}
