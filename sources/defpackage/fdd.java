package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;

/* renamed from: fdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fdd implements aora {
    public final aosh a = aosh.f();
    private final qbk b;
    private final aorr c;
    private final long d = SystemClock.elapsedRealtime();

    public fdd(qbk qbk, aorr aorr) {
        this.b = qbk;
        this.c = aorr;
    }

    public final void a(Object obj) {
        aosh aosh = this.a;
        aucd o = antu.e.o();
        qbk qbk = this.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        antu antu = (antu) o.b;
        antu.b = qbk.ay;
        antu.a |= 1;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        antu antu2 = (antu) o.b;
        int i = antu2.a | 2;
        antu2.a = i;
        antu2.c = elapsedRealtime;
        antu2.a = i | 4;
        antu2.d = 0;
        aosh.b((Object) (antu) o.i());
    }

    public final void a(Throwable th) {
        aosh aosh = this.a;
        aucd o = antu.e.o();
        qbk qbk = this.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        antu antu = (antu) o.b;
        antu.b = qbk.ay;
        antu.a |= 1;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        antu antu2 = (antu) o.b;
        antu2.a |= 2;
        antu2.c = elapsedRealtime;
        int i = 16;
        if (!this.c.isCancelled() && !(th instanceof CancellationException)) {
            i = qbf.a(th).a;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        antu antu3 = (antu) o.b;
        antu3.a |= 4;
        antu3.d = i;
        aosh.b((Object) (antu) o.i());
    }
}
