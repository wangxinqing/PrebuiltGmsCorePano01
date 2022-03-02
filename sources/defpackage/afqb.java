package defpackage;

/* renamed from: afqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afqb implements aoqb {
    private final afqn a;
    private final aflf b;
    private final afkr c;

    public afqb(afqn afqn, aflf aflf, afkr afkr) {
        this.a = afqn;
        this.b = aflf;
        this.c = afkr;
    }

    public final aorr a(Object obj) {
        afqn afqn = this.a;
        aflf aflf = this.b;
        afkr afkr = this.c;
        if (((Boolean) obj).booleanValue()) {
            return aopr.a(afqn.d.a(aflf, afkr), (amqy) new afqc(afqn, afkr), afqn.n);
        }
        return aorl.a((Object) true);
    }
}
