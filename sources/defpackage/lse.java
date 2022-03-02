package defpackage;

import android.os.SystemClock;

/* renamed from: lse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lse implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ lsf b;

    public lse(lsf lsf, long j) {
        this.b = lsf;
        this.a = j;
    }

    public final void run() {
        SystemClock.sleep(this.b.d - this.a);
        this.b.b.run();
    }
}
