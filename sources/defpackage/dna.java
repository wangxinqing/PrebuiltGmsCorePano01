package defpackage;

import android.os.Looper;

/* renamed from: dna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dna implements Runnable {
    final /* synthetic */ dnb a;

    public dna(dnb dnb) {
        this.a = dnb;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.b.b().a((Runnable) this);
            return;
        }
        boolean b = this.a.b();
        this.a.d = 0;
        if (b) {
            this.a.a();
        }
    }
}
