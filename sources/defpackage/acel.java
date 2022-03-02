package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: acel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acel {
    private static final acpz f = acqa.a("TimeoutHelper");
    public final Executor a;
    public final long b;
    public final acek c;
    public long d;
    public boolean e = true;
    private final ExecutorService g;
    private final Runnable h = new acei(this);

    public acel(ExecutorService executorService, Executor executor, long j, acek acek) {
        this.g = executorService;
        this.a = executor;
        this.b = j;
        this.c = acek;
    }

    public final void a() {
        f.a("started", new Object[0]);
        this.d = System.currentTimeMillis();
        this.e = false;
        d();
    }

    public final synchronized void b() {
        f.a("stopped", new Object[0]);
        this.e = true;
    }

    public final synchronized void c() {
        f.a("updated", new Object[0]);
        this.d = System.currentTimeMillis();
    }

    public final void d() {
        this.g.execute(this.h);
    }
}
