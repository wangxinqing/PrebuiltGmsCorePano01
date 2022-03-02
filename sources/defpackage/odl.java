package defpackage;

import android.os.SystemClock;

/* renamed from: odl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class odl implements Runnable {
    final /* synthetic */ ods a;

    public odl(ods ods) {
        this.a = ods;
    }

    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long f = axmj.f();
        ods ods = this.a;
        long j = ((long) ((int) f)) - (uptimeMillis - ods.p);
        if (j > 0) {
            ods.q.postDelayed(ods.r, j);
        } else {
            ods.a(olg.NO_TEXT_ENTERED);
        }
    }
}
