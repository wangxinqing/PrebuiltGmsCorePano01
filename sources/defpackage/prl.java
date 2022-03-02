package defpackage;

import android.os.SystemClock;

/* renamed from: prl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class prl implements Runnable {
    final /* synthetic */ osf a;
    final /* synthetic */ prm b;

    public prl(prm prm, osf osf) {
        this.b = prm;
        this.a = osf;
    }

    public final void run() {
        if (!this.a.d()) {
            SystemClock.sleep(600000);
            synchronized (this.b.a) {
                prm prm = this.b;
                if (prm.d == this.a) {
                    prm.d = null;
                }
            }
            this.a.o();
        }
    }
}
