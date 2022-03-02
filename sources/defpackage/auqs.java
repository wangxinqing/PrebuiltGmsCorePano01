package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: auqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auqs implements auqk {
    public final auqj a;
    private final Executor b;
    private volatile aorr c = aorl.a((Object) false);
    private final prw d;

    public auqs(prx prx, Executor executor, auqj auqj) {
        amrl.a((Object) auqj);
        this.a = auqj;
        this.b = executor;
        String str = auqj.a;
        Context b2 = ((psg) prx.a).a();
        prx.a(b2, 1);
        prx.a(str, 2);
        this.d = new prw(b2, str);
    }

    private final void a(Runnable runnable) {
        if (this.c.isDone()) {
            if (!this.c.isCancelled()) {
                try {
                    if (!((Boolean) aorl.a((Future) this.c)).booleanValue()) {
                        return;
                    }
                } catch (Exception e) {
                    return;
                }
            } else {
                return;
            }
        }
        aorl.a(this.c, new auqq(this, runnable), this.b);
    }

    public final auqj a() {
        return this.a;
    }

    public final void a(anvb anvb, anuy anuy) {
        a((Runnable) new auqp(this, anuy, anvb));
    }

    public final void a(anvb anvb, anvb anvb2) {
        a((Runnable) new auqo(this, anvb, anvb2));
    }

    public final void a(anvb anvb, anvc anvc) {
        a((Runnable) new auqn(this, anvb, anvc));
    }

    public final void a(anvb anvb, anve anve) {
        a((Runnable) new auqm(this, anvb, anve));
    }

    public final void a(anvd anvd) {
        prw prw = this.d;
        prw.a.a(anvd.k()).b();
    }

    public final void a(aorr aorr) {
        aorl.a(aorr, new auqr(this), this.b);
        amrl.a((Object) aorr);
        this.c = aorr;
    }
}
