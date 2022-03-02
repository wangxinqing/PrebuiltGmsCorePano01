package defpackage;

/* renamed from: afob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afob implements aoqb {
    private final afpf a;
    private final afkr b;
    private final int c;
    private final int d;

    public afob(afpf afpf, afkr afkr, int i, int i2) {
        this.a = afpf;
        this.b = afkr;
        this.c = i;
        this.d = i2;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        afkr afkr = this.b;
        int i = this.c;
        int i2 = this.d;
        if (((Boolean) obj).booleanValue()) {
            return afpf.a(afkr, i + 1, i2);
        }
        afsh.a("%s: Subscribing to file failed for group: %s", (Object) "FileGroupManager", (Object) afkr.c);
        return aorl.a((Object) false);
    }
}
