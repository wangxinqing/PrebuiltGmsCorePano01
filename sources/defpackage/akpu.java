package defpackage;

import android.os.SystemClock;

/* renamed from: akpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akpu {
    public final akri a;
    public int b = 0;
    public int c = 0;
    public long d;
    public long e;

    public akpu(akri akri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = akri;
        this.d = elapsedRealtime;
        this.e = elapsedRealtime;
    }

    public final void a(int i) {
        this.b = i;
        this.d = SystemClock.elapsedRealtime();
    }

    public final void b(int i) {
        this.c = i;
        this.e = SystemClock.elapsedRealtime();
    }
}
