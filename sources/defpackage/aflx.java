package defpackage;

/* renamed from: aflx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aflx implements aoqb {
    private final afme a;
    private final afkn b;
    private final afkr c;
    private final int d;

    public aflx(afme afme, int i, afkn afkn, afkr afkr) {
        this.a = afme;
        this.d = i;
        this.b = afkn;
        this.c = afkr;
    }

    public final aorr a(Object obj) {
        afme afme = this.a;
        int i = this.d;
        afkn afkn = this.b;
        afkr afkr = this.c;
        aucd aucd = (aucd) obj;
        if (i == 2) {
            return aopr.a(afme.c.a(afkn, afkr), (aoqb) new aflu(afme, aucd, afkn), afme.e);
        }
        aucd.a(afme.a(afkn.b, afkn.d, afkn.i, (String) null));
        return aorl.a((Object) aucd);
    }
}
