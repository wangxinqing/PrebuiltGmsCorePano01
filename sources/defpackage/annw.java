package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: annw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class annw implements aoqb {
    final /* synthetic */ aorr a;
    final /* synthetic */ anoa b;

    public annw(anoa anoa, aorr aorr) {
        this.b = anoa;
        this.a = aorr;
    }

    public final /* bridge */ /* synthetic */ aorr a(Object obj) {
        Exception exc = (Exception) obj;
        if (this.a.isCancelled()) {
            return this.a;
        }
        anoa anoa = this.b;
        annp annp = anoa.d;
        int i = anoa.h;
        this.b.f.a(TimeUnit.MILLISECONDS);
        int d = annp.d(i);
        if (d < 0 || !this.b.e.a(exc)) {
            anoa.a.a(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", exc);
            int i2 = this.b.h;
            throw new annk(exc);
        }
        anoa.a.a(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", exc);
        this.b.a((long) d, TimeUnit.MILLISECONDS);
        return aorl.a(anoa.b);
    }
}
