package defpackage;

/* renamed from: baht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baht implements bajn {
    final baep a;
    boolean b = false;
    final /* synthetic */ bahv c;

    public baht(bahv bahv, baep baep) {
        this.c = bahv;
        this.a = baep;
    }

    public final void a() {
        this.c.d.a(2, "READY");
        this.c.e.execute(new bahq(this));
    }

    public final void b() {
        amrl.b(this.b, (Object) "transportShutdown() must be called before transportTerminated().");
        this.c.d.a(2, "{0} Terminated", this.a.b());
        azyv azyv = this.c.c;
        azyv.b(azyv.e, this.a);
        this.c.a(this.a, false);
        this.c.e.execute(new bahs(this));
    }

    public final void a(babj babj) {
        this.c.d.a(2, "{0} SHUTDOWN with {1}", this.a.b(), bahv.b(babj));
        this.b = true;
        this.c.e.execute(new bahr(this, babj));
    }

    public final void a(boolean z) {
        this.c.a(this.a, z);
    }
}
