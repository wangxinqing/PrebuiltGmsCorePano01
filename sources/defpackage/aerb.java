package defpackage;

/* renamed from: aerb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aerb extends awem {
    private final awef b;

    public aerb(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(aerb.class), bapu);
        this.b = aweu.a(awef);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        baaj baaj;
        auls auls = (auls) obj;
        aulp aulp = aulp.a;
        azxi azxi = auls.a;
        baaj baaj2 = ault.c;
        if (baaj2 == null) {
            synchronized (ault.class) {
                baaj = ault.c;
                if (baaj == null) {
                    baag a = baaj.a();
                    a.c = baai.UNARY;
                    a.d = baaj.a("search.mdh.MobileDataHubCore", "ListChannelConfigs");
                    a.b();
                    a.a = baoq.a(aulp.a);
                    a.b = baoq.a(aulq.b);
                    baaj = a.a();
                    ault.c = baaj;
                }
            }
            baaj2 = baaj;
        }
        return bapb.a(azxi.a(baaj2, auls.b), (Object) aulp);
    }
}
