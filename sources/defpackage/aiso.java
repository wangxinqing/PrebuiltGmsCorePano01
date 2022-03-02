package defpackage;

import android.os.SystemClock;

/* renamed from: aiso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiso {
    public boolean a = true;
    public long b = -1;
    private long c = -1;
    private long d = -1;

    public aiso(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = z;
        this.c = elapsedRealtime;
        this.d = elapsedRealtime;
        this.b = b();
    }

    private final long b() {
        return Math.max(this.c, this.d);
    }

    public final void a() {
        this.d = SystemClock.elapsedRealtime();
        this.b = b();
    }

    public final void a(boolean z) {
        this.a = z;
        this.c = SystemClock.elapsedRealtime();
        this.b = b();
    }
}
