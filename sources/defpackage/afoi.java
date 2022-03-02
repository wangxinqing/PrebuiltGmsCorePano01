package defpackage;

/* renamed from: afoi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afoi implements aoqb {
    private final afpf a;
    private final aflf b;
    private final afkr c;
    private final afkr d;

    public afoi(afpf afpf, aflf aflf, afkr afkr, afkr afkr2) {
        this.a = afpf;
        this.b = aflf;
        this.c = afkr;
        this.d = afkr2;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        aflf aflf = this.b;
        afkr afkr = this.c;
        afkr afkr2 = this.d;
        if (!((Boolean) obj).booleanValue()) {
            afpf.b.b(1036);
            return aorl.a((Object) afpe.FAILED);
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
        if (!afpf.d.b((aflf) aucd.i())) {
            afpf.b.b(1036);
        }
        if (afkr != null && !afpf.d.a(afkr)) {
            afpf.b.b(1036);
        }
        afpf.b.a(1009, afkr2.c, afkr2.e);
        return aorl.a((Object) afpe.DOWNLOADED);
    }
}
