package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: myp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myp {
    long a;
    long b;

    public myp() {
        this(-1);
    }

    public final long a() {
        iva.b(this.b != -1);
        return TimeUnit.NANOSECONDS.toMillis(b() - this.b);
    }

    public final long b() {
        long j = this.a;
        if (j == -1) {
            return System.nanoTime();
        }
        this.a = -1;
        return j;
    }

    public final void c() {
        this.b = b();
    }

    public myp(long j) {
        this.a = j;
        this.b = -1;
    }
}
