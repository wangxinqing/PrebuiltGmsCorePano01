package defpackage;

import android.os.SystemClock;

/* renamed from: tkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tkw {
    public final long a;
    public final int b;
    private final long c = SystemClock.elapsedRealtime();
    private long d = 0;
    private int e = 0;

    public tkw(int i, long j) {
        this.b = i;
        this.a = j;
    }

    public final aucd a() {
        aucd o = askm.h.o();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        askm askm = (askm) o.b;
        int i = askm.a | 1;
        askm.a = i;
        askm.b = elapsedRealtime;
        askm.c = this.b - 1;
        int i2 = i | 2;
        askm.a = i2;
        long j = this.a;
        int i3 = i2 | 4;
        askm.a = i3;
        askm.d = j;
        long j2 = this.d;
        int i4 = i3 | 8;
        askm.a = i4;
        askm.e = j2;
        int i5 = this.e;
        askm.a = i4 | 16;
        askm.f = i5;
        return o;
    }

    public final void a(long j) {
        this.d += j;
        this.e++;
    }
}
