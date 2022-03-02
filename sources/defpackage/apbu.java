package defpackage;

import java.util.Arrays;

/* renamed from: apbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apbu {
    final apbv a;
    final long[] b;

    apbu() {
        this(new apbv(), new long[10]);
    }

    public apbu(apbu apbu) {
        this.a = new apbv(apbu.a);
        this.b = Arrays.copyOf(apbu.b, 10);
    }

    public apbu(apbv apbv, long[] jArr) {
        this.a = apbv;
        this.b = jArr;
    }
}
