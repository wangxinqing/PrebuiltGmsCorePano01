package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bajf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bajf implements Runnable {
    final /* synthetic */ bajg a;

    public bajf(bajg bajg) {
        this.a = bajg;
    }

    public final void run() {
        babp babp;
        bajg bajg = this.a;
        bajg.i.l.b();
        if (bajg.e != null) {
            if (!bajg.g) {
                bajg.g = true;
            } else if (bajg.i.A && (babp = bajg.h) != null) {
                babp.a();
                bajg.h = null;
            } else {
                return;
            }
            if (!bajg.i.A) {
                bajg.h = bajg.i.l.a(new baid(new bajd(bajg)), 5, TimeUnit.SECONDS, bajg.i.h.a());
            } else {
                bajg.e.a(baji.d);
            }
        } else {
            bajg.g = true;
        }
    }
}
