package defpackage;

/* renamed from: afpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpc implements aoqb {
    private final afpf a;
    private final afkr b;
    private final aflf c;

    public afpc(afpf afpf, afkr afkr, aflf aflf) {
        this.a = afpf;
        this.b = afkr;
        this.c = aflf;
    }

    public final aorr a(Object obj) {
        boolean z;
        afpf afpf = this.a;
        afkr afkr = this.b;
        aflf aflf = this.c;
        afpe afpe = (afpe) obj;
        if (afpe == afpe.FAILED) {
            afpf.b.a(1008, afkr.c, afkr.e);
            return aorl.a((Object) afpe.FAILED);
        } else if (afpe == afpe.PENDING) {
            afpf.b.a(1007, afkr.c, afkr.e);
            return aorl.a((Object) afpe.PENDING);
        } else {
            if (afpe == afpe.DOWNLOADED) {
                z = true;
            } else {
                z = false;
            }
            amrl.a(z);
            long a2 = afpf.f.a();
            afko afko = afkr.b;
            if (afko == null) {
                afko = afko.g;
            }
            aucd aucd = (aucd) afko.c(5);
            aucd.a((aucj) afko);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            afko afko2 = (afko) aucd.b;
            afko2.a |= 4;
            afko2.d = a2;
            afko afko3 = (afko) aucd.i();
            aucd aucd2 = (aucd) afkr.c(5);
            aucd2.a((aucj) afkr);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            afkr afkr2 = (afkr) aucd2.b;
            afkr afkr3 = afkr.m;
            afko3.getClass();
            afkr2.b = afko3;
            afkr2.a |= 1;
            afkr afkr4 = (afkr) aucd2.i();
            aucd aucd3 = (aucd) aflf.c(5);
            aucd3.a((aucj) aflf);
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            aflf aflf2 = (aflf) aucd3.b;
            aflf aflf3 = aflf.f;
            aflf2.a |= 8;
            aflf2.e = true;
            aflf aflf4 = (aflf) aucd3.i();
            return aopr.a(afpf.d.a(aflf4, afkr4), (aoqb) new afoi(afpf, aflf, afpf.d.a(aflf4), afkr4), afpf.h);
        }
    }
}
