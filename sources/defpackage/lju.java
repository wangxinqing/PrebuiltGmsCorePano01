package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: lju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lju implements aloo {
    public final void a(Runnable runnable, int i) {
        ljy.b.schedule(runnable, (long) i, TimeUnit.MILLISECONDS);
    }
}
