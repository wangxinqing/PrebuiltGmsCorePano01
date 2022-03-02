package defpackage;

/* renamed from: bady  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bady extends baes {
    final /* synthetic */ baaf a;
    final /* synthetic */ baec b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bady(baec baec, baaf baaf) {
        super(baec.c.e);
        this.b = baec;
        this.a = baaf;
    }

    public final void a() {
        int i = bapg.a;
        baec baec = this.b;
        if (!baec.b) {
            try {
                baec.a.a(this.a);
            } catch (Throwable th) {
                babj a2 = babj.c.b(th).a("Failed to read headers");
                this.b.c.f.b(a2);
                this.b.a(a2, new baaf());
            }
        }
    }
}
