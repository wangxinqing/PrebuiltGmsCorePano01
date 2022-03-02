package defpackage;

/* renamed from: afnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afnv implements aoqb {
    private final afpf a;
    private final aflf b;
    private final afkr c;

    public afnv(afpf afpf, aflf aflf, afkr afkr) {
        this.a = afpf;
        this.b = aflf;
        this.c = afkr;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        aflf aflf = this.b;
        afkr afkr = this.c;
        aflg aflg = (aflg) obj;
        if (aflg == null) {
            aflg = aflg.c;
        }
        if (aflg.b) {
            return aorl.a((Object) null);
        }
        Object[] objArr = {"FileGroupManager", aflf.b, aflf.c};
        afpf.b.a(1055, afkr.c, afkr.e);
        throw new afni();
    }
}
