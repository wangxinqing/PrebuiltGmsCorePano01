package defpackage;

/* renamed from: cyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cyl implements czb {
    private final cyn a;
    private final aqrv b;

    public cyl(cyn cyn, aqrv aqrv) {
        this.a = cyn;
        this.b = aqrv;
    }

    public final void a(Throwable th) {
        cyn cyn = this.a;
        aqrv aqrv = this.b;
        cyn.c.b("Error starting native action %d", Integer.valueOf(aqrv.b), th);
        cyn.e.a(th);
    }
}
