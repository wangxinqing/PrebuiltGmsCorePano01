package defpackage;

/* renamed from: afql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afql implements aoqb {
    private final afqn a;
    private final afkn b;
    private final afkr c;

    public afql(afqn afqn, afkn afkn, afkr afkr) {
        this.a = afqn;
        this.b = afkn;
        this.c = afkr;
    }

    public final aorr a(Object obj) {
        afqn afqn = this.a;
        afkn afkn = this.b;
        Void voidR = (Void) obj;
        int a2 = afkq.a(this.c.f);
        if (a2 == 0) {
            a2 = 1;
        }
        try {
            return aopr.a(afqn.f.b(afqu.a(afkn, a2)), (amqy) new afqa(afkn), afqn.n);
        } catch (afqs e) {
            afqn.i.a("Shared file not found for downloaded group", e);
            return aorl.a((Throwable) e);
        }
    }
}
