package defpackage;

import java.util.concurrent.Executor;

/* renamed from: qat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qat extends aoqz {
    private final qaq b;
    private aoqp c = new aoqp();

    public qat(aorr aorr, qaq qaq) {
        super(aorr);
        this.b = qaq;
        aorr.a(new qar(this), qaq);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.c = new aoqp();
        this.a.a(new qas(this), this.b);
    }

    public final void b() {
        this.c.a();
    }

    public final void a(Runnable runnable, Executor executor) {
        this.c.a(runnable, executor);
    }
}
