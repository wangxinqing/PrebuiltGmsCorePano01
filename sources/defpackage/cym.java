package defpackage;

/* renamed from: cym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cym implements czb {
    private final cyn a;

    public cym(cyn cyn) {
        this.a = cyn;
    }

    public final void a(Throwable th) {
        cyn cyn = this.a;
        cyn.c.b("Error starting intent alternative", th, new Object[0]);
        cyn.e.a(th);
    }
}
