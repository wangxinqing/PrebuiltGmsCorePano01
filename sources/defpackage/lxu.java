package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: lxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lxu implements Runnable {
    lya a = null;
    final /* synthetic */ lxv b;

    public lxu(lxv lxv) {
        this.b = lxv;
    }

    private final void a() {
        lya lya = this.a;
        if (lya != null) {
            lya.b();
            this.a = null;
        }
    }

    public final void run() {
        amri amri;
        long j = 0;
        while (true) {
            try {
                if (this.a != null) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(this.b.g);
                    amri = (amri) this.b.h.poll((nanos + j) - System.nanoTime(), TimeUnit.NANOSECONDS);
                } else {
                    amri = (amri) this.b.h.take();
                }
                if (amri != null) {
                    if (!amri.a()) {
                        break;
                    }
                    lxt lxt = (lxt) amri.b();
                    lya lya = this.a;
                    if (lya == null || !lya.a()) {
                        a();
                        j = System.nanoTime();
                        lxv lxv = this.b;
                        lxv.e.a.putInt("timeoutMs", (int) lxv.f);
                        lxv lxv2 = this.b;
                        this.a = lxv2.c.a(lxv2.d, lxv2.e);
                    }
                    lxt.b.offer(this.a.a(lxt.a));
                    if (!this.a.a()) {
                        a();
                    }
                } else {
                    a();
                }
            } catch (InterruptedException e) {
            }
        }
        a();
    }
}
