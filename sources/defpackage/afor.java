package defpackage;

/* renamed from: afor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afor implements aoqb {
    private final afpf a;
    private final aflf b;
    private final afkr c;

    public afor(afpf afpf, aflf aflf, afkr afkr) {
        this.a = afpf;
        this.b = aflf;
        this.c = afkr;
    }

    public final aorr a(Object obj) {
        long j;
        afpf afpf = this.a;
        aflf aflf = this.b;
        afkr afkr = this.c;
        if (((Boolean) obj).booleanValue()) {
            return aorl.a((Object) false);
        }
        aucd aucd = (aucd) aflf.c(5);
        aucd.a((aucj) aflf);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aflf aflf2 = (aflf) aucd.b;
        aflf aflf3 = aflf.f;
        aflf2.a |= 8;
        aflf2.e = false;
        afkr a2 = afpf.d.a((aflf) aucd.i());
        if (a2 == null || !afpf.b(afkr, a2)) {
            j = afpf.f.a();
        } else {
            afko afko = a2.b;
            if (afko == null) {
                afko = afko.g;
            }
            j = afko.c;
        }
        afko afko2 = afkr.b;
        if (afko2 == null) {
            afko2 = afko.g;
        }
        aucd aucd2 = (aucd) afko2.c(5);
        aucd2.a((aucj) afko2);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        afko afko3 = (afko) aucd2.b;
        afko3.a |= 2;
        afko3.c = j;
        afko afko4 = (afko) aucd2.i();
        aucd aucd3 = (aucd) afkr.c(5);
        aucd3.a((aucj) afkr);
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        afkr afkr2 = (afkr) aucd3.b;
        afkr afkr3 = afkr.m;
        afko4.getClass();
        afkr2.b = afko4;
        afkr2.a |= 1;
        return aopr.a(aorl.a((Object) (afkr) aucd3.i()), (aoqb) new afou(afpf, aflf), afpf.h);
    }
}
