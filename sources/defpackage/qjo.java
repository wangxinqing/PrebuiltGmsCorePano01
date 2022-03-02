package defpackage;

import java.io.PrintWriter;
import java.util.Collection;

/* renamed from: qjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjo implements qjt {
    private final qeg a;
    private final qjv b;
    private final qjq c;

    public qjo(qeg qeg, qjv qjv, qjq qjq) {
        this.a = qeg;
        this.b = qjv;
        this.c = qjq;
    }

    private final qjt e() {
        return !this.a.a() ? this.b : this.c;
    }

    public final int a() {
        return e().a();
    }

    public final int b(avwm avwm) {
        return e().b(avwm);
    }

    public final int c() {
        return e().c();
    }

    public final long d() {
        return e().d();
    }

    public final int a(avwm avwm) {
        return e().a(avwm);
    }

    public final void b() {
        e().b();
    }

    public final qje a(String str) {
        return e().a(str);
    }

    public final byte[] b(String str) {
        return e().b(str);
    }

    public final qjw a(String str, boolean z) {
        return e().a(str, z);
    }

    public final void a(PrintWriter printWriter) {
        e().a(printWriter);
    }

    public final void a(Collection collection, Collection collection2) {
        e().a(collection, collection2);
    }

    public final void a(qka qka) {
        e().a(qka);
    }
}
