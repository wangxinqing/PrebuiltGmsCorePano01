package defpackage;

/* renamed from: dfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dfv implements csb {
    private final dfx a;

    public dfv(dfx dfx) {
        this.a = dfx;
    }

    public final Object a(Object obj, Object obj2) {
        dfx dfx = this.a;
        csn csn = (csn) obj;
        amri amri = (amri) obj2;
        boolean z = true;
        if (!amri.a() || !((csn) amri.b()).a) {
            if (dfx.h) {
                z = csn.a;
                if (z) {
                    dfx.h = false;
                }
            } else if (!csn.a || !csn.b) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
