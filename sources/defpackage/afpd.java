package defpackage;

/* renamed from: afpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpd implements aoqb {
    private final afpf a;
    private final afkn b;
    private final afkr c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final int g;

    public afpd(afpf afpf, afkn afkn, afkr afkr, boolean z, boolean z2, int i, int i2) {
        this.a = afpf;
        this.b = afkn;
        this.c = afkr;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        afkn afkn = this.b;
        afkr afkr = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        int i = this.f;
        int i2 = this.g;
        afle afle = (afle) obj;
        if (afle == afle.DOWNLOAD_COMPLETE) {
            Object[] objArr = {"FileGroupManager", afkn.b, afkr.c};
            return afpf.a(afkr, z, z2, i + 1, i2);
        } else if (afle == afle.SUBSCRIBED || afle == afle.DOWNLOAD_IN_PROGRESS) {
            Object[] objArr2 = {"FileGroupManager", afkn.b, afkr.c};
            return afpf.a(afkr, z, true, i + 1, i2);
        } else {
            Object[] objArr3 = {"FileGroupManager", afkn.b, afkr.c};
            return afpf.a(afkr, true, z2, i + 1, i2);
        }
    }
}
