package defpackage;

/* renamed from: awfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awfd extends awex {
    private final amzy b;

    public awfd(amzy amzy) {
        this.b = amzy;
    }

    public final void a() {
        anhk i = this.b.listIterator();
        while (i.hasNext()) {
            awex awex = (awex) i.next();
            try {
                awex.a();
            } catch (RuntimeException e) {
                awfj.a(e, awex, "requested");
            }
        }
    }

    public final void b() {
        anhk i = this.b.listIterator();
        while (i.hasNext()) {
            awex awex = (awex) i.next();
            try {
                awex.b();
            } catch (RuntimeException e) {
                awfj.a(e, awex, "ready");
            }
        }
    }

    public final void c() {
        anhk i = this.b.listIterator();
        while (i.hasNext()) {
            awex awex = (awex) i.next();
            try {
                awex.c();
            } catch (RuntimeException e) {
                awfj.a(e, awex, "methodStarting");
            }
        }
    }

    public final void d() {
        anhk i = this.b.g().listIterator();
        while (i.hasNext()) {
            awex awex = (awex) i.next();
            try {
                awex.d();
            } catch (RuntimeException e) {
                awfj.a(e, awex, "methodFinished");
            }
        }
    }

    public final void a(Object obj) {
        anhk i = this.b.g().listIterator();
        while (i.hasNext()) {
            awex awex = (awex) i.next();
            try {
                awex.a(obj);
            } catch (RuntimeException e) {
                awfj.a(e, awex, "succeeded", obj);
            }
        }
    }

    public final void a(Throwable th) {
        anhk i = this.b.g().listIterator();
        while (i.hasNext()) {
            awex awex = (awex) i.next();
            try {
                awex.a(th);
            } catch (RuntimeException e) {
                awfj.a(e, awex, "failed", th);
            }
        }
    }
}
