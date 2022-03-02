package defpackage;

import java.util.logging.Level;

/* renamed from: bamg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bamg implements Runnable {
    final /* synthetic */ badh a;

    public bamg(badh badh) {
        this.a = badh;
    }

    public final void run() {
        badh badh = this.a;
        long j = badh.a;
        long max = Math.max(j + j, j);
        if (badh.b.c.compareAndSet(badh.a, max)) {
            badi.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{badh.b.b, Long.valueOf(max)});
        }
    }
}
