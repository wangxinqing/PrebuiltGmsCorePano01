package defpackage;

import android.os.SystemClock;

/* renamed from: vgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vgv {
    public final tgh a;
    public final long b;
    public final auyt c;
    public long d;

    public vgv(tgh tgh, auyt auyt) {
        this.a = tgh;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        auyz auyz = auyt.i;
        this.b = elapsedRealtime + (auyz == null ? auyz.f : auyz).e;
        this.c = auyt;
    }
}
