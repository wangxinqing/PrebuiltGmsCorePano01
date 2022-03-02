package defpackage;

/* renamed from: aaei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaei implements acvp {
    private final aaen a;
    private final aabx b;
    private final nxn c;

    public aaei(aaen aaen, aabx aabx, nxn nxn) {
        this.a = aaen;
        this.b = aabx;
        this.c = nxn;
    }

    public final void a(acwa acwa) {
        int intValue = ((Integer) acwa.d()).intValue();
        if (aacr.b(intValue)) {
            aaen aaen = this.a;
            aaen.h.c(this.c);
            return;
        }
        aaen aaen2 = this.a;
        aabx aabx = this.b;
        aaen2.h.a(aabx.a, 4);
        aaen2.h.a(aaen2.d(), aabx, aadn.d(intValue));
        if (axbn.a.a().a()) {
            synchronized (aaen2.a) {
                aaen2.a(intValue, aabx);
            }
            return;
        }
        aaen2.a(intValue, aabx);
    }
}
