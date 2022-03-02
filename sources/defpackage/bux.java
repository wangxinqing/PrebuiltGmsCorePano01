package defpackage;

/* renamed from: bux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bux implements Runnable {
    private final Runnable a;
    private final bvp b;

    public bux(Runnable runnable, bvp bvp) {
        iva.a((Object) runnable);
        this.a = runnable;
        iva.a((Object) bvp);
        this.b = bvp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bux) {
            return this.a.equals(((bux) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void run() {
        this.b.b();
        try {
            this.a.run();
            this.b.c();
            clj D = cbi.D();
            if (D != null) {
                D.c(this.b);
            }
        } catch (Throwable th) {
            this.b.c();
            clj D2 = cbi.D();
            if (D2 != null) {
                D2.c(this.b);
            }
            throw th;
        }
    }
}
