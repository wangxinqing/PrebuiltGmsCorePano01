package defpackage;

/* renamed from: awfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awfg extends awex {
    private final awex b;

    public awfg(awex awex) {
        this.b = awex;
    }

    public final void a() {
        try {
            this.b.a();
        } catch (RuntimeException e) {
            awfj.a(e, this.b, "requested");
        }
    }

    public final void b() {
        try {
            this.b.b();
        } catch (RuntimeException e) {
            awfj.a(e, this.b, "ready");
        }
    }

    public final void c() {
        try {
            this.b.c();
        } catch (RuntimeException e) {
            awfj.a(e, this.b, "methodStarting");
        }
    }

    public final void d() {
        try {
            this.b.d();
        } catch (RuntimeException e) {
            awfj.a(e, this.b, "methodFinished");
        }
    }

    public final void a(Object obj) {
        try {
            this.b.a(obj);
        } catch (RuntimeException e) {
            awfj.a(e, this.b, "succeeded", obj);
        }
    }

    public final void a(Throwable th) {
        try {
            this.b.a(th);
        } catch (RuntimeException e) {
            awfj.a(e, this.b, "failed", th);
        }
    }
}
