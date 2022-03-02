package defpackage;

/* renamed from: afog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afog implements aoqb {
    private final afpf a;
    private final aflf b;
    private final afkr c;

    public afog(afpf afpf, aflf aflf, afkr afkr) {
        this.a = afpf;
        this.b = aflf;
        this.c = afkr;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        aflf aflf = this.b;
        afkr afkr = this.c;
        Boolean bool = (Boolean) obj;
        aucd aucd = (aucd) aflf.c(5);
        aucd.a((aucj) aflf);
        boolean z = false;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aflf aflf2 = (aflf) aucd.b;
        aflf aflf3 = aflf.f;
        aflf2.a |= 8;
        aflf2.e = false;
        afkr a2 = afpf.d.a((aflf) aucd.i());
        if (a2 != null) {
            return aorl.a((Object) Boolean.valueOf(afpf.a(afkr, a2)));
        }
        aucd aucd2 = (aucd) aflf.c(5);
        aucd2.a((aucj) aflf);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aflf aflf4 = (aflf) aucd2.b;
        aflf4.a |= 8;
        aflf4.e = true;
        afkr a3 = afpf.d.a((aflf) aucd2.i());
        if (a3 != null) {
            z = afpf.a(afkr, a3);
        }
        return aorl.a((Object) Boolean.valueOf(z));
    }
}
