package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: len  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class len {
    private static final ith a = new ith("SingleTaskExecutor", "");
    private final Runnable b;
    private final ExecutorService c = jfm.b(10);
    /* access modifiers changed from: private */
    public boolean d = false;

    public len(Runnable runnable) {
        this.b = new lem(this, runnable);
    }

    public final synchronized void a() {
        if (!this.d) {
            this.d = true;
            this.c.execute(this.b);
            return;
        }
        a.b("Request rejected");
    }
}
