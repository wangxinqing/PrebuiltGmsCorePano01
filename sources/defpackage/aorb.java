package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: aorb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aorb implements Runnable {
    final Future a;
    final aora b;

    public aorb(Future future, aora aora) {
        this.a = future;
        this.b = aora;
    }

    public final void run() {
        Throwable e;
        Future future = this.a;
        if (!(future instanceof aoss) || (e = ((aoss) future).e()) == null) {
            try {
                this.b.a(aorl.a(this.a));
            } catch (ExecutionException e2) {
                this.b.a(e2.getCause());
            } catch (Error | RuntimeException e3) {
                this.b.a(e3);
            }
        } else {
            this.b.a(e);
        }
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a(this.b);
        return a2.toString();
    }
}
