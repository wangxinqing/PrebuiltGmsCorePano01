package defpackage;

import java.util.List;

/* renamed from: absn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class absn {
    public boolean a = false;
    public boolean b = false;
    private final abvs c;
    private final Runnable d;
    private boolean e = false;
    private boolean f;

    public absn(abvs abvs, List list, Runnable runnable) {
        iva.a((Object) abvs);
        this.c = abvs;
        iva.a((Object) runnable);
        this.d = runnable;
        iva.a((Object) list);
        boolean a2 = this.c.a(list);
        absq.h.a("AuthZen re-enrollment forced: %s", Boolean.toString(a2));
    }

    public final void a() {
        absq.h.a("User confirmed transfer.", new Object[0]);
        this.e = true;
        b();
    }

    public final synchronized void b() {
        if (!this.f && this.e && this.a && this.b) {
            this.f = true;
            this.c.a();
            absq.h.a("Running success runnable.", new Object[0]);
            this.d.run();
        }
    }
}
