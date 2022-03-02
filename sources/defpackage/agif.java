package defpackage;

import android.os.SystemClock;

/* renamed from: agif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agif {
    static final agif b = new agif();
    public final long a;
    boolean c = false;
    public int d = 1;
    private long e = -1;

    public static agif a() {
        return new agif();
    }

    public static boolean a(agif agif) {
        return agif == null || agif == b;
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        return this.e - this.a;
    }

    public agif() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
    }

    public final void c() {
        this.e = SystemClock.elapsedRealtime();
    }

    public agif(long j, long j2) {
        amrl.a(j2 >= j, "End time %s is before start time %s.", j2, j);
        this.a = j;
        this.e = j2;
    }
}
