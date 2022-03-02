package defpackage;

import android.os.SystemClock;

/* renamed from: agml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agml implements Runnable {
    private final agmm a;

    public agml(agmm agmm) {
        this.a = agmm;
    }

    public final void run() {
        agmm agmm = this.a;
        if (agmm.a.b.f == 0) {
            agmm.a.b.f = SystemClock.elapsedRealtime();
            agmm.a.b.h.d = true;
        }
    }
}
