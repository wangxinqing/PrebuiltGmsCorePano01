package defpackage;

/* renamed from: aqeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aqeo {
    public final aqep a;
    protected final Runnable b;
    public int c;

    public aqeo(aqep aqep, Runnable runnable) {
        if (aqep == null) {
            aqer.a("Runner cannot be null", "object is null");
        }
        this.a = aqep;
        this.b = runnable;
    }

    public final void a() {
        synchronized (this.a.c) {
            d();
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void c() {
        try {
            b();
        } catch (Throwable th) {
            apev.a(th);
        }
    }

    public void d() {
        this.a.b(this);
    }

    public void e() {
        this.a.c(this);
    }
}
