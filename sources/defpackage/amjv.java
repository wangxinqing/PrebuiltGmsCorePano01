package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: amjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amjv implements Runnable {
    final /* synthetic */ amjy a;

    public amjv(amjy amjy) {
        this.a = amjy;
    }

    public final void run() {
        while (!this.a.c.isShutdown()) {
            try {
                amjw amjw = ((amjx) this.a.b.remove()).a;
                int i = amjw.b;
                amjw.b((Object) null);
            } catch (InterruptedException e) {
                try {
                    this.a.c.execute(this);
                    return;
                } catch (RejectedExecutionException e2) {
                    for (amjx amjx : amjy.a.keySet()) {
                        amjx.a.a((Throwable) e2);
                    }
                    return;
                }
            } catch (Throwable th) {
                try {
                    this.a.c.execute(this);
                } catch (RejectedExecutionException e3) {
                    for (amjx amjx2 : amjy.a.keySet()) {
                        amjx2.a.a((Throwable) e3);
                    }
                }
                throw th;
            }
        }
        try {
            this.a.c.execute(this);
        } catch (RejectedExecutionException e4) {
            for (amjx amjx3 : amjy.a.keySet()) {
                amjx3.a.a((Throwable) e4);
            }
        }
    }
}
