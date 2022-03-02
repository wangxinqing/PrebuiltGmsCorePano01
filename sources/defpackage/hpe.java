package defpackage;

import android.os.SystemClock;

/* renamed from: hpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hpe {
    final /* synthetic */ hph a;
    private final long b = SystemClock.elapsedRealtime();

    public hpe(hph hph) {
        this.a = hph;
        jiq jiq = this.a.d;
    }

    public final void a(hpg hpg) {
        hph hph = this.a;
        hpa hpa = hph.a;
        jiq jiq = hph.d;
        hpg.a(SystemClock.elapsedRealtime() - this.b, hph.b);
    }
}
