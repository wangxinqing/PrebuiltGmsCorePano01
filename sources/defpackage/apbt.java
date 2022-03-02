package defpackage;

import java.util.Arrays;

/* renamed from: apbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apbt {
    final long[] a;
    final long[] b;
    final long[] c;

    apbt() {
        this(new long[10], new long[10], new long[10]);
    }

    /* access modifiers changed from: package-private */
    public final void a(apbt apbt, int i) {
        apbl.a(this.a, apbt.a, i);
        apbl.a(this.b, apbt.b, i);
        apbl.a(this.c, apbt.c, i);
    }

    public apbt(apbt apbt) {
        this.a = Arrays.copyOf(apbt.a, 10);
        this.b = Arrays.copyOf(apbt.b, 10);
        this.c = Arrays.copyOf(apbt.c, 10);
    }

    public apbt(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }
}
