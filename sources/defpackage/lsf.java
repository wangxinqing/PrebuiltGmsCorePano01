package defpackage;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: lsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lsf {
    private static final ith i = new ith("RateLimitedExecutor", "");
    public final Runnable a = new lsc(this);
    public final Runnable b = new lsd(this);
    public final Runnable c;
    public final long d;
    public final Executor e;
    public long f = 0;
    public boolean g;
    public int h;
    private final ExecutorService j = jfm.b(10);
    private final String k;

    public lsf(Runnable runnable, long j2, Executor executor, String str) {
        boolean z = false;
        this.g = false;
        this.h = 1;
        iva.b(j2 > 0 ? true : z);
        iva.a((Object) runnable);
        this.c = runnable;
        this.d = j2;
        iva.a((Object) str);
        this.k = str;
        iva.a((Object) executor);
        this.e = executor;
    }

    public final synchronized void a() {
        if (!this.g) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - this.f;
            if (j2 < this.d) {
                this.g = true;
                this.j.execute(new lse(this, j2));
                return;
            }
            this.b.run();
            this.f = currentTimeMillis;
            return;
        }
        i.a("Rate limited: %s", this);
    }

    public final String toString() {
        return String.format(Locale.US, "RateLimitedExecutor[owner=%s, scheduled=%s, lastUpdated=%s, lapseSinceLastUpdate=%s, interval=%d]", new Object[]{this.k, Boolean.valueOf(this.g), Long.valueOf(this.f), Long.valueOf(System.currentTimeMillis() - this.f), Long.valueOf(this.d)});
    }
}
