package defpackage;

/* renamed from: dhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dhv implements csb {
    private final dhy a;

    public dhv(dhy dhy) {
        this.a = dhy;
    }

    public final Object a(Object obj, Object obj2) {
        dhy dhy = this.a;
        csn csn = (csn) obj;
        amri amri = (amri) obj2;
        boolean z = true;
        if (!amri.a() || !((csn) amri.b()).a) {
            if (dhy.j) {
                z = csn.a;
                if (!z) {
                    dhy.j = false;
                }
            } else if (!csn.a || !csn.b) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
