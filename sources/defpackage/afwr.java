package defpackage;

/* renamed from: afwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwr implements aoqb {
    private final afxl a;
    private final afus b;
    private final aqvr c;

    public afwr(afxl afxl, afus afus, aqvr aqvr) {
        this.a = afxl;
        this.b = afus;
        this.c = aqvr;
    }

    public final aorr a(Object obj) {
        afxl afxl = this.a;
        afus afus = this.b;
        aqvr aqvr = this.c;
        if (((Boolean) obj).booleanValue()) {
            amgp a2 = afxn.a(aqvr);
            if (a2 == null) {
                return aorl.a((Object) afur.g);
            }
            return afxl.b.a(a2.c, a2.e);
        }
        afur afur = afus.c;
        if (afur == null) {
            afur = afur.g;
        }
        return aorl.a((Object) afur);
    }
}
