package defpackage;

/* renamed from: baeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baeb extends baes {
    final /* synthetic */ baec a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public baeb(baec baec) {
        super(baec.c.e);
        this.a = baec;
    }

    public final void a() {
        int i = bapg.a;
        try {
            this.a.a.e();
        } catch (Throwable th) {
            babj a2 = babj.c.b(th).a("Failed to call onReady.");
            this.a.c.f.b(a2);
            this.a.a(a2, new baaf());
        }
    }
}
