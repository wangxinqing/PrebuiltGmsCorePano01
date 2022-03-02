package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fxl implements aoqb {
    private final boolean a;

    public fxl(boolean z) {
        this.a = z;
    }

    public final aorr a(Object obj) {
        icc icc = (icc) obj;
        if (this.a) {
            return aopr.a(qbc.a((icf) icc.b((idf) new abcs(icc))), (aoqb) new fxo(icc), (Executor) aoqm.a);
        }
        return fxp.a(icc);
    }
}
